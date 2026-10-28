package p704dk2;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "forceLandscapePresentation", "Lkotlin/Function0;", "Ll83/a0;", "content", "d", "(ZLc93/m;Landroidx/compose/runtime/Composer;I)V", "tilt-graph_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12115b {
    /* JADX INFO: renamed from: d */
    public static final void m33493d(final boolean z4, final InterfaceC4351m content, Composer composer, final int i13) {
        int i14;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        Object obj;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-28627989);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(content) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            if (z4) {
                c28655q.m87150e0(1842251159);
                c28655q.m87173q(false);
                C28596b0 c28596b0 = AndroidCompositionLocals_androidKt.f4975a;
                Configuration configuration = (Configuration) c28655q.m87161k(c28596b0);
                boolean zM87153g = c28655q.m87153g(configuration);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    obj = objM87133R;
                    Configuration configuration2 = new Configuration(configuration);
                    if (configuration2.orientation != 2) {
                        configuration2.orientation = 2;
                        int i15 = configuration2.screenWidthDp;
                        configuration2.screenWidthDp = configuration2.screenHeightDp;
                        configuration2.screenHeightDp = i15;
                    }
                    c28655q.m87172p0(configuration2);
                    obj = configuration2;
                }
                obj = objM87133R;
                Configuration configuration3 = (Configuration) obj;
                AbstractC28683x.m87247a(c28596b0.mo86977a(configuration3), AbstractC37817c.m121344e(-877313877, c28655q, new C0003a0(23, configuration3, content)), c28655q, 56);
            } else {
                c28655q.m87150e0(1842212719);
                content.invoke(c28655q, Integer.valueOf((i14 >> 3) & 14));
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i16 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: dk2.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int i17 = i16;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i17) {
                            case 0:
                                return AbstractC12115b.m33494e(z4, content, i13, composer2, iIntValue);
                            default:
                                return AbstractC12115b.m33496g(z4, content, i13, composer2, iIntValue);
                        }
                    }
                };
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i17 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: dk2.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = i17;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i18) {
                        case 0:
                            return AbstractC12115b.m33494e(z4, content, i13, composer2, iIntValue);
                        default:
                            return AbstractC12115b.m33496g(z4, content, i13, composer2, iIntValue);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m33494e(boolean z4, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m33493d(z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m33495f(Configuration configuration, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3411h = AbstractC1102d.m3411h(configuration.screenHeightDp, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC11895b.m32007z(0, interfaceC4351m, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m33496g(boolean z4, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m33493d(z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
