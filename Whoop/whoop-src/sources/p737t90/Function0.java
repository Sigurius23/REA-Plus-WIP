package p737t90;

import a11.C0132j;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15166v0;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
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
import p635y2.InterfaceC39127r0;
import p714k80.AbstractC22280i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qc1.C30217a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;
import x81.C38072d;

/* JADX INFO: renamed from: t90.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "primaryCtaClick", "secondaryCtaClick", "c", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: c */
    public static final void m106305c(InterfaceC4339a primaryCtaClick, InterfaceC4339a secondaryCtaClick, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a;
        int i15;
        AbstractC22676k.m65750j(primaryCtaClick, "primaryCtaClick");
        AbstractC22676k.m65750j(secondaryCtaClick, "secondaryCtaClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(240482388);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(primaryCtaClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(secondaryCtaClick) ? 32 : 16;
        }
        int i16 = i14;
        int i17 = 18;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C30217a(i17);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3480c = AbstractC1125a.m3480c(c2314t, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            float f13 = 4;
            float f14 = 8;
            float f15 = ((float) 2.5d) * f14;
            Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f15, f13 * f14, f15, 5 * f14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38022b.f162891c0));
            int i18 = TextResource.$stable << 3;
            AbstractC22280i.m64006d(false, textResourceM21278l, null, null, null, primaryCtaClick, c28655q, i18 | ((i16 << 15) & 458752), 29);
            AbstractC11266d.m30469w((float) 1.5d, f14, c2314t, c28655q);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38022b.f162889b0));
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            long j7 = C17919x.f69636m;
            C38072d c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            long brandWhite = c38072d.m121949b(c28655q, i19).getBrandWhite();
            long white20 = c38072d.m121949b(c28655q, i19).getWhite20();
            interfaceC4339a = secondaryCtaClick;
            c28655q = c28655q;
            AbstractC22280i.m64006d(false, textResourceM21278l2, AbstractC15166v0.m43196a(j7, brandWhite, c38072d.m121949b(c28655q, i19).getWhite10(), white20, c28655q, 6, 0), null, AbstractC17269i.m48880a(((float) 0.5d) * f13, c38072d.m121949b(c28655q, i19).getWhite20()), interfaceC4339a, c28655q, i18 | ((i16 << 12) & 458752), 9);
            AbstractC11266d.m30469w(3, f14, c2314t, c28655q);
            i15 = 16;
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC38022b.f162887a0), null, c38072d.m121949b(c28655q, i19).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            interfaceC4339a = secondaryCtaClick;
            i15 = 16;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(primaryCtaClick, interfaceC4339a, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m106306d(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1185562)), new C17919x(AbstractC17918w0.m51517e(4279244056L)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), 0L, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), 10), 0L, 0L, 0.0f, null, 0, 126);
        ((C0238p0) drawWithContent).m728a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m106307e(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m106305c(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
