package sunshine.serhiypetrosiuk.com.sunshine;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import sunshine.serhiypetrosiuk.com.sunshine.Fragments.ForecastFragment;
import sunshine.serhiypetrosiuk.com.sunshine.adapter.ListViewAdapter;
import sunshine.serhiypetrosiuk.com.sunshine.data.Email;
import sunshine.serhiypetrosiuk.com.sunshine.data.EmailsGenerator;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ForecastFragment())
                    .commit();
        }
    }
}
