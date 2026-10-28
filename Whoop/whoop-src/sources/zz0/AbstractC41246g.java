package zz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e81.C12828g;
import eg2.C13179l;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C22999t0;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import ph1.C29244h;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import vq2.C36287d;
import wb3.AbstractC37056f;
import x30.C37894h1;
import x81.C38072d;
import z51.C40103n;
import zi1.C40670c0;
import zm1.C40893d;

/* JADX INFO: renamed from: zz0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lzz0/m;", "state", "Lkotlin/Function1;", "Lzz0/l;", "Ll83/a0;", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Lzz0/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lzz0/a;", "r", "(Landroidx/compose/ui/Modifier;Lzz0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lzz0/i;", "", "monthIndex", "D", "(Landroidx/compose/ui/Modifier;Lzz0/i;ILandroidx/compose/runtime/Composer;II)V", "count", "F", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "Lzz0/c;", "v", "(Landroidx/compose/ui/Modifier;Lzz0/c;Landroidx/compose/runtime/Composer;II)V", "", "Lzz0/h;", "items", "z", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "B", "(Landroidx/compose/ui/Modifier;Lzz0/h;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41246g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m133964A(Modifier modifier, List list, int i13, int i14, Composer composer, int i15) {
        m133996z(modifier, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m133965B(Modifier modifier, C41247h c41247h, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C41247h c41247h2;
        Modifier modifier3;
        Modifier modifierM3358c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-519566002);
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
            c41247h2 = c41247h;
            i15 |= c28655q.m87153g(c41247h2) ? 32 : 16;
        } else {
            c41247h2 = c41247h;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 0.5d, 8, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 4;
            float f14 = 2 * f13;
            EnumC41241b enumC41241bM133999c = c41247h2.getStatusStyle();
            if (enumC41241bM133999c == EnumC41241b.EMPTY) {
                AbstractC31061c.m95623C(c28655q, -1979882516, c2314t, f14, c28655q);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1979789795);
                EnumC39333f fillColor = enumC41241bM133999c.getFillColor();
                Modifier modifierM44455h = null;
                if (fillColor == null) {
                    c28655q.m87150e0(-1979745404);
                    c28655q.m87173q(false);
                    modifierM3358c = null;
                } else {
                    c28655q.m87150e0(-1979745403);
                    modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, AbstractC33253j.f138651a), fillColor.mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a);
                    c28655q.m87173q(false);
                }
                if (modifierM3358c == null) {
                    modifierM3358c = c2314t;
                }
                EnumC39333f borderColor = enumC41241bM133999c.getBorderColor();
                if (borderColor == null) {
                    c28655q.m87150e0(-1979534139);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1979534138);
                    modifierM44455h = AbstractC15751g.m44455h(c2314t, ((float) 0.25d) * f13, borderColor.mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC33253j.f138651a);
                    c28655q.m87173q(false);
                }
                if (modifierM44455h == null) {
                    modifierM44455h = c2314t;
                }
                AbstractC22989q.m66760a(AbstractC1102d.m3419p(f14, c2314t).mo3471e(modifierM3358c).mo3471e(modifierM44455h), c28655q, 0);
                c28655q.m87173q(false);
            }
            String strM21274h = AbstractC8693b.m21274h(c41247h2.getLabel(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c41247h.getCountLabel(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(modifier3, i13, c41247h, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m133966C(Modifier modifier, C41247h c41247h, int i13, int i14, Composer composer, int i15) {
        m133965B(modifier, c41247h, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m133967D(Modifier modifier, C41248i c41248i, int i13, Composer composer, int i14, int i15) {
        Modifier modifier2;
        int i16;
        C28655q c28655q;
        Modifier modifier3;
        double d3;
        C2306l c2306l = C2299e.f9108K;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-35829867);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87157i(c41248i) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87149e(i13) ? 256 : 128;
        }
        if (c28655q2.m87135U(i16 & 1, (i16 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            Modifier modifierM44101d = AbstractC15676d.m44101d(modifier4, "behaviors_calendar_month_" + i13);
            float f13 = (float) 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1) * f13), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44101d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(((float) 0.5d) * f13, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(c41248i.getMonthName(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            C2306l c2306l2 = c2306l;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH5(), null, c28655q2, 0, 0, 196602);
            C28655q c28655q3 = c28655q2;
            if (c41248i.getYesCount() > 0) {
                c28655q3.m87150e0(816047229);
                m133969F(null, c41248i.getYesCount(), c28655q3, 0, 1);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(816129875);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            int i18 = 6;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9107J, c28655q3, 6);
            int iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3409f2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
            c28655q3.m87150e0(1764717783);
            Iterator<T> it = c41248i.m134000a().iterator();
            while (true) {
                d3 = 0.0d;
                if (!it.hasNext()) {
                    break;
                }
                String strM21274h2 = AbstractC8693b.m21274h((TextResource) it.next(), c28655q3, 0);
                C38072d c38072d2 = C38072d.f163053a;
                C2886a c2886aM8424e = c38072d2.m121952e(c28655q3, i18).getB5();
                long jM125382b1 = c38072d2.m121949b(c28655q3, i18).getWhite50();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                C28655q c28655q4 = c28655q3;
                AbstractC30795n.m94707h(strM21274h2, new LayoutWeightElement(1.0f, true), jM125382b1, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8424e, null, c28655q4, 0, 0, 196088);
                i18 = i18;
                c28655q3 = c28655q4;
            }
            int i19 = i18;
            c28655q = c28655q3;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            c28655q.m87150e0(-840323852);
            Iterator<T> it3 = c41248i.m134002c().iterator();
            while (it3.hasNext()) {
                List<C41242c> list = (List) it3.next();
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C2306l c2306l3 = c2306l2;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, c2306l3, c28655q, 54);
                int iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                double d14 = d3;
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                c28655q.m87150e0(279603961);
                for (C41242c c41242c : list) {
                    if (1.0f <= d14) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    int iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    C0209i c0209i6 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    m133992v(AbstractC1099a.m3394p(((float) 0.25d) * f13, c2314t), c41242c, c28655q, i19, 0);
                    c28655q.m87173q(true);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c2306l2 = c2306l3;
                d3 = d14;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29244h(modifier3, c41248i, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m133968E(Modifier modifier, C41248i c41248i, int i13, int i14, int i15, Composer composer, int i16) {
        m133967D(modifier, c41248i, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m133969F(Modifier modifier, int i13, Composer composer, int i14, int i15) {
        Modifier modifier2;
        int i16;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1507491003);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = i14 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            float f13 = 4;
            float f14 = 1 * f13;
            Modifier modifierM118994r = AbstractC37056f.m118994r(modifier4, AbstractC33253j.m105489e(f14));
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC1092a.m3358c(modifierM118994r, C17919x.m51541c(0.2f, c38072d.m121949b(c28655q, 6).getRecovery()), AbstractC17918w0.f69621a));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6), null, AbstractC1102d.m3419p(2 * f13, c2314t), c38072d.m121949b(c28655q, 6).getRecovery(), c28655q, 432, 0);
            AbstractC30795n.m94707h(String.valueOf(i13), null, c38072d.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13179l(modifier3, i13, i14, i15, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m133970G(Modifier modifier, int i13, int i14, int i15, Composer composer, int i16) {
        m133969F(modifier, i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x0178  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0216  */
    /* JADX WARN: Code duplicated, block: B:79:0x0230  */
    /* JADX WARN: Code duplicated, block: B:81:0x028f  */
    /* JADX WARN: Code duplicated, block: B:84:0x029a  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public static final void m133984n(Modifier modifier, C41252m state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        Function1 function5;
        int i16;
        boolean z13;
        Function1 function6;
        int iHashCode2;
        C0209i c0209i5;
        int iHashCode3;
        Object objM87133R;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-738192293);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
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
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C40893d(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier2), "behaviors_calendar");
                f13 = 8;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.75d) * f13), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                function5 = function4;
                Modifier modifier3 = modifier2;
                i16 = i15;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT3(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                if (state.getIsLoading()) {
                    c28655q.m87150e0(1241003100);
                    z13 = true;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 3 * f13, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i5 = c0209i3;
                    } else {
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, "behaviors_calendar_loading");
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44101d2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    AbstractC33199m0.m105210B(AbstractC33208p0.c.f138471e, c28655q, 6);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    function6 = function5;
                } else {
                    z13 = true;
                    c28655q.m87150e0(1241422747);
                    m133988r(null, state.getDatePickerState(), function5, c28655q, i16 & 896, 1);
                    function6 = function5;
                    AbstractC22960g2.m66729a(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC22977m.m66746i(((float) 1.5d) * f13), AbstractC22977m.m66746i(1 * f13), null, 0, 0, AbstractC37817c.m121344e(1799078618, c28655q, new C36287d(state, 8)), c28655q, 1573302, 56);
                    m133996z(null, state.m134016e(), c28655q, 0, 1);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                function3 = function6;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(modifier2, state, function3, i13, i14, 17);
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
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            if (i18 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40893d(20);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier2), "behaviors_calendar");
            f13 = 8;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.75d) * f13), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44101d3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            String strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            function5 = function4;
            Modifier modifier4 = modifier2;
            i16 = i15;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getT3(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            if (state.getIsLoading()) {
                c28655q.m87150e0(1241003100);
                z13 = true;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 3 * f13, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t, "behaviors_calendar_loading");
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM44101d4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                AbstractC33199m0.m105210B(AbstractC33208p0.c.f138471e, c28655q, 6);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                function6 = function5;
            } else {
                z13 = true;
                c28655q.m87150e0(1241422747);
                m133988r(null, state.getDatePickerState(), function5, c28655q, i16 & 896, 1);
                function6 = function5;
                AbstractC22960g2.m66729a(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC22977m.m66746i(((float) 1.5d) * f13), AbstractC22977m.m66746i(1 * f13), null, 0, 0, AbstractC37817c.m121344e(1799078618, c28655q, new C36287d(state, 8)), c28655q, 1573302, 56);
                m133996z(null, state.m134016e(), c28655q, 0, 1);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            function3 = function6;
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(modifier2, state, function3, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m133985o(AbstractC41251l it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m133986p(C41252m c41252m, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(FlowRow) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            int i14 = 0;
            for (Object obj : c41252m.m134017f()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                m133967D(((C22999t0) FlowRow).mo66772c(C2314t.f9131w, false, 1.0f), (C41248i) obj, i14, c28655q, 0, 0);
                i14 = i15;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m133987q(Modifier modifier, C41252m c41252m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133984n(modifier, c41252m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m133988r(Modifier modifier, final C41240a c41240a, final Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-362229029);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c41240a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            float f13 = 1 * 8;
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(modifier4, 0.0f, f13, 1)), "behaviors_calendar_date_picker");
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            C27430e c27430eM38571r = AbstractC13673n.m38571r(c38072d, c28655q, 6);
            long jM51541c = C17919x.m51541c(c41240a.getCanNavigateBackward() ? 1.0f : 0.3f, c38072d.m121949b(c28655q, 6).getBrandWhite());
            float f14 = 4 * 5;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11));
            boolean zM133952a = c41240a.getCanNavigateBackward();
            int i17 = i15 & 112;
            int i18 = i15 & 896;
            boolean z4 = (i17 == 32) | (i18 == 256);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                final int i19 = 0;
                objM87133R = new InterfaceC4339a() { // from class: zz0.f
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return AbstractC41246g.m133989s(c41240a, function1);
                            default:
                                return AbstractC41246g.m133990t(c41240a, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15005f3.m43108b(c27430eM38571r, null, AbstractC15676d.m44101d(AbstractC1092a.m3362g(modifierM3419p, zM133952a, null, null, (InterfaceC4339a) objM87133R, 14), "behaviors_calendar_previous_button"), jM51541c, c28655q, 48, 0);
            boolean z13 = false;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c41240a.getCurrentDateRangeDisplay(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6);
            long jM51541c2 = C17919x.m51541c(c41240a.getCanNavigateForward() ? 1.0f : 0.3f, c38072d.m121949b(c28655q, 6).getBrandWhite());
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f14, AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14));
            boolean zM133953b = c41240a.getCanNavigateForward();
            boolean z14 = i17 == 32;
            if (i18 == 256) {
                z13 = true;
            }
            boolean z15 = z14 | z13;
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                final int i24 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: zz0.f
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return AbstractC41246g.m133989s(c41240a, function1);
                            default:
                                return AbstractC41246g.m133990t(c41240a, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC15676d.m44101d(AbstractC1092a.m3362g(modifierM3419p2, zM133953b, null, null, (InterfaceC4339a) objM87133R2, 14), "behaviors_calendar_next_button"), jM51541c2, c28655q, 48, 0);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(modifier3, c41240a, function1, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m133989s(C41240a c41240a, Function1 function1) {
        String strM133956e = c41240a.getPreviousDateTime();
        if (strM133956e != null) {
            function1.invoke(new AbstractC41251l.a(strM133956e));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m133990t(C41240a c41240a, Function1 function1) {
        String strM133955d = c41240a.getNextDateTime();
        if (strM133955d != null) {
            function1.invoke(new AbstractC41251l.b(strM133955d));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m133991u(Modifier modifier, C41240a c41240a, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m133988r(modifier, c41240a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m133992v(Modifier modifier, final C41242c c41242c, Composer composer, final int i13, final int i14) {
        int i15;
        final Modifier modifier2;
        Modifier modifierM44455h;
        Modifier modifierM3358c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1238720518);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c41242c) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = C2314t.f9131w;
            final Modifier modifier4 = i16 != 0 ? modifier3 : modifier;
            float f13 = 4;
            float f14 = 2 * f13;
            EnumC41241b enumC41241bM133957a = c41242c.getDayStatus();
            if (enumC41241bM133957a == EnumC41241b.EMPTY) {
                c28655q.m87150e0(-363707881);
                AbstractC22953f.m66715b(c28655q, AbstractC15676d.m44101d(AbstractC1102d.m3419p(f14, modifier4), "behaviors_calendar_day_empty"));
                c28655q.m87173q(false);
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i17 = 1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: zz0.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i17) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC41246g.m133995y(modifier4, c41242c, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC41246g.m133993w(modifier4, c41242c, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    return;
                }
                return;
            }
            c28655q.m87150e0(-363537784);
            c28655q.m87173q(false);
            if (c41242c.getIsToday()) {
                c28655q.m87150e0(-363482325);
                modifierM44455h = AbstractC15751g.m44455h(modifier3, ((float) 0.375d) * f13, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), AbstractC33253j.f138651a);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-363324752);
                c28655q.m87173q(false);
                modifierM44455h = modifier3;
            }
            EnumC39333f fillColor = enumC41241bM133957a.getFillColor();
            Modifier modifierM44455h2 = null;
            if (fillColor == null) {
                c28655q.m87150e0(-363246788);
                c28655q.m87173q(false);
                modifierM3358c = null;
            } else {
                c28655q.m87150e0(-363246787);
                modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifier3, AbstractC33253j.f138651a), fillColor.mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a);
                c28655q.m87173q(false);
            }
            if (modifierM3358c == null) {
                modifierM3358c = modifier3;
            }
            EnumC39333f borderColor = enumC41241bM133957a.getBorderColor();
            if (borderColor == null) {
                c28655q.m87150e0(-363077683);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-363077682);
                modifierM44455h2 = AbstractC15751g.m44455h(modifier3, ((float) 0.25d) * f13, borderColor.mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC33253j.f138651a);
                c28655q.m87173q(false);
            }
            if (modifierM44455h2 != null) {
                modifier3 = modifierM44455h2;
            }
            Modifier modifierMo3471e = AbstractC1102d.m3419p(f14, modifier4).mo3471e(modifierM3358c).mo3471e(modifier3).mo3471e(modifierM44455h);
            boolean zM87149e = c28655q.m87149e(enumC41241bM133957a.ordinal());
            Object objM87133R = c28655q.m87133R();
            if (zM87149e || objM87133R == C28635l.f115821a) {
                objM87133R = new C37894h1(enumC41241bM133957a, 21);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierMo3471e, false, (Function1) objM87133R);
            String lowerCase = enumC41241bM133957a.name().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            AbstractC22989q.m66760a(AbstractC15676d.m44101d(modifierM51775c, "behaviors_calendar_day_".concat(lowerCase)), c28655q, 0);
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i18 = 0;
            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: zz0.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i18) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC41246g.m133995y(modifier2, c41242c, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC41246g.m133993w(modifier2, c41242c, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m133993w(Modifier modifier, C41242c c41242c, int i13, int i14, Composer composer, int i15) {
        m133992v(modifier, c41242c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m133994x(EnumC41241b enumC41241b, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(enumC41241b.name(), semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m133995y(Modifier modifier, C41242c c41242c, int i13, int i14, Composer composer, int i15) {
        m133992v(modifier, c41242c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m133996z(Modifier modifier, List<C41247h> list, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(349479340);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3395q(modifier2, ((float) 0.5d) * f13, f14)), "behaviors_calendar_legend");
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1082802847);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                m133965B(null, (C41247h) it.next(), c28655q, 0, 1);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12828g(modifier2, list, i13, i14, 8);
        }
    }
}
