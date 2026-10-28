package c41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p291l0.InterfaceC23001u;
import qe0.AbstractC30302c;

/* JADX INFO: renamed from: c41.u1 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4126u1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16773w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23001u f16774x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f16775y;

    public /* synthetic */ C4126u1(InterfaceC23001u interfaceC23001u, int i13, int i14) {
        this.f16773w = i14;
        this.f16774x = interfaceC23001u;
        this.f16775y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f16773w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC4133v1.m12789q(this.f16774x, this.f16775y, composer, iIntValue);
            default:
                return AbstractC30302c.m92638s(this.f16774x, this.f16775y, composer, iIntValue);
        }
    }
}
