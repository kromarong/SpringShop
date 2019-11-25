package ru.kromarong.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kromarong.persistence.model.Picture;


public interface PictureRepository extends JpaRepository<Picture, Long> {
}
