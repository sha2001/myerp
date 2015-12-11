package org.sha2001.common.repository;

import org.sha2001.common.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID>{
}
