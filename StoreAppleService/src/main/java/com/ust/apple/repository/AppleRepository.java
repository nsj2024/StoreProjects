package com.ust.apple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.apple.entity.Apple;



@Repository
public interface AppleRepository extends JpaRepository<Apple, Long> {

}
