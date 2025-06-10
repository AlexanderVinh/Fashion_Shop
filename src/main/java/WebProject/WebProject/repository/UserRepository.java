package WebProject.WebProject.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WebProject.WebProject.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>{


	User findByEmail(String email);

	//	@Query(value="select * from user u where u.id = ?1 and u.role = ?2",nativeQuery = true)
	User findByIdAndRoleAndStatus(String id, String role, Integer status);
	
	void deleteById(String id);


	Page<User> findAllByStatus(Integer status, Pageable pageable);

	long countByEmail(String email);

	@Query(value="select * from `fashionstore`.user u where u.email like %?1% and u.status= ?2",nativeQuery = true)
	Page<User> findByEmailAndStatusContaining(String email, Integer status, Pageable pageable);

	@Query(value="select * from `fashionstore`.user u where u.email like %?1%",nativeQuery = true)
	Page<User> findByEmailContaining(String email, Pageable pageable);

	User findByRole(String role);
}
