package WebProject.WebProject.service.impl;

import WebProject.WebProject.entity.Size;
import WebProject.WebProject.repository.SizeRepository;
import WebProject.WebProject.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {

	@Autowired
	SizeRepository sizeRepository;

	@Override
	public Size findById(Integer id) {
		return sizeRepository.findById(id).get();
	}
}
