package v33;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.Participant;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: v33.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C35641z extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final String f151443a;

    /* JADX INFO: renamed from: b */
    public final String f151444b;

    /* JADX INFO: renamed from: c */
    public final TrackType f151445c;

    /* JADX INFO: renamed from: d */
    public final Participant f151446d;

    public C35641z(String userId, String sessionId, TrackType trackType, Participant participant) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(trackType, "trackType");
        this.f151443a = userId;
        this.f151444b = sessionId;
        this.f151445c = trackType;
        this.f151446d = participant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35641z)) {
            return false;
        }
        C35641z c35641z = (C35641z) obj;
        return AbstractC22676k.m65745e(this.f151443a, c35641z.f151443a) && AbstractC22676k.m65745e(this.f151444b, c35641z.f151444b) && this.f151445c == c35641z.f151445c && AbstractC22676k.m65745e(this.f151446d, c35641z.f151446d);
    }

    public final int hashCode() {
        int iHashCode = (this.f151445c.hashCode() + AbstractC11266d.m30450d(this.f151443a.hashCode() * 31, 31, this.f151444b)) * 31;
        Participant participant = this.f151446d;
        return iHashCode + (participant == null ? 0 : participant.hashCode());
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackPublishedEvent(userId=", this.f151443a, ", sessionId=", this.f151444b, ", trackType=");
        sbM32001t.append(this.f151445c);
        sbM32001t.append(", participant=");
        sbM32001t.append(this.f151446d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
