package v33;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C35622g extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final String f151410a;

    /* JADX INFO: renamed from: b */
    public final String f151411b;

    public C35622g(String userId, String sessionId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        this.f151410a = userId;
        this.f151411b = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35622g)) {
            return false;
        }
        C35622g c35622g = (C35622g) obj;
        return AbstractC22676k.m65745e(this.f151410a, c35622g.f151410a) && AbstractC22676k.m65745e(this.f151411b, c35622g.f151411b);
    }

    public final int hashCode() {
        return this.f151411b.hashCode() + (this.f151410a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("DominantSpeakerChangedEvent(userId=", this.f151410a, ", sessionId=", this.f151411b, ")");
    }
}
