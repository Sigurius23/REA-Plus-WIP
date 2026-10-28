package ep1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bp1.AbstractC3535b;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp1.AbstractC11022i;
import cp1.AbstractC11024k;
import e11.C12582b;
import ej1.C13251n;
import eo2.C13390j;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
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
import p291l0.C23010x;
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
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ep1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcp1/k$c;", "viewState", "Lkotlin/Function1;", "Lcp1/i;", "Ll83/a0;", "onViewEvent", "Lbp1/b;", "onNavigationEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcp1/k$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13407b {
    /* JADX WARN: Code duplicated, block: B:102:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:104:0x040e  */
    /* JADX WARN: Code duplicated, block: B:107:0x041a  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0129  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0235  */
    /* JADX WARN: Code duplicated, block: B:74:0x023b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0259  */
    /* JADX WARN: Code duplicated, block: B:85:0x0296  */
    /* JADX WARN: Code duplicated, block: B:86:0x029a  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:94:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x03db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX INFO: renamed from: h */
    public static final void m37879h(AbstractC11024k.c viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Function1 function3;
        boolean z4;
        Function1 function4;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C2314t c2314t2;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        C28676v0 c28676v1;
        Function1 function8;
        ?? r15;
        int i17;
        ?? r14;
        Object objM87133R;
        C28655q c28655q;
        int iHashCode2;
        C0209i c0209i7;
        int iHashCode3;
        Function1 function9;
        boolean z13;
        Object objM87133R2;
        Function1 function10;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-325372708);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function2;
                i15 |= c28655q2.m87157i(function3) ? 256 : 128;
            }
            if ((i15 & 131) != 130) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                i16 = i14 & 2;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C13251n(28);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13251n(29);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t)));
                C2307m c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N);
                if (viewState.getBackgroundImageUrl() != null) {
                    c28655q2.m87150e0(516447945);
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(viewState.getBackgroundImageUrl(), null, null, c28655q2, AbstractC22403o.f87638a, 3);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C13406a(0);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3407d, (Function1) objM87133R3);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13406a(1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c0209i6 = c0209i;
                    function8 = function7;
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    r15 = 0;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1099a.m3398t(AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R4), 0.0f, 0.0f, 0.0f, 14 * 8, 7), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i;
                    c28676v1 = c28676v0;
                    function8 = function7;
                    r15 = 0;
                    c28655q2.m87150e0(517248768);
                    c28655q2.m87173q(false);
                }
                C2307m c2307m2 = C2299e.f9115x;
                C1100b c1100b = C1100b.f4583a;
                Modifier modifierM66724m = AbstractC22953f.m66724m(c1100b.mo3400a(c2314t2, c2307m2));
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                C38072d c38072d = C38072d.f163053a;
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21267a, null, AbstractC38963t7.m124375e(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62257L), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i17 = i15 & 896;
                if (i17 == 256) {
                    r14 = 1;
                } else {
                    r14 = r15;
                }
                objM87133R = c28655q2.m87133R();
                if (r14 == 0 || objM87133R == c28676v1) {
                    objM87133R = new C13390j(function8, 1);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                AbstractC6719b.m20143d(modifierM66724m, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                Modifier modifierMo3400a = c1100b.mo3400a(c2314t2, C2299e.f9105H);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, r15);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i9 = c0209i6;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC39127r0M66763d2);
                C0209i c0209i10 = c0209i5;
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m2);
                if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i7 = c0209i4;
                } else {
                    c0209i7 = c0209i4;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N2);
                float f13 = 4;
                Modifier modifierMo3400a2 = c1100b.mo3400a(AbstractC1099a.m3394p(8 * f13, c2314t2), C2299e.f9102E);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, r15);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3400a2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6);
                Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t2);
                int i19 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S, "", modifierM3419p, c38072d.m121949b(c28655q, i19).getAccentAction(), c28655q, 432, 0);
                float f14 = f13 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t2));
                TextResource textResourceM29633d = viewState.getSubtitle();
                int i24 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM29633d, c28655q, i24);
                long jM125385c1 = c38072d.m121949b(c28655q, i19).getWhite70();
                C2886a c2886aM8437r = c38072d.m121952e(c28655q, i19).getH4();
                int i25 = C2886a.f11498d << 18;
                function9 = function8;
                C28676v0 c28676v2 = c28676v1;
                AbstractC30795n.m94707h(strM21274h, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i25, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i24), null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT2(), null, c28655q, 0, i25, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f13, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i24), null, c38072d.m121949b(c28655q, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB1(), null, c28655q, 0, i25, 196602);
                AbstractC18489d0.m53380u(19, f13, c2314t2, c28655q);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getButtonText(), c28655q, i24);
                long jM125399i0 = c38072d.m121949b(c28655q, i19).getSleepLightSleep();
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (!z13 || objM87133R2 == c28676v2) {
                    function10 = function9;
                    objM87133R2 = new C13390j(function10, 2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function10 = function9;
                }
                AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125399i0, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
                c28655q2 = c28655q;
                AbstractC25012a.m73392y(c28655q2, true, true, true);
                function4 = function10;
                function5 = function6;
            } else {
                c28655q2.m87138X();
                function4 = function3;
                function5 = function1;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 14, (Object) viewState, (Object) function4, function5);
            }
        }
        i15 |= 384;
        function3 = function2;
        if ((i15 & 131) != 130) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            i16 = i14 & 2;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C13251n(28);
                    c28655q2.m87172p0(objM87133R6);
                }
                function6 = (Function1) objM87133R6;
            } else {
                function6 = function1;
            }
            if (i18 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13251n(29);
                    c28655q2.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t)));
            C2307m c2307m3 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i11 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N4);
            if (viewState.getBackgroundImageUrl() != null) {
                c28655q2.m87150e0(516447945);
                c0209i4 = c0209i3;
                c0209i5 = c0209i2;
                AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(viewState.getBackgroundImageUrl(), null, null, c28655q2, AbstractC22403o.f87638a, 3);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C13406a(0);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM3407d2, (Function1) objM87133R3);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C13406a(1);
                    c28655q2.m87172p0(objM87133R4);
                }
                c0209i6 = c0209i;
                function8 = function7;
                c28676v1 = c28676v0;
                c2314t2 = c2314t;
                r15 = 0;
                AbstractC29125c.m88522c(abstractC26165aM64500i2, null, AbstractC1099a.m3398t(AbstractC1125a.m3480c(modifierM3486a2, (Function1) objM87133R4), 0.0f, 0.0f, 0.0f, 14 * 8, 7), null, C39102j.f168199a, 0.0f, null, c28655q2, 24624, 104);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c2314t2 = c2314t;
                c0209i4 = c0209i3;
                c0209i5 = c0209i2;
                c0209i6 = c0209i;
                c28676v1 = c28676v0;
                function8 = function7;
                r15 = 0;
                c28655q2.m87150e0(517248768);
                c28655q2.m87173q(false);
            }
            C2307m c2307m4 = C2299e.f9115x;
            C1100b c1100b2 = C1100b.f4583a;
            Modifier modifierM66724m2 = AbstractC22953f.m66724m(c1100b2.mo3400a(c2314t2, c2307m4));
            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21267a2, null, AbstractC38963t7.m124375e(c38072d2), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62257L), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            i17 = i15 & 896;
            if (i17 == 256) {
                r14 = 1;
            } else {
                r14 = r15;
            }
            objM87133R = c28655q2.m87133R();
            if (r14 == 0) {
                objM87133R = new C13390j(function8, 1);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C13390j(function8, 1);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC6719b.m20143d(modifierM66724m2, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            Modifier modifierMo3400a3 = c1100b2.mo3400a(c2314t2, C2299e.f9105H);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m3, r15);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3400a3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i12 = c0209i6;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC39127r0M66763d4);
            C0209i c0209i13 = c0209i5;
            AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                c0209i7 = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i7);
            } else {
                c0209i7 = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N5);
            float f15 = 4;
            Modifier modifierMo3400a4 = c1100b2.mo3400a(AbstractC1099a.m3394p(8 * f15, c2314t2), C2299e.f9102E);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, r15);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3400a4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N6);
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c38072d2.m121951d().getAction().getCheckMark(), c28655q, 6);
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f15, c2314t2);
            int i110 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S2, "", modifierM3419p2, c38072d2.m121949b(c28655q, i110).getAccentAction(), c28655q, 432, 0);
            float f16 = f15 * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
            TextResource textResourceM29633d2 = viewState.getSubtitle();
            int i26 = TextResource.$stable;
            String strM21274h3 = AbstractC8693b.m21274h(textResourceM29633d2, c28655q, i26);
            long jM125385c2 = c38072d2.m121949b(c28655q, i110).getWhite70();
            C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q, i110).getH4();
            int i27 = C2886a.f11498d << 18;
            function9 = function8;
            C28676v0 c28676v3 = c28676v1;
            AbstractC30795n.m94707h(strM21274h3, null, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i27, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i26), null, c38072d2.m121949b(c28655q, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getT2(), null, c28655q, 0, i27, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f15, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i26), null, c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB1(), null, c28655q, 0, i27, 196602);
            AbstractC18489d0.m53380u(19, f15, c2314t2, c28655q);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM21274h4 = AbstractC8693b.m21274h(viewState.getButtonText(), c28655q, i26);
            long jM125399i1 = c38072d2.m121949b(c28655q, i110).getSleepLightSleep();
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                function10 = function9;
                objM87133R2 = new C13390j(function10, 2);
                c28655q.m87172p0(objM87133R2);
            } else {
                function10 = function9;
                objM87133R2 = new C13390j(function10, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h4, false, jM125399i1, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
            c28655q2 = c28655q;
            AbstractC25012a.m73392y(c28655q2, true, true, true);
            function4 = function10;
            function5 = function6;
        } else {
            c28655q2.m87138X();
            function4 = function3;
            function5 = function1;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 14, (Object) viewState, (Object) function4, function5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m37880i(AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37881j(AbstractC3535b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m37882k(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37883l(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69625b)), new C23465k(Float.valueOf(0.8f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37884m(Function1 function1) {
        function1.invoke(new AbstractC3535b.b(false));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m37885n(Function1 function1) {
        function1.invoke(new AbstractC3535b.b(true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m37886o(AbstractC11024k.c cVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m37879h(cVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
