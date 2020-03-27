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
public class TrackCoach implements Coach{
    
    private FortuneService fortuneService;
    
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
       return fortuneService.getFortune();
    }

    public TrackCoach() {
    }
    
}
