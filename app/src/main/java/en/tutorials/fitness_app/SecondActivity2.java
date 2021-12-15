package en.tutorials.fitness_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {

    int[]  newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{
                R.id.plank_pose,R.id.crunches_pose, R.id.situp_pose,R.id.rotation_pose,R.id.twist_pose,R.id.windmill_pose,R.id.legup_pose
        };


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



            return true;
        }
        if(id== R.id.id_term){



            return true;
        }
        if(id== R.id.rate){



            return true;
        }
        if(id== R.id.more){



            return true;
        }
        if(id== R.id.share){



            return true;
        }

        return true;
    }

    public void Imagebuttonclicked(View view) {
        for(int i=0;i<newArray.length;i++){
            if(view.getId() == newArray[i]){
                int value =i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,ThirdActivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}