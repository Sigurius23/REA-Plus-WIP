package a01;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: a01.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0090j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f292w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0094n f293x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f294y;

    public /* synthetic */ C0090j(C0094n c0094n, int i13, int i14) {
        this.f292w = i14;
        this.f293x = c0094n;
        this.f294y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f292w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC0092l.m250h(this.f293x, this.f294y, composer, iIntValue);
            default:
                return AbstractC0092l.m252j(this.f293x, this.f294y, composer, iIntValue);
        }
    }
}
