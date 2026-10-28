package p292l1;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import iw0.C20976j0;
import kf0.C22437l;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p133f1.C13996z;
import p163g1.C15122q6;
import p291l0.AbstractC22989q;
import p316m1.AbstractC24899e0;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.t3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23178t3 {

    /* JADX INFO: renamed from: a */
    public static final float f91693a = 22;

    /* JADX INFO: renamed from: b */
    public static final C11347e2 f91694b = AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36310a, 2);

    /* JADX INFO: renamed from: a */
    public static final void m67142a(C37816b c37816b, Composer composer, int i13) {
        C37816b c37816b2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1033612924);
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            String strM73002i = AbstractC24899e0.m73002i(c28655q, R.string.m3c_bottom_sheet_drag_handle_description);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(C2299e.f9111N);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, horizontalAlignElement);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c37816b2 = c37816b;
            AbstractC23185u4.m67145b(AbstractC23167r4.m67134a(c28655q), AbstractC37817c.m121344e(2059851063, c28655q, new C15122q6(strM73002i, 4)), AbstractC23185u4.m67146c(c28655q), null, false, c37816b2, c28655q, 100663344);
            c28655q.m87173q(true);
        } else {
            c37816b2 = c37816b;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13996z(c37816b2, i13, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C23196w3 m67143b(boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        EnumC23202x3 enumC23202x3 = EnumC23202x3.f91820w;
        boolean z13 = true;
        boolean z14 = (i14 & 1) != 0 ? false : z4;
        final float f13 = C23078d.f91053c;
        final float f14 = C23078d.f91054d;
        C28655q c28655q = (C28655q) composer;
        final InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        boolean zM87153g = c28655q.m87153g(interfaceC39171c) | c28655q.m87147d(f13);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            final int i15 = 0;
            objM87133R = new InterfaceC4339a() { // from class: l1.r3
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    float fMo743q0;
                    switch (i15) {
                        case 0:
                            fMo743q0 = interfaceC39171c.mo743q0(f13);
                            break;
                        default:
                            fMo743q0 = interfaceC39171c.mo743q0(f13);
                            break;
                    }
                    return Float.valueOf(fMo743q0);
                }
            };
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(interfaceC39171c) | c28655q.m87147d(f14);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            final int i16 = 1;
            objM87133R2 = new InterfaceC4339a() { // from class: l1.r3
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    float fMo743q0;
                    switch (i16) {
                        case 0:
                            fMo743q0 = interfaceC39171c.mo743q0(f14);
                            break;
                        default:
                            fMo743q0 = interfaceC39171c.mo743q0(f14);
                            break;
                    }
                    return Float.valueOf(fMo743q0);
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
        boolean z15 = false;
        Object[] objArr = {Boolean.valueOf(z14), function1, false};
        C28539n0 c28539n0 = new C28539n0(10, new C22437l(10), new C20976j0(z14, interfaceC4339a, interfaceC4339a2, function1, z15));
        boolean zM87153g3 = ((((i13 & 14) ^ 6) > 4 && c28655q.m87155h(z14)) || (i13 & 6) == 4) | c28655q.m87153g(interfaceC4339a) | c28655q.m87153g(interfaceC4339a2) | ((((i13 & 896) ^ 384) > 256 && c28655q.m87149e(enumC23202x3.ordinal())) || (i13 & 384) == 256) | c28655q.m87153g(function1);
        if ((((i13 & 7168) ^ 3072) <= 2048 || !c28655q.m87155h(false)) && (i13 & 3072) != 2048) {
            z13 = false;
        }
        boolean z16 = zM87153g3 | z13;
        Object objM87133R3 = c28655q.m87133R();
        if (z16 || objM87133R3 == c28676v0) {
            C23172s3 c23172s3 = new C23172s3(z14, interfaceC4339a, interfaceC4339a2, function1, z15);
            c28655q.m87172p0(c23172s3);
            objM87133R3 = c23172s3;
        }
        return (C23196w3) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R3, c28655q, 0);
    }
}
