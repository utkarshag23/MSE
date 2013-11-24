package com.example.utkarsh_med;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addactivity);
		Button addb = (Button)findViewById(R.id.addbutton);
        addb.setOnClickListener(this);
	}
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		EditText medit = (EditText)findViewById(R.id.editname);
		EditText qedit = (EditText)findViewById(R.id.editquantity);
		String name =  medit.getText().toString();
		Integer qty =  Integer.valueOf(qedit.getText().toString());
		
		SQLiteDatabase db = openOrCreateDatabase("Pharma",MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS Medicine (Name VARCHAR, Quantity INT);");
		
		ContentValues values =new ContentValues();
		values.put("name", name);
		values.put("quantity", qty);
		db.insert("Medicine", null, values);
		Toast toast = Toast.makeText(AddActivity.this, "Record Added", Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
		startActivity(new Intent(AddActivity.this, MainActivity.class));
		

		
	}

}
