package ht;

import android.content.Context;
import hm.C17417d;
import java.util.concurrent.Callable;
import p009a8.RunnableC0533c;
import p426qi.AbstractC30391l;

/* JADX INFO: renamed from: ht.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class CallableC17617f implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68331w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f68332x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f68333y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f68334z;

    public /* synthetic */ CallableC17617f(Object obj, Object obj2, Object obj3, int i13) {
        this.f68331w = i13;
        this.f68332x = obj;
        this.f68333y = obj2;
        this.f68334z = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f68331w) {
            case 0:
                return ((ScheduledExecutorServiceC17618g) this.f68332x).f68335w.submit(new RunnableC0533c(23, (Callable) this.f68333y, (C17417d) this.f68334z));
            default:
                return AbstractC30391l.m92863b((Context) this.f68332x, (String) this.f68333y, (String) this.f68334z);
        }
    }
}
