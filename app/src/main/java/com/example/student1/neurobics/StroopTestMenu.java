package com.example.student1.neurobics;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StroopTestMenu extends Fragment {
    public StroopTestMenu(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.stroop_test_menu, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Кнопка на ГлавноеМеню
        Button backToMM = view.findViewById(R.id.backToMenuFromStroop);
        backToMM.setOnClickListener(new View.OnClickListener() {
            MainMenu fr2 = new MainMenu();
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.STMenu,fr2).commit();
            }
        });

        //Кнопка для начала теста Струпа
        Button stroopTest = view.findViewById(R.id.playStroopTest);
        stroopTest.setOnClickListener(new View.OnClickListener() {
            LoadMenu fr2 = new LoadMenu();
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.STMenu,fr2).commit();
            }
        });
    }
}
