package com.app.fernaliahalim.movlife;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    ImageView image_id;
    TextView text_title;
    TextView text_director;
    TextView text_writer;
    TextView text_desc;
    TextView text_detail_rated;

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        image_id = (ImageView) rootView.findViewById(R.id.image_id);
        text_title = (TextView) rootView.findViewById(R.id.txt_title);
        text_director = (TextView) rootView.findViewById(R.id.txt_director);
        text_writer = (TextView) rootView.findViewById(R.id.txt_writer);
        text_desc = (TextView) rootView.findViewById(R.id.txt_desc);
        text_detail_rated = (TextView) rootView.findViewById(R.id.txt_detail_rated);

        image_id.setImageResource(R.drawable.header_1);
        text_title.setText("Moana");
        text_director.setText(": Ron Clements, Don Hall");
        text_writer.setText(": Jared Bush, Ron Clements");
        text_detail_rated.setText("7.89");
        text_desc.setText("In Ancient Polynesia, when a terrible curse incurred by Maui reaches an impetuous Chieftain's daughter's island, she answers the Ocean's call to seek out the demigod to set things right.");

        return rootView;
    }
}
