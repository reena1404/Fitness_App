package en.tutorials.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivityDetails extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        TypedArray imgs = getResources().obtainTypedArray(R.array.random_imgs);

        textView = findViewById(R.id.txt);
        imageView= findViewById(R.id.img);
        String dstory = getIntent().getStringExtra("story");
        int i= getIntent().getIntExtra("index",0);
         textView.setText(dstory);
        imageView.setImageResource(imgs.getResourceId(i, 0));
        //imageView.setImageDrawable(Drawable.createFromPath(imgsrc));

    }

    public void goback(View view) {
        Intent intent = new Intent(FoodActivityDetails.this,FoodActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(FoodActivityDetails.this,FoodActivity.class);
        startActivity(intent);
        finish();
    }
}