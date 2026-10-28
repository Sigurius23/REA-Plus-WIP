package v33;

import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C35635t extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final ArrayList f151438a;

    public C35635t(ArrayList arrayList) {
        this.f151438a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35635t) && AbstractC22676k.m65745e(this.f151438a, ((C35635t) obj).f151438a);
    }

    public final int hashCode() {
        return this.f151438a.hashCode();
    }

    public final String toString() {
        return "PinsUpdatedEvent(pins=" + this.f151438a + ")";
    }
}
