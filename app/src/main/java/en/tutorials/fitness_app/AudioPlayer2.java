package en.tutorials.fitness_app;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;




public class AudioPlayer2 extends AppCompatActivity
{
    MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_player2);
        mediaplayer=MediaPlayer.create(this,R.raw.song);

    }
    public void playMusic(View view)
    {
        mediaplayer.start();
    }

    public void pauseMusic(View view)
    {
        mediaplayer.pause();
    }

    public void forwardMusic(View view)
    {
        int pos=mediaplayer.getCurrentPosition();
        pos=pos+5000;
        mediaplayer.seekTo(pos);
    }

    public void rewindMusic(View view)
    {
        int pos=mediaplayer.getCurrentPosition();
        pos=pos-5000;
        mediaplayer.seekTo(pos);
    }

    public void stopMusic(View view) {
        mediaplayer.stop();
        mediaplayer=MediaPlayer.create(this,R.raw.song);
    }
}