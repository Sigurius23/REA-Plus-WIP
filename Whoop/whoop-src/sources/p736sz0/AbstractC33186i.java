package p736sz0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import h00.C16506i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sz0.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "icon", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33186i {
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m105160b(TextResource title, TextResource subtitle, int i13, Modifier modifier, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(126690127);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(title) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(subtitle) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        int i17 = i15 & 8;
        if (i17 == 0) {
            if ((i14 & 3072) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 2.5d) * f13, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, modifier4)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
                int i18 = i16 >> 3;
                C27430e c27430eM107874S = AbstractC34132o.m107874S(i13, c28655q, (i18 & 112) | 6);
                C38072d c38072d = C38072d.f163053a;
                modifier3 = modifier4;
                AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(4 * f13, c2314t), c38072d.m121949b(c28655q, 6).getWhite30(), c28655q, 432, 0);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q, i16 & 14), AbstractC1099a.m3396r(c2314t, 0.0f, 2 * f13, 1), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(subtitle, c28655q, i18 & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                c28655q = c28655q;
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16506i(i13, i14, i15, modifier3, title, subtitle);
            }
        }
        i16 |= 3072;
        modifier2 = modifier;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 2.5d) * f14, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, modifier4)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
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
            int i19 = i16 >> 3;
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(i13, c28655q, (i19 & 112) | 6);
            C38072d c38072d2 = C38072d.f163053a;
            modifier3 = modifier4;
            AbstractC15005f3.m43108b(c27430eM107874S2, null, AbstractC1102d.m3419p(4 * f14, c2314t), c38072d2.m121949b(c28655q, 6).getWhite30(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q, i16 & 14), AbstractC1099a.m3396r(c2314t, 0.0f, 2 * f14, 1), c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH3(), null, c28655q, 48, 0, 196088);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(subtitle, c28655q, i19 & 14), null, c38072d2.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16506i(i13, i14, i15, modifier3, title, subtitle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m105161c(TextResource textResource, TextResource textResource2, int i13, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m105160b(textResource, textResource2, i13, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
