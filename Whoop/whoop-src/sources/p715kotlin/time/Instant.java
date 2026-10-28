package p715kotlin.time;

import androidx.core.app.NotificationManagerCompat;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import l83.C23464j;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001-B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010%¨\u0006."}, m65681d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "epochSeconds", "", "nanosecondsOfSecond", "<init>", "(JI)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Ll83/a0;", "readObject", "(Ljava/io/ObjectInputStream;)V", "toEpochMilliseconds", "()J", "Lkotlin/time/Duration;", AttachmentExtensionsKt.EXTRA_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "plus", "minus-LRDsOJo", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "(Lkotlin/time/Instant;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getEpochSeconds", "I", "getNanosecondsOfSecond", "Companion", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class Instant implements Comparable<Instant>, Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Instant MIN = new Instant(-31557014167219200L, 0);
    private static final Instant MAX = new Instant(31556889864403199L, 999999999);

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005H\u0087\u0080\u0004J\u0012\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0080\u0004J\u001c\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0086\u0080\u0004J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0080\u0004J\u0012\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0080\u0004J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0080\u0004R\u0015\u0010\u0011\u001a\u00020\u00058FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0014\u001a\u00020\u00058FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0016\u001a\u00020\u0005X\u0080\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\u0018\u001a\u00020\u0005X\u0080\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, m65681d2 = {"Lkotlin/time/Instant$Companion;", "", "<init>", "()V", "now", "Lkotlin/time/Instant;", "fromEpochMilliseconds", "epochMilliseconds", "", "fromEpochSeconds", "epochSeconds", "nanosecondAdjustment", "", "parse", "input", "", "parseOrNull", "DISTANT_PAST", "getDISTANT_PAST", "()Lkotlin/time/Instant;", "DISTANT_FUTURE", "getDISTANT_FUTURE", "MIN", "getMIN$kotlin_stdlib", "MAX", "getMAX$kotlin_stdlib", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Instant fromEpochSeconds$default(Companion companion, long j7, long j13, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                j13 = 0;
            }
            return companion.fromEpochSeconds(j7, j13);
        }

        public final Instant fromEpochMilliseconds(long epochMilliseconds) {
            long j7 = epochMilliseconds / 1000;
            if ((epochMilliseconds ^ 1000) < 0 && j7 * 1000 != epochMilliseconds) {
                j7--;
            }
            long j13 = epochMilliseconds % 1000;
            int i13 = (int) ((j13 + (1000 & (((j13 ^ 1000) & ((-j13) | j13)) >> 63))) * ((long) DurationKt.NANOS_IN_MILLIS));
            if (j7 < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            return j7 > 31556889864403199L ? getMAX$kotlin_stdlib() : fromEpochSeconds(j7, i13);
        }

        public final Instant fromEpochSeconds(long epochSeconds, long nanosecondAdjustment) {
            long j7 = nanosecondAdjustment / 1000000000;
            if ((nanosecondAdjustment ^ 1000000000) < 0 && j7 * 1000000000 != nanosecondAdjustment) {
                j7--;
            }
            long j13 = epochSeconds + j7;
            if ((epochSeconds ^ j13) < 0 && (j7 ^ epochSeconds) >= 0) {
                return epochSeconds > 0 ? Instant.INSTANCE.getMAX$kotlin_stdlib() : Instant.INSTANCE.getMIN$kotlin_stdlib();
            }
            if (j13 < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            if (j13 > 31556889864403199L) {
                return getMAX$kotlin_stdlib();
            }
            long j14 = nanosecondAdjustment % 1000000000;
            return new Instant(j13, (int) (j14 + ((((j14 ^ 1000000000) & ((-j14) | j14)) >> 63) & 1000000000)));
        }

        public final Instant getDISTANT_FUTURE() {
            return fromEpochSeconds(3093527980800L, 0);
        }

        public final Instant getDISTANT_PAST() {
            return fromEpochSeconds(-3217862419201L, 999999999);
        }

        public final Instant getMAX$kotlin_stdlib() {
            return Instant.MAX;
        }

        public final Instant getMIN$kotlin_stdlib() {
            return Instant.MIN;
        }

        @InterfaceC23457c
        public final Instant now() {
            throw new C23464j();
        }

        public final Instant parse(CharSequence input) {
            AbstractC22676k.m65750j(input, "input");
            return InstantKt.parseIso(input).toInstant();
        }

        public final Instant parseOrNull(CharSequence input) {
            AbstractC22676k.m65750j(input, "input");
            return InstantKt.parseIso(input).toInstantOrNull();
        }

        private Companion() {
        }

        public final Instant fromEpochSeconds(long epochSeconds, int nanosecondAdjustment) {
            return fromEpochSeconds(epochSeconds, nanosecondAdjustment);
        }
    }

    public Instant(long j7, int i13) {
        this.epochSeconds = j7;
        this.nanosecondsOfSecond = i13;
        if (-31557014167219200L > j7 || j7 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return InstantJvmKt.serializedInstant(this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) other;
        return this.epochSeconds == instant.epochSeconds && this.nanosecondsOfSecond == instant.nanosecondsOfSecond;
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public int hashCode() {
        return (this.nanosecondsOfSecond * 51) + Long.hashCode(this.epochSeconds);
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m134365minusLRDsOJo(long duration) {
        return m134367plusLRDsOJo(Duration.m134306unaryMinusUwyO8pc(duration));
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m134366minusUwyO8pc(Instant other) {
        AbstractC22676k.m65750j(other, "other");
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m134291plusLRDsOJo(DurationKt.toDuration(this.epochSeconds - other.epochSeconds, DurationUnit.SECONDS), DurationKt.toDuration(this.nanosecondsOfSecond - other.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m134367plusLRDsOJo(long duration) {
        long jM134276getInWholeSecondsimpl = Duration.m134276getInWholeSecondsimpl(duration);
        int iM134278getNanosecondsComponentimpl = Duration.m134278getNanosecondsComponentimpl(duration);
        if (jM134276getInWholeSecondsimpl == 0 && iM134278getNanosecondsComponentimpl == 0) {
            return this;
        }
        long j7 = this.epochSeconds;
        long j13 = j7 + jM134276getInWholeSecondsimpl;
        if ((j7 ^ j13) >= 0 || (jM134276getInWholeSecondsimpl ^ j7) < 0) {
            return INSTANCE.fromEpochSeconds(j13, this.nanosecondsOfSecond + iM134278getNanosecondsComponentimpl);
        }
        return Duration.m134289isPositiveimpl(duration) ? MAX : MIN;
    }

    public final long toEpochMilliseconds() {
        long j7 = this.epochSeconds;
        long j13 = 1000;
        if (j7 >= 0) {
            if (j7 != 1) {
                if (j7 != 0) {
                    long j14 = j7 * 1000;
                    if (j14 / 1000 != j7) {
                        return Long.MAX_VALUE;
                    }
                    j13 = j14;
                } else {
                    j13 = 0;
                }
            }
            long j15 = this.nanosecondsOfSecond / DurationKt.NANOS_IN_MILLIS;
            long j16 = j13 + j15;
            if ((j13 ^ j16) >= 0 || (j15 ^ j13) < 0) {
                return j16;
            }
            return Long.MAX_VALUE;
        }
        long j17 = j7 + 1;
        if (j17 != 1) {
            if (j17 != 0) {
                long j18 = j17 * 1000;
                if (j18 / 1000 != j17) {
                    return Long.MIN_VALUE;
                }
                j13 = j18;
            } else {
                j13 = 0;
            }
        }
        long j19 = (this.nanosecondsOfSecond / DurationKt.NANOS_IN_MILLIS) + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        long j24 = j13 + j19;
        if ((j13 ^ j24) >= 0 || (j19 ^ j13) < 0) {
            return j24;
        }
        return Long.MIN_VALUE;
    }

    public String toString() {
        return InstantKt.formatIso(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant other) {
        AbstractC22676k.m65750j(other, "other");
        int iM65752l = AbstractC22676k.m65752l(this.epochSeconds, other.epochSeconds);
        return iM65752l != 0 ? iM65752l : AbstractC22676k.m65751k(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }
}
