package ru.kromarong.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.kromarong.persistence.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
