package com.vaii.semestralka.reposiroty;

import com.vaii.semestralka.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Modifying
    @Transactional
    @Query("update User u set u.name = :name, u.email = :email, u.password = :password where u.id = :id")
    void updateUser(@Param("id") Long id, @Param("name") String name, @Param("email") String email, @Param("password") String password);

    User findByEmail(String email);
}


