package sunshine.serhiypetrosiuk.com.sunshine.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import sunshine.serhiypetrosiuk.com.sunshine.R;
import sunshine.serhiypetrosiuk.com.sunshine.adapter.ListViewAdapter;
import sunshine.serhiypetrosiuk.com.sunshine.data.Email;
import sunshine.serhiypetrosiuk.com.sunshine.data.EmailsGenerator;

/**
 * Created by user on 1/9/15.
 */
public class ForecastFragment extends Fragment{

    public ForecastFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.emails_list_view);
        ArrayList<Email> emails = EmailsGenerator.getEmails(15);
        ListViewAdapter listViewAdapter = new ListViewAdapter(emails, getActivity());

        listView.setAdapter(listViewAdapter);

        return rootView;
    }
}
