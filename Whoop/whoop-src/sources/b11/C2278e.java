package b11;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: b11.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2278e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9034w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2281h f9035x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f9036y;

    public /* synthetic */ C2278e(C2281h c2281h, int i13, int i14) {
        this.f9034w = i14;
        this.f9035x = c2281h;
        this.f9036y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f9034w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC2280g.m7120j(this.f9035x, this.f9036y, composer, iIntValue);
            default:
                return AbstractC2280g.m7122l(this.f9035x, this.f9036y, composer, iIntValue);
        }
    }
}
