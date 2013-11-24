package com.example.utkarsh_med;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RemoveActivity extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.removeactivity);
		Button rmb = (Button)findViewById(R.id.removebutton);
		rmb.setOnClickListener(this);
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
		String medname =  medit.getText().toString();
		
		
		SQLiteDatabase db = openOrCreateDatabase("Pharma",MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS Medicine (Name VARCHAR, Quantity INT(3));");
		Cursor c =  db.rawQuery("SELECT * FROM Medicine", null);
		c.moveToFirst();
		do
		{
			if ( c.getString(c.getColumnIndex("Name")).contentEquals(medname) )
			{
				String name  = c.getString(c.getColumnIndex("Name"));
				db.delete("medicine", "name="+"'"+name+"'", null);
				new AlertDialog.Builder(this)
			    .setTitle("Remove")
			    .setMessage("Medicine Removed!!!, click thank you to proceed");
				Toast toast = Toast.makeText(RemoveActivity.this, "Record Deleted", Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER, 0, 0);
				toast.show();
			    startActivity(new Intent(RemoveActivity.this, MainActivity.class));
			}

			
		}
		while(c.moveToNext());
		startActivity(new Intent(RemoveActivity.this, MainActivity.class));
	}

}
