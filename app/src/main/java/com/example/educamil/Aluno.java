package com.example.educamil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import model.AlunoModel;
import model.ProfessorModel;

public class Aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        AlunoModel a =new AlunoModel();
        a.initialLoad();
        RecyclerViewAdapterAlunos ca= new RecyclerViewAdapterAlunos(a.getAlunos());
        RecyclerView cv=this.findViewById(R.id.recycler_view);
        cv.setLayoutManager(new LinearLayoutManager(this));
        cv.setAdapter(ca);
    }
}