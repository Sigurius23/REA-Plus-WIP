package p704dk2;

import ak2.AbstractC0952a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2541i2;
import bk2.AbstractC3357d;
import bk2.AbstractC3360g;
import bk2.InterfaceC3355b;
import c93.InterfaceC4339a;
import d30.C11546l;
import df2.C12000a;
import dh0.C12040a;
import gy0.AbstractC16276e;
import java.io.IOException;
import kotlin.C2032u;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dk2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lbk2/g;", "viewState", "", "forceLandscapePresentation", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "Lkotlin/Function1;", "Lbk2/b;", "onViewEvent", "Luj2/a;", "onAnalyticsEvent", "Lak2/a;", "onNavigationEvent", "i", "(Lbk2/g;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "tilt-graph_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12121h {
    /* JADX INFO: renamed from: i */
    public static final void m33518i(AbstractC3360g viewState, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 onAnalyticsEvent, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        InterfaceC4339a interfaceC4339a2;
        Function1 function3;
        Function1 function4;
        InterfaceC4339a interfaceC4339a3;
        Function1 function5;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1690585824);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i19 = i15;
        if (c28655q.m87135U(i19 & 1, (i19 & 9363) != 9362)) {
            if (i16 != 0) {
                z4 = false;
            }
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C12000a(12);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            if (i18 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C12040a(16);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function1;
            }
            if ((i14 & 32) != 0) {
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12040a(17);
                    c28655q.m87172p0(objM87133R3);
                }
                function5 = (Function1) objM87133R3;
            } else {
                function5 = function2;
            }
            AbstractC12115b.m33493d(z4, AbstractC37817c.m121344e(406097676, c28655q, new C2032u((Object) viewState, (Object) interfaceC4339a3, onAnalyticsEvent, (Object) function3, 8)), c28655q, ((i19 >> 3) & 14) | 48);
            interfaceC4339a2 = interfaceC4339a3;
            z13 = z4;
            function4 = function5;
        } else {
            c28655q.m87138X();
            z13 = z4;
            interfaceC4339a2 = interfaceC4339a;
            function3 = function1;
            function4 = function2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(viewState, z13, interfaceC4339a2, function3, onAnalyticsEvent, function4, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m33519j() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m33520k(InterfaceC3355b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m33521l(AbstractC0952a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m33522m(AbstractC3360g abstractC3360g, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (abstractC3360g instanceof AbstractC3360g.c) {
            c28655q.m87150e0(-866908534);
            AbstractC12123j.m33559s((AbstractC3360g.c) abstractC3360g, interfaceC4339a, function1, function2, c28655q, 0, 0);
            c28655q.m87173q(false);
        } else {
            boolean z4 = abstractC3360g instanceof AbstractC3360g.a;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-866616142);
                boolean zM87153g = c28655q.m87153g(function2) | c28655q.m87153g(abstractC3360g);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C11546l(7, function2, (AbstractC3360g.a) abstractC3360g);
                    c28655q.m87172p0(objM87133R);
                }
                Function0.m33503f((InterfaceC4339a) objM87133R, interfaceC4339a, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                if (!(abstractC3360g instanceof AbstractC3360g.b)) {
                    throw AbstractC11895b.m32003v(-582155798, c28655q, false);
                }
                c28655q.m87150e0(-866334290);
                Modifier modifierM33588a = AbstractC12128o.m33588a(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM33588a);
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
                InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C12000a(13);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12040a(18);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC35684p.m113047h(null, dVarM113128a, false, 0.0f, 0, interfaceC4339a2, (Function1) objM87133R3, null, null, c28655q, 1769472, 413);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m33523n(Function1 function1, AbstractC3360g abstractC3360g) {
        function1.invoke(new AbstractC3357d.a(((AbstractC3360g.a) abstractC3360g).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), null, false, 6, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m33524o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m33525p(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m33526q(AbstractC3360g abstractC3360g, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m33518i(abstractC3360g, z4, interfaceC4339a, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
