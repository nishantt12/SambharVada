package com.nishant.sambhar.vada;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import nishant.com.sambharvada.Init;
import nishant.com.sambharvada.SambarVada;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupForm();
    }


    private void setupForm() {

        final SambarVada sambarVada = new SambarVada(this, new SambarVada.Callback() {
            @Override
            public void onReceive(Init[] initEditTexts, boolean isOk) {


            }


        });


        Init edit1 = new Init(R.id.editTitle, true, "ReviewTitle", SambarVada.EDIT_TEXT);
        Init edit2 = new Init(R.id.editComments, true, "ReviewComments", SambarVada.EDIT_TEXT);
        Init edit3 = new Init(R.id.editFullName, true, "FullName", SambarVada.EDIT_TEXT);
        Init edit4 = new Init(R.id.editEmail, true, "Email", SambarVada.EDIT_TEXT);

        Init rating1 = new Init(R.id.overAllRating, true, "TotalScore", SambarVada.RATING_BAR);

        sambarVada.setUp(new Init[]{
                        edit1, edit2, edit3, edit4, rating1
                }
        );


        findViewById(R.id.onFeedBack).setOnClickListener(new View.OnClickListener() {
                                                             @Override
                                                             public void onClick(View v) {

                                                                 sambarVada.run();

                                                             }
                                                         }

        );
    }
}
