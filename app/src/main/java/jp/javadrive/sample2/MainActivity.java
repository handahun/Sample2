package jp.javadrive.sample2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

        sqliteHelper helper = new sqliteHelper(this);
        SQLiteDatabase db = helper.getReadableDatabase();

        Cursor c = db.query("person_table", new String[] { "name", "age" },
                null, null, null, null, null);
        boolean isEof = c.moveToFirst();
        while (isEof) {
            TextView tv = new TextView(this);
            tv.setText(String.format("%s : %d才", c.getString(0), c.getInt(1)));
            isEof = c.moveToNext();
            layout.addView(tv);
        }
        //編集テスト
        //編集テスト
        c.close();

        db.close();
    }
}
