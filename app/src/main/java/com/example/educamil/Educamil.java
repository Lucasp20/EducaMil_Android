package com.example.educamil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Educamil extends AppCompatActivity {

    private Button professores, alunos, turmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educamil);

        professores = (Button) findViewById(R.id.btnProfessor);
        alunos = (Button) findViewById(R.id.btnAluno);
        turmas = (Button) findViewById(R.id.btnTurmas);

        professores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                professoresActivity();
            }
        });

        alunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alunosActivity();

            }
        });

        turmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                turmasActivity();

            }
        });

    }
    private void professoresActivity(){
        startActivity(new Intent(Educamil.this, Professor.class));
    }
    private void alunosActivity(){
        startActivity(new Intent(Educamil.this, Aluno.class));
    }
    private void turmasActivity(){
        startActivity(new Intent(Educamil.this, Turma.class));
    }

}