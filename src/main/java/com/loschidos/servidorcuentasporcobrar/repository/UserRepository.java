package com.loschidos.servidorcuentasporcobrar.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.loschidos.servidorcuentasporcobrar.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByUsername(String username);
    User findByUsernameAndPassword(String username, String password);

}
