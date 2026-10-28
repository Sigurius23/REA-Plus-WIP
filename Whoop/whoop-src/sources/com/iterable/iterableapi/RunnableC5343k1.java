package com.iterable.iterableapi;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.mapbox.bindgen.Cleaner;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.k1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5343k1 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21763w;

    public /* synthetic */ RunnableC5343k1(int i13) {
        this.f21763w = i13;
    }

    /* JADX INFO: renamed from: a */
    private final void m16495a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21763w) {
            case 0:
                try {
                    throw null;
                } catch (Exception e5) {
                    AbstractC12350b.m34596q("IterableInitCallbackMgr", "Exception in subscriber initialization callback", e5);
                    return;
                }
            case 1:
                Cleaner.lambda$create$0();
                return;
            case 2:
                int i13 = AlarmManagerSchedulerBroadcastReceiver.f20363a;
                return;
            case 3:
                EglBase10Impl.EglConnection.lambda$new$1();
                return;
            case 4:
                EglBase14Impl.EglConnection.lambda$new$1();
                return;
            default:
                return;
        }
    }
}
