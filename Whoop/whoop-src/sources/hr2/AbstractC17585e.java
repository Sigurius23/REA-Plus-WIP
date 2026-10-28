package hr2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import gy0.AbstractC16272a;
import hb3.AbstractC17104a0;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.InterfaceC3747i0;
import p163g1.AbstractC15011f9;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import p717lq2.AbstractC24688t;
import p717lq2.EnumC24674f;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: hr2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lhr2/b;", "viewState", "", "isCurrentStep", "Ll83/a0;", "d", "(Lhr2/b;ZLandroidx/compose/runtime/Composer;I)V", "Lhr2/a;", "coloredText", "Ly3/o;", "textSize", "g", "(Lhr2/a;JLandroidx/compose/runtime/Composer;I)V", "a", "Lhr2/b;", "getWirPillarIntroViewState", "()Lhr2/b;", "wirPillarIntroViewState", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17585e {

    /* JADX INFO: renamed from: a */
    private static final C17582b f68138a;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Let's");
        EnumC39333f enumC39333f = EnumC39333f.SLEEP;
        List listM118959K = AbstractC37056f.m118959K(new C17581a(textResourceM21278l, enumC39333f), new C17581a(AbstractC8693b.m21278l("review"), enumC39333f), new C17581a(AbstractC8693b.m21278l("your"), enumC39333f), new C17581a(AbstractC8693b.m21278l("Sleep "), EnumC39333f.BRAND_WHITE));
        AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f61976O4);
        AbstractC24688t.d dVar = new AbstractC24688t.d(EnumC24674f.PRIMARY);
        f68138a = new C17582b(listM118959K, aVar, AbstractC35745c.m113248j(80.0f, 4294967296L), UserJourneyFooterStyle.STEP_PROGRESS, dVar, "INTRO_PILLAR_SLEEP", null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m50069d(C17582b viewState, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2056512141);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(-950570941, c28655q, new C2476a1(viewState, 19)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17583c(viewState, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m50070e(C17582b c17582b, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3407d);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(composer, c0209i, interfaceC39127r0M66763d);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N);
        AbstractC29125c.m88522c(AbstractC22404p.m64500i(c17582b.getBackgroundImage(), null, null, composer, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(140 * 4, c2314t)), null, C39102j.f168201c, 0.0f, null, composer, 25008, 104);
        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), ((float) 2.5d) * 8, 0.0f, 2);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 48);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3396r);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i, c23010xM66775a);
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N2);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        AbstractC22953f.m66715b(composer, new LayoutWeightElement(1.0f, true));
        c28655q.m87150e0(-1910136764);
        Iterator<T> it = c17582b.m50064f().iterator();
        while (it.hasNext()) {
            m50072g((C17581a) it.next(), AbstractC31061c.m95626b(C39183o.m124805c(c17582b.getTextSize()), 4294967296L, (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)), composer, TextResource.$stable);
        }
        AbstractC25012a.m73392y(c28655q, false, true, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m50071f(C17582b c17582b, boolean z4, int i13, Composer composer, int i14) {
        m50069d(c17582b, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m50072g(C17581a coloredText, long j7, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(coloredText, "coloredText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(217158981);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(coloredText) : c28655q2.m87157i(coloredText) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87151f(j7) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q = c28655q2;
            AbstractC15011f9.m43114b(AbstractC8693b.m21274h(coloredText.getText(), c28655q2, TextResource.$stable), null, coloredText.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), j7, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC17588h.m50089a(), c28655q, (i14 << 6) & 7168, 1572864, 65522);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17584d(coloredText, j7, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m50073h(C17581a c17581a, long j7, int i13, Composer composer, int i14) {
        m50072g(c17581a, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
