package com.example.student1.neurobics;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StartMenu extends Fragment{
    public StartMenu(){}
    interface OnCallback {
        void callback(String s);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                                @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_menu, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button btn = view.findViewById(R.id.startButton);
        btn.setOnClickListener(new View.OnClickListener() {
            MainMenu fr2 = new MainMenu();
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.StartMenu,fr2).commit();
            }
        });
    }
}
