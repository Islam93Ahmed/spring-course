/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.spring;

/**
 *
 * @author islam
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach() {
        System.out.println("Creating new CricketCoach Object");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Setting the email property");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Setting the team property");
        this.team = team;
    }

    
    
    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setting the property");
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Do Some Cricket Excersice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
