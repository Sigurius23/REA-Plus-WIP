package p724or1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import hy0.AbstractC17766l1;
import hy0.C17769m1;
import java.util.Locale;
import js2.C21927e;
import l41.C23329a;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import of2.C27900d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: or1.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\u0007\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\t\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function2;", "", "", "Ll83/a0;", "onClick", "Lkotlin/Function0;", "onToolbarLeftClick", "e", "(Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "action", "delayEnabled", "internal-tooling_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function2 {
    /* JADX INFO: renamed from: e */
    public static final void m85147e(InterfaceC4351m onClick, InterfaceC4339a onToolbarLeftClick, Composer composer, int i13) {
        int i14;
        InterfaceC4351m interfaceC4351m;
        C28655q c28655q;
        InterfaceC28601c1 interfaceC28601c1;
        AbstractC22676k.m65750j(onClick, "onClick");
        AbstractC22676k.m65750j(onToolbarLeftClick, "onToolbarLeftClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1741888227);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(onClick) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onToolbarLeftClick) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44032d0 = AbstractC15673b0.m44032d0(c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44032d0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Iterable Tool");
            C38072d c38072d = C38072d.f163053a;
            AbstractC6719b.m20143d(null, new AbstractC6721d.c(null, textResourceM21278l, null, Integer.valueOf(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, null, null, null, null, 8181, null), null, onToolbarLeftClick, null, null, c28655q2, (AbstractC6721d.c.f25657p << 3) | ((i15 << 6) & 7168), 53);
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, c2314t);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Action Name");
            TextResource.C8691e c8691eM50972d = C17769m1.f69096a.m50972d();
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Enter Action Name Here");
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C21927e(27, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            int i16 = TextResource.$stable;
            AbstractC17766l1.m50964e(modifierM3394p, textResourceM21278l2, c8691eM50972d, textResourceM21278l3, textResourceM21267a, 0, 0, false, false, false, null, false, function1, c28655q2, (i16 << 3) | 6 | (TextResource.C8691e.f25898b << 6) | (i16 << 9) | (i16 << 12), 384, 4064);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * f14, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q2, 6);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            String upperCase = "5 second delay".toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            float f15 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), 1 * f15, f13 * f15);
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(upperCase, modifierM3395q, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q2, 0, C2886a.f11498d << 18, 196600);
            float f16 = f14 * f15;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f16, c2314t));
            boolean zM85150h = m85150h(interfaceC28601c3);
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c3;
                objM87133R4 = new C21927e(28, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R4);
            } else {
                interfaceC28601c1 = interfaceC28601c3;
            }
            InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c1;
            AbstractC29641d.m91043e(null, zM85150h, false, 0L, null, null, (Function1) objM87133R4, c28655q2, 1572864, 61);
            c28655q2.m87173q(true);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f16, AbstractC1102d.m3409f(1.0f, c2314t));
            EnumC27284v enumC27284v = EnumC27284v.TextMedium;
            long jM125377a = c38072d.m121949b(c28655q2, i17).getAccentAction();
            boolean z4 = (i15 & 14) == 4;
            Object objM87133R5 = c28655q2.m87133R();
            if (z4 || objM87133R5 == c28676v0) {
                interfaceC4351m = onClick;
                objM87133R5 = new C23329a(interfaceC4351m, interfaceC28601c2, interfaceC28601c4, 1);
                c28655q2.m87172p0(objM87133R5);
            } else {
                interfaceC4351m = onClick;
            }
            AbstractC27282u.m82292h(modifierM3394p2, enumC27284v, "Navigate", true, jM125377a, null, false, (InterfaceC4339a) objM87133R5, c28655q2, 3510, 96);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            interfaceC4351m = onClick;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(interfaceC4351m, onToolbarLeftClick, i13, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final String m85148f(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m85149g(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m85150h(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    private static final void m85151i(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m85152j(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m85149g(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m85153k(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m85151i(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m85154l(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        interfaceC4351m.invoke(m85148f(interfaceC28601c1), Boolean.valueOf(m85150h(interfaceC28601c2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m85155m(InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m85147e(interfaceC4351m, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
