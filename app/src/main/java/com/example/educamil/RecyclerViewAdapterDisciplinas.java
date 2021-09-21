package com.example.educamil;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import model.AlunoModel;
import model.DisciplinaModel;


public class RecyclerViewAdapterDisciplinas extends RecyclerView.Adapter<RecyclerViewAdapterDisciplinas.ViewHolder> {
    private static final String TAG = "ProductsAdapter";
    private ArrayList<DisciplinaModel> disciplinas;

    public RecyclerViewAdapterDisciplinas(ArrayList<DisciplinaModel> dataSet) { disciplinas = dataSet;  }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewNome;
        private final TextView textView;
        private final TextView textViewIdade;
        private final ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            textViewNome = (TextView)v.findViewById(R.id.textViewNome);
            textViewIdade = (TextView) v.findViewById(R.id.textViewIdade);
            textView = (TextView) v.findViewById(R.id.textViewDescricao);

            this.imageView=(ImageView)v.findViewById(R.id.imageViewProfessor);

        }
        public TextView getTextViewNome() {
            return textViewNome;
        }
        public TextView getTextView() { return textView; }
        public TextView getTextViewIdade() { return textViewIdade;  }
        public ImageView getImageView() { return imageView; }
    }

     @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.modelo, viewGroup, false);
        return new ViewHolder(v);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");
        viewHolder.getTextViewNome().setText("Disciplina: " + disciplinas.get(position).getNome());
        viewHolder.getTextView().setText("Ano Letivo: " + disciplinas.get(position).getDescricao());
        viewHolder.getTextViewIdade().setText("Carga HR: " +String.valueOf(disciplinas.get(position).getCargaHr()));
        viewHolder.getImageView().setImageDrawable(viewHolder.getImageView().getContext().getDrawable(disciplinas.get(position).getImageId()));
    }

    @Override
    public int getItemCount() {
        return disciplinas.size();
    }
}
