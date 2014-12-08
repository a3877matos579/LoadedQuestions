package com.example.loadedquestions;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;






public class MainActivity extends Activity {
	
	int numPlayers;
	int numRounds;
	int state;
	int turn = 0;
	String[] answers;
	
	
	
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
	
    private String[] toppings;{
    	toppings = new String[20];
    	toppings[0] = "Cheese";
    	}
	
	protected static final String[][] String = null;
	Button mButton1;
	Button mButton2;
	Button mButton3;
	Button mButton4;
	Button mButton5;
	EditText mEditText1;
	EditText mEditText2;
	EditText mEditText3;
	TextView mText;
	//implementing usernames
	/*
	String[] playerNames;
	*/
	
	
	
	
	
	
	public void makeAllInvisible(){
		mText = (TextView)findViewById(R.id.textView1);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView2);
		mText.setVisibility(View.INVISIBLE);
		
		mEditText1 = (EditText)findViewById(R.id.editText1);
		mEditText1.setVisibility(View.INVISIBLE);
		
		mEditText2 = (EditText)findViewById(R.id.editText2);
		mEditText2.setVisibility(View.INVISIBLE);
		
		mEditText3 = (EditText)findViewById(R.id.editText3);
		mEditText3.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView3);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView4);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView5);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView6);
		mText.setVisibility(View.INVISIBLE);
	
		mButton1 = (Button)findViewById(R.id.button1);
		mButton1.setVisibility(View.INVISIBLE);
		
		mButton2 = (Button)findViewById(R.id.button2);
		mButton2.setVisibility(View.INVISIBLE);
		
		mButton3 = (Button)findViewById(R.id.button3);
		mButton3.setVisibility(View.INVISIBLE);
		
		mButton4 = (Button)findViewById(R.id.button4);
		mButton4.setVisibility(View.INVISIBLE);
		
		
		
	}
	public void makeFirstVisible(){
		
		state = 1;
		
		mText = (TextView)findViewById(R.id.textView1);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView2);
		mText.setVisibility(View.VISIBLE);
		
		mEditText1 = (EditText)findViewById(R.id.editText1);
		mEditText1.setVisibility(View.VISIBLE);
		
		mEditText2 = (EditText)findViewById(R.id.editText2);
		mEditText2.setVisibility(View.VISIBLE);
		
		mButton1 = (Button)findViewById(R.id.button1);
		mButton1.setVisibility(View.VISIBLE);
		
		mButton2 = (Button)findViewById(R.id.button2);
		mButton2.setVisibility(View.VISIBLE);
		
		mButton3 = (Button)findViewById(R.id.button3);
		mButton3.setVisibility(View.VISIBLE);
		
	}
	
	public void makeSecondVisible(){
		
		state = 2;
		
		mText = (TextView)findViewById(R.id.textView3);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView4);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView5);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView6);
		mText.setVisibility(View.VISIBLE);
		
		mEditText3 = (EditText)findViewById(R.id.editText3);
		mEditText3.setVisibility(View.VISIBLE);
		
		mButton4 = (Button)findViewById(R.id.button4);
		mButton4.setVisibility(View.VISIBLE);
		
		
		
	}
	
	public void makeThirdVisible(){
		
		
	}
	
	
	
	
	
	
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // Set OnClickListner to the login button 
        //make visible
      makeAllInvisible();
      makeFirstVisible();
      
      
      
        mButton1 = (Button)findViewById(R.id.button1);
        mButton2 = (Button)findViewById(R.id.button2);
        mButton3 = (Button)findViewById(R.id.button3);
        
        
        
        
        mButton2.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		
        		
        		//player names
        		
        	
        		
        		
        		
        		
        		
        		
        		mEditText1 = (EditText)findViewById(R.id.editText1);
        		
        		mText = (TextView)findViewById(R.id.textView5);
        		     		
        		numPlayers = Integer.parseInt(mEditText1.getText().toString());
        		
        		
        		mText.setText("Player "+(turn + 1)+" ");
        		
        		mText = (TextView)findViewById(R.id.textView1);
        		mText.setText("There are "+mEditText1.getText().toString()+" players!");
        		
        		answers = new String[numPlayers];
        		
        		
      
        		
        		/*getPreferences(test);
        		onetotwo.putExtra("players", test);*/
        		
        	}
        });
        
        mButton3.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
       	
        		mEditText2 = (EditText)findViewById(R.id.editText2);
        		mText = (TextView)findViewById(R.id.textView6);
        		numRounds = Integer.parseInt(mEditText2.getText().toString());
        		mText = (TextView)findViewById(R.id.textView2);
        		mText.setText("Round "+numRounds+" ");

        		
        		
      
        	}
        });
        
        mButton4.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		
        		
        		mEditText3 = (EditText)findViewById(R.id.editText3);
        		answers[turn] = mEditText3.getText().toString();
        		
        		turn++;
        		
        		mText = (TextView)findViewById(R.id.textView5); 
        		mText.setText("Player "+(turn + 1)+" ");
        		
        		mEditText3.setText("");
        		
        		if(turn == numPlayers){
        			makeAllInvisible();
        			makeThirdVisible();
        		}
        		
        		
        		
        		
        		
        		
        		
        		 
        		
        		
        		
        		
        		
        	}
        });
        
        mButton1.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				
				
        		
				makeAllInvisible();
			    makeSecondVisible();
				
				
					//makeSecondVisible(i);
				 
				//Randomly generates one element out of the nine of the string each time button is pressed
				mText = (TextView)findViewById(R.id.textView3);
        		int rando = (int) (Math.random() * 9);
				mText.setText(myQuestions[rando]);
				
			
				
        		
        		
				
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
