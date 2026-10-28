package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.AbstractC4076n0;
import c41.C4034h0;
import c41.C4069m0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import java.util.List;
import kd1.AbstractC22399k;
import kd1.EnumC22400l;
import l83.C23454a0;
import l83.C23465k;
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
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import z72.C40160f;

/* JADX INFO: renamed from: zc1.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\",\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "", "Ll83/k;", "", "Lc41/m0;", "a", "Ljava/util/List;", "getAlertTileStates", "()Ljava/util/List;", "AlertTileStates", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40396m {

    /* JADX INFO: renamed from: a */
    private static final List<C23465k> f174347a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Title");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Subtitle");
        int i13 = 1;
        AbstractC4076n0.a aVar = new AbstractC4076n0.a(null, i13, 0 == true ? 1 : 0);
        EnumC22400l enumC22400l = EnumC22400l.CARD_EXPIRED;
        C23465k c23465k = new C23465k("Error with subtitle", new C4069m0(textResourceM21278l, textResourceM21278l2, aVar, enumC22400l, null, null, null, 112, null));
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Title");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Subtitle");
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        int i14 = 112;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        C23465k c23465k2 = new C23465k("Error with subtitle and setting the title color", new C4069m0(textResourceM21278l3, textResourceM21278l4, new AbstractC4076n0.a(enumC39333f), EnumC22400l.CRITICAL_OUTAGE, null, null, str, i14, defaultConstructorMarker));
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        C9598e c9598e = null;
        String str2 = null;
        String str3 = null;
        C23465k c23465k3 = new C23465k("Error with no subtitle", new C4069m0(AbstractC8693b.m21278l("Title"), null, new AbstractC4076n0.a(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), enumC22400l, c9598e, str2, str3, 114, defaultConstructorMarker2));
        C23465k c23465k4 = new C23465k("Warning with subtitle", new C4069m0(AbstractC8693b.m21278l("Title"), AbstractC8693b.m21278l("Subtitle"), new AbstractC4076n0.e(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), enumC22400l, c9598e, str2, str3, 112, defaultConstructorMarker2));
        C23465k c23465k5 = new C23465k("Warning with subtitle and setting the title color", new C4069m0(AbstractC8693b.m21278l("Title"), AbstractC8693b.m21278l("Subtitle"), new AbstractC4076n0.e(enumC39333f), EnumC22400l.MAJOR_OUTAGE, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, i14, defaultConstructorMarker));
        C23465k c23465k6 = new C23465k("Warning with no subtitle", new C4069m0(AbstractC8693b.m21278l("Title"), null, new AbstractC4076n0.e(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), enumC22400l, null, null, null, 114, null));
        String str4 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        f174347a = AbstractC37056f.m118959K(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, new C23465k("Maintenance alert", new C4069m0(AbstractC8693b.m21278l("Title"), AbstractC8693b.m21278l("Subtitle"), AbstractC4076n0.c.f16558d, EnumC22400l.MAINTENANCE, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str4, 112, objArr)), new C23465k("Unknown alert ", new C4069m0(AbstractC8693b.m21278l("Title"), AbstractC8693b.m21278l("Subtitle"), new AbstractC4076n0.a(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), EnumC22400l.UNKNOWN, objArr3, str4, null, 112, objArr2)));
    }

    /* JADX INFO: renamed from: c */
    public static final void m130252c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1057098876);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            c28655q.m87150e0(1844569969);
            for (C23465k c23465k : f174347a) {
                AbstractC22399k.m64473c((String) c23465k.f92937w, c28655q, 0);
                float f13 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f13, c2314t));
                C4034h0 c4034h0 = new C4034h0();
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) c23465k.f92938x;
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40160f(9);
                    c28655q.m87172p0(objM87133R);
                }
                c4034h0.Compose(interfaceC25312u, (Function1) objM87133R, c28655q, C4069m0.f16535h | 48 | (C4034h0.f16377a << 6));
                AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m130253d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m130254e(int i13, Composer composer, int i14) {
        m130252c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
