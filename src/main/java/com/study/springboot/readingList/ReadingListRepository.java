package com.study.springboot.readingList;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tianyuzhi on 17/5/11.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{
    List<Book>  findByReader(String reader);
}
