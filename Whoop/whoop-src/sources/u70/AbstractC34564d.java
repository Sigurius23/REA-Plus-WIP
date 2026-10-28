package u70;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import t01.C33259e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: u70.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lu70/c;", "heroSection", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "b", "(Landroidx/compose/ui/Modifier;Lu70/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "HEADER_TOP_INSET", "HEADER_BOTTOM_PADDING", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34564d {

    /* JADX INFO: renamed from: a */
    private static final float f145571a;

    /* JADX INFO: renamed from: b */
    private static final float f145572b;

    static {
        float f13 = 8;
        f145571a = 18 * f13;
        f145572b = 2 * f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m109288b(Modifier modifier, C34563c c34563c, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1491457095);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c34563c) : c28655q.m87157i(c34563c) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(c34563c.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3);
            C1100b c1100b = C1100b.f4583a;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, c1100b.mo3401b(c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            Modifier modifierM7154a = AbstractC2294a.m7154a(1.0f, c1100b.mo3401b(c2314t));
            C17909s c17909s = AbstractC17911t.f69612b;
            Float fValueOf = Float.valueOf(0.0f);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM7154a, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))), new C23465k(Float.valueOf(0.35f), new C17919x(C17919x.m51541c(0.4f, c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))), new C23465k(Float.valueOf(0.55f), new C17919x(C17919x.m51541c(0.65f, c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))), new C23465k(Float.valueOf(0.75f), new C17919x(C17919x.m51541c(0.8f, c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))), new C23465k(Float.valueOf(0.9f), new C17919x(C17919x.m51541c(0.9f, c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM7154a2 = AbstractC2294a.m7154a(2.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC22953f.m66724m(AbstractC1102d.m3409f(1.0f, c2314t)), 0.0f, f145571a, 0.0f, 0.0f, 13), f13 * f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f145572b, 7));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM7154a2);
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
            TextResource title = c34563c.getTitle();
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q, i18);
            C2886a t14 = c38072d.m121952e(c28655q, i17).getT2();
            long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i19 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 0, i19, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34563c.getSubtitle(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i19, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34563c.getDescription(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i19, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, c34563c, function1, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m109289c(Modifier modifier, C34563c c34563c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m109288b(modifier, c34563c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
