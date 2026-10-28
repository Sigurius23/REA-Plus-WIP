package p218ic;

import ih0.AbstractC18489d0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.c */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC18350c implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final AtomicInteger f71460w = new AtomicInteger(0);

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f71461x;

    public ThreadFactoryC18350c(boolean z4) {
        this.f71461x = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC22676k.m65750j(runnable, "runnable");
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(this.f71461x ? "WM.task-" : "androidx.work-");
        sbM53374o.append(this.f71460w.incrementAndGet());
        return new Thread(runnable, sbM53374o.toString());
    }
}
