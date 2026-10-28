package qj2;

import am0.C0999c;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bm0.C3412o;
import bm2.C3446h1;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.util.TrendKey;
import f41.C14076n;
import hy0.AbstractC17808z1;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import lj2.AbstractC24475a;
import nj2.C26774u;
import nj2.C26775v;
import nj2.C26776w;
import nj2.C26777x;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import os0.C28308d;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p90.C29000h;
import q81.C30047e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qj2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0081\u0001\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0003¢\u0006\u0004\b\u0019\u0010\u0018\u001a+\u0010\u001a\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "suffix", "", "Lnj2/w;", "todaySegments", "previousSegments", "Lnj2/x;", "stats", "Lnj2/u;", "cta", "Lnj2/v;", "header", "vow", "Lkotlin/Function1;", "Llj2/a$h;", "Ll83/a0;", "onSeeTrendsClicked", "u", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnj2/u;Lnj2/v;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "m", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "segments", "q", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "s", "j", "(Lnj2/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "o", "(Lnj2/v;Landroidx/compose/runtime/Composer;I)V", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30436a {
    /* JADX INFO: renamed from: j */
    private static final void m93081j(C26774u c26774u, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-965186715);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c26774u) : c28655q.m87157i(c26774u) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 4;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(2 * f13);
            C2306l c2306l = C2299e.f9108K;
            boolean z13 = (i14 & 112) == 32;
            if ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c26774u))) {
                z4 = true;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C28448b(29, function1, c26774u);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
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
            TextResource textResourceM79791c = c26774u.getText();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM79791c, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getBtS(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c26774u.getIcon().toWhoopIcon(), c28655q, 6), AbstractC8693b.m21274h(c26774u.getText(), c28655q, i15), AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 384, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(c26774u, function1, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m93082k(Function1 function1, C26774u c26774u) {
        TrendKey trendKeyM79792d = c26774u.getTrendKey();
        String strM79789a = c26774u.getCurrentDate();
        AbstractC22676k.m65747g(strM79789a);
        function1.invoke(new AbstractC24475a.h(trendKeyM79792d, strM79789a));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m93083l(C26774u c26774u, Function1 function1, int i13, Composer composer, int i14) {
        m93081j(c26774u, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m93084m(TextResource textResource, TextResource textResource2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(928048936);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2), C2299e.f9107J, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i14 & 14) | i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8415M = c38072d.m121952e(c28655q, i16).getSh5();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8415M, null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            if (textResource2 == null) {
                c28655q.m87150e0(1294556888);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1294556889);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, i15), null, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getSh5(), null, c28655q, 0, i17, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0999c(textResource, textResource2, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m93085n(TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m93084m(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m93086o(C26775v c26775v, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(214580190);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c26775v) : c28655q.m87157i(c26775v) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c26775v.getIcon().toWhoopIcon(), c28655q, 6);
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, i15).getWhite50(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c26775v.getTitle(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(c26775v, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m93087p(C26775v c26775v, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m93086o(c26775v, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m93088q(List<C26776w> list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(252013783);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(3 * 4, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2), C2299e.f9107J, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1905525625);
            for (C26776w c26776w : list) {
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                float fM79796b = c26776w.getWeight();
                if (fM79796b <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (fM79796b > Float.MAX_VALUE) {
                    fM79796b = Float.MAX_VALUE;
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3407d.mo3471e(new LayoutWeightElement(fM79796b, true)), c26776w.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a), c28655q, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m93089r(List list, int i13, Composer composer, int i14) {
        m93088q(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r24v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r2v9, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [y81.e] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    private static final void m93090s(List<C26777x> list, Composer composer, int i13) {
        ?? r10;
        ?? r14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-728380469);
        int i14 = 4;
        char c3 = 2;
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(list) ? 4 : 2) : i13;
        boolean z4 = false;
        ?? r15 = 1;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            float f13 = 1.0f;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-457736810);
            ?? r16 = c28655q;
            for (C26777x c26777x : list) {
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, r15);
                float f14 = i14;
                float f15 = ((float) r15) * f14;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, r16, 6);
                int iHashCode2 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, layoutWeightElement);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j2);
                } else {
                    r16.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(r16, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(r16, c0209i3, interfaceC28653p1M87165m2);
                C0209i c0209i4 = C0217k.f732j;
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(r16, c0209i5, modifierM118962N2);
                TextResource textResourceM79800d = c26777x.getTitle();
                int i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM79800d, r16, i16);
                ?? r17 = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                long jM125430y = r17.m121949b(r16, i17).getBrandWhite();
                C2886a c2886aM8405C = r17.m121952e(r16, i17).getN6();
                int i18 = C2886a.f11498d << 18;
                C2314t c2314t2 = c2314t;
                boolean z13 = z4;
                ?? r24 = r16;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C, null, r24, 0, i18, 196602);
                ?? r18 = r24;
                if (c26777x.getChange() == null || c26777x.getTrendTypeState() == null) {
                    r18.m87150e0(187538360);
                    r18.m87173q(z13);
                    r14 = r18;
                } else {
                    r18.m87150e0(187327901);
                    AbstractC17808z1.m51177e(c26777x.getChange(), true, c26777x.getTrendTypeState(), false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, r18, i16 | 48, 0, 32760);
                    ?? r19 = r18;
                    r19.m87173q(z13);
                    r14 = r19;
                }
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9108K, r14, 54);
                int iHashCode3 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r14.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r14, c2314t2);
                r14.m87158i0();
                if (r14.f115903S) {
                    r14.m87163l(c0213j2);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(r14, c0209i3, interfaceC28653p1M87165m3);
                if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N3);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(2 * f14, c2314t2), c26777x.getLabelColor().mo134584toComposableColorWaAFU9c(r14, z13 ? 1 : 0), AbstractC17918w0.f69621a), r14, z13 ? 1 : 0);
                ?? r25 = r14;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c26777x.getLabelText(), r14, i16), null, r17.m121949b(r14, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r14, i17).getH6(), null, r25, 0, i18, 196602);
                ?? r26 = r25;
                r26.m87173q(true);
                r26.m87173q(true);
                z4 = z13 ? 1 : 0;
                c2314t = c2314t2;
                r15 = 1;
                f13 = 1.0f;
                i14 = 4;
                c3 = 2;
                r16 = r26;
            }
            r16.m87173q(z4);
            r16.m87173q(r15);
            r10 = r16;
        } else {
            c28655q.m87138X();
            r10 = c28655q;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m93091t(List list, int i13, Composer composer, int i14) {
        m93090s(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m93092u(TextResource title, TextResource textResource, List<C26776w> todaySegments, List<C26776w> list, List<C26777x> stats, C26774u cta, C26775v c26775v, TextResource textResource2, Function1 onSeeTrendsClicked, Composer composer, int i13, int i14) {
        int i15;
        List<C26776w> list2;
        C28655q c28655q;
        C26775v c26775v2;
        TextResource textResource3;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(todaySegments, "todaySegments");
        AbstractC22676k.m65750j(stats, "stats");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(onSeeTrendsClicked, "onSeeTrendsClicked");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1182617545);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(title) : c28655q2.m87157i(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(todaySegments) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            list2 = list;
            i15 |= c28655q2.m87157i(list2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            list2 = list;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(stats) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= (262144 & i13) == 0 ? c28655q2.m87153g(cta) : c28655q2.m87157i(cta) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i16 = i14 & 64;
        int i17 = 1572864;
        if (i16 != 0) {
            i15 |= i17;
        } else if ((1572864 & i13) == 0) {
            i17 = (2097152 & i13) == 0 ? c28655q2.m87153g(c26775v) : c28655q2.m87157i(c26775v) ? 1048576 : 524288;
            i15 |= i17;
        }
        int i18 = i14 & 128;
        int i19 = 12582912;
        if (i18 != 0) {
            i15 |= i19;
        } else if ((12582912 & i13) == 0) {
            i19 = (16777216 & i13) == 0 ? c28655q2.m87153g(textResource2) : c28655q2.m87157i(textResource2) ? 8388608 : 4194304;
            i15 |= i19;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q2.m87157i(onSeeTrendsClicked) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q2.m87135U(i15 & 1, (38347923 & i15) != 38347922)) {
            C26775v c26775v3 = i16 != 0 ? null : c26775v;
            TextResource textResource4 = i18 != 0 ? null : textResource2;
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, 3), null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite5(), null, null, null, 0.0f, AbstractC37817c.m121344e(-742642855, c28655q2, new C14076n(c26775v3, title, textResource, todaySegments, list2, stats, textResource4, cta, onSeeTrendsClicked)), c28655q, 12582912, 122);
            textResource3 = textResource4;
            c26775v2 = c26775v3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c26775v2 = c26775v;
            textResource3 = textResource2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3446h1(title, textResource, todaySegments, list, stats, cta, c26775v2, textResource3, onSeeTrendsClicked, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m93093v(C26775v c26775v, TextResource textResource, TextResource textResource2, List list, List list2, List list3, TextResource textResource3, C26774u c26774u, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (c26775v == null) {
                c28655q2.m87150e0(-1337720864);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1337720863);
                m93086o(c26775v, c28655q2, TextResource.$stable);
                AbstractC31061c.m95650z(5, 4, c2314t, c28655q2, false);
            }
            int i14 = TextResource.$stable;
            m93084m(textResource, textResource2, c28655q2, (i14 << 3) | i14);
            float f14 = 4;
            float f15 = f14 * f14;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
            m93088q(list, c28655q2, 0);
            if (list2 == null) {
                c28655q2.m87150e0(-1337433959);
                c28655q2.m87173q(false);
            } else {
                AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, -1337433958, f13, f14, c2314t));
                m93088q(list2, c28655q2, 0);
                c28655q2.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
            m93090s(list3, c28655q2, 0);
            if (textResource3 == null) {
                c28655q2.m87150e0(-1337214510);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-1337214509);
                AbstractC18489d0.m53380u(5, f14, c2314t, c28655q2);
                String strM21274h = AbstractC8693b.m21274h(textResource3, c28655q2, i14);
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            if (!C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.STRESS_TREND_CTA) || c26774u.getCurrentDate() == null) {
                c28655q.m87150e0(-1336799853);
                c28655q.m87173q(false);
            } else {
                AbstractC31061c.m95623C(c28655q, -1336923822, c2314t, f15, c28655q);
                boolean zM87153g = c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C29000h(function1, 16);
                    c28655q.m87172p0(objM87133R);
                }
                m93081j(c26774u, (Function1) objM87133R, c28655q, i14);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m93094w(Function1 function1, AbstractC24475a.h it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m93095x(TextResource textResource, TextResource textResource2, List list, List list2, List list3, C26774u c26774u, C26775v c26775v, TextResource textResource3, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m93092u(textResource, textResource2, list, list2, list3, c26774u, c26775v, textResource3, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
