package eg2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p291l0.InterfaceC22997s1;
import q21.AbstractC29844c;
import q21.AbstractC29845d;

/* JADX INFO: renamed from: eg2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13171d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f45646E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f45647F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f45648G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f45649H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45650w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f45651x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f45652y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f45653z;

    public /* synthetic */ C13171d(EnumC13178k enumC13178k, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f45650w = i15;
        this.f45651x = enumC13178k;
        this.f45652y = z4;
        this.f45653z = z13;
        this.f45646E = z14;
        this.f45647F = interfaceC4339a;
        this.f45648G = i13;
        this.f45649H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45650w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13172e.m36938j((EnumC13178k) this.f45651x, this.f45652y, this.f45653z, this.f45646E, (InterfaceC4339a) this.f45647F, this.f45648G, this.f45649H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13172e.m36942n((EnumC13178k) this.f45651x, this.f45652y, this.f45653z, this.f45646E, (InterfaceC4339a) this.f45647F, this.f45648G, this.f45649H, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC29844c.m91360x((InterfaceC22997s1) this.f45651x, (AbstractC29845d) this.f45647F, this.f45652y, this.f45653z, this.f45646E, this.f45648G, this.f45649H, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C13171d(InterfaceC22997s1 interfaceC22997s1, AbstractC29845d abstractC29845d, boolean z4, boolean z13, boolean z14, int i13, int i14) {
        this.f45650w = 2;
        this.f45651x = interfaceC22997s1;
        this.f45647F = abstractC29845d;
        this.f45652y = z4;
        this.f45653z = z13;
        this.f45646E = z14;
        this.f45648G = i13;
        this.f45649H = i14;
    }
}
