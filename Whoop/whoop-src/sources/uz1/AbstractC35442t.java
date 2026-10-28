package uz1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import mh.C25540h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35015q;
import pf.AbstractC29125c;
import ph.C29227a;
import qz0.AbstractC30795n;
import t01.C33259e;
import tz1.C34288j;
import uk2.C35051a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uz1.t */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Luz1/u;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Luz1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35442t {
    /* JADX INFO: renamed from: d */
    public static final void m112516d(Modifier modifier, C35443u state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Float fValueOf = Float.valueOf(0.0f);
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1752333454);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier;
            float f13 = 4;
            float f14 = 8;
            float f15 = 3 * f13;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC12889b.m36262a0(AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, modifier3), 30 * f13, 0.0f, 2), f14, AbstractC33253j.m105489e(f15), false, 0L, 0L, 28), AbstractC33253j.m105489e(f15));
            boolean z4 = ((i15 & 896) == 256) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && c28655q.m87157i(state)));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C35015q(5, onViewEvent, state);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM118994r, false, null, null, (InterfaceC4339a) objM87133R, 15);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierMo3401b = c1100b.mo3401b(c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifier4 = modifier3;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierMo3401b, c38072d.m121949b(c28655q, i17).getBrandBlack(), AbstractC17918w0.f69621a), c28655q, 0);
            AbstractC22403o abstractC22403oM112522c = state.getImage();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C35051a(23);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM112522c, null, (Function1) objM87133R2, c28655q, AbstractC22403o.f87638a | 384, 1), null, c1100b.mo3401b(c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            Modifier modifierMo3401b2 = c1100b.mo3401b(c2314t);
            C17909s c17909s = AbstractC17911t.f69612b;
            long j7 = C17919x.f69625b;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierMo3401b2, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.0f, j7))), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.2f, j7)))}, 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(c1100b.mo3401b(c2314t), C17909s.m51487e(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.8f, j7))), new C23465k(Float.valueOf(0.7842f), new C17919x(C17919x.m51541c(0.0f, j7)))}, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 8), null, 0.0f, 6), c28655q, 0);
            float f16 = 2 * f14;
            Modifier modifierM3397s = AbstractC1099a.m3397s(c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9104G), f16, f16, f16, 2.5f * f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
            String strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getTitle()), c28655q, TextResource.$stable);
            C2886a t14 = c38072d.m121952e(c28655q, i17).getT4();
            long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.CARET_FORWARD.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(f13 * 4.5f, c2314t), c38072d.m121949b(c28655q, i17).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier2, state, onViewEvent, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m112517e(Function1 function1, C35443u c35443u) {
        function1.invoke(new C34288j(c35443u.getDestination(), c35443u.getAnalyticsValue()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m112518f(C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.f100086j = new C29227a(0, 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m112519g(Modifier modifier, C35443u c35443u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112516d(modifier, c35443u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
