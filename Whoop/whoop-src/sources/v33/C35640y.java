package v33;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C35640y extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final String f151442a;

    public C35640y(String sdp) {
        AbstractC22676k.m65750j(sdp, "sdp");
        this.f151442a = sdp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35640y) && AbstractC22676k.m65745e(this.f151442a, ((C35640y) obj).f151442a);
    }

    public final int hashCode() {
        return this.f151442a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SubscriberOfferEvent(sdp=", this.f151442a, ")");
    }
}
