package u10;

import androidx.compose.p018ui.Modifier;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import d30.C11535h;
import ec3.InterfaceC13037f2;
import hc3.C17171d;
import java.io.Closeable;
import n53.C26318e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p510u0.C34350r;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq0.C31703x;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: u10.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C34426n extends AbstractC34428p implements Closeable {

    /* JADX INFO: renamed from: w */
    public final C11535h f144664w;

    public C34426n(C11535h c11535h) {
        this.f144664w = c11535h;
    }

    @Override // u10.AbstractC34428p
    /* JADX INFO: renamed from: b */
    public final void mo108792b(C28655q c28655q) {
        c28655q.m87150e0(-1339058932);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        AbstractC12314q.m34326f(this.f144664w, c28655q, 0);
        AbstractC12313p.m34283e(12, 6, c28655q, 0);
        c28655q.m87173q(true);
        c28655q.m87173q(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC3006f0.m8714h((C17171d) this.f144664w.f37191h, null);
    }

    @Override // u10.AbstractC34428p
    /* JADX INFO: renamed from: h */
    public final boolean mo108793h() {
        return false;
    }

    @Override // u10.AbstractC34428p
    /* JADX INFO: renamed from: i */
    public final InterfaceC13037f2 mo108794i() {
        return AbstractC3269g.m9484M((C26318e) this.f144664w.f37193j, new C34350r(13));
    }

    @Override // u10.AbstractC34428p
    /* JADX INFO: renamed from: k */
    public final InterfaceC13037f2 mo108795k() {
        return AbstractC3269g.m9484M((C26318e) this.f144664w.f37193j, new C31703x(this, 26));
    }
}
