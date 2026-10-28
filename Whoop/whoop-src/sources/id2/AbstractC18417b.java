package id2;

import ad2.AbstractC0752a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15133r7;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: id2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "enabled", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18417b {
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x01af  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m53001b(boolean z4, Function1 onToggle, Modifier modifier, Composer composer, int i13, int i14) {
        boolean z13;
        int i15;
        Modifier modifier2;
        boolean z14;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1207794592);
        if ((i13 & 6) == 0) {
            z13 = z4;
            i15 = (c28655q.m87155h(z13) ? 4 : 2) | i13;
        } else {
            z13 = z4;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onToggle) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 1 * 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier4), f13, f13);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                Modifier modifierM34565N = AbstractC12350b.m34565N(1.2f, c2314t);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                c28655q = c28655q;
                AbstractC15133r7.m43183a(z13, onToggle, modifierM34565N, false, AbstractC34235f.m108196A(c38072d.m121949b(c28655q, i17).getBrandWhite(), c38072d.m121949b(c28655q, i17).getRecovery(), 0.0f, c38072d.m121949b(c28655q, i17).getBrandWhite(), c38072d.m121949b(c28655q, i17).getWhite10(), 0.0f, 0L, 0L, 0L, 0L, c28655q, 996), c28655q, (i15 & 112) | (i15 & 14) | 384, 24);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC0752a.f2745h, c28655q, 0), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), Float.valueOf(1.0f), c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65530);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18416a(z4, onToggle, modifier3, i13, i14, 0);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 1 * 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, modifier4), f14, f14);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            Modifier modifierM34565N2 = AbstractC12350b.m34565N(1.2f, c2314t);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            c28655q = c28655q;
            AbstractC15133r7.m43183a(z13, onToggle, modifierM34565N2, false, AbstractC34235f.m108196A(c38072d2.m121949b(c28655q, i18).getBrandWhite(), c38072d2.m121949b(c28655q, i18).getRecovery(), 0.0f, c38072d2.m121949b(c28655q, i18).getBrandWhite(), c38072d2.m121949b(c28655q, i18).getWhite10(), 0.0f, 0L, 0L, 0L, 0L, c28655q, 996), c28655q, (i15 & 112) | (i15 & 14) | 384, 24);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC0752a.f2745h, c28655q, 0), null, c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getB1(), Float.valueOf(1.0f), c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65530);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18416a(z4, onToggle, modifier3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m53002c(boolean z4, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m53001b(z4, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
