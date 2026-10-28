package com.amplitude.quickjs.wrapper;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class QuickJSFunction extends QuickJSObject implements JSFunction {
    private Status currentStatus;
    private int stashTimes;
    private final long thisPointer;
    private final int thisPointerTag;

    public enum Status {
        NOT_CALLED,
        CALLING,
        CALLED
    }

    public QuickJSFunction(QuickJSContext quickJSContext, long j7, long j13, int i13) {
        super(quickJSContext, j7);
        this.stashTimes = 0;
        this.currentStatus = Status.NOT_CALLED;
        this.thisPointer = j13;
        this.thisPointerTag = i13;
    }

    @Override // com.amplitude.quickjs.wrapper.JSFunction
    public Object call(Object... objArr) throws Throwable {
        QuickJSFunction quickJSFunction;
        checkRefCountIsZero();
        this.currentStatus = Status.CALLING;
        try {
            quickJSFunction = this;
            try {
                Object objCall = getContext().call(quickJSFunction, this.thisPointer, this.thisPointerTag, objArr);
                quickJSFunction.currentStatus = Status.CALLED;
                if (quickJSFunction.stashTimes > 0) {
                    for (int i13 = 0; i13 < quickJSFunction.stashTimes; i13++) {
                        release();
                    }
                    quickJSFunction.stashTimes = 0;
                }
                return objCall;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                quickJSFunction.currentStatus = Status.CALLED;
                if (quickJSFunction.stashTimes <= 0) {
                    throw th4;
                }
                for (int i14 = 0; i14 < quickJSFunction.stashTimes; i14++) {
                    release();
                }
                quickJSFunction.stashTimes = 0;
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            quickJSFunction = this;
        }
    }

    @Override // com.amplitude.quickjs.wrapper.JSFunction
    public void callVoid(Object... objArr) throws Throwable {
        Object objCall = call(objArr);
        if (objCall instanceof JSObject) {
            ((JSObject) objCall).release();
        }
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public void release() {
        if (this.currentStatus == Status.CALLING) {
            this.stashTimes++;
        } else {
            super.release();
        }
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray() {
        throw new UnsupportedOperationException("JSFunction types do not support conversion to map or array.");
    }

    @Override // com.amplitude.quickjs.wrapper.QuickJSObject, com.amplitude.quickjs.wrapper.JSObject
    public HashMap<String, Object> toMap() {
        throw new UnsupportedOperationException("JSFunction types do not support conversion to map or array.");
    }
}
