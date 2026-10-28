package v61;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import java.util.Iterator;
import l83.C23454a0;
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
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import r80.AbstractC31061c;
import to1.C34015h;
import w61.AbstractC36861a;
import w61.AbstractC36862b;
import w61.AbstractC36863c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y61.C39260a;
import y61.C39261b;

/* JADX INFO: renamed from: v61.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ly61/a;", "group", "Lkotlin/Function1;", "Lv61/a;", "Ll83/a0;", "onCtaClicked", "c", "(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35738c {
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f A[LOOP:0: B:55:0x0169->B:57:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0185  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m113205c(C39260a group, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        String strM21274h;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Iterator<T> it;
        Object objM87133R;
        AbstractC22676k.m65750j(group, "group");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1261726962);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(group) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C34015h(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                strM21274h = AbstractC8693b.m21274h(group.getContentDescription(), c28655q, 0);
                float topXPercent = group.getTopXPercent();
                C29007a c29007aM88137b = C29007a.INSTANCE.m88137b();
                c2314t = C2314t.f9131w;
                Modifier modifierM88149j = AbstractC29011e.m88149j(c2314t, topXPercent, -1.0f, c29007aM88137b);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM88149j);
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
                if (group.getTopIcon() == null) {
                    c28655q.m87150e0(-925837729);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-925837728);
                    AbstractC36862b.m118224d(group, function4, c28655q, i15 & 126, 0);
                    AbstractC31061c.m95650z((float) 0.5d, 8, c2314t, c28655q, false);
                }
                if (group.getSecondaryIcon() != null) {
                    c28655q.m87150e0(-925601973);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(group.getSecondaryIcon().toWhoopIcon(), c28655q, 6), "", AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    AbstractC31061c.m95650z(1, 8, c2314t, c28655q, false);
                } else {
                    c28655q.m87150e0(-925234902);
                    if (group.getTopText() == null) {
                        c28655q.m87150e0(-925234903);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-925234902);
                        AbstractC36863c.m118231d(group, function4, c28655q, i15 & 126, 0);
                        AbstractC31061c.m95650z(1, 8, c2314t, c28655q, false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                it = group.m125039d().iterator();
                while (it.hasNext()) {
                    AbstractC36861a.m118217c((C39261b) it.next(), strM21274h, c28655q, 0);
                }
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35737b(group, function3, i13, i14, 0);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C34015h(24);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            strM21274h = AbstractC8693b.m21274h(group.getContentDescription(), c28655q, 0);
            float topXPercent2 = group.getTopXPercent();
            C29007a c29007aM88137b2 = C29007a.INSTANCE.m88137b();
            c2314t = C2314t.f9131w;
            Modifier modifierM88149j2 = AbstractC29011e.m88149j(c2314t, topXPercent2, -1.0f, c29007aM88137b2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM88149j2);
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
            if (group.getTopIcon() == null) {
                c28655q.m87150e0(-925837729);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-925837728);
                AbstractC36862b.m118224d(group, function4, c28655q, i15 & 126, 0);
                AbstractC31061c.m95650z((float) 0.5d, 8, c2314t, c28655q, false);
            }
            if (group.getSecondaryIcon() != null) {
                c28655q.m87150e0(-925601973);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(group.getSecondaryIcon().toWhoopIcon(), c28655q, 6), "", AbstractC1102d.m3419p(5 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                AbstractC31061c.m95650z(1, 8, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(-925234902);
                if (group.getTopText() == null) {
                    c28655q.m87150e0(-925234903);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-925234902);
                    AbstractC36863c.m118231d(group, function4, c28655q, i15 & 126, 0);
                    AbstractC31061c.m95650z(1, 8, c2314t, c28655q, false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            it = group.m125039d().iterator();
            while (it.hasNext()) {
                AbstractC36861a.m118217c((C39261b) it.next(), strM21274h, c28655q, 0);
            }
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35737b(group, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m113206d(C35736a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m113207e(C39260a c39260a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m113205c(c39260a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
