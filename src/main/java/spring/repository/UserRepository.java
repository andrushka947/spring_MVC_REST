package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import spring.entity.User;

import java.util.List;

@Repository
@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u from User u where u.name = :name")
    List<User> findByName(@Param("name") String name);

}
