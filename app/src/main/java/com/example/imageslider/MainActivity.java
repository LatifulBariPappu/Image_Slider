package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider=findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels=new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.beb, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cake, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.chocolatefrostedcake, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.images, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.top, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.wdy, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
    }
}