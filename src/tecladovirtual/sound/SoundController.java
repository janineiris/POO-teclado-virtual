/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tecladovirtual.sound;

import jaco.mp3.player.MP3Player;
import java.io.File;       
        
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
        sound.play();
    }
    
    @Override
    public void stop(){
        if(sound.isStopped() == false){
            sound.stop();
        }
    }
}
