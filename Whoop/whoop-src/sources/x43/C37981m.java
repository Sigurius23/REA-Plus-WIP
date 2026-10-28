package x43;

import n23.AbstractC26202e;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.WebsocketReconnectStrategy;

/* JADX INFO: renamed from: x43.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C37981m extends AbstractC37984p {

    /* JADX INFO: renamed from: a */
    public final AbstractC26202e f162639a;

    /* JADX INFO: renamed from: b */
    public final WebsocketReconnectStrategy f162640b;

    public C37981m(AbstractC26202e streamError, WebsocketReconnectStrategy websocketReconnectStrategy) {
        AbstractC22676k.m65750j(streamError, "streamError");
        this.f162639a = streamError;
        this.f162640b = websocketReconnectStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37981m)) {
            return false;
        }
        C37981m c37981m = (C37981m) obj;
        return AbstractC22676k.m65745e(this.f162639a, c37981m.f162639a) && this.f162640b == c37981m.f162640b;
    }

    public final int hashCode() {
        int iHashCode = this.f162639a.hashCode() * 31;
        WebsocketReconnectStrategy websocketReconnectStrategy = this.f162640b;
        return iHashCode + (websocketReconnectStrategy == null ? 0 : websocketReconnectStrategy.hashCode());
    }

    public final String toString() {
        return "Error(streamError=" + this.f162639a + ", reconnectStrategy=" + this.f162640b + ")";
    }
}
