package i53;

import n23.C26200c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i53.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18132d extends AbstractC18137i {

    /* JADX INFO: renamed from: a */
    public final C26200c f70428a;

    public C18132d(C26200c error) {
        AbstractC22676k.m65750j(error, "error");
        this.f70428a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18132d) && AbstractC22676k.m65745e(this.f70428a, ((C18132d) obj).f70428a);
    }

    public final int hashCode() {
        return this.f70428a.hashCode();
    }

    public final String toString() {
        return "DisconnectedPermanently(error=" + this.f70428a + ")";
    }
}
