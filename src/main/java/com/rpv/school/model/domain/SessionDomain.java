package com.rpv.school.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class SessionDomain {

    private String key;
    private List<UserDomain> attendance;
    private Integer duration; // In minutes

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="America/Sao_Paulo")
    private LocalDate start;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="America/Sao_Paulo")
    private LocalDate finished;
}
