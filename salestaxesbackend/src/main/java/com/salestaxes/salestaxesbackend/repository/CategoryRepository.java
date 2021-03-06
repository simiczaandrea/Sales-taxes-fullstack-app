package com.salestaxes.salestaxesbackend.repository;

import com.salestaxes.salestaxesbackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//for texting purposes only
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
