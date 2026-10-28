package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.event.ChangePublishQuality;

/* JADX INFO: renamed from: v33.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C35620e extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final ChangePublishQuality f151408a;

    public C35620e(ChangePublishQuality changePublishQuality) {
        AbstractC22676k.m65750j(changePublishQuality, "changePublishQuality");
        this.f151408a = changePublishQuality;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35620e) && AbstractC22676k.m65745e(this.f151408a, ((C35620e) obj).f151408a);
    }

    public final int hashCode() {
        return this.f151408a.hashCode();
    }

    public final String toString() {
        return "ChangePublishQualityEvent(changePublishQuality=" + this.f151408a + ")";
    }
}
