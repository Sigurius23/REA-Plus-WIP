package p392p3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C28764d {

    /* JADX INFO: renamed from: a */
    public final Object f116514a;

    public final boolean equals(Object obj) {
        if (obj instanceof C28764d) {
            return AbstractC22676k.m65745e(this.f116514a, ((C28764d) obj).f116514a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f116514a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f116514a + ')';
    }
}
