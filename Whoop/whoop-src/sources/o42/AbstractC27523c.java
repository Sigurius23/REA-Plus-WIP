package o42;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import j42.AbstractC21316a;
import l83.C23454a0;
import mi2.C25592o;
import n42.C26278b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p238j0.C21084j;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: o42.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ln42/b;", "account", "Lkotlin/Function1;", "Lj42/a;", "Ll83/a0;", "onViewEvent", "c", "(Ln42/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "privacy-consent_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27523c {
    /* JADX INFO: renamed from: c */
    public static final void m82961c(C26278b account, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C26278b c26278b;
        Function1 function1;
        AbstractC22676k.m65750j(account, "account");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2013426967);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(account) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            TextResource accountName = account.getAccountName();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(accountName, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i16).getH4();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i17, 196602);
            float f14 = 2;
            float f15 = 4;
            AbstractC11266d.m30469w(f14, f15, c2314t, c28655q);
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14 * f13, AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t), 1, f15), c38072d.m121949b(c28655q, i16).getWhite10(), AbstractC17918w0.f69621a));
            C21084j c21084j = new C21084j();
            c26278b = account;
            boolean zM87157i = c28655q.m87157i(c26278b) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C25592o(22, onViewEvent, c26278b);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3394p, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3360e);
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
            c28655q.m87150e0(199230476);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c26278b.getIcon(), c28655q, 6), "", AbstractC1102d.m3419p(6 * f15, c2314t), c38072d.m121949b(c28655q, i16).getWhite10(), c28655q, 432, 0);
            AbstractC31061c.m95650z(f15, f15, c2314t, c28655q, false);
            function1 = onViewEvent;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c26278b.getButtonText(), c28655q, i15), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH4(), null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c26278b = account;
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27522b(c26278b, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m82962d(Function1 function1, C26278b c26278b) {
        function1.invoke(new AbstractC21316a.e(AbstractC8693b.m21268b(c26278b.getAccountName())));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m82963e(C26278b c26278b, Function1 function1, int i13, Composer composer, int i14) {
        m82961c(c26278b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
