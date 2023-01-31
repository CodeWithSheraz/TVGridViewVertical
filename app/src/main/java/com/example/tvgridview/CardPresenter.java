package com.example.tvgridviewhorizontal;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.leanback.widget.Presenter;

public class CardPresenter extends Presenter {

    int[] imagesList;
    String[] titles;

    public CardPresenter() {

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        try {
            final CardView cardView = new CardView(parent.getContext());
            cardView.setFocusable(true);
            cardView.setCardIcon(R.drawable.ic_baseline_image_not_supported_24);
            cardView.setTextColor(Color.parseColor("#FFFFFF"));
            cardView.setFocusableInTouchMode(true);
            cardView.setBackgroundColor(Color.parseColor("#3A3E4C"));
            return new ViewHolder(cardView);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        CardView cardView = (CardView) viewHolder.view;
            if(item instanceof MovieModel){
                Log.d("abc", ((MovieModel) item).getMovieName());
                Log.d("abc", String.valueOf(((MovieModel) item).getMoviePoster()));
                cardView.setCardText(((MovieModel) item).movieName);
                cardView.setCardIcon(((MovieModel) item).moviePoster );
            }

//            for (int i=0; i< imagesList.length; i++){
//                cardView.setCardIcon(imagesList[i]);
//                cardView.setCardText(titles[i]);
//                Log.d("RowTest", "Working : " + titles[i] + "\n Images: " + String.valueOf(imagesList[i]));
//            }

        cardView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    cardView.setBackgroundResource(R.drawable.card_border);
                    cardView.animate();
                }
                else {
                    cardView.setTextColor(Color.parseColor("#FFFFFF"));
                    cardView.setBackgroundColor(Color.parseColor("#3A3E4C"));
                }
            }
        });

    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {

    }
}
