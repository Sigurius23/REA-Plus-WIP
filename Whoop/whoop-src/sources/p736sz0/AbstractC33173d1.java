package p736sz0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import hy0.AbstractC17755i2;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qk2.C30453i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sz0.d1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/e1;", "state", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lsz0/e1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33173d1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX INFO: renamed from: b */
    public static final void m105092b(Modifier modifier, C33176e1 state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        ?? r10;
        int i16;
        AbstractC22676k.m65750j(state, "state");
        ?? r14 = (C28655q) composer;
        r14.m87154g0(1460106706);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (r14.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= r14.m87157i(state) ? 32 : 16;
        }
        ?? r15 = 0;
        int i18 = 1;
        if (r14.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier4 = i17 != 0 ? C2314t.f9131w : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, r14, 54);
            int iHashCode = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = r14.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(r14, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            r14.m87158i0();
            if (r14.f115903S) {
                r14.m87163l(c0213j);
            } else {
                r14.m87178s0();
            }
            AbstractC28683x.m87239G(r14, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(r14, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, r14, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(r14, C0217k.f726d, modifierM118962N);
            r14.m87150e0(1041864007);
            int i19 = 0;
            for (Iterator it = state.m105116a().iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i24 = i19 + 1;
                if (i19 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C33230x c33230x = (C33230x) next;
                r14.m87144b0(-993983380, c33230x.getId());
                AbstractC33228w.m105407d(null, c33230x, r14, r15, i18);
                if (i19 != AbstractC37056f.m118951C(state.m105116a())) {
                    r14.m87150e0(-748605547);
                    i16 = i18;
                    r10 = r15 == true ? 1 : 0;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, r14, 0, 255);
                    r14.m87173q(r10);
                } else {
                    r10 = r15;
                    i16 = i18;
                    r14.m87150e0(-748553653);
                    r14.m87173q(r10);
                }
                r14.m87173q(r10);
                r15 = r10;
                i18 = i16;
                i19 = i24;
                modifier4 = modifier4;
            }
            r14.m87173q(r15);
            r14.m87173q(i18);
            modifier3 = modifier4;
        } else {
            r14.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(modifier3, state, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m105093c(Modifier modifier, C33176e1 c33176e1, int i13, int i14, Composer composer, int i15) {
        m105092b(modifier, c33176e1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
