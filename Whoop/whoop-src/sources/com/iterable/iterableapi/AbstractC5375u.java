package com.iterable.iterableapi;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.iterable.iterableapi.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5375u {

    /* JADX INFO: renamed from: a */
    public static final C5347l1 f21838a = new C5347l1();

    /* JADX INFO: renamed from: b */
    public static volatile ExecutorService f21839b = Executors.newSingleThreadExecutor(new ThreadFactoryC5372t());

    /* JADX INFO: renamed from: c */
    public static final Object f21840c = null;

    static {
        new ConcurrentLinkedQueue();
        new ConcurrentLinkedQueue();
    }
}
