package v33;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C35637v extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final C35630o f151440a;

    public C35637v(C35630o c35630o) {
        this.f151440a = c35630o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35637v) && AbstractC22676k.m65745e(this.f151440a, ((C35637v) obj).f151440a);
    }

    public final int hashCode() {
        return this.f151440a.hashCode();
    }

    public final String toString() {
        return "SFUHealthCheckEvent(participantCount=" + this.f151440a + ")";
    }
}
