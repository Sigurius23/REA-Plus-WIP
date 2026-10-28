package d33;

import c43.AbstractC4191g;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: d33.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C11626s {

    /* JADX INFO: renamed from: a */
    public final String f37539a;

    /* JADX INFO: renamed from: b */
    public final TrackType f37540b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4191g f37541c;

    public C11626s(String sessionId, TrackType trackType, AbstractC4191g track) {
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(trackType, "trackType");
        AbstractC22676k.m65750j(track, "track");
        this.f37539a = sessionId;
        this.f37540b = trackType;
        this.f37541c = track;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11626s)) {
            return false;
        }
        C11626s c11626s = (C11626s) obj;
        return AbstractC22676k.m65745e(this.f37539a, c11626s.f37539a) && this.f37540b == c11626s.f37540b && AbstractC22676k.m65745e(this.f37541c, c11626s.f37541c);
    }

    public final int hashCode() {
        return this.f37541c.hashCode() + ((this.f37540b.hashCode() + (this.f37539a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OrphanedTrack(sessionId=" + this.f37539a + ", trackType=" + this.f37540b + ", track=" + this.f37541c + ")";
    }
}
