package io.sentry;

import java.util.concurrent.ThreadFactory;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC20389j0 implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76442w;

    /* JADX INFO: renamed from: x */
    public int f76443x;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r10) {
        switch (this.f76442w) {
            case 0:
                StringBuilder sb4 = new StringBuilder("SentryHostnameCache-");
                int i13 = this.f76443x;
                this.f76443x = i13 + 1;
                sb4.append(i13);
                Thread thread = new Thread(r10, sb4.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                AbstractC22676k.m65750j(r10, "r");
                StringBuilder sb5 = new StringBuilder("SentryReplayIntegration-");
                int i14 = this.f76443x;
                this.f76443x = i14 + 1;
                sb5.append(i14);
                Thread thread2 = new Thread(r10, sb5.toString());
                thread2.setDaemon(true);
                return thread2;
            default:
                AbstractC22676k.m65750j(r10, "r");
                StringBuilder sb6 = new StringBuilder("SentryReplayPersister-");
                int i15 = this.f76443x;
                this.f76443x = i15 + 1;
                sb6.append(i15);
                Thread thread3 = new Thread(r10, sb6.toString());
                thread3.setDaemon(true);
                return thread3;
        }
    }
}
