package p721n22;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b23.C2342h;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import js2.C21930h;
import l83.C23454a0;
import mx1.C26009o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11361i0;
import p077d0.C11373l0;
import p077d0.C11381n0;
import p077d0.C11385o0;
import p077d0.EnumC11408v0;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22134h;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: n22.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "iconContent", "e", "(Lc93/m;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)V", "Ld0/l0;", "", "index", "", "label", "Lp1/t2;", "", "j", "(Ld0/l0;ILjava/lang/String;Landroidx/compose/runtime/Composer;I)Lp1/t2;", "", "Li2/x;", "a", "Ljava/util/List;", "gradientBorderColors", "b", "gradientFillColors", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {

    /* JADX INFO: renamed from: a */
    private static final List<C17919x> f103908a;

    /* JADX INFO: renamed from: b */
    private static final List<C17919x> f103909b;

    static {
        List<C17919x> listM118959K = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4284923135L)), new C17919x(AbstractC17918w0.m51517e(4283210713L)), new C17919x(AbstractC17918w0.m51517e(4278227943L)));
        f103908a = listM118959K;
        f103909b = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, listM118959K.get(0).f69639a)), new C17919x(C17919x.m51541c(0.2f, listM118959K.get(1).f69639a)), new C17919x(C17919x.m51541c(0.2f, listM118959K.get(2).f69639a)));
    }

    /* JADX INFO: renamed from: e */
    public static final void m77800e(InterfaceC4351m iconContent, Composer composer, int i13) {
        AbstractC22676k.m65750j(iconContent, "iconContent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-112451576);
        int i14 = 2;
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(iconContent) ? 4 : 2) | i13 : i13;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C11373l0 c11373l0M30571s = AbstractC11348f.m30571s("pulse", c28655q, 0);
            C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
            int i16 = ((Context) c28655q.m87161k(c28674u2)).getResources().getDisplayMetrics().widthPixels;
            int i17 = ((Context) c28655q.m87161k(c28674u2)).getResources().getDisplayMetrics().heightPixels;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            float fMo743q0 = interfaceC39171c.mo743q0(interfaceC39171c.mo733e0(Math.max(i16, i17) / 3));
            c28655q.m87150e0(-691765041);
            ArrayList arrayList = new ArrayList(3);
            int i18 = 0;
            while (i18 < 3) {
                arrayList.add(AbstractC11348f.m30559g(c11373l0M30571s, 0.1f * fMo743q0, fMo743q0, new C11361i0(AbstractC11348f.m30574v(4000, 0, AbstractC11333b0.f36312c, i14), EnumC11408v0.f36577w, ((i18 * 4000) / 3) * (-1)), AbstractC2875y.m8295h(i18, "radius"), c28655q, DfuBaseService.ERROR_INVALID_RESPONSE, 0));
                i18++;
                i14 = 2;
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(-691746940);
            ArrayList arrayList2 = new ArrayList(3);
            for (int i19 = 0; i19 < 3; i19++) {
                arrayList2.add(m77805j(c11373l0M30571s, i19, AbstractC2875y.m8295h(i19, "fill"), c28655q, 8));
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(-691740314);
            ArrayList arrayList3 = new ArrayList(3);
            for (int i24 = 0; i24 < 3; i24++) {
                arrayList3.add(m77805j(c11373l0M30571s, i24, AbstractC2875y.m8295h(i24, "border"), c28655q, 8));
            }
            c28655q.m87173q(false);
            C2314t c2314t = C2314t.f9131w;
            float f13 = 445;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            boolean zM87157i = c28655q.m87157i(arrayList) | c28655q.m87157i(arrayList2) | c28655q.m87157i(arrayList3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21930h(arrayList, arrayList2, arrayList3, 26);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3411h2, (Function1) objM87133R, c28655q, 6);
            AbstractC11895b.m32007z(i15 & 14, iconContent, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26196a(iconContent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m77801f(List list, List list2, List list3, InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            float fFloatValue = ((Number) ((InterfaceC28670t2) obj).getValue()).floatValue();
            float f13 = 0.1f;
            if (fFloatValue >= 0.1f) {
                f13 = fFloatValue;
            }
            C17909s c17909s = AbstractC17911t.f69612b;
            InterfaceC22131e.m63375G(Canvas, C17909s.m51489g(c17909s, f103909b, Canvas.mo721B0(), f13, 8), f13, Canvas.mo721B0(), ((Number) ((InterfaceC28670t2) list2.get(i13)).getValue()).floatValue(), C22134h.f85857a, 96);
            InterfaceC22131e.m63375G(Canvas, C17909s.m51486d(c17909s, f103908a, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() >> 32)) - f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() & 4294967295L)) - f13)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() >> 32)) + f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo721B0() & 4294967295L)) + f13)) & 4294967295L), 8), f13, Canvas.mo721B0(), ((Number) ((InterfaceC28670t2) list3.get(i13)).getValue()).floatValue(), new C22135i(Canvas.mo743q0(2), 0.0f, 0, 0, null, 30), 96);
            Canvas = interfaceC22131e;
            i13 = i14;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m77802g(InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m77800e(interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m77803h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-564424364);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), c28655q, 6), null, AbstractC1102d.m3419p(10 * 4, C2314t.f9131w), c38072d.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m77804i(int i13, Composer composer, int i14) {
        m77803h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final InterfaceC28670t2 m77805j(C11373l0 c11373l0, int i13, String str, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C26009o(14);
            c28655q.m87172p0(objM87133R);
        }
        return AbstractC11348f.m30559g(c11373l0, 0.0f, 1.0f, new C11361i0(AbstractC11348f.m30570r((Function1) objM87133R), EnumC11408v0.f36577w, ((i13 * 4000) / 3) * (-1)), str, c28655q, (i14 & 14) | 4536 | ((i14 << 6) & 57344), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m77806k(C11385o0 keyframes) {
        AbstractC22676k.m65750j(keyframes, "$this$keyframes");
        keyframes.f36506a = 4000;
        Float fValueOf = Float.valueOf(0.0f);
        C11381n0 c11381n0M30615a = keyframes.m30615a(0, fValueOf);
        C2342h c2342h = AbstractC11333b0.f36312c;
        c11381n0M30615a.f36485b = c2342h;
        keyframes.m30615a(1333, Float.valueOf(1.0f)).f36485b = c2342h;
        keyframes.m30615a(4000, fValueOf).f36485b = c2342h;
        return C23454a0.f92919a;
    }
}
