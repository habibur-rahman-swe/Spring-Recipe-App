package com.racipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.racipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
