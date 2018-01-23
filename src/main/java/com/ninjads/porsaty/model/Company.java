/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjads.porsaty.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author tawfik
 */
@Entity
public class Company implements Serializable {

    @Id
    private int id;
    private String name;
    private double price;

}
