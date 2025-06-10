package WebProject.WebProject.repository;

import WebProject.WebProject.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SizeRepository extends JpaRepository<Size,Integer>{
}
