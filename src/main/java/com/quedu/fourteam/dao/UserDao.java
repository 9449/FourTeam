package com.quedu.fourteam.dao;

import com.quedu.fourteam.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Integer> {

}
