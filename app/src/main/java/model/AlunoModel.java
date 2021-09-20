package model;

import com.example.educamil.R;

import java.util.ArrayList;

public class AlunoModel {
    private String nome;
    private int idade;
    private String descricao;
    private int imageId;
    private ArrayList<AlunoModel> alunos= new ArrayList<AlunoModel>();

    public AlunoModel(){
        this.nome=nome;
        this.idade=idade;
        this.descricao=descricao;
    }
    public AlunoModel(String nome, int idade, String descricao, int imageId){
        this.nome=nome;
        this.idade=idade;
        this.descricao=descricao;
        this.imageId=imageId;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
        alunos.add(new AlunoModel("Lucas",18,"Soldado", R.drawable.aluno));
        alunos.add(new AlunoModel("Marcos",19,"Soldado", R.drawable.aluno));
        alunos.add(new AlunoModel("Matheus",19,"Soldado", R.drawable.aluno));
        alunos.add(new AlunoModel("Lucas",20,"Soldado", R.drawable.aluno));
    }
    public ArrayList<AlunoModel> getAlunos() {
        return alunos;
    }
}
