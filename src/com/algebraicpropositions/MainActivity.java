package com.algebraicpropositions;

import com.algebraicpropositions.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.SearchManager;

import android.view.View;
import android.view.Menu;
import android.view.MenuInflater;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.SearchView;
import android.widget.AdapterView.OnItemClickListener;

import android.content.Context;
import android.content.Intent;

public class MainActivity extends Activity {
	
	ArrayAdapter<String> myAdapter;
    //stores prop. names
	ListView listView;

	//string passed to PropActivity
	public final static String ITEM_CLICKED = "com.algebraicpropositions.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    	
    	String[] dataArray = {getString(R.string.prop1), getString(R.string.prop2), getString(R.string.prop3),
    			 getString(R.string.prop4), getString(R.string.prop5), getString(R.string.prop6),
    			 getString(R.string.prop7), getString(R.string.prop8), getString(R.string.prop9),  
    			 getString(R.string.prop10), getString(R.string.prop11), getString(R.string.prop12),   
    			 getString(R.string.prop13), getString(R.string.prop14), getString(R.string.prop15),
    			 getString(R.string.prop16), getString(R.string.prop17), getString(R.string.prop18),
    			 getString(R.string.prop19), getString(R.string.prop20), getString(R.string.prop21),   
    			 getString(R.string.prop22), getString(R.string.prop23), getString(R.string.prop24),
    			 getString(R.string.prop25), getString(R.string.prop26), getString(R.string.prop27),
    			 getString(R.string.prop28), getString(R.string.prop29), getString(R.string.prop30),
    			 getString(R.string.prop31), getString(R.string.prop32), getString(R.string.prop33),
    			 getString(R.string.prop34)};
    	 
    	listView = (ListView) findViewById(R.id.listview);
	    myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataArray);
	    listView.setAdapter(myAdapter);
	    listView.setTextFilterEnabled(true);
	    final Intent intent = new Intent(this, PropActivity.class);
	    
	    	listView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
		
					int itemNum = arg2 + 1;
					
					intent.putExtra(ITEM_CLICKED, itemNum);
					startActivity(intent);
				}
	    	});
	}
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.main, menu);
			
			SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
			SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
			
			searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
			searchView.setIconifiedByDefault(false);   
			
			SearchView.OnQueryTextListener textChangeListener = new SearchView.OnQueryTextListener() {
				
				@Override
				public boolean onQueryTextChange(String newText) {
					// this is your adapter that will be filtered
					myAdapter.getFilter().filter(newText);
					return true;
		        }
				
				@Override
				public boolean onQueryTextSubmit(String query) {
					// this is your adapter that will be filtered
		            myAdapter.getFilter().filter(query);
		            return true;
		        }
		   };
		        searchView.setOnQueryTextListener(textChangeListener);

		        return super.onCreateOptionsMenu(menu);   
	}
}
