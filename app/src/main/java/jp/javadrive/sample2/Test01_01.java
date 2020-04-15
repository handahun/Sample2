package jp.javadrive.sample2;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.FileNotFoundException;
import androidx.appcompat.app.AppCompatActivity;

public class Test01_01 extends AppCompatActivity implements OnClickListener{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private Button button;

    private int DB_VERSION = 1;
    private int DB_MODE = Context.MODE_PRIVATE;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(linearLayout);

        button = new Button(this);
        button.setText("Create Database");
        button.setOnClickListener(this);
        linearLayout.addView(button, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        SQLiteDatabase db;
//        try {
//            //db = createDatabase("db01_01", DB_VERSION, DB_MODE, null);
//            sqliteHelper helper = new sqliteHelper(this);
//        } catch (FileNotFoundException e) {
//            db = null;
//        }
    }
}
