package g53;

import io.getstream.android.video.generated.models.ConnectedEvent;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g53.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C15510o extends AbstractC15519x {

    /* JADX INFO: renamed from: a */
    public final ConnectedEvent f58180a;

    public C15510o(ConnectedEvent connectedEvent) {
        AbstractC22676k.m65750j(connectedEvent, "connectedEvent");
        this.f58180a = connectedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15510o) && AbstractC22676k.m65745e(this.f58180a, ((C15510o) obj).f58180a);
    }

    public final int hashCode() {
        return this.f58180a.hashCode();
    }

    public final String toString() {
        return "ConnectionEstablished(connectedEvent=" + this.f58180a + ")";
    }
}
