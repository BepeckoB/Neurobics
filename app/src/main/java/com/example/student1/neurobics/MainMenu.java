package com.example.student1.neurobics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainMenu extends Fragment {
    public MainMenu(){}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_menu, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Кнопка на тест Струпа
        Button toSTMenu = view.findViewById(R.id.stroopTest);
        toSTMenu.setOnClickListener(new View.OnClickListener() {
            StroopTestMenu fr2 = new StroopTestMenu();
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.StartMenu,fr2).commit();
            }
        });

        //Кнопка на СчетХ20
        Button toCalcMenu = view.findViewById(R.id.CalcMenu);
        toCalcMenu.setOnClickListener(new View.OnClickListener(){
            CalculatingMenu fr2 = new CalculatingMenu();
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.StartMenu,fr2).commit();
            }
        });

    }
}
