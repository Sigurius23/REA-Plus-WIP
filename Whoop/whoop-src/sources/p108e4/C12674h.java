package p108e4;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: e4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C12674h {

    /* JADX INFO: renamed from: a */
    public final Object f43340a;

    /* JADX INFO: renamed from: b */
    public final int f43341b;

    /* JADX INFO: renamed from: c */
    public final C12672f f43342c;

    public C12674h(Object obj, int i13, C12672f c12672f) {
        this.f43340a = obj;
        this.f43341b = i13;
        this.f43342c = c12672f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12674h)) {
            return false;
        }
        C12674h c12674h = (C12674h) obj;
        return this.f43340a.equals(c12674h.f43340a) && this.f43341b == c12674h.f43341b && this.f43342c.equals(c12674h.f43342c);
    }

    public final int hashCode() {
        return this.f43342c.hashCode() + AbstractC11266d.m30448b(this.f43341b, this.f43340a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.f43340a + ", index=" + this.f43341b + ", reference=" + this.f43342c + ')';
    }
}
