package com.rupa.toprecipe;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgRecipe;
    TextView txtName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgRecipe=findViewById(R.id.img_recipe);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);



        String getId=getIntent().getExtras().getString("id");

        if (getId.equals("one"))
        {
            imgRecipe.setImageResource(R.drawable.falafel_burgers);
            txtName.setText("FALAFEL BURGER");
            txtDescription.setText(R.string.recipe1);
        }
        else if (getId.equals("two"))
        {
            imgRecipe.setImageResource(R.drawable.chicken_biriyani);
            txtName.setText("CHICKEN BIRIYANI");
            txtDescription.setText(R.string.recipe2);
        }
        if (getId.equals("three"))
        {
            imgRecipe.setImageResource(R.drawable.cake);
            txtName.setText("CHOCKLET CAKE");
            txtDescription.setText(R.string.recipe3);
        }
        if (getId.equals("four"))
        {
            imgRecipe.setImageResource(R.drawable.pizza);
            txtName.setText("MEXICAN PIZZA");
            txtDescription.setText(R.string.recipe4);
        }
    }
}
