package w23;

import org.webrtc.PeerConnection;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w23.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C36761s {

    /* JADX INFO: renamed from: a */
    public final int f157323a;

    /* JADX INFO: renamed from: b */
    public final PeerConnection.PeerConnectionState f157324b;

    /* JADX INFO: renamed from: c */
    public final EnumC36762t f157325c;

    public C36761s(int i13, PeerConnection.PeerConnectionState peerConnectionState, EnumC36762t enumC36762t) {
        AbstractC22676k.m65750j(peerConnectionState, "peerConnectionState");
        this.f157323a = i13;
        this.f157324b = peerConnectionState;
        this.f157325c = enumC36762t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36761s)) {
            return false;
        }
        C36761s c36761s = (C36761s) obj;
        return this.f157323a == c36761s.f157323a && this.f157324b == c36761s.f157324b && this.f157325c == c36761s.f157325c;
    }

    public final int hashCode() {
        return this.f157325c.hashCode() + ((this.f157324b.hashCode() + (Integer.hashCode(this.f157323a) * 31)) * 31);
    }

    public final String toString() {
        return "PeerConnectionSnapshot(peerConnectionHashCode=" + this.f157323a + ", peerConnectionState=" + this.f157324b + ", iceState=" + this.f157325c + ")";
    }
}
