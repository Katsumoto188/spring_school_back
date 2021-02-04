package com.rpv.school.model.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAddress {
    private String street;
    private String number;
    private String complement;
}
