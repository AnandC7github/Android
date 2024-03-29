package com.example.projhybuttoncolor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View mColorRegion;
    private int[] mColorChoices =
            { Color.BLACK, Color.BLUE, Color.CYAN,
                    Color.DKGRAY, Color.GRAY, Color.GREEN,
                    Color.LTGRAY, Color.MAGENTA, Color.RED,
                    Color.WHITE, Color.YELLOW };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColorRegion = findViewById(R.id.color_region);
        Button colorButton =
                (Button)findViewById(R.id.color_button);
        colorButton.setOnClickListener(new ColorRandomizer());
    }
    private void setRegionColor(int color) {
        mColorRegion.setBackgroundColor(color);
    }

    private class ColorRandomizer implements OnClickListener {
        public void onClick(View clickedButton) {
            Random generator = new Random();
            int index = generator.nextInt(mColorChoices.length);
            setRegionColor(mColorChoices[index]);
        }
    }


}