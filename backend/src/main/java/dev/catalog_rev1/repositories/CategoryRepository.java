package dev.catalog_rev1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.catalog_rev1.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
