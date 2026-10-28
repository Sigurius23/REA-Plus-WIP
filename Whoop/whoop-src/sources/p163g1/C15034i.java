package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p292l1.AbstractC23060a;
import p292l1.AbstractC23079d0;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C15034i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56287w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f56288x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37816b f56289y;

    public /* synthetic */ C15034i(InterfaceC4351m interfaceC4351m, C37816b c37816b, int i13) {
        this.f56287w = i13;
        this.f56288x = interfaceC4351m;
        this.f56289y = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56287w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC4351m interfaceC4351m = this.f56288x;
                    if (interfaceC4351m == null) {
                        c28655q.m87150e0(690531395);
                    } else {
                        c28655q.m87150e0(-254819458);
                        interfaceC4351m.invoke(c28655q, 0);
                    }
                    c28655q.m87173q(false);
                    this.f56289y.invoke(c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f13 = 8;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
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
                    AbstractC15055k.m43142c(f13, 12, AbstractC37817c.m121344e(-1975681962, c28655q2, new C15034i(this.f56288x, this.f56289y, 0)), c28655q2, 438);
                    c28655q2.m87173q(true);
                } else {
                    c28655q2.m87138X();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer3;
                if (c28655q3.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C37816b c37816b = this.f56289y;
                    InterfaceC4351m interfaceC4351m2 = this.f56288x;
                    if (interfaceC4351m2 == null) {
                        c28655q3.m87150e0(1845819398);
                        AbstractC15142s6.m43190d(c37816b, c28655q3, 0);
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(1845823628);
                        AbstractC15142s6.m43187a(c37816b, interfaceC4351m2, c28655q3, 0);
                        c28655q3.m87173q(false);
                    }
                } else {
                    c28655q3.m87138X();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C28655q c28655q4 = (C28655q) composer4;
                if (c28655q4.m87135U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC15011f9.m43113a(((C15033h9) c28655q4.m87161k(AbstractC15044i9.f56319b)).f56283j, AbstractC37817c.m121344e(1789628237, c28655q4, new C15034i(this.f56288x, this.f56289y, 2)), c28655q4, 48);
                } else {
                    c28655q4.m87138X();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C28655q c28655q5 = (C28655q) composer5;
                if (c28655q5.m87135U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C28596b0 c28596b0 = AbstractC15047j1.f56336a;
                    long j7 = ((C17919x) c28655q5.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    AbstractC28683x.m87247a(c28596b0.mo86977a(Float.valueOf((!((C14970c1) c28655q5.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j7)) < 0.5d : ((double) AbstractC17918w0.m51536x(j7)) > 0.5d) ? 0.87f : 1.0f)), AbstractC37817c.m121344e(1236486620, c28655q5, new C15034i(this.f56288x, this.f56289y, 3)), c28655q5, 56);
                } else {
                    c28655q5.m87138X();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                C28655q c28655q6 = (C28655q) composer6;
                if (c28655q6.m87135U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    InterfaceC4351m interfaceC4351m3 = this.f56288x;
                    if (interfaceC4351m3 == null) {
                        c28655q6.m87150e0(322524505);
                    } else {
                        c28655q6.m87150e0(-266690648);
                        interfaceC4351m3.invoke(c28655q6, 0);
                    }
                    c28655q6.m87173q(false);
                    this.f56289y.invoke(c28655q6, 0);
                } else {
                    c28655q6.m87138X();
                }
                break;
            default:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C28655q c28655q7 = (C28655q) composer7;
                if (c28655q7.m87135U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC23060a.m67040a(AbstractC23079d0.f91056b, AbstractC23079d0.f91057c, AbstractC37817c.m121344e(-1980163584, c28655q7, new C15034i(this.f56288x, this.f56289y, 5)), c28655q7, 438);
                } else {
                    c28655q7.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
