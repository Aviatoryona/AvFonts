package avfont.com.aviator.aviatorfontlibrary.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Aviator on 4/22/2018. Tran
 */

public class AdapterClass extends BaseAdapter {
    private Context context;
    private String fns[];

    public AdapterClass(String[] fns, Context context) {
        this.context = context;
        this.fns = fns;
    }

    @Override
    public int getCount() {
        return fns.length;
    }

    @Override
    public Object getItem(int position) {
        return fns[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
