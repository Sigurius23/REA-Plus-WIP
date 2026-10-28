package com.google.android.gms.tasks;

import p073cq.InterfaceC11035d;

/* JADX INFO: loaded from: classes6.dex */
public class NativeOnCompleteListener implements InterfaceC11035d {
    public native void nativeOnComplete(long j7, Object obj, boolean z4, boolean z13, String str);

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public final void mo944q(Task task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(0L, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
