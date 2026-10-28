package k03;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: k03.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22097b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f85707E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f85708F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f85709G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f85710H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85711w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f85712x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f85713y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f85714z;

    public /* synthetic */ C22097b(float f13, int i13, int i14, long j7, String str, String str2, String str3, boolean z4) {
        this.f85711w = i14;
        this.f85712x = f13;
        this.f85713y = str;
        this.f85714z = str2;
        this.f85707E = str3;
        this.f85708F = i13;
        this.f85709G = j7;
        this.f85710H = z4;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f85711w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C22098c.m63257x(this.f85712x, this.f85713y, this.f85714z, this.f85707E, this.f85708F, this.f85709G, this.f85710H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C22098c.m63258y(this.f85712x, this.f85713y, this.f85714z, this.f85707E, this.f85708F, this.f85709G, this.f85710H, (Composer) obj, iIntValue2);
        }
    }
}
