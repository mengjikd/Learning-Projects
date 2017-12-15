package com.example.mengji.activitytest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity","Task id is"+getTaskId());
        Log.d("SecondActivity",this.toString());
        setContentView(R.layout.second_layout);
        /*Intent intent = getIntent();//通过getIntent()启动intent
        String data = intent.getStringExtra("extra_data");//因为是字符串所以用getStringExtra()如果是整型用getIntExtra()以此类推
        Log.d("SecondActivity",data);*/
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //singleInstance点击进入第三个活动
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
                //singleTop点击按钮进入第一个活动
                /*Intent intent = new Intent(SecondActivity.this,FirstActivity.class);
                startActivity(intent);*/
                //传递给前一个活动
                /*Intent intent = new Intent();
                intent.putExtra("data_return","Hello FirstActivity");
                setResult(RESULT_OK,intent);//调用setResult()向上一个活动返回数据,两个参数第一个返回处理结果,
                finish();//销毁当前活动*/
            }
        });
    }
    //用户点击Back键也会显示数据
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello FirstActivity");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","onDestroy");
    }
    //传递两个字符串（没有成功显示）
    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }

}
