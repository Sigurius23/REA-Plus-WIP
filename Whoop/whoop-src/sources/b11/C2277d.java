package b11;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: b11.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2277d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9031w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2281h f9032x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f9033y;

    public /* synthetic */ C2277d(C2281h c2281h, int i13, int i14) {
        this.f9031w = i14;
        this.f9032x = c2281h;
        this.f9033y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f9031w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC2280g.m7131u(this.f9032x, this.f9033y, composer, iIntValue);
            case 1:
                return AbstractC2280g.m7129s(this.f9032x, this.f9033y, composer, iIntValue);
            default:
                return AbstractC2280g.m7124n(this.f9032x, this.f9033y, composer, iIntValue);
        }
    }
}
