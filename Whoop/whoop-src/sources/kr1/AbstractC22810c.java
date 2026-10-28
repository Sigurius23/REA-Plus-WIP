package kr1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gr1.C16094a;
import gr1.C16098e;
import io.getstream.chat.android.client.api.QueryParams;
import j11.C21214q;
import jp1.C21852d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22571f;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import zq1.AbstractC40986a;

/* JADX INFO: renamed from: kr1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u000b\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lgr1/a;", "connectionSection", "Lkotlin/Function1;", "Lkr1/a;", "Ll83/a0;", "onAction", "Landroidx/compose/ui/Modifier;", "modifier", "f", "(Lgr1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "m", "(Lgr1/a;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onClick", "i", "(Lgr1/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "k", "a", "Lgr1/a;", "previewConnectionSection", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22810c {

    /* JADX INFO: renamed from: a */
    private static final C16094a f89826a = new C16094a("strength", false, null, AbstractC8693b.m21278l("Strength"), AbstractC8693b.m21278l("CONNECT"), false, AbstractC8693b.m21278l("NOT CONNECTED"), QueryParams.URL, null, null, AbstractC8693b.m21278l("Connect to share your strength work with Peloton."), Boolean.FALSE, Boolean.TRUE, EnumC27272p.LIGHT_BACKGROUND, new C16098e(AbstractC8693b.m21278l("DISCONNECT FROM APP"), AbstractC8693b.m21278l("Are you sure you want to disconnect?"), AbstractC8693b.m21278l("DISCONNECT"), AbstractC8693b.m21278l("NEVERMIND")));

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m66055f(C16094a connectionSection, Function1 onAction, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87157i;
        Object objM87133R;
        AbstractC22676k.m65750j(connectionSection, "connectionSection");
        AbstractC22676k.m65750j(onAction, "onAction");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(630630397);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(connectionSection) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onAction) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                int i17 = i15 & 14;
                m66062m(connectionSection, c28655q, i17);
                zM87157i = c28655q.m87157i(connectionSection) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C21214q(connectionSection, onAction, 24);
                    c28655q.m87172p0(objM87133R);
                }
                m66058i(connectionSection, (InterfaceC4339a) objM87133R, c28655q, i17);
                m66060k(connectionSection, c28655q, i17);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(i13, i14, 19, connectionSection, modifier3, onAction);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            int i18 = i15 & 14;
            m66062m(connectionSection, c28655q, i18);
            zM87157i = c28655q.m87157i(connectionSection) | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C21214q(connectionSection, onAction, 24);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21214q(connectionSection, onAction, 24);
                c28655q.m87172p0(objM87133R);
            }
            m66058i(connectionSection, (InterfaceC4339a) objM87133R, c28655q, i18);
            m66060k(connectionSection, c28655q, i18);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(i13, i14, 19, connectionSection, modifier3, onAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66056g(C16094a c16094a, Function1 function1) {
        if (c16094a.getConnected()) {
            Boolean canShowDisconnectModal = c16094a.getCanShowDisconnectModal();
            if (canShowDisconnectModal != null ? canShowDisconnectModal.booleanValue() : true) {
                function1.invoke(InterfaceC22808a.b.f89821a);
            } else if (c16094a.getConnectionUrl() != null) {
                function1.invoke(new InterfaceC22808a.a(c16094a.getConnectionUrl()));
            } else if (c16094a.getDeepLinkUrl() != null) {
                function1.invoke(new InterfaceC22808a.c(c16094a.getDeepLinkUrl()));
            }
        } else if (c16094a.getConnectionUrl() != null) {
            function1.invoke(new InterfaceC22808a.a(c16094a.getConnectionUrl()));
        } else if (c16094a.getDeepLinkUrl() != null) {
            function1.invoke(new InterfaceC22808a.c(c16094a.getDeepLinkUrl()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m66057h(C16094a c16094a, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m66055f(c16094a, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m66058i(C16094a c16094a, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-331975633);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c16094a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            EnumC27272p ctaButtonStyle = c16094a.getCtaButtonStyle();
            if (ctaButtonStyle == null) {
                ctaButtonStyle = c16094a.getConnected() ? EnumC27272p.DEFAULT : EnumC27272p.LIGHT_BACKGROUND;
            }
            AbstractC27249e.m82121d(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), new C27256h(c16094a.getCtaTitle(), null, null, null, null, null, ctaButtonStyle, null, null, null, EnumC27254g.STANDARD, null, null, false, false, AbstractC11266d.m30461o("connect-integration-details-", c16094a.getId()), false, false, null, null, null, null, null, null, null, 33520574, null), null, interfaceC4339a, c28655q, (C27256h.f109055z << 3) | 6 | ((i14 << 6) & 7168), 4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c16094a, interfaceC4339a, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m66059j(C16094a c16094a, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m66058i(c16094a, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m66060k(C16094a c16094a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1856205805);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c16094a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (c16094a.getInfoCallout() != null) {
            c28655q.m87150e0(1060536324);
            AbstractC25303l.m74291r(c16094a.getInfoCallout(), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(false);
        } else if (c16094a.getBottomDescriptionText() != null) {
            c28655q.m87150e0(-1483034791);
            String strM21274h = AbstractC8693b.m21274h(c16094a.getBottomDescriptionText(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1482810692);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22809b(c16094a, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m66061l(C16094a c16094a, int i13, Composer composer, int i14) {
        m66060k(c16094a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m66062m(C16094a c16094a, Composer composer, int i13) {
        int i14;
        int i15;
        boolean z4;
        long jM73370c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1833984261);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c16094a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            float f13 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.25d) * f13), C2299e.f9110M, c28655q, 6);
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
            TextResource sectionTitle = c16094a.getSectionTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(sectionTitle, c28655q, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), c38072d.m121952e(c28655q, i17).getH3().getStyle().f92255a.f92192b, null, c38072d.m121952e(c28655q, i17).getH3().getStyle().f92255a.f92193c, c38072d.m121952e(c28655q, i17).getH3().getStyle().f92255a.f92196f, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262034);
            String strM21274h2 = AbstractC8693b.m21274h(c16094a.getConnectedStatus(), c28655q, i16);
            if (c16094a.getConnected()) {
                c28655q.m87150e0(1675784679);
                i15 = i17;
                jM73370c = c38072d.m121949b(c28655q, i15).getAccentPositiveTrend();
                z4 = false;
            } else {
                i15 = i17;
                z4 = false;
                jM73370c = AbstractC25012a.m73370c(c28655q, 1675786043, c38072d, c28655q, i15);
            }
            c28655q.m87173q(z4);
            AbstractC30795n.m94707h(strM21274h2, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            Boolean showConnectedStatusIcon = c16094a.getShowConnectedStatusIcon();
            if (showConnectedStatusIcon != null ? showConnectedStatusIcon.booleanValue() : false) {
                c28655q.m87150e0(1064580625);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(1 * f13, c2314t));
                AbstractC15005f3.m43107a(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC40986a.f176889a), null, null, c28655q, AbstractC22403o.a.f87639c, 3), null, null, C17919x.f69637n, c28655q, 3120, 4);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1064864120);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22809b(c16094a, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m66063n(C16094a c16094a, int i13, Composer composer, int i14) {
        m66062m(c16094a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
