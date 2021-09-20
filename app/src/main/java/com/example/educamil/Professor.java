package com.example.educamil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import model.ProfessorModel;

public class Professor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);

        ProfessorModel p =new ProfessorModel();
        p.initialLoad();
        RecyclerViewAdapterProfessores ca= new RecyclerViewAdapterProfessores(p.getProfessores());
        RecyclerView cv=this.findViewById(R.id.recycler_view);
        cv.setLayoutManager(new LinearLayoutManager(this));
        cv.setAdapter(ca);

  }

}