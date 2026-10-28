package p714k80;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import jp1.C21852d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: k80.q */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "Ll83/a0;", "b", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22288q {
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m64032b(AbstractC22403o image, TextResource title, String str, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        boolean z4;
        String str3;
        C28677v1 c28677v1M87180u;
        String str4;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        C38072d c38072d;
        int i17;
        String str5;
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2014846487);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(image) : c28655q.m87157i(image) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i18 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                float f14 = 4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a | (i16 & 14), 3), null, AbstractC1102d.m3419p(25 * f14, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14 * f13, 0.0f, 0.0f, 13);
                String strM21274h = AbstractC8693b.m21274h(title, c28655q, ((i16 >> 3) & 14) | TextResource.$stable);
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                if (str4 == null) {
                    c28655q.m87150e0(2090760889);
                    c28655q.m87173q(false);
                    str5 = str4;
                } else {
                    c28655q.m87150e0(2090760890);
                    str5 = str4;
                    AbstractC21048g.m58807M(str5, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * f13, 0.0f, 0.0f, 13), false, C21053l.f79834a.m58880a(null, c38072d.m121949b(c28655q, i17).getWhite70(), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32729), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                str3 = str5;
            } else {
                c28655q.m87138X();
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(image, title, str3, i13, i14, 10);
            }
        }
        i15 |= 384;
        str2 = str;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i18 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            float f15 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a | (i16 & 14), 3), null, AbstractC1102d.m3419p(25 * f15, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            f13 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, 0.0f, 13);
            String strM21274h2 = AbstractC8693b.m21274h(title, c28655q, ((i16 >> 3) & 14) | TextResource.$stable);
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            if (str4 == null) {
                c28655q.m87150e0(2090760889);
                c28655q.m87173q(false);
                str5 = str4;
            } else {
                c28655q.m87150e0(2090760890);
                str5 = str4;
                AbstractC21048g.m58807M(str5, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * f13, 0.0f, 0.0f, 13), false, C21053l.f79834a.m58880a(null, c38072d.m121949b(c28655q, i17).getWhite70(), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32729), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            str3 = str5;
        } else {
            c28655q.m87138X();
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(image, title, str3, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m64033c(AbstractC22403o abstractC22403o, TextResource textResource, String str, int i13, int i14, Composer composer, int i15) {
        m64032b(abstractC22403o, textResource, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
