package com.libex.repository;
import org.springframework.data.repository.CrudRepository;

import com.libex.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
