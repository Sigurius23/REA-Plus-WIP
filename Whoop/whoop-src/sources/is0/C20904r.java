package is0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import y21.AbstractC39162i;
import y21.C39155b;

/* JADX INFO: renamed from: is0.r */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20904r implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f78729E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f78730F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f78731G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78732w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f78733x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f78734y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f78735z;

    public /* synthetic */ C20904r(C20907s0 c20907s0, float f13, int i13, boolean z4, InterfaceC4339a interfaceC4339a, int i14) {
        this.f78731G = c20907s0;
        this.f78733x = f13;
        this.f78729E = i13;
        this.f78734y = z4;
        this.f78735z = interfaceC4339a;
        this.f78730F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78732w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC20916x.m57931N((C20907s0) this.f78731G, this.f78733x, this.f78729E, this.f78734y, this.f78735z, this.f78730F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39162i.m124689E((C39155b.a) this.f78731G, this.f78733x, this.f78734y, this.f78735z, this.f78729E, this.f78730F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C20904r(C39155b.a aVar, float f13, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f78731G = aVar;
        this.f78733x = f13;
        this.f78734y = z4;
        this.f78735z = interfaceC4339a;
        this.f78729E = i13;
        this.f78730F = i14;
    }
}
