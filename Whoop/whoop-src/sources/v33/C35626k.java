package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.PeerType;

/* JADX INFO: renamed from: v33.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C35626k extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final String f151416a;

    /* JADX INFO: renamed from: b */
    public final PeerType f151417b;

    public C35626k(String candidate, PeerType peerType) {
        AbstractC22676k.m65750j(candidate, "candidate");
        AbstractC22676k.m65750j(peerType, "peerType");
        this.f151416a = candidate;
        this.f151417b = peerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35626k)) {
            return false;
        }
        C35626k c35626k = (C35626k) obj;
        return AbstractC22676k.m65745e(this.f151416a, c35626k.f151416a) && this.f151417b == c35626k.f151417b;
    }

    public final int hashCode() {
        return this.f151417b.hashCode() + (this.f151416a.hashCode() * 31);
    }

    public final String toString() {
        return "ICETrickleEvent(candidate=" + this.f151416a + ", peerType=" + this.f151417b + ")";
    }
}
