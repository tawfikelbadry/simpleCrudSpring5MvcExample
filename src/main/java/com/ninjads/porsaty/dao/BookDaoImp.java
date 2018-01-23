/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ninjads.porsaty.dao;

import com.ninjads.porsaty.model.Book;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tawfik
 */
@Repository
public class BookDaoImp implements BookDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Book book) {
      sessionFactory.getCurrentSession().save(book);
      return book.getId();
   }

   @Override
   public Book get(long id) {
      return sessionFactory.getCurrentSession().get(Book.class, id);
   }

   @Override
   public List<Book> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Book> cq = cb.createQuery(Book.class);
      Root<Book> root = cq.from(Book.class);
      cq.select(root);
      Query<Book> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Book book) {
      Session session = sessionFactory.getCurrentSession();
      Book book2 = session.byId(Book.class).load(id);
      book2.setTitle(book.getTitle());
      book2.setAuthor(book.getAuthor());
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Book book = session.byId(Book.class).load(id);
      session.delete(book);
   }

}
