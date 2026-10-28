package v30;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C35599h implements InterfaceC35601j {

    /* JADX INFO: renamed from: a */
    public final C35604m f151372a;

    public C35599h(C35604m c35604m) {
        this.f151372a = c35604m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35599h) && AbstractC22676k.m65745e(this.f151372a, ((C35599h) obj).f151372a);
    }

    public final int hashCode() {
        return this.f151372a.hashCode();
    }

    public final String toString() {
        return "Completed(scannedCard=" + this.f151372a + ")";
    }
}
