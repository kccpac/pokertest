package com.poker.test;

import com.poker.BlackJackActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class BlackJackActivityTest extends
	ActivityInstrumentationTestCase2<BlackJackActivity> {

	private static final String Tag = BlackJackActivityTest.class.getSimpleName();

	public BlackJackActivityTest() {
		// TODO Auto-generated constructor stub
		super(BlackJackActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();		
	}
	
	public void testAddValues() {
		Log.i(Tag, "testAddValues");
	}
	
	

}
