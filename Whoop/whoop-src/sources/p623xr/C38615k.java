package p623xr;

/* JADX INFO: renamed from: xr.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C38615k implements InterfaceC38617m {

    /* JADX INFO: renamed from: y */
    public static final Object f166125y = new Object();

    /* JADX INFO: renamed from: w */
    public volatile InterfaceC38616l f166126w;

    /* JADX INFO: renamed from: x */
    public volatile Object f166127x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static C38615k m123813b(InterfaceC38616l interfaceC38616l) {
        if (interfaceC38616l instanceof C38615k) {
            return (C38615k) interfaceC38616l;
        }
        C38615k c38615k = new C38615k();
        c38615k.f166127x = f166125y;
        c38615k.f166126w = interfaceC38616l;
        return c38615k;
    }

    @Override // p623xr.InterfaceC38617m
    /* JADX INFO: renamed from: a */
    public final Object mo45127a() {
        Object objMo45127a;
        Object obj = this.f166127x;
        Object obj2 = f166125y;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo45127a = this.f166127x;
                if (objMo45127a == obj2) {
                    objMo45127a = this.f166126w.mo45127a();
                    Object obj3 = this.f166127x;
                    if (obj3 != obj2 && obj3 != objMo45127a) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo45127a + ". This is likely due to a circular dependency.");
                    }
                    this.f166127x = objMo45127a;
                    this.f166126w = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return objMo45127a;
    }
}
