package p684zk;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p586wk.InterfaceC37327e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: zk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C40772a extends WeakReference {

    /* JADX INFO: renamed from: a */
    public final InterfaceC37327e f175798a;

    /* JADX INFO: renamed from: b */
    public final boolean f175799b;

    /* JADX INFO: renamed from: c */
    public InterfaceC40801z f175800c;

    public C40772a(InterfaceC37327e interfaceC37327e, C40795t c40795t, ReferenceQueue referenceQueue) {
        super(c40795t, referenceQueue);
        AbstractC29125c.m88539p(interfaceC37327e, "Argument must not be null");
        this.f175798a = interfaceC37327e;
        boolean z4 = c40795t.f175945w;
        this.f175800c = null;
        this.f175799b = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m132262a() {
        this.f175800c = null;
        clear();
    }
}
