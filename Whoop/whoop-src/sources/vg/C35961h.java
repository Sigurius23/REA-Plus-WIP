package vg;

import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;

/* JADX INFO: renamed from: vg.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C35961h {

    /* JADX INFO: renamed from: a */
    public final Object f153125a;

    /* JADX INFO: renamed from: b */
    public final C34913b f153126b;

    public C35961h(Object obj, C34913b expiresAt) {
        AbstractC22676k.m65750j(expiresAt, "expiresAt");
        this.f153125a = obj;
        this.f153126b = expiresAt;
    }

    /* JADX INFO: renamed from: a */
    public final C34913b m114204a() {
        return this.f153126b;
    }

    /* JADX INFO: renamed from: b */
    public final Object m114205b() {
        return this.f153125a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35961h)) {
            return false;
        }
        C35961h c35961h = (C35961h) obj;
        return AbstractC22676k.m65745e(this.f153125a, c35961h.f153125a) && AbstractC22676k.m65745e(this.f153126b, c35961h.f153126b);
    }

    public final int hashCode() {
        Object obj = this.f153125a;
        return this.f153126b.f147018w.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "ExpiringValue(value=" + this.f153125a + ", expiresAt=" + this.f153126b + ')';
    }
}
