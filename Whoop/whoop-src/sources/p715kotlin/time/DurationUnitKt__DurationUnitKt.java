package p715kotlin.time;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\u0080\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0082\u0080\u0004¢\u0006\u0002\b\u0007\u001a\u000e\u0010\u000b\u001a\u00020\f*\u00020\u0004H\u0081\u0080\u0004\"\u0019\u0010\b\u001a\u00020\u0001*\u00020\u00048BX\u0082\u0084\b¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m65681d2 = {"convertDurationUnitToMilliseconds", "", "value", "unit", "Lkotlin/time/DurationUnit;", "multiplyNonNegativeWithoutOverflow", "other", "multiplyNonNegativeWithoutOverflow$DurationUnitKt__DurationUnitKt", "millisMultiplier", "getMillisMultiplier$DurationUnitKt__DurationUnitKt", "(Lkotlin/time/DurationUnit;)J", "shortName", "", "kotlin-stdlib"}, m65682k = 5, m65683mv = {2, 3, 0}, m65685xi = 49, m65686xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long convertDurationUnitToMilliseconds(long j7, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        return m65793x8de0e79a(j7, getMillisMultiplier$DurationUnitKt__DurationUnitKt(unit));
    }

    private static final long getMillisMultiplier$DurationUnitKt__DurationUnitKt(DurationUnit durationUnit) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()];
        if (i13 == 1) {
            return DurationKt.MILLIS_IN_DAY;
        }
        if (i13 == 2) {
            return 3600000L;
        }
        if (i13 == 3) {
            return 60000L;
        }
        if (i13 == 4) {
            return 1000L;
        }
        if (i13 == 5) {
            return 1L;
        }
        throw new IllegalStateException(("Wrong unit for millisMultiplier: " + durationUnit).toString());
    }

    /* JADX INFO: renamed from: multiplyNonNegativeWithoutOverflow$DurationUnitKt__DurationUnitKt */
    private static final long m65793x8de0e79a(long j7, long j13) {
        if (j7 == 0) {
            return 0L;
        }
        if (j7 == 1) {
            return j13 > DurationKt.MAX_MILLIS ? DurationKt.MAX_MILLIS : j13;
        }
        if (j13 == 1) {
            return j7 > DurationKt.MAX_MILLIS ? DurationKt.MAX_MILLIS : j7;
        }
        int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j7)) - Long.numberOfLeadingZeros(j13);
        if (iNumberOfLeadingZeros < 63) {
            return j7 * j13;
        }
        if (iNumberOfLeadingZeros > 63) {
            return DurationKt.MAX_MILLIS;
        }
        long j14 = j7 * j13;
        return j14 > DurationKt.MAX_MILLIS ? DurationKt.MAX_MILLIS : j14;
    }

    public static final String shortName(DurationUnit durationUnit) {
        AbstractC22676k.m65750j(durationUnit, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return "d";
            case 2:
                return StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT;
            case 3:
                return "m";
            case 4:
                return "s";
            case 5:
                return "ms";
            case 6:
                return "ns";
            case 7:
                return "us";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }
}
