package yq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import g40.C15418s0;
import ge3.AbstractC15751g;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yf1.C39516e;
import yp2.AbstractC39704a;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: yq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"", "recoveryLevel", "", "isFoundingMember", "isWhoopPro", "levelNumber", "Ll83/a0;", "c", "(Ljava/lang/String;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "imageSource", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "text", "e", "(Lkd1/o;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39713a {
    /* JADX INFO: renamed from: c */
    public static final void m127091c(String recoveryLevel, boolean z4, boolean z13, String levelNumber, Composer composer, int i13) {
        int i14;
        boolean z14;
        boolean z15;
        float f13;
        AbstractC22676k.m65750j(recoveryLevel, "recoveryLevel");
        AbstractC22676k.m65750j(levelNumber, "levelNumber");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(605955822);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(recoveryLevel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(levelNumber) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C22949e c22949e = AbstractC22977m.f90650a;
            float f14 = 1;
            float f15 = 8 * f14;
            C22971k c22971kM66747j = AbstractC22977m.m66747j(f15, C2299e.f9110M);
            C2306l c2306l = C2299e.f9108K;
            C2314t c2314t = C2314t.f9131w;
            float f16 = 4;
            Modifier modifierM3411h = AbstractC1102d.m3411h(10 * f16, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f15, 7));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66747j, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
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
            m127093e(new AbstractC22403o.c(recoveryLevel, 0, 0, 0, 14, null), AbstractC37056f.m118959K(new HighlightedText(AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170921n), true), new HighlightedText(levelNumber, false)), c28655q, AbstractC22403o.c.f87642f);
            if (z4) {
                c28655q.m87150e0(273600046);
                f13 = f16;
                z14 = false;
                z15 = true;
                AbstractC15751g.m44449b(AbstractC1102d.m3411h(((float) 9.5d) * f16, AbstractC1102d.m3424u(f14, c2314t)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20(), 0.0f, 0.0f, c28655q, 6, 12);
                m127093e(new AbstractC22403o.a(AbstractC39704a.f170896a), AbstractC37056f.m118959K(new HighlightedText(AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170918k), true), new HighlightedText(AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170922o), false)), c28655q, AbstractC22403o.a.f87639c);
                c28655q.m87173q(false);
            } else {
                z14 = false;
                z15 = true;
                f13 = f16;
                c28655q.m87150e0(274132440);
                c28655q.m87173q(false);
            }
            if (z13) {
                c28655q = c28655q;
                c28655q.m87150e0(274174042);
                C28655q c28655q2 = c28655q;
                AbstractC15751g.m44449b(AbstractC1102d.m3411h(((float) 9.5d) * f13, AbstractC1102d.m3424u(f14, c2314t)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20(), 0.0f, 0.0f, c28655q2, 6, 12);
                c28655q = c28655q2;
                m127093e(new AbstractC22403o.a(AbstractC39704a.f170900e), AbstractC37056f.m118959K(new HighlightedText(AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170904B), z15), new HighlightedText(AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170925r), z14)), c28655q, AbstractC22403o.a.f87639c);
                c28655q.m87173q(z14);
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(274694904);
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(z15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15418s0(recoveryLevel, z4, z13, levelNumber, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m127092d(String str, boolean z4, boolean z13, String str2, int i13, Composer composer, int i14) {
        m127091c(str, z4, z13, str2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final void m127093e(AbstractC22403o abstractC22403o, List<HighlightedText> list, Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1009426904);
        int i14 = (i13 & 6) == 0 ? ((i13 & 8) == 0 ? c28655q2.m87153g(abstractC22403o) : c28655q2.m87157i(abstractC22403o) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(list) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9108K, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q2, AbstractC22403o.f87638a | (i14 & 14), 3);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC39706c.f170923p);
            C28655q c28655q3 = c28655q2;
            AbstractC29125c.m88522c(abstractC26165aM64500i, strM92103Y, null, null, null, 0.0f, null, c28655q3, 0, 124);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
            c28655q3.m87150e0(-1956998036);
            for (HighlightedText highlightedText : list) {
                String text = highlightedText.getText();
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                C2886a b6 = c38072d.m121952e(c28655q3, i15).getB1();
                long jM73366B = highlightedText.getHighlighted() ? AbstractC25012a.m73366B(c28655q3, 138414389, c38072d, c28655q3, i15) : AbstractC31061c.m95627c(c28655q3, 138415474, c38072d, c28655q3, i15);
                c28655q3.m87173q(false);
                C28655q c28655q4 = c28655q3;
                AbstractC30795n.m94707h(text, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                c28655q3 = c28655q4;
            }
            c28655q = c28655q3;
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(abstractC22403o, list, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m127094f(AbstractC22403o abstractC22403o, List list, int i13, Composer composer, int i14) {
        m127093e(abstractC22403o, list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
