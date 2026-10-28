package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import pz0.AbstractC29641d;

/* JADX INFO: renamed from: g40.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15423t0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f57958E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f57959F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f57960G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57961w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f57962x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f57963y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f57964z;

    public /* synthetic */ C15423t0(Modifier modifier, boolean z4, boolean z13, long j7, Function1 function1, int i13) {
        this.f57959F = modifier;
        this.f57962x = z4;
        this.f57963y = z13;
        this.f57964z = j7;
        this.f57960G = function1;
        this.f57958E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57961w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15448y0.m43612c((InterfaceC41211c) this.f57959F, this.f57962x, (String) this.f57960G, this.f57964z, this.f57963y, (Composer) obj, AbstractC28683x.m87244L(this.f57958E | 1));
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC29641d.m91046h((Modifier) this.f57959F, this.f57962x, this.f57963y, this.f57964z, (Function1) this.f57960G, this.f57958E, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C15423t0(InterfaceC41211c interfaceC41211c, boolean z4, String str, long j7, boolean z13, int i13) {
        this.f57959F = interfaceC41211c;
        this.f57962x = z4;
        this.f57960G = str;
        this.f57964z = j7;
        this.f57963y = z13;
        this.f57958E = i13;
    }
}
