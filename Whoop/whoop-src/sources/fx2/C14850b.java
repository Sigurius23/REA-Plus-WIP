package fx2;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fx2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C14850b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55423w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14855g f55424x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f55425y;

    public /* synthetic */ C14850b(C14855g c14855g, int i13, int i14) {
        this.f55423w = i14;
        this.f55424x = c14855g;
        this.f55425y = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55423w) {
            case 0:
                return this.f55424x.m42813M0(this.f55425y, (InterfaceC33687a) obj);
            case 1:
                return this.f55424x.m42809K0(this.f55425y, (InterfaceC33687a) obj);
            case 2:
                return this.f55424x.m42821Q0(this.f55425y, (InterfaceC33687a) obj);
            case 3:
                return this.f55424x.m42815N0(this.f55425y, (InterfaceC33687a) obj);
            case 4:
                return this.f55424x.m42819P0(this.f55425y, (InterfaceC33687a) obj);
            default:
                return this.f55424x.m42817O0(this.f55425y, (InterfaceC33687a) obj);
        }
    }
}
