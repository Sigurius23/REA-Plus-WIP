package p706eo0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import hy0.AbstractC17799w1;

/* JADX INFO: renamed from: eo0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C13371b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f46781E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46782w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f46783x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f46784y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f46785z;

    public /* synthetic */ C13371b(long j7, int i13, int i14, int i15, long j13) {
        this.f46782w = i15;
        this.f46783x = i13;
        this.f46784y = j7;
        this.f46785z = j13;
        this.f46781E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46782w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13372c.m37674e(this.f46783x, this.f46784y, this.f46785z, this.f46781E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17799w1.m51150f(this.f46783x, this.f46784y, this.f46785z, this.f46781E, (Composer) obj, iIntValue2);
        }
    }
}
