package com.northcoders.fragments_demo;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    NavigationBarView navigationBarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the Navigation Bar View to the one in main
        navigationBarView = findViewById(R.id.BottomNavView);
        // Set a listener that will be alerted when there is a selection on the navigation bar
        navigationBarView.setOnItemSelectedListener(this);
        // Set the first selected item as home
        navigationBarView.setSelectedItemId(R.id.home);

    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}