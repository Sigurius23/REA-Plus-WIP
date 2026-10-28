package gi;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gi.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C15878i {

    /* JADX INFO: renamed from: c */
    public static final C15878i f59992c;

    /* JADX INFO: renamed from: a */
    public final InterfaceC15872c f59993a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC15872c f59994b;

    static {
        C15871b c15871b = C15871b.f59979a;
        f59992c = new C15878i(c15871b, c15871b);
    }

    public C15878i(InterfaceC15872c interfaceC15872c, InterfaceC15872c interfaceC15872c2) {
        this.f59993a = interfaceC15872c;
        this.f59994b = interfaceC15872c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15878i)) {
            return false;
        }
        C15878i c15878i = (C15878i) obj;
        return AbstractC22676k.m65745e(this.f59993a, c15878i.f59993a) && AbstractC22676k.m65745e(this.f59994b, c15878i.f59994b);
    }

    public final int hashCode() {
        return this.f59994b.hashCode() + (this.f59993a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f59993a + ", height=" + this.f59994b + ')';
    }
}
