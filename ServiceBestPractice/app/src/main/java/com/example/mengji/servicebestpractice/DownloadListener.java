package com.example.mengji.servicebestpractice;

/**
 * Created by mengji on 2018/1/9.
 */
public interface DownloadListener  {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
