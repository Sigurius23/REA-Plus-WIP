package v33;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C35634s {

    /* JADX INFO: renamed from: a */
    public final String f151436a;

    /* JADX INFO: renamed from: b */
    public final String f151437b;

    public C35634s(String userId, String sessionId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        this.f151436a = userId;
        this.f151437b = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35634s)) {
            return false;
        }
        C35634s c35634s = (C35634s) obj;
        return AbstractC22676k.m65745e(this.f151436a, c35634s.f151436a) && AbstractC22676k.m65745e(this.f151437b, c35634s.f151437b);
    }

    public final int hashCode() {
        return this.f151437b.hashCode() + (this.f151436a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("PinUpdate(userId=", this.f151436a, ", sessionId=", this.f151437b, ")");
    }
}
