package p704dk2;

import a71.C0520a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: dk2.m */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12126m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40349w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0520a f40350x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f40351y;

    public /* synthetic */ C12126m(C0520a c0520a, int i13, int i14) {
        this.f40349w = i14;
        this.f40350x = c0520a;
        this.f40351y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f40349w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC12127n.m33587i(this.f40350x, this.f40351y, composer, iIntValue);
            default:
                return AbstractC12127n.m33583e(this.f40350x, this.f40351y, composer, iIntValue);
        }
    }
}
