package l72;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import g72.C15552f;
import io2.C20769k0;
import j72.AbstractC21403h;
import j72.C21398c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l01.C23045q;
import l60.C23374a;
import l83.C23454a0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.C23016z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: l72.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lj72/c;", "viewState", "Lkotlin/Function1;", "Lj72/h;", "Ll83/a0;", "onViewEvent", "d", "(Lj72/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23398e {
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0321  */
    /* JADX WARN: Code duplicated, block: B:69:0x0323  */
    /* JADX WARN: Code duplicated, block: B:72:0x032a  */
    /* JADX WARN: Code duplicated, block: B:74:0x032e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0337  */
    /* JADX WARN: Code duplicated, block: B:78:0x033a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0346  */
    /* JADX WARN: Code duplicated, block: B:86:0x034e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0382  */
    /* JADX WARN: Code duplicated, block: B:91:0x038c  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m67756d(C21398c c21398c, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        Function1 function5;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        int iHashCode2;
        int iHashCode3;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Function1 function6;
        Object objM87133R2;
        C21398c viewState = c21398c;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1444468866);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
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
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23374a(10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 2 * f13, 0.0f, 2);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                function5 = function4;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C23016z c23016z = C23016z.f90757a;
                i16 = i15;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c23016z.m66779c(modifierM3407d, true, 1.0f), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC22953f.m66715b(c28655q, c23016z.m66779c(c2314t, true, 1.0f));
                float f14 = 4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(60 * f14, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                AbstractC22953f.m66715b(c28655q, c23016z.m66779c(c2314t, true, 1.0f));
                float f15 = f14 * f13;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 0.0f, f15, 1);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                String strM21275i = AbstractC8693b.m21275i(c21398c.getSupertitle(), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a h7 = c38072d.m121952e(c28655q, i18).getH4();
                long white70 = c38072d.m121949b(c28655q, i18).getWhite70();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21275i, null, white70, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21275i(c21398c.getTitle(), c28655q, 0), AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f13, 1), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getT2(), null, c28655q, 48, i19, 196600);
                boolean z15 = false;
                AbstractC30795n.m94707h(AbstractC8693b.m21275i(c21398c.getSubtitle(), c28655q, 0), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 0, i19, 196602);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c21398c.getNextButtonText());
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f15, 0.0f, 5 * f13, 5);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        viewState = c21398c;
                        if (c28655q.m87157i(viewState)) {
                        }
                    } else {
                        viewState = c21398c;
                    }
                    z14 = z13 | z15;
                    objM87133R = c28655q.m87133R();
                    if (!z14 || objM87133R == c28676v0) {
                        function6 = function5;
                        objM87133R = new C23045q(function6, viewState, 4);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                    }
                    AbstractC27292z.m82343j(modifierM3398t, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable << 18, 0, 8126);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    function3 = function6;
                } else {
                    viewState = c21398c;
                }
                z15 = true;
                z14 = z13 | z15;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R = new C23045q(function6, viewState, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C23045q(function6, viewState, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27292z.m82343j(modifierM3398t, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable << 18, 0, 8126);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function3, i14, 16);
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
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23374a(10);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f16 = 8;
            Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t2), 2 * f16, 0.0f, 2);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
            InterfaceC0221l.f734a.getClass();
            function5 = function4;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
            C23016z c23016z2 = C23016z.f90757a;
            i16 = i15;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(c23016z2.m66779c(modifierM3407d2, true, 1.0f), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, C2299e.f9111N, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t2, true, 1.0f));
            float f17 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(60 * f17, c2314t2), null, null, 0.0f, null, c28655q, 432, 120);
            AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t2, true, 1.0f));
            float f18 = f17 * f16;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t2, 0.0f, f18, 1);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            String strM21275i2 = AbstractC8693b.m21275i(c21398c.getSupertitle(), c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            C2886a h13 = c38072d2.m121952e(c28655q, i110).getH4();
            long white71 = c38072d2.m121949b(c28655q, i110).getWhite70();
            int i111 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21275i2, null, white71, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h13, null, c28655q, 0, i111, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(c21398c.getTitle(), c28655q, 0), AbstractC1099a.m3396r(c2314t2, 0.0f, 1 * f16, 1), c38072d2.m121949b(c28655q, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getT2(), null, c28655q, 48, i111, 196600);
            boolean z16 = false;
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(c21398c.getSubtitle(), c28655q, 0), null, c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB1(), null, c28655q, 0, i111, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c21398c.getNextButtonText());
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, f18, 0.0f, 5 * f16, 5);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    viewState = c21398c;
                    if (c28655q.m87157i(viewState)) {
                    }
                } else {
                    viewState = c21398c;
                }
                z14 = z13 | z16;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R = new C23045q(function6, viewState, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C23045q(function6, viewState, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27292z.m82343j(modifierM3398t2, false, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable << 18, 0, 8126);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                viewState = c21398c;
            }
            z16 = true;
            z14 = z13 | z16;
            objM87133R = c28655q.m87133R();
            if (z14) {
                function6 = function5;
                objM87133R = new C23045q(function6, viewState, 4);
                c28655q.m87172p0(objM87133R);
            } else {
                function6 = function5;
                objM87133R = new C23045q(function6, viewState, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM3398t2, false, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable << 18, 0, 8126);
            c28655q = c28655q;
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function3, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m67757e(AbstractC21403h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m67758f(Function1 function1, C21398c c21398c) {
        function1.invoke(new AbstractC21403h.d(c21398c.getButtonNextId(), new C15552f(null, null, null, 7, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m67759g(C21398c c21398c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m67756d(c21398c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
