/*
 * tweet
 *
 * Version 1.0
 *
 * Copyright 2017 Team X CMPUT 301, University of Alberta - All rights reserved. You may use, modify, and distribute this code under terms and condition of the Code of Student Behaviour at University of Alberta.
 * You may find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Main Android Activity
 *
 * @author qikai
 * @version 1.0
 */
public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav"; /* save file */
	private EditText bodyText; /* object takes input of tweet message */
	private ListView oldTweetsList; /* view of previous list of tweets */

	private ArrayList<Tweet> tweetList; /* list of tweets */
	private ArrayAdapter<Tweet> adapter; /* adapter for tweetlist */

	/** Called when the activity is first created. */
	/**
	 * Creates user interfaces for android application
	 *
	 * @param savedInstanceState
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				NormalTweet newTweet = new NormalTweet(bodyText.getText().toString());

				tweetList.add(newTweet);

				adapter.notifyDataSetChanged();

				saveInFile();
				// finish();
			}

		});

		clearButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				tweetList.clear();
				adapter.notifyDataSetChanged();
				saveInFile();
			}

		});
	}

	/**
	 * Displays user interfaces and loads previous instace states as required
	 *
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		loadFromFile();
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

    /**
     * Load last instance state
     *
     * @return
     */
	private void loadFromFile() {
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson();

			Type listType = new TypeToken<ArrayList<NormalTweet>>(){}.getType();
			tweetList = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tweetList = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}

	}

    /**
     * Save current instance state
     *
     * @return
     */
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}