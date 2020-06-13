package com.assignment.users.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.users.controller.dto.response.UsersDetailResponseTO;
import com.assignment.users.services.UsersService;

@RestController
@RequestMapping(value = "/user")
public class UsersController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);

	@Autowired
	UsersService usersService;

	@GetMapping("/{userId}")
	public ResponseEntity<UsersDetailResponseTO> getUsersDetail(@PathVariable(value = "userId") int userId) {
		LOGGER.info("Method getUsersDetail start");
		UsersDetailResponseTO responseTO = usersService.getUsersDetail(userId);
		LOGGER.info("Method getUsersDetail end");
		return new ResponseEntity<>(responseTO, HttpStatus.OK);
	}

}
