package aa3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C0653t extends AbstractC0638m0 {

    /* JADX INFO: renamed from: a */
    public final C0651s f2282a;

    public C0653t(C0651s c0651s) {
        this.f2282a = c0651s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0653t) && AbstractC22676k.m65745e(this.f2282a, ((C0653t) obj).f2282a);
    }

    public final int hashCode() {
        return this.f2282a.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.f2282a + ')';
    }
}
