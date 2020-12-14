package com.example.student1.neurobics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CalculatingMenu extends Fragment {
    public CalculatingMenu(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.calculating_menu, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Кнопка в ГлавноеМеню
        Button backToMM = view.findViewById(R.id.backToMenuFromCalc);
        backToMM.setOnClickListener(new View.OnClickListener() {
            MainMenu fr2 = new MainMenu();
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.CalcMenu,fr2).commit();
            }
        });

        //Кнопка для начала СчетХ20
        Button stroopTest = view.findViewById(R.id.playCalc);
        stroopTest.setOnClickListener(new View.OnClickListener() {
            LoadMenu fr2 = new LoadMenu();
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.CalcMenu,fr2).commit();
            }
        });
    }
}
