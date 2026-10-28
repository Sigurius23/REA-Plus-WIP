package p730qt2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: qt2.a0 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C30592a0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125850w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30619y f125851x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f125852y;

    public /* synthetic */ C30592a0(C30619y c30619y, int i13, int i14) {
        this.f125850w = i14;
        this.f125851x = c30619y;
        this.f125852y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f125850w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC30594b0.m93851f(this.f125851x, this.f125852y, composer, iIntValue);
            default:
                return AbstractC30594b0.m93853h(this.f125851x, this.f125852y, composer, iIntValue);
        }
    }
}
