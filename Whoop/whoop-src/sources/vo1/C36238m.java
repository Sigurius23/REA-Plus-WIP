package vo1;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import vp1.AbstractC36272h;

/* JADX INFO: renamed from: vo1.m */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36238m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f155182E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155183w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f155184x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f155185y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f155186z;

    public /* synthetic */ C36238m(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f155184x = function1;
        this.f155185y = function2;
        this.f155186z = interfaceC28601c1;
        this.f155182E = interfaceC28601c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f155183w) {
            case 0:
                Function1 function1 = this.f155185y;
                InterfaceC28601c1 interfaceC28601c1 = this.f155182E;
                return AbstractC36243r.m115562w0(this.f155186z, this.f155184x, function1, interfaceC28601c1);
            case 1:
                return AbstractC36272h.m115832f1(this.f155184x, this.f155185y, this.f155186z, this.f155182E);
            default:
                return AbstractC36272h.m115840h1(this.f155184x, this.f155186z, this.f155182E, this.f155185y);
        }
    }

    public /* synthetic */ C36238m(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function2) {
        this.f155184x = function1;
        this.f155186z = interfaceC28601c1;
        this.f155182E = interfaceC28601c2;
        this.f155185y = function2;
    }

    public /* synthetic */ C36238m(InterfaceC28601c1 interfaceC28601c1, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c2) {
        this.f155186z = interfaceC28601c1;
        this.f155184x = function1;
        this.f155185y = function2;
        this.f155182E = interfaceC28601c2;
    }
}
