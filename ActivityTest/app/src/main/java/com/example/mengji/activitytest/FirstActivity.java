package com.example.mengji.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity","Task id is"+getTaskId());//打印返回栈id
        Log.d("FirstActivity",this.toString());
        setContentView(R.layout.first_layout);// 调用setContentView（）方法给当前Activity加载一个布局
        Button button1 = (Button) findViewById(R.id.button_1);//通过findViewById（）方法获取在布局文件定义的元素
        button1.setOnClickListener(new View.OnClickListener(){
            //调用setOnClickListener（）方法给按钮注册一个监听器，点击按钮执行onClick（）方法
            @Override
            public void onClick(View v) {
                //启动SecondActivity(没有成功显示)
                SecondActivity.actionStart(FirstActivity.this,"data1","data2");
                //singleTop模式第一个活动跳到第二个活动
                /*Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);*/
                //standard模式
                /*Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
                startActivity(intent);*/
                //传递数据给上一个活动
                /*Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);//用这个方法接收两个参数一个是intent另一个是请求码*/
                //隐式Intent拨打号码
                /*Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:10086"));//data部分指定了协议是tel
                startActivity(intent);*/
                //隐式Intent显示网页
                /*Intent intent=new Intent(Intent.ACTION_VIEW);//指定intent的action是Intent.ACTION_VIEW
                intent.setData(Uri.parse("http://www.baidu.com"));//通过Uri.parse()方法将一个网址字符串解析成Uri对象，在通过setData()方法将这个Uri对象传递过去
                startActivity(intent);*/
                //隐式Intent
                /*Intent intent=new Intent("com.example.activitytest.ACTION_START");//启动并响应配置里声明的action活动
                intent.addCategory("com.example.activitytest.MY_CATEGORY");//每个intent只能指定一个action却能指定多个category，这是一个新的
                startActivity(intent);*/
                //显式Intent传递数据
                /*String data="Hello SecondActivity";
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);//创建一个intent，以FirstActivity.this为上下文，econdActivity.class作为目标Activity
                intent.putExtra("extra_data",data);//用putExtra()方法接收两个参数第一个是键，
                startActivity(intent);*/
                //显示Toast文本内容
                /*Toast.makeText(FirstActivity.this,"You clicked Button 1",
                        Toast.LENGTH_SHORT).show();//通过静态方法makeText（）创建一个Toast对象然后调用show（）显示；三个参数分别是活动对象、文本内容、显示时长*/
                //finish();//销毁活动
            }
        });
    }
    //信息返回第一个活动
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {//第一个是请求码,第二个是处理结果,
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String returndData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returndData);
                }
                break;
            default:
        }
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

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FirstActivity","onRestart");
    }
}
