package nishant.com.sambharvada;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;

/**
 * Created by nishant on 7/9/16.
 */
public class SambarVada {

    public static final String EDIT_TEXT = "edit_text";
    public static final String RADIO_BUTTON = "radio_button";
    public static final String RADIO_GROUP = "radio_group";
    public static final String CHECK_BOX = "check_box";
    public static final String SPINNER = "spinner";
    public static final String RATING_BAR = "rating_bar";


    final String TAG = this.getClass().getSimpleName();

    public interface Callback {

        void onReceive(Init[] inits, boolean isOk);

    }


    Callback callback;
    Activity context;

    Init[] inits;


    public SambarVada(Activity context, Callback callback) {
        this.context = context;
        this.callback = callback;

    }


    public void setUp(Init[] inits) {
        this.inits = inits;

    }


    public void run() {


        boolean isOk = true;

        for (int i = 0; i < inits.length; i++) {

            Init init = inits[i];

//            Log.e(TAG, init.id + "  " + init.getType());

            switch (init.getType()) {

                case EDIT_TEXT:
                    isOk = isText(isOk, i);
                    break;

                case CHECK_BOX:

                    isCheck(i);

                    break;
                case SPINNER:

                    isSpinner(i);

                    break;

                case RADIO_GROUP:

                    isRadioGroup(i);

                    break;

                case RADIO_BUTTON:

                    isRadioButton(i);

                    break;

                case RATING_BAR:

                    isRatingBar(i);

                    break;

                default:
                    break;
            }


        }

        callback.onReceive(inits, isOk);


    }

    private boolean isText(boolean isOk, int i) {

        Init init = inits[i];

//        Log.e(TAG, init.id + "  " + init.getType());

        EditText editText = (EditText) context.findViewById(init.id);

        init.setText(editText.getText().toString());

//        Log.e(TAG, init.getText());

        if (init.isMandatory && init.getText().isEmpty()) {

            editText.setError("This field is mandatory");
            isOk = false;

        }
        return isOk;
    }

    private void isCheck(int i) {

        final Init init = inits[i];

//        Log.e(TAG, init.id + "  " + init.getType());

        CheckBox checkBox = (CheckBox) context.findViewById(init.id);

        init.setChecked(checkBox.isChecked());


    }

    private void isSpinner(final int i) {

        final Init init = inits[i];

        Spinner spinner = (Spinner) context.findViewById(init.id);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selected = parent.getItemAtPosition(position).toString();

                init.setText(selected);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


    private void isRadioGroup(int i) {

        final Init init = inits[i];

        RadioGroup radioGroup = (RadioGroup) context.findViewById(init.id);


        int id = radioGroup.getCheckedRadioButtonId();


        RadioButton radioButton = (RadioButton) context.findViewById(id);

        init.setText(radioButton.getText().toString());


    }

    private void isRadioButton(int i) {

        final Init init = inits[i];

        RadioButton radioButton = (RadioButton) context.findViewById(init.id);

        init.setText(radioButton.getText().toString());
    }


    private void isRatingBar(int i) {

        final Init init = inits[i];

        RatingBar ratingBar = (RatingBar) context.findViewById(init.id);

        int rating = (int) ratingBar.getRating();

        init.setRating(rating);

    }


}
