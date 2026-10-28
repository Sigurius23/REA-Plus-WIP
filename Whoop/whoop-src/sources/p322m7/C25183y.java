package p322m7;

import java.time.Instant;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C25183y {

    /* JADX INFO: renamed from: a */
    public final Instant f98811a;

    /* JADX INFO: renamed from: b */
    public final long f98812b;

    public C25183y(long j7, Instant instant) {
        this.f98811a = instant;
        this.f98812b = j7;
        AbstractC32073e.m99736b0(Long.valueOf(j7), 1L, "beatsPerMinute");
        AbstractC32073e.m99738c0(Long.valueOf(j7), 300L, "beatsPerMinute");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25183y)) {
            return false;
        }
        C25183y c25183y = (C25183y) obj;
        return AbstractC22676k.m65745e(this.f98811a, c25183y.f98811a) && this.f98812b == c25183y.f98812b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f98812b) + (this.f98811a.hashCode() * 31);
    }
}
