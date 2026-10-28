package or2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.util.TrendKey;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AVERAGE_HR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: or2.h0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b+\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B;\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\b\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5¨\u00066"}, m65681d2 = {"Lor2/h0;", "", "", "trendName", "", "isSleep", "isStrain", "isRecovery", "isOther", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZZZ)V", "Lcom/whoop/util/TrendKey;", "toTrendKey", "()Lcom/whoop/util/TrendKey;", "Ljava/lang/String;", "getTrendName", "()Ljava/lang/String;", "Z", "()Z", "Companion", "a", "AVERAGE_HR", "BODY_COMPOSITION", "CALORIES", "DAY_STRAIN", "EXERCISE_PROGRESS", "EXERCISE_PROGRESS_BY_EXERCISE", "HOURS_V_NEED", "HOURS_V_NEEDED_PERCENT", "HRV", "HR_ZONES_1_3", "HR_ZONES_4_5", "HR_ZONES_ALL", "NONE", "PACE_OF_AGING", "RECOVERY", "RESPIRATORY_RATE", "RESTORATIVE_SLEEP", "RHR", "TIME_IN_BED", "SLEEP_PERFORMANCE", "STRESS", "RESTORATIVE_SLEEP_PERCENT", "SLEEP_CONSISTENCY", "SLEEP_DEBT_POST", "SLEEP_EFFICIENCY", "STEPS", "STRENGTH_ACTIVITY_TIME", "STRESS_DURING_NON_STRAIN", "STRESS_DURING_SLEEP", "TOTAL_VOLUME_LOAD", "VO2_MAX", "WEIGHT", "WHOOP_AGE", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC28166h0 {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC28166h0[] $VALUES;
    public static final EnumC28166h0 AVERAGE_HR;
    public static final EnumC28166h0 BODY_COMPOSITION;
    public static final EnumC28166h0 CALORIES;
    public static final EnumC28166h0 DAY_STRAIN;
    public static final EnumC28166h0 EXERCISE_PROGRESS;
    public static final EnumC28166h0 EXERCISE_PROGRESS_BY_EXERCISE;
    public static final EnumC28166h0 HOURS_V_NEED;
    public static final EnumC28166h0 HOURS_V_NEEDED_PERCENT;
    public static final EnumC28166h0 HRV;
    public static final EnumC28166h0 HR_ZONES_1_3;
    public static final EnumC28166h0 HR_ZONES_4_5;
    public static final EnumC28166h0 HR_ZONES_ALL;
    public static final EnumC28166h0 NONE;
    public static final EnumC28166h0 PACE_OF_AGING;
    public static final EnumC28166h0 RECOVERY;
    public static final EnumC28166h0 RESPIRATORY_RATE;
    public static final EnumC28166h0 RESTORATIVE_SLEEP;
    public static final EnumC28166h0 RESTORATIVE_SLEEP_PERCENT;
    public static final EnumC28166h0 RHR;
    public static final EnumC28166h0 SLEEP_CONSISTENCY;
    public static final EnumC28166h0 SLEEP_DEBT_POST;
    public static final EnumC28166h0 SLEEP_EFFICIENCY;
    public static final EnumC28166h0 SLEEP_PERFORMANCE;
    public static final EnumC28166h0 STEPS;
    public static final EnumC28166h0 STRENGTH_ACTIVITY_TIME;
    public static final EnumC28166h0 STRESS;
    public static final EnumC28166h0 STRESS_DURING_NON_STRAIN;
    public static final EnumC28166h0 STRESS_DURING_SLEEP;
    public static final EnumC28166h0 TIME_IN_BED;
    public static final EnumC28166h0 TOTAL_VOLUME_LOAD;
    public static final EnumC28166h0 VO2_MAX;
    public static final EnumC28166h0 WEIGHT;
    public static final EnumC28166h0 WHOOP_AGE;
    private final boolean isOther;
    private final boolean isRecovery;
    private final boolean isSleep;
    private final boolean isStrain;
    private final String trendName;

    /* JADX INFO: renamed from: or2.h0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113885a;

        static {
            int[] iArr = new int[EnumC28166h0.values().length];
            try {
                iArr[EnumC28166h0.AVERAGE_HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28166h0.BODY_COMPOSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC28166h0.CALORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC28166h0.DAY_STRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC28166h0.EXERCISE_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC28166h0.EXERCISE_PROGRESS_BY_EXERCISE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC28166h0.HRV.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC28166h0.HR_ZONES_1_3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC28166h0.HR_ZONES_4_5.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC28166h0.HR_ZONES_ALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC28166h0.PACE_OF_AGING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC28166h0.RECOVERY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC28166h0.RESPIRATORY_RATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC28166h0.RESTORATIVE_SLEEP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC28166h0.RHR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC28166h0.TIME_IN_BED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC28166h0.SLEEP_PERFORMANCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC28166h0.HOURS_V_NEED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC28166h0.HOURS_V_NEEDED_PERCENT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC28166h0.STRESS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC28166h0.RESTORATIVE_SLEEP_PERCENT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC28166h0.SLEEP_EFFICIENCY.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC28166h0.SLEEP_DEBT_POST.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC28166h0.SLEEP_CONSISTENCY.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC28166h0.STEPS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC28166h0.STRENGTH_ACTIVITY_TIME.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC28166h0.STRESS_DURING_NON_STRAIN.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC28166h0.STRESS_DURING_SLEEP.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC28166h0.TOTAL_VOLUME_LOAD.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC28166h0.VO2_MAX.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[EnumC28166h0.WEIGHT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[EnumC28166h0.WHOOP_AGE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f113885a = iArr;
        }
    }

    private static final /* synthetic */ EnumC28166h0[] $values() {
        return new EnumC28166h0[]{AVERAGE_HR, BODY_COMPOSITION, CALORIES, DAY_STRAIN, EXERCISE_PROGRESS, EXERCISE_PROGRESS_BY_EXERCISE, HOURS_V_NEED, HOURS_V_NEEDED_PERCENT, HRV, HR_ZONES_1_3, HR_ZONES_4_5, HR_ZONES_ALL, NONE, PACE_OF_AGING, RECOVERY, RESPIRATORY_RATE, RESTORATIVE_SLEEP, RHR, TIME_IN_BED, SLEEP_PERFORMANCE, STRESS, RESTORATIVE_SLEEP_PERCENT, SLEEP_CONSISTENCY, SLEEP_DEBT_POST, SLEEP_EFFICIENCY, STEPS, STRENGTH_ACTIVITY_TIME, STRESS_DURING_NON_STRAIN, STRESS_DURING_SLEEP, TOTAL_VOLUME_LOAD, VO2_MAX, WEIGHT, WHOOP_AGE};
    }

    static {
        boolean z4 = false;
        boolean z13 = false;
        AVERAGE_HR = new EnumC28166h0("AVERAGE_HR", 0, "Avg Heart Rate", false, true, z4, z13, 26, null);
        BODY_COMPOSITION = new EnumC28166h0("BODY_COMPOSITION", 1, "Body Composition", false, z4, z13, true, 14, null);
        boolean z14 = false;
        CALORIES = new EnumC28166h0("CALORIES", 2, "Calories", z4, true, false, z14, 26, null);
        boolean z15 = false;
        DAY_STRAIN = new EnumC28166h0("DAY_STRAIN", 3, "Day Strain", false, true, z14, z15, 26, null);
        boolean z16 = false;
        EXERCISE_PROGRESS = new EnumC28166h0("EXERCISE_PROGRESS", 4, "Exercise Progress", false, true, z15, z16, 26, null);
        boolean z17 = true;
        boolean z18 = false;
        EXERCISE_PROGRESS_BY_EXERCISE = new EnumC28166h0("EXERCISE_PROGRESS_BY_EXERCISE", 5, "Exercise Progress By Exercise", false, z17, z16, z18, 26, null);
        boolean z19 = false;
        HOURS_V_NEED = new EnumC28166h0("HOURS_V_NEED", 6, "Hours vs Need", z17, z16, z18, z19, 28, null);
        HOURS_V_NEEDED_PERCENT = new EnumC28166h0("HOURS_V_NEEDED_PERCENT", 7, "Hours vs Need Percent", true, z18, z19, false, 28, null);
        boolean z24 = true;
        boolean z25 = false;
        HRV = new EnumC28166h0("HRV", 8, "HRV", z18, z19, z24, z25, 22, null);
        boolean z26 = false;
        HR_ZONES_1_3 = new EnumC28166h0("HR_ZONES_1_3", 9, "HR Zones 1-3", z19, z24, z25, z26, 26, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        HR_ZONES_4_5 = new EnumC28166h0("HR_ZONES_4_5", 10, "HR Zones 4-5", false, true, z26, false, 26, defaultConstructorMarker);
        boolean z27 = false;
        boolean z28 = false;
        HR_ZONES_ALL = new EnumC28166h0("HR_ZONES_ALL", 11, "HR Zones All", false, true, z27, z28, 26, null);
        boolean z29 = false;
        NONE = new EnumC28166h0("NONE", 12, null, false, z27, z28, z29, 31, null);
        boolean z34 = true;
        PACE_OF_AGING = new EnumC28166h0("PACE_OF_AGING", 13, "Pace of Aging", z27, z28, z29, z34, 14, null);
        RECOVERY = new EnumC28166h0("RECOVERY", 14, "Recovery", z28, z29, z34, false, 22, null);
        boolean z35 = false;
        RESPIRATORY_RATE = new EnumC28166h0("RESPIRATORY_RATE", 15, "Respiratory Rate", z29, false, true, z35, 22, null);
        boolean z36 = false;
        RESTORATIVE_SLEEP = new EnumC28166h0("RESTORATIVE_SLEEP", 16, "Restorative Sleep", true, z36, z35, false, 28, null);
        boolean z37 = false;
        RHR = new EnumC28166h0("RHR", 17, "RHR", z36, z35, true, z37, 22, null);
        boolean z38 = false;
        TIME_IN_BED = new EnumC28166h0("TIME_IN_BED", 18, "Time in Bed", true, false, z37, z38, 28, null);
        boolean z39 = false;
        SLEEP_PERFORMANCE = new EnumC28166h0("SLEEP_PERFORMANCE", 19, "Sleep Performance", true, z37, z38, z39, 28, null);
        STRESS = new EnumC28166h0("STRESS", 20, "Stress", z37, z38, z39, true, 14, null);
        RESTORATIVE_SLEEP_PERCENT = new EnumC28166h0("RESTORATIVE_SLEEP_PERCENT", 21, "Restorative Percent", true, z39, false, false, 28, defaultConstructorMarker);
        boolean z44 = false;
        boolean z45 = false;
        SLEEP_CONSISTENCY = new EnumC28166h0("SLEEP_CONSISTENCY", 22, "Sleep Consistency", true, false, z44, z45, 28, null);
        boolean z46 = false;
        SLEEP_DEBT_POST = new EnumC28166h0("SLEEP_DEBT_POST", 23, "Sleep Debt", true, z44, z45, z46, 28, null);
        boolean z47 = false;
        SLEEP_EFFICIENCY = new EnumC28166h0("SLEEP_EFFICIENCY", 24, "Sleep Efficiency", true, z45, z46, z47, 28, null);
        boolean z48 = false;
        STEPS = new EnumC28166h0("STEPS", 25, "Steps", z45, true, z47, z48, 26, null);
        boolean z49 = false;
        STRENGTH_ACTIVITY_TIME = new EnumC28166h0("STRENGTH_ACTIVITY_TIME", 26, "Strength Activity Time", false, true, z48, z49, 26, null);
        STRESS_DURING_NON_STRAIN = new EnumC28166h0("STRESS_DURING_NON_STRAIN", 27, "Stress During Non Strain", false, z48, z49, true, 14, null);
        STRESS_DURING_SLEEP = new EnumC28166h0("STRESS_DURING_SLEEP", 28, "Stress During Sleep", z48, z49, false, true, 14, null);
        boolean z52 = false;
        TOTAL_VOLUME_LOAD = new EnumC28166h0("TOTAL_VOLUME_LOAD", 29, "Total Volume Load", z49, true, false, z52, 26, null);
        boolean z54 = false;
        VO2_MAX = new EnumC28166h0("VO2_MAX", 30, "VO2 Max", false, true, z52, z54, 26, null);
        WEIGHT = new EnumC28166h0("WEIGHT", 31, "Weight", false, z52, z54, true, 14, null);
        WHOOP_AGE = new EnumC28166h0("WHOOP_AGE", 32, "Whoop Age", z52, z54, false, true, 14, defaultConstructorMarker);
        EnumC28166h0[] enumC28166h0Arr$values = $values();
        $VALUES = enumC28166h0Arr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC28166h0Arr$values);
        INSTANCE = new Companion(null);
    }

    private EnumC28166h0(String str, int i13, String str2, boolean z4, boolean z13, boolean z14, boolean z15) {
        super(str, i13);
        this.trendName = str2;
        this.isSleep = z4;
        this.isStrain = z13;
        this.isRecovery = z14;
        this.isOther = z15;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC28166h0 valueOf(String str) {
        return (EnumC28166h0) Enum.valueOf(EnumC28166h0.class, str);
    }

    public static EnumC28166h0[] values() {
        return (EnumC28166h0[]) $VALUES.clone();
    }

    public final String getTrendName() {
        return this.trendName;
    }

    /* JADX INFO: renamed from: isOther, reason: from getter */
    public final boolean getIsOther() {
        return this.isOther;
    }

    /* JADX INFO: renamed from: isRecovery, reason: from getter */
    public final boolean getIsRecovery() {
        return this.isRecovery;
    }

    /* JADX INFO: renamed from: isSleep, reason: from getter */
    public final boolean getIsSleep() {
        return this.isSleep;
    }

    /* JADX INFO: renamed from: isStrain, reason: from getter */
    public final boolean getIsStrain() {
        return this.isStrain;
    }

    public final TrendKey toTrendKey() {
        switch (b.f113885a[ordinal()]) {
            case 1:
                return TrendKey.AVERAGE_HR;
            case 2:
                return TrendKey.BODY_COMPOSITION_FAT;
            case 3:
                return TrendKey.CALORIES;
            case 4:
                return TrendKey.DAY_STRAIN;
            case 5:
                return TrendKey.EXERCISE_PROGRESS;
            case 6:
                return TrendKey.EXERCISE_PROGRESS_BY_EXERCISE;
            case 7:
                return TrendKey.HRV;
            case 8:
                return TrendKey.HR_ZONES_1_3;
            case 9:
                return TrendKey.HR_ZONES_4_5;
            case 10:
                return TrendKey.HR_ZONES_ALL;
            case 11:
                return TrendKey.PACE_OF_AGING;
            case 12:
                return TrendKey.RECOVERY;
            case 13:
                return TrendKey.RESPIRATORY_RATE;
            case 14:
                return TrendKey.REM_SLEEP_DURATION;
            case 15:
                return TrendKey.RHR;
            case 16:
                return TrendKey.TIME_IN_BED;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return TrendKey.SLEEP_PERFORMANCE;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return TrendKey.SLEEP_HOURS;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return TrendKey.HOURS_V_NEEDED;
            case 20:
                return TrendKey.LOW_STRESS_DURATION;
            case 21:
                return TrendKey.RESTORATIVE_SLEEP_PERCENT;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return TrendKey.IN_SLEEP_EFFICIENCY;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TrendKey.SLEEP_NEED_FROM_SLEEP_DEBT_POST;
            case 24:
                return TrendKey.SLEEP_CONSISTENCY;
            case 25:
                return TrendKey.STEPS;
            case 26:
                return TrendKey.STRENGTH_TRAINING_TIME;
            case 27:
                return TrendKey.LOW_STRESS_NON_STRAIN_DURATION;
            case 28:
                return TrendKey.LOW_STRESS_SLEEP_DURATION;
            case 29:
                return TrendKey.TOTAL_VOLUME_LOAD;
            case 30:
                return TrendKey.VO2_MAX;
            case 31:
                return TrendKey.WEIGHT;
            case 32:
                return TrendKey.WHOOP_AGE;
            default:
                return TrendKey.NONE;
        }
    }

    public /* synthetic */ EnumC28166h0(String str, int i13, String str2, boolean z4, boolean z13, boolean z14, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? "" : str2, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? false : z13, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15);
    }
}
