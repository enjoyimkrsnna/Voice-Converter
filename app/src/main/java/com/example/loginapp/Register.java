package com.example.loginapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    public static final String TAG = "Tag";
    EditText mfullname, mEmail, mPassword,mPhone;
    Button mRegistration;
    TextView mLoginbtn;
    FirebaseAuth FAuth;
    FirebaseFirestore fstore ;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mfullname = findViewById(R.id.fullname);
        mEmail = findViewById(R.id.Email);
        mPassword = findViewById(R.id.password);
        mPhone = findViewById(R.id.repassword);
        mRegistration = findViewById(R.id.regisbtn);
        mLoginbtn = findViewById(R.id.loginbtn);
        FAuth = FirebaseAuth.getInstance();
        fstore= FirebaseFirestore.getInstance();

        if(FAuth.getCurrentUser() != null)
        {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }
        mRegistration.setOnClickListener(view -> {
            String email = mEmail.getText().toString().trim();
            String password = mPassword.getText().toString().trim();
            String fullname = mfullname.getText().toString();
            String phone = mPhone.getText().toString();
            if(TextUtils.isEmpty(fullname))
            {
                mfullname.setError("Name is required ");
                return;
            }
            if(!fullname.matches("[ a-zA-Z ]+"))
            {
                mfullname.setError("Name must contains alphabets only");
                return;
            }
            if(TextUtils.isEmpty(email))
            {
                mEmail.setError("Email is required");
                return;
            }
            if(TextUtils.isEmpty(password))
            {
                mPassword.setError("Password is required");
                return;
            }
            if(password.length() < 6)
            {
                mPassword.setError("Password must have six or more character long");
                return;
            }
            if(TextUtils.isEmpty(phone))
            {
                mPhone.setError("phone number is required");
                return;
            }
            if(phone.length()!=10)
            {
                mPhone.setError("Phone number must be of 10 digits");
                return;
            }

            //register the user in firebase
            FAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (task.isSuccessful())
                    {
                        Toast.makeText(Register.this, "User Created", Toast.LENGTH_SHORT).show();
                        userID = FAuth.getCurrentUser().getUid();
                        DocumentReference documentReference = fstore.collection("users").document(userID);
                        Map<String,Object> user = new HashMap<>();
                        user.put("fName",fullname);
                        user.put("email",email);
                        user.put("phone",phone);
                        documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Log.d(TAG,"OnSuccess : user profile is created for "+ userID);
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.d("tag","onFailure "+ e.toString());
                            }
                        });
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    }
                    else
                    {
                        Toast.makeText(Register.this, "Error: "+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        });
    }
    public void alreadyregis(View view)
    {
        startActivity(new Intent(getApplicationContext(),login.class));
    }
}