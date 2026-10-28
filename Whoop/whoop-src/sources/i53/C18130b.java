package i53;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import x43.C37971c;

/* JADX INFO: renamed from: i53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18130b extends AbstractC18138j {

    /* JADX INFO: renamed from: a */
    public final C37971c f70425a;

    /* JADX INFO: renamed from: b */
    public final WebsocketReconnectStrategy f70426b;

    public C18130b(C37971c c37971c, WebsocketReconnectStrategy connectionType) {
        AbstractC22676k.m65750j(connectionType, "connectionType");
        this.f70425a = c37971c;
        this.f70426b = connectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18130b)) {
            return false;
        }
        C18130b c18130b = (C18130b) obj;
        return AbstractC22676k.m65745e(this.f70425a, c18130b.f70425a) && this.f70426b == c18130b.f70426b;
    }

    public final int hashCode() {
        return this.f70426b.hashCode() + (this.f70425a.hashCode() * 31);
    }

    public final String toString() {
        return "Connecting(connectionConf=" + this.f70425a + ", connectionType=" + this.f70426b + ")";
    }
}
