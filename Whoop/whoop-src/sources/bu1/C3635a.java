package bu1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ft1.InterfaceC14770c;
import p707gt1.AbstractC16188b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bu1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3635a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f14796E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f14797F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14798w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC14770c.g f14799x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f14800y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f14801z;

    public /* synthetic */ C3635a(InterfaceC14770c.g gVar, Function1 function1, Function1 function2, int i13, int i14, int i15) {
        this.f14798w = i15;
        this.f14799x = gVar;
        this.f14800y = function1;
        this.f14801z = function2;
        this.f14796E = i13;
        this.f14797F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14798w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3636b.m11198m(this.f14799x, this.f14800y, this.f14801z, this.f14796E, this.f14797F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16188b.m45750m(this.f14799x, this.f14800y, this.f14801z, this.f14796E, this.f14797F, (Composer) obj, iIntValue2);
        }
    }
}
