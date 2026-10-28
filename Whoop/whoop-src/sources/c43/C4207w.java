package c43;

import org.webrtc.VideoTrack;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C4207w extends AbstractC4191g {

    /* JADX INFO: renamed from: a */
    public final String f17066a;

    /* JADX INFO: renamed from: b */
    public final VideoTrack f17067b;

    public C4207w(String streamId, VideoTrack videoTrack) {
        AbstractC22676k.m65750j(streamId, "streamId");
        this.f17066a = streamId;
        this.f17067b = videoTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4207w)) {
            return false;
        }
        C4207w c4207w = (C4207w) obj;
        return AbstractC22676k.m65745e(this.f17066a, c4207w.f17066a) && AbstractC22676k.m65745e(this.f17067b, c4207w.f17067b);
    }

    public final int hashCode() {
        return this.f17067b.hashCode() + (this.f17066a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoTrack(streamId=" + this.f17066a + ", video=" + this.f17067b + ")";
    }
}
