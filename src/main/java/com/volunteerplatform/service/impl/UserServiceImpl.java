package com.volunteerplatform.service.impl;

import org.springframework.stereotype.Service;

import com.volunteerplatform.dto.UserDTO;
import com.volunteerplatform.service.UserService;

import javassist.NotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDTO registerUser(UserDTO userDTO) {
		return null;
	}

	@Override
	public UserDTO loginUser(UserDTO userDTO) {
		return null;
	}

	@Override
	public UserDTO logoutUser(UserDTO userDTO) {
		return null;
	}

	@Override
	public void enrollForEvent(UserDTO userDTO, Long eventId) throws NotFoundException {
	}
}
