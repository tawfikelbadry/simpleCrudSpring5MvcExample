/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ninjads.porsaty.service;

import com.ninjads.porsaty.model.Book;
import java.util.List;

/**
 *
 * @author tawfik
 */
public interface BookService {

   long save(Book book);
   Book get(long id);
   List<Book> list();
   void update(long id, Book book);
   void delete(long id);
}
