package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.CallGrants;

/* JADX INFO: renamed from: v33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C35618c extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final CallGrants f151405a;

    /* JADX INFO: renamed from: b */
    public final String f151406b;

    public C35618c(CallGrants callGrants, String message) {
        AbstractC22676k.m65750j(message, "message");
        this.f151405a = callGrants;
        this.f151406b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35618c)) {
            return false;
        }
        C35618c c35618c = (C35618c) obj;
        return AbstractC22676k.m65745e(this.f151405a, c35618c.f151405a) && AbstractC22676k.m65745e(this.f151406b, c35618c.f151406b);
    }

    public final int hashCode() {
        CallGrants callGrants = this.f151405a;
        return this.f151406b.hashCode() + ((callGrants == null ? 0 : callGrants.hashCode()) * 31);
    }

    public final String toString() {
        return "CallGrantsUpdatedEvent(current_grants=" + this.f151405a + ", message=" + this.f151406b + ")";
    }
}
