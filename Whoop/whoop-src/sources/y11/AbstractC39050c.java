package y11;

import am0.C0998b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import as1.C1945f;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import g41.C15459c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import n21.C26190d;
import n21.C26191e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p700bd1.C3101s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wq1.C37508b;
import wr0.C37564y;
import x81.C38072d;
import xl0.C38448b;
import zy0.AbstractC41218f;

/* JADX INFO: renamed from: y11.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0015\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, m65681d2 = {"Ly11/d;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "o", "(Ly11/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ly11/f;", "barData", "", "showGradient", "k", "(Ly11/f;ZLandroidx/compose/runtime/Composer;I)V", "", "barSum", "m", "(Ly11/f;FLandroidx/compose/runtime/Composer;I)V", "", "Ly11/e;", "segments", "segmentSum", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;FZLandroidx/compose/runtime/Composer;I)V", "q", "(Ly11/d;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "F", "BAR_HEIGHT", "b", "RADIUS_OF_CARD", "c", "RADIUS_OF_BAR", "d", "MIN_BAR_WIDTH", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39050c {

    /* JADX INFO: renamed from: a */
    private static final float f168033a;

    /* JADX INFO: renamed from: b */
    private static final float f168034b;

    /* JADX INFO: renamed from: c */
    private static final float f168035c;

    /* JADX INFO: renamed from: d */
    private static final float f168036d = 0.4f;

    static {
        float f13 = 4;
        f168033a = f13 * f13;
        f168034b = 2 * f13;
        f168035c = ((float) 0.5d) * f13;
    }

    /* JADX INFO: renamed from: h */
    private static final void m124479h(List<? extends InterfaceC39052e> list, float f13, boolean z4, Composer composer, int i13) {
        char c3;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2070942396);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f14 = 0.0f;
            Float fValueOf = Float.valueOf(0.0f);
            C38072d c38072d = C38072d.f163053a;
            char c7 = 6;
            C23465k[] c23465kArr = {new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.6f, c38072d.m121949b(c28655q, 6).getBlack5()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d.m121949b(c28655q, 6).getTransparent()))};
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f168033a, AbstractC1102d.m3409f(1.0f, c2314t)), AbstractC33253j.m105489e(f168035c));
            boolean zM87157i = ((i14 & 896) == 256) | c28655q.m87157i(c23465kArr);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C1945f(z4, c23465kArr, 9);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM118994r, (Function1) objM87133R);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.25d) * 4), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3480c);
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
            c28655q.m87150e0(-1761805108);
            for (InterfaceC39052e interfaceC39052e : list) {
                float fMo124494a = f13 > f14 ? interfaceC39052e.getFillPercent() / f13 : f14;
                if (fMo124494a > f14) {
                    c28655q.m87150e0(1986424260);
                    if (interfaceC39052e instanceof InterfaceC39052e.a) {
                        c28655q.m87150e0(1986479874);
                        if (fMo124494a <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (fMo124494a > Float.MAX_VALUE) {
                            fMo124494a = Float.MAX_VALUE;
                        }
                        z13 = false;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3406c(1.0f, new LayoutWeightElement(fMo124494a, true)), ((InterfaceC39052e.a) interfaceC39052e).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a), c28655q, 0);
                        c28655q.m87173q(false);
                        c3 = 6;
                    } else {
                        if (!(interfaceC39052e instanceof InterfaceC39052e.b)) {
                            throw AbstractC11895b.m32003v(202625534, c28655q, false);
                        }
                        c28655q.m87150e0(1986838854);
                        if (fMo124494a <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (fMo124494a > Float.MAX_VALUE) {
                            fMo124494a = Float.MAX_VALUE;
                        }
                        Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, new LayoutWeightElement(fMo124494a, true));
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        int iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3406c);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        C0209i c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        c3 = 6;
                        AbstractC41218f.m133900c(AbstractC1102d.m3406c(1.0f, c2314t), null, c28655q, 6, 2);
                        c28655q.m87173q(true);
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                } else {
                    c3 = c7;
                    c28655q.m87150e0(1987189650);
                    c28655q.m87173q(false);
                }
                c7 = c3;
                f14 = 0.0f;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15459c(list, f13, z4, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m124480i(boolean z4, C23465k[] c23465kArr, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        if (z4) {
            InterfaceC22131e.m63385u(drawWithContent, C17909s.m51487e(AbstractC17911t.f69612b, (C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length), 0L, 0L, 14), 0L, 0L, 0.0f, null, 3, 62);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m124481j(List list, float f13, boolean z4, int i13, Composer composer, int i14) {
        m124479h(list, f13, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m124482k(C39053f c39053f, boolean z4, Composer composer, int i13) {
        int i14;
        boolean z13;
        C2307m c2307m = C2299e.f9114w;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(185104374);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c39053f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Iterator<T> it = c39053f.m124496a().iterator();
            double dMo124494a = 0.0d;
            while (it.hasNext()) {
                dMo124494a += (double) ((InterfaceC39052e) it.next()).getFillPercent();
            }
            float fM36283m = AbstractC12889b.m36283m((float) dMo124494a, 0.0f, 1.0f);
            C2314t c2314t = C2314t.f9131w;
            float f13 = 1;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 8 * f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (c39053f.getIsTitleOnTop()) {
                c28655q.m87150e0(-495375875);
                m124484m(c39053f, fM36283m, c28655q, i14 & 14);
                Modifier modifierM3409f = AbstractC1102d.m3409f(fM36283m, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                m124479h(c39053f.m124496a(), fM36283m, z4, c28655q, (i14 << 3) & 896);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                z13 = true;
            } else {
                c28655q.m87150e0(-495142755);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(fM36283m, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                m124479h(c39053f.m124496a(), fM36283m, z4, c28655q, (i14 << 3) & 896);
                z13 = true;
                c28655q.m87173q(true);
                m124484m(c39053f, fM36283m, c28655q, i14 & 14);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(c39053f, z4, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m124483l(C39053f c39053f, boolean z4, int i13, Composer composer, int i14) {
        m124482k(c39053f, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m124484m(C39053f c39053f, float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(311759582);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c39053f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float fM36283m = AbstractC12889b.m36283m(f13, f168036d, 1.0f);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(fM36283m, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
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
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(c39053f.getTitleDisplay(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            C2886a c2886aM8438s = c38072d.m121952e(c28655q, 6).getH5();
            long jM125385c1 = c38072d.m121949b(c28655q, 6).getWhite70();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, false), 0.0f, 0.0f, 2 * 8, 0.0f, 11), jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, c2886aM8438s, null, c28655q, 0, 3072, 188408);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39053f.getValueDisplay(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getN7(), null, c28655q, 0, 3072, 188410);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3101s(c39053f, f13, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m124485n(C39053f c39053f, float f13, int i13, Composer composer, int i14) {
        m124484m(c39053f, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m124486o(C39051d viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1936794419);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 4), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(279482650);
            Iterator<T> it = viewState.m124491a().iterator();
            while (it.hasNext()) {
                m124482k((C39053f) it.next(), viewState.getShowGradient(), c28655q, 0);
            }
            c28655q.m87173q(false);
            m124488q(viewState, c28655q, i15 & 14);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(viewState, i13, modifier2, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m124487p(C39051d c39051d, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m124486o(c39051d, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private static final void m124488q(C39051d c39051d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1372479498);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(c39051d) ? 4 : 2) : i13;
        int i15 = 0;
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (c39051d.m124492b().isEmpty()) {
            c28655q.m87150e0(-550753512);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-551794275);
            int i16 = 6;
            long jM125416r = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f168034b);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1092a.m3358c(c2314t, jM125416r, c33252iM105489e));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            c28655q.m87150e0(835696129);
            for (C39066s c39066s : c39051d.m124492b()) {
                C2306l c2306l = C2299e.f9108K;
                C22961h c22961h = AbstractC22977m.f90656g;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                C26190d c26190d = new C26190d();
                C26191e c26191eM124580a = c39066s.getLegendState();
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C38448b(22);
                    c28655q.m87172p0(objM87133R);
                }
                c26190d.Compose(c26191eM124580a, (Function1) objM87133R, c28655q, 48);
                String strM21274h = AbstractC8693b.m21274h(c39066s.getLegendValue(), c28655q, i15);
                C2886a c2886aM8407E = C38072d.f163053a.m121952e(c28655q, i16).getN8();
                long jMo134584toComposableColorWaAFU9c = c39066s.getLegendState().getTextColor().mo134584toComposableColorWaAFU9c(c28655q, i15);
                C28655q c28655q2 = c28655q;
                C2314t c2314t2 = c2314t;
                AbstractC30795n.m94707h(strM21274h, c2314t2, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8407E, null, c28655q2, 48, 0, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                i15 = i15;
                c2314t = c2314t2;
                i16 = i16;
            }
            boolean z4 = i15;
            AbstractC2875y.m8286B(c28655q, z4, true, true, z4);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37564y(c39051d, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m124489r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m124490s(C39051d c39051d, int i13, Composer composer, int i14) {
        m124488q(c39051d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
