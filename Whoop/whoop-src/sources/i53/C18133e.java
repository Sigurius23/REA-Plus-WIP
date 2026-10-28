package i53;

import n23.C26200c;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.WebsocketReconnectStrategy;

/* JADX INFO: renamed from: i53.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18133e extends AbstractC18137i {

    /* JADX INFO: renamed from: a */
    public final C26200c f70429a;

    /* JADX INFO: renamed from: b */
    public final WebsocketReconnectStrategy f70430b;

    public C18133e(C26200c error, WebsocketReconnectStrategy reconnectStrategy) {
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(reconnectStrategy, "reconnectStrategy");
        this.f70429a = error;
        this.f70430b = reconnectStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18133e)) {
            return false;
        }
        C18133e c18133e = (C18133e) obj;
        return AbstractC22676k.m65745e(this.f70429a, c18133e.f70429a) && this.f70430b == c18133e.f70430b;
    }

    public final int hashCode() {
        return this.f70430b.hashCode() + (this.f70429a.hashCode() * 31);
    }

    public final String toString() {
        return "DisconnectedTemporarily(error=" + this.f70429a + ", reconnectStrategy=" + this.f70430b + ")";
    }
}
