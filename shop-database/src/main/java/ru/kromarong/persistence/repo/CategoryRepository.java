package ru.kromarong.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kromarong.persistence.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
