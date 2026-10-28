package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.event.ChangePublishOptions;

/* JADX INFO: renamed from: v33.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C35619d extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final ChangePublishOptions f151407a;

    public C35619d(ChangePublishOptions change) {
        AbstractC22676k.m65750j(change, "change");
        this.f151407a = change;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35619d) && AbstractC22676k.m65745e(this.f151407a, ((C35619d) obj).f151407a);
    }

    public final int hashCode() {
        return this.f151407a.hashCode();
    }

    public final String toString() {
        return "ChangePublishOptionsEvent(change=" + this.f151407a + ")";
    }
}
