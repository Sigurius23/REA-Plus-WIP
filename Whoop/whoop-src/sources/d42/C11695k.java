package d42;

import androidx.compose.runtime.Composer;
import c42.C4169f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: d42.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11695k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f37816E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37817w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4169f f37818x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f37819y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f37820z;

    public /* synthetic */ C11695k(C4169f c4169f, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f37817w = i14;
        this.f37818x = c4169f;
        this.f37819y = interfaceC4339a;
        this.f37820z = interfaceC4339a2;
        this.f37816E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37817w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC11696l.m31225m(this.f37818x, this.f37819y, this.f37820z, this.f37816E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC11696l.m31223k(this.f37818x, this.f37819y, this.f37820z, this.f37816E, (Composer) obj, iIntValue2);
        }
    }
}
