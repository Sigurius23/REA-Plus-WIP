package w71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: w71.q */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36898q implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f157842E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f157843F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28601c1 f157844G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157845w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f157846x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f157847y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Integer f157848z;

    public /* synthetic */ C36898q(int i13, int i14, Integer num, boolean z4, Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i15) {
        this.f157845w = i15;
        this.f157846x = i13;
        this.f157847y = i14;
        this.f157848z = num;
        this.f157842E = z4;
        this.f157843F = function1;
        this.f157844G = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157845w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC36900s.m118474i(this.f157846x, this.f157847y, this.f157848z, this.f157842E, this.f157843F, this.f157844G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36900s.m118475j(this.f157846x, this.f157847y, this.f157848z, this.f157842E, this.f157843F, this.f157844G, (Composer) obj, iIntValue2);
        }
    }
}
