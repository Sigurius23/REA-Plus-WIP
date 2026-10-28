package p748zc1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import h11.C16606a;
import h11.C16613h;
import h11.EnumC16612g;
import i11.AbstractC17862e;
import i11.C17864g;
import ih0.AbstractC18489d0;
import kd1.AbstractC22399k;
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
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import z72.C40160f;

/* JADX INFO: renamed from: zc1.x1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001aA\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0002\u001a\u000f\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0002\u001a\u000f\u0010\u0012\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0002\u001a\u000f\u0010\u0013\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0002\u001a\u000f\u0010\u0014\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0002¨\u0006\u0015"}, m65681d2 = {"Ll83/a0;", "q", "(Landroidx/compose/runtime/Composer;I)V", "s", "", HttpHeaders.DATE, "day", "dayOfMonth", "Lh11/g;", "style", "", "showDot", "isSelected", "Lh11/h;", "H", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZ)Lh11/h;", "y", "B", "n", "v", "E", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40509x1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m131124A(int i13, Composer composer, int i14) {
        m131157y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m131125B(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(127125284);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Feb 9th - Mar 9, 2022");
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40499w1(0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17862e.m51358q(null, false, null, textResourceM21278l, false, true, "", "", null, null, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 9) | 14376960, 384, 3847);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m131126C(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m131127D(int i13, Composer composer, int i14) {
        m131125B(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final void m131128E(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(865504192);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Feb 9th - Mar 9, 2022");
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40160f(29);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17862e.m51358q(null, true, null, textResourceM21278l, false, false, "", "", null, null, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 9) | 14377008, 384, 3845);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m131129F(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m131130G(int i13, Composer composer, int i14) {
        m131128E(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final C16613h m131131H(String str, String str2, String str3, EnumC16612g enumC16612g, boolean z4, boolean z13) {
        return new C16613h(new C16606a(str2, str3), null, z13, enumC16612g, str, null, null, z4, false, null, null, null, false, null, 16226, null);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ C16613h m131132I(String str, String str2, String str3, EnumC16612g enumC16612g, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z13 = false;
        }
        return m131131H(str, str2, str3, enumC16612g, z4, z13);
    }

    /* JADX INFO: renamed from: n */
    public static final void m131146n(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(640010078);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Feb 9th - Mar 9, 2022");
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40499w1(1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17862e.m51358q(null, false, null, textResourceM21278l, true, false, "", "", null, null, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 9) | 14376960, 384, 3847);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m131147o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m131148p(int i13, Composer composer, int i14) {
        m131146n(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m131149q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1740047004);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            AbstractC22399k.m64473c("Date Selector", c28655q, 6);
            float f13 = 4;
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            AbstractC22399k.m64475e("Enabled", c28655q, 6);
            m131157y(c28655q, 0);
            AbstractC22399k.m64475e("Forward Enabled", c28655q, 6);
            m131125B(c28655q, 0);
            AbstractC22399k.m64475e("Backward Enabled", c28655q, 6);
            m131146n(c28655q, 0);
            AbstractC22399k.m64475e("Disabled", c28655q, 6);
            m131154v(c28655q, 0);
            AbstractC22399k.m64475e("Loading", c28655q, 6);
            m131128E(c28655q, 0);
            AbstractC22399k.m64475e("With Date Strip", c28655q, 6);
            m131151s(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m131150r(int i13, Composer composer, int i14) {
        m131149q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m131151s(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1870056754);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Wed, Aug 26");
            EnumC16612g enumC16612g = EnumC16612g.COMPLETED_JOURNAL;
            C16613h c16613hM131132I = m131132I("2026-08-24", "Mon", "24", enumC16612g, true, false, 32, null);
            C16613h c16613hM131132I2 = m131132I("2026-08-25", "Tue", "25", EnumC16612g.INCOMPLETE_JOURNAL, false, false, 32, null);
            C16613h c16613hM131131H = m131131H("2026-08-26", "Wed", "26", enumC16612g, true, true);
            EnumC16612g enumC16612g2 = EnumC16612g.INVALID;
            C17864g c17864g = new C17864g(AbstractC37056f.m118959K(c16613hM131132I, c16613hM131132I2, c16613hM131131H, m131132I("2026-08-27", "Thu", "27", enumC16612g2, false, false, 32, null), m131132I("2026-08-28", "Fri", "28", enumC16612g2, false, false, 32, null)), EnumC16313m0.ANNUAL_REPORT, null, null, 12, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40160f(26);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17862e.m51358q(null, false, null, textResourceM21278l, true, false, "", "", null, null, null, c17864g, (Function1) objM87133R, c28655q, (TextResource.$stable << 9) | 14376960, (C17864g.f69527e << 3) | 384, 1799);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m131152t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m131153u(int i13, Composer composer, int i14) {
        m131151s(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m131154v(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(4846308);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Feb 9th - Mar 9, 2022");
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40160f(27);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17862e.m51358q(null, false, null, textResourceM21278l, false, false, "", "", null, null, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 9) | 14376960, 384, 3847);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m131155w(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m131156x(int i13, Composer composer, int i14) {
        m131154v(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m131157y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2056218971);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Feb 9th - Mar 9, 2022");
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40160f(28);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17862e.m51358q(null, false, null, textResourceM21278l, true, true, "", "", null, null, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 9) | 14376960, 384, 3847);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m131158z(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
