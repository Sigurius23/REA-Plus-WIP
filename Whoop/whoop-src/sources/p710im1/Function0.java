package p710im1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import fl1.AbstractC14569b;
import hg3.AbstractC17269i;
import java.util.Locale;
import l83.C23454a0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p698au1.C2059d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: im1.c1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x0173  */
    /* JADX WARN: Code duplicated, block: B:44:0x017e  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m54147b(InterfaceC4339a onClick, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1586597793);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(onClick) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, modifier4));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                float f13 = 8;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 12 * f13, 7), "TiltGraphEntryButton");
                TextResource textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, AbstractC30060g.m92103Y(c28655q2, AbstractC14569b.f53564F), "toUpperCase(...)");
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C2886a c2886aM8429j = c38072d.m121952e(c28655q2, i17).getBtM();
                float f14 = 2;
                float f15 = f14 * f13;
                float f16 = ((float) 1.5d) * f13;
                C22976l1 c22976l1 = new C22976l1(f15, f16, f15, f16);
                C13825t c13825tM48880a = AbstractC17269i.m48880a(f14, c38072d.m121949b(c28655q2, i17).getBrandWhite());
                C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                AbstractC27292z.m82343j(modifierM3599a, false, false, null, null, null, textResourceM30853e, AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i17).getTransparent(), c38072d.m121949b(c28655q2, i17).getBrandWhite(), c38072d.m121949b(c28655q2, i17).getTransparent(), c38072d.m121949b(c28655q2, i17).getWhite20(), c28655q2, 0, 0), null, c13825tM48880a, 16 * 4, c22976l1, c2886aM8429j, onClick, c28655q2, (TextResource.$stable << 18) | 390, ((i15 << 9) & 7168) | (C2886a.f11498d << 6) | 54, 314);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2059d(onClick, modifier3, i13, i14, 7);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, modifier4));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9105H, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            float f17 = 8;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 12 * f17, 7), "TiltGraphEntryButton");
            TextResource textResourceM30853e2 = AbstractC11478a.m30853e(Locale.ROOT, AbstractC30060g.m92103Y(c28655q2, AbstractC14569b.f53564F), "toUpperCase(...)");
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            C2886a c2886aM8429j2 = c38072d2.m121952e(c28655q2, i18).getBtM();
            float f18 = 2;
            float f19 = f18 * f17;
            float f110 = ((float) 1.5d) * f17;
            C22976l1 c22976l3 = new C22976l1(f19, f110, f19, f110);
            C13825t c13825tM48880a2 = AbstractC17269i.m48880a(f18, c38072d2.m121949b(c28655q2, i18).getBrandWhite());
            C22976l1 c22976l4 = AbstractC15166v0.f56891a;
            AbstractC27292z.m82343j(modifierM3599a2, false, false, null, null, null, textResourceM30853e2, AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q2, i18).getTransparent(), c38072d2.m121949b(c28655q2, i18).getBrandWhite(), c38072d2.m121949b(c28655q2, i18).getTransparent(), c38072d2.m121949b(c28655q2, i18).getWhite20(), c28655q2, 0, 0), null, c13825tM48880a2, 16 * 4, c22976l3, c2886aM8429j2, onClick, c28655q2, (TextResource.$stable << 18) | 390, ((i15 << 9) & 7168) | (C2886a.f11498d << 6) | 54, 314);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2059d(onClick, modifier3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m54148c(InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m54147b(interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
