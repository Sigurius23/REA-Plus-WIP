package k90;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import io2.C20769k0;
import jp2.C21875f;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: k90.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lk90/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Lk90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lk90/d;", "Lb91/a;", "f", "(Lk90/d;Landroidx/compose/runtime/Composer;I)Lb91/a;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22299b {

    /* JADX INFO: renamed from: k90.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87013a;

        static {
            int[] iArr = new int[EnumC22301d.values().length];
            try {
                iArr[EnumC22301d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22301d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87013a = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m64079c(C22300c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        float f13;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1435457841);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if ((i14 & 2) != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21875f(22);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            } else {
                function2 = function1;
            }
            C2314t c2314t = C2314t.f9131w;
            float f14 = 2;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f14, AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            AbstractC22403o abstractC22403oM64083a = viewState.getAvatarUrl();
            if (abstractC22403oM64083a == null) {
                c28655q.m87150e0(-1265855716);
                c28655q.m87173q(false);
                f13 = f14;
                i16 = 4;
            } else {
                c28655q.m87150e0(-1265855715);
                i16 = 4;
                float f15 = 4;
                f13 = f14;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM64083a, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(44 * f15, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q = c28655q;
                AbstractC25012a.m73388u(12, f15, c2314t, c28655q, false);
            }
            TextResource textResourceM64085c = viewState.getTitle();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM64085c, c28655q, i17);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            long white70 = c38072d.m121949b(c28655q, i18).getWhite70();
            int i19 = i16;
            C36775k c36775k = new C36775k(3);
            C2886a c2886aM64082f = m64082f(viewState.getTitleSize(), c28655q, 0);
            int i24 = C2886a.f11498d << 18;
            C28655q c28655q2 = c28655q;
            function1 = function2;
            AbstractC30795n.m94707h(strM21274h, null, white70, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM64082f, null, c28655q2, 0, i24, 196090);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13 * i19, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q2, i17), null, c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, m64082f(viewState.getSubtitleSize(), c28655q2, 0), null, c28655q2, 0, i24, 196090);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Function1 function3 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function3, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m64080d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64081e(C22300c c22300c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m64079c(c22300c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final C2886a m64082f(EnumC22301d enumC22301d, Composer composer, int i13) {
        int i14 = a.f87013a[enumC22301d.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1204312449);
            C2886a b6 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1();
            c28655q.m87173q(false);
            return b6;
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(-1204314437, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1204310657);
        C2886a t14 = C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getT2();
        c28655q2.m87173q(false);
        return t14;
    }
}
