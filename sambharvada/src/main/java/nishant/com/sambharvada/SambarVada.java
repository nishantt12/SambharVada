package nishant.com.sambharvada;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by nishant on 7/9/16.
 */
public class SambarVada {


    Callback callback;
    Context context;

    public SambarVada(Context context, Callback callback) {

        this.context = context;
        this.callback = callback;

    }

    interface Callback {

        void onReceive(ArrayList<InitEditText> initEditTexts);

    }

    ArrayList<InitEditText> initEditTexts;


    public void add(InitEditText initEditText) {
        initEditTexts.add(initEditText);
    }


    public void run() {


    }


}
