package fr.bonaparte.suividevosfrais;

import android.os.Bundle;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

public class NuitActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuit);
        setTitle("GSB : Frais Nuitées");
        // modification de l'affichage du DatePicker; format date
        Global.changeAfficheDate((DatePicker) findViewById(R.id.datNuitee), false);
    }
}