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

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    private Context mCtx;
    private List<Product> productList;

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        holder.textViewCourse_name.setText(product.getCourse_name());
        holder.textViewCourse_level.setText(product.getCourse_level());
        holder.textViewCompletion_status.setText(String.valueOf(product.getCompletion_status()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage(),null));


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),New_Activity.class);
                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewCourse_name,textViewCourse_level, textViewCompletion_status ;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.Course_image);
            textViewCourse_name = itemView.findViewById(R.id.textViewCourse_name);
            textViewCourse_level = itemView.findViewById(R.id.textViewCourse_level);
            textViewCompletion_status = itemView.findViewById(R.id.textViewCompletion_status);

        }
    }

}
