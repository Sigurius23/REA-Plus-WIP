package zk2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import tk2.C33897o;
import wb3.AbstractC37056f;
import x81.C38072d;
import zi1.C40670c0;

/* JADX INFO: renamed from: zk2.y */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Ltk2/o;", "itemState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Ltk2/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "LiveSleepIconSize", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40864y {

    /* JADX INFO: renamed from: a */
    private static final float f176107a = 18 * 8;

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x020a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0214  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m132451b(C33897o itemState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-370222947);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(itemState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier4), 2 * f13, 0.0f, 2), 0.0f, 6 * f13, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
                Modifier modifier5 = modifier4;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(itemState.getIconRes(), c28655q, 0), null, AbstractC1102d.m3419p(f176107a, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f13, c2314t));
                String strM21273g = AbstractC8693b.m21273g(itemState.getTitleRes(), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C2886a t14 = c38072d.m121952e(c28655q, i17).getT1();
                long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
                C36775k c36775k = new C36775k(3);
                int i18 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21273g, null, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, t14, null, c28655q, 0, i18, 196090);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 1.5d) * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(itemState.getSubtitleRes(), c28655q, 0), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i18, 196090);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(22 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(itemState.getHrMessageRes(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 4 * f13, 7), c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 48, i18, 196088);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40670c0(itemState, i13, modifier3, i14, 4);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier4), 2 * f14, 0.0f, 2), 0.0f, 6 * f14, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
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
            Modifier modifier6 = modifier4;
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(itemState.getIconRes(), c28655q, 0), null, AbstractC1102d.m3419p(f176107a, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f14, c2314t));
            String strM21273g2 = AbstractC8693b.m21273g(itemState.getTitleRes(), c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a t15 = c38072d2.m121952e(c28655q, i19).getT1();
            long brandWhite2 = c38072d2.m121949b(c28655q, i19).getBrandWhite();
            C36775k c36775k2 = new C36775k(3);
            int i110 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21273g2, null, brandWhite2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, t15, null, c28655q, 0, i110, 196090);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 1.5d) * f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(itemState.getSubtitleRes(), c28655q, 0), null, c38072d2.m121949b(c28655q, i19).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getB1(), null, c28655q, 0, i110, 196090);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(22 * f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(itemState.getHrMessageRes(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 4 * f14, 7), c38072d2.m121949b(c28655q, i19).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getB1(), null, c28655q, 48, i110, 196088);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(itemState, i13, modifier3, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m132452c(C33897o c33897o, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132451b(c33897o, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
