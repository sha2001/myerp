package org.sha2001.common.repository;

import org.sha2001.common.domain.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends CrudRepository<User, UUID>{

	@Modifying
	@Query("update User set lastLogin = current_timestamp() where username = ?")
	void updateLastLogin(String username);
}
