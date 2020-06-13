package com.assignment.users.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.users.controller.dto.response.UsersDetailResponseTO;
import com.assignment.users.domain.UsersEntity;
import com.assignment.users.repository.UsersRepo;
import com.assignment.users.services.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersRepo usersRepo;

	@Override
	public UsersDetailResponseTO getUsersDetail(int userId) {
		UsersDetailResponseTO userResponseTO = new UsersDetailResponseTO();
		
		Optional<UsersEntity> usersList = usersRepo.findByUserId(userId);
		if(usersList.isPresent())
		{
			userResponseTO.setName(usersList.get().getName());	
			userResponseTO.setAge(usersList.get().getAge());	
			userResponseTO.setEmail(usersList.get().getEmail());	
		}
		return userResponseTO;	
	}
}