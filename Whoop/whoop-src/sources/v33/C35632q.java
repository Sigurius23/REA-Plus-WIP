package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.Participant;

/* JADX INFO: renamed from: v33.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C35632q extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final Participant f151433a;

    /* JADX INFO: renamed from: b */
    public final String f151434b;

    public C35632q(Participant participant, String callCid) {
        AbstractC22676k.m65750j(callCid, "callCid");
        this.f151433a = participant;
        this.f151434b = callCid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35632q)) {
            return false;
        }
        C35632q c35632q = (C35632q) obj;
        return AbstractC22676k.m65745e(this.f151433a, c35632q.f151433a) && AbstractC22676k.m65745e(this.f151434b, c35632q.f151434b);
    }

    public final int hashCode() {
        return this.f151434b.hashCode() + (this.f151433a.hashCode() * 31);
    }

    public final String toString() {
        return "ParticipantLeftEvent(participant=" + this.f151433a + ", callCid=" + this.f151434b + ")";
    }
}
