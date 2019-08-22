package com.rupa.toprecipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class homeActivity extends AppCompatActivity {


    //declare button object
    Button btnRecipe1,btnRecipe2,btnRecipe3,btnRecipe4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnRecipe1=findViewById(R.id.btn_recipe1);
        btnRecipe2=findViewById(R.id.btn_recipe2);
        btnRecipe3=findViewById(R.id.btn_recipe3);
        btnRecipe4=findViewById(R.id.btn_recipe4);

        btnRecipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(homeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"one");
                startActivity(intent);

                Toast.makeText(homeActivity.this, "FALAFEL BURGER", Toast.LENGTH_SHORT).show();
            }
        });

        btnRecipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(homeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"two");
                startActivity(intent);

                Toast.makeText(homeActivity.this, "CHICKEN BIRIYANI", Toast.LENGTH_SHORT).show();
            }
        });

        btnRecipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(homeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"three");
                startActivity(intent);

                Toast.makeText(homeActivity.this, "CHOCKLET CAKE", Toast.LENGTH_SHORT).show();
            }
        });
        btnRecipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(homeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"four");
                startActivity(intent);

                Toast.makeText(homeActivity.this, "MEXICAN PIZZA", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
