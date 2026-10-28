package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p602x1.AbstractC37817c;

/* JADX INFO: renamed from: g1.o8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15104o8 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56583w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f56584x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Float f56585y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f56586z;

    public /* synthetic */ C15104o8(long j7, Float f13, InterfaceC4351m interfaceC4351m, int i13) {
        this.f56583w = i13;
        this.f56584x = j7;
        this.f56585y = f13;
        this.f56586z = interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC4351m interfaceC4351m;
        Float f13;
        switch (this.f56583w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC4351m interfaceC4351m2 = this.f56586z;
                    Float f14 = this.f56585y;
                    if (f14 != null) {
                        c28655q.m87150e0(1484860324);
                        AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(f14), interfaceC4351m2, c28655q, 8);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1485059902);
                        AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(C17919x.m51543e(this.f56584x))), interfaceC4351m2, c28655q, 8);
                        c28655q.m87173q(false);
                    }
                } else {
                    c28655q.m87138X();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C28596b0 c28596b0 = AbstractC15067l1.f56420a;
                    long j7 = this.f56584x;
                    AbstractC28683x.m87247a(c28596b0.mo86977a(new C17919x(j7)), AbstractC37817c.m121344e(-1624601445, c28655q2, new C15104o8(this.f56585y, this.f56586z, j7, 0)), c28655q2, 56);
                } else {
                    c28655q2.m87138X();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer3;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        interfaceC4351m = this.f56586z;
                        f13 = this.f56585y;
                        if (f13 != null) {
                            C28655q c28655q4 = (C28655q) composer3;
                            c28655q4.m87150e0(-970238231);
                            AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(f13), interfaceC4351m, c28655q4, 8);
                            c28655q4.m87173q(false);
                        } else {
                            C28655q c28655q5 = (C28655q) composer3;
                            c28655q5.m87150e0(-970059485);
                            AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(C17919x.m51543e(this.f56584x))), interfaceC4351m, c28655q5, 8);
                            c28655q5.m87173q(false);
                        }
                    }
                } else {
                    interfaceC4351m = this.f56586z;
                    f13 = this.f56585y;
                    if (f13 != null) {
                        C28655q c28655q6 = (C28655q) composer3;
                        c28655q6.m87150e0(-970238231);
                        AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(f13), interfaceC4351m, c28655q6, 8);
                        c28655q6.m87173q(false);
                    } else {
                        C28655q c28655q7 = (C28655q) composer3;
                        c28655q7.m87150e0(-970059485);
                        AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(C17919x.m51543e(this.f56584x))), interfaceC4351m, c28655q7, 8);
                        c28655q7.m87173q(false);
                    }
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q8 = (C28655q) composer4;
                    if (c28655q8.m87121F()) {
                        c28655q8.m87138X();
                    } else {
                        C28596b0 c28596b1 = AbstractC15067l1.f56420a;
                        long j13 = this.f56584x;
                        AbstractC28683x.m87247a(c28596b1.mo86977a(new C17919x(j13)), AbstractC37817c.m121344e(-1145200538, composer4, new C15104o8(this.f56585y, this.f56586z, j13, 2)), composer4, 56);
                    }
                } else {
                    C28596b0 c28596b2 = AbstractC15067l1.f56420a;
                    long j14 = this.f56584x;
                    AbstractC28683x.m87247a(c28596b2.mo86977a(new C17919x(j14)), AbstractC37817c.m121344e(-1145200538, composer4, new C15104o8(this.f56585y, this.f56586z, j14, 2)), composer4, 56);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C15104o8(Float f13, InterfaceC4351m interfaceC4351m, long j7, int i13) {
        this.f56583w = i13;
        this.f56585y = f13;
        this.f56586z = interfaceC4351m;
        this.f56584x = j7;
    }
}
