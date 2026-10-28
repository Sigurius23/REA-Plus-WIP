package p510u0;

import com.google.android.material.datepicker.C5020n;
import p000.AbstractC11266d;
import p268k0.AbstractC22086a;
import p294l3.C23254g;
import p412q3.C29869e0;
import p412q3.C29883q;
import p412q3.InterfaceC29873g0;
import p412q3.InterfaceC29884r;

/* JADX INFO: renamed from: u0.u1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34361u1 {

    /* JADX INFO: renamed from: a */
    public static final C5020n f144370a = new C5020n(C29883q.f122109a, 0, 0);

    /* JADX INFO: renamed from: a */
    public static final C29869e0 m108667a(InterfaceC29873g0 interfaceC29873g0, C23254g c23254g) {
        C29869e0 c29869e0Mo43546a = interfaceC29873g0.mo43546a(c23254g);
        int length = c23254g.f92135x.length();
        C23254g c23254g2 = c29869e0Mo43546a.f122088a;
        InterfaceC29884r interfaceC29884r = c29869e0Mo43546a.f122089b;
        int length2 = c23254g2.f92135x.length();
        int iMin = Math.min(length, 100);
        for (int i13 = 0; i13 < iMin; i13++) {
            m108668b(interfaceC29884r.mo15749x(i13), length2, i13);
        }
        m108668b(interfaceC29884r.mo15749x(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i14 = 0; i14 < iMin2; i14++) {
            m108669c(interfaceC29884r.mo15743n(i14), length, i14);
        }
        m108669c(interfaceC29884r.mo15743n(length2), length, length2);
        return new C29869e0(c23254g2, new C5020n(interfaceC29884r, c23254g.f92135x.length(), c23254g2.f92135x.length()));
    }

    /* JADX INFO: renamed from: b */
    public static final void m108668b(int i13, int i14, int i15) {
        boolean z4 = false;
        if (i13 >= 0 && i13 <= i14) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i15, i13, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbM30465s.append(i14);
        sbM30465s.append(']');
        AbstractC22086a.m63160c(sbM30465s.toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m108669c(int i13, int i14, int i15) {
        boolean z4 = false;
        if (i13 >= 0 && i13 <= i14) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i15, i13, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbM30465s.append(i14);
        sbM30465s.append(']');
        AbstractC22086a.m63160c(sbM30465s.toString());
    }
}
