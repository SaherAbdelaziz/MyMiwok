package com.mymiwok.mymiwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersFragment extends Fragment {

    MediaPlayer mMediaPlayer ;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer() ;
        }
    };

    public NumbersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one" , "Lutti" , R.drawable.number_one , R.raw.number_one));
        words.add(new Word("two" ,"otiiko" , R.drawable.number_two , R.raw.number_two));
        words.add(new Word("three" , "tolookosu" , R.drawable.number_three , R.raw.number_three));
        words.add(new Word("four" , "oyyisa" , R.drawable.number_four , R.raw.number_four));
        words.add(new Word("five" , "massokka" , R.drawable.number_five , R.raw.number_five));
        words.add(new Word("six" , "temmokka" , R.drawable.number_six , R.raw.number_six));
        words.add(new Word("seven" , "kenekaku" , R.drawable.number_seven , R.raw.number_seven));
        words.add(new Word("eight" , "kawinta" , R.drawable.number_eight , R.raw.number_eight));
        words.add(new Word("nine" , "wo’e" , R.drawable.number_nine , R.raw.number_nine));
        words.add(new Word("ten" , "na’aacha" , R.drawable.number_ten , R.raw.number_ten));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words , R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i) ;
                releaseMediaPlayer() ;

                mMediaPlayer = MediaPlayer.create(getActivity() , word.getAudioID()) ;
                mMediaPlayer.start();
                // release data
                mMediaPlayer.setOnCompletionListener(mCompletionListener );

            }
        });

        return rootView ;
    }


    @Override
    public void onStop() {
        super.onStop();

        // onstop release mediaPlayer
        releaseMediaPlayer() ;
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

        }
    }
}
