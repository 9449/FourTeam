package com.quedu.fourteam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.jws.soap.SOAPBinding;

public interface UserDao extends JpaRepository<SOAPBinding.Use,Integer> {
}
