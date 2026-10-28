package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;
import p073cq.InterfaceC11033b;
import p073cq.InterfaceC11034c;
import p073cq.InterfaceC11035d;
import p073cq.InterfaceC11036e;
import p073cq.InterfaceC11037f;
import p073cq.InterfaceC11039h;

/* JADX INFO: loaded from: classes.dex */
public abstract class Task<TResult> {
    public Task<TResult> addOnCanceledListener(Activity activity, InterfaceC11034c interfaceC11034c) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> addOnCompleteListener(Activity activity, InterfaceC11035d interfaceC11035d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Task addOnFailureListener(Activity activity, InterfaceC11036e interfaceC11036e);

    public abstract Task addOnFailureListener(InterfaceC11036e interfaceC11036e);

    public abstract Task addOnFailureListener(Executor executor, InterfaceC11036e interfaceC11036e);

    public abstract Task addOnSuccessListener(Activity activity, InterfaceC11037f interfaceC11037f);

    public abstract Task addOnSuccessListener(InterfaceC11037f interfaceC11037f);

    public abstract Task addOnSuccessListener(Executor executor, InterfaceC11037f interfaceC11037f);

    public <TContinuationResult> Task<TContinuationResult> continueWith(InterfaceC11033b interfaceC11033b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(InterfaceC11033b interfaceC11033b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract Object getResult();

    public abstract Object getResult(Class cls);

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(InterfaceC11039h interfaceC11039h) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task addOnCanceledListener(InterfaceC11034c interfaceC11034c) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> addOnCompleteListener(InterfaceC11035d interfaceC11035d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, InterfaceC11033b interfaceC11033b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, InterfaceC11033b interfaceC11033b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, InterfaceC11039h interfaceC11039h) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task<TResult> addOnCanceledListener(Executor executor, InterfaceC11034c interfaceC11034c) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(Executor executor, InterfaceC11035d interfaceC11035d) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
