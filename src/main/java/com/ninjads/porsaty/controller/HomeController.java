/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjads.porsaty.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tawfik
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String hello() {
        return "Hello world from other side ";
    }

}
