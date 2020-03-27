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
public class BaseballCoach implements Coach{
    
    private FortuneService fortuneService;
    
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
