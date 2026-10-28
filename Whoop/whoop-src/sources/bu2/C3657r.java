package bu2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c81.AbstractC4304d;
import c93.InterfaceC4351m;
import hy0.AbstractC17803y;

/* JADX INFO: renamed from: bu2.r */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3657r implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14879w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f14880x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f14881y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f14882z;

    public /* synthetic */ C3657r(int i13, int i14, long j7, Modifier modifier) {
        this.f14879w = i14;
        this.f14880x = modifier;
        this.f14881y = j7;
        this.f14882z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14879w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3663x.m11292C(this.f14881y, this.f14880x, this.f14882z, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                long j7 = this.f14881y;
                return AbstractC4304d.m13568l(this.f14880x, j7, this.f14882z, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                long j13 = this.f14881y;
                return AbstractC17803y.m51163h(this.f14880x, j13, this.f14882z, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C3657r(long j7, Modifier modifier, int i13) {
        this.f14879w = 0;
        this.f14881y = j7;
        this.f14880x = modifier;
        this.f14882z = i13;
    }
}
