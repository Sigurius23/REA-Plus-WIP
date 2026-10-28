package p658yr;

import p031b9.AbstractC2875y;
import p031b9.C2855o;

/* JADX INFO: renamed from: yr.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C39724k implements InterfaceC39722i {

    /* JADX INFO: renamed from: z */
    public static final C2855o f170972z = new C2855o(4);

    /* JADX INFO: renamed from: w */
    public final Object f170973w = new Object();

    /* JADX INFO: renamed from: x */
    public volatile InterfaceC39722i f170974x;

    /* JADX INFO: renamed from: y */
    public Object f170975y;

    public C39724k(InterfaceC39722i interfaceC39722i) {
        this.f170974x = interfaceC39722i;
    }

    @Override // p658yr.InterfaceC39722i
    public final Object get() {
        InterfaceC39722i interfaceC39722i = this.f170974x;
        C2855o c2855o = f170972z;
        if (interfaceC39722i != c2855o) {
            synchronized (this.f170973w) {
                try {
                    if (this.f170974x != c2855o) {
                        Object obj = this.f170974x.get();
                        this.f170975y = obj;
                        this.f170974x = c2855o;
                        return obj;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f170975y;
    }

    public final String toString() {
        Object objM8303p = this.f170974x;
        StringBuilder sb4 = new StringBuilder("Suppliers.memoize(");
        if (objM8303p == f170972z) {
            objM8303p = AbstractC2875y.m8303p(new StringBuilder("<supplier that returned "), ">", this.f170975y);
        }
        return AbstractC2875y.m8303p(sb4, ")", objM8303p);
    }
}
