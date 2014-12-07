package com.example.loadedquestions;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;






public class MainActivity extends Activity {
	
	
	
	
	protected static final String[][] String = null;
	Button mButton1;
	Button mButton2;
	Button mButton3;
	EditText mEditText1;
	EditText mEditText2;
	TextView mText;
	//implementing usernames
	/*
	String[] playerNames;
	*/
	
	public void makeFirstVisible(){
		
		mText = (TextView)findViewById(R.id.textView1);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView2);
		mText.setVisibility(View.INVISIBLE);
		
		mEditText1 = (EditText)findViewById(R.id.editText1);
		mEditText1.setVisibility(View.INVISIBLE);
		
		mEditText2 = (EditText)findViewById(R.id.editText2);
		mEditText2.setVisibility(View.INVISIBLE);
		
	}
	
	//Create an array full of questions
    final String[] myQuestions = {
    		"What is your morning routine like?",
    		"If you could travel anywhere, where would it be?",
    		"What is your favorite dessert?",
    		"What was the worst mood you were in today?",
    		"When is your ideal time to take a nap?",
    		"Is there anywhere else you'd rather be right now? If yes, then where?",
    		"Who do you regret meeting most in life?",
    		"What is your super power?",
    		"What is the most painful thing that ever happened to you, emotionally or physically?"
    };	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // Set OnClickListner to the login button 
        //mkae vsible
        
        final TextView textOne = (TextView) findViewById(R.id.textView3);
        final TextView textTwo = (TextView) findViewById(R.id.textView4);
        Button pushMe = (Button) findViewById(R.id.button1);
        
        //When button clicked, randomly pull an element from array 
        pushMe.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Randomly generates one element out of the nine of the string each time button is pressed
				int rando = (int) (Math.random() * 9);
				textOne.setText(myQuestions[rando]);
				textTwo.setText("The Question Is...");
			}
		});
    	
      makeFirstVisible();
        mButton2 = (Button)findViewById(R.id.button2);
        mButton3 = (Button)findViewById(R.id.button3);
        
        
        
        
        mButton2.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		//player names
        		
        	
        		
        		
        		mEditText1 = (EditText)findViewById(R.id.editText1);
        		mText = (TextView)findViewById(R.id.textView1);
        		     		
        		/*int test = Integer.parseInt(mEditText1.getText().toString());*/
        		
        		/*mText.setText("There are "+test+" players!");*/
        		
        		mText = (TextView)findViewById(R.id.textView1);
        		mText.setText("There are "+mEditText1.getText().toString()+" players!");
      
        		
        		/*getPreferences(test);
        		onetotwo.putExtra("players", test);*/
        		
        	}
        });
        
        mButton3.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		mEditText2 = (EditText)findViewById(R.id.editText2);
        		mText = (TextView)findViewById(R.id.textView2);
        		
        		mText.setText("There will be "+mEditText2.getText().toString()+" rounds!");
        	}
        });
        
        final Button button1 = (Button) findViewById(R.id.button1);
        
        button1.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				mText = (TextView)findViewById(R.id.textView1);
				mText.setVisibility(View.INVISIBLE);
				
				mText = (TextView)findViewById(R.id.textView2);
        		mText.setVisibility(View.INVISIBLE);
        		
        		mEditText1 = (EditText)findViewById(R.id.editText1);
        		mEditText1.setVisibility(View.INVISIBLE);
        		
        		mEditText2 = (EditText)findViewById(R.id.editText2);
        		mEditText2.setVisibility(View.INVISIBLE);
        		
        		
				
        		
        		
				
				/*tent i = new Intent(getApplicationContext(), Activity2.class);
        		i.putExtra("player", mEditText1.getText().toString());*/
        		/*startActivity(new Intent(MainActivity.this, Activity2.class));*/
				/*startActivity(onetotwo);*/				
			}
		});
    }
    



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
	

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
