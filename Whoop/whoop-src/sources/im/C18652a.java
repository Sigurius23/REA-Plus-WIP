package im;

import k83.InterfaceC22297a;

/* JADX INFO: renamed from: im.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18652a implements InterfaceC22297a {

    /* JADX INFO: renamed from: y */
    public static final Object f73190y = new Object();

    /* JADX INFO: renamed from: w */
    public volatile InterfaceC18653b f73191w;

    /* JADX INFO: renamed from: x */
    public volatile Object f73192x;

    /* JADX INFO: renamed from: a */
    public static InterfaceC22297a m54083a(InterfaceC18653b interfaceC18653b) {
        if (interfaceC18653b instanceof C18652a) {
            return interfaceC18653b;
        }
        C18652a c18652a = new C18652a();
        c18652a.f73192x = f73190y;
        c18652a.f73191w = interfaceC18653b;
        return c18652a;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        Object obj;
        Object obj2 = this.f73192x;
        Object obj3 = f73190y;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f73192x;
                if (obj == obj3) {
                    obj = this.f73191w.get();
                    Object obj4 = this.f73192x;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f73192x = obj;
                    this.f73191w = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }
}
