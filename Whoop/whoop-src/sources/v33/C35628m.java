package v33;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: v33.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C35628m {

    /* JADX INFO: renamed from: a */
    public final String f151419a;

    /* JADX INFO: renamed from: b */
    public final String f151420b;

    /* JADX INFO: renamed from: c */
    public final TrackType f151421c;

    /* JADX INFO: renamed from: d */
    public final boolean f151422d;

    public C35628m(String userId, String sessionId, TrackType trackType, boolean z4) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(trackType, "trackType");
        this.f151419a = userId;
        this.f151420b = sessionId;
        this.f151421c = trackType;
        this.f151422d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35628m)) {
            return false;
        }
        C35628m c35628m = (C35628m) obj;
        return AbstractC22676k.m65745e(this.f151419a, c35628m.f151419a) && AbstractC22676k.m65745e(this.f151420b, c35628m.f151420b) && this.f151421c == c35628m.f151421c && this.f151422d == c35628m.f151422d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151422d) + ((this.f151421c.hashCode() + AbstractC11266d.m30450d(this.f151419a.hashCode() * 31, 31, this.f151420b)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("InboundStateNotificationEventState(userId=", this.f151419a, ", sessionId=", this.f151420b, ", trackType=");
        sbM32001t.append(this.f151421c);
        sbM32001t.append(", paused=");
        sbM32001t.append(this.f151422d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
