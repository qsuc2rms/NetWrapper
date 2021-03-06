package com.hss01248.net.builder;

import android.app.Activity;
import android.app.Dialog;

import com.hss01248.net.config.ConfigInfo;
import com.hss01248.net.config.NetDefaultConfig;
import com.hss01248.net.wrapper.MyNetListener;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/16 0016.
 */
public class UploadRequestBuilder <T> extends ProgressBaseBuilder{
    public Map<String,String> files;



    public UploadRequestBuilder(){
        type = ConfigInfo.TYPE_UPLOAD_WITH_PROGRESS;
    }


    public UploadRequestBuilder<T> addFile(String desc,String filePath){
        if(files == null){
            files = new HashMap<>();
        }
        files.put(desc,filePath);
        return this;
    }

    @Override
    protected ConfigInfo execute() {
        method = NetDefaultConfig.Method.POST;
        headers.put("Content-Type","multipart/form-data");
        return new ConfigInfo(this);
    }

    //todo 以下的都是复写基类的方法,强转成子类

    @Override
    public UploadRequestBuilder url(String url) {
        return (UploadRequestBuilder) super.url(url);
    }

    @Override
    public UploadRequestBuilder addHeader(String key, String value) {
        return (UploadRequestBuilder) super.addHeader(key, value);
    }

    @Override
    public UploadRequestBuilder addParams(String key, String value) {
        return (UploadRequestBuilder) super.addParams(key, value);
    }

    @Override
    public UploadRequestBuilder callback(MyNetListener listener) {
        return (UploadRequestBuilder) super.callback(listener);
    }

    @Override
    public UploadRequestBuilder showLoadingDialog(Activity activity, String loadingMsg) {
        return (UploadRequestBuilder) showLoadingDialog(activity,loadingMsg,true,true);
    }


    public UploadRequestBuilder showLoadingDialog(Activity activity) {
        return  showLoadingDialog(activity,"文件上传中");
    }

    @Override
    protected UploadRequestBuilder setShowLoadingDialog(Dialog loadingDialog, String msg, Activity activity, boolean updateProgress, boolean horizontal) {
        return (UploadRequestBuilder) super.setShowLoadingDialog(loadingDialog, msg, activity, updateProgress, horizontal);
    }

    @Override
    public UploadRequestBuilder showLoadingDialog(Activity activity, String loadingMsg, boolean updateProgress, boolean horizontal) {
        return (UploadRequestBuilder) super.showLoadingDialog(activity, loadingMsg, updateProgress, horizontal);
    }

    @Override
    public UploadRequestBuilder showLoadingDialog(Dialog loadingDialog) {
        return (UploadRequestBuilder) super.showLoadingDialog(loadingDialog);
    }

    @Override
    public UploadRequestBuilder setCacheControl(boolean shouldReadCache, boolean shouldCacheResponse, long cacheTimeInSeconds) {
        return (UploadRequestBuilder) super.setCacheControl(shouldReadCache, shouldCacheResponse, cacheTimeInSeconds);
    }

    @Override
    public UploadRequestBuilder setRetryCount(int retryCount) {
        return (UploadRequestBuilder) super.setRetryCount(retryCount);
    }

    @Override
    public UploadRequestBuilder setTimeout(int timeoutInMills) {
        return (UploadRequestBuilder) super.setTimeout(timeoutInMills);
    }

    @Override
    public UploadRequestBuilder setIgnoreCer() {
        return (UploadRequestBuilder) super.setIgnoreCer();
    }

    @Override
    public UploadRequestBuilder setIsAppendToken(boolean isAppendToken, boolean isInHeaderOrParam) {
        return (UploadRequestBuilder) super.setIsAppendToken(isAppendToken, isInHeaderOrParam);
    }

}
