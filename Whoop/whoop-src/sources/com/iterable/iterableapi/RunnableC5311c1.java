package com.iterable.iterableapi;

import java.util.Iterator;

/* JADX INFO: renamed from: com.iterable.iterableapi.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC5311c1 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21653w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C5315d1 f21654x;

    public /* synthetic */ RunnableC5311c1(C5315d1 c5315d1, int i13) {
        this.f21653w = i13;
        this.f21654x = c5315d1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21653w) {
            case 0:
                this.f21654x.m16423f();
                return;
            default:
                synchronized (this.f21654x.f21661H) {
                    try {
                        Iterator it = this.f21654x.f21661H.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
