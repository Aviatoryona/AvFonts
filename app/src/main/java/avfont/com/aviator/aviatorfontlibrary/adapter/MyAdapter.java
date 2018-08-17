package avfont.com.aviator.aviatorfontlibrary.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import avfont.com.aviator.aviatorfontlib.AvFonts;
import avfont.com.aviator.aviatorfontlibrary.R;

/**
 * Created by Aviator on 4/22/2018.[Tranquilizer]
 */

public class MyAdapter extends BaseExpandableListAdapter {

    private String[] fns = null;
    private Context context;

    public MyAdapter(String[] fns, Context context) {
        this.fns = fns;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return fns.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return fns[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String fontName = fns[groupPosition];
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.headerview, parent);
        TextView txtV = view.findViewById(R.id.txtHeader);
        txtV.setText(fontName.replace(".ttf", ""));
        txtV.setTypeface(AvFonts.GetFont(fontName, context));
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String fontName = fns[groupPosition];
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.body, parent);
        TextView txtV = view.findViewById(R.id.txtBody);
        txtV.setText(fontName.replace(".ttf", ""));
        txtV.setTypeface(AvFonts.GetFont(fontName, context));
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
