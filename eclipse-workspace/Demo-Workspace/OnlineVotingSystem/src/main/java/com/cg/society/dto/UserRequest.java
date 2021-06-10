package com.cg.society.dto;

import com.cg.society.dto.UserRequest;
import com.cg.society.entities.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequest {

	private User user;
}
