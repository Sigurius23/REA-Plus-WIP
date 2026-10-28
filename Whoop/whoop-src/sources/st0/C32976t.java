package st0;

import java.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;

/* JADX INFO: renamed from: st0.t */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lst0/t;", "", "Lst0/q;", "state", "Lkotlin/time/Duration;", "certificateTimeRemaining", "Ljava/time/Instant;", "lastUpdatedAt", "<init>", "(Lst0/q;Lkotlin/time/Duration;Ljava/time/Instant;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lst0/q;Lkotlin/time/Duration;Ljava/time/Instant;)Lst0/t;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lst0/q;", "e", "()Lst0/q;", "b", "Lkotlin/time/Duration;", "c", "()Lkotlin/time/Duration;", "Ljava/time/Instant;", "d", "()Ljava/time/Instant;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32976t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC32973q state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Duration certificateTimeRemaining;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Instant lastUpdatedAt;

    public /* synthetic */ C32976t(EnumC32973q enumC32973q, Duration duration, Instant instant, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC32973q, duration, instant);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32976t m104082b(C32976t c32976t, EnumC32973q enumC32973q, Duration duration, Instant instant, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC32973q = c32976t.state;
        }
        if ((i13 & 2) != 0) {
            duration = c32976t.certificateTimeRemaining;
        }
        if ((i13 & 4) != 0) {
            instant = c32976t.lastUpdatedAt;
        }
        return c32976t.m104083a(enumC32973q, duration, instant);
    }

    /* JADX INFO: renamed from: a */
    public final C32976t m104083a(EnumC32973q state, Duration certificateTimeRemaining, Instant lastUpdatedAt) {
        AbstractC22676k.m65750j(lastUpdatedAt, "lastUpdatedAt");
        return new C32976t(state, certificateTimeRemaining, lastUpdatedAt, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Duration getCertificateTimeRemaining() {
        return this.certificateTimeRemaining;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC32973q getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32976t)) {
            return false;
        }
        C32976t c32976t = (C32976t) other;
        return this.state == c32976t.state && AbstractC22676k.m65745e(this.certificateTimeRemaining, c32976t.certificateTimeRemaining) && AbstractC22676k.m65745e(this.lastUpdatedAt, c32976t.lastUpdatedAt);
    }

    public int hashCode() {
        EnumC32973q enumC32973q = this.state;
        int iHashCode = (enumC32973q == null ? 0 : enumC32973q.hashCode()) * 31;
        Duration duration = this.certificateTimeRemaining;
        return this.lastUpdatedAt.hashCode() + ((iHashCode + (duration != null ? Duration.m134283hashCodeimpl(duration.getRawValue()) : 0)) * 31);
    }

    public String toString() {
        return "StrapLockStatus(state=" + this.state + ", certificateTimeRemaining=" + this.certificateTimeRemaining + ", lastUpdatedAt=" + this.lastUpdatedAt + ")";
    }

    private C32976t(EnumC32973q enumC32973q, Duration duration, Instant lastUpdatedAt) {
        AbstractC22676k.m65750j(lastUpdatedAt, "lastUpdatedAt");
        this.state = enumC32973q;
        this.certificateTimeRemaining = duration;
        this.lastUpdatedAt = lastUpdatedAt;
    }
}
