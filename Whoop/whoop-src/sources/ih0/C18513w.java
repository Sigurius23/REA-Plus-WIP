package ih0;

import ah0.C0885f;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: ih0.w */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18513w implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f72135E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f72136F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f72137G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f72138H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72139w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0885f f72140x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f72141y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f72142z;

    public /* synthetic */ C18513w(C0885f c0885f, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f72139w = i15;
        this.f72140x = c0885f;
        this.f72141y = z4;
        this.f72142z = z13;
        this.f72135E = z14;
        this.f72136F = interfaceC4339a;
        this.f72137G = i13;
        this.f72138H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f72139w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18491e0.m53414J0(this.f72140x, this.f72141y, this.f72142z, this.f72135E, this.f72136F, this.f72137G, this.f72138H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18491e0.m53423M0(this.f72140x, this.f72141y, this.f72142z, this.f72135E, this.f72136F, this.f72137G, this.f72138H, (Composer) obj, iIntValue2);
        }
    }
}
