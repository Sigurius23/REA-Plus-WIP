package c30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import hy0.AbstractC17790t1;
import l83.C23454a0;
import p097ds.AbstractC12313p;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: c30.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3910a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15991w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f15992x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f15993y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f15994z;

    public /* synthetic */ C3910a(float f13, int i13, int i14) {
        this.f15993y = f13;
        this.f15992x = i13;
        this.f15994z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f15991w) {
            case 0:
                num.getClass();
                AbstractC12313p.m34283e(this.f15993y, AbstractC28683x.m87244L(this.f15992x | 1), composer, this.f15994z);
                return C23454a0.f92919a;
            default:
                return AbstractC17790t1.m51111f(this.f15992x, this.f15993y, this.f15994z, composer, num.intValue());
        }
    }

    public /* synthetic */ C3910a(int i13, float f13, int i14) {
        this.f15992x = i13;
        this.f15993y = f13;
        this.f15994z = i14;
    }
}
