package r62;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import e93.AbstractC12889b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m62.C25121l;
import m62.C25122m;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17903p;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qk2.C30453i;
import qz0.AbstractC30795n;
import r12.C30856a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r62.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lm62/m;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "c", "(Lm62/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30988b {
    /* JADX INFO: renamed from: c */
    public static final void m95520c(C25122m viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1759231437);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            float f13 = 4;
            AbstractC12889b.m36263b(modifier3, AbstractC33253j.m105489e(f13 * f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkAlt(), null, 0.0f, AbstractC37817c.m121344e(-515393104, c28655q, new C30856a(viewState, 1)), c28655q, ((i15 >> 3) & 14) | 1572864, 56);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(viewState, i13, modifier2, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m95521d(C25122m c25122m, Composer composer, int i13) {
        boolean z4 = true;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String title = c25122m.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            C28655q c28655q2 = c28655q;
            c28655q2.m87150e0(-426456162);
            for (C25121l c25121l : c25122m.m73677a()) {
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q2, 54);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(new AbstractC22403o.a(c25121l.getIcon().toWhoopIcon()), null, null, c28655q2, AbstractC22403o.a.f87639c, 3);
                C38072d c38072d2 = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                C28655q c28655q3 = c28655q2;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3419p(5 * 4, c2314t), null, null, 0.0f, new C17903p(c38072d2.m121949b(c28655q2, i15).getWhite70(), 5), c28655q3, 432, 56);
                AbstractC30795n.m94707h(c25121l.getText(), null, c38072d2.m121949b(c28655q3, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i15).getB2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                c28655q2 = c28655q3;
                c28655q2.m87173q(true);
                z4 = true;
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m95522e(C25122m c25122m, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m95520c(c25122m, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
