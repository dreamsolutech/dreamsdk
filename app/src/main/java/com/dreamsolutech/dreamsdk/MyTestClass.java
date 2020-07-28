package com.dreamsolutech.dreamsdk;

import android.util.Log;

public class MyTestClass {

    private static String TAG_MESSAGE = "Jk";
    private static String LINE_SEPARATOR   = System.getProperty("line.separator");
    public static void loge(String message) {
        Log.e(TAG_MESSAGE + "[" + Thread.currentThread().getName() + "]", LINE_SEPARATOR + message + LINE_SEPARATOR + getStackTraceMessage(1));
    }

    public static String getStackTraceMessage(int fromTheTop)
    {
        StackTraceElement elem = getStackTraceElement(fromTheTop+1);
        StringBuffer result = new StringBuffer();
        result.append(" at ").append(elem.getClassName());
        result.append(".").append(elem.getMethodName()).append(" written in ");
        result.append(elem.getFileName()).append("[").append(elem.getLineNumber()).append(" Line]");
        return result.toString();
    }
    public static StackTraceElement getStackTraceElement(int fromTheTop)
    {
        StackTraceElement[] elem = new Throwable().getStackTrace();
        int index = fromTheTop+1;
        return elem[index];
    }
}
