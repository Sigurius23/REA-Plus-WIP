package pq2;

import a23.C0176c;
import a41.C0374j;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1932c;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import com.whoop.user.journey.model.UserJourneyNavigationFooter;
import eq2.C13564b;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kz0.AbstractC22922c;
import l83.C23454a0;
import lr2.InterfaceC24703d;
import m83.C25271y;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import of2.C27900d;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import pc3.C29096r;
import pl0.C29344b;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import y71.C39274g;
import yp2.AbstractC39706c;
import zp2.C40943a;

/* JADX INFO: renamed from: pq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Leq2/b;", "readyState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "Lkotlin/Function1;", "", "onFooterUrlCtaPressed", "o", "(Leq2/b;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llr2/d;", "", "s", "(Llr2/d;)Z", "isLastStep", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "m", "(Leq2/b;Landroidx/compose/runtime/Composer;I)V", "j", "(Leq2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29484a {

    /* JADX INFO: renamed from: pq2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f119744a;

        static {
            int[] iArr = new int[UserJourneyFooterStyle.values().length];
            try {
                iArr[UserJourneyFooterStyle.GET_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserJourneyFooterStyle.STEP_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserJourneyFooterStyle.URL_NAVIGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f119744a = iArr;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m90057h(boolean z4, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-886544868);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC27282u.m82292h(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(AbstractC27282u.m82299o(C2314t.f9131w, AbstractC15673b0.m43983F0()), 3 * 4, 0.0f, 2)), EnumC27284v.TextLarge, AbstractC30060g.m92103Y(c28655q, z4 ? AbstractC39706c.f170910c : AbstractC39706c.f170920m), false, 0L, null, false, onClick, c28655q, ((i14 << 18) & 29360128) | 48, 120);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0374j(z4, onClick, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m90058i(boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m90057h(z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m90059j(C13564b readyState, Function1 onClick, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(readyState, "readyState");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(379969702);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(readyState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC24703d interfaceC24703dM38290a = readyState.m38290a();
            TextResource textResource = null;
            Object[] objArr = 0;
            UserJourneyNavigationFooter userJourneyNavigationFooter = interfaceC24703dM38290a instanceof UserJourneyNavigationFooter ? (UserJourneyNavigationFooter) interfaceC24703dM38290a : null;
            if (userJourneyNavigationFooter == null) {
                c28655q2.m87150e0(-1856247236);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-1856247235);
                TextResource navigationUrl = userJourneyNavigationFooter.getNavigationUrl();
                int i15 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(navigationUrl, c28655q2, i15);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(3 * 4, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E);
                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextLarge;
                TextResource footerText = userJourneyNavigationFooter.getFooterText();
                C39274g c39274g = new C39274g(userJourneyNavigationFooter.getFooterIcon(), textResource, 2, objArr == true ? 1 : 0);
                boolean zM87153g = ((i14 & 112) == 32) | c28655q2.m87153g(strM21274h);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0176c(onClick, strM21274h, 6);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(modifierMo3400a, enumC27269n0, footerText, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q2, (i15 << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(readyState, onClick, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m90060k(Function1 function1, String str, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m90061l(C13564b c13564b, Function1 function1, int i13, Composer composer, int i14) {
        m90059j(c13564b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m90062m(C13564b readyState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(readyState, "readyState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(931531517);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(readyState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM44101d = AbstractC15676d.m44101d(C2314t.f9131w, "UserJourney_StepProgressBar");
            C40943a c40943aM38294e = readyState.getSectionProgress();
            if (c40943aM38294e == null || c40943aM38294e.m132859c().isEmpty()) {
                c28655q.m87150e0(1472392504);
                AbstractC22922c.m66645b(modifierM44101d, readyState.getCurrentStepIndex(), readyState.getTotalSteps() - 1, 0L, 0L, C25271y.f99162w, 0, 0.0f, null, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 472);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1472088952);
                AbstractC22922c.m66645b(modifierM44101d, readyState.getCurrentStepIndex(), readyState.getTotalSteps() - 1, 0L, 0L, c40943aM38294e.m132859c(), c40943aM38294e.getCurrentSectionIndex(), 0.0f, null, c28655q, 0, 408);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(readyState, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m90063n(C13564b c13564b, int i13, Composer composer, int i14) {
        m90062m(c13564b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0156  */
    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final void m90064o(C13564b readyState, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        InterfaceC4339a interfaceC4339a2;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(readyState, "readyState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1700531516);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(readyState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C29096r(16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C29344b(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 5 * 4, 0.0f, 2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                if (readyState.getCurrentStepIndex() == readyState.getTotalSteps() - 1 || !m90068s(readyState.m38290a())) {
                    c28655q.m87150e0(-1903715915);
                    i16 = a.f119744a[readyState.m38290a().getFooterStyle().ordinal()];
                    if (i16 == 1) {
                        c28655q.m87150e0(-199954713);
                        m90057h(false, interfaceC4339a3, c28655q, (i15 & 112) | 6);
                        c28655q.m87173q(false);
                    } else if (i16 == 2) {
                        c28655q.m87150e0(-199952084);
                        m90062m(readyState, c28655q, i15 & 14);
                        c28655q.m87173q(false);
                    } else {
                        if (i16 != 3) {
                            throw AbstractC11895b.m32003v(-199957523, c28655q, false);
                        }
                        c28655q.m87150e0(-199949229);
                        m90059j(readyState, function4, c28655q, ((i15 >> 3) & 112) | (i15 & 14));
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1903792764);
                    m90057h(true, interfaceC4339a3, c28655q, (i15 & 112) | 6);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a2 = interfaceC4339a3;
                function3 = function4;
            } else {
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(readyState, interfaceC4339a2, function3, i13, i14, 21);
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
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C29096r(16);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            if (i18 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C29344b(21);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 5 * 4, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
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
            if (readyState.getCurrentStepIndex() == readyState.getTotalSteps() - 1) {
                c28655q.m87150e0(-1903715915);
                i16 = a.f119744a[readyState.m38290a().getFooterStyle().ordinal()];
                if (i16 == 1) {
                    c28655q.m87150e0(-199954713);
                    m90057h(false, interfaceC4339a3, c28655q, (i15 & 112) | 6);
                    c28655q.m87173q(false);
                } else if (i16 == 2) {
                    c28655q.m87150e0(-199952084);
                    m90062m(readyState, c28655q, i15 & 14);
                    c28655q.m87173q(false);
                } else {
                    if (i16 != 3) {
                        throw AbstractC11895b.m32003v(-199957523, c28655q, false);
                    }
                    c28655q.m87150e0(-199949229);
                    m90059j(readyState, function4, c28655q, ((i15 >> 3) & 112) | (i15 & 14));
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1903715915);
                i16 = a.f119744a[readyState.m38290a().getFooterStyle().ordinal()];
                if (i16 == 1) {
                    c28655q.m87150e0(-199954713);
                    m90057h(false, interfaceC4339a3, c28655q, (i15 & 112) | 6);
                    c28655q.m87173q(false);
                } else if (i16 == 2) {
                    c28655q.m87150e0(-199952084);
                    m90062m(readyState, c28655q, i15 & 14);
                    c28655q.m87173q(false);
                } else {
                    if (i16 != 3) {
                        throw AbstractC11895b.m32003v(-199957523, c28655q, false);
                    }
                    c28655q.m87150e0(-199949229);
                    m90059j(readyState, function4, c28655q, ((i15 >> 3) & 112) | (i15 & 14));
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a3;
            function3 = function4;
        } else {
            c28655q.m87138X();
            interfaceC4339a2 = interfaceC4339a;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(readyState, interfaceC4339a2, function3, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m90065p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m90066q(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m90067r(C13564b c13564b, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m90064o(c13564b, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final boolean m90068s(InterfaceC24703d interfaceC24703d) {
        return !(interfaceC24703d instanceof C1932c);
    }
}
