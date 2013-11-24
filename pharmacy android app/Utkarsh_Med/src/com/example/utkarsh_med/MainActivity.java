package com.example.utkarsh_med;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements android.view.View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cl = (Button)findViewById(R.id.CheckList);
        cl.setOnClickListener(this);
        Button po = (Button)findViewById(R.id.PlaceOrder);
        po.setOnClickListener(this);
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
		if(myview.getId() == R.id.CheckList)
		{
			startActivity(new Intent(MainActivity.this, CheckListActivity.class));
		}
		else if(myview.getId() == R.id.PlaceOrder)
		{

			startActivity(new Intent(MainActivity.this, PlaceOrderActivity.class));	
		}
		
	}

	
    
    
}
