/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author islam
 */
public class CricketApp {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());
        context.close();
    }
    
}
