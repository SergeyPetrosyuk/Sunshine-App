package sunshine.serhiypetrosiuk.com.sunshine.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sunshine.serhiypetrosiuk.com.sunshine.R;
import sunshine.serhiypetrosiuk.com.sunshine.data.Email;

/**
 * Created by user on 12/16/14.
 */
public class ListViewAdapter extends BaseAdapter {

    private ArrayList<Email> emails = new ArrayList<Email>();
    private Context context = null;

    public ListViewAdapter(ArrayList<Email> emails, Context context) {
        this.emails = emails;
        this.context = context;
    }

    @Override
    public int getCount() {
        return emails.size();
    }

    @Override
    public Object getItem(int position) {
        return emails.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.forecast_list_item, parent, false);
            Integer id     = null;
            TextView email = (TextView) convertView.findViewById(R.id.email);
            TextView name  = (TextView) convertView.findViewById(R.id.name);

            ViewHolder viewHolder = new ViewHolder(id,email,name);
            convertView.setTag(viewHolder);
        }// if

        ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.id = emails.get(position).getId();
        viewHolder.email.setText(emails.get(position).getEmail().toString());
        viewHolder.name.setText(emails.get(position).getName().toString());

        return convertView;
    }

    public class ViewHolder{
        public Integer id = null;
        public TextView email = null;
        public TextView name = null;

        public ViewHolder(Integer id, TextView email, TextView name) {
            this.id = id;
            this.email = email;
            this.name = name;
        }
    }// end ViewHolder
}
