package p409q0;

import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import p180h0.EnumC16377d2;
import p206i0.C17835m;
import p389p0.C28539n0;
import p390p1.C28635l;
import p390p1.C28655q;
import p634y1.AbstractC39038k;
import q83.C30064k;

/* JADX INFO: renamed from: q0.c0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29677c0 {

    /* JADX INFO: renamed from: a */
    public static final float f121291a = 56;

    /* JADX INFO: renamed from: b */
    public static final C29693q f121292b = new C29693q(0, 0, 0, EnumC16377d2.f62972x, 0, 0, 0, C17835m.f69348c, new C29673a0(), AbstractC3006f0.m8708b(C30064k.f122676w));

    /* JADX INFO: renamed from: c */
    public static final C29675b0 f121293c = new C29675b0();

    /* JADX INFO: renamed from: a */
    public static final long m91149a(C29693q c29693q, int i13) {
        int i14 = c29693q.f121383c;
        long j7 = ((long) i13) * ((long) (c29693q.f121382b + i14));
        int i15 = -c29693q.f121386f;
        int i16 = c29693q.f121384d;
        long j13 = ((j7 + ((long) i15)) + ((long) i16)) - ((long) i14);
        int iM91154e = (int) (c29693q.f121385e == EnumC16377d2.f62972x ? c29693q.m91154e() >> 32 : c29693q.m91154e() & 4294967295L);
        long jM36284n = j13 - ((long) (iM91154e - AbstractC12889b.m36284n(c29693q.f121394n.mo51269a(iM91154e, c29693q.f121382b, i15, i16), 0, iM91154e)));
        if (jM36284n < 0) {
            return 0L;
        }
        return jM36284n;
    }

    /* JADX INFO: renamed from: b */
    public static final C29674b m91150b(final InterfaceC4339a interfaceC4339a, final int i13, int i14, Composer composer, int i15) {
        boolean z4 = true;
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        Object[] objArr = new Object[0];
        C28539n0 c28539n0 = C29674b.f121287K;
        final float f13 = 0.0f;
        boolean z13 = ((((i14 & 14) ^ 6) > 4 && ((C28655q) composer).m87149e(i13)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && ((C28655q) composer).m87147d(0.0f)) || (i14 & 48) == 32);
        if ((((i14 & 896) ^ 384) <= 256 || !((C28655q) composer).m87153g(interfaceC4339a)) && (i14 & 384) != 256) {
            z4 = false;
        }
        boolean z14 = z13 | z4;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (z14 || objM87133R == C28635l.f115821a) {
            objM87133R = new InterfaceC4339a() { // from class: q0.z
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return new C29674b(f13, i13, interfaceC4339a);
                }
            };
            c28655q.m87172p0(objM87133R);
        }
        C29674b c29674b = (C29674b) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R, c28655q, 0);
        c29674b.f121288J.setValue(interfaceC4339a);
        return c29674b;
    }
}
