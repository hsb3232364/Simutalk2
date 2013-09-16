package com.ztspeech.simutalk2.data.view;



import com.ztspeech.simutalk2.data.DataObject;
import com.ztspeech.simutalk2.data.view.ViewItemEvent.OnListViewItemClickListener;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;


public abstract class ListViewItem  extends LinearLayout  implements OnClickListener {

	private OnListViewItemClickListener mClickListener = null;
	
	public void setOnListViewItemClickListener(OnListViewItemClickListener listener) {
		
		mClickListener = listener;
	}
	
	protected void doClickListener(int event, long id){
		
		if(mClickListener != null){
			
			mClickListener.OnListViewItemClick(event, id);
		}
	}

	public ListViewItem(Context context) {
				
		super(context);	
	}
	
	
	public abstract void onClick(View v) ;	
	public abstract void setData(DataObject obj );

	

}
