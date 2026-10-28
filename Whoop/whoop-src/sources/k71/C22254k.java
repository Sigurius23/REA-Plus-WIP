package k71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l31.AbstractC23307a;

/* JADX INFO: renamed from: k71.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22254k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86764w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f86765x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f86766y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f86767z;

    public /* synthetic */ C22254k(boolean z4, int i13, int i14, int i15) {
        this.f86764w = i15;
        this.f86765x = z4;
        this.f86766y = i13;
        this.f86767z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f86764w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC22255l.m63886t(this.f86765x, this.f86766y, this.f86767z, composer, iIntValue);
            default:
                return AbstractC23307a.m67393c(this.f86765x, this.f86766y, this.f86767z, composer, iIntValue);
        }
    }
}
