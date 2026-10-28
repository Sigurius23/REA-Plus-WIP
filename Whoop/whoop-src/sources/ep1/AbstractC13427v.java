package ep1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp1.AbstractC11022i;
import cp1.C11016c;
import cp1.C11030q;
import d41.C11678d;
import dc0.C11901c;
import e11.C12582b;
import eo2.C13390j;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import java.io.IOException;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: ep1.v */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcp1/q;", "viewState", "Lkotlin/Function1;", "Lcp1/i;", "Ll83/a0;", "onViewEvent", "Lyn1/a;", "onAnalyticEvent", "n", "(Lcp1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "backgroundImage", "j", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13427v {
    /* JADX INFO: renamed from: j */
    private static final void m38100j(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(515801199);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i14 & 14), 3);
            abstractC22403o2 = abstractC22403o;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13406a(22);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3407d, (Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C13406a(23);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1099a.m3398t(AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R2), 0.0f, 0.0f, 0.0f, 20 * 8, 7), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o2, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m38101k(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m38102l(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69625b)), new C23465k(Float.valueOf(0.8f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m38103m(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m38100j(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x032b  */
    /* JADX WARN: Code duplicated, block: B:102:0x032d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0335  */
    /* JADX WARN: Code duplicated, block: B:108:0x033a  */
    /* JADX WARN: Code duplicated, block: B:109:0x033f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0361  */
    /* JADX WARN: Code duplicated, block: B:114:0x0363  */
    /* JADX WARN: Code duplicated, block: B:117:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x036c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0380  */
    /* JADX WARN: Code duplicated, block: B:123:0x038b  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0166  */
    /* JADX WARN: Code duplicated, block: B:75:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0171  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0320  */
    /* JADX WARN: Code duplicated, block: B:98:0x0322  */
    /* JADX INFO: renamed from: n */
    public static final void m38104n(C11030q viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function9;
        int iHashCode2;
        int i18;
        boolean z13;
        Object objM87133R;
        int i19;
        Function1 function10;
        boolean z14;
        int iHashCode3;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        C28676v0 c28676v1;
        Function1 function11;
        Function1 function12;
        boolean z18;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1424801419);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
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
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13406a(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13406a(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    m38100j(viewState.getImageUrl(), c28655q, AbstractC22403o.f87638a);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    C2305k c2305k = C2299e.f9111N;
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                    function9 = function8;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    TextResource textResourceM29666e = viewState.getNavigationTitle();
                    TextResource textResourceM29665d = viewState.getNavigationSubtitle();
                    i18 = i15 & 112;
                    if (i18 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C13390j(function7, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i25 = TextResource.$stable;
                    int i26 = i25 << 3;
                    i19 = i15;
                    function10 = function7;
                    AbstractC13424s.m38062e(textResourceM29666e, textResourceM29665d, 0, null, null, (InterfaceC4339a) objM87133R, c28655q, i25 | i26, 28);
                    if (1.0f > 0.0d) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(3 * 8, c2314t);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(viewState.getIcon().toWhoopIcon(), c28655q, 6);
                    float f13 = 4;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t);
                    C38072d c38072d = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, i27).getAccentPositiveTrend(), c28655q, 432, 0);
                    float f14 = f13 * f13;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                    String strM21274h = AbstractC8693b.m21274h(viewState.getDoneText(), c28655q, i25);
                    C2886a c2886aM8437r = c38072d.m121952e(c28655q, i27).getH4();
                    long jM125382b1 = c38072d.m121949b(c28655q, i27).getWhite50();
                    int i28 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i28, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i25), null, c38072d.m121949b(c28655q, i27).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getT1(), null, c28655q, 0, i28, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i25), null, c38072d.m121949b(c28655q, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getB1(), null, c28655q, 0, i28, 196602);
                    c28655q = c28655q;
                    AbstractC18489d0.m53380u(11, f13, c2314t, c28655q);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C11016c c11016cM29667f = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                    TextResource textResourceM29668g = viewState.getSaveButtonTitle();
                    if (i18 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i19 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            function11 = function10;
                            function12 = function9;
                        }
                        AbstractC13410e.m37926c(c11016cM29667f, textResourceM29668g, modifierM3409f, false, (InterfaceC4339a) objM87133R2, c28655q, i25 | 384 | i26, 8);
                        AbstractC25012a.m73392y(c28655q, true, true, true);
                        if (i18 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z18 || objM87133R3 == c28676v1) {
                            objM87133R3 = new C13390j(function11, 18);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                        function5 = function11;
                        function6 = function12;
                    }
                    function11 = function10;
                    function12 = function9;
                    objM87133R2 = new C11901c(function11, 1, function12);
                    c28655q.m87172p0(objM87133R2);
                    AbstractC13410e.m37926c(c11016cM29667f, textResourceM29668g, modifierM3409f, false, (InterfaceC4339a) objM87133R2, c28655q, i25 | 384 | i26, 8);
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    if (i18 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C13390j(function11, 18);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function11, 18);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                    function5 = function11;
                    function6 = function12;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12582b(i13, i14, 19, (Object) viewState, (Object) function6, function5);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13406a(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
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
                m38100j(viewState.getImageUrl(), c28655q, AbstractC22403o.f87638a);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                C2305k c2305k2 = C2299e.f9111N;
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
                function9 = function8;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                TextResource textResourceM29666e2 = viewState.getNavigationTitle();
                TextResource textResourceM29665d2 = viewState.getNavigationSubtitle();
                i18 = i15 & 112;
                if (i18 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C13390j(function7, 17);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C13390j(function7, 17);
                    c28655q.m87172p0(objM87133R);
                }
                int i29 = TextResource.$stable;
                int i210 = i29 << 3;
                i19 = i15;
                function10 = function7;
                AbstractC13424s.m38062e(textResourceM29666e2, textResourceM29665d2, 0, null, null, (InterfaceC4339a) objM87133R, c28655q, i29 | i210, 28);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(3 * 8, c2314t2);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(viewState.getIcon().toWhoopIcon(), c28655q, 6);
                float f15 = 4;
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f15, c2314t2);
                C38072d c38072d2 = C38072d.f163053a;
                int i211 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3419p2, c38072d2.m121949b(c28655q, i211).getAccentPositiveTrend(), c28655q, 432, 0);
                float f16 = f15 * f15;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getDoneText(), c28655q, i29);
                C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q, i211).getH4();
                long jM125382b2 = c38072d2.m121949b(c28655q, i211).getWhite50();
                int i212 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h2, null, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i212, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i29), null, c38072d2.m121949b(c28655q, i211).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i211).getT1(), null, c28655q, 0, i212, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i29), null, c38072d2.m121949b(c28655q, i211).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i211).getB1(), null, c28655q, 0, i212, 196602);
                c28655q = c28655q;
                AbstractC18489d0.m53380u(11, f15, c2314t2, c28655q);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C11016c c11016cM29667f2 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29668g2 = viewState.getSaveButtonTitle();
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i19 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | z15;
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function11 = function10;
                        function12 = function9;
                    }
                    AbstractC13410e.m37926c(c11016cM29667f2, textResourceM29668g2, modifierM3409f2, false, (InterfaceC4339a) objM87133R2, c28655q, i29 | 384 | i210, 8);
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    if (i18 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C13390j(function11, 18);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function11, 18);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                    function5 = function11;
                    function6 = function12;
                } else {
                    c28676v1 = c28676v0;
                }
                function11 = function10;
                function12 = function9;
                objM87133R2 = new C11901c(function11, 1, function12);
                c28655q.m87172p0(objM87133R2);
                AbstractC13410e.m37926c(c11016cM29667f2, textResourceM29668g2, modifierM3409f2, false, (InterfaceC4339a) objM87133R2, c28655q, i29 | 384 | i210, 8);
                AbstractC25012a.m73392y(c28655q, true, true, true);
                if (i18 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C13390j(function11, 18);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13390j(function11, 18);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                function5 = function11;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 19, (Object) viewState, (Object) function6, function5);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
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
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13406a(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM66722k3 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t3)));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66722k3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N7);
                m38100j(viewState.getImageUrl(), c28655q, AbstractC22403o.f87638a);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t3);
                C2305k c2305k3 = C2299e.f9111N;
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 48);
                function9 = function8;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                TextResource textResourceM29666e3 = viewState.getNavigationTitle();
                TextResource textResourceM29665d3 = viewState.getNavigationSubtitle();
                i18 = i15 & 112;
                if (i18 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C13390j(function7, 17);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C13390j(function7, 17);
                    c28655q.m87172p0(objM87133R);
                }
                int i213 = TextResource.$stable;
                int i214 = i213 << 3;
                i19 = i15;
                function10 = function7;
                AbstractC13424s.m38062e(textResourceM29666e3, textResourceM29665d3, 0, null, null, (InterfaceC4339a) objM87133R, c28655q, i213 | i214, 28);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(3 * 8, c2314t3);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, C2299e.f9110M, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(viewState.getIcon().toWhoopIcon(), c28655q, 6);
                float f17 = 4;
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(6 * f17, c2314t3);
                C38072d c38072d3 = C38072d.f163053a;
                int i215 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S3, null, modifierM3419p3, c38072d3.m121949b(c28655q, i215).getAccentPositiveTrend(), c28655q, 432, 0);
                float f18 = f17 * f17;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t3));
                String strM21274h3 = AbstractC8693b.m21274h(viewState.getDoneText(), c28655q, i213);
                C2886a c2886aM8437r3 = c38072d3.m121952e(c28655q, i215).getH4();
                long jM125382b3 = c38072d3.m121949b(c28655q, i215).getWhite50();
                int i216 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h3, null, jM125382b3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r3, null, c28655q, 0, i216, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t3));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i213), null, c38072d3.m121949b(c28655q, i215).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i215).getT1(), null, c28655q, 0, i216, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t3));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i213), null, c38072d3.m121949b(c28655q, i215).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i215).getB1(), null, c28655q, 0, i216, 196602);
                c28655q = c28655q;
                AbstractC18489d0.m53380u(11, f17, c2314t3, c28655q);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                C11016c c11016cM29667f3 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29668g3 = viewState.getSaveButtonTitle();
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i19 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | z15;
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function11 = function10;
                        function12 = function9;
                    }
                    AbstractC13410e.m37926c(c11016cM29667f3, textResourceM29668g3, modifierM3409f3, false, (InterfaceC4339a) objM87133R2, c28655q, i213 | 384 | i214, 8);
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    if (i18 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C13390j(function11, 18);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function11, 18);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                    function5 = function11;
                    function6 = function12;
                } else {
                    c28676v1 = c28676v0;
                }
                function11 = function10;
                function12 = function9;
                objM87133R2 = new C11901c(function11, 1, function12);
                c28655q.m87172p0(objM87133R2);
                AbstractC13410e.m37926c(c11016cM29667f3, textResourceM29668g3, modifierM3409f3, false, (InterfaceC4339a) objM87133R2, c28655q, i213 | 384 | i214, 8);
                AbstractC25012a.m73392y(c28655q, true, true, true);
                if (i18 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C13390j(function11, 18);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13390j(function11, 18);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                function5 = function11;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 19, (Object) viewState, (Object) function6, function5);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13406a(20);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C13406a(21);
                    c28655q.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM66722k4 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t4)));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM66722k4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
            m38100j(viewState.getImageUrl(), c28655q, AbstractC22403o.f87638a);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t4);
            C2305k c2305k4 = C2299e.f9111N;
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 48);
            function9 = function8;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m11);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
            TextResource textResourceM29666e4 = viewState.getNavigationTitle();
            TextResource textResourceM29665d4 = viewState.getNavigationSubtitle();
            i18 = i15 & 112;
            if (i18 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C13390j(function7, 17);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C13390j(function7, 17);
                c28655q.m87172p0(objM87133R);
            }
            int i217 = TextResource.$stable;
            int i218 = i217 << 3;
            i19 = i15;
            function10 = function7;
            AbstractC13424s.m38062e(textResourceM29666e4, textResourceM29665d4, 0, null, null, (InterfaceC4339a) objM87133R, c28655q, i217 | i218, 28);
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(3 * 8, c2314t4);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, C2299e.f9110M, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N12);
            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(viewState.getIcon().toWhoopIcon(), c28655q, 6);
            float f19 = 4;
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(6 * f19, c2314t4);
            C38072d c38072d4 = C38072d.f163053a;
            int i219 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S4, null, modifierM3419p4, c38072d4.m121949b(c28655q, i219).getAccentPositiveTrend(), c28655q, 432, 0);
            float f110 = f19 * f19;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110, c2314t4));
            String strM21274h4 = AbstractC8693b.m21274h(viewState.getDoneText(), c28655q, i217);
            C2886a c2886aM8437r4 = c38072d4.m121952e(c28655q, i219).getH4();
            long jM125382b4 = c38072d4.m121949b(c28655q, i219).getWhite50();
            int i2110 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h4, null, jM125382b4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r4, null, c28655q, 0, i2110, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110, c2314t4));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i217), null, c38072d4.m121949b(c28655q, i219).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i219).getT1(), null, c28655q, 0, i2110, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110, c2314t4));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i217), null, c38072d4.m121949b(c28655q, i219).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i219).getB1(), null, c28655q, 0, i2110, 196602);
            c28655q = c28655q;
            AbstractC18489d0.m53380u(11, f19, c2314t4, c28655q);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
            C11016c c11016cM29667f4 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
            TextResource textResourceM29668g4 = viewState.getSaveButtonTitle();
            if (i18 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i19 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | z15;
            objM87133R2 = c28655q.m87133R();
            if (z17) {
                c28676v1 = c28676v0;
                if (objM87133R2 == c28676v1) {
                    function11 = function10;
                    function12 = function9;
                }
                AbstractC13410e.m37926c(c11016cM29667f4, textResourceM29668g4, modifierM3409f4, false, (InterfaceC4339a) objM87133R2, c28655q, i217 | 384 | i218, 8);
                AbstractC25012a.m73392y(c28655q, true, true, true);
                if (i18 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C13390j(function11, 18);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13390j(function11, 18);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                function5 = function11;
                function6 = function12;
            } else {
                c28676v1 = c28676v0;
            }
            function11 = function10;
            function12 = function9;
            objM87133R2 = new C11901c(function11, 1, function12);
            c28655q.m87172p0(objM87133R2);
            AbstractC13410e.m37926c(c11016cM29667f4, textResourceM29668g4, modifierM3409f4, false, (InterfaceC4339a) objM87133R2, c28655q, i217 | 384 | i218, 8);
            AbstractC25012a.m73392y(c28655q, true, true, true);
            if (i18 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z18) {
                objM87133R3 = new C13390j(function11, 18);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C13390j(function11, 18);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
            function5 = function11;
            function6 = function12;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 19, (Object) viewState, (Object) function6, function5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m38105o(AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m38106p(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m38107q(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m38108r(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC11022i.e.f34547a);
        function2.invoke(AbstractC39672a.c.f170737a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m38109s(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m38110t(C11030q c11030q, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m38104n(c11030q, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
