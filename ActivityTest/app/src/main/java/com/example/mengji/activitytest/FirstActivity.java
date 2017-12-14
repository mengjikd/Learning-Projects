package com.example.mengji.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);// 调用setContentView（）方法给当前Activity加载一个布局
        Button button1 = (Button) findViewById(R.id.button_1);//通过findViewById（）方法获取在布局文件定义的元素
        button1.setOnClickListener(new View.OnClickListener(){
            //调用setOnClickListener（）方法给按钮注册一个监听器，点击按钮执行onClick（）方法
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:10086"));//data部分指定了协议是tel
                startActivity(intent);
                /*Intent intent=new Intent(Intent.ACTION_VIEW);//指定intent的action是Intent.ACTION_VIEW
                intent.setData(Uri.parse("http://www.baidu.com"));//通过Uri.parse()方法将一个网址字符串解析成Uri对象，在通过setData()方法将这个Uri对象传递过去
                startActivity(intent);*/
                /*Intent intent=new Intent("com.example.activitytest.ACTION_START");//启动并响应配置里声明的action活动
                intent.addCategory("com.example.activitytest.MY_CATEGORY");//每个intent只能指定一个action却能指定多个category，这是一个新的
                startActivity(intent);*/
                /*Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);//创建一个intent，以FirstActivity.this为上下文，econdActivity.class作为目标Activity*/
                /*Toast.makeText(FirstActivity.this,"You clicked Button 1",
                        Toast.LENGTH_SHORT).show();//通过静态方法makeText（）创建一个Toast对象然后调用show（）显示；三个参数分别是活动对象、文本内容、显示时长*/
                //finish();//销毁活动
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);//通过getMenuInflater()方法得到Menuflater对象，调用inflate（）方法创建；两个参数分别是资源文件，Menu对象
        return true;//返回true，如果返回false将无法显示
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //调用item.getItemId（）判断我们点击的是哪个菜单
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
