/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author eslam.ahmed
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myCricketCoach", Coach.class);
        String dailyWorkout = theCoach.getDailyWorkout();
        System.out.println(dailyWorkout);
        System.out.println(theCoach.getDailyFortune());
        
        context.close();
    }
            
}
