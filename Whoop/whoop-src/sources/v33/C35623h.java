package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.Error;
import stream.video.sfu.models.WebsocketReconnectStrategy;

/* JADX INFO: renamed from: v33.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C35623h extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final Error f151412a;

    /* JADX INFO: renamed from: b */
    public final WebsocketReconnectStrategy f151413b;

    public C35623h(Error error, WebsocketReconnectStrategy reconnectStrategy) {
        AbstractC22676k.m65750j(reconnectStrategy, "reconnectStrategy");
        this.f151412a = error;
        this.f151413b = reconnectStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35623h)) {
            return false;
        }
        C35623h c35623h = (C35623h) obj;
        return AbstractC22676k.m65745e(this.f151412a, c35623h.f151412a) && this.f151413b == c35623h.f151413b;
    }

    public final int hashCode() {
        Error error = this.f151412a;
        return this.f151413b.hashCode() + ((error == null ? 0 : error.hashCode()) * 31);
    }

    public final String toString() {
        return "ErrorEvent(error=" + this.f151412a + ", reconnectStrategy=" + this.f151413b + ")";
    }
}
