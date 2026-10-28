package vq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hb3.AbstractC17104a0;
import java.util.List;
import jr2.AbstractC21904c;
import kq2.AbstractC22776b;
import l83.C23454a0;
import l83.C23465k;
import o42.C27532l;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: vq2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lvq2/c;", "stepState", "", "isCurrentStep", "Ll83/a0;", "d", "(Lvq2/c;ZLandroidx/compose/runtime/Composer;I)V", "", "iconResource", "", "title", "subtitle", "g", "(ILjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36289f {
    /* JADX INFO: renamed from: d */
    public static final void m116010d(C36286c stepState, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(stepState, "stepState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-338433048);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(stepState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(367715358, c28655q, new C36287d(stepState, 0)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36288e(stepState, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m116011e(C36286c c36286c, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
        C22957g c22957g = AbstractC22977m.f90653d;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, composer, 6);
        C28655q c28655q2 = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3407d);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q2.f115906a;
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j);
        } else {
            c28655q2.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(composer, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N);
        float f13 = 5;
        float f14 = 8;
        float f15 = 2 * f14;
        Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f14, f15);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, composer, 6);
        int iHashCode2 = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3395q);
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j);
        } else {
            c28655q2.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i, c22994r1M66759a);
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N2);
        C38072d c38072d = C38072d.f163053a;
        int iM46154a = c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getBedtime();
        String strM92103Y = AbstractC30060g.m92103Y(composer, AbstractC39706c.f170911d);
        TextResource textResourceM115997f = c36286c.getBedtimeText();
        int i14 = TextResource.$stable;
        m116013g(iM46154a, strM92103Y, AbstractC8693b.m21274h(textResourceM115997f, composer, i14), composer, 0);
        m116013g(c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getWaketime(), AbstractC30060g.m92103Y(composer, AbstractC39706c.f170903A), AbstractC8693b.m21274h(c36286c.getWaketimeText(), composer, i14), composer, 0);
        c28655q2.m87173q(true);
        float f16 = 4;
        Modifier modifierM3412i = AbstractC1102d.m3412i(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7)), 10 * f16, 50 * f16);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        AbstractC36284a.m115991h(c36286c, AbstractC11895b.m31988g(modifierM3412i, false, 1.0f), composer, 0, 0);
        if (c36286c.m116000i().isEmpty()) {
            c28655q = c28655q2;
            c28655q.m87150e0(628048917);
            AbstractC22776b.m65990b(AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f14, 0.0f, 2)), c36286c.getFooterText(), c36286c.getFooterSubText(), composer, (i14 << 6) | (i14 << 3));
            c28655q.m87173q(false);
        } else {
            c28655q2.m87150e0(627324943);
            List<C23465k> listM62321i = AbstractC21904c.m62321i(c36286c.m116000i());
            int i15 = C38072d.f163054b;
            C2886a c2886aM8416N = c38072d.m121952e(composer, i15).getT1();
            float f17 = f13 * f16;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f16, 7);
            int i16 = C2886a.f11498d;
            AbstractC30795n.m94704e(listM62321i, modifierM3398t, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c2886aM8416N, composer, 48, i16 << 21, 131068);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c36286c.getSubtitleText(), composer, i14), AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), 0.0f, 0.0f, 0.0f, f17, 7), c38072d.m121949b(composer, i15).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i15).getB1(), null, composer, 48, i16 << 18, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m116012f(C36286c c36286c, boolean z4, int i13, Composer composer, int i14) {
        m116010d(c36286c, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m116013g(int i13, String title, String subtitle, Composer composer, int i14) {
        int i15;
        String str;
        String str2;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1074049732);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(title) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(subtitle) ? 256 : 128;
        }
        int i16 = i15;
        if (c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(i13, c28655q, i16 & 14);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC15005f3.m43107a(abstractC26165aM88500I, title, null, c38072d.m121949b(c28655q, i17).getWhite50(), c28655q, i16 & 112, 4);
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i17).getB1();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, (i16 >> 3) & 14, i18, 196602);
            str = title;
            str2 = subtitle;
            AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getN7(), null, c28655q, (i16 >> 6) & 14, i18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            str = title;
            str2 = subtitle;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27532l(i13, str, str2, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m116014h(int i13, String str, String str2, int i14, Composer composer, int i15) {
        m116013g(i13, str, str2, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }
}
