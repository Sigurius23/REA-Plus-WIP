package z22;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import x22.C37864c;

/* JADX INFO: renamed from: z22.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C40026e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f172709E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172710w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37864c f172711x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f172712y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f172713z;

    public /* synthetic */ C40026e(C37864c c37864c, Function1 function1, int i13, int i14, int i15) {
        this.f172710w = i15;
        this.f172711x = c37864c;
        this.f172712y = function1;
        this.f172713z = i13;
        this.f172709E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f172710w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC40028g.m128323k(this.f172711x, this.f172712y, this.f172713z, this.f172709E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40030i.m128354i(this.f172711x, this.f172712y, this.f172713z, this.f172709E, (Composer) obj, iIntValue2);
        }
    }
}
