package com.example.utkarsh_med;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PlaceOrderActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.placeorderactivity);
		Button mail = (Button)findViewById(R.id.mailbutton);
        mail.setOnClickListener(this);
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
		String medname =  medit.getText().toString();
		Integer medqty =  Integer.valueOf(qedit.getText().toString());
		
		String body = "Medicine :" + medname + "\n\nQuantity :" + medqty ;
		
	
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        String[] recipients = new String[]{"", "",};
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Placing Order");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,body);
        emailIntent.setType("text/plain");
        startActivity(Intent.createChooser(emailIntent, "Send mail client :"));
        finish();
		
	}

}
