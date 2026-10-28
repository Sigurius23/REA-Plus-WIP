package p108e4;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: e4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12673g {

    /* JADX INFO: renamed from: a */
    public final Object f43337a;

    /* JADX INFO: renamed from: b */
    public final int f43338b;

    /* JADX INFO: renamed from: c */
    public final C12672f f43339c;

    public C12673g(Object obj, int i13, C12672f c12672f) {
        this.f43337a = obj;
        this.f43338b = i13;
        this.f43339c = c12672f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12673g)) {
            return false;
        }
        C12673g c12673g = (C12673g) obj;
        return this.f43337a.equals(c12673g.f43337a) && this.f43338b == c12673g.f43338b && this.f43339c.equals(c12673g.f43339c);
    }

    public final int hashCode() {
        return this.f43339c.hashCode() + AbstractC11266d.m30448b(this.f43338b, this.f43337a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.f43337a + ", index=" + this.f43338b + ", reference=" + this.f43339c + ')';
    }
}
