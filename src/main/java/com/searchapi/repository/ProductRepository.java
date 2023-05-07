package com.searchapi.repository;

import com.searchapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //JPQL query, JAva persistence Query language, this JPa search a list of products by name or description
    @Query("SELECT p FROM Product p WHERE " + "p.name LIKE CONCAT('%', :query, '%')" +
    "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProduct(String query);

    //native Query
//    @Query(value = "SELECT * FROM Product p WHERE " + "p.name LIKE CONCAT('%', :query, '%')" +
//            "Or p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
//    List<Product> searchProduct(String query);
}
