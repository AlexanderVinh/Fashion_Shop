package WebProject.WebProject.repository;

import WebProject.WebProject.entity.CategorySize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategorySizeRepository extends JpaRepository<CategorySize,Integer>{

    List<CategorySize> findAllByCategory_Id(Integer id);

}
