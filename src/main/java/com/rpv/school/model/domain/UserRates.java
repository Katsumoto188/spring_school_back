package com.rpv.school.model.domain;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@Builder
public class UserRates {

    private ObjectId class_id;
    private Double first_rate;
    private Double second_rate;
    private Double bonus_rate;
}
