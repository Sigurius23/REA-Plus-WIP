package p389p0;

import androidx.compose.foundation.lazy.layout.C1106b;
import bc3.InterfaceC2994c0;
import java.util.Arrays;
import nr0.C27072e;
import p208i2.InterfaceC17883f0;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p0.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C28556w {

    /* JADX INFO: renamed from: b */
    public C39169a f115533b;

    /* JADX INFO: renamed from: c */
    public int f115534c;

    /* JADX INFO: renamed from: d */
    public int f115535d;

    /* JADX INFO: renamed from: f */
    public int f115537f;

    /* JADX INFO: renamed from: g */
    public int f115538g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1106b f115539h;

    /* JADX INFO: renamed from: a */
    public C28550t[] f115532a = AbstractC28560y.f115546a;

    /* JADX INFO: renamed from: e */
    public int f115536e = 1;

    public C28556w(C1106b c1106b) {
        this.f115539h = c1106b;
    }

    /* JADX INFO: renamed from: k */
    public static void m86863k(C28556w c28556w, InterfaceC28518e0 interfaceC28518e0, InterfaceC2994c0 interfaceC2994c0, InterfaceC17883f0 interfaceC17883f0, int i13, int i14) {
        c28556w.f115539h.getClass();
        long jMo77547j = interfaceC28518e0.mo77547j(0);
        c28556w.m86873j(interfaceC28518e0, interfaceC2994c0, interfaceC17883f0, i13, i14, (int) (!interfaceC28518e0.mo77542e() ? jMo77547j & 4294967295L : jMo77547j >> 32));
    }

    /* JADX INFO: renamed from: a */
    public final C28550t[] m86864a() {
        return this.f115532a;
    }

    /* JADX INFO: renamed from: b */
    public final C39169a m86865b() {
        return this.f115533b;
    }

    /* JADX INFO: renamed from: c */
    public final int m86866c() {
        return this.f115534c;
    }

    /* JADX INFO: renamed from: d */
    public final int m86867d() {
        return this.f115535d;
    }

    /* JADX INFO: renamed from: e */
    public final int m86868e() {
        return this.f115538g;
    }

    /* JADX INFO: renamed from: f */
    public final int m86869f() {
        return this.f115537f;
    }

    /* JADX INFO: renamed from: g */
    public final int m86870g() {
        return this.f115536e;
    }

    /* JADX INFO: renamed from: h */
    public final void m86871h(int i13) {
        this.f115535d = i13;
    }

    /* JADX INFO: renamed from: i */
    public final void m86872i(int i13) {
        this.f115536e = i13;
    }

    /* JADX INFO: renamed from: j */
    public final void m86873j(InterfaceC28518e0 interfaceC28518e0, InterfaceC2994c0 interfaceC2994c0, InterfaceC17883f0 interfaceC17883f0, int i13, int i14, int i15) {
        C28550t[] c28550tArr = this.f115532a;
        int length = c28550tArr.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length) {
                this.f115537f = i13;
                this.f115538g = i14;
                break;
            } else {
                C28550t c28550t = c28550tArr[i16];
                if (c28550t != null && c28550t.f115507g) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        int length2 = this.f115532a.length;
        for (int iMo77539b = interfaceC28518e0.mo77539b(); iMo77539b < length2; iMo77539b++) {
            C28550t c28550t2 = this.f115532a[iMo77539b];
            if (c28550t2 != null) {
                c28550t2.m86855i();
            }
        }
        if (this.f115532a.length != interfaceC28518e0.mo77539b()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f115532a, interfaceC28518e0.mo77539b());
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f115532a = (C28550t[]) objArrCopyOf;
        }
        this.f115533b = new C39169a(interfaceC28518e0.mo77541d());
        this.f115534c = i15;
        this.f115535d = interfaceC28518e0.mo77548k();
        this.f115536e = interfaceC28518e0.mo77543f();
        int iMo77539b2 = interfaceC28518e0.mo77539b();
        for (int i17 = 0; i17 < iMo77539b2; i17++) {
            C28530j c28530jM86881h = AbstractC28560y.m86881h(interfaceC28518e0.mo77545h(i17));
            if (c28530jM86881h == null) {
                C28550t c28550t3 = this.f115532a[i17];
                if (c28550t3 != null) {
                    c28550t3.m86855i();
                }
                this.f115532a[i17] = null;
            } else {
                C28550t c28550t4 = this.f115532a[i17];
                if (c28550t4 == null) {
                    c28550t4 = new C28550t(interfaceC2994c0, interfaceC17883f0, new C27072e(this.f115539h, 23));
                    this.f115532a[i17] = c28550t4;
                }
                c28550t4.f115504d = c28530jM86881h.f115442O;
                c28550t4.f115505e = c28530jM86881h.f115443P;
                c28550t4.f115506f = c28530jM86881h.f115444Q;
            }
        }
    }
}
