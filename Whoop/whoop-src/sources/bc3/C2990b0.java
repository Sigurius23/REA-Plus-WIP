package bc3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30054a;

/* JADX INFO: renamed from: bc3.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2990b0 extends AbstractC30054a {

    /* JADX INFO: renamed from: x */
    public static final C3023j1 f11996x = new C3023j1();

    /* JADX INFO: renamed from: w */
    public final String f11997w;

    public C2990b0(String str) {
        super(f11996x);
        this.f11997w = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2990b0) && AbstractC22676k.m65745e(this.f11997w, ((C2990b0) obj).f11997w);
    }

    public final int hashCode() {
        return this.f11997w.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("CoroutineName("), this.f11997w, ')');
    }
}
