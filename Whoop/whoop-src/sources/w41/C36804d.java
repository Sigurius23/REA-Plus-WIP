package w41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: w41.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36804d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157438w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36815o f157439x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f157440y;

    public /* synthetic */ C36804d(C36815o c36815o, int i13, int i14) {
        this.f157438w = i14;
        this.f157439x = c36815o;
        this.f157440y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f157438w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC36805e.m117953g(this.f157439x, this.f157440y, composer, iIntValue);
            case 1:
                return AbstractC36805e.m117955i(this.f157439x, this.f157440y, composer, iIntValue);
            default:
                return AbstractC36805e.m117957k(this.f157439x, this.f157440y, composer, iIntValue);
        }
    }
}
