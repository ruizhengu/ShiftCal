package de.nulide.shiftcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;

import de.nulide.shiftcal.logic.object.Employer;

public class EmployersActivity extends AppCompatActivity {

    private ArrayList<Employer> employers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employers);
        Toolbar toolbar = findViewById(R.id.toolbar);
    }
}