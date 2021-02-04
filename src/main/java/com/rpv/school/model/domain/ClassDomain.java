package com.rpv.school.model.domain;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "class")
public class ClassDomain {

    @Id
    private ObjectId id;
    private UserDomain teacher;
    private ObjectId subject_id;

    private List<UserDomain> students;
    private List<SessionDomain> sessions;
}
