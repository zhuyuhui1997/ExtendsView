package zyh.example.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SampleView(this));

    }
}
    //onClicklistener是一个接口,不能实例化,这就是一个匿名内部类,这个类实现onClickListener
       //然后被new 了,无形中传了一个对象进去,这个对象给了button/TextView中的mOnClicklistener,就是这家伙调用了onClick方法
//当然要是Activity实现了这个接口,就可以setonClickListener(this)
//this是当前类的一个对象
//传进去一个Activity对象给monclickListener,就是一个接口引用指向Activity对象,不过接口引用只能调用自己的方法