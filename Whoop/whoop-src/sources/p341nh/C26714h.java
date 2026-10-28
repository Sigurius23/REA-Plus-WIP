package p341nh;

import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nh.h */
/* JADX INFO: loaded from: classes.dex */
public final class C26714h {

    /* JADX INFO: renamed from: c */
    public static final C26714h f106216c;

    /* JADX INFO: renamed from: a */
    public final AbstractC12350b f106217a;

    /* JADX INFO: renamed from: b */
    public final AbstractC12350b f106218b;

    static {
        C26708b c26708b = C26708b.f106206a;
        f106216c = new C26714h(c26708b, c26708b);
    }

    public C26714h(AbstractC12350b abstractC12350b, AbstractC12350b abstractC12350b2) {
        this.f106217a = abstractC12350b;
        this.f106218b = abstractC12350b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26714h)) {
            return false;
        }
        C26714h c26714h = (C26714h) obj;
        return AbstractC22676k.m65745e(this.f106217a, c26714h.f106217a) && AbstractC22676k.m65745e(this.f106218b, c26714h.f106218b);
    }

    public final int hashCode() {
        return this.f106218b.hashCode() + (this.f106217a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f106217a + ", height=" + this.f106218b + ')';
    }
}
