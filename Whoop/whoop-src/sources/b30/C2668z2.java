package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: b30.z2 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2668z2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f10440E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f10441F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f10442G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10443w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2550j3 f10444x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10445y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f10446z;

    public /* synthetic */ C2668z2(C2550j3 c2550j3, boolean z4, boolean z13, float f13, InterfaceC4339a interfaceC4339a, int i13) {
        this.f10444x = c2550j3;
        this.f10445y = z4;
        this.f10446z = z13;
        this.f10440E = f13;
        this.f10441F = interfaceC4339a;
        this.f10442G = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10443w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f10442G | 1);
                AbstractC2526g3.m7464c(this.f10440E, iM87244L, (Composer) obj, this.f10444x, this.f10441F, this.f10445y, this.f10446z);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM87244L2 = AbstractC28683x.m87244L(this.f10442G | 1);
                AbstractC2526g3.m7463b(this.f10440E, iM87244L2, (Composer) obj, this.f10444x, this.f10441F, this.f10445y, this.f10446z);
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2668z2(C2550j3 c2550j3, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, float f13, int i13) {
        this.f10444x = c2550j3;
        this.f10445y = z4;
        this.f10446z = z13;
        this.f10441F = interfaceC4339a;
        this.f10440E = f13;
        this.f10442G = i13;
    }
}
