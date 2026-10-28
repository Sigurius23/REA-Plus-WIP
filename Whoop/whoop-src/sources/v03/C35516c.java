package v03;

import u03.InterfaceC34393a;

/* JADX INFO: renamed from: v03.c */
/* JADX INFO: loaded from: classes11.dex */
public final class C35516c implements InterfaceC35521h, InterfaceC34393a {

    /* JADX INFO: renamed from: y */
    public static final Object f151133y = new Object();

    /* JADX INFO: renamed from: w */
    public volatile InterfaceC35521h f151134w;

    /* JADX INFO: renamed from: x */
    public volatile Object f151135x = f151133y;

    public C35516c(InterfaceC35521h interfaceC35521h) {
        this.f151134w = interfaceC35521h;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC34393a m112677a(InterfaceC35521h interfaceC35521h) {
        if (interfaceC35521h instanceof InterfaceC34393a) {
            return (InterfaceC34393a) interfaceC35521h;
        }
        interfaceC35521h.getClass();
        return new C35516c(interfaceC35521h);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC35521h m112678b(InterfaceC35521h interfaceC35521h) {
        interfaceC35521h.getClass();
        return interfaceC35521h instanceof C35516c ? interfaceC35521h : new C35516c(interfaceC35521h);
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        Object obj;
        Object obj2 = this.f151135x;
        Object obj3 = f151133y;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f151135x;
            if (obj == obj3) {
                obj = this.f151134w.get();
                Object obj4 = this.f151135x;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f151135x = obj;
                this.f151134w = null;
            }
        }
        return obj;
    }
}
