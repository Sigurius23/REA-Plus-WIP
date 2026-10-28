package com.amplitude.quickjs.wrapper;

/* JADX INFO: loaded from: classes.dex */
public interface JSObjectCreator {
    JSArray newArray(QuickJSContext quickJSContext, long j7);

    JSFunction newFunction(QuickJSContext quickJSContext, long j7, long j13, int i13);

    JSObject newObject(QuickJSContext quickJSContext, long j7);
}
