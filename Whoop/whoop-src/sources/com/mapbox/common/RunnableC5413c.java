package com.mapbox.common;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.mapbox.common.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5413c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21904w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f21905x;

    public /* synthetic */ RunnableC5413c(Function1 function1, int i13) {
        this.f21904w = i13;
        this.f21905x = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21904w) {
            case 0:
                LifecycleService.getLifecycleState$lambda$6$lambda$5(this.f21905x);
                break;
            case 1:
                LifecycleService.getLifecycleState$lambda$10$lambda$9$lambda$8(this.f21905x);
                break;
            case 2:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(this.f21905x);
                break;
            default:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(this.f21905x);
                break;
        }
    }
}
