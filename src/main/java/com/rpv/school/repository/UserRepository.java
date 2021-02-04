package com.rpv.school.repository;

import com.rpv.school.model.domain.UserDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDomain, String> {
    UserDomain findByCpf(String Cpf);
}
