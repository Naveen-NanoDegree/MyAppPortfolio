package com.nanodegree.naveen.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnPopularMovies, btnStockHawk, btnBuilditBigger, btnMaterial, btnGoUbiquitious, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void viewOnclick() {
        btnPopularMovies.setOnClickListener(this);
        btnStockHawk.setOnClickListener(this);
        btnBuilditBigger.setOnClickListener(this);
        btnMaterial.setOnClickListener(this);
        btnGoUbiquitious.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);

    }

    private void initViews() {
        btnPopularMovies = (Button) findViewById(R.id.button_popular_movies);
        btnStockHawk = (Button) findViewById(R.id.button_stock_hawk);
        btnBuilditBigger = (Button) findViewById(R.id.button_build_it_bigger);
        btnMaterial = (Button) findViewById(R.id.button_material_app);
        btnGoUbiquitious = (Button) findViewById(R.id.button_go_ubiquitious);
        btnCapstone = (Button) findViewById(R.id.button_capstone);
        viewOnclick();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_popular_movies:
                displayToast("popular movie");
                break;
            case R.id.button_stock_hawk:
                displayToast("stock hawk");
                break;
            case R.id.button_build_it_bigger:
                displayToast("build it bigger");
                break;
            case R.id.button_material_app:
                displayToast("material");
                break;
            case R.id.button_go_ubiquitious:
                displayToast("go ubiquitous");
                break;
            case R.id.button_capstone:
                displayToast("capstone");
                break;
        }
    }

    private void displayToast(String message) {
        Toast.makeText(this, "This button will launch my " + message + " app", Toast.LENGTH_SHORT).show();
    }
}
