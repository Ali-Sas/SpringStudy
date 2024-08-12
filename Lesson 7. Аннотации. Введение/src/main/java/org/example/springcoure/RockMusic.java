package org.example.springcoure;

import org.springframework.stereotype.Component;

@Component("someRockMusic") // аннотация которая дает спрингу создать бин из этого класса
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Рок музыка";
    }
}
