package bb2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.AbstractC3760m1;
import p077d0.AbstractC11348f;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bb2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "pageCount", "activePage", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(IILandroidx/compose/runtime/Composer;II)V", "", "isActive", "d", "(ZLandroidx/compose/runtime/Composer;I)V", "Li2/x;", "dotColor", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2930f {
    /* JADX INFO: renamed from: d */
    private static final void m8541d(boolean z4, Composer composer, int i13) {
        int i14;
        long jM53363d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1136565271);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (z4) {
                c28655q.m87150e0(1317536897);
                jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(1317537982);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(jM53363d, AbstractC11348f.m30574v(300, 0, null, 6), null, c28655q, 48, 12);
            float f13 = 2 * 4;
            Modifier modifierM3421r = AbstractC1102d.m3421r(C2314t.f9131w, f13, f13);
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2M11569a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2928d(f13, interfaceC28670t2M11569a, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3421r, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2929e(z4, i13, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final long m8542e(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m8543f(float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jM8542e = m8542e(interfaceC28670t2);
        float fMo743q0 = Canvas.mo743q0(f13);
        InterfaceC22131e.m63374D(Canvas, jM8542e, 0L, (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32), (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) << 32) | (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) & 4294967295L), null, 0.0f, 242);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m8544g(boolean z4, int i13, Composer composer, int i14) {
        m8541d(z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m8545h(final int i13, final int i14, Composer composer, final int i15, final int i16) {
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1641743365);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if (c28655q.m87135U(i17 & 1, (i17 & 19) != 18)) {
            if (i18 != 0) {
                i13 = 0;
            }
            if (i19 != 0) {
                i14 = 0;
            }
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22971k c22971kM66747j = AbstractC22977m.m66747j(2 * 8, C2299e.f9111N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66747j, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            c28655q.m87150e0(-279277268);
            int i24 = 0;
            while (i24 < i13) {
                m8541d(i24 == i14, c28655q, 0);
                i24++;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: bb2.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC2930f.m8546i(i13, i14, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m8546i(int i13, int i14, int i15, int i16, Composer composer, int i17) {
        m8545h(i13, i14, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
