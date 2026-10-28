package p736sz0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import uz1.AbstractC35432j;

/* JADX INFO: renamed from: sz0.z0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33235z0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f138575E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138576w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33167b1 f138577x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f138578y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f138579z;

    public /* synthetic */ C33235z0(C33167b1 c33167b1, Modifier modifier, int i13, int i14, int i15) {
        this.f138576w = i15;
        this.f138577x = c33167b1;
        this.f138578y = modifier;
        this.f138579z = i13;
        this.f138575E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f138576w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33164a1.m105042p(this.f138577x, this.f138578y, this.f138579z, this.f138575E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35432j.m112468c(this.f138577x, this.f138578y, this.f138579z, this.f138575E, (Composer) obj, iIntValue2);
        }
    }
}
