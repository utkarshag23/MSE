package com.example.utkarsh_med;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.ListView;


public class CheckListActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.checklistactivity);
		Button ab = (Button)findViewById(R.id.add);
        ab.setOnClickListener(this);
        Button ub = (Button)findViewById(R.id.update);
        ub.setOnClickListener(this);
        Button rb = (Button)findViewById(R.id.remove);
        rb.setOnClickListener(this);
        
		
		SQLiteDatabase db = openOrCreateDatabase("Pharma",MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS Medicine (Name VARCHAR, Quantity INT(3));");

		Cursor c =  db.rawQuery("SELECT * FROM Medicine", null);
		c.moveToFirst();
		
		ArrayList<String> med = new ArrayList<String>();
		while ( c.moveToNext())
		{
			String name=c.getString(c.getColumnIndex("Name"));
			Integer qty=c.getInt(c.getColumnIndex("Quantity"));
			med.add(name+"				"+qty.toString());
		}

		ListView lv = (ListView) findViewById(R.id.listView1);
		ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, med);
		lv.setAdapter(arrayAdapter1);

	
	
		db.close();
	
		
		
	}
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }

	@Override
	public void onClick(View myview) {
		// TODO Auto-generated method stub
		if(myview.getId() == R.id.add)
		{
			startActivity(new Intent(CheckListActivity.this, AddActivity.class));
		}
		else if(myview.getId() == R.id.update)
		{
			startActivity(new Intent(CheckListActivity.this, UpdateActivity.class));
		}
		else if(myview.getId() == R.id.remove)
		{
			startActivity(new Intent(CheckListActivity.this, RemoveActivity.class));
		}
		
	}
}