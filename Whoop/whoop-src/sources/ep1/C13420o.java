package ep1;

import c93.InterfaceC4339a;
import m80.AbstractC25224f;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ep1.o */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13420o implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f46998E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46999w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f47000x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f47001y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f47002z;

    public /* synthetic */ C13420o(Function1 function1, Function1 function2, boolean z4, InterfaceC28601c1 interfaceC28601c1) {
        this.f47000x = function1;
        this.f47001y = function2;
        this.f47002z = z4;
        this.f46998E = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f46999w) {
            case 0:
                Function1 function1 = this.f47001y;
                InterfaceC28601c1 interfaceC28601c1 = this.f46998E;
                return AbstractC13422q.m38021I(this.f47002z, this.f47000x, function1, interfaceC28601c1);
            default:
                return AbstractC25224f.m73926n(this.f47000x, this.f47001y, this.f47002z, this.f46998E);
        }
    }

    public /* synthetic */ C13420o(boolean z4, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1) {
        this.f47002z = z4;
        this.f47000x = function1;
        this.f47001y = function2;
        this.f46998E = interfaceC28601c1;
    }
}
