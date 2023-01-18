//package com.example.testprovider.repository;
//
//import com.example.testprovider.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, String> {
//
//    List<User> findByName(String name);
//
//    List<User> findAll();
//
//    void flush();
//
//    User saveAndFlush(User user);
//
//    @Query(value = "select id, name ,created_time from user  where name like  %:name% order by created_time desc ",nativeQuery = true)
//    List<User> findByNameLike(@Param("name") String name);
//
//    @Query(value = "select id, name, created_time from user where name = :name and id< 5 order by name limit :volume", nativeQuery = true)
//    List<User> findByNameAndId(@Param("name") String name, @Param("volume") int volume);
//
//    @Modifying
//    @Query(value = "update  user set name = :name where id = :id ", nativeQuery = true)
//    void updateNameById(@Param("name") String name, @Param("id") String id);
//}
