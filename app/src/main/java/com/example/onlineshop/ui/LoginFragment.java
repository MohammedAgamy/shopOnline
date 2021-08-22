package com.example.onlineshop.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onlineshop.R;

import org.jetbrains.annotations.NotNull;

public class LoginFragment extends Fragment implements View.OnClickListener {
    TextView mSignUp ;
    private NavController navController;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        iniView(view);
    }

    private void iniView(View view)
    {
        mSignUp=view.findViewById(R.id.login_l);
        mSignUp.setOnClickListener(this);

        //navController to OnClick
        navController = Navigation.findNavController(view);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.login_l:
                navController.navigate(R.id.action_loginFragment2_to_signUpFragment3);
                getActivity().finish();
                break;
        }

    }
}