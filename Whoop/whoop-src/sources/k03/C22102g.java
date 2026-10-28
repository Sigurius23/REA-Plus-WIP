package k03;

import androidx.compose.runtime.Composer;
import p545v6.InterfaceC35718g;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: k03.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22102g implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f85738E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f85739F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f85740G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ String f85741H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85742w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f85743x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f85744y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f85745z;

    public /* synthetic */ C22102g(float f13, int i13, int i14, long j7, String str, String str2, String str3, boolean z4) {
        this.f85742w = i14;
        this.f85743x = str;
        this.f85744y = j7;
        this.f85745z = i13;
        this.f85738E = f13;
        this.f85739F = z4;
        this.f85740G = str2;
        this.f85741H = str3;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f85742w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC22109n.m63273J(this.f85743x, this.f85744y, this.f85745z, this.f85738E, this.f85739F, this.f85740G, this.f85741H, (InterfaceC35718g) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC22109n.m63267D(this.f85743x, this.f85744y, this.f85745z, this.f85738E, this.f85739F, this.f85740G, this.f85741H, (InterfaceC35718g) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                String str = this.f85743x;
                long j7 = this.f85744y;
                int i13 = this.f85745z;
                float f13 = this.f85738E;
                boolean z4 = this.f85739F;
                return AbstractC22109n.m63276M(str, j7, i13, this.f85740G, f13, z4, this.f85741H, (InterfaceC35718g) obj, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ C22102g(String str, long j7, int i13, String str2, float f13, boolean z4, String str3) {
        this.f85742w = 2;
        this.f85743x = str;
        this.f85744y = j7;
        this.f85745z = i13;
        this.f85740G = str2;
        this.f85738E = f13;
        this.f85739F = z4;
        this.f85741H = str3;
    }
}
