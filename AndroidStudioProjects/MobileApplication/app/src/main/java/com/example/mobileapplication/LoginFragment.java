package com.example.mobileapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class LoginFragment extends Fragment {

    private EditText loginEditText;
    private EditText passwordEditText;
    private Button button;
    private NavController navController;
    private SharedViewModel viewModel;
    private UserDao userDao;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        loginEditText = view.findViewById(R.id.LoginUser);
        passwordEditText = view.findViewById(R.id.PasswordUser);
        button = view.findViewById(R.id.button);
        button.setEnabled(false);

        EditText[] edList = {loginEditText, passwordEditText};
        ButtonClickOrNot textWatcher = new ButtonClickOrNot(edList, button);
        for (EditText editText : edList) editText.addTextChangedListener(textWatcher);


        TextView registrationButton = view.findViewById(R.id.registrationButton);
        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = edit1.getText().toString();
                String password = edit2.getText().toString();
                if (login.isEmpty() || password.isEmpty()) {
                    // Один или оба поля пустые, выведите Toast
                    Toast.makeText(getContext(), "Введите логин и пароль", Toast.LENGTH_SHORT).show();
                }
                else {
                    // Запустить асинхронную задачу для проверки логина и пароля
                    CheckLoginTask task = new CheckLoginTask(view, login, password);
                    task.execute();
                    navController = Navigation.findNavController(view);
                    navController.navigate(R.id.action_fragment1_to_fragment2);
                }
            }

        });
        return view;
    }
            public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
                super.onViewCreated(view, savedInstanceState);


            }
        }
