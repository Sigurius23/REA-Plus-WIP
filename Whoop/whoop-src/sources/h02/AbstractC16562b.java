package h02;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f02.C13917c;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p133f1.C13989w1;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h02.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh02/c;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lh02/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16562b {
    /* JADX WARN: Code duplicated, block: B:82:0x02a0  */
    /* JADX INFO: renamed from: c */
    public static final void m46890c(Modifier modifier, C16564c c16564c, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z4;
        Object objM87133R;
        C16564c state = c16564c;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1152425143);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        boolean z13 = false;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            float f13 = 2;
            float f14 = 8;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(AbstractC22404p.m64503l(state.getImageUrl()), null, null, c28655q, AbstractC22403o.f87638a, 3);
            float f15 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(((float) 23.5d) * f15, c2314t), f13, f15);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            Modifier modifier3 = modifier2;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i18).getGreyL6(), AbstractC17918w0.f69621a), null, C39102j.f168200b, 0.0f, null, c28655q, 24624, 104);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f14), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c16564c.getTitle());
            int i19 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM21278l, c28655q, i19);
            C2886a t14 = c38072d.m121952e(c28655q, i18).getT4();
            long brandBlack = c38072d.m121949b(c28655q, i18).getBrandBlack();
            int i24 = C2886a.f11498d;
            int i25 = i24 << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandBlack, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 0, i25, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(c16564c.getSubtitle()), c28655q, i19), null, c38072d.m121949b(c28655q, i18).getBlack50(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 0, i25 | 3120, 186362);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c16564c.getCtaText());
            C2886a btS = c38072d.m121952e(c28655q, i18).getBtS();
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(C17919x.f69636m, c38072d.m121949b(c28655q, i18).getBrandBlack(), 0L, 0L, c28655q, 6, 12);
            Integer numValueOf = Integer.valueOf(AbstractC16315n0.m46378c(c16564c.getTrailingIcon(), EnumC16313m0.ARROW_FORWARD).toWhoopIcon());
            C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, 1 * f14, 1);
            boolean z14 = (i17 & 896) == 256;
            if ((i17 & 112) != 32) {
                state = c16564c;
                if ((i17 & 64) != 0 && c28655q.m87157i(state)) {
                }
                z4 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C13989w1(17, onViewEvent, state);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27271o0.m82253b(null, false, textResourceM21278l2, btS, c15077m1M43196a, null, numValueOf, null, false, c22976l1M3379a, (InterfaceC4339a) objM87133R, c28655q, (i19 << 6) | 906166272 | (i24 << 9), 0, 131);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier3;
            } else {
                state = c16564c;
            }
            z13 = true;
            z4 = z14 | z13;
            objM87133R = c28655q.m87133R();
            if (z4) {
                objM87133R = new C13989w1(17, onViewEvent, state);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C13989w1(17, onViewEvent, state);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27271o0.m82253b(null, false, textResourceM21278l2, btS, c15077m1M43196a, null, numValueOf, null, false, c22976l1M3379a, (InterfaceC4339a) objM87133R, c28655q, (i19 << 6) | 906166272 | (i24 << 9), 0, 131);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 18, modifier2, onViewEvent, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m46891d(Function1 function1, C16564c c16564c) {
        function1.invoke(new C16566d(c16564c.getDestination(), c16564c.getPackItemId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m46892e(Modifier modifier, C16564c c16564c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m46890c(modifier, c16564c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
