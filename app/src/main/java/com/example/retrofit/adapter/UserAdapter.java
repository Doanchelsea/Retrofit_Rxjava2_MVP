package com.example.retrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.R;
import com.example.retrofit.model.Post;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Post> arrayList;
    private Context context;


    public UserAdapter(ArrayList<Post> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_login,parent,false);
        return new UserHordel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Post post =arrayList.get(position);
        UserHordel userHordel = (UserHordel) holder;
        userHordel.tvUser.setText(post.getTaikhoan());
        userHordel.tvPass.setText(post.getMatkhau());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class UserHordel extends RecyclerView.ViewHolder {
        private TextView tvUser,tvPass;
        public UserHordel(@NonNull View itemView) {
            super(itemView);
            tvUser = itemView.findViewById(R.id.tvUser);
            tvPass = itemView.findViewById(R.id.tvPass);

        }
    }
}
