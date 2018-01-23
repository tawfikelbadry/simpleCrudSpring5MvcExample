/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ninjads.porsaty.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author tawfik
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ninjads.porsaty.controller")
public class WebConfig extends WebMvcConfigurerAdapter{
    
}
