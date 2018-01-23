/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ninjads.porsaty.service;

import com.ninjads.porsaty.dao.BookDao;
import com.ninjads.porsaty.model.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author tawfik
 */
@Service
@Transactional(readOnly = true)
public class BookServiceImp implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional
    @Override
    public long save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book get(long id) {
        return bookDao.get(id);
    }

    @Override
    public List<Book> list() {
        return bookDao.list();
    }

    @Transactional
    @Override
    public void update(long id, Book book) {
        bookDao.update(id, book);
    }

    @Transactional
    @Override
    public void delete(long id) {
        bookDao.delete(id);
    }

}
