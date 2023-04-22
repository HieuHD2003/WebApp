package hieu.dev.data.dao;

import java.util.List;

import hieu.dev.data.model.User;

public interface UserDao {
	public boolean insert(User user);
	public boolean update(User user);	
	public boolean delete(int Id);
	public User find(int Id);
	public List<User> findAll();
	
}
