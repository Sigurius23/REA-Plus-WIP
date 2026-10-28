package p161g;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Iterator;
import p021av.C2088b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C14916s {

    /* JADX INFO: renamed from: a */
    public final Object f55594a;

    /* JADX INFO: renamed from: b */
    public boolean f55595b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f55596c;

    public C14916s(InterfaceExecutorC14905h executor, C2088b c2088b) {
        AbstractC22676k.m65750j(executor, "executor");
        this.f55594a = new Object();
        this.f55596c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m43006a() {
        synchronized (this.f55594a) {
            try {
                this.f55595b = true;
                Iterator it = this.f55596c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4339a) it.next()).invoke();
                }
                this.f55596c.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m43007b() {
        boolean z4;
        synchronized (this.f55594a) {
            z4 = this.f55595b;
        }
        return z4;
    }
}
