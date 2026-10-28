package i53;

import p715kotlin.jvm.internal.AbstractC22676k;
import v33.C35629n;

/* JADX INFO: renamed from: i53.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18140l extends AbstractC18147s {

    /* JADX INFO: renamed from: a */
    public final C35629n f70436a;

    public C18140l(C35629n connectedEvent) {
        AbstractC22676k.m65750j(connectedEvent, "connectedEvent");
        this.f70436a = connectedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18140l) && AbstractC22676k.m65745e(this.f70436a, ((C18140l) obj).f70436a);
    }

    public final int hashCode() {
        return this.f70436a.hashCode();
    }

    public final String toString() {
        return "ConnectionEstablished(connectedEvent=" + this.f70436a + ")";
    }
}
