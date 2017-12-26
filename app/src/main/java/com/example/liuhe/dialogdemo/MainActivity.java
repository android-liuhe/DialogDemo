package com.example.liuhe.dialogdemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startOne;
    private Button startTwo;
    private Button startThree;
    private Button startFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startOne = findViewById(R.id.startone);
        startTwo = findViewById(R.id.starttwo);
        startThree = findViewById(R.id.startthree);
        startFour = findViewById(R.id.startfour);
        startOne.setOnClickListener(this);
        startTwo.setOnClickListener(this);
        startThree.setOnClickListener(this);
        startFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.startone:
                startSimpleDialog();
                break;
            case R.id.starttwo:
                startItemDialog();
                break;
            case R.id.startthree:
                startSingleDialog();
                break;
            case R.id.startfour:
                startMultiDialog();
                break;
            default:
                break;
        }
    }

    /**
     * 启动一个简单的Dialog
     */
    private void startSimpleDialog(){

        AlertDialog simpleDialog = new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("测试数据")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
                    }
                }).create();
        simpleDialog.show();

    }

    /**
     * 启动一个列表Dialog
     */
    private void startItemDialog(){

        final String[] str = {"测试数据1", "测试数据2", "测试数据3", "测试数据4"};
        AlertDialog itemDialog = new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.mipmap.ic_launcher)
                .setItems(str, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "您选择的是：" + str[i], Toast.LENGTH_SHORT).show();
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
                    }
                }).create();
        itemDialog.show();

    }

    /**
     * 单选列表框的Dialog
     */
    private void startSingleDialog(){

        final String[] str = {"测试数据1", "测试数据2", "测试数据3", "测试数据4"};
        AlertDialog singleDialog = new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.mipmap.ic_launcher)
                .setSingleChoiceItems(str, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "您选择的是：" + str[i], Toast.LENGTH_SHORT).show();
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
                    }
                }).create();
        singleDialog.show();
    }

    /**
     * 多选列表框的Dialog
     */
    private void startMultiDialog(){

        // setMultiChoiceItems() 的第二个参数必须为boolean， 不能使Boolean
        final String[] str = {"测试数据1", "测试数据2", "测试数据3", "测试数据4"};
        final boolean[] booleans = {false, true, false, true};
        AlertDialog multiDialog = new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.mipmap.ic_launcher)
                .setMultiChoiceItems(str, booleans, null)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
                    }
                }).create();



        multiDialog.show();
    }
}
