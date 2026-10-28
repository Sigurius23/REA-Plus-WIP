package com.whoop.util;

import androidx.health.platform.client.proto.C1533u;
import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ma1.C25371a;
import or2.EnumC28166h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AROUSAL_TIME' uses external variables
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
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bH\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B1\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQ¨\u0006R"}, m65681d2 = {"Lcom/whoop/util/TrendKey;", "", "", "trendName", "", "isSleep", "isStrain", "isRecovery", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZZ)V", "Lor2/h0;", "toGraphKey", "()Lor2/h0;", "Ljava/lang/String;", "getTrendName", "()Ljava/lang/String;", "Z", "()Z", "Companion", "a", "AROUSAL_TIME", "AVERAGE_HR", "BASELINE_SLEEP_NEED", "BODY_COMPOSITION_FAT", "BODY_COMPOSITION_LEAN", "CALORIES", "DAY_KILOJOULES", "DAY_STRAIN", "DISTURBANCES", "EXERCISE_PROGRESS", "EXERCISE_PROGRESS_BY_EXERCISE", "EXERCISE_PROGRESS_BY_EXERCISE_REPS", "EXERCISE_PROGRESS_BY_EXERCISE_TIME", "HIGH_STRESS_DURATION", "HIGH_STRESS_NON_STRAIN_DURATION", "HIGH_STRESS_SLEEP_DURATION", "HOURS_V_NEEDED", "HRV", "HR_ZONES_1_3", "HR_ZONES_4_5", "HR_ZONES_ALL", "IN_SLEEP_EFFICIENCY", "LIGHT_SLEEP_DURATION", "LOW_STRESS_DURATION", "LOW_STRESS_NON_STRAIN_DURATION", "LOW_STRESS_SLEEP_DURATION", "MAX_HR", "MEDIUM_STRESS_DURATION", "MEDIUM_STRESS_NON_STRAIN_DURATION", "MEDIUM_STRESS_SLEEP_DURATION", "MENSTRUAL_CYCLE_INSIGHTS", "NO_SLEEP_DATA_DURATION", "NONE", "PACE_OF_AGING", "PREGNANCY_WEEK", "RECOVERY", "REM_SLEEP_DURATION", "RESPIRATORY_RATE", "RESTORATIVE_SLEEP_PERCENT", "RHR", "SAGE", "SCALED_DAY_STRAIN", "SKIN_TEMP_CELSIUS", "SLEEP_CONSISTENCY", "SLEEP_HOURS", "SLEEP_LATENCY", "SLEEP_NEED", "SLEEP_NEED_FROM_RECENT_NAPS", "SLEEP_NEED_FROM_SLEEP_DEBT", "SLEEP_NEED_FROM_SLEEP_DEBT_POST", "SLEEP_NEED_FROM_STRAIN", "SLEEP_PERFORMANCE", "SLOW_WAVE_SLEEP_DURATION", "SPO2", "STEPS", "STRENGTH_TRAINING_TIME", "TIME_IN_BED", "TOTAL_VOLUME_LOAD", "VO2_MAX", "WAKE_DURATION", "WEIGHT", "WHOOP_AGE", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class TrendKey {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ TrendKey[] $VALUES;
    private static final InterfaceC23462h $cachedSerializer$delegate;
    public static final TrendKey AROUSAL_TIME;
    public static final TrendKey AVERAGE_HR;
    public static final TrendKey BASELINE_SLEEP_NEED;
    public static final TrendKey BODY_COMPOSITION_FAT;
    public static final TrendKey BODY_COMPOSITION_LEAN;
    public static final TrendKey CALORIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TrendKey DAY_STRAIN;
    public static final TrendKey DISTURBANCES;
    public static final TrendKey EXERCISE_PROGRESS;
    public static final TrendKey EXERCISE_PROGRESS_BY_EXERCISE_TIME;
    public static final TrendKey HIGH_STRESS_DURATION;
    public static final TrendKey HIGH_STRESS_NON_STRAIN_DURATION;
    public static final TrendKey HIGH_STRESS_SLEEP_DURATION;
    public static final TrendKey HOURS_V_NEEDED;
    public static final TrendKey HRV;
    public static final TrendKey HR_ZONES_1_3;
    public static final TrendKey HR_ZONES_4_5;
    public static final TrendKey HR_ZONES_ALL;
    public static final TrendKey IN_SLEEP_EFFICIENCY;
    public static final TrendKey LIGHT_SLEEP_DURATION;
    public static final TrendKey LOW_STRESS_DURATION;
    public static final TrendKey LOW_STRESS_NON_STRAIN_DURATION;
    public static final TrendKey LOW_STRESS_SLEEP_DURATION;
    public static final TrendKey MAX_HR;
    public static final TrendKey MEDIUM_STRESS_DURATION;
    public static final TrendKey MEDIUM_STRESS_NON_STRAIN_DURATION;
    public static final TrendKey MEDIUM_STRESS_SLEEP_DURATION;
    public static final TrendKey MENSTRUAL_CYCLE_INSIGHTS;
    public static final TrendKey NONE;
    public static final TrendKey NO_SLEEP_DATA_DURATION;
    public static final TrendKey PACE_OF_AGING;
    public static final TrendKey PREGNANCY_WEEK;
    public static final TrendKey RECOVERY;
    public static final TrendKey REM_SLEEP_DURATION;
    public static final TrendKey RESPIRATORY_RATE;
    public static final TrendKey RESTORATIVE_SLEEP_PERCENT;
    public static final TrendKey RHR;
    public static final TrendKey SAGE;
    public static final TrendKey SCALED_DAY_STRAIN;
    public static final TrendKey SKIN_TEMP_CELSIUS;
    public static final TrendKey SLEEP_CONSISTENCY;
    public static final TrendKey SLEEP_HOURS;
    public static final TrendKey SLEEP_LATENCY;
    public static final TrendKey SLEEP_NEED;
    public static final TrendKey SLEEP_NEED_FROM_RECENT_NAPS;
    public static final TrendKey SLEEP_NEED_FROM_SLEEP_DEBT;
    public static final TrendKey SLEEP_NEED_FROM_SLEEP_DEBT_POST;
    public static final TrendKey SLEEP_NEED_FROM_STRAIN;
    public static final TrendKey SLEEP_PERFORMANCE;
    public static final TrendKey SLOW_WAVE_SLEEP_DURATION;
    public static final TrendKey SPO2;
    public static final TrendKey STEPS;
    public static final TrendKey STRENGTH_TRAINING_TIME;
    public static final TrendKey TIME_IN_BED;
    public static final TrendKey TOTAL_VOLUME_LOAD;
    public static final TrendKey VO2_MAX;
    public static final TrendKey WAKE_DURATION;
    public static final TrendKey WEIGHT;
    public static final TrendKey WHOOP_AGE;
    private final boolean isRecovery;
    private final boolean isSleep;
    private final boolean isStrain;
    private final String trendName;
    public static final TrendKey DAY_KILOJOULES = new TrendKey("DAY_KILOJOULES", 6, null, false, true, false, 11, null);
    public static final TrendKey EXERCISE_PROGRESS_BY_EXERCISE = new TrendKey("EXERCISE_PROGRESS_BY_EXERCISE", 10, "Exercise Progress By Exercise", false, true, false, 10, null);
    public static final TrendKey EXERCISE_PROGRESS_BY_EXERCISE_REPS = new TrendKey("EXERCISE_PROGRESS_BY_EXERCISE_REPS", 11, "Exercise Progress By Exercise Reps", false, true, false, 10, null);

    /* JADX INFO: renamed from: com.whoop.util.TrendKey$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/util/TrendKey$a;", "", "<init>", "()V", "", "type", "Lcom/whoop/util/TrendKey;", "a", "(Ljava/lang/String;)Lcom/whoop/util/TrendKey;", "trendName", "b", "Lwc3/c;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        private final /* synthetic */ InterfaceC37138c m27812c() {
            return (InterfaceC37138c) TrendKey.$cachedSerializer$delegate.getValue();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final TrendKey m27813a(String type) {
            for (TrendKey trendKey : TrendKey.values()) {
                if (AbstractC22676k.m65745e(trendKey.name(), type)) {
                    if (trendKey == null) {
                        return TrendKey.NONE;
                    }
                    return trendKey;
                }
            }
            trendKey = null;
            if (trendKey == null) {
                return TrendKey.NONE;
            }
            return trendKey;
        }

        /* JADX INFO: renamed from: b */
        public final TrendKey m27814b(String trendName) {
            for (TrendKey trendKey : TrendKey.values()) {
                if (AbstractC22676k.m65745e(trendKey.getTrendName(), trendName)) {
                    return trendKey;
                }
            }
            return null;
        }

        public final InterfaceC37138c serializer() {
            return m27812c();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.util.TrendKey$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10699b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32634a;

        static {
            int[] iArr = new int[TrendKey.values().length];
            try {
                iArr[TrendKey.AVERAGE_HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrendKey.BODY_COMPOSITION_FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrendKey.BODY_COMPOSITION_LEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrendKey.CALORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrendKey.DAY_STRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TrendKey.EXERCISE_PROGRESS_BY_EXERCISE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TrendKey.EXERCISE_PROGRESS_BY_EXERCISE_REPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TrendKey.EXERCISE_PROGRESS_BY_EXERCISE_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TrendKey.HIGH_STRESS_DURATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TrendKey.HIGH_STRESS_NON_STRAIN_DURATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TrendKey.HIGH_STRESS_SLEEP_DURATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TrendKey.HOURS_V_NEEDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TrendKey.HR_ZONES_1_3.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TrendKey.HR_ZONES_4_5.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TrendKey.HR_ZONES_ALL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TrendKey.HRV.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TrendKey.IN_SLEEP_EFFICIENCY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TrendKey.LOW_STRESS_DURATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TrendKey.LOW_STRESS_NON_STRAIN_DURATION.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TrendKey.LOW_STRESS_SLEEP_DURATION.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TrendKey.MEDIUM_STRESS_DURATION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TrendKey.MEDIUM_STRESS_NON_STRAIN_DURATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TrendKey.MEDIUM_STRESS_SLEEP_DURATION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TrendKey.PACE_OF_AGING.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TrendKey.RECOVERY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TrendKey.REM_SLEEP_DURATION.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TrendKey.SLOW_WAVE_SLEEP_DURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[TrendKey.RESPIRATORY_RATE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[TrendKey.RESTORATIVE_SLEEP_PERCENT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[TrendKey.RHR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[TrendKey.SLEEP_CONSISTENCY.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[TrendKey.SLEEP_NEED.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[TrendKey.SLEEP_HOURS.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[TrendKey.SLEEP_NEED_FROM_SLEEP_DEBT_POST.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[TrendKey.SLEEP_PERFORMANCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[TrendKey.STEPS.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[TrendKey.STRENGTH_TRAINING_TIME.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[TrendKey.TIME_IN_BED.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[TrendKey.TOTAL_VOLUME_LOAD.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[TrendKey.VO2_MAX.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[TrendKey.WEIGHT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[TrendKey.WHOOP_AGE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            f32634a = iArr;
        }
    }

    private static final /* synthetic */ TrendKey[] $values() {
        return new TrendKey[]{AROUSAL_TIME, AVERAGE_HR, BASELINE_SLEEP_NEED, BODY_COMPOSITION_FAT, BODY_COMPOSITION_LEAN, CALORIES, DAY_KILOJOULES, DAY_STRAIN, DISTURBANCES, EXERCISE_PROGRESS, EXERCISE_PROGRESS_BY_EXERCISE, EXERCISE_PROGRESS_BY_EXERCISE_REPS, EXERCISE_PROGRESS_BY_EXERCISE_TIME, HIGH_STRESS_DURATION, HIGH_STRESS_NON_STRAIN_DURATION, HIGH_STRESS_SLEEP_DURATION, HOURS_V_NEEDED, HRV, HR_ZONES_1_3, HR_ZONES_4_5, HR_ZONES_ALL, IN_SLEEP_EFFICIENCY, LIGHT_SLEEP_DURATION, LOW_STRESS_DURATION, LOW_STRESS_NON_STRAIN_DURATION, LOW_STRESS_SLEEP_DURATION, MAX_HR, MEDIUM_STRESS_DURATION, MEDIUM_STRESS_NON_STRAIN_DURATION, MEDIUM_STRESS_SLEEP_DURATION, MENSTRUAL_CYCLE_INSIGHTS, NO_SLEEP_DATA_DURATION, NONE, PACE_OF_AGING, PREGNANCY_WEEK, RECOVERY, REM_SLEEP_DURATION, RESPIRATORY_RATE, RESTORATIVE_SLEEP_PERCENT, RHR, SAGE, SCALED_DAY_STRAIN, SKIN_TEMP_CELSIUS, SLEEP_CONSISTENCY, SLEEP_HOURS, SLEEP_LATENCY, SLEEP_NEED, SLEEP_NEED_FROM_RECENT_NAPS, SLEEP_NEED_FROM_SLEEP_DEBT, SLEEP_NEED_FROM_SLEEP_DEBT_POST, SLEEP_NEED_FROM_STRAIN, SLEEP_PERFORMANCE, SLOW_WAVE_SLEEP_DURATION, SPO2, STEPS, STRENGTH_TRAINING_TIME, TIME_IN_BED, TOTAL_VOLUME_LOAD, VO2_MAX, WAKE_DURATION, WEIGHT, WHOOP_AGE};
    }

    static {
        boolean z4 = false;
        AROUSAL_TIME = new TrendKey("AROUSAL_TIME", 0, null, true, z4, false, 13, null);
        boolean z13 = true;
        boolean z14 = false;
        AVERAGE_HR = new TrendKey("AVERAGE_HR", 1, "Avg Heart Rate", z4, z13, z14, 10, null);
        boolean z15 = false;
        BASELINE_SLEEP_NEED = new TrendKey("BASELINE_SLEEP_NEED", 2, null, z13, z14, z15, 13, null);
        boolean z16 = false;
        BODY_COMPOSITION_FAT = new TrendKey("BODY_COMPOSITION_FAT", 3, "Body Composition Fat", z14, z15, z16, 14, null);
        BODY_COMPOSITION_LEAN = new TrendKey("BODY_COMPOSITION_LEAN", 4, "Body Composition Lean", z15, z16, false, 14, null);
        CALORIES = new TrendKey("CALORIES", 5, "Calories", z16, true, false, 10, null);
        boolean z17 = true;
        boolean z18 = false;
        DAY_STRAIN = new TrendKey("DAY_STRAIN", 7, "Day Strain", false, z17, z18, 10, null);
        DISTURBANCES = new TrendKey("DISTURBANCES", 8, null, z17, z18, false, 13, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        EXERCISE_PROGRESS = new TrendKey("EXERCISE_PROGRESS", 9, "Exercise Progress", z18, true, false, 10, defaultConstructorMarker);
        boolean z19 = false;
        EXERCISE_PROGRESS_BY_EXERCISE_TIME = new TrendKey("EXERCISE_PROGRESS_BY_EXERCISE_TIME", 12, "Exercise Progress By Exercise Time", false, true, z19, 10, null);
        boolean z24 = false;
        HIGH_STRESS_DURATION = new TrendKey("HIGH_STRESS_DURATION", 13, "High Stress Duration", false, z19, z24, 14, null);
        boolean z25 = false;
        HIGH_STRESS_NON_STRAIN_DURATION = new TrendKey("HIGH_STRESS_NON_STRAIN_DURATION", 14, "High Stress Non Strain Duration", z19, z24, z25, 14, null);
        boolean z26 = false;
        HIGH_STRESS_SLEEP_DURATION = new TrendKey("HIGH_STRESS_SLEEP_DURATION", 15, "High Stress Sleep Duration", z24, z25, z26, 14, null);
        boolean z27 = false;
        HOURS_V_NEEDED = new TrendKey("HOURS_V_NEEDED", 16, "Hours vs Need Percent", true, z26, z27, 12, null);
        boolean z28 = true;
        HRV = new TrendKey("HRV", 17, "HRV", z26, z27, z28, 6, null);
        HR_ZONES_1_3 = new TrendKey("HR_ZONES_1_3", 18, "HR Zones 1-3", z27, z28, false, 10, null);
        HR_ZONES_4_5 = new TrendKey("HR_ZONES_4_5", 19, "HR Zones 4-5", false, true, false, 10, defaultConstructorMarker);
        boolean z29 = true;
        boolean z34 = false;
        HR_ZONES_ALL = new TrendKey("HR_ZONES_ALL", 20, "HR Zones All", false, z29, z34, 10, null);
        boolean z35 = false;
        IN_SLEEP_EFFICIENCY = new TrendKey("IN_SLEEP_EFFICIENCY", 21, "Sleep Efficiency", z29, z34, z35, 12, null);
        boolean z36 = false;
        LIGHT_SLEEP_DURATION = new TrendKey("LIGHT_SLEEP_DURATION", 22, null, true, z35, z36, 13, null);
        boolean z37 = false;
        LOW_STRESS_DURATION = new TrendKey("LOW_STRESS_DURATION", 23, "Low Stress Duration", z35, z36, z37, 14, null);
        boolean z38 = false;
        LOW_STRESS_NON_STRAIN_DURATION = new TrendKey("LOW_STRESS_NON_STRAIN_DURATION", 24, "Low Stress Non Strain Duration", z36, z37, z38, 14, null);
        boolean z39 = false;
        LOW_STRESS_SLEEP_DURATION = new TrendKey("LOW_STRESS_SLEEP_DURATION", 25, "Low Stress Sleep Duration", z37, z38, z39, 14, null);
        MAX_HR = new TrendKey("MAX_HR", 26, null, z38, z39, true, 7, null);
        boolean z44 = false;
        boolean z45 = false;
        MEDIUM_STRESS_DURATION = new TrendKey("MEDIUM_STRESS_DURATION", 27, "Medium Stress Duration", z39, z44, z45, 14, null);
        boolean z46 = false;
        MEDIUM_STRESS_NON_STRAIN_DURATION = new TrendKey("MEDIUM_STRESS_NON_STRAIN_DURATION", 28, "Medium Stress Non Strain Duration", z44, z45, z46, 14, null);
        MEDIUM_STRESS_SLEEP_DURATION = new TrendKey("MEDIUM_STRESS_SLEEP_DURATION", 29, "Medium Stress Sleep Duration", z45, z46, false, 14, defaultConstructorMarker);
        boolean z47 = false;
        MENSTRUAL_CYCLE_INSIGHTS = new TrendKey("MENSTRUAL_CYCLE_INSIGHTS", 30, "Menstrual Cycle Insights", false, false, z47, 14, null);
        boolean z48 = false;
        NO_SLEEP_DATA_DURATION = new TrendKey("NO_SLEEP_DATA_DURATION", 31, null, true, z47, z48, 13, null);
        boolean z49 = false;
        NONE = new TrendKey("NONE", 32, null, z47, z48, z49, 15, null);
        boolean z52 = false;
        PACE_OF_AGING = new TrendKey("PACE_OF_AGING", 33, "Pace of Aging", z48, z49, z52, 14, null);
        boolean z54 = false;
        PREGNANCY_WEEK = new TrendKey("PREGNANCY_WEEK", 34, "Pregnancy Week", z49, z52, z54, 14, null);
        RECOVERY = new TrendKey("RECOVERY", 35, "Recovery", z52, z54, true, 6, null);
        boolean z55 = false;
        boolean z56 = false;
        REM_SLEEP_DURATION = new TrendKey("REM_SLEEP_DURATION", 36, "Restorative Sleep", true, z55, z56, 12, null);
        RESPIRATORY_RATE = new TrendKey("RESPIRATORY_RATE", 37, "Respiratory Rate", z55, z56, true, 6, null);
        boolean z57 = false;
        boolean z58 = false;
        RESTORATIVE_SLEEP_PERCENT = new TrendKey("RESTORATIVE_SLEEP_PERCENT", 38, "Restorative Percent", true, z57, z58, 12, null);
        RHR = new TrendKey("RHR", 39, "RHR", z57, z58, true, 6, defaultConstructorMarker);
        boolean z59 = false;
        SAGE = new TrendKey("SAGE", 40, "Sage", false, z59, false, 14, null);
        SCALED_DAY_STRAIN = new TrendKey("SCALED_DAY_STRAIN", 41, null, z59, true, false, 11, null);
        boolean z60 = true;
        boolean z64 = false;
        SKIN_TEMP_CELSIUS = new TrendKey("SKIN_TEMP_CELSIUS", 42, null, false, z60, z64, 11, null);
        boolean z65 = false;
        SLEEP_CONSISTENCY = new TrendKey("SLEEP_CONSISTENCY", 43, "Sleep Consistency", z60, z64, z65, 12, null);
        boolean z66 = false;
        SLEEP_HOURS = new TrendKey("SLEEP_HOURS", 44, "Hours vs Need", true, z65, z66, 12, null);
        boolean z67 = false;
        SLEEP_LATENCY = new TrendKey("SLEEP_LATENCY", 45, null, true, z66, z67, 13, null);
        boolean z68 = false;
        SLEEP_NEED = new TrendKey("SLEEP_NEED", 46, "Hours vs Need", true, z67, z68, 12, null);
        boolean z69 = false;
        SLEEP_NEED_FROM_RECENT_NAPS = new TrendKey("SLEEP_NEED_FROM_RECENT_NAPS", 47, null, true, z68, z69, 13, null);
        boolean z74 = false;
        SLEEP_NEED_FROM_SLEEP_DEBT = new TrendKey("SLEEP_NEED_FROM_SLEEP_DEBT", 48, null, true, z69, z74, 13, null);
        SLEEP_NEED_FROM_SLEEP_DEBT_POST = new TrendKey("SLEEP_NEED_FROM_SLEEP_DEBT_POST", 49, "Sleep Debt", true, z74, false, 12, defaultConstructorMarker);
        boolean z75 = false;
        SLEEP_NEED_FROM_STRAIN = new TrendKey("SLEEP_NEED_FROM_STRAIN", 50, null, true, false, z75, 13, null);
        boolean z76 = false;
        SLEEP_PERFORMANCE = new TrendKey("SLEEP_PERFORMANCE", 51, "Sleep Performance", true, z75, z76, 12, null);
        boolean z77 = false;
        SLOW_WAVE_SLEEP_DURATION = new TrendKey("SLOW_WAVE_SLEEP_DURATION", 52, "Restorative Sleep", true, z76, z77, 12, null);
        boolean z78 = true;
        SPO2 = new TrendKey("SPO2", 53, null, z76, z77, z78, 7, null);
        STEPS = new TrendKey("STEPS", 54, "Steps", z77, z78, false, 10, null);
        boolean z79 = true;
        boolean z84 = false;
        STRENGTH_TRAINING_TIME = new TrendKey("STRENGTH_TRAINING_TIME", 55, "Strength Training Time", false, z79, z84, 10, null);
        TIME_IN_BED = new TrendKey("TIME_IN_BED", 56, "Time in Bed", z79, z84, false, 12, null);
        TOTAL_VOLUME_LOAD = new TrendKey("TOTAL_VOLUME_LOAD", 57, "Total Volume Load", z84, true, false, 10, null);
        boolean z85 = true;
        boolean z86 = false;
        VO2_MAX = new TrendKey("VO2_MAX", 58, "VO2 Max", false, z85, z86, 10, null);
        WAKE_DURATION = new TrendKey("WAKE_DURATION", 59, null, z85, z86, false, 13, defaultConstructorMarker);
        boolean z87 = false;
        boolean z88 = false;
        WEIGHT = new TrendKey("WEIGHT", 60, "Weight", false, z87, z88, 14, null);
        WHOOP_AGE = new TrendKey("WHOOP_AGE", 61, "Whoop Age", z87, z88, false, 14, null);
        TrendKey[] trendKeyArr$values = $values();
        $VALUES = trendKeyArr$values;
        $ENTRIES = AbstractC15751g.m44468u(trendKeyArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25371a(13));
    }

    private TrendKey(String str, int i13, String str2, boolean z4, boolean z13, boolean z14) {
        super(str, i13);
        this.trendName = str2;
        this.isSleep = z4;
        this.isStrain = z13;
        this.isRecovery = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.util.TrendKey", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static TrendKey valueOf(String str) {
        return (TrendKey) Enum.valueOf(TrendKey.class, str);
    }

    public static TrendKey[] values() {
        return (TrendKey[]) $VALUES.clone();
    }

    public final String getTrendName() {
        return this.trendName;
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

    public final EnumC28166h0 toGraphKey() {
        switch (C10699b.f32634a[ordinal()]) {
            case 1:
                return EnumC28166h0.AVERAGE_HR;
            case 2:
            case 3:
                return EnumC28166h0.BODY_COMPOSITION;
            case 4:
                return EnumC28166h0.CALORIES;
            case 5:
                return EnumC28166h0.DAY_STRAIN;
            case 6:
            case 7:
            case 8:
                return EnumC28166h0.EXERCISE_PROGRESS_BY_EXERCISE;
            case 9:
                return EnumC28166h0.STRESS;
            case 10:
                return EnumC28166h0.STRESS_DURING_NON_STRAIN;
            case 11:
                return EnumC28166h0.STRESS_DURING_SLEEP;
            case 12:
                return EnumC28166h0.HOURS_V_NEEDED_PERCENT;
            case 13:
                return EnumC28166h0.HR_ZONES_1_3;
            case 14:
                return EnumC28166h0.HR_ZONES_4_5;
            case 15:
                return EnumC28166h0.HR_ZONES_ALL;
            case 16:
                return EnumC28166h0.HRV;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumC28166h0.SLEEP_EFFICIENCY;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EnumC28166h0.STRESS;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EnumC28166h0.STRESS_DURING_NON_STRAIN;
            case 20:
                return EnumC28166h0.STRESS_DURING_SLEEP;
            case 21:
                return EnumC28166h0.STRESS;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EnumC28166h0.STRESS_DURING_NON_STRAIN;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EnumC28166h0.STRESS_DURING_SLEEP;
            case 24:
                return EnumC28166h0.PACE_OF_AGING;
            case 25:
                return EnumC28166h0.RECOVERY;
            case 26:
            case 27:
                return EnumC28166h0.RESTORATIVE_SLEEP;
            case 28:
                return EnumC28166h0.RESPIRATORY_RATE;
            case 29:
                return EnumC28166h0.RESTORATIVE_SLEEP_PERCENT;
            case 30:
                return EnumC28166h0.RHR;
            case 31:
                return EnumC28166h0.SLEEP_CONSISTENCY;
            case 32:
            case 33:
                return EnumC28166h0.HOURS_V_NEED;
            case 34:
                return EnumC28166h0.SLEEP_DEBT_POST;
            case 35:
                return EnumC28166h0.SLEEP_PERFORMANCE;
            case 36:
                return EnumC28166h0.STEPS;
            case 37:
                return EnumC28166h0.STRENGTH_ACTIVITY_TIME;
            case 38:
                return EnumC28166h0.TIME_IN_BED;
            case 39:
                return EnumC28166h0.TOTAL_VOLUME_LOAD;
            case 40:
                return EnumC28166h0.VO2_MAX;
            case 41:
                return EnumC28166h0.WEIGHT;
            case 42:
                return EnumC28166h0.WHOOP_AGE;
            default:
                return EnumC28166h0.NONE;
        }
    }

    public /* synthetic */ TrendKey(String str, int i13, String str2, boolean z4, boolean z13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? "" : str2, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? false : z13, (i14 & 8) != 0 ? false : z14);
    }
}
