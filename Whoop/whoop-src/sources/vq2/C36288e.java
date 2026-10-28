package vq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: vq2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C36288e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155526w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36286c f155527x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f155528y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f155529z;

    public /* synthetic */ C36288e(C36286c c36286c, boolean z4, int i13, int i14) {
        this.f155526w = i14;
        this.f155527x = c36286c;
        this.f155528y = z4;
        this.f155529z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f155526w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC36289f.m116012f(this.f155527x, this.f155528y, this.f155529z, composer, iIntValue);
            default:
                return AbstractC36290g.m116019e(this.f155527x, this.f155528y, this.f155529z, composer, iIntValue);
        }
    }
}
