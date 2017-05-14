package com.study.springboot.readingList;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tianyuzhi on 17/5/12.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
