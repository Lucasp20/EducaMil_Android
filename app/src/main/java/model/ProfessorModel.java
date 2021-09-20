package model;

import com.example.educamil.R;

import java.util.ArrayList;

public class ProfessorModel {
    private String nome;
    private int idade;
    private String descricao;
    private int imageId;
    private ArrayList<ProfessorModel> professores= new ArrayList<ProfessorModel>();

    public ProfessorModel(){
        this.nome=nome;
        this.idade=idade;
        this.descricao=descricao;
    }
    public ProfessorModel(String nome, int idade, String descricao, int imageId){
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
        professores.add(new ProfessorModel("Lucas",25,"Português", R.drawable.professor));
        professores.add(new ProfessorModel("Maria",44,"Matemática", R.drawable.professor));
        professores.add(new ProfessorModel("João",30,"Geografia", R.drawable.professor));
        professores.add(new ProfessorModel("Carlos",45,"Física", R.drawable.professor));
        professores.add(new ProfessorModel("Creuza",35,"Química", R.drawable.professor));

    }
    public ArrayList<ProfessorModel> getProfessores() { return professores;
    }
}
