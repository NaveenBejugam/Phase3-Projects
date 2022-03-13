package com.simplilearn.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Categories;
import com.simplilearn.repository.CategoriesRepository;

@Service
@Transactional
public class CategoriesService {

	private CategoriesRepository repo;
	public List<Categories>listAll()
	{
		return repo.findAll();
	}
	public void save(Categories categories)
	{
		repo.save(categories);
	}
		public Categories get(long id)
	{
		return repo.findById(id).get();
	}
	public void delete(long id)
	{
		repo.deleteById(id);
	}
}

