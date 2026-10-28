package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.ZoneId;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Instant;
import p715kotlin.time.jdk8.InstantConversionsJDK8Kt;
import pc3.C29092n;
import pc3.C29094p;
import vc3.C35895n;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, m65681d2 = {"Lkotlinx/datetime/TimeZone;", "", "Ljava/time/ZoneId;", "zoneId", "<init>", "(Ljava/time/ZoneId;)V", "Lkotlin/time/Instant;", "Lkotlinx/datetime/LocalDateTime;", "toLocalDateTime", "(Lkotlin/time/Instant;)Lkotlinx/datetime/LocalDateTime;", "Lpc3/n;", "youShallNotPass", "toInstant", "(Lkotlinx/datetime/LocalDateTime;Lpc3/n;)Lkotlin/time/Instant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/ZoneId;", "getZoneId$kotlinx_datetime", "()Ljava/time/ZoneId;", "getId", "id", "Companion", "pc3/p", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35895n.class)
public class TimeZone {
    public static final C29094p Companion = new C29094p();
    private static final FixedOffsetTimeZone UTC;
    private final ZoneId zoneId;

    static {
        UtcOffset.Companion.getClass();
        UtcOffset utcOffset = UtcOffset.ZERO;
        ZoneId zoneIdOf = ZoneId.of("UTC");
        AbstractC22676k.m65749i(zoneIdOf, "of(...)");
        UTC = new FixedOffsetTimeZone(utcOffset, zoneIdOf);
    }

    public TimeZone(ZoneId zoneId) {
        AbstractC22676k.m65750j(zoneId, "zoneId");
        this.zoneId = zoneId;
    }

    public static /* synthetic */ Instant toInstant$default(TimeZone timeZone, LocalDateTime localDateTime, C29092n c29092n, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toInstant");
        }
        if ((i13 & 1) != 0) {
            c29092n = C29092n.f117686a;
        }
        return timeZone.toInstant(localDateTime, c29092n);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof TimeZone) && AbstractC22676k.m65745e(this.zoneId, ((TimeZone) other).zoneId);
        }
        return true;
    }

    public final String getId() {
        String id4 = this.zoneId.getId();
        AbstractC22676k.m65749i(id4, "getId(...)");
        return id4;
    }

    /* JADX INFO: renamed from: getZoneId$kotlinx_datetime, reason: from getter */
    public final ZoneId getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return this.zoneId.hashCode();
    }

    public final Instant toInstant(LocalDateTime localDateTime, C29092n youShallNotPass) {
        AbstractC22676k.m65750j(localDateTime, "<this>");
        AbstractC22676k.m65750j(youShallNotPass, "youShallNotPass");
        java.time.Instant instant = localDateTime.getValue().atZone(getZoneId()).toInstant();
        AbstractC22676k.m65749i(instant, "toInstant(...)");
        return InstantConversionsJDK8Kt.toKotlinInstant(instant);
    }

    public final LocalDateTime toLocalDateTime(Instant instant) {
        AbstractC22676k.m65750j(instant, "<this>");
        try {
            return new LocalDateTime(java.time.LocalDateTime.ofInstant(InstantConversionsJDK8Kt.toJavaInstant(instant), getZoneId()));
        } catch (DateTimeException e5) {
            throw new DateTimeArithmeticException(e5);
        }
    }

    public String toString() {
        String string = this.zoneId.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
