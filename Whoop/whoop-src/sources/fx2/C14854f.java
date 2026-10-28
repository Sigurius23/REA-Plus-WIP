package fx2;

import p002a0.C0062y;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fx2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C14854f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55435w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14855g f55436x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC33687a f55437y;

    public /* synthetic */ C14854f(int i13, C14855g c14855g, InterfaceC33687a interfaceC33687a) {
        this.f55435w = i13;
        this.f55436x = c14855g;
        this.f55437y = interfaceC33687a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55435w) {
            case 0:
                return this.f55436x.m42865x0(this.f55437y, (C0062y) obj);
            default:
                return this.f55436x.m42864w0(this.f55437y, (C0062y) obj);
        }
    }
}
