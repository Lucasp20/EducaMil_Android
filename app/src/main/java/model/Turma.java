package model;

import com.example.educamil.R;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private String descricao;
    private int imageId;
    private ArrayList<Turma> turmas= new ArrayList<Turma>();

    public Turma(){
        this.nome=nome;
        this.descricao=descricao;
    }
    public Turma(String nome, String descricao, int imageId){
        this.nome=nome;
        this.descricao=descricao;
        this.imageId=imageId;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void initialLoad(){
        turmas.add(new Turma("Turma1","2020-2021", R.drawable.turma));
        turmas.add(new Turma("Turma2","2019-2020", R.drawable.turma));
        turmas.add(new Turma("Turma3","2018-2019", R.drawable.turma));

    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
