package com.example.praktos12mobilki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // определяем слушателя нажатия элемента в списке
        StateAdapter.OnStateClickListener stateClickListener = new StateAdapter.OnStateClickListener() {
            @Override
            public void onStateClick(State state, int position) {
                // Выводим текст, относящийся к элементу
                Toast.makeText(getApplicationContext(), "Был выбран пункт " + state.getName() + ", столица: " + state.getCapital(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states, stateClickListener);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("Бразилия", "Бразилиа", R.drawable.narod1));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.narod2));
        states.add(new State ("Колумбия", "Богота", R.drawable.narod3));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.narod4));
        states.add(new State ("Чили", "Сантьяго", R.drawable.narod5));
    }
}