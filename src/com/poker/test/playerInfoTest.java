package com.poker.test;

import org.junit.Test;

import android.test.InstrumentationTestCase;
import android.util.Log;

import com.poker.card_value;
import com.poker.cardinfo;
import com.poker.playerInfo;
import com.poker.RuleType;

public class playerInfoTest extends	InstrumentationTestCase
{

	private static final String Tag = playerInfoTest.class.getSimpleName();

	public playerInfoTest()  {
		// TODO Auto-generated constructor stub		
	}
	
	@Override
	protected void runTest() throws Exception
	{
		try {
			super.runTest();
		} 
		
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.i(Tag, "runTest");

	}
	
	
	private void playCardGame(RuleType rtype)
	{
		playerInfo pInfo = (playerInfo) new playerInfo(rtype); 
		cardGen cgen = new cardGen(rtype);		
		int num_set = cgen.getNumCardSet();
		cardinfo cInfo[];		
		
		for (int i=0; i<num_set; i++)
		{
			Log.i(Tag, " test # " + i);
			pInfo.cardCleanup();
			cInfo = cgen.getCardSet(i);
			for (int j=0; j<cInfo.length; j++)
			{
				pInfo.addcard(cInfo[j]);
			}
			Log.i(Tag, "card total (" + cgen.getPredefinedTotal(i) + ")=" + pInfo.getCardTotal());
		}
	}


	public void testPlayer()
	{
		Log.i(Tag, "testPlayer");
		playCardGame(RuleType.PLAYER);

	}
	

	public void testDealer()
	{
		Log.i(Tag, "testDealer");
		playCardGame(RuleType.DEALER);
	}
	
	public void testRun3()
	{
		Log.i(Tag, "testRun3");		
	}
	
}
