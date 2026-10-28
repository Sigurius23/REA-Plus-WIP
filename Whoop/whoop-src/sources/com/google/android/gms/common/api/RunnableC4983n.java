package com.google.android.gms.common.api;

import eh3.C13207k;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import jh3.AbstractC21700a;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.n */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC4983n implements Runnable {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ RunnableC4983n f20515x = new RunnableC4983n(0);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ RunnableC4983n f20516y = new RunnableC4983n(2);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f20517w;

    public /* synthetic */ RunnableC4983n(int i13) {
        this.f20517w = i13;
    }

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ void m15608a() {
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m15609b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20517w) {
            case 1:
                try {
                    Iterator it = C13207k.f45771E.keySet().iterator();
                    while (it.hasNext()) {
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                        if (scheduledThreadPoolExecutor.isShutdown()) {
                            it.remove();
                        } else {
                            scheduledThreadPoolExecutor.purge();
                        }
                        break;
                    }
                } catch (Throwable th3) {
                    AbstractC12350b.m34573V(th3);
                    AbstractC21700a.m61126a(th3);
                    return;
                }
                break;
        }
    }
}
