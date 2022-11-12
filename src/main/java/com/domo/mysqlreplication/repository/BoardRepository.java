package com.domo.mysqlreplication.repository;

import com.domo.mysqlreplication.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
