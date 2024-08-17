package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mannan.translateapi.Language;
import com.mannan.translateapi.TranslateAPI;

public class translator extends AppCompatActivity {


    EditText inputtxt;
    Button btntranslate;
    TextView translatedtxt;
    Spinner spn;
    String[] lst={"Hindi","Gujarati","Telugu","Italian","Japanese","German","French"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);
        inputtxt = findViewById(R.id.Text);
        btntranslate = findViewById(R.id.translate);
        translatedtxt = findViewById(R.id.translated_text);
        spn=findViewById(R.id.spinner);
        ArrayAdapter adp = new ArrayAdapter(this,android.R.layout.simple_spinner_item,lst);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adp);
            btntranslate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TranslateAPI translateAPI;
                    if(spn.getSelectedItemPosition()==0) {
                        translateAPI = new TranslateAPI(Language.AUTO_DETECT,Language.HINDI,inputtxt.getText().toString());
                        translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                            @Override
                            public void onSuccess(String translatedText) {
                                translatedtxt.setText(translatedText);
                            }
                            @Override
                            public void onFailure(String ErrorText) {
                                Log.d("error", ErrorText);
                            }
                        });
                    }
                    if(spn.getSelectedItemPosition()==1) {
                        translateAPI = new TranslateAPI(Language.AUTO_DETECT, Language.GUJARATI, inputtxt.getText().toString());
                        translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                            @Override
                            public void onSuccess(String translatedText) {
                                translatedtxt.setText(translatedText);
                            }
                            @Override
                            public void onFailure(String ErrorText) {
                                Log.d("error", ErrorText);
                            }
                        });
                    }
                    else if(spn.getSelectedItemPosition()==2) {
                        translateAPI = new TranslateAPI(Language.AUTO_DETECT,Language.TELUGU,inputtxt.getText().toString());
                        translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                            @Override
                            public void onSuccess(String translatedText) {
                                translatedtxt.setText(translatedText);
                            }
                            @Override
                            public void onFailure(String ErrorText) {
                                Log.d("error", ErrorText);
                            }
                        });
                    }
                    else if(spn.getSelectedItemPosition()==3) {
                        translateAPI = new TranslateAPI(Language.AUTO_DETECT,Language.ITALIAN,inputtxt.getText().toString());
                        translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                            @Override
                            public void onSuccess(String translatedText) {
                                translatedtxt.setText(translatedText);
                            }
                            @Override
                            public void onFailure(String ErrorText) {
                                Log.d("error", ErrorText);
                            }
                        });
                    }
                    else if(spn.getSelectedItemPosition()==4) {
                        translateAPI = new TranslateAPI(Language.AUTO_DETECT,Language.JAPANESE,inputtxt.getText().toString());
                        translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                            @Override
                            public void onSuccess(String translatedText) {
                                translatedtxt.setText(translatedText);
                            }
                            @Override
                            public void onFailure(String ErrorText) {
                                Log.d("error", ErrorText);
                            }
                        });
                    }
                    else if(spn.getSelectedItemPosition()==5) {
                        translateAPI = new TranslateAPI(Language.AUTO_DETECT,Language.GERMAN,inputtxt.getText().toString());
                        translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                            @Override
                            public void onSuccess(String translatedText) {
                                translatedtxt.setText(translatedText);
                            }
                            @Override
                            public void onFailure(String ErrorText) {
                                Log.d("error", ErrorText);
                            }
                        });
                    }
                    else if(spn.getSelectedItemPosition()==6) {
                        translateAPI = new TranslateAPI(Language.AUTO_DETECT,Language.FRENCH,inputtxt.getText().toString());
                        translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                            @Override
                            public void onSuccess(String translatedText) {
                                translatedtxt.setText(translatedText);
                            }
                            @Override
                            public void onFailure(String ErrorText) {
                                Log.d("error", ErrorText);
                            }
                        });
                    }
                }
            });
    }
}