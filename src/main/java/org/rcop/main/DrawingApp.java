/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rcop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author elfri
 */
public class DrawingApp {
    
    public static void main(String[] args){
        //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));//ficheiro tem de estar no ficheiros de raiz do proj
        //Triangle triangle = (Triangle) factory.getBean("triangle");
        ApplicationContext context = new ClassPathXmlApplicationContext("org/rcop/main/spring.xml");//ficheiro tem de estar nos resources
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
    
}
