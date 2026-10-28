package r31;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import f21.C14028d;
import f21.EnumC14025a;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import i91.AbstractC18249c;
import java.util.Iterator;
import java.util.Locale;
import l11.AbstractC23221c;
import l11.C23223e;
import l11.InterfaceC23222d;
import l83.C23454a0;
import m83.C25271y;
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
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p730qt2.C30617w;
import qz0.AbstractC30795n;
import r71.AbstractC31052b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u001a\u0010\u0016\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0015\u0010\r¨\u0006\u0017"}, m65681d2 = {"Lr31/f;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lr31/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Lr31/f;", "getPreviewDefaultSelectionWidgetViewState", "()Lr31/f;", "previewDefaultSelectionWidgetViewState", "b", "getPreviewLoadingSelectionWidgetViewState", "previewLoadingSelectionWidgetViewState", "c", "getPreviewDisabledSelectionWidgetViewState", "previewDisabledSelectionWidgetViewState", "getPreviewPrefixTextSelectionWidgetViewState", "previewPrefixTextSelectionWidgetViewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30909d {

    /* JADX INFO: renamed from: a */
    private static final C30911f f127474a;

    /* JADX INFO: renamed from: b */
    private static final C30911f f127475b;

    /* JADX INFO: renamed from: c */
    private static final C30911f f127476c;

    /* JADX INFO: renamed from: d */
    private static final C30911f f127477d;

    static {
        EnumC30910e enumC30910e = EnumC30910e.ENABLED;
        int whoopIcon = EnumC16313m0.AI_SPARKLE.toWhoopIcon();
        f127474a = new C30911f("selection-widget-1", "Stretching", enumC30910e, AbstractC37056f.m118958J(new C14028d("callout-1", Integer.valueOf(whoopIcon), "You slept well", EnumC14025a.COMPACT)), AbstractC23221c.m67166A(), null, null, 96, null);
        C23223e c23223eM67193b = C23223e.m67193b(AbstractC23221c.m67166A(), null, null, null, null, null, null, null, InterfaceC23222d.d.f91941a, false, null, null, null, 3967, null);
        C25271y c25271y = C25271y.f99162w;
        f127475b = new C30911f("selection-widget-1", "Stretching", enumC30910e, c25271y, c23223eM67193b, null, null, 96, null);
        f127476c = new C30911f("selection-widget-1", "Stretching", EnumC30910e.DISABLED, c25271y, C23223e.m67193b(AbstractC23221c.m67166A(), null, null, null, null, null, null, null, InterfaceC23222d.b.f91939a, false, null, null, null, 3967, null), null, null, 96, null);
        f127477d = new C30911f("selection-widget-1", "Stretching", enumC30910e, c25271y, C23223e.m67193b(AbstractC23221c.m67166A(), null, "REMOVE (2)", null, null, null, null, null, null, false, null, "REMOVE", null, 3069, null), null, null, 96, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0206 A[LOOP:0: B:74:0x0200->B:76:0x0206, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x021d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0228  */
    /* JADX WARN: Code duplicated, block: B:83:0x023d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0248  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m95027d(C30911f viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        Modifier modifierM3409f;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        Iterator<T> it;
        InterfaceC25312u button;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-661313698);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C30617w(18);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC30910e.DISABLED) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (((Boolean) c28655q.m87161k(AbstractC31052b.m95598y())).booleanValue()) {
                        c28655q.m87150e0(-180987271);
                        modifierM3409f = AbstractC1102d.m3424u(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.75f, c2314t);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-180876539);
                        c28655q.m87173q(false);
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    }
                    float f13 = 3 * 4;
                    float f14 = 2 * 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC18249c.m52567e(AbstractC15751g.m44456i(1, modifier4.mo3471e(modifierM3409f), AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f13)), AbstractC18249c.m52570h(AbstractC15673b0.m44002P()), AbstractC33253j.m105489e(f13), null, 4, null));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
                    String upperCase = viewState.getTitle().toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    C38072d c38072d = C38072d.f163053a;
                    Modifier modifier5 = modifier4;
                    AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtM(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    if (z13) {
                        c28655q.m87150e0(-1334775532);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C30617w(19);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        function5 = (Function1) objM87133R;
                    } else {
                        c28655q.m87150e0(-1334743509);
                        c28655q.m87173q(false);
                        function5 = function4;
                    }
                    c28655q.m87150e0(1342419060);
                    it = viewState.m95035f().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function5, c28655q, 0, 6);
                    }
                    c28655q.m87173q(false);
                    button = viewState.getButton();
                    if (button == null) {
                        c28655q.m87150e0(-1334561137);
                    } else {
                        c28655q.m87150e0(-1334561136);
                        AbstractC25303l.m74291r(button, null, null, function5, c28655q, 0, 6);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C30908c(viewState, modifier3, function3, i13, i14);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C30617w(18);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC30910e.DISABLED) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (((Boolean) c28655q.m87161k(AbstractC31052b.m95598y())).booleanValue()) {
                    c28655q.m87150e0(-180987271);
                    modifierM3409f = AbstractC1102d.m3424u(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.75f, c2314t);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-180876539);
                    c28655q.m87173q(false);
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                }
                float f15 = 3 * 4;
                float f16 = 2 * 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f16, AbstractC18249c.m52567e(AbstractC15751g.m44456i(1, modifier4.mo3471e(modifierM3409f), AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f15)), AbstractC18249c.m52570h(AbstractC15673b0.m44002P()), AbstractC33253j.m105489e(f15), null, 4, null));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
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
                String upperCase2 = viewState.getTitle().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                C38072d c38072d2 = C38072d.f163053a;
                Modifier modifier6 = modifier4;
                AbstractC30795n.m94707h(upperCase2, null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getBtM(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                if (z13) {
                    c28655q.m87150e0(-1334775532);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C30617w(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    function5 = (Function1) objM87133R;
                } else {
                    c28655q.m87150e0(-1334743509);
                    c28655q.m87173q(false);
                    function5 = function4;
                }
                c28655q.m87150e0(1342419060);
                it = viewState.m95035f().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function5, c28655q, 0, 6);
                }
                c28655q.m87173q(false);
                button = viewState.getButton();
                if (button == null) {
                    c28655q.m87150e0(-1334561137);
                } else {
                    c28655q.m87150e0(-1334561136);
                    AbstractC25303l.m74291r(button, null, null, function5, c28655q, 0, 6);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier3 = modifier6;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30908c(viewState, modifier3, function3, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C30617w(18);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC30910e.DISABLED) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (((Boolean) c28655q.m87161k(AbstractC31052b.m95598y())).booleanValue()) {
                    c28655q.m87150e0(-180987271);
                    modifierM3409f = AbstractC1102d.m3424u(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.75f, c2314t);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-180876539);
                    c28655q.m87173q(false);
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                }
                float f17 = 3 * 4;
                float f18 = 2 * 8;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f18, AbstractC18249c.m52567e(AbstractC15751g.m44456i(1, modifier4.mo3471e(modifierM3409f), AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f17)), AbstractC18249c.m52570h(AbstractC15673b0.m44002P()), AbstractC33253j.m105489e(f17), null, 4, null));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f18), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                String upperCase3 = viewState.getTitle().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                C38072d c38072d3 = C38072d.f163053a;
                Modifier modifier7 = modifier4;
                AbstractC30795n.m94707h(upperCase3, null, c38072d3.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getBtM(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                if (z13) {
                    c28655q.m87150e0(-1334775532);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C30617w(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    function5 = (Function1) objM87133R;
                } else {
                    c28655q.m87150e0(-1334743509);
                    c28655q.m87173q(false);
                    function5 = function4;
                }
                c28655q.m87150e0(1342419060);
                it = viewState.m95035f().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function5, c28655q, 0, 6);
                }
                c28655q.m87173q(false);
                button = viewState.getButton();
                if (button == null) {
                    c28655q.m87150e0(-1334561137);
                } else {
                    c28655q.m87150e0(-1334561136);
                    AbstractC25303l.m74291r(button, null, null, function5, c28655q, 0, 6);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier3 = modifier7;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30908c(viewState, modifier3, function3, i13, i14);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C30617w(18);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC30910e.DISABLED) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (((Boolean) c28655q.m87161k(AbstractC31052b.m95598y())).booleanValue()) {
                c28655q.m87150e0(-180987271);
                modifierM3409f = AbstractC1102d.m3424u(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.75f, c2314t);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-180876539);
                c28655q.m87173q(false);
                modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            }
            float f19 = 3 * 4;
            float f110 = 2 * 8;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f110, AbstractC18249c.m52567e(AbstractC15751g.m44456i(1, modifier4.mo3471e(modifierM3409f), AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f19)), AbstractC18249c.m52570h(AbstractC15673b0.m44002P()), AbstractC33253j.m105489e(f19), null, 4, null));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f110), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            String upperCase4 = viewState.getTitle().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
            C38072d c38072d4 = C38072d.f163053a;
            Modifier modifier8 = modifier4;
            AbstractC30795n.m94707h(upperCase4, null, c38072d4.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getBtM(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            if (z13) {
                c28655q.m87150e0(-1334775532);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C30617w(19);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                function5 = (Function1) objM87133R;
            } else {
                c28655q.m87150e0(-1334743509);
                c28655q.m87173q(false);
                function5 = function4;
            }
            c28655q.m87150e0(1342419060);
            it = viewState.m95035f().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function5, c28655q, 0, 6);
            }
            c28655q.m87173q(false);
            button = viewState.getButton();
            if (button == null) {
                c28655q.m87150e0(-1334561137);
            } else {
                c28655q.m87150e0(-1334561136);
                AbstractC25303l.m74291r(button, null, null, function5, c28655q, 0, 6);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier3 = modifier8;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30908c(viewState, modifier3, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m95028e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m95029f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m95030g(C30911f c30911f, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m95027d(c30911f, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
