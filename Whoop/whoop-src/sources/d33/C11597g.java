package d33;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d33.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C11597g extends AbstractC11603i {

    /* JADX INFO: renamed from: a */
    public final Exception f37408a;

    public C11597g(Exception exc) {
        this.f37408a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11597g) && AbstractC22676k.m65745e(this.f37408a, ((C11597g) obj).f37408a);
    }

    public final int hashCode() {
        return this.f37408a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.f37408a + ")";
    }
}
