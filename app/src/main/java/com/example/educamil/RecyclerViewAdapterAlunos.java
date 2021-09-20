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


public class RecyclerViewAdapterAlunos extends RecyclerView.Adapter<RecyclerViewAdapterAlunos.ViewHolder> {
    private static final String TAG = "ProductsAdapter";
    private ArrayList<AlunoModel> alunos;

    public RecyclerViewAdapterAlunos(ArrayList<AlunoModel> dataSet) { alunos = dataSet;  }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewNome;
        private final TextView textView;
        private final TextView textViewIdade;
        private final ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            textViewNome = (TextView)v.findViewById(R.id.textViewNome);
            textView = (TextView) v.findViewById(R.id.textViewDescricao);
            textViewIdade = (TextView) v.findViewById(R.id.textViewIdade);
            this.imageView=(ImageView)v.findViewById(R.id.imageViewProfessor);

        }
        public TextView getTextViewNome() {
            return textViewNome;
        }
        public TextView getTextView() {
            return textView;
        }
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
        viewHolder.getTextViewNome().setText("Nome: " + alunos.get(position).getNome());
        viewHolder.getTextView().setText(alunos.get(position).getDescricao());
        viewHolder.getTextViewIdade().setText("Idade: "+String.valueOf(alunos.get(position).getIdade()));
        viewHolder.getImageView().setImageDrawable(viewHolder.getImageView().getContext().getDrawable(alunos.get(position).getImageId()));
    }

    @Override
    public int getItemCount() {
        return alunos.size();
    }
}
