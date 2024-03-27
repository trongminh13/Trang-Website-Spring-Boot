package com.thuctapsamsung.Duan2.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thuctapsamsung.Duan2.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{


	User findByUserName( String userName);
}
