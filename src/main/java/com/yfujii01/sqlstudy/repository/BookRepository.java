package com.yfujii01.sqlstudy.repository;

import com.yfujii01.sqlstudy.entity.Book;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
}