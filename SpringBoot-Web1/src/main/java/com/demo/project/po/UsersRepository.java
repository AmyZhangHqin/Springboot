package com.demo.project.po;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<实体类, 主键数据类型>
public interface UsersRepository extends JpaRepository<Users, Long> {
	
	 Users findByUserName(String userName);
	 Users findByUserNameOrEmail(String username, String email);
	 Long deleteById(Long id);
	 Long countByUserName(String userName);
	 List<Users> findByEmailLike(String email);
	 Users findByUserNameIgnoreCase(String userName);	     
	 List<Users> findByUserNameOrderByEmailDesc(String email);
}
