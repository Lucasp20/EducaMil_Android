package model;

import com.example.educamil.R;

import java.util.ArrayList;

public class DisciplinaModel {
    private String nome;
    private String cargaHr;
    private String descricao;
    private int imageId;
    private ArrayList<DisciplinaModel> disciplinas= new ArrayList<DisciplinaModel>();

    public DisciplinaModel(){
        this.nome=nome;
        this.cargaHr=cargaHr;
        this.descricao=descricao;

    }
    public DisciplinaModel(String nome, String cargaHr ,String descricao, int imageId){
        this.nome=nome;
        this.descricao=descricao;
        this.cargaHr=cargaHr;
        this.imageId=imageId;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHr() {
        return cargaHr;
    }

    public void setCargaHr(String cargaHr) {
        this.cargaHr = cargaHr;
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
        disciplinas.add(new DisciplinaModel("Português", "20hrs","2019", R.drawable.disciplina));
        disciplinas.add(new DisciplinaModel("Matemática", "30hrs","2019", R.drawable.disciplina));
        disciplinas.add(new DisciplinaModel("Geografia", "36Hrs" ,"2019", R.drawable.disciplina));
        disciplinas.add(new DisciplinaModel("Física", "75Hrs","2019", R.drawable.disciplina));
        disciplinas.add(new DisciplinaModel("Química","45Hrs" ,"2019", R.drawable.disciplina));

    }
    public ArrayList<DisciplinaModel> getDisciplinas() { return disciplinas;
    }
}
