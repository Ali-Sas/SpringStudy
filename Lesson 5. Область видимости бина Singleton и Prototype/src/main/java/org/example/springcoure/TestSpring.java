package org.example.springcoure;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer mediaPlayer = context.getBean("mediaPlayer", MusicPlayer.class);

        mediaPlayer.play();

        MusicPlayer secondPlayer = context.getBean("mediaPlayer", MusicPlayer.class);

        mediaPlayer.setVolume(50);

        System.out.println(mediaPlayer.getName() + " Громкость: " + mediaPlayer.getVolume());

        System.out.println(secondPlayer.getName() + " Громкость: " + secondPlayer.getVolume());
        context.close();
    }
}
