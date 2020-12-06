/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tecladovirtual.sound;

import jaco.mp3.player.MP3Player;
import java.io.File;       
import tecladovirtual.Teclado;
        
/**
 *
 * @author JJSS
 */
public class SoundController implements SoundInterface{
    private final MP3Player sound;

    public SoundController(String path) {
        this.sound = new MP3Player(new File(path));
    }
    
    @Override
    public void play(){
        sound.setVolume(Teclado.getVolume());
        sound.play();
    }
    
    @Override
    public void stop(){
        if(sound.isStopped() == false){
            sound.stop();
        }
    }
    
    @Override
    public void pause(){
        int volumeOriginal = sound.getVolume();
        
        int taxaDiminuicao = (int) Math.ceil(volumeOriginal/10);
        int volumeAtual = volumeOriginal;
        for(int i = 0 ; i < 10 && volumeAtual > 0; i++) {
            volumeAtual -= taxaDiminuicao;
            sound.setVolume(volumeAtual);
            try{
                Thread.sleep(250);
            } catch (InterruptedException e) {}
        }
        
        sound.stop();
        sound.setVolume(volumeOriginal);
    }
    
    @Override
    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            return;
        }
        
        sound.setVolume(volume);
    }
}
