package p715kotlin.time;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0080\u0080\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0082\u0080\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082\u0080\u0004¢\u0006\u0004\b\u000e\u0010\b\u001a\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\u0080\u0004¢\u0006\u0002\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\u0080\u0004¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\u0080\u0004¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\u0080\u0004¢\u0006\u0002\u0010\u0014\u001a\u000e\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\u0088\u0004¨\u0006\u001d"}, m65681d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", AttachmentExtensionsKt.EXTRA_DURATION, "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", AnalyticsRequestV2.HEADER_ORIGIN, "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m134368checkInfiniteSumDefinedPjuGub4(long j7, long j13, long j14) {
        if (!Duration.m134287isInfiniteimpl(j13) || (j7 ^ j14) >= 0) {
            return j7;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j7) {
        return j7 < 0 ? Duration.INSTANCE.m134356getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m134354getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j7) {
        return ((j7 - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m134369saturatingAddNuflL3o(long j7, DurationUnit unit, long j13) {
        AbstractC22676k.m65750j(unit, "unit");
        long jM134301toLongimpl = Duration.m134301toLongimpl(j13, unit);
        if (((j7 - 1) | 1) == Long.MAX_VALUE) {
            return m134368checkInfiniteSumDefinedPjuGub4(j7, j13, jM134301toLongimpl);
        }
        if (((jM134301toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            return m134370saturatingAddInHalvesNuflL3o(j7, unit, j13);
        }
        long j14 = j7 + jM134301toLongimpl;
        if (((j7 ^ j14) & (jM134301toLongimpl ^ j14)) < 0) {
            return j7 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j14;
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m134370saturatingAddInHalvesNuflL3o(long j7, DurationUnit durationUnit, long j13) {
        long jM134265divUwyO8pc = Duration.m134265divUwyO8pc(j13, 2);
        long jM134301toLongimpl = Duration.m134301toLongimpl(jM134265divUwyO8pc, durationUnit);
        return (1 | (jM134301toLongimpl - 1)) == Long.MAX_VALUE ? jM134301toLongimpl : m134369saturatingAddNuflL3o(m134369saturatingAddNuflL3o(j7, durationUnit, jM134265divUwyO8pc), durationUnit, Duration.m134290minusLRDsOJo(j13, jM134265divUwyO8pc));
    }

    public static final long saturatingDiff(long j7, long j13, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        return (1 | (j13 - 1)) == Long.MAX_VALUE ? Duration.m134306unaryMinusUwyO8pc(infinityOfSign(j13)) : saturatingFiniteDiff(j7, j13, unit);
    }

    private static final long saturatingFiniteDiff(long j7, long j13, DurationUnit durationUnit) {
        long j14 = j7 - j13;
        if (((j14 ^ j7) & (~(j14 ^ j13))) >= 0) {
            return DurationKt.toDuration(j14, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m134306unaryMinusUwyO8pc(infinityOfSign(j14));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j15 = (j7 / jConvertDurationUnit) - (j13 / jConvertDurationUnit);
        long j16 = (j7 % jConvertDurationUnit) - (j13 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m134291plusLRDsOJo(DurationKt.toDuration(j15, durationUnit2), DurationKt.toDuration(j16, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j7, long j13, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        if (((j13 - 1) | 1) == Long.MAX_VALUE) {
            return j7 == j13 ? Duration.INSTANCE.m134357getZEROUwyO8pc() : Duration.m134306unaryMinusUwyO8pc(infinityOfSign(j13));
        }
        return (1 | (j7 - 1)) == Long.MAX_VALUE ? infinityOfSign(j7) : saturatingFiniteDiff(j7, j13, unit);
    }
}
