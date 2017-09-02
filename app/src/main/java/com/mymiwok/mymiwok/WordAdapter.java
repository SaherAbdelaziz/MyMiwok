package com.mymiwok.mymiwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SaherOs on 8/31/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorResourceId ;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {

        super(context, 0, words);
        mcolorResourceId = colorResourceId ;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord =  getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwok_text_view = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwok_text_view.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView default_text_view = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        default_text_view.setText(currentWord.getDefaultTranslation());

        // Find the Imageview in the list_item.xml layout with the ID image
        ImageView ImageID = (ImageView) listItemView.findViewById(R.id.image);
        // get the image resource from current word
        if(currentWord.hasImage()==true) {
            ImageID.setImageResource(currentWord.getImageID());
            ImageID.setVisibility(View.VISIBLE) ;
        }
        else{
            ImageID.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.container);

        int color = ContextCompat.getColor(getContext() , mcolorResourceId) ;

        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

