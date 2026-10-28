package gz2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import ge0.C15728c;
import h51.C16934f;
import iz0.AbstractC21048g;
import iz0.C21054m;
import kz2.AbstractC22927d;
import kz2.AbstractC22929f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15079m3;
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
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: gz2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lm91/u;", "footer", "Lcom/whoop/design/util/TextResource;", "footerText", "Lkotlin/Function1;", "Lcom/whoop/whooplabs/feature/navigation/c;", "Ll83/a0;", "onNavEvent", "Landroidx/compose/ui/Modifier;", "modifier", "c", "(Lm91/u;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16337d {
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x0176  */
    /* JADX WARN: Code duplicated, block: B:71:0x0178  */
    /* JADX WARN: Code duplicated, block: B:76:0x0183  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m46539c(InterfaceC25312u interfaceC25312u, TextResource textResource, Function1 onNavEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean zIsFeatureEnabled;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        float f14;
        boolean z13;
        float f15;
        boolean z14;
        boolean z15;
        Object objM87133R;
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2126868149);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
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
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("dwl-landing-v2");
                if (interfaceC25312u instanceof C16934f) {
                    c28655q.m87150e0(2123806208);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
                    if (textResource == null) {
                        c28655q.m87150e0(-1929489963);
                        c28655q.m87173q(false);
                        z14 = false;
                        z13 = true;
                    } else {
                        c28655q.m87150e0(-1929489962);
                        String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable);
                        f13 = 0;
                        C21054m c21054mM58881b = C21054m.m58881b(AbstractC22927d.m66688a(c28655q, 0), null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, f13, 16383, null);
                        f14 = 8;
                        float f16 = ((float) 2.5d) * f14;
                        if (zIsFeatureEnabled) {
                            z13 = true;
                            f15 = 1 * f14;
                        } else {
                            z13 = true;
                            f15 = f13 * f14;
                        }
                        z14 = false;
                        AbstractC21048g.m58807M(strM21274h, AbstractC1099a.m3398t(c2314t, f16, 0.0f, f16, f15, 2), false, c21054mM58881b, null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 500);
                        c28655q.m87173q(false);
                    }
                    C25307p c25307pM66697b = AbstractC22929f.m66697b();
                    if ((i15 & 896) == 256) {
                        z15 = z13;
                    } else {
                        z15 = z14;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C15728c(onNavEvent, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifier3 = modifier4;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM66697b, null, (Function1) objM87133R, c28655q, (i15 & 14) | (C25307p.f99300b << 3), 4);
                    c28655q.m87173q(z13);
                    c28655q.m87173q(z14);
                } else {
                    modifier3 = modifier4;
                    c28655q.m87150e0(2124504855);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(interfaceC25312u, textResource, onNavEvent, modifier3, i13, i14, 4);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
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
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("dwl-landing-v2");
            if (interfaceC25312u instanceof C16934f) {
                c28655q.m87150e0(2123806208);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
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
                if (textResource == null) {
                    c28655q.m87150e0(-1929489963);
                    c28655q.m87173q(false);
                    z14 = false;
                    z13 = true;
                } else {
                    c28655q.m87150e0(-1929489962);
                    String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable);
                    f13 = 0;
                    C21054m c21054mM58881b2 = C21054m.m58881b(AbstractC22927d.m66688a(c28655q, 0), null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, f13, 16383, null);
                    f14 = 8;
                    float f17 = ((float) 2.5d) * f14;
                    if (zIsFeatureEnabled) {
                        z13 = true;
                        f15 = 1 * f14;
                    } else {
                        z13 = true;
                        f15 = f13 * f14;
                    }
                    z14 = false;
                    AbstractC21048g.m58807M(strM21274h2, AbstractC1099a.m3398t(c2314t, f17, 0.0f, f17, f15, 2), false, c21054mM58881b2, null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 500);
                    c28655q.m87173q(false);
                }
                C25307p c25307pM66697b2 = AbstractC22929f.m66697b();
                if ((i15 & 896) == 256) {
                    z15 = z13;
                } else {
                    z15 = z14;
                }
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C15728c(onNavEvent, 13);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15728c(onNavEvent, 13);
                    c28655q.m87172p0(objM87133R);
                }
                modifier3 = modifier4;
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM66697b2, null, (Function1) objM87133R, c28655q, (i15 & 14) | (C25307p.f99300b << 3), 4);
                c28655q.m87173q(z13);
                c28655q.m87173q(z14);
            } else {
                modifier3 = modifier4;
                c28655q.m87150e0(2124504855);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(interfaceC25312u, textResource, onNavEvent, modifier3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m46540d(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof ArticleTileModelEvent.Url) {
            function1.invoke(new AbstractC10840c.h(((ArticleTileModelEvent.Url) event).getUrl()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m46541e(InterfaceC25312u interfaceC25312u, TextResource textResource, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m46539c(interfaceC25312u, textResource, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
