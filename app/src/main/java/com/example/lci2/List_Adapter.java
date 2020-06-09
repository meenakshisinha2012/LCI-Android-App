package com.example.lci2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class List_Adapter extends RecyclerView.Adapter<List_Adapter.ProductViewHolder>{

    private Context mCtx;
    private List<Document_List> documentList;

    public List_Adapter(Context mCtx, List<Document_List> documentList) {
        this.mCtx = mCtx;
        this.documentList = documentList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_item, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Document_List document_List = documentList.get(position);

        holder.Document_name.setText(document_List.getDoc_name());
        holder.Document_size.setText(document_List.getDoc_size());
        holder.icon.setImageDrawable(mCtx.getResources().getDrawable(document_List.getImage(),null));
        holder.imgDownload.setImageDrawable(mCtx.getResources().getDrawable(document_List.getDownload_img(),null));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),DisplayDoc.class);
                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return documentList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView icon,imgDownload;
        TextView Document_name,Document_size ;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.icon);
            Document_name = itemView.findViewById(R.id.Document_name);
            Document_size = itemView.findViewById(R.id.Document_size);
            imgDownload = itemView.findViewById(R.id.imageView);
        }
    }

}
