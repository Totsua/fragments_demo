package com.northcoders.fragments_demo;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;
import com.northcoders.fragments_demo.fragments.FirstFragment;
import com.northcoders.fragments_demo.fragments.SecondFragment;
import com.northcoders.fragments_demo.fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    NavigationBarView navigationBarView;
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();

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

        // Set the page to change to home(firstFragment) if "home" is selected
        if(item.getItemId() == R.id.home){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayoutFragment, firstFragment)
                    .commit();
            return true;
        }
        // Set the page to change to add(secondFragment) if "add" is selected
        if(item.getItemId() == R.id.add){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayoutFragment, secondFragment)
                    .commit();
            return true;
        }
        // Set the page to change to favourites(thirdFragment) if "favourites" is selected
        if(item.getItemId() == R.id.favourites){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayoutFragment, thirdFragment)
                    .commit();
            return true;
        }

        return false;
    }
}