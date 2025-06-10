package WebProject.WebProject.service;

import java.util.List;

import WebProject.WebProject.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
	List<User> getAllUser();

	User saveUser(User user);

//	User getUserById(String loginname);

	User updateUser(User user);

	void deleteUserById(String id);
	
	User GetUserByEmail(String email);

	User findByIdAndRole(String id, String role);
	User findByRole(String role);

	List<User> findAll();

	Page<User> findAll(Pageable pageable);

	User findById(String id);


	long countByEmail(String email);
		// Các phương thức khác...

	Page<User> findByEmailAndStatusContaining(String email, int status, Pageable pageable);
	Page<User> findByEmailContaining(String email, Pageable pageable);

	User getUserByEmail(String email);

	User findByEmail(String email);


}
