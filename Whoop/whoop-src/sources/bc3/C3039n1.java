package bc3;

import q83.InterfaceC30057d;

/* JADX INFO: renamed from: bc3.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3039n1 extends C3033m {

    /* JADX INFO: renamed from: I */
    public final C3060t1 f12060I;

    public C3039n1(InterfaceC30057d interfaceC30057d, C3060t1 c3060t1) {
        super(1, interfaceC30057d);
        this.f12060I = c3060t1;
    }

    @Override // bc3.C3033m
    /* JADX INFO: renamed from: q */
    public final Throwable mo8772q(C3060t1 c3060t1) {
        Throwable thM8795c;
        C3060t1 c3060t2 = this.f12060I;
        c3060t2.getClass();
        Object obj = C3060t1.f12091w.get(c3060t2);
        if (!(obj instanceof C3047p1) || (thM8795c = ((C3047p1) obj).m8795c()) == null) {
            return obj instanceof C3067w ? ((C3067w) obj).f12104a : c3060t1.getCancellationException();
        }
        return thM8795c;
    }

    @Override // bc3.C3033m
    /* JADX INFO: renamed from: z */
    public final String mo8780z() {
        return "AwaitContinuation";
    }
}
