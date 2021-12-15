package en.tutorials.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class  FoodActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        String[] tstory = getResources().getStringArray(R.array.title_story);
        final String[] dstory = getResources().getStringArray(R.array.details_story);
        //final String[] imgarray =  new String[]{"nut_1","nut_2","nut_3","nut_4","nut_5","nut_6","nut_7","nut_8","nut_9","nut_10","nut_11","nut_12","nut_13","nut_14","nut_15"};

        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.row,R.id.rowtxt,tstory);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String t = dstory[i];
                //String p=imgarray[i];
                Intent intent = new Intent(FoodActivity.this,FoodActivityDetails.class);
                intent.putExtra("story",t);
                //intent.putExtra("img",p);
                startActivity(intent);
            }
        });


    }

    public void foodgoback(View view) {
        Intent intent = new Intent(FoodActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(FoodActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}