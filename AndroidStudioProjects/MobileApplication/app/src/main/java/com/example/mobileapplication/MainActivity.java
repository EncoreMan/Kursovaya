package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.room.Room;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        database = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "my-database")
                .build();
    }
    public AppDatabase getDatabase() {
        return database;
    }
}