package p700bd1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kd1.C22396h;

/* JADX INFO: renamed from: bd1.r */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3100r implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12140w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22396h f12141x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f12142y;

    public /* synthetic */ C3100r(C22396h c22396h, int i13, int i14) {
        this.f12140w = i14;
        this.f12141x = c22396h;
        this.f12142y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f12140w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3102t.m8903k(this.f12141x, this.f12142y, composer, iIntValue);
            default:
                return AbstractC3102t.m8898f(this.f12141x, this.f12142y, composer, iIntValue);
        }
    }
}
