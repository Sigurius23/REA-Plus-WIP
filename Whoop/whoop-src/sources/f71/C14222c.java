package f71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import he1.AbstractC17212a;

/* JADX INFO: renamed from: f71.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14222c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f51952w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f51953x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f51954y;

    public /* synthetic */ C14222c(int i13, long j7, int i14) {
        this.f51952w = i14;
        this.f51953x = j7;
        this.f51954y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f51952w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC14223d.m40679i(this.f51953x, this.f51954y, composer, iIntValue);
            default:
                return AbstractC17212a.m48645t(this.f51953x, this.f51954y, composer, iIntValue);
        }
    }
}
