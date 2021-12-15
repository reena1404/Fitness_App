package en.tutorials.fitness_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar toolbar = findViewById(R.id.toolBar);
       setSupportActionBar(toolbar);

        button1 = findViewById(R.id.startyoga1);
        button2 = findViewById(R.id.startyoga2);
        button3 = findViewById(R.id.workout);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WorkoutActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id== R.id.id_privacy){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);

            return true;
        }
        if(id== R.id.id_term){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);


            return true;
        }
        if(id== R.id.rate){
            try{
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName())));

            }
            catch(Exception Ex){
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
            }


            return true;
        }
        if(id== R.id.more){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/"));
            startActivity(intent);

            return true;
        }
        if(id== R.id.share){


            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody = " This is the best for Fitness \n Download Now \n" + "https";
            String sharehub = "Fitness App";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(myIntent,"Share Using"));


            return true;
        }

        return true;
    }

    public void beforeage18(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    public void afterage18(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(MainActivity.this,FoodActivity.class);
        startActivity(intent);
    }

    public void WorkoutVideo(View view) {
        Intent intent = new Intent(MainActivity.this,WorkoutActivity.class);
        startActivity(intent);
    }

    public void bmi(View view) {
        Intent intent = new Intent(MainActivity.this,BMIActivity.class);
        startActivity(intent);
    }
}