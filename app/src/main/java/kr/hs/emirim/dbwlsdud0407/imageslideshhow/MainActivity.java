package kr.hs.emirim.dbwlsdud0407.imageslideshhow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip=(ViewFlipper)findViewById(R.id.but_flip);
        flip.setFlipInterval(1000);
        Button butstart=(Button)findViewById(R.id.but_start);
        butstart.setOnClickListener(this);
        Button butstop=(Button)findViewById(R.id.but_stop);
        butstop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.but_start:
                flip.startFlipping();
                break;
            case R.id.but_stop:
                flip.stopFlipping();
                break;

        }
    }
}
