package p715kotlin.time;

import java.util.concurrent.TimeUnit;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\u0080\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0087\u0080\u0004\u001a\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0081\u0080\u0004\u001a\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0081\u0080\u0004\u001a\"\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0081\u0080\u0004¨\u0006\u000b"}, m65681d2 = {"toTimeUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "toDurationUnit", "convertDurationUnit", "", "value", "sourceUnit", "targetUnit", "convertDurationUnitOverflow", "", "kotlin-stdlib"}, m65682k = 5, m65683mv = {2, 3, 0}, m65685xi = 49, m65686xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final double convertDurationUnit(double d3, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC22676k.m65750j(sourceUnit, "sourceUnit");
        AbstractC22676k.m65750j(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit().convert(1L, sourceUnit.getTimeUnit());
        return jConvert > 0 ? d3 * jConvert : d3 / sourceUnit.getTimeUnit().convert(1L, targetUnit.getTimeUnit());
    }

    public static final long convertDurationUnitOverflow(long j7, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC22676k.m65750j(sourceUnit, "sourceUnit");
        AbstractC22676k.m65750j(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j7, sourceUnit.getTimeUnit());
    }

    public static final DurationUnit toDurationUnit(TimeUnit timeUnit) {
        AbstractC22676k.m65750j(timeUnit, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return DurationUnit.NANOSECONDS;
            case 2:
                return DurationUnit.MICROSECONDS;
            case 3:
                return DurationUnit.MILLISECONDS;
            case 4:
                return DurationUnit.SECONDS;
            case 5:
                return DurationUnit.MINUTES;
            case 6:
                return DurationUnit.HOURS;
            case 7:
                return DurationUnit.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TimeUnit toTimeUnit(DurationUnit durationUnit) {
        AbstractC22676k.m65750j(durationUnit, "<this>");
        return durationUnit.getTimeUnit();
    }

    public static final long convertDurationUnit(long j7, DurationUnit sourceUnit, DurationUnit targetUnit) {
        AbstractC22676k.m65750j(sourceUnit, "sourceUnit");
        AbstractC22676k.m65750j(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j7, sourceUnit.getTimeUnit());
    }
}
