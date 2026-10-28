package km1;

import a31.C0341c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b30.C2561k6;
import b91.C2886a;
import c11.C3837d;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import io2.C20769k0;
import j11.C21214q;
import java.util.Locale;
import jp1.C21852d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kf0.C22429d;
import l83.C23454a0;
import lz0.AbstractC24821f;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27246d;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p163g1.C15079m3;
import p208i2.AbstractC17911t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: km1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkm1/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lkm1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "headerTitle", "daysLeftDisplay", "q", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "title", "subtitle", "Lkd1/o;", "imageSource", "o", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Landroidx/compose/runtime/Composer;II)V", "Lkm1/c;", NotificationCompat.CATEGORY_PROGRESS, "s", "(Landroidx/compose/ui/Modifier;Lkm1/c;Landroidx/compose/runtime/Composer;II)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22585b {
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:76:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m65450i(Modifier modifier, C22588e viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(231530760);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            z4 = false;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C22429d(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier3), null, 3);
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(viewState))) {
                    z4 = true;
                }
                z16 = z15 | z4;
                objM87133R = c28655q.m87133R();
                if (z16 || objM87133R == c28676v0) {
                    objM87133R = new C21214q(23, function4, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3427x, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, null, z14 ? AbstractC22587d.m65469c(viewState.getBackgroundStyle()) : null, null, 0.0f, AbstractC37817c.m121344e(1856576376, c28655q, new C0341c(z14, viewState, function4, 12)), c28655q, 12582912, 110);
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(modifier2, viewState, function3, i13, i14, 14);
            }
        }
        i15 |= 384;
        function2 = function1;
        z4 = false;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C22429d(24);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                z14 = true;
            } else {
                z14 = false;
            }
            Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier3), null, 3);
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i15 & 112) != 32) {
                z4 = true;
            } else {
                z4 = true;
            }
            z16 = z15 | z4;
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new C21214q(23, function4, viewState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21214q(23, function4, viewState);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3427x2, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, null, z14 ? AbstractC22587d.m65469c(viewState.getBackgroundStyle()) : null, null, 0.0f, AbstractC37817c.m121344e(1856576376, c28655q, new C0341c(z14, viewState, function4, 12)), c28655q, 12582912, 110);
            function3 = function4;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(modifier2, viewState, function3, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m65451j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m65452k(Function1 function1, C22588e c22588e) {
        function1.invoke(c22588e.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m65453l(boolean z4, C22588e c22588e, Function1 function1, Composer composer, int i13) {
        Modifier modifierM3357b;
        AbstractC17911t abstractC17911tM65468b;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            if (!z4 || (abstractC17911tM65468b = AbstractC22587d.m65468b(c22588e.getBackgroundStyle())) == null || (modifierM3357b = AbstractC1092a.m3357b(c2314t, abstractC17911tM65468b, null, 0.0f, 6)) == null) {
                modifierM3357b = c2314t;
            }
            float f13 = 2 * 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3409f.mo3471e(modifierM3357b), f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            C28655q c28655q2 = c28655q;
            m65458q(AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), c22588e.getHeaderTitle(), c22588e.getDaysLeftDisplay(), c28655q2, 6, 0);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
            if (z4) {
                c28655q2.m87150e0(1495689860);
                m65456o(null, c22588e.getTitle(), c22588e.getSubtitle(), c22588e.getImageSource(), c28655q2, AbstractC22403o.f87638a << 9, 1);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1495911014);
                m65460s(null, c22588e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), c28655q2, 0, 1);
                c28655q2.m87173q(false);
            }
            C27256h c27256hM65472b = c22588e.getCtaButton();
            if (c27256hM65472b == null) {
                c28655q2.m87150e0(1496073329);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1496073330);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
                C27246d c27246d = new C27246d();
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87157i(c27256hM65472b);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3837d(function1, c27256hM65472b, 4);
                    c28655q2.m87172p0(objM87133R);
                }
                C28655q c28655q3 = c28655q2;
                c27246d.Compose(modifierM3409f2, c27256hM65472b, (Function1) objM87133R, c28655q3, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            }
            AbstractC30007c.m91851u(c2314t, f13, c28655q2, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m65454m(Function1 function1, C27256h c27256h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c27256h.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m65455n(Modifier modifier, C22588e c22588e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m65450i(modifier, c22588e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m65456o(Modifier modifier, String str, String str2, AbstractC22403o abstractC22403o, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        float f13;
        Modifier modifier4;
        C2314t c2314t;
        boolean z4;
        boolean z13;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1965622910);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(str2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q2.m87153g(abstractC22403o) : c28655q2.m87157i(abstractC22403o) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier5 = i16 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier5);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
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
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
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
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            float f14 = 4;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(1, f14, c2305k, c28655q2, 6);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            if (str == null) {
                c28655q2.m87150e0(-1711876179);
                c28655q2.m87173q(false);
                z4 = false;
                modifier4 = modifier5;
                c28655q = c28655q2;
                c2314t = c2314t2;
                f13 = f14;
            } else {
                c28655q2.m87150e0(-1711876178);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                f13 = f14;
                modifier4 = modifier5;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                z4 = false;
                c28655q.m87173q(false);
            }
            if (str2 == null) {
                c28655q.m87150e0(-1711621328);
                c28655q.m87173q(z4);
                z13 = z4;
            } else {
                c28655q.m87150e0(-1711621327);
                C38072d c38072d2 = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(str2, null, c38072d2.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getB2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q3;
                z13 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (abstractC22403o == null) {
                c28655q.m87150e0(-1680101491);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-1680101490);
                C28655q c28655q4 = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(18 * f13, c2314t), null, null, 0.0f, null, c28655q4, 432, 120);
                c28655q = c28655q4;
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(modifier3, str, str2, abstractC22403o, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m65457p(Modifier modifier, String str, String str2, AbstractC22403o abstractC22403o, int i13, int i14, Composer composer, int i15) {
        m65456o(modifier, str, str2, abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m65458q(Modifier modifier, String str, String str2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C2314t c2314t;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-701713856);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a sh4 = c38072d.m121952e(c28655q, i17).getSh4();
            int i18 = C2886a.f11498d << 18;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q, (i15 >> 3) & 14, i18, 196602);
            c28655q = c28655q;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (str2 == null) {
                c28655q.m87150e0(660943790);
                c28655q.m87173q(false);
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(660943791);
                c2314t = c2314t2;
                AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            float f13 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(r43.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q, i17).getWhite50(), c28655q, 432, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2561k6(modifier3, str, str2, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m65459r(Modifier modifier, String str, String str2, int i13, int i14, Composer composer, int i15) {
        m65458q(modifier, str, str2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m65460s(Modifier modifier, C22586c c22586c, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C22586c c22586c2;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2020758864);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            c22586c2 = c22586c;
            i15 |= c28655q.m87153g(c22586c2) ? 32 : 16;
        } else {
            c22586c2 = c22586c;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 0.5d) * 8);
            C2306l c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C39111m c39111m = AbstractC39083d.f168140a;
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(c39111m);
            Modifier modifier5 = modifier4;
            String strM65462a = c22586c2.getCurrentValue();
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a n13 = c38072d.m121952e(c28655q, i17).getN6();
            long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM65462a, withAlignmentLineElement, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n13, null, c28655q, 0, i18, 196600);
            WithAlignmentLineElement withAlignmentLineElement2 = new WithAlignmentLineElement(AbstractC39083d.f168141b);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, withAlignmentLineElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC30795n.m94707h(AbstractC11266d.m30461o("/", c22586c.getTotalValue()), new WithAlignmentLineElement(c39111m), c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getN8(), null, c28655q, 0, i18, 196600);
            float f13 = 4;
            float f14 = 1 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(new WithAlignmentLineElement(c39111m), f14, 0.0f, 0.0f, 0.0f, 14);
            String upperCase = c22586c.getLabel().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC30795n.m94707h(upperCase, modifierM3398t, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getFormLabel(), null, c28655q, 0, i18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f13, c2314t));
            AbstractC24821f.m72736b(null, c22586c.getPercentValue(), 100, c22586c.getProgressBarBrush(), c38072d.m121949b(c28655q, i17).getWhite10(), false, f14, c28655q, 1769856, 1);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(modifier3, i13, c22586c, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m65461t(Modifier modifier, C22586c c22586c, int i13, int i14, Composer composer, int i15) {
        m65460s(modifier, c22586c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
