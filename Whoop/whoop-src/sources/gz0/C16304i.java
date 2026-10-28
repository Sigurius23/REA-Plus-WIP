package gz0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p355o2.C27430e;

/* JADX INFO: renamed from: gz0.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C16304i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f62566E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f62567F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f62568G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f62569H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62570w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27430e f62571x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f62572y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f62573z;

    public /* synthetic */ C16304i(C27430e c27430e, float f13, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f62570w = i15;
        this.f62571x = c27430e;
        this.f62572y = f13;
        this.f62573z = z4;
        this.f62566E = str;
        this.f62567F = interfaceC4339a;
        this.f62568G = i13;
        this.f62569H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f62570w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC16306j.m46252D(this.f62571x, this.f62572y, this.f62573z, this.f62566E, this.f62567F, this.f62568G, this.f62569H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16306j.m46284z(this.f62571x, this.f62572y, this.f62573z, this.f62566E, this.f62567F, this.f62568G, this.f62569H, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC16306j.m46280v(this.f62571x, this.f62572y, this.f62573z, this.f62566E, this.f62567F, this.f62568G, this.f62569H, (Composer) obj, iIntValue3);
        }
    }
}
