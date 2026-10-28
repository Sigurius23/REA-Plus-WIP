package p163g1;

import androidx.compose.runtime.Composer;
import b30.C2647w2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p292l1.AbstractC23215z4;
import p292l1.C23209y4;
import p294l3.C23285v0;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24913l0;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p602x1.C37816b;

/* JADX INFO: renamed from: g1.r6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15132r6 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56707w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f56708x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56709y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56710z;

    public /* synthetic */ C15132r6(Object obj, long j7, Object obj2, int i13) {
        this.f56707w = i13;
        this.f56708x = j7;
        this.f56709y = obj;
        this.f56710z = obj2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f56707w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f56710z;
        Object obj4 = this.f56709y;
        boolean z4 = false;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C15072l6 c15072l6 = (C15072l6) obj4;
                C28655q c28655q = (C28655q) composer;
                if (!c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c28655q.m87138X();
                } else {
                    C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                    C15077m1 c15077m1M43199d = AbstractC15166v0.m43199d(this.f56708x, c28655q, 5);
                    boolean zM87157i = c28655q.m87157i(c15072l6);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C15041i6(c15072l6, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC12350b.m34583d((InterfaceC4339a) objM87133R, null, false, null, null, c15077m1M43199d, null, AbstractC37817c.m121344e(-929149933, c28655q, new C15122q6((String) obj3, z4 ? 1 : 0)), c28655q, 805306368, 382);
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (!c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c28655q2.m87138X();
                } else {
                    AbstractC24899e0.m72995b(this.f56708x, ((C23209y4) c28655q2.m87161k(AbstractC23215z4.f91921a)).f91882m, AbstractC37817c.m121344e(417635459, c28655q2, new C2647w2(17, (InterfaceC22973k1) obj4, (C37816b) obj3)), c28655q2, 384);
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer3;
                if (!c28655q3.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c28655q3.m87138X();
                } else {
                    AbstractC24913l0.m73014b(this.f56708x, (C23285v0) obj4, (InterfaceC4351m) obj3, c28655q3, 0);
                }
                break;
        }
        return c23454a0;
    }
}
