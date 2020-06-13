package com.assignment.users.services;

import com.assignment.users.controller.dto.response.UsersDetailResponseTO;

public interface UsersService {

	UsersDetailResponseTO getUsersDetail(int userId);

}
