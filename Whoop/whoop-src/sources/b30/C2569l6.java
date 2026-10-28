package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.functions.Function1;
import w71.AbstractC36886h0;

/* JADX INFO: renamed from: b30.l6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2569l6 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9980w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f9981x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f9982y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f9983z;

    public /* synthetic */ C2569l6(String str, boolean z4, boolean z13, int i13) {
        this.f9983z = str;
        this.f9981x = z4;
        this.f9982y = z13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9980w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC34870c0.m110018t(this.f9981x, this.f9982y, (Function1) this.f9983z, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC36886h0.m118356e(this.f9981x, this.f9982y, (Function1) this.f9983z, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(7);
                AbstractC2495c4.m7459f((String) this.f9983z, this.f9981x, this.f9982y, (Composer) obj, iM87244L2);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C2569l6(Function1 function1, boolean z4, boolean z13) {
        this.f9981x = z4;
        this.f9982y = z13;
        this.f9983z = function1;
    }

    public /* synthetic */ C2569l6(boolean z4, boolean z13, Function1 function1, int i13) {
        this.f9981x = z4;
        this.f9982y = z13;
        this.f9983z = function1;
    }
}
