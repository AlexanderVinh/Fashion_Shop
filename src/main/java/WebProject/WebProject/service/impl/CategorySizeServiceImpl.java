package WebProject.WebProject.service.impl;

import WebProject.WebProject.entity.CategorySize;
import WebProject.WebProject.repository.ProductRepository;
import WebProject.WebProject.repository.CategorySizeRepository;
import WebProject.WebProject.service.CategorySizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySizeServiceImpl implements CategorySizeService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	CategorySizeRepository categorySizeRepository;


	@Override
	public CategorySize save(CategorySize categorySize) {
		return categorySizeRepository.save(categorySize);
	}


	@Override
	public CategorySize findById(Integer id) {
		return categorySizeRepository.findById(id).get();
	}

	@Override
	public List<CategorySize> getAllSizeOfCategoryId(Integer id) {
		return categorySizeRepository.findAllByCategory_Id(id);
	}
}
