package i53;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import x43.C37971c;

/* JADX INFO: renamed from: i53.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18139k extends AbstractC18147s {

    /* JADX INFO: renamed from: a */
    public final C37971c f70434a;

    /* JADX INFO: renamed from: b */
    public final WebsocketReconnectStrategy f70435b;

    public C18139k(C37971c c37971c, WebsocketReconnectStrategy connectionType) {
        AbstractC22676k.m65750j(connectionType, "connectionType");
        this.f70434a = c37971c;
        this.f70435b = connectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18139k)) {
            return false;
        }
        C18139k c18139k = (C18139k) obj;
        return AbstractC22676k.m65745e(this.f70434a, c18139k.f70434a) && this.f70435b == c18139k.f70435b;
    }

    public final int hashCode() {
        return this.f70435b.hashCode() + (this.f70434a.hashCode() * 31);
    }

    public final String toString() {
        return "Connect(connectionConf=" + this.f70434a + ", connectionType=" + this.f70435b + ")";
    }
}
