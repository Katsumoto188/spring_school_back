package com.rpv.school.model.domain;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "subject")
public class Subject {

    @Id
    private ObjectId id;
    private String name;
}
