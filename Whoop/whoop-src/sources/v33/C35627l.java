package v33;

import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C35627l extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final ArrayList f151418a;

    public C35627l(ArrayList arrayList) {
        this.f151418a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35627l) && AbstractC22676k.m65745e(this.f151418a, ((C35627l) obj).f151418a);
    }

    public final int hashCode() {
        return this.f151418a.hashCode();
    }

    public final String toString() {
        return "InboundStateNotificationEvent(inboundVideoStates=" + this.f151418a + ")";
    }
}
