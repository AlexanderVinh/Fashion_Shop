package WebProject.WebProject.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import WebProject.WebProject.entity.User;
import WebProject.WebProject.repository.UserRepository;
import WebProject.WebProject.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	SessionFactory factory;
	
	private UserRepository userRepository;
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository=userRepository;
	}
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(String id) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(id).get();
		user.setStatus(0);
		userRepository.save(user);
	}
	@Override
	public User GetUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}
	@Override
	public User findByIdAndRole(String id, String role) {
		return userRepository.findByIdAndRoleAndStatus(id, role, 1);
	}

	@Override
	public User findByRole(String role) {
		return userRepository.findByRole(role);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	public User findById(String id) {
		return userRepository.findById(id).get();
	}

	@Override
	public long countByEmail(String email) {
		return userRepository.countByEmail(email);
	}

	@Override
	public Page<User> findByEmailAndStatusContaining(String email, int status, Pageable pageable) {
		return userRepository.findByEmailAndStatusContaining(email, status, pageable);
	}

	@Override
	public Page<User> findByEmailContaining(String email, Pageable pageable) {
		return userRepository.findByEmailContaining(email, pageable);
	}

	@Override
	public User getUserByEmail(String email) {
		return null;
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
