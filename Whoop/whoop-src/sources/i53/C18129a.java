package i53;

import p715kotlin.jvm.internal.AbstractC22676k;
import v33.C35629n;

/* JADX INFO: renamed from: i53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18129a extends AbstractC18138j {

    /* JADX INFO: renamed from: a */
    public final C35629n f70424a;

    public C18129a(C35629n event) {
        AbstractC22676k.m65750j(event, "event");
        this.f70424a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18129a) && AbstractC22676k.m65745e(this.f70424a, ((C18129a) obj).f70424a);
    }

    public final int hashCode() {
        return this.f70424a.hashCode();
    }

    public final String toString() {
        return "Connected(event=" + this.f70424a + ")";
    }
}
