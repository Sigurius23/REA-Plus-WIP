package p509u;

import java.util.Map;

/* JADX INFO: renamed from: u.c */
/* JADX INFO: loaded from: classes.dex */
public final class C34295c implements Map.Entry {

    /* JADX INFO: renamed from: w */
    public final Object f144033w;

    /* JADX INFO: renamed from: x */
    public final Object f144034x;

    /* JADX INFO: renamed from: y */
    public C34295c f144035y;

    /* JADX INFO: renamed from: z */
    public C34295c f144036z;

    public C34295c(Object obj, Object obj2) {
        this.f144033w = obj;
        this.f144034x = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34295c)) {
            return false;
        }
        C34295c c34295c = (C34295c) obj;
        return this.f144033w.equals(c34295c.f144033w) && this.f144034x.equals(c34295c.f144034x);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f144033w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f144034x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f144033w.hashCode() ^ this.f144034x.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f144033w + "=" + this.f144034x;
    }
}
