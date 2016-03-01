package Noise;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.*;

/**
 * Created by g00238234 on 01/03/2016.
 */
public class Main extends JFrame {

        public Main() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Test Sound Clip");
            this.setSize(300, 200);
            this.setVisible(true);

            try {
                // Open an audio input stream.
                //URL url = this.getClass().getClassLoader().getResource("gameover.wav");

                File file = new File("C:\\Users\\g00238234\\Desktop\\NoiseCanceller\\cockpit_mic.wav");
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
                // Get a sound clip resource.
                Clip clip = AudioSystem.getClip();
                // Open audio clip and load samples from the audio input stream.
                clip.open(audioIn);
                clip.start();










            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        new Main();
    }
}


