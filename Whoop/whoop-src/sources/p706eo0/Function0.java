package p706eo0;

import am2.C1018g;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d42.C11699o;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import l83.C23454a0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15166v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import sn0.AbstractC32771a;
import sn0.AbstractC32772b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: eo0.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onSendResetLink", "onClose", "c", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "change-password_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m37667c(InterfaceC4339a onSendResetLink, InterfaceC4339a onClose, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a;
        C28655q c28655q;
        int i15;
        AbstractC22676k.m65750j(onSendResetLink, "onSendResetLink");
        AbstractC22676k.m65750j(onClose, "onClose");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1566600491);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(onSendResetLink) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onClose) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q2.m87135U(i16 & 1, (i16 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC15673b0.m44012U(), null, 0.0f, 6));
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66723l);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f14, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            float f15 = 4;
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC32771a.f136278a, c28655q2, 0), null, AbstractC1102d.m3419p(12 * f15, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q2, 25008, 104);
            float f16 = f15 * f13;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f16, c2314t));
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC32772b.f136293i);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8436q = c38072d.m121952e(c28655q2, i17).getH3();
            long jM125430y = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            C36775k c36775k = new C36775k(3);
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM92103Y, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q2, 0, i18, 196090);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC32772b.f136292h), AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, 48, i18, 196088);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f16, c2314t));
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC32772b.f136291g, null, 2, 0 == true ? 1 : 0);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, c8688b, AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i17).getBrandWhite(), c38072d.m121949b(c28655q2, i17).getBrandBlack(), 0L, 0L, c28655q2, 0, 12), null, null, 0.0f, null, null, onSendResetLink, c28655q2, (TextResource.C8688b.f25889c << 18) | 6, (i16 << 9) & 7168, 7998);
            c28655q = c28655q2;
            i15 = 1;
            c28655q.m87173q(true);
            Modifier modifierM3398t = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t, c2307m), 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21267a(), null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            Object[] objArr = (i16 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (objArr == true || objM87133R == C28635l.f115821a) {
                interfaceC4339a = onClose;
                objM87133R = new C11699o(interfaceC4339a, 16);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC4339a = onClose;
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            c28655q.m87173q(true);
        } else {
            interfaceC4339a = onClose;
            c28655q = c28655q2;
            i15 = 1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(onSendResetLink, interfaceC4339a, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m37668d(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m37669e(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m37667c(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
