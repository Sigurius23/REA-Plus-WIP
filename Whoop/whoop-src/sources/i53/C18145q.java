package i53;

import n23.C26200c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i53.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18145q extends AbstractC18147s {

    /* JADX INFO: renamed from: a */
    public final C26200c f70441a;

    public C18145q(C26200c error) {
        AbstractC22676k.m65750j(error, "error");
        this.f70441a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18145q) && AbstractC22676k.m65745e(this.f70441a, ((C18145q) obj).f70441a);
    }

    public final int hashCode() {
        return this.f70441a.hashCode();
    }

    public final String toString() {
        return "UnrecoverableError(error=" + this.f70441a + ")";
    }
}
