package p077d0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11406u1 implements InterfaceC11403t1 {

    /* JADX INFO: renamed from: a */
    public final Object f36569a;

    /* JADX INFO: renamed from: b */
    public final Object f36570b;

    public C11406u1(Object obj, Object obj2) {
        this.f36569a = obj;
        this.f36570b = obj2;
    }

    @Override // p077d0.InterfaceC11403t1
    /* JADX INFO: renamed from: b */
    public final Object mo11595b() {
        return this.f36570b;
    }

    @Override // p077d0.InterfaceC11403t1
    /* JADX INFO: renamed from: c */
    public final Object mo11596c() {
        return this.f36569a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC11403t1)) {
            return false;
        }
        InterfaceC11403t1 interfaceC11403t1 = (InterfaceC11403t1) obj;
        return AbstractC22676k.m65745e(this.f36569a, interfaceC11403t1.mo11596c()) && AbstractC22676k.m65745e(this.f36570b, interfaceC11403t1.mo11595b());
    }

    public final int hashCode() {
        Object obj = this.f36569a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f36570b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
