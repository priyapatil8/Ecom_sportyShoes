package com.ecommerce.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ecommerce.webapp.Pojo.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
