package s51;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: s51.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C32214k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f133398E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133399w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32212i f133400x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f133401y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f133402z;

    public /* synthetic */ C32214k(Modifier modifier, C32212i c32212i, int i13, int i14) {
        this.f133401y = modifier;
        this.f133400x = c32212i;
        this.f133402z = i13;
        this.f133398E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f133399w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC32215l.m100229i(this.f133401y, this.f133400x, this.f133402z, this.f133398E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f133401y;
                return AbstractC32215l.m100227g(this.f133400x, modifier, this.f133402z, this.f133398E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C32214k(C32212i c32212i, Modifier modifier, int i13, int i14) {
        this.f133400x = c32212i;
        this.f133401y = modifier;
        this.f133402z = i13;
        this.f133398E = i14;
    }
}
