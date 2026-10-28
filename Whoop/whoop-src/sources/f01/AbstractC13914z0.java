package f01;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import d30.C11546l;
import e93.AbstractC12889b;
import gb1.AbstractC15676d;
import hg3.AbstractC17269i;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: f01.z0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lf01/a1;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lf01/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "a", "Ljava/util/List;", "getImageAndButtonCardPreviewStates", "()Ljava/util/List;", "imageAndButtonCardPreviewStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13914z0 {

    /* JADX INFO: renamed from: a */
    private static final List<C13844a1> f49617a;

    static {
        C38072d c38072d = C38072d.f163053a;
        f49617a = AbstractC37056f.m118959K(new C13844a1(new AbstractC22403o.c("", c38072d.m121951d().getLogo().getWhoop(), AbstractC11895b.m31985d(c38072d), 0, 8, null), AbstractC8693b.m21278l("Start Journaling Today"), AbstractC8693b.m21278l(" Learn which behaviors unlock your best self. "), AbstractC8693b.m21278l("GET STARTED"), EnumC13909x.ONBOARDING, new C9598e(null, null, null, 7, null)), new C13844a1(new AbstractC22403o.c("", c38072d.m121951d().getLogo().getWhoop(), AbstractC11895b.m31985d(c38072d), 0, 8, null), AbstractC8693b.m21278l("Your Dashboard is Empty"), AbstractC8693b.m21278l("Monitor the data that is most important to you. You can change your Dashboard at any time."), AbstractC8693b.m21278l("COMPLETE"), EnumC13909x.NORMAL, new C9598e(null, null, null, 7, null)), new C13844a1(new AbstractC22403o.c("", c38072d.m121951d().getLogo().getWhoop(), AbstractC11895b.m31985d(c38072d), 0, 8, null), null, null, AbstractC8693b.m21278l("COMPLETE"), null, new C9598e(null, null, null, 7, null)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m39640d(C13844a1 viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(143694064);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            float f13 = 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
            C38072d c38072d = C38072d.f163053a;
            AbstractC12889b.m36263b(modifierM3409f, c33252iM105489e, c38072d.m121949b(c28655q, 6).getTransparent(), AbstractC17269i.m48880a((float) 1.5d, c38072d.m121949b(c28655q, 6).getWhite10()), 0 * f13, AbstractC37817c.m121344e(98006637, c28655q, new C13857f(4, viewState, onViewEvent)), c28655q, 1769478, 8);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(viewState, onViewEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m39641e(C13844a1 c13844a1, Function1 function1, Composer composer, int i13) {
        int i14;
        Modifier modifierM82299o;
        long jM95624D;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, ((float) 3.5d) * f13, 3 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3419p(19 * 4, c2314t), 0.0f, 0.0f, 0.0f, f14, 7);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(c13844a1.getImage(), null, null, c28655q, 0, 3);
            C28655q c28655q2 = c28655q;
            AbstractC29125c.m88522c(abstractC26165aM64500i, "Non-interactive Tile Image", modifierM3398t, null, null, 0.0f, null, c28655q2, 432, 120);
            if (c13844a1.getTitle() != null) {
                c28655q2.m87150e0(-967951219);
                String strM21274h = AbstractC8693b.m21274h(c13844a1.getTitle(), c28655q2, 0);
                C38072d c38072d = C38072d.f163053a;
                i14 = 6;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getT4(), null, c28655q2, 0, 0, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                i14 = 6;
                c28655q2.m87150e0(-967737877);
                c28655q2.m87173q(false);
            }
            if (c13844a1.getDescription() != null) {
                c28655q2.m87150e0(-967663880);
                String strM21274h2 = AbstractC8693b.m21274h(c13844a1.getDescription(), c28655q2, 0);
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q2, i14).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i14).getB1(), null, c28655q3, 0, 0, 196090);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-967416469);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
            EnumC13909x enumC13909xM39207f = c13844a1.getStyle();
            C17919x c17919xM31989h = null;
            InterfaceC21430b buttonBrush = enumC13909xM39207f != null ? enumC13909xM39207f.getButtonBrush() : null;
            if (buttonBrush == null) {
                c28655q2.m87150e0(-967219496);
                c28655q2.m87173q(false);
                modifierM82299o = null;
            } else {
                c28655q2.m87150e0(-967219495);
                modifierM82299o = AbstractC27282u.m82299o(c2314t, buttonBrush.mo60316a(c28655q2, 0));
                c28655q2.m87173q(false);
            }
            Modifier modifierM44103f = AbstractC15676d.m44103f(modifierM3398t2, modifierM82299o);
            EnumC27284v enumC27284v = EnumC27284v.TextMedium;
            String strM21274h3 = AbstractC8693b.m21274h(c13844a1.getButtonText(), c28655q2, 0);
            EnumC13909x enumC13909xM39207f2 = c13844a1.getStyle();
            EnumC39333f buttonColor = enumC13909xM39207f2 != null ? enumC13909xM39207f2.getButtonColor() : null;
            if (buttonColor == null) {
                c28655q2.m87150e0(-966964521);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2047017578);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, buttonColor.mo134584toComposableColorWaAFU9c(c28655q2, 0));
            }
            if (c17919xM31989h == null) {
                c28655q2.m87150e0(2047018881);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, i14, false);
            } else {
                c28655q2.m87150e0(2047016680);
                c28655q2.m87173q(false);
                jM95624D = c17919xM31989h.f69639a;
            }
            long j7 = jM95624D;
            boolean zM87157i = c28655q2.m87157i(c13844a1) | c28655q2.m87153g(function1);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C11546l(27, c13844a1, function1);
                c28655q2.m87172p0(objM87133R);
            }
            C28655q c28655q4 = c28655q2;
            AbstractC27282u.m82292h(modifierM44103f, enumC27284v, strM21274h3, false, j7, null, false, (InterfaceC4339a) objM87133R, c28655q4, 48, 104);
            c28655q4.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m39642f(C13844a1 c13844a1, Function1 function1) {
        C9598e c9598eM39205c = c13844a1.getDestination();
        if (c9598eM39205c != null) {
            function1.invoke(c9598eM39205c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m39643g(C13844a1 c13844a1, Function1 function1, int i13, Composer composer, int i14) {
        m39640d(c13844a1, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
