package com.poker.test;

import java.util.Arrays;

import android.util.Log;

import com.poker.RuleType;
import com.poker.cardType;
import com.poker.cardinfo;

public class cardGen {

	private static final String Tag = cardGen.class.getSimpleName();

	class cardsetInfo {
		cardinfo m_cinfo[];
		int m_total;
	};

	private cardsetInfo mCS[];

	private cardinfo cInfo[][] = {
			{ new cardinfo(cardType.CLUB, 1), new cardinfo(cardType.CLUB, 6) },
			{ new cardinfo(cardType.CLUB, 1), new cardinfo(cardType.CLUB, 3), new cardinfo(cardType.CLUB, 12) },
			{ new cardinfo(cardType.CLUB, 10), new cardinfo(cardType.CLUB, 7), new cardinfo(cardType.CLUB, 6) },
			{ new cardinfo(cardType.CLUB, 5), new cardinfo(cardType.CLUB, 7), new cardinfo(cardType.CLUB, 9) },
			{ new cardinfo(cardType.CLUB, 1), new cardinfo(cardType.SPADE, 1), new cardinfo(cardType.CLUB, 5),
					new cardinfo(cardType.CLUB, 11) } };

	private int m_result[][] = { { -1, 17, 17 }, { -1, 16, 16 },
			{ -1, 17, 23 }, { -1, 21, 21 }, { -1, 18, 18 } };

	RuleType m_rType;

	public cardGen(RuleType rType) {
		// TODO Auto-generated constructor stub
		Log.d(Tag, "constructor begin");
		mCS = new cardsetInfo[cInfo.length];
		for (int i = 0; i < cInfo.length; i++) {
			mCS[i] = new cardsetInfo();
			mCS[i].m_cinfo = new cardinfo[cInfo[i].length];
			System.arraycopy(cInfo[i], 0, mCS[i].m_cinfo, 0, cInfo[i].length);
			mCS[i].m_total = m_result[i][rType.ordinal()];
		}
		Log.d(Tag, "constructor end");

	}

	public int getNumCardSet() {
		return mCS.length;
	}

	public cardinfo[] getCardSet(int ntrial) {
		Log.d(Tag, "getCardSet #" + ntrial);
		if (ntrial < 0 && ntrial > mCS.length) {
			return null;
		}
		return mCS[ntrial].m_cinfo;
	}

	public int getPredefinedTotal(int ntrial) {
		return mCS[ntrial].m_total;
	}

}
