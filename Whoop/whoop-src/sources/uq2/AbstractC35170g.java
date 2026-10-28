package uq2;

import am.EnumC0995g;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import hb3.AbstractC17104a0;
import java.util.Iterator;
import jr2.AbstractC21903b;
import jr2.AbstractC21904c;
import kq2.AbstractC22776b;
import l83.C23454a0;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import p718lz1.C24823a;
import p734sl0.C32627j2;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import tx0.C34238a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uq2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Luq2/d;", "state", "", "isCurrentStep", "Ll83/a0;", "k", "(Luq2/d;ZLandroidx/compose/runtime/Composer;I)V", "Luq2/b;", "section", "f", "(Luq2/b;Landroidx/compose/runtime/Composer;I)V", "Luq2/c;", "item", "i", "(Luq2/c;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35170g {

    /* JADX INFO: renamed from: uq2.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f149278w = new a();

        /* JADX INFO: renamed from: a */
        public final long m111303a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111303a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uq2.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f149279w = new b();

        /* JADX INFO: renamed from: a */
        public final long m111304a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m111304a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m111295f(C35165b section, Composer composer, int i13) {
        int i14;
        C35165b c35165b;
        C28655q c28655q;
        C2314t c2314t;
        int i15;
        AbstractC22676k.m65750j(section, "section");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-784847588);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(section) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 1;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(8 * f13);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9108K, c28655q2, 54);
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
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            TextResource sectionTitle = section.getSectionTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(sectionTitle, c28655q2, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8421b = c38072d.m121952e(c28655q2, i17).getB2();
            long brandWhite = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q2, 0, i18, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(section.getSectionSubtitle(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB2(), null, c28655q2, 0, i18, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(section.getSectionAverage(), c28655q2, i16), null, section.getSectionAverageColor().getColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getN8(), null, c28655q2, 0, i18, 196602);
            C28655q c28655q3 = c28655q2;
            C35164a sectionLegend = section.getSectionLegend();
            if (sectionLegend == null) {
                c28655q3.m87150e0(-1570549859);
                c28655q3.m87173q(false);
                c2314t = c2314t2;
                i15 = 4;
            } else {
                c28655q3.m87150e0(-1570549858);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q3, new LayoutWeightElement(1.0f, true));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(sectionLegend.getLowEnd(), c28655q3, i16), null, c38072d.m121949b(c28655q3, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i17).getN9(), null, c28655q3, 0, i18, 196602);
                float f14 = 4;
                AbstractC22989q.m66760a(AbstractC21903b.m62312a(AbstractC1102d.m3424u(10 * f14, AbstractC1102d.m3411h(2 * f14, c2314t2)), sectionLegend.getBackground()), c28655q3, 0);
                c2314t = c2314t2;
                i15 = 4;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(sectionLegend.getHighEnd(), c28655q3, i16), null, c38072d.m121949b(c28655q3, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i17).getN9(), null, c28655q3, 0, i18, 196602);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            float f15 = i15;
            float f16 = f13 * f15;
            c35165b = section;
            C27648a.m83578b(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f16, 7), null, EnumC0995g.Start, ((float) 0.5d) * f15, null, f16, null, AbstractC37817c.m121344e(100860950, c28655q3, new C34238a(c35165b, 13)), c28655q3, 12782982);
            c28655q = c28655q3;
        } else {
            c35165b = section;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c35165b, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m111296g(C35165b c35165b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Iterator<T> it = c35165b.m111278c().iterator();
            while (it.hasNext()) {
                m111298i((C35166c) it.next(), c28655q, 0);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m111297h(C35165b c35165b, int i13, Composer composer, int i14) {
        m111295f(c35165b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m111298i(C35166c c35166c, Composer composer, int i13) {
        int i14;
        Modifier modifierM44455h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(856958786);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c35166c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC39332e color = c35166c.getColor();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f149278w;
                c28655q.m87172p0(objM87133R);
            }
            boolean zM65745e = AbstractC22676k.m65745e(color, p745y81.Function1.m125323a((Function1) objM87133R));
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            C2314t c2314t = C2314t.f9131w;
            if (zM65745e) {
                c28655q.m87150e0(373715233);
                float f13 = 1;
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = b.f149279w;
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM44455h = AbstractC15751g.m44455h(c2314t, f13, p745y81.Function1.m125323a((Function1) objM87133R2).getColor(), c17916v0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(373813224);
                c28655q.m87173q(false);
                modifierM44455h = c2314t;
            }
            float f14 = 2 * 4;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3424u(f14, AbstractC1102d.m3411h(f14, c2314t)), c35166c.getColor().getColor(), c17916v0).mo3471e(modifierM44455h), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c35166c, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m111299j(C35166c c35166c, int i13, Composer composer, int i14) {
        m111298i(c35166c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m111300k(C35167d state, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-862338410);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(325923788, c28655q, new C24823a(state, 29)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35169f(state, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m111301l(C35167d c35167d, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        float f13 = 8;
        float f14 = 1 * f13;
        float f15 = 5;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3395q(c2314t, 4 * f15, f14));
        C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, composer, 6);
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
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3413j(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), ((float) 10.5d) * f13, 0.0f, 2));
        c28655q2.m87150e0(-46954647);
        Iterator<T> it = c35167d.m111286h().iterator();
        while (it.hasNext()) {
            m111295f((C35165b) it.next(), composer, 0);
        }
        c28655q2.m87173q(false);
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3413j(c2314t, f15 * f13, 0.0f, 2));
        if (c35167d.m111285g().isEmpty()) {
            c28655q = c28655q2;
            c28655q.m87150e0(-1455184049);
            Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, 0.0f, 2));
            TextResource footerText = c35167d.getFooterText();
            TextResource footerSubText = c35167d.getFooterSubText();
            int i14 = TextResource.$stable;
            AbstractC22776b.m65990b(modifierM38560g, footerText, footerSubText, composer, (i14 << 6) | (i14 << 3));
            c28655q.m87173q(false);
        } else {
            c28655q2.m87150e0(-1455399406);
            AbstractC30795n.m94704e(AbstractC21904c.m62321i(c35167d.m111285g()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C38072d.f163053a.m121952e(composer, C38072d.f163054b).getT1(), composer, 0, C2886a.f11498d << 21, 131070);
            c28655q = c28655q2;
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m111302m(C35167d c35167d, boolean z4, int i13, Composer composer, int i14) {
        m111300k(c35167d, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
