package com.example.demo.repositries;

import com.example.demo.Class.DataReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataReadingRepository extends JpaRepository<DataReading, Long> {

}
