package com.example.mobileapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationFragment extends Fragment {
    private EditText loginEditText;
    private EditText passwordEditText;
    private Button registerButton;

    private UserDao userDao;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registration, container, false);
        loginEditText = view.findViewById(R.id.login_registration);
        passwordEditText = view.findViewById(R.id.password_edit);
        registerButton = view.findViewById(R.id.button);



        return view;
    }
}