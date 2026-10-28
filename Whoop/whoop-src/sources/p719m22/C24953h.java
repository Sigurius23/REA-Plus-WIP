package p719m22;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p723o22.AbstractC27467a;
import qt0.C30586b;

/* JADX INFO: renamed from: m22.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24953h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97670w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30586b f97671x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f97672y;

    public /* synthetic */ C24953h(C30586b c30586b, int i13, int i14) {
        this.f97670w = i14;
        this.f97671x = c30586b;
        this.f97672y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f97670w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC42785i.m73178k(this.f97671x, this.f97672y, composer, iIntValue);
            default:
                return AbstractC27467a.m82888c(this.f97671x, this.f97672y, composer, iIntValue);
        }
    }
}
