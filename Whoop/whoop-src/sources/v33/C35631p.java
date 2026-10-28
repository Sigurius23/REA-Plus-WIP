package v33;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.Participant;

/* JADX INFO: renamed from: v33.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C35631p extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final Participant f151430a;

    /* JADX INFO: renamed from: b */
    public final String f151431b;

    /* JADX INFO: renamed from: c */
    public final boolean f151432c;

    public C35631p(Participant participant, String callCid, boolean z4) {
        AbstractC22676k.m65750j(callCid, "callCid");
        this.f151430a = participant;
        this.f151431b = callCid;
        this.f151432c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35631p)) {
            return false;
        }
        C35631p c35631p = (C35631p) obj;
        return AbstractC22676k.m65745e(this.f151430a, c35631p.f151430a) && AbstractC22676k.m65745e(this.f151431b, c35631p.f151431b) && this.f151432c == c35631p.f151432c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151432c) + AbstractC11266d.m30450d(this.f151430a.hashCode() * 31, 31, this.f151431b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ParticipantJoinedEvent(participant=");
        sb4.append(this.f151430a);
        sb4.append(", callCid=");
        sb4.append(this.f151431b);
        sb4.append(", isPinned=");
        return AbstractC18489d0.m53372m(sb4, this.f151432c, ")");
    }
}
