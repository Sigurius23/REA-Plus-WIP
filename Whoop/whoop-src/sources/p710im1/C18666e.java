package p710im1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import em1.C13348v;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: im1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18666e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f73241E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f73242F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73243w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13348v f73244x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f73245y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f73246z;

    public /* synthetic */ C18666e(C13348v c13348v, Function1 function1, Function1 function2, int i13, int i14, int i15) {
        this.f73243w = i15;
        this.f73244x = c13348v;
        this.f73245y = function1;
        this.f73246z = function2;
        this.f73241E = i13;
        this.f73242F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f73243w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18668f.m54187k(this.f73244x, this.f73245y, this.f73246z, this.f73241E, this.f73242F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18697t0.m54379x0(this.f73244x, this.f73245y, this.f73246z, this.f73241E, this.f73242F, (Composer) obj, iIntValue2);
        }
    }
}
