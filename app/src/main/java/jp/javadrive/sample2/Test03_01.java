package jp.javadrive.sample2;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.FileNotFoundException;
import android.app.AlertDialog;

public class Test03_01 extends Activity implements OnClickListener{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private Button button1;
    private Button button2;
    private SQLiteDatabase db;

    private int DB_VERSION = 1;
    private int DB_MODE = Context.MODE_PRIVATE;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        db = null;

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(linearLayout);

        button1 = new Button(this);
        button1.setText("Open Database");
        button1.setOnClickListener(this);
        linearLayout.addView(button1, createParam(WC, WC));

        button2 = new Button(this);
        button2.setText("Close Database");
        button2.setOnClickListener(this);
        linearLayout.addView(button2, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
//        if (v == button1){
//            try {
//                db = openDatabase("db03_01", null);
//            } catch (FileNotFoundException e) {
//                try {
//                    db = createDatabase("db03_01", DB_VERSION, DB_MODE, null);
//                } catch (FileNotFoundException e2) {
//                    db = null;
//                }
//            }
//        }else if (v == button2){
//            if (db != null){
//                db.close();
//                dispMsg("close database", "Close Database");
//            }
//        }
    }

    private void dispMsg(String title, String msg){
//        AlertDialog.show(Test03_01.this, title, msg, "ok", false);
    }
}