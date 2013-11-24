package com.example.utkarsh_med;

import android.app.Activity;
import android.content.ContentValues;
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

public class UpdateActivity extends Activity  implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.updateactivity);
		Button updb = (Button)findViewById(R.id.updatebutton);
		updb.setOnClickListener(this);
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
		EditText medit = (EditText)findViewById(R.id.editname);
		EditText qedit = (EditText)findViewById(R.id.editquantity);
		String medname =  medit.getText().toString();
		Integer medqty =  Integer.valueOf(qedit.getText().toString());
		
		SQLiteDatabase db = openOrCreateDatabase("Pharma",MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS Medicine (Name VARCHAR, Quantity INT(3));");
		Cursor c =  db.rawQuery("SELECT * FROM Medicine", null);
		c.moveToFirst();
		do
		{
			if ( c.getString(c.getColumnIndex("Name")).contentEquals(medname) )
			{
				//Integer qty = c.getInt(c.getColumnIndex("Quantity"));
				String name = c.getString(c.getColumnIndex("Name"));
				
				ContentValues values = new ContentValues();
			
				values.put("quantity",Integer.valueOf(medqty).toString());

				db.update("Medicine",values,"name="+"'"+name+"'",null);
				Toast toast = Toast.makeText(UpdateActivity.this, "Record Updated", Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER, 0, 0);
				toast.show();
				startActivity(new Intent(UpdateActivity.this, MainActivity.class));
				
			}

			
		}
		
		while(c.moveToNext());
		startActivity(new Intent(UpdateActivity.this, MainActivity.class));
		
	}
	

}
