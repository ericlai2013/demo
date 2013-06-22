package com.example.hellogridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	
	private final Context mContext;

	public ImageAdapter(Context c) {
		// TODO Auto-generated constructor stub
		mContext = c;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView;
		if(convertView == null){
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(100,100));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8, 8, 8, 8);
		} else {
			imageView = (ImageView) convertView;
		}
		
		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}
	
	private final Integer[] mThumbIds = {
			R.drawable.abc01, 
			R.drawable.bbc02, 
			R.drawable.canoe03, 
			R.drawable.cbc04, 
			R.drawable.cnn05, 
			R.drawable.cp24_06, 
			R.drawable.ctv07, 
			R.drawable.dailymail08, 
			R.drawable.fox09, 
			R.drawable.globeandmail10, 
			R.drawable.google11, 
			R.drawable.nationalpost12, 
			R.drawable.nbc13, 
			R.drawable.nyt14,
			R.drawable.reddit15,
			R.drawable.theh16,
			R.drawable.thestar17,
			R.drawable.ussa18
	};

}
