package p163g1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2567l4;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p510u0.AbstractC34302b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39176h;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.a3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14950a3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55779w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f55780x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f55781y;

    public /* synthetic */ C14950a3(long j7, Object obj, int i13) {
        this.f55779w = i13;
        this.f55780x = j7;
        this.f55781y = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55779w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(C17919x.m51543e(this.f55780x))), AbstractC37817c.m121344e(-1072292694, c28655q, new C2567l4((C37816b) this.f55781y, 9)), c28655q, 56);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    long j7 = this.f55780x;
                    if (j7 != 9205357640488583168L) {
                        c28655q2.m87150e0(-1244013944);
                        Modifier modifierM3417n = AbstractC1102d.m3417n((Modifier) this.f55781y, C39176h.m124787c(j7), C39176h.m124786b(j7), 0.0f, 0.0f, 12);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9115x, false);
                        int iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3417n);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        C0209i c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        AbstractC34302b.m108611b(null, 0, c28655q2, 1);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1243644858);
                        AbstractC34302b.m108611b((Modifier) this.f55781y, 0, c28655q2, 0);
                        c28655q2.m87173q(false);
                    }
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
