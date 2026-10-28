package p292l1;

import a00.C0072g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import ku2.C22837a;
import l01.C23038j;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p043c4.C3948a0;
import p163g1.C14946a;
import p163g1.C15023h;
import p291l0.C22976l1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23060a {

    /* JADX INFO: renamed from: a */
    public static final float f90936a = 280;

    /* JADX INFO: renamed from: b */
    public static final float f90937b = 560;

    /* JADX INFO: renamed from: c */
    public static final C28596b0 f90938c;

    static {
        float f13 = 24;
        new C22976l1(f13, f13, f13, f13);
        float f14 = 16;
        AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f14, 7);
        AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f14, 7);
        AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f13, 7);
        f90938c = new C28596b0(new C22837a(26));
    }

    /* JADX INFO: renamed from: a */
    public static final void m67040a(float f13, float f14, C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-917637668);
        if (c28655q.m87135U(i13 & 1, (i13 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C15023h(f13, f14, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC18489d0.m53384y(6, c37816b, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14946a(f13, f14, c37816b, i13, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67041b(InterfaceC4339a interfaceC4339a, Modifier modifier, C3948a0 c3948a0, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(24925658);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c3948a0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            ((C23116j1) c28655q.m87161k(f90938c)).m67094a(new C0072g(interfaceC4339a, modifier, c3948a0, c37816b, 20), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23038j(interfaceC4339a, modifier, c3948a0, c37816b, i13, 4);
        }
    }
}
