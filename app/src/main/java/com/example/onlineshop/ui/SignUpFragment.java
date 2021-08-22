package com.example.onlineshop.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.utils.widget.MotionLabel;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onlineshop.R;


public class SignUpFragment extends Fragment implements View.OnClickListener{
    TextView mLogIn ;
    private NavController navController;

    public SignUpFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniView(view);
    }

    private void iniView(View view)
    {
        mLogIn=view.findViewById(R.id.login_s);
        mLogIn.setOnClickListener(this);

        //navController to OnClick
        navController = Navigation.findNavController(view);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.login_s:
                navController.navigate(R.id.action_signUpFragment3_to_loginFragment2);
                break;
        }
    }
}