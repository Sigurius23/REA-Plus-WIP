package v33;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C35617b0 extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final Object f151404a;

    public C35617b0(Object obj) {
        this.f151404a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35617b0) && AbstractC22676k.m65745e(this.f151404a, ((C35617b0) obj).f151404a);
    }

    public final int hashCode() {
        Object obj = this.f151404a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return AbstractC18489d0.m53369j(this.f151404a, "UnknownEvent(event=", ")");
    }
}
