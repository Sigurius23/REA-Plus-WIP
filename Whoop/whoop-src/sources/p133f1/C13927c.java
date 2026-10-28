package p133f1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p636y3.C39176h;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f1.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C13927c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f49657w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f49658x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f49659y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC13957m f49660z;

    public C13927c(long j7, boolean z4, Modifier modifier, InterfaceC13957m interfaceC13957m) {
        this.f49657w = j7;
        this.f49658x = z4;
        this.f49659y = modifier;
        this.f49660z = interfaceC13957m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j7 = this.f49657w;
            C28676v0 c28676v0 = C28635l.f115821a;
            final InterfaceC13957m interfaceC13957m = this.f49660z;
            boolean z4 = this.f49658x;
            if (j7 != 9205357640488583168L) {
                c28655q.m87150e0(3458246);
                C22949e c22949e = z4 ? AbstractC22953f.f90590b : AbstractC22953f.f90589a;
                Modifier modifierM3417n = AbstractC1102d.m3417n(this.f49659y, C39176h.m124787c(j7), C39176h.m124786b(j7), 0.0f, 0.0f, 12);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3417n);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                boolean zM87157i = c28655q.m87157i(interfaceC13957m);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i13 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: f1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    return Boolean.valueOf((interfaceC13957m.mo39711a() & 9223372034707292159L) != 9205357640488583168L);
                                default:
                                    return Boolean.valueOf((interfaceC13957m.mo39711a() & 9223372034707292159L) != 9205357640488583168L);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC13994y0.m39817f(C2314t.f9131w, (InterfaceC4339a) objM87133R, z4, c28655q, 6);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(4389176);
                boolean zM87157i2 = c28655q.m87157i(interfaceC13957m);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i14 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: f1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    return Boolean.valueOf((interfaceC13957m.mo39711a() & 9223372034707292159L) != 9205357640488583168L);
                                default:
                                    return Boolean.valueOf((interfaceC13957m.mo39711a() & 9223372034707292159L) != 9205357640488583168L);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC13994y0.m39817f(this.f49659y, (InterfaceC4339a) objM87133R2, z4, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
