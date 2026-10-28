package com.google.android.gms.tasks;

import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p014aj.C0928c;
import p073cq.AbstractC11041j;
import p073cq.C11052u;
import p073cq.ExecutorC11049r;
import p073cq.RunnableC11044m;
import p529uo.AbstractC35135w;

/* JADX INFO: loaded from: classes.dex */
public final class Tasks {
    /* JADX INFO: renamed from: a */
    public static Object m15637a(Task task, long j7) throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        AbstractC35135w.m111095g(task, "Task must not be null");
        AbstractC35135w.m111095g(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return m15641e(task);
        }
        C0928c c0928c = new C0928c(7, (byte) 0);
        Executor executor = AbstractC11041j.f34646b;
        task.addOnSuccessListener(executor, c0928c);
        task.addOnFailureListener(executor, c0928c);
        task.addOnCanceledListener(executor, c0928c);
        if (((CountDownLatch) c0928c.f3421x).await(j7, timeUnit)) {
            return m15641e(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        AbstractC35135w.m111095g(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) m15641e(task);
        }
        C0928c c0928c = new C0928c(7, (byte) 0);
        ExecutorC11049r executorC11049r = AbstractC11041j.f34646b;
        task.addOnSuccessListener(executorC11049r, c0928c);
        task.addOnFailureListener(executorC11049r, c0928c);
        task.addOnCanceledListener(executorC11049r, c0928c);
        ((CountDownLatch) c0928c.f3421x).await();
        return (TResult) m15641e(task);
    }

    /* JADX INFO: renamed from: b */
    public static C11052u m15638b(Executor executor, Callable callable) {
        AbstractC35135w.m111095g(executor, "Executor must not be null");
        C11052u c11052u = new C11052u();
        executor.execute(new RunnableC11044m(c11052u, callable, false, 5));
        return c11052u;
    }

    /* JADX INFO: renamed from: c */
    public static C11052u m15639c(Exception exc) {
        C11052u c11052u = new C11052u();
        c11052u.m29704c(exc);
        return c11052u;
    }

    /* JADX INFO: renamed from: d */
    public static C11052u m15640d(Object obj) {
        C11052u c11052u = new C11052u();
        c11052u.m29702a(obj);
        return c11052u;
    }

    /* JADX INFO: renamed from: e */
    public static Object m15641e(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }
}
