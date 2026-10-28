package p294l3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23287w0 implements InterfaceC23244b {

    /* JADX INFO: renamed from: a */
    public final String f92266a;

    public C23287w0(String str) {
        this.f92266a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m67382a() {
        return this.f92266a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23287w0) {
            return AbstractC22676k.m65745e(this.f92266a, ((C23287w0) obj).f92266a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92266a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("UrlAnnotation(url="), this.f92266a, ')');
    }
}
