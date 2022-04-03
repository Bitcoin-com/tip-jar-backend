package com.bitcoin.interview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipRepository extends JpaRepository<TipJar, Integer> {

    // custom query to get history of tips by user
    List<TipJar> findByUserId(Long userId);

    // custom query to get latest tip by user
    TipJar findFirstByUserIdEqualsOrderBySavedOnDesc(Long userId);
}