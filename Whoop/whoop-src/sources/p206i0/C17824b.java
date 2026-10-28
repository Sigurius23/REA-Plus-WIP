package p206i0;

import java.util.Collection;
import java.util.Iterator;
import p329n0.C26061n;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p389p0.InterfaceC28518e0;
import se.AbstractC32417h;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C17824b implements InterfaceC17834l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C26068u f69311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC17836n f69312b;

    public C17824b(C26068u c26068u, InterfaceC17836n interfaceC17836n) {
        this.f69311a = c26068u;
        this.f69312b = interfaceC17836n;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // p206i0.InterfaceC17834l
    /* JADX INFO: renamed from: a */
    public final float mo46566a(float f13) {
        C26068u c26068u = this.f69311a;
        ?? r10 = c26068u.m77565h().f103177k;
        int size = ((Collection) r10).size();
        float f14 = Float.POSITIVE_INFINITY;
        float f15 = Float.NEGATIVE_INFINITY;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC26054g interfaceC26054g = (InterfaceC26054g) r10.get(i13);
            InterfaceC28518e0 interfaceC28518e0 = interfaceC26054g instanceof InterfaceC28518e0 ? (InterfaceC28518e0) interfaceC26054g : null;
            if (interfaceC28518e0 == null || !interfaceC28518e0.mo77540c()) {
                int iM101176G = AbstractC32417h.m101176G(c26068u.m77565h());
                int i14 = -c26068u.m77565h().f103178l;
                int i15 = c26068u.m77565h().f103182p;
                C26062o c26062o = (C26062o) interfaceC26054g;
                int i16 = c26062o.f103199p;
                int i17 = c26062o.f103198o;
                int i18 = c26068u.m77565h().f103180n;
                float fMo51269a = i17 - this.f69312b.mo51269a(iM101176G, i16, i14, i15);
                if (fMo51269a <= 0.0f && fMo51269a > f15) {
                    f15 = fMo51269a;
                }
                if (fMo51269a >= 0.0f && fMo51269a < f14) {
                    f14 = fMo51269a;
                }
            }
        }
        char c3 = Math.abs(f13) >= ((C26061n) c26068u.f103223f.getValue()).f103175i.mo743q0(AbstractC17833k.f69346a) ? f13 > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c3 == 0) {
            if (Math.abs(f14) <= Math.abs(f15)) {
                f15 = f14;
            }
        } else if (c3 == 1) {
            f15 = f14;
        } else if (c3 != 2) {
            f15 = 0.0f;
        }
        if (f15 == Float.POSITIVE_INFINITY || f15 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f15;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // p206i0.InterfaceC17834l
    /* JADX INFO: renamed from: b */
    public final float mo46567b(float f13, float f14) {
        float fAbs = Math.abs(f14);
        C26061n c26061nM77565h = this.f69311a.m77565h();
        int i13 = 0;
        if (!c26061nM77565h.f103177k.isEmpty()) {
            ?? r10 = c26061nM77565h.f103177k;
            int size = r10.size();
            Iterator it = ((Iterable) r10).iterator();
            while (it.hasNext()) {
                i13 += ((C26062o) ((InterfaceC26054g) it.next())).f103199p;
            }
            i13 /= size;
        }
        float f15 = fAbs - i13;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        return Math.signum(f14) * f15;
    }
}
