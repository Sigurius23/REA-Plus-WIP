package v33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.GoAwayReason;

/* JADX INFO: renamed from: v33.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C35624i extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final GoAwayReason f151414a;

    public C35624i(GoAwayReason reason) {
        AbstractC22676k.m65750j(reason, "reason");
        this.f151414a = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35624i) && this.f151414a == ((C35624i) obj).f151414a;
    }

    public final int hashCode() {
        return this.f151414a.hashCode();
    }

    public final String toString() {
        return "GoAwayEvent(reason=" + this.f151414a + ")";
    }
}
