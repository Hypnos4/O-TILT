package net.galmiza.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.galmiza.android.spectrogram.R;

public class ActivityFormulaire extends AppCompatActivity {

    Button btnAnnuler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);

        btnAnnuler = (Button)findViewById(R.id.buttonAnnuler);

        btnAnnuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityFormulaire.this,ActivityChoixAjout.class);
                startActivity(i);

            }
        });

    }
}
