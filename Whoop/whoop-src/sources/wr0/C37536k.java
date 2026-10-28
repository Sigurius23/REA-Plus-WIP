package wr0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: wr0.k */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37536k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160517w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37542n f160518x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f160519y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f160520z;

    public /* synthetic */ C37536k(C37542n c37542n, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f160517w = i14;
        this.f160518x = c37542n;
        this.f160519y = interfaceC4339a;
        this.f160520z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f160517w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC37540m.m120423o(this.f160518x, this.f160519y, this.f160520z, composer, iIntValue);
            default:
                return AbstractC37540m.m120408C(this.f160518x, this.f160519y, this.f160520z, composer, iIntValue);
        }
    }
}
