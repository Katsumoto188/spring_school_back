package com.rpv.school.controller;

import com.rpv.school.model.request.AuthRequest;
import com.rpv.school.service.AuthService;
import com.rpv.school.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")

public class AuthController {

    private final AuthService authService;

    private final JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String test() {
        return "Jwt auth test.";
    }

    @PostMapping("/login")
    public String tryToLogin(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getCpf(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            return "inavalid username/password";
//            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getCpf());
    }
}
