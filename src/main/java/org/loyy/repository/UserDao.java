package org.loyy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.loyy.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
