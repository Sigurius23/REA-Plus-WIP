package kw1;

import com.whoop.membership.extensions.domain.models.CtaAction;
import iw1.InterfaceC20996b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kw1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22851b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90094w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f90095x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC20996b f90096y;

    public /* synthetic */ C22851b(InterfaceC20996b interfaceC20996b, Function1 function1) {
        this.f90094w = 2;
        this.f90096y = interfaceC20996b;
        this.f90095x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90094w) {
            case 0:
                return AbstractC22853d.m66333y(this.f90095x, this.f90096y, (CtaAction) obj);
            case 1:
                return AbstractC22853d.m66334z(this.f90095x, this.f90096y, (CtaAction) obj);
            default:
                return AbstractC22853d.m66289B(this.f90096y, this.f90095x, (String) obj);
        }
    }

    public /* synthetic */ C22851b(Function1 function1, InterfaceC20996b interfaceC20996b, int i13) {
        this.f90094w = i13;
        this.f90095x = function1;
        this.f90096y = interfaceC20996b;
    }
}
