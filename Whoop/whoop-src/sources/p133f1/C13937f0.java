package p133f1;

import androidx.compose.runtime.Composer;
import b30.C2647w2;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p510u0.AbstractC34339n0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;

/* JADX INFO: renamed from: f1.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13937f0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49683w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13988w0 f49684x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13926b1 f49685y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37816b f49686z;

    public C13937f0(C13988w0 c13988w0, C13926b1 c13926b1, C37816b c37816b) {
        this.f49684x = c13988w0;
        this.f49685y = c13926b1;
        this.f49686z = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49683w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC28683x.m87247a(AbstractC13929c1.f49663a.mo86977a(this.f49685y), AbstractC37817c.m121344e(610483127, c28655q, new C2647w2(6, this.f49686z, this.f49684x)), c28655q, 56);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C13926b1 c13926b1 = this.f49685y;
                    C37816b c37816b = this.f49686z;
                    C13988w0 c13988w0 = this.f49684x;
                    AbstractC34339n0.m108624b(c13988w0, AbstractC37817c.m121344e(-284825865, c28655q2, new C13937f0(c13926b1, c37816b, c13988w0)), c28655q2, 48);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C13937f0(C13926b1 c13926b1, C37816b c37816b, C13988w0 c13988w0) {
        this.f49685y = c13926b1;
        this.f49686z = c37816b;
        this.f49684x = c13988w0;
    }
}
