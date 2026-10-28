package pt2;

import c93.InterfaceC4339a;
import ot2.C28351t;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pt2.z */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29544z implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120312w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f120313x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28351t f120314y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f120315z;

    public /* synthetic */ C29544z(Function1 function1, Function1 function2, C28351t c28351t) {
        this.f120313x = function1;
        this.f120315z = function2;
        this.f120314y = c28351t;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f120312w) {
            case 0:
                return AbstractC29517a0.m90207m(this.f120313x, this.f120315z, this.f120314y);
            default:
                return AbstractC29517a0.m90210p(this.f120313x, this.f120314y, this.f120315z);
        }
    }

    public /* synthetic */ C29544z(Function1 function1, C28351t c28351t, Function1 function2) {
        this.f120313x = function1;
        this.f120314y = c28351t;
        this.f120315z = function2;
    }
}
