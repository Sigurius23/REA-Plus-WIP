package p167g5;

import java.util.Objects;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: g5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C15483b {

    /* JADX INFO: renamed from: a */
    public final Object f58138a;

    /* JADX INFO: renamed from: b */
    public final Object f58139b;

    public C15483b(Object obj, Object obj2) {
        this.f58138a = obj;
        this.f58139b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15483b)) {
            return false;
        }
        C15483b c15483b = (C15483b) obj;
        return Objects.equals(c15483b.f58138a, this.f58138a) && Objects.equals(c15483b.f58139b, this.f58139b);
    }

    public final int hashCode() {
        Object obj = this.f58138a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f58139b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Pair{");
        sb4.append(this.f58138a);
        sb4.append(" ");
        return AbstractC2875y.m8303p(sb4, "}", this.f58139b);
    }
}
