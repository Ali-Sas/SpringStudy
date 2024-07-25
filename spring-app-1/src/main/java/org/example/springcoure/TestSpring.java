package org.example.springcoure;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MediaPlayer mediaPlayer = new MediaPlayer(music);

        mediaPlayer.play();
        context.close();
    }
}
