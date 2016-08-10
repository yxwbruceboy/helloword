package com.yuli.firstapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	Spinner spinner;
	// 地区
	String[] address = { "重庆", "天津", "上海", "湖南", "湖北", "广东", "广西", "四川" };
	ListView listview;
	List<CourceData> lists=new ArrayList<CourceData>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feral_home_page);//里面有个listview
		// 获取对象
		/**
		 * 这部分代码用来实现地区选择，用spinner实现
		 */
		spinner = (Spinner) findViewById(R.id.address);
		ArrayAdapter<String> adapterAddress = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, address);
		spinner.setAdapter(adapterAddress);
		spinner.setOnItemSelectedListener(onItemSelectedListener);
		/**
		 * 这部分代码是用来把视图放到listview里面的, 用自定义的adapter实现
		 */
		getData();
		listview=(ListView) findViewById(R.id.course_listview);
		ListViewAdapter listviewadapter=new ListViewAdapter(MainActivity.this,
				lists);
		listview.setAdapter(listviewadapter);
	}
	/**
	 * 获取数据
	 */
	private void getData() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			CourceData sourceData=new CourceData();
			sourceData.setCourseTitle("音乐类");
			sourceData.lists.add(R.drawable.erhu+"");
			sourceData.lists.add("二胡十段兴趣班");
			sourceData.lists.add("已报"+(int)(Math.random()*10)+"人");
			sourceData.lists.add("渝中汉昌");
//			sourceData.lists.add("乐器");
//			sourceData.lists.add("小学");
//			sourceData.lists.add("余"+(int)(Math.random()*10)+"天");
			lists.add(sourceData);
		}
	}

	/**
	 * spinner的监听器
	 */
	OnItemSelectedListener onItemSelectedListener = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> arg0, View view, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			TextView tv = (TextView) view;
			tv.setTextColor(getResources().getColor(R.color.address_color)); // 设置颜色
			tv.setTextSize(20.0f); // 设置大小
			tv.setGravity(android.view.Gravity.CENTER); // 设置居中 
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub

		}
	};

}
