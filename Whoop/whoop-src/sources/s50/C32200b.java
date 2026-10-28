package s50;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: s50.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C32200b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133339w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32202d f133340x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f133341y;

    public /* synthetic */ C32200b(C32202d c32202d, int i13, int i14) {
        this.f133339w = i14;
        this.f133340x = c32202d;
        this.f133341y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f133339w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC32201c.m100162q(this.f133340x, this.f133341y, composer, iIntValue);
            default:
                return AbstractC32201c.m100160o(this.f133340x, this.f133341y, composer, iIntValue);
        }
    }
}
