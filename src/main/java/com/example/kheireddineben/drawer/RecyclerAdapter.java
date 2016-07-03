package com.example.kheireddineben.drawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KheireddineBen on 30/06/2016
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private String[] titles = {
            "Alger","Sétif","Oran","Tizi-Ouzou","Batna","Djelfa",
            "Blida","Chlef","M'Sila","Tlemcen","Constantine","Béjaïa",
            "Skikda","Tiaret","Médéa","Boumerdès","Mascara","Mila",
            "Aïn-Defla","Mostaganem","Relizane","Biskra","Bouira",
            "Tébessa","El-Oued","Jijel","Bordj-Bou-Arreridj",
            "Oum-El-Bouaghi", "Annaba","Sidi-Bel-Abbès","Tipaza",
            "Ouargla","Guelma", "Laghouat","Souk-Ahras","El-Tarf",
            "Adrar","Khenchela", "Aïn-Témouchent","Ghardaïa","Saïda",
            "Tissemsilt","Béchar", "El-Bayadh","Naâma","Tamanrasset",
            "Illizi","Tindouf",
    };
    private String[] details = {
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... ",
            "Detail: \n Some Description","Detail: \n Some Description... "

    };
    private int[] images = {
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran,
            R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran

    };

class ViewHolder extends RecyclerView.ViewHolder{

    public ImageView itemImage;
    public TextView itemTitle;
    public TextView itemDetail;

    public ViewHolder(View itemView) {
        super(itemView);
        itemImage = (ImageView)itemView.findViewById(R.id.item_image);
        itemTitle = (TextView)itemView.findViewById(R.id.item_title);
        itemDetail = (TextView)itemView.findViewById(R.id.item_detail);

    }
}


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i ){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return  viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
        viewHolder.itemImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.class , GalleryDetail.class);
                startActivity(intent);
*/
            }}
        );
    }

    @Override
    public int getItemCount(){return  titles.length;}
}

