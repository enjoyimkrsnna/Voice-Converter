package com.example.loginapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class MainActivity extends AppCompatActivity {
    Button lout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lout = findViewById(R.id.logout);
        lout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),login.class));
                finish();
            }
        });
    }
    public void textspeech(View view)
    {
        Intent i = new Intent(getApplicationContext(),texttospeech.class);
        startActivity(i);
    }

    public void speechtotext(View view)
    {
        Intent i = new Intent(getApplicationContext(),speechtotext.class);
        startActivity(i);
    }
    public void transaltor(View view)
    {
        Intent i = new Intent(getApplicationContext(),translator.class);
        startActivity(i);
    }
    public void voicerecorder(View view)
    {
        Intent i = new Intent(getApplicationContext(),VoiceRecorder.class);
        startActivity(i);
    }
}