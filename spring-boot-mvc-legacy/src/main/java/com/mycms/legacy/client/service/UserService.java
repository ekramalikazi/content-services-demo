package com.mycms.legacy.client.service;

import java.util.List;

import com.mycms.legacy.client.domain.User;

public interface UserService {

	User save(User user);

	List<User> getList();

}
