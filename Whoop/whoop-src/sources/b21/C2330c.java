package b21;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import xy0.AbstractC38699b;

/* JADX INFO: renamed from: b21.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2330c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f9247E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9248w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f9249x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f9250y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f9251z;

    public /* synthetic */ C2330c(float f13, float f14, float f15, int i13, int i14) {
        this.f9248w = i14;
        this.f9249x = f13;
        this.f9250y = f14;
        this.f9251z = f15;
        this.f9247E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9248w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2331d.m7184i(this.f9249x, this.f9250y, this.f9251z, this.f9247E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC38699b.m124111e(this.f9249x, this.f9250y, this.f9251z, this.f9247E, (Composer) obj, iIntValue2);
        }
    }
}
