package com.example.mengji.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mengji on 2017/12/15.
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();//通过list来暂存活动

    public static void addActivity(Activity activity){//通过addActivity()向list添加活动
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){//通过removeActivity()从list移除活动
        activities.remove(activity);
    }
    //销毁所有活动
    public static void finishALL(){
        for (Activity activity : activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
