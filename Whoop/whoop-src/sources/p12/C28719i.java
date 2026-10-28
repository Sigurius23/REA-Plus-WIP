package p12;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: p12.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28719i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116147w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f116148x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f116149y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f116150z;

    public /* synthetic */ C28719i(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f116147w = i14;
        this.f116148x = interfaceC4339a;
        this.f116149y = interfaceC4339a2;
        this.f116150z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f116147w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC28722l.m87378o(this.f116148x, this.f116149y, this.f116150z, composer, iIntValue);
            default:
                return AbstractC28722l.m87374k(this.f116148x, this.f116149y, this.f116150z, composer, iIntValue);
        }
    }
}
