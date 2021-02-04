package com.rpv.school.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@Document(collection = "user")
public class UserDomain {

    @Id
    private ObjectId id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String phone;
    private List<String> roles;
    private UserAddress address;

    @JsonFormat(pattern="yyyy-MM-dd", timezone="America/Sao_Paulo")
    private LocalDate birth_date;
}
