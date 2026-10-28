package v33;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.Participant;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: v33.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C35615a0 extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final String f151399a;

    /* JADX INFO: renamed from: b */
    public final String f151400b;

    /* JADX INFO: renamed from: c */
    public final TrackType f151401c;

    /* JADX INFO: renamed from: d */
    public final Participant f151402d;

    public C35615a0(String userId, String sessionId, TrackType trackType, Participant participant) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(trackType, "trackType");
        this.f151399a = userId;
        this.f151400b = sessionId;
        this.f151401c = trackType;
        this.f151402d = participant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35615a0)) {
            return false;
        }
        C35615a0 c35615a0 = (C35615a0) obj;
        return AbstractC22676k.m65745e(this.f151399a, c35615a0.f151399a) && AbstractC22676k.m65745e(this.f151400b, c35615a0.f151400b) && this.f151401c == c35615a0.f151401c && AbstractC22676k.m65745e(this.f151402d, c35615a0.f151402d);
    }

    public final int hashCode() {
        int iHashCode = (this.f151401c.hashCode() + AbstractC11266d.m30450d(this.f151399a.hashCode() * 31, 31, this.f151400b)) * 31;
        Participant participant = this.f151402d;
        return iHashCode + (participant == null ? 0 : participant.hashCode());
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackUnpublishedEvent(userId=", this.f151399a, ", sessionId=", this.f151400b, ", trackType=");
        sbM32001t.append(this.f151401c);
        sbM32001t.append(", participant=");
        sbM32001t.append(this.f151402d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
