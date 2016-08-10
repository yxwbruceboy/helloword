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
	// ����
	String[] address = { "����", "���", "�Ϻ�", "����", "����", "�㶫", "����", "�Ĵ�" };
	ListView listview;
	List<CourceData> lists=new ArrayList<CourceData>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feral_home_page);//�����и�listview
		// ��ȡ����
		/**
		 * �ⲿ�ִ�������ʵ�ֵ���ѡ����spinnerʵ��
		 */
		spinner = (Spinner) findViewById(R.id.address);
		ArrayAdapter<String> adapterAddress = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, address);
		spinner.setAdapter(adapterAddress);
		spinner.setOnItemSelectedListener(onItemSelectedListener);
		/**
		 * �ⲿ�ִ�������������ͼ�ŵ�listview�����, ���Զ����adapterʵ��
		 */
		getData();
		listview=(ListView) findViewById(R.id.course_listview);
		ListViewAdapter listviewadapter=new ListViewAdapter(MainActivity.this,
				lists);
		listview.setAdapter(listviewadapter);
	}
	/**
	 * ��ȡ����
	 */
	private void getData() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			CourceData sourceData=new CourceData();
			sourceData.setCourseTitle("������");
			sourceData.lists.add(R.drawable.erhu+"");
			sourceData.lists.add("����ʮ����Ȥ��");
			sourceData.lists.add("�ѱ�"+(int)(Math.random()*10)+"��");
			sourceData.lists.add("���к���");
//			sourceData.lists.add("����");
//			sourceData.lists.add("Сѧ");
//			sourceData.lists.add("��"+(int)(Math.random()*10)+"��");
			lists.add(sourceData);
		}
	}

	/**
	 * spinner�ļ�����
	 */
	OnItemSelectedListener onItemSelectedListener = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> arg0, View view, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			TextView tv = (TextView) view;
			tv.setTextColor(getResources().getColor(R.color.address_color)); // ������ɫ
			tv.setTextSize(20.0f); // ���ô�С
			tv.setGravity(android.view.Gravity.CENTER); // ���þ��� 
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub

		}
	};

}
