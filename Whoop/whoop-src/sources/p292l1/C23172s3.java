package p292l1;

import c93.InterfaceC4339a;
import l83.InterfaceC23459e;
import m80.AbstractC25224f;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.s3 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23172s3 implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC23459e f91644E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f91645F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91646w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f91647x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f91648y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f91649z;

    public /* synthetic */ C23172s3(Function1 function1, boolean z4, Function1 function2, boolean z13, InterfaceC28601c1 interfaceC28601c1) {
        this.f91647x = function1;
        this.f91648y = z4;
        this.f91644E = function2;
        this.f91649z = z13;
        this.f91645F = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f91646w) {
            case 0:
                return new C23196w3(this.f91648y, (InterfaceC4339a) this.f91644E, (InterfaceC4339a) this.f91645F, EnumC23202x3.f91820w, this.f91647x, this.f91649z);
            default:
                return AbstractC25224f.m73930r(this.f91647x, this.f91648y, (Function1) this.f91644E, this.f91649z, (InterfaceC28601c1) this.f91645F);
        }
    }

    public /* synthetic */ C23172s3(boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, boolean z13) {
        EnumC23202x3 enumC23202x3 = EnumC23202x3.f91820w;
        this.f91648y = z4;
        this.f91644E = interfaceC4339a;
        this.f91645F = interfaceC4339a2;
        this.f91647x = function1;
        this.f91649z = z13;
    }
}
