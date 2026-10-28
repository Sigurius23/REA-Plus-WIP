package i53;

import n23.C26200c;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.WebsocketReconnectStrategy;

/* JADX INFO: renamed from: i53.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18141m extends AbstractC18147s {

    /* JADX INFO: renamed from: a */
    public final C26200c f70437a;

    /* JADX INFO: renamed from: b */
    public final WebsocketReconnectStrategy f70438b;

    public C18141m(C26200c error, WebsocketReconnectStrategy reconnectStrategy) {
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(reconnectStrategy, "reconnectStrategy");
        this.f70437a = error;
        this.f70438b = reconnectStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18141m)) {
            return false;
        }
        C18141m c18141m = (C18141m) obj;
        return AbstractC22676k.m65745e(this.f70437a, c18141m.f70437a) && this.f70438b == c18141m.f70438b;
    }

    public final int hashCode() {
        return this.f70438b.hashCode() + (this.f70437a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkError(error=" + this.f70437a + ", reconnectStrategy=" + this.f70438b + ")";
    }
}
