package p313lz;

import kz.AbstractC22911h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C24807d extends AbstractC24810g {

    /* JADX INFO: renamed from: a */
    public final AbstractC22911h f97126a;

    public C24807d(AbstractC22911h abstractC22911h) {
        this.f97126a = abstractC22911h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24807d) && AbstractC22676k.m65745e(this.f97126a, ((C24807d) obj).f97126a);
    }

    public final int hashCode() {
        return this.f97126a.hashCode();
    }

    public final String toString() {
        return "FinishWithResult(result=" + this.f97126a + ")";
    }
}
