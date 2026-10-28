package p392p3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C28766e {

    /* JADX INFO: renamed from: a */
    public final C28786x f116517a;

    public C28766e(C28786x c28786x) {
        this.f116517a = c28786x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28766e) && AbstractC22676k.m65745e(this.f116517a, ((C28766e) obj).f116517a);
    }

    public final int hashCode() {
        return this.f116517a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f116517a + ", loaderKey=null)";
    }
}
