package com.example.tvgridview;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.OnChildSelectedListener;
import androidx.leanback.widget.OnChildViewHolderSelectedListener;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends LeanbackActivity {
    androidx.leanback.widget.HorizontalGridView horizontalGridOne;
    VerticalGridView verticalGridView;
    int[] images = {
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p7,
            R.drawable.p8,
            R.drawable.p9,
            R.drawable.p10,
            R.drawable.p11,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p7,
            R.drawable.p8,
            R.drawable.p9,
            R.drawable.p10,
            R.drawable.p11,
    };

    int[] flowerImages = {
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3,
            R.drawable.f4,
            R.drawable.f5,
            R.drawable.f6,
            R.drawable.f7,
            R.drawable.f8,
            R.drawable.f9,
    };
    
    String[] flowerNames = {"Rose", "Lilly", "Daffodil" , "Sun Flower", "Suraj Mukhi", "Gulaab", "Colli Flower", "flower", "Pink Flower"};

    String[] title = {
        "Thor", "Captain Marvel", "Spider Man" , "Spiderman Home-Coming", "Avengers", "Doctor Strange",
            "Ant-Man", "Avengers Tabahi", "Captain Marvel Lay", "Loki", "Thor", "Captain Marvel", "Spider Man" , "Spiderman Home-Coming", "Avengers", "Doctor Strange",
            "Ant-Man", "Avengers Tabahi", "Captain Marvel Lay", "Loki"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        horizontalGridOne = findViewById(R.id.horizontalGridViewId);
        verticalGridView = findViewById(R.id.verticalGridView);
//        horizontalGridOne.setWindowAlignment(HorizontalGridView.WINDOW_ALIGN_BOTH_EDGE);
//        horizontalGridOne.setWindowAlignmentOffsetPercent(35);
        
        CustomAdapter customAdapter = new CustomAdapter(images, title, this);
//        CustomAdapter customAdapter2 = new CustomAdapter(flowerImages, flowerNames, this);
//        horizontalGridOne.setAdapter(customAdapter);

        verticalGridView.setAdapter(customAdapter);
        verticalGridView.setNumColumns(4);


//        verticalGridView.setOnChildSelectedListener(new OnChildSelectedListener() {
//            @Override
//            public void onChildSelected(ViewGroup parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "Position : " + position, Toast.LENGTH_SHORT).show();
////                view.findViewById(R.id.myTitleId).setVisibility(View.INVISIBLE);
//            }
//        });
    }
}