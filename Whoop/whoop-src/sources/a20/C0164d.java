package a20;

import p715kotlin.jvm.internal.AbstractC22676k;
import z10.AbstractC39995r;

/* JADX INFO: renamed from: a20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C0164d extends AbstractC0166f {

    /* JADX INFO: renamed from: a */
    public final AbstractC39995r f491a;

    public C0164d(AbstractC39995r result) {
        AbstractC22676k.m65750j(result, "result");
        this.f491a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0164d) && AbstractC22676k.m65745e(this.f491a, ((C0164d) obj).f491a);
    }

    public final int hashCode() {
        return this.f491a.hashCode();
    }

    public final String toString() {
        return "FinishWithResult(result=" + this.f491a + ")";
    }
}
