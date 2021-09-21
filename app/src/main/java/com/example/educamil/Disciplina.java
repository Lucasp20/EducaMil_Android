package com.example.educamil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import model.AlunoModel;
import model.DisciplinaModel;

public class Disciplina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina);

        DisciplinaModel d =new DisciplinaModel();
        d.initialLoad();
        RecyclerViewAdapterDisciplinas ca= new RecyclerViewAdapterDisciplinas(d.getDisciplinas());
        RecyclerView cv=this.findViewById(R.id.recycler_view);
        cv.setLayoutManager(new LinearLayoutManager(this));
        cv.setAdapter(ca);
    }
}