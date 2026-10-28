package o42;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import n42.C26278b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o42.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27522b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110814w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26278b f110815x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f110816y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f110817z;

    public /* synthetic */ C27522b(C26278b c26278b, Function1 function1, int i13, int i14) {
        this.f110814w = i14;
        this.f110815x = c26278b;
        this.f110816y = function1;
        this.f110817z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f110814w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC27523c.m82963e(this.f110815x, this.f110816y, this.f110817z, composer, iIntValue);
            default:
                return AbstractC27531k.m82979M(this.f110815x, this.f110816y, this.f110817z, composer, iIntValue);
        }
    }
}
