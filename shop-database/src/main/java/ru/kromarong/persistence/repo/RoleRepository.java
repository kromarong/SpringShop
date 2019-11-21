package ru.kromarong.persistence.repo;

import org.springframework.data.repository.CrudRepository;
import ru.kromarong.persistence.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
