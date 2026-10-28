package p605x6;

import bc3.C3033m;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import p390p1.C28607e;
import p390p1.InterfaceC28680w0;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import vv1.C36532c;
import wr1.C37572f;

/* JADX INFO: renamed from: x6.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C37999d implements InterfaceC28680w0 {

    /* JADX INFO: renamed from: E */
    public int f162775E;

    /* JADX INFO: renamed from: F */
    public long f162776F;

    /* JADX INFO: renamed from: G */
    public C3033m f162777G;

    /* JADX INFO: renamed from: w */
    public final InterfaceC2994c0 f162778w;

    /* JADX INFO: renamed from: x */
    public final C37572f f162779x;

    /* JADX INFO: renamed from: y */
    public final C28607e f162780y;

    /* JADX INFO: renamed from: z */
    public final Object f162781z;

    public C37999d(InterfaceC38016u interfaceC38016u) {
        C37572f c37572f = new C37572f(25);
        this.f162778w = interfaceC38016u;
        this.f162779x = c37572f;
        this.f162780y = new C28607e(new C36532c(this, 20));
        this.f162781z = new Object();
        this.f162775E = 5;
    }

    /* JADX INFO: renamed from: a */
    public final void m121738a() {
        synchronized (this.f162781z) {
            C3033m c3033m = this.f162777G;
            if (c3033m != null) {
                c3033m.cancel(null);
            }
        }
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // p390p1.InterfaceC28680w0
    /* JADX INFO: renamed from: k */
    public final Object mo7286k(Function1 function1, InterfaceC30057d interfaceC30057d) {
        return this.f162780y.mo7286k(function1, interfaceC30057d);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }
}
