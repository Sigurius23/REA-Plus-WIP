package p138f6;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14132d {

    /* JADX INFO: renamed from: a */
    public final String f50837a;

    public C14132d(String name) {
        AbstractC22676k.m65750j(name, "name");
        this.f50837a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14132d)) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f50837a, ((C14132d) obj).f50837a);
    }

    public final int hashCode() {
        return this.f50837a.hashCode();
    }

    public final String toString() {
        return this.f50837a;
    }
}
