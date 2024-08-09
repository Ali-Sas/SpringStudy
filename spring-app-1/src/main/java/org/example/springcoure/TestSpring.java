package org.example.springcoure;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer mediaPlayer = context.getBean("mediaPlayer", MusicPlayer.class);

        mediaPlayer.play();

        System.out.println(mediaPlayer.getName() + " Громкость: " + mediaPlayer.getVolume());
        context.close();
    }
}
