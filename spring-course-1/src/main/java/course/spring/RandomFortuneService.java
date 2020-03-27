/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.spring;

import java.util.Random;

/**
 *
 * @author islam
 */
public class RandomFortuneService implements FortuneService{

    String[] fortunes = new String[] {"Today is your lucky day", "Today is great day"};
    @Override
    public String getFortune() {
        Random rand = new Random();
        return fortunes[(rand.nextInt(fortunes.length))];
    }
    
}
