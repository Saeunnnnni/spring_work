package com.project.myapp.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.myapp.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao{
	
	@Autowired
	private SqlSession session;

	@Override
	public boolean isExist(String inputId) {
		UsersDto dto=session.selectOne("users.getData", inputId);
		
		boolean isExist = dto==null ? false : true;
		
		return isExist;
	}

	@Override
	public void insert(UsersDto dto) {
		session.insert("users.insert", dto);
		
	}

	@Override
	public UsersDto getData(String id) {
		
		return session.selectOne("users.getData",id);
	}

	@Override
	public void update(UsersDto dto) {
		//profile만 변경
		session.update("users.update", dto);
		
	}

	@Override
	public void delete(String id) {
		session.delete("users.delete", id);
		
	}

}
