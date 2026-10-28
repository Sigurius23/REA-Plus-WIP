package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.PeerType;

/* JADX INFO: renamed from: v33.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C35625j extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final PeerType f151415a;

    public C35625j(PeerType peerType) {
        AbstractC22676k.m65750j(peerType, "peerType");
        this.f151415a = peerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35625j) && this.f151415a == ((C35625j) obj).f151415a;
    }

    public final int hashCode() {
        return this.f151415a.hashCode();
    }

    public final String toString() {
        return "ICERestartEvent(peerType=" + this.f151415a + ")";
    }
}
