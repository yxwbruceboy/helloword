package com.yuli.firstapp;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TableLayout.LayoutParams;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter{
		List<CourceData> lists;//用来存放类的lists
		Context context;
		LayoutInflater inflater;
		public ListViewAdapter(){}
		public ListViewAdapter(Context context,List<CourceData> lists){
			this.context=context;
			this.lists=lists;
			inflater=LayoutInflater.from(context);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return lists.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return lists.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			if(convertView==null){
				convertView=inflater.inflate(R.layout.course_detail, null);
			}
			TextView textview=(TextView) convertView.findViewById(R.id.cource_title);
			CourceData sourceData=lists.get(position);
			textview.setText(sourceData.getCourseTitle());
			GridView gridView=(GridView) convertView.findViewById(R.id.course_gridview);
			ArrayAdapter<String> adapter=new ArrayAdapter<String>(context,R.layout.course,R.id.course_name,sourceData.getLists());
			gridView.setAdapter(adapter);
			gridView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,500));
			return convertView;
		}}
