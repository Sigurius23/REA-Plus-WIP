package bs1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ds1.C12341k;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bs1.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3592k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f14588E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14589w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12341k f14590x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f14591y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f14592z;

    public /* synthetic */ C3592k(C12341k c12341k, Function1 function1, Function1 function2, int i13, int i14) {
        this.f14589w = i14;
        this.f14590x = c12341k;
        this.f14591y = function1;
        this.f14592z = function2;
        this.f14588E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14589w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3593l.m10959i(this.f14590x, this.f14591y, this.f14592z, this.f14588E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC3583c0.m10867n1(this.f14590x, this.f14591y, this.f14592z, this.f14588E, (Composer) obj, iIntValue2);
        }
    }
}
