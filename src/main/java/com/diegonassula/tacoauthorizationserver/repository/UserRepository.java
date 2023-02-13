package com.diegonassula.tacoauthorizationserver.repository;

import com.diegonassula.tacoauthorizationserver.domain.entities.UserTaco;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserTaco, Long> {

    UserTaco findByUsername(String username);
}
