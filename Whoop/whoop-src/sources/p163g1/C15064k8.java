package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p294l3.C23285v0;
import p390p1.C28655q;
import p390p1.C28674u2;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: g1.k8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15064k8 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f56406E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long f56407F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56408w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f56409x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f56410y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f56411z;

    public /* synthetic */ C15064k8(float f13, long j7, InterfaceC4351m interfaceC4351m, boolean z4, long j13, int i13) {
        this.f56408w = i13;
        this.f56409x = f13;
        this.f56410y = j7;
        this.f56411z = interfaceC4351m;
        this.f56406E = z4;
        this.f56407F = j13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C23285v0 c23285v0M60671a0;
        switch (this.f56408w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C28674u2 c28674u2 = AbstractC15044i9.f56319b;
                    C23285v0 c23285v0M60671a1 = AbstractC21598x.m60671a0(((C15033h9) c28655q.m87161k(c28674u2)).f56280g, ((C15033h9) c28655q.m87161k(c28674u2)).f56285l, this.f56409x);
                    if (this.f56406E) {
                        c23285v0M60671a1 = C23285v0.m67364b(c23285v0M60671a1, this.f56407F, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
                    }
                    AbstractC15114p8.m43175b(this.f56410y, c23285v0M60671a1, this.f56411z, c28655q, 384, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        C28674u2 c28674u3 = AbstractC15044i9.f56319b;
                        C28655q c28655q3 = (C28655q) composer2;
                        c23285v0M60671a0 = AbstractC21598x.m60671a0(((C15033h9) c28655q3.m87161k(c28674u3)).f56280g, ((C15033h9) c28655q3.m87161k(c28674u3)).f56285l, this.f56409x);
                        if (this.f56406E) {
                            c23285v0M60671a0 = C23285v0.m67364b(c23285v0M60671a0, this.f56407F, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
                        }
                        AbstractC36259c.m115696k(this.f56410y, c23285v0M60671a0, this.f56411z, composer2, 384, 0);
                    }
                } else {
                    C28674u2 c28674u4 = AbstractC15044i9.f56319b;
                    C28655q c28655q4 = (C28655q) composer2;
                    c23285v0M60671a0 = AbstractC21598x.m60671a0(((C15033h9) c28655q4.m87161k(c28674u4)).f56280g, ((C15033h9) c28655q4.m87161k(c28674u4)).f56285l, this.f56409x);
                    if (this.f56406E) {
                        c23285v0M60671a0 = C23285v0.m67364b(c23285v0M60671a0, this.f56407F, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
                    }
                    AbstractC36259c.m115696k(this.f56410y, c23285v0M60671a0, this.f56411z, composer2, 384, 0);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
