package com.example.testprovider.repository;

import com.example.testprovider.Entity.Authrity;
import com.example.testprovider.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Authrity, String> {
    @Query(value = "select * from authrity where name = :name", nativeQuery = true)
    public Authrity findByname(@Param("name") String name);
}
