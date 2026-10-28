package mc2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import gz0.AbstractC16315n0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.C22411w;
import l83.C23454a0;
import m01.C24875c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.C33252i;
import p705ea2.AbstractC12919p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: mc2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lmc2/m;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/navigation/e;", "Ll83/a0;", "onClick", "m", "(Lmc2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "iconKey", "Li2/x;", "tint", "", "fallbackRes", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;JILandroidx/compose/runtime/Composer;I)V", "Lmc2/h;", "menuItem", "j", "(Lmc2/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25433l {

    /* JADX INFO: renamed from: mc2.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99621a;

        static {
            int[] iArr = new int[EnumC25425d.values().length];
            try {
                iArr[EnumC25425d.RAF_MENU_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25425d.OUTLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f99621a = iArr;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final void m74656h(String str, long j7, int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-381327179);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * 4, C2314t.f9131w);
            Integer numM46376a = AbstractC16315n0.m46376a(str);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(numM46376a != null ? numM46376a.intValue() : i13, c28655q, 0), null, modifierM3419p, j7, c28655q, ((i15 << 6) & 7168) | 432, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25432k(i13, i14, 0, j7, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m74657i(String str, long j7, int i13, int i14, Composer composer, int i15) {
        m74656h(str, j7, i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m74658j(C25429h c25429h, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(436915281);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c25429h) : c28655q.m87157i(c25429h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = 0;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(C2314t.f9131w, null, 3)), AbstractC15673b0.m43981E0(), C22411w.f87680a.m64535a().m64090c(), 0.0f, 4);
            boolean z4 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c25429h))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C25430i(function1, c25429h, i15);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3357b, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, modifierM3362g);
            C22949e c22949e = AbstractC22977m.f90650a;
            C2305k c2305k = C2299e.f9110M;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f13, c2305k), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            String strM74645b = c25429h.getIconKey();
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            m74656h(strM74645b, c38072d.m121949b(c28655q, i16).getBrandBlack(), AbstractC12919p.f44475i, c28655q, 0);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM74648e = c25429h.getTitle();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM74648e, c28655q, i17);
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i16).getH4();
            long jM125426w = c38072d.m121949b(c28655q, i16).getBrandBlack();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125426w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i18, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c25429h.getSubtitle(), c28655q, i17), null, c38072d.m121949b(c28655q, i16).getBlack70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB3(), null, c28655q, 0, i18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25431j(c25429h, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m74659k(Function1 function1, C25429h c25429h) {
        function1.invoke(c25429h.getAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m74660l(C25429h c25429h, Function1 function1, int i13, Composer composer, int i14) {
        m74658j(c25429h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x014d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0172  */
    /* JADX WARN: Code duplicated, block: B:52:0x0187  */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static final void m74661m(C25434m viewState, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        int i15;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        int iHashCode;
        C2314t c2314t;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        boolean z13;
        C2314t c2314t2;
        int i16;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-648652980);
        int i17 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(viewState) ? 4 : 2) : i13;
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i17 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            i15 = i17;
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C24875c(23);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                if (AbstractC8693b.m21270d(viewState.getSectionTitle())) {
                    c28655q2.m87150e0(-485307547);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                    String strM21274h = AbstractC8693b.m21274h(viewState.getSectionTitle(), c28655q2, TextResource.$stable);
                    C38072d c38072d = C38072d.f163053a;
                    int i19 = C38072d.f163054b;
                    C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i19).getH4();
                    c2314t2 = c2314t;
                    z13 = false;
                    function5 = function4;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q2, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    Function1 function6 = function4;
                    c28655q = c28655q2;
                    function5 = function6;
                    z13 = false;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-485044884);
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(-846929367);
                for (C25429h c25429h : viewState.m74667a()) {
                    i16 = a.f99621a[c25429h.getStyle().ordinal()];
                    if (i16 != 1) {
                        c28655q.m87150e0(-735577499);
                        m74658j(c25429h, function5, c28655q, TextResource.$stable | C9598e.f28134d | (i15 & 112));
                        c28655q.m87173q(z13);
                    } else {
                        if (i16 == 2) {
                            throw AbstractC11895b.m32003v(-735579491, c28655q, z13);
                        }
                        c28655q.m87150e0(-735574948);
                        m74664p(c25429h, function5, c28655q, TextResource.$stable | C9598e.f28134d | (i15 & 112));
                        c28655q.m87173q(z13);
                    }
                    AbstractC18489d0.m53380u(1, 8, c2314t2, c28655q);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24671c(viewState, i13, function3, i14, 12);
            }
        }
        i17 |= 48;
        function2 = function1;
        i15 = i17;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C24875c(23);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            if (AbstractC8693b.m21270d(viewState.getSectionTitle())) {
                c28655q2.m87150e0(-485307547);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getSectionTitle(), c28655q2, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i110 = C38072d.f163054b;
                C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q2, i110).getH4();
                c2314t2 = c2314t;
                z13 = false;
                function5 = function4;
                AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, c38072d2.m121949b(c28655q2, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q2, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                Function1 function7 = function4;
                c28655q = c28655q2;
                function5 = function7;
                z13 = false;
                c2314t2 = c2314t;
                c28655q.m87150e0(-485044884);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(-846929367);
            while (r3.hasNext()) {
                i16 = a.f99621a[c25429h.getStyle().ordinal()];
                if (i16 != 1) {
                    c28655q.m87150e0(-735577499);
                    m74658j(c25429h, function5, c28655q, TextResource.$stable | C9598e.f28134d | (i15 & 112));
                    c28655q.m87173q(z13);
                } else {
                    if (i16 == 2) {
                        throw AbstractC11895b.m32003v(-735579491, c28655q, z13);
                    }
                    c28655q.m87150e0(-735574948);
                    m74664p(c25429h, function5, c28655q, TextResource.$stable | C9598e.f28134d | (i15 & 112));
                    c28655q.m87173q(z13);
                }
                AbstractC18489d0.m53380u(1, 8, c2314t2, c28655q);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(true);
            function3 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(viewState, i13, function3, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m74662n(C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m74663o(C25434m c25434m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m74661m(c25434m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m74664p(C25429h c25429h, Function1 function1, Composer composer, int i13) {
        int i14;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1201677321);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c25429h) : c28655q.m87157i(c25429h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i16 = 1;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C33252i c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15751g.m44456i(((float) 0.5d) * 4, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(C2314t.f9131w, null, 3)), AbstractC15673b0.m43981E0(), c33252iM64090c), C17919x.f69636m, c33252iM64090c);
            boolean z4 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c25429h))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C25430i(function1, c25429h, i16);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, modifierM3362g);
            C22949e c22949e = AbstractC22977m.f90650a;
            C2305k c2305k = C2299e.f9110M;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f13, c2305k), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            String strM74645b = c25429h.getIconKey();
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            m74656h(strM74645b, c38072d.m121949b(c28655q, i17).getBrandWhite(), AbstractC16272a.f62004T2, c28655q, 0);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM74648e = c25429h.getTitle();
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM74648e, c28655q, i18);
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i17).getH4();
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i19 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i19, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c25429h.getSubtitle(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB3(), null, c28655q, 0, i19, 196602);
            c28655q = c28655q;
            i15 = 1;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            i15 = 1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25431j(c25429h, function1, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m74665q(Function1 function1, C25429h c25429h) {
        function1.invoke(c25429h.getAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m74666r(C25429h c25429h, Function1 function1, int i13, Composer composer, int i14) {
        m74664p(c25429h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
