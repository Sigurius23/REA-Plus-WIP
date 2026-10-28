package p658yr;

import java.io.Serializable;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: yr.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C39723j implements InterfaceC39722i, Serializable {

    /* JADX INFO: renamed from: w */
    public final transient Object f170968w = new Object();

    /* JADX INFO: renamed from: x */
    public final InterfaceC39722i f170969x;

    /* JADX INFO: renamed from: y */
    public volatile transient boolean f170970y;

    /* JADX INFO: renamed from: z */
    public transient Object f170971z;

    public C39723j(InterfaceC39722i interfaceC39722i) {
        this.f170969x = interfaceC39722i;
    }

    @Override // p658yr.InterfaceC39722i
    public final Object get() {
        if (!this.f170970y) {
            synchronized (this.f170968w) {
                try {
                    if (!this.f170970y) {
                        Object obj = this.f170969x.get();
                        this.f170971z = obj;
                        this.f170970y = true;
                        return obj;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f170971z;
    }

    public final String toString() {
        return AbstractC2875y.m8303p(new StringBuilder("Suppliers.memoize("), ")", this.f170970y ? AbstractC2875y.m8303p(new StringBuilder("<supplier that returned "), ">", this.f170971z) : this.f170969x);
    }
}
