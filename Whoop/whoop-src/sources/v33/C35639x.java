package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.event.SfuRequest;

/* JADX INFO: renamed from: v33.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C35639x extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final SfuRequest f151441a;

    public C35639x(SfuRequest sfuRequest) {
        this.f151441a = sfuRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35639x) && AbstractC22676k.m65745e(this.f151441a, ((C35639x) obj).f151441a);
    }

    @Override // v33.AbstractC35638w, io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public final String getType() {
        return "SfuDataRequest";
    }

    public final int hashCode() {
        return this.f151441a.hashCode();
    }

    public final String toString() {
        return "SfuDataRequest(sfuRequest=" + this.f151441a + ")";
    }
}
