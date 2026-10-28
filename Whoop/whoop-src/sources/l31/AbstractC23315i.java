package l31;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b21.AbstractC2333f;
import b21.C2332e;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.graph.LayoutDirection;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import jh3.AbstractC21702c;
import k71.C22241a0;
import l83.C23454a0;
import l83.C23465k;
import m83.C25271y;
import p026b2.C2314t;
import p292l1.C23091f0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.AbstractC39058k;
import y11.C39059l;
import y11.EnumC39048a;

/* JADX INFO: renamed from: l31.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ll83/a0;", "j", "(Landroidx/compose/runtime/Composer;I)V", "Ly11/a;", "fillColor", "", "Ly11/l;", "t", "(Ly11/a;)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23315i {
    /* JADX INFO: renamed from: j */
    public static final void m67483j(Composer composer, int i13) {
        C28655q c28655q;
        Float fValueOf = Float.valueOf(20.0f);
        Float fValueOf2 = Float.valueOf(80.0f);
        Float fValueOf3 = Float.valueOf(50.0f);
        Float fValueOf4 = Float.valueOf(0.5f);
        Float fValueOf5 = Float.valueOf(60.0f);
        Float fValueOf6 = Float.valueOf(40.0f);
        Float fValueOf7 = Float.valueOf(55.0f);
        Float fValueOf8 = Float.valueOf(45.0f);
        Float fValueOf9 = Float.valueOf(100.0f);
        Float fValueOf10 = Float.valueOf(75.0f);
        Float fValueOf11 = Float.valueOf(25.0f);
        Float fValueOf12 = Float.valueOf(0.0f);
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(787155050);
        if (c28655q2.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("title");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("9%");
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("0:47");
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(":03");
            C23465k c23465k = new C23465k(fValueOf6, fValueOf5);
            C38072d c38072d = C38072d.f163053a;
            long jM125430y = c38072d.m121949b(c28655q2, 6).getBrandWhite();
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C23091f0(19);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC39058k.m124517i(null, textResourceM21278l, null, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, jM125430y, false, false, C25271y.f99162w, false, c23465k, null, false, false, null, (InterfaceC4339a) objM87133R, c28655q2, 805306368, 1572864, 62853);
            float f13 = 4;
            float f14 = f13 * f13;
            C2314t c2314t = C2314t.f9131w;
            TextResource textResourceM61133d = AbstractC21702c.m61133d(c2314t, f14, c28655q2, "title");
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("subtitle");
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l("9%");
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l("0:47");
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(":03");
            List<C2332e> listM7193a = AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf12, fValueOf4), new C23465k(fValueOf4, Float.valueOf(30.0f)), new C23465k(fValueOf6, fValueOf3), new C23465k(fValueOf5, Float.valueOf(70.0f)), new C23465k(fValueOf2, Float.valueOf(90.0f))));
            C23465k c23465k2 = new C23465k(fValueOf6, fValueOf5);
            long jM125430y2 = c38072d.m121949b(c28655q2, 6).getBrandWhite();
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C23091f0(20);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC39058k.m124517i(null, textResourceM61133d, textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, textResourceM21278l8, jM125430y2, false, false, listM7193a, false, c23465k2, null, false, false, null, (InterfaceC4339a) objM87133R2, c28655q2, 0, 1572864, 62849);
            TextResource textResourceM61133d2 = AbstractC21702c.m61133d(c2314t, f14, c28655q2, "title");
            TextResource textResourceM21278l9 = AbstractC8693b.m21278l("9%");
            TextResource textResourceM21278l10 = AbstractC8693b.m21278l("0:47");
            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(":03");
            List<C2332e> listM7193a2 = AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf, fValueOf11), new C23465k(fValueOf3, fValueOf5), new C23465k(fValueOf2, Float.valueOf(95.0f))));
            C23465k c23465k3 = new C23465k(fValueOf, fValueOf6);
            long jM125397h0 = c38072d.m121949b(c28655q2, 6).getSleepDeepSleep();
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C23091f0(21);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC39058k.m124517i(null, textResourceM61133d2, null, textResourceM21278l9, textResourceM21278l10, textResourceM21278l11, jM125397h0, false, false, listM7193a2, false, c23465k3, null, false, false, null, (InterfaceC4339a) objM87133R3, c28655q2, 0, 1572864, 62853);
            TextResource textResourceM61133d3 = AbstractC21702c.m61133d(c2314t, f14, c28655q2, "title");
            TextResource textResourceM21278l12 = AbstractC8693b.m21278l("9%");
            TextResource textResourceM21278l13 = AbstractC8693b.m21278l("0:47");
            TextResource textResourceM21278l14 = AbstractC8693b.m21278l(":03");
            List<C2332e> listM7193a3 = AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf12, fValueOf11), new C23465k(fValueOf10, fValueOf9)));
            C23465k c23465k4 = new C23465k(fValueOf8, fValueOf7);
            long jM125371X = c38072d.m121949b(c28655q2, 6).getRecovery();
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C23091f0(22);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC39058k.m124517i(null, textResourceM61133d3, null, textResourceM21278l12, textResourceM21278l13, textResourceM21278l14, jM125371X, true, false, listM7193a3, false, c23465k4, null, false, false, null, (InterfaceC4339a) objM87133R4, c28655q2, 12582912, 1572864, 62725);
            TextResource textResourceM61133d4 = AbstractC21702c.m61133d(c2314t, f14, c28655q2, "Drilldown");
            TextResource textResourceM21278l15 = AbstractC8693b.m21278l("9%");
            TextResource textResourceM21278l16 = AbstractC8693b.m21278l("0:47");
            TextResource textResourceM21278l17 = AbstractC8693b.m21278l(":03");
            List<C2332e> listM7193a4 = AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf12, fValueOf11), new C23465k(fValueOf10, fValueOf9)));
            C23465k c23465k5 = new C23465k(fValueOf8, fValueOf7);
            long jM125403k0 = c38072d.m121949b(c28655q2, 6).getStrain();
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C23091f0(23);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC39058k.m124517i(null, textResourceM61133d4, null, textResourceM21278l15, textResourceM21278l16, textResourceM21278l17, jM125403k0, true, true, listM7193a4, false, c23465k5, null, false, false, null, (InterfaceC4339a) objM87133R5, c28655q2, 113246208, 1572864, 62469);
            TextResource textResourceM21278l18 = AbstractC8693b.m21278l("Drilldown");
            TextResource textResourceM21278l19 = AbstractC8693b.m21278l("9%");
            TextResource textResourceM21278l20 = AbstractC8693b.m21278l("0:47");
            TextResource textResourceM21278l21 = AbstractC8693b.m21278l(":03");
            List<C2332e> listM7193a5 = AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf12, fValueOf11), new C23465k(fValueOf10, fValueOf9)));
            C23465k c23465k6 = new C23465k(fValueOf8, fValueOf7);
            long jM125403k1 = c38072d.m121949b(c28655q2, 6).getStrain();
            Object objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C23091f0(24);
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC39058k.m124517i(null, textResourceM21278l18, null, textResourceM21278l19, textResourceM21278l20, textResourceM21278l21, jM125403k1, true, true, listM7193a5, false, c23465k6, null, false, false, null, (InterfaceC4339a) objM87133R6, c28655q2, 113246208, 1572864, 62469);
            TextResource textResourceM21278l22 = AbstractC8693b.m21278l("Title");
            TextResource textResourceM21278l23 = AbstractC8693b.m21278l("9%");
            TextResource textResourceM21278l24 = AbstractC8693b.m21278l("0:47");
            TextResource textResourceM21278l25 = AbstractC8693b.m21278l(":03");
            List<C2332e> listM7193a6 = AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf12, fValueOf11), new C23465k(fValueOf10, fValueOf9)));
            C23465k c23465k7 = new C23465k(fValueOf8, fValueOf7);
            long jM125401j0 = c38072d.m121949b(c28655q2, 6).getSleepRemSleep();
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C23091f0(25);
                c28655q2.m87172p0(objM87133R7);
            }
            AbstractC39058k.m124517i(null, textResourceM21278l22, null, textResourceM21278l23, textResourceM21278l24, textResourceM21278l25, jM125401j0, true, true, listM7193a6, false, c23465k7, null, true, true, null, (InterfaceC4339a) objM87133R7, c28655q2, 113246208, 1600512, 37893);
            TextResource textResourceM21278l26 = AbstractC8693b.m21278l("Title");
            TextResource textResourceM21278l27 = AbstractC8693b.m21278l("9%");
            TextResource textResourceM21278l28 = AbstractC8693b.m21278l("0:47");
            TextResource textResourceM21278l29 = AbstractC8693b.m21278l(":03");
            List<C2332e> listM7193a7 = AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf12, fValueOf11), new C23465k(fValueOf10, fValueOf9)));
            C23465k c23465k8 = new C23465k(fValueOf8, fValueOf7);
            long jM125401j1 = c38072d.m121949b(c28655q2, 6).getSleepRemSleep();
            Object objM87133R8 = c28655q2.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C23091f0(26);
                c28655q2.m87172p0(objM87133R8);
            }
            c28655q = c28655q2;
            AbstractC39058k.m124517i(null, textResourceM21278l26, null, textResourceM21278l27, textResourceM21278l28, textResourceM21278l29, jM125401j1, true, true, listM7193a7, false, c23465k8, null, false, true, null, (InterfaceC4339a) objM87133R8, c28655q, 113246208, 1600512, 37893);
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC37056f.m118959K(c23454a0, c23454a0, c23454a0, c23454a0, c23454a0, c23454a0, c23454a0, c23454a0, c23454a0, c23454a0, c23454a0, c23454a0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m67484k() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m67485l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m67486m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m67487n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m67488o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m67489p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m67490q() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m67491r() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m67492s(int i13, Composer composer, int i14) {
        m67483j(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final List<C39059l> m67493t(EnumC39048a fillColor) {
        AbstractC22676k.m65750j(fillColor, "fillColor");
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Title");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("9%");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("0:47");
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(10.0f);
        C23465k c23465k = new C23465k(fValueOf, fValueOf2);
        Float fValueOf3 = Float.valueOf(20.0f);
        Float fValueOf4 = Float.valueOf(30.0f);
        C23465k c23465k2 = new C23465k(fValueOf3, fValueOf4);
        Float fValueOf5 = Float.valueOf(40.0f);
        Float fValueOf6 = Float.valueOf(50.0f);
        C23465k c23465k3 = new C23465k(fValueOf5, fValueOf6);
        Float fValueOf7 = Float.valueOf(60.0f);
        Float fValueOf8 = Float.valueOf(70.0f);
        C23465k c23465k4 = new C23465k(fValueOf7, fValueOf8);
        Float fValueOf9 = Float.valueOf(80.0f);
        Float fValueOf10 = Float.valueOf(90.0f);
        DefaultConstructorMarker defaultConstructorMarker = null;
        C39059l c39059l = new C39059l(null, textResourceM21278l, null, textResourceM21278l2, textResourceM21278l3, null, fillColor, null, false, false, AbstractC2333f.m7193a(AbstractC37056f.m118959K(c23465k, c23465k2, c23465k3, c23465k4, new C23465k(fValueOf9, fValueOf10))), false, new C23465k(fValueOf5, fValueOf7), false, false, null, 60325, defaultConstructorMarker);
        C39059l c39059l2 = new C39059l(null, AbstractC8693b.m21278l("Title"), AbstractC8693b.m21278l("Subtitle"), AbstractC8693b.m21278l("9%"), AbstractC8693b.m21278l("0:47"), AbstractC8693b.m21278l(":03"), fillColor, null, false, false, AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf, fValueOf2), new C23465k(fValueOf3, fValueOf4), new C23465k(fValueOf5, fValueOf6), new C23465k(fValueOf7, fValueOf8), new C23465k(fValueOf9, fValueOf10))), false, new C23465k(fValueOf5, fValueOf7), false, false, null, 60289, defaultConstructorMarker);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Title");
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("9%");
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("0:47");
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(":03");
        Float fValueOf11 = Float.valueOf(25.0f);
        C23465k c23465k5 = new C23465k(fValueOf, fValueOf11);
        Float fValueOf12 = Float.valueOf(75.0f);
        Float fValueOf13 = Float.valueOf(100.0f);
        List<C2332e> listM7193a = AbstractC2333f.m7193a(AbstractC37056f.m118959K(c23465k5, new C23465k(fValueOf12, fValueOf13)));
        Float fValueOf14 = Float.valueOf(45.0f);
        Float fValueOf15 = Float.valueOf(55.0f);
        boolean z4 = true;
        boolean z13 = false;
        LayoutDirection layoutDirection = null;
        C39059l c39059l3 = new C39059l(null, textResourceM21278l4, null, textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, fillColor, null, z4, false, listM7193a, false, new C23465k(fValueOf14, fValueOf15), false, z13, layoutDirection, 60037, defaultConstructorMarker);
        C39059l c39059l4 = new C39059l(null, AbstractC8693b.m21278l("Drilldown"), null, AbstractC8693b.m21278l("9%"), AbstractC8693b.m21278l("0:47"), AbstractC8693b.m21278l(":03"), fillColor, null, z4, true, AbstractC2333f.m7193a(AbstractC37056f.m118959K(new C23465k(fValueOf, fValueOf11), new C23465k(fValueOf12, fValueOf13))), false, new C23465k(fValueOf14, fValueOf15), false, z13, layoutDirection, 59525, defaultConstructorMarker);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        C23465k c23465k6 = new C23465k(fValueOf, Float.valueOf(0.5f));
        Float fValueOf16 = Float.valueOf(1.0f);
        Float fValueOf17 = Float.valueOf(1.5f);
        List<C2332e> listM7193a2 = AbstractC2333f.m7193a(AbstractC37056f.m118959K(c23465k6, new C23465k(fValueOf16, fValueOf17), new C23465k(fValueOf17, Float.valueOf(2.0f)), new C23465k(fValueOf3, Float.valueOf(20.5f)), new C23465k(Float.valueOf(22.0f), Float.valueOf(22.3f)), new C23465k(Float.valueOf(23.0f), Float.valueOf(23.2f)), new C23465k(fValueOf4, Float.valueOf(30.2f)), new C23465k(fValueOf5, Float.valueOf(40.5f)), new C23465k(Float.valueOf(43.0f), Float.valueOf(44.0f)), new C23465k(Float.valueOf(98.0f), Float.valueOf(98.5f)), new C23465k(Float.valueOf(98.7f), Float.valueOf(98.9f)), new C23465k(Float.valueOf(99.0f), Float.valueOf(99.5f))));
        return AbstractC37056f.m118959K(c39059l, c39059l2, c39059l3, c39059l4, new C39059l(null, AbstractC8693b.m21278l("Drilldown"), null, AbstractC8693b.m21278l("9%"), AbstractC8693b.m21278l("0:47"), AbstractC8693b.m21278l(":03"), fillColor, modifierM3409f, true, true, listM7193a2, false, null, false, z13, layoutDirection, 63493, defaultConstructorMarker));
    }
}
