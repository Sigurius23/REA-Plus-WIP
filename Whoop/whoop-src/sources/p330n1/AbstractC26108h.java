package p330n1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import g40.C15348f0;
import j93.AbstractC21478l0;
import lc0.C23821c;
import live.hms.video.connection.degredation.C24117a;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p077d0.C11349f0;
import p132f0.C13819r;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.InterfaceC17910s0;
import p209i3.AbstractC18032n;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p292l1.AbstractC23124k3;
import p316m1.InterfaceC24926x;
import p354o1.EnumC27375n;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: n1.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26108h {

    /* JADX INFO: renamed from: a */
    public static final float f103435a = (float) 2.5d;

    /* JADX INFO: renamed from: b */
    public static final float f103436b = (float) 5.5d;

    /* JADX INFO: renamed from: c */
    public static final float f103437c = 16;

    /* JADX INFO: renamed from: d */
    public static final float f103438d = 40;

    /* JADX INFO: renamed from: e */
    public static final float f103439e = 10;

    /* JADX INFO: renamed from: f */
    public static final float f103440f = 5;

    /* JADX INFO: renamed from: a */
    public static final void m77670a(InterfaceC24926x interfaceC24926x, long j7, Composer composer, int i13) {
        C28655q c28655q;
        Object obj;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1353562852);
        int i14 = i13 | (c28655q2.m87153g(interfaceC24926x) ? 4 : 2) | (c28655q2.m87151f(j7) ? 32 : 16);
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                obj = objM87133R;
                C17891j c17891jM51478a = AbstractC17897m.m51478a();
                c17891jM51478a.m51465l(1);
                c28655q2.m87172p0(c17891jM51478a);
                obj = c17891jM51478a;
            }
            obj = objM87133R;
            InterfaceC17910s0 interfaceC17910s0 = (InterfaceC17910s0) obj;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87264r(new C24117a(interfaceC24926x, 18));
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(((Number) ((InterfaceC28670t2) objM87133R2).getValue()).floatValue(), AbstractC23124k3.m67109m(EnumC27375n.f109950y, c28655q2), null, null, c28655q2, 0, 28);
            C28655q c28655q3 = c28655q2;
            int i15 = i14 & 14;
            boolean z4 = i15 == 4;
            Object objM87133R3 = c28655q3.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C23821c(interfaceC24926x, 21);
                c28655q3.m87172p0(objM87133R3);
            }
            Modifier modifierM3419p = AbstractC1102d.m3419p(f103437c, AbstractC18032n.m51774b(C2314t.f9131w, (Function1) objM87133R3));
            boolean zM87153g = ((i14 & 112) == 32) | (i15 == 4) | c28655q3.m87153g(interfaceC28670t2M30588b) | c28655q3.m87157i(interfaceC17910s0);
            Object objM87133R4 = c28655q3.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                C13819r c13819r = new C13819r(2, j7, interfaceC24926x, interfaceC28670t2M30588b, interfaceC17910s0);
                c28655q3.m87172p0(c13819r);
                objM87133R4 = c13819r;
            }
            AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R4, c28655q3, 0);
            c28655q = c28655q3;
        } else {
            C28655q c28655q4 = c28655q2;
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15348f0(interfaceC24926x, j7, i13, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m77671b(InterfaceC22131e interfaceC22131e, InterfaceC17910s0 interfaceC17910s0, C16618c c16618c, long j7, float f13, C11349f0 c11349f0) {
        C17891j c17891j = (C17891j) interfaceC17910s0;
        c17891j.m51464k();
        c17891j.m51462i(0.0f, 0.0f);
        float f14 = f103439e;
        float fMo743q0 = interfaceC22131e.mo743q0(f14);
        float f15 = c11349f0.f36377x;
        c17891j.m51461h((fMo743q0 * f15) / 2, interfaceC22131e.mo743q0(f103440f) * f15);
        c17891j.m51461h(interfaceC22131e.mo743q0(f14) * f15, 0.0f);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (c16618c.m47198d() >> 32)) + (Math.min(c16618c.f63941c - c16618c.f63939a, c16618c.f63942d - c16618c.f63940b) / 2.0f)) - ((interfaceC22131e.mo743q0(f14) * f15) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c16618c.m47198d() & 4294967295L));
        float f16 = f103435a;
        c17891j.m51466m((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - interfaceC22131e.mo743q0(f16))) & 4294967295L));
        float fMo743q1 = c11349f0.f36376w - interfaceC22131e.mo743q0(f16);
        long jMo721B0 = interfaceC22131e.mo721B0();
        C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(fMo743q1, jMo721B0);
            InterfaceC22131e.m63386z(interfaceC22131e, c17891j, j7, f13, new C22135i(interfaceC22131e.mo743q0(f16), 0.0f, 0, 0, null, 30), 48);
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }
}
