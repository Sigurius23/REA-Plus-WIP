package v33;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: v33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C35616b extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final int f151403a;

    public C35616b(int i13) {
        this.f151403a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35616b) && this.f151403a == ((C35616b) obj).f151403a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151403a);
    }

    public final String toString() {
        return AbstractC2875y.m8296i(this.f151403a, "CallEndedSfuEvent(reason=", ")");
    }
}
