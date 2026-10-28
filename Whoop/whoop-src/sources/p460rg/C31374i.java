package p460rg;

import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30054a;

/* JADX INFO: renamed from: rg.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C31374i extends AbstractC30054a {

    /* JADX INFO: renamed from: x */
    public static final C31367b f129037x = new C31367b();

    /* JADX INFO: renamed from: w */
    public final InterfaceC31373h f129038w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31374i(InterfaceC31373h traceSpan) {
        super(f129037x);
        AbstractC22676k.m65750j(traceSpan, "traceSpan");
        this.f129038w = traceSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31374i) && AbstractC22676k.m65745e(this.f129038w, ((C31374i) obj).f129038w);
    }

    public final int hashCode() {
        return this.f129038w.hashCode();
    }

    public final String toString() {
        return "TraceSpanContextElement(" + this.f129038w + ')';
    }
}
