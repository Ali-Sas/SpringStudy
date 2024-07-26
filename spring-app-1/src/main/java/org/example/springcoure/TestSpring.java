package org.example.springcoure;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MediaPlayer mediaPlayer = context.getBean("mediaPlayer", MediaPlayer.class);

        mediaPlayer.play();
        context.close();
    }
}
