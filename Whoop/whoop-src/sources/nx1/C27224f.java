package nx1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: nx1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27224f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f108955w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f108956x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f108957y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f108958z;

    public /* synthetic */ C27224f(Function1 function1, Function1 function2, int i13, int i14) {
        this.f108955w = i14;
        this.f108956x = function1;
        this.f108957y = function2;
        this.f108958z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f108955w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC27226h.m82009D(this.f108956x, this.f108957y, this.f108958z, composer, iIntValue);
            default:
                return p735ss0.Function1.m104025k(this.f108956x, this.f108957y, this.f108958z, composer, iIntValue);
        }
    }
}
