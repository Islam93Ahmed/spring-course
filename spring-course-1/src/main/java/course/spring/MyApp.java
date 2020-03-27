/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.spring;

/**
 *
 * @author eslam.ahmed
 */
public class MyApp {
    public static void main(String[] args) {
//        BaseballCoach theCoach = new BaseballCoach();
        TrackCoach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
