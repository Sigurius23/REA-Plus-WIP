package p457rc;

import androidx.lifecycle.C1627t0;
import androidx.lifecycle.InterfaceC1633v0;
import p073cq.RunnableC11044m;
import p538v.InterfaceC35450a;
import sc.InterfaceC32351a;

/* JADX INFO: renamed from: rc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C31220c implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C1627t0 f128593E;

    /* JADX INFO: renamed from: w */
    public Object f128594w = null;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC32351a f128595x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f128596y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC35450a f128597z;

    public C31220c(InterfaceC32351a interfaceC32351a, Object obj, InterfaceC35450a interfaceC35450a, C1627t0 c1627t0) {
        this.f128595x = interfaceC32351a;
        this.f128596y = obj;
        this.f128597z = interfaceC35450a;
        this.f128593E = c1627t0;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        this.f128595x.m100716a(new RunnableC11044m(10, this, obj));
    }
}
