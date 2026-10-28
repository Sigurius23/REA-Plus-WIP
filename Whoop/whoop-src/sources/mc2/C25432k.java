package mc2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p748zc1.AbstractC40359i6;

/* JADX INFO: renamed from: mc2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25432k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f99616E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99617w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f99618x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f99619y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f99620z;

    public /* synthetic */ C25432k(int i13, int i14, int i15, long j7, String str) {
        this.f99617w = i15;
        this.f99618x = str;
        this.f99619y = j7;
        this.f99620z = i13;
        this.f99616E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f99617w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC25433l.m74657i(this.f99618x, this.f99619y, this.f99620z, this.f99616E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40359i6.m130018y(this.f99618x, this.f99619y, this.f99620z, this.f99616E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC40359i6.m129993G(this.f99618x, this.f99619y, this.f99620z, this.f99616E, (Composer) obj, iIntValue3);
        }
    }
}
