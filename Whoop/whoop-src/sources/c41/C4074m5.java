package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.List;
import p208i2.InterfaceC17869a1;
import vy0.AbstractC36596x;
import y71.C39274g;

/* JADX INFO: renamed from: c41.m5 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4074m5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16544E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f16545F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f16546G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f16547H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16548w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f16549x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f16550y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f16551z;

    public /* synthetic */ C4074m5(Modifier modifier, List list, long j7, InterfaceC17869a1 interfaceC17869a1, long j13, int i13, int i14) {
        this.f16549x = modifier;
        this.f16546G = list;
        this.f16550y = j7;
        this.f16547H = interfaceC17869a1;
        this.f16551z = j13;
        this.f16544E = i13;
        this.f16545F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16548w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4081n5.m12529c(this.f16549x, (List) this.f16546G, this.f16550y, (InterfaceC17869a1) this.f16547H, this.f16551z, this.f16544E, this.f16545F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36596x.m117528r(this.f16549x, (C39274g) this.f16546G, this.f16550y, this.f16551z, (InterfaceC4339a) this.f16547H, this.f16544E, this.f16545F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C4074m5(Modifier modifier, C39274g c39274g, long j7, long j13, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f16549x = modifier;
        this.f16546G = c39274g;
        this.f16550y = j7;
        this.f16551z = j13;
        this.f16547H = interfaceC4339a;
        this.f16544E = i13;
        this.f16545F = i14;
    }
}
