package wo1;

import c93.InterfaceC4339a;
import com.whoop.navigation.C9598e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: wo1.g0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C37449g0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160270w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f160271x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C9598e f160272y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f160273z;

    public /* synthetic */ C37449g0(Function1 function1, C9598e c9598e, Function1 function2) {
        this.f160271x = function1;
        this.f160272y = c9598e;
        this.f160273z = function2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f160270w) {
            case 0:
                return AbstractC37451h0.m119937o(this.f160271x, this.f160273z, this.f160272y);
            default:
                return AbstractC37467p0.m120081m(this.f160271x, this.f160272y, this.f160273z);
        }
    }

    public /* synthetic */ C37449g0(Function1 function1, Function1 function2, C9598e c9598e) {
        this.f160271x = function1;
        this.f160273z = function2;
        this.f160272y = c9598e;
    }
}
