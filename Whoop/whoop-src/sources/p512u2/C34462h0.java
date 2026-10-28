package p512u2;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.input.pointer.PointerInputResetException;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3033m;
import bc3.EnumC2998d0;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import j43.C21317a;
import java.util.ArrayList;
import java.util.Collection;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0200f2;
import p026b2.AbstractC2316v;
import p446r1.C30849c;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import q83.C30065l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import sz.C33151q;

/* JADX INFO: renamed from: u2.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C34462h0 extends AbstractC2316v implements InterfaceC34476v, InterfaceC39171c, InterfaceC0200f2 {

    /* JADX INFO: renamed from: O */
    public Object f144779O;

    /* JADX INFO: renamed from: P */
    public Object f144780P;

    /* JADX INFO: renamed from: Q */
    public Object[] f144781Q;

    /* JADX INFO: renamed from: R */
    public PointerInputEventHandler f144782R;

    /* JADX INFO: renamed from: S */
    public C2996c2 f144783S;

    /* JADX INFO: renamed from: T */
    public C34465k f144784T = AbstractC34452c0.f144747a;

    /* JADX INFO: renamed from: U */
    public final C30849c f144785U;

    /* JADX INFO: renamed from: V */
    public final C30849c f144786V;

    /* JADX INFO: renamed from: W */
    public final C30849c f144787W;

    /* JADX INFO: renamed from: X */
    public C34465k f144788X;

    /* JADX INFO: renamed from: Y */
    public long f144789Y;

    public C34462h0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f144779O = obj;
        this.f144780P = obj2;
        this.f144781Q = objArr;
        this.f144782R = pointerInputEventHandler;
        C30849c c30849c = new C30849c(new C34460g0[16]);
        this.f144785U = c30849c;
        this.f144786V = c30849c;
        this.f144787W = new C30849c(new C34460g0[16]);
        this.f144789Y = 0L;
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: F0 */
    public final void mo499F0() {
        m108936Z0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        m108936Z0();
    }

    /* JADX INFO: renamed from: X0 */
    public final Object m108934X0(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        C34460g0 c34460g0 = new C34460g0(this, c3033m);
        synchronized (this.f144786V) {
            this.f144785U.m94885b(c34460g0);
            new C30065l(AbstractC15751g.m44424D(AbstractC15751g.m44463p(interfaceC4351m, c34460g0, c34460g0)), EnumC31071a.f128113w).resumeWith(C23454a0.f92919a);
        }
        c3033m.m8776u(new C21317a(c34460g0, 16));
        return c3033m.m8773r();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: Y0 */
    public final void m108935Y0(C34465k c34465k, EnumC34466l enumC34466l) {
        Object[] objArr;
        int i13;
        int i14;
        C34460g0 c34460g0;
        C3033m c3033m;
        C3033m c3033m2;
        synchronized (this.f144786V) {
            C30849c c30849c = this.f144787W;
            c30849c.m94887d(c30849c.f127229y, this.f144785U);
        }
        try {
            int iOrdinal = enumC34466l.ordinal();
            if (iOrdinal == 0) {
                C30849c c30849c2 = this.f144787W;
                objArr = c30849c2.f127227w;
                i13 = c30849c2.f127229y;
                for (i14 = 0; i14 < i13; i14++) {
                    c34460g0 = (C34460g0) objArr[i14];
                    if (enumC34466l != c34460g0.f144778z && (c3033m = c34460g0.f144777y) != null) {
                        c34460g0.f144777y = null;
                        c3033m.resumeWith(c34465k);
                    }
                }
            } else if (iOrdinal == 1) {
                C30849c c30849c3 = this.f144787W;
                int i15 = c30849c3.f127229y - 1;
                Object[] objArr2 = c30849c3.f127227w;
                if (i15 < objArr2.length) {
                    while (i15 >= 0) {
                        C34460g0 c34460g1 = (C34460g0) objArr2[i15];
                        if (enumC34466l == c34460g1.f144778z && (c3033m2 = c34460g1.f144777y) != null) {
                            c34460g1.f144777y = null;
                            c3033m2.resumeWith(c34465k);
                        }
                        i15--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                C30849c c30849c4 = this.f144787W;
                objArr = c30849c4.f127227w;
                i13 = c30849c4.f127229y;
                while (i14 < i13) {
                    c34460g0 = (C34460g0) objArr[i14];
                    if (enumC34466l != c34460g0.f144778z) {
                    }
                }
            }
            this.f144787W.m94890g();
        } catch (Throwable th3) {
            this.f144787W.m94890g();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m108936Z0() {
        C2996c2 c2996c2 = this.f144783S;
        if (c2996c2 != null) {
            c2996c2.mo8819p(new PointerInputResetException());
            this.f144783S = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public final void mo465b0() {
        C34465k c34465k = this.f144788X;
        if (c34465k == null) {
            return;
        }
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((C34472r) r10.get(i13)).m108950f()) {
                ArrayList arrayList = new ArrayList(r10.size());
                int size2 = ((Collection) r10).size();
                for (int i14 = 0; i14 < size2; i14++) {
                    C34472r c34472r = (C34472r) r10.get(i14);
                    arrayList.add(new C34472r(c34472r.m108948d(), c34472r.m108955k(), c34472r.m108949e(), c34472r.m108951g(), c34472r.m108955k(), c34472r.m108949e(), c34472r.m108950f(), c34472r.m108950f(), c34472r.m108954j()));
                }
                C34465k c34465k2 = new C34465k(arrayList, null);
                this.f144784T = c34465k2;
                m108935Y0(c34465k2, EnumC34466l.f144806w);
                m108935Y0(c34465k2, EnumC34466l.f144807x);
                m108935Y0(c34465k2, EnumC34466l.f144808y);
                this.f144788X = null;
                return;
            }
        }
    }

    @Override // p005a3.InterfaceC0229n, p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
        m108936Z0();
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return AbstractC0201g.m516p(this).f776X.getDensity();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return AbstractC0201g.m516p(this).f776X.getFontScale();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public final void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        this.f144789Y = j7;
        if (enumC34466l == EnumC34466l.f144806w) {
            this.f144784T = c34465k;
        }
        InterfaceC30057d interfaceC30057d = null;
        if (this.f144783S == null) {
            this.f144783S = AbstractC3006f0.m8732z(m7158L0(), null, EnumC2998d0.f12007z, new C33151q(this, interfaceC30057d, 9), 1);
        }
        m108935Y0(c34465k, enumC34466l);
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!AbstractC34454d0.m108914e((C34472r) r10.get(i13))) {
                this.f144788X = c34465k;
            }
        }
        c34465k = null;
        this.f144788X = c34465k;
    }
}
