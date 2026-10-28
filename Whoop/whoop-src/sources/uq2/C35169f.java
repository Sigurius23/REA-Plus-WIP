package uq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: uq2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C35169f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149274w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35167d f149275x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f149276y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f149277z;

    public /* synthetic */ C35169f(C35167d c35167d, boolean z4, int i13, int i14) {
        this.f149274w = i14;
        this.f149275x = c35167d;
        this.f149276y = z4;
        this.f149277z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f149274w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC35170g.m111302m(this.f149275x, this.f149276y, this.f149277z, composer, iIntValue);
            default:
                return AbstractC35171h.m111309e(this.f149275x, this.f149276y, this.f149277z, composer, iIntValue);
        }
    }
}
