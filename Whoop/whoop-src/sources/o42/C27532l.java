package o42;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import vq2.AbstractC36289f;

/* JADX INFO: renamed from: o42.l */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27532l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f110840E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110841w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f110842x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f110843y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f110844z;

    public /* synthetic */ C27532l(int i13, String str, String str2, int i14) {
        this.f110842x = i13;
        this.f110843y = str;
        this.f110844z = str2;
        this.f110840E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f110841w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = this.f110842x;
                return AbstractC27533m.m83042c(this.f110843y, this.f110844z, i13, this.f110840E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36289f.m116014h(this.f110842x, this.f110843y, this.f110844z, this.f110840E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C27532l(String str, String str2, int i13, int i14) {
        this.f110843y = str;
        this.f110844z = str2;
        this.f110842x = i13;
        this.f110840E = i14;
    }
}
