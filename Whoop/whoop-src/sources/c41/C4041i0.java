package c41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import he1.AbstractC17212a;
import hy0.AbstractC17799w1;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p667z0.AbstractC39927i;
import yd2.AbstractC39464f;

/* JADX INFO: renamed from: c41.i0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4041i0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16396w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f16397x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f16398y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16399z;

    public /* synthetic */ C4041i0(int i13, int i14, long j7, int i15) {
        this.f16396w = i15;
        this.f16397x = i13;
        this.f16398y = j7;
        this.f16399z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16396w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4062l0.m12430r(this.f16397x, this.f16398y, this.f16399z, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17212a.m48647v(this.f16397x, this.f16398y, this.f16399z, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC17799w1.m51148d(this.f16397x, this.f16398y, this.f16399z, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC39464f.m126056n(this.f16397x, this.f16398y, this.f16399z, (Composer) obj, iIntValue4);
            case 4:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f16399z | 1);
                AbstractC39927i.m128086b(this.f16397x, this.f16398y, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(this.f16399z | 1);
                AbstractC39927i.m128086b(this.f16397x, this.f16398y, (Composer) obj, iM87244L2);
                return C23454a0.f92919a;
        }
    }
}
