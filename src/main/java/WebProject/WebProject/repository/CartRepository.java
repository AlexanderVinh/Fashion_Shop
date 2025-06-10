package WebProject.WebProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import WebProject.WebProject.entity.Cart;

public interface CartRepository extends JpaRepository<Cart,Integer>{

	List<Cart> findAllByUser_id(String user_id);
	
}
