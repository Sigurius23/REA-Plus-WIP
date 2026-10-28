package ae3;

import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import zd3.C40563g;
import zd3.C40571o;

/* JADX INFO: renamed from: ae3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C0801i implements InterfaceC34813f0 {

    /* JADX INFO: renamed from: a */
    public final C40571o f2951a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2952b;

    /* JADX INFO: renamed from: c */
    public final int f2953c;

    /* JADX INFO: renamed from: d */
    public final C40563g f2954d;

    /* JADX INFO: renamed from: e */
    public final C34832o0 f2955e;

    /* JADX INFO: renamed from: f */
    public final int f2956f;

    /* JADX INFO: renamed from: g */
    public final int f2957g;

    /* JADX INFO: renamed from: h */
    public final int f2958h;

    /* JADX INFO: renamed from: i */
    public int f2959i;

    public C0801i(C40571o c40571o, ArrayList arrayList, int i13, C40563g c40563g, C34832o0 request, int i14, int i15, int i16) {
        AbstractC22676k.m65750j(request, "request");
        this.f2951a = c40571o;
        this.f2952b = arrayList;
        this.f2953c = i13;
        this.f2954d = c40563g;
        this.f2955e = request;
        this.f2956f = i14;
        this.f2957g = i15;
        this.f2958h = i16;
    }

    /* JADX INFO: renamed from: a */
    public static C0801i m1938a(C0801i c0801i, int i13, C40563g c40563g, C34832o0 c34832o0, int i14) {
        if ((i14 & 1) != 0) {
            i13 = c0801i.f2953c;
        }
        int i15 = i13;
        if ((i14 & 2) != 0) {
            c40563g = c0801i.f2954d;
        }
        C40563g c40563g2 = c40563g;
        if ((i14 & 4) != 0) {
            c34832o0 = c0801i.f2955e;
        }
        C34832o0 request = c34832o0;
        int i16 = c0801i.f2956f;
        int i17 = c0801i.f2957g;
        int i18 = c0801i.f2958h;
        c0801i.getClass();
        AbstractC22676k.m65750j(request, "request");
        return new C0801i(c0801i.f2951a, c0801i.f2952b, i15, c40563g2, request, i16, i17, i18);
    }

    /* JADX INFO: renamed from: b */
    public final C34850x0 m1939b(C34832o0 request) {
        AbstractC22676k.m65750j(request, "request");
        ArrayList arrayList = this.f2952b;
        int size = arrayList.size();
        int i13 = this.f2953c;
        if (i13 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f2959i++;
        C40563g c40563g = this.f2954d;
        if (c40563g != null) {
            if (!c40563g.f174687c.mo131542b().m131564e(request.f146712a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i13 - 1) + " must retain the same host and port").toString());
            }
            if (this.f2959i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i13 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i14 = i13 + 1;
        C0801i c0801iM1938a = m1938a(this, i14, null, request, 58);
        InterfaceC34816g0 interfaceC34816g0 = (InterfaceC34816g0) arrayList.get(i13);
        C34850x0 c34850x0Intercept = interfaceC34816g0.intercept(c0801iM1938a);
        if (c34850x0Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC34816g0 + " returned null");
        }
        if (c40563g == null || i14 >= arrayList.size() || c0801iM1938a.f2959i == 1) {
            return c34850x0Intercept;
        }
        throw new IllegalStateException(("network interceptor " + interfaceC34816g0 + " must call proceed() exactly once").toString());
    }
}
