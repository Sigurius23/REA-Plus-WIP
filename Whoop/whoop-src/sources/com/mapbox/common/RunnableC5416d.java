package com.mapbox.common;

import android.content.Context;
import android.os.Looper;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.mapbox.common.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5416d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21906w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f21907x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Looper f21908y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f21909z;

    public /* synthetic */ RunnableC5416d(Context context, Looper looper, Function1 function1, int i13) {
        this.f21906w = i13;
        this.f21907x = context;
        this.f21908y = looper;
        this.f21909z = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21906w) {
            case 0:
                LifecycleUtils.hasServiceRunningInForeground$lambda$15(this.f21907x, this.f21908y, this.f21909z);
                break;
            default:
                LifecycleUtils.getLifecycleState$lambda$24(this.f21907x, this.f21908y, this.f21909z);
                break;
        }
    }
}
