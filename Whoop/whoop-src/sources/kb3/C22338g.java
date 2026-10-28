package kb3;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: kb3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C22338g {

    /* JADX INFO: renamed from: a */
    public final Object f87173a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f87174b;

    public C22338g(Object obj, InterfaceC4339a interfaceC4339a) {
        this.f87173a = obj;
        this.f87174b = interfaceC4339a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C22338g.class == obj.getClass() && this.f87173a.equals(((C22338g) obj).f87173a);
    }

    public final int hashCode() {
        return this.f87173a.hashCode();
    }
}
