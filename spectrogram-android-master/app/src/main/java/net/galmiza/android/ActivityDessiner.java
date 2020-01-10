package net.galmiza.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import net.galmiza.android.spectrogram.R;

public class ActivityDessiner extends AppCompatActivity {
  ImageButton imbtnR;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.dessiner);

    imbtnR = (ImageButton)findViewById(R.id.imageButtonRetour2);

    imbtnR.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        ActivityDessiner.this.finish();

      }
    });

  }
}