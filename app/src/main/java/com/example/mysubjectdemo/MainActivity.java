package com.example.mysubjectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton=findViewById(R.id.bt_show);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Observable mObservable=  CreateObservable();
              Observer mObserver=CreateObserver();
              mObservable.subscribe(mObserver);
            }
        });
    }

//    //创建观察者
//    public  void CreaterSubscriber(){
//      Subscriber  mSubscriber=new Subscriber() {
//          private static final String TAG = "MainActivity";
//          @Override
//          public void onCompleted() {
//
//
//              Log.d(TAG, "onCompleted: ");
//          }
//
//          @Override
//          public void onError(Throwable e) {
//              Log.d(TAG, "onError: ");
//
//          }
//
//          @Override
//          public void onNext(Object o) {
//              Log.d(TAG, "onNext: ");
//
//          }
//
//          @Override
//          public void onStart() {
//              Log.d(TAG, "onStart: ");
//
//          }
//      };
//    }
    //创建观察者Observer
    public  Observer CreateObserver(){
        Observer<String> mObserver=new Observer<String>() {
            private static final String TAG = "MainActivity";
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted: ");

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");

            }

            @Override
            public void onNext(String s) {
                Log.d(TAG, "onNext: "+s);

            }
        };
        return mObserver;
    }

    //创建被观察者
    public  Observable  CreateObservable(){

        Observable mObservable=Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<?super String>subscriber) {
                subscriber.onNext("方法一");
                subscriber.onNext("方法二");
                subscriber.onNext("方法三");

                subscriber.onNext("方法四");

                //subscriber.onCompleted();
            }
        });

        return mObservable;
    }
//    //创建被观察者
//    public Observable CreateObservableTest(){
//        Observable mObservable=Observable.create(new Observable.OnSubscribe() {
//            @Override
//            public void call(Object o) {
//
//            }
//        });
//
//        return  mObservable;
//    }



//Scheduler 线程调度器
    public  void SchedulerTest(){
        Observable.just(1,2,3,4)
                .subscribeOn(Schedulers.io())//指定subscribe()发生在IO线程
        .observeOn(AndroidSchedulers.mainThread())//指定subscriber的回调线程
        .subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                Log.d("TAG", "call: "+integer);
            }
        });
    }
}