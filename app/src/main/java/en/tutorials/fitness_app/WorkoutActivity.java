package en.tutorials.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class WorkoutActivity extends AppCompatActivity {
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

    }


    public void openaudio(View view)
    {
        in=new Intent(this,AudioPlayer2.class);
        startActivity(in);
    }

    public void openVideo(View view)
    {
        in=new Intent(this,VideoPlayer2.class);
        startActivity(in);
    }
}