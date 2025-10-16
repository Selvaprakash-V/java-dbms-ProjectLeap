package com.amazon.AmazonDemo.repository;

import com.amazon.AmazonDemo.model.PurchseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<PurchseOrder,Integer> {
}
