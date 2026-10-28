package k03;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: k03.h */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22103h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f85746E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f85747F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f85748G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f85749H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f85750I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85751w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f85752x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f85753y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f85754z;

    public /* synthetic */ C22103h(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, int i14, int i15) {
        this.f85751w = i15;
        this.f85752x = f13;
        this.f85753y = str;
        this.f85754z = str2;
        this.f85746E = str3;
        this.f85747F = i13;
        this.f85748G = j7;
        this.f85749H = z4;
        this.f85750I = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f85751w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22109n.m63275L(this.f85752x, this.f85753y, this.f85754z, this.f85746E, this.f85747F, this.f85748G, this.f85749H, this.f85750I, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22109n.m63268E(this.f85752x, this.f85753y, this.f85754z, this.f85746E, this.f85747F, this.f85748G, this.f85749H, this.f85750I, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC22109n.m63281R(this.f85752x, this.f85753y, this.f85754z, this.f85746E, this.f85747F, this.f85748G, this.f85749H, this.f85750I, (Composer) obj, iIntValue3);
        }
    }
}
