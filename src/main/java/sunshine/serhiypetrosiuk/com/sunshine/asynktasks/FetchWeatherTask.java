package sunshine.serhiypetrosiuk.com.sunshine.asynktasks;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.net.HttpURLConnection;

/**
 * Created by user on 1/9/15.
 */
public class FetchWeatherTask extends AsyncTask<Void, Void, Void> {

    @Override
    protected Void doInBackground(Void... params) {

        HttpURLConnection urlConnection  = null;
        BufferedReader    bufferedReader = null;

        // Will contain the JSON string
        String forecastJsonStr = null;

        
        return null;
    }
}
