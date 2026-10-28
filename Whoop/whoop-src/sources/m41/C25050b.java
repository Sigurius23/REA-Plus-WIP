package m41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import z51.AbstractC40098i;

/* JADX INFO: renamed from: m41.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C25050b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f98139E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f98140F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98141w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f98142x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f98143y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f98144z;

    public /* synthetic */ C25050b(float f13, float f14, float f15, long j7, int i13) {
        this.f98141w = 2;
        this.f98143y = f13;
        this.f98144z = f14;
        this.f98139E = f15;
        this.f98142x = j7;
        this.f98140F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f98141w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                float f13 = this.f98143y;
                float f14 = this.f98144z;
                float f15 = this.f98139E;
                return AbstractC25053e.m73515q(this.f98142x, f13, f14, f15, this.f98140F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                float f16 = this.f98143y;
                float f17 = this.f98144z;
                float f18 = this.f98139E;
                return AbstractC25053e.m73513o(this.f98142x, f16, f17, f18, this.f98140F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC40098i.m128602h(this.f98143y, this.f98144z, this.f98139E, this.f98142x, this.f98140F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C25050b(long j7, float f13, float f14, float f15, int i13, int i14) {
        this.f98141w = i14;
        this.f98142x = j7;
        this.f98143y = f13;
        this.f98144z = f14;
        this.f98139E = f15;
        this.f98140F = i13;
    }
}
