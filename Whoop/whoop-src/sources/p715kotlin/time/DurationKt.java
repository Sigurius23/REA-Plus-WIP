package p715kotlin.time;

import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b4\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\t\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0087\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020\u0012*\u00020\u0006H\u0083\b¢\u0006\u0004\b \u0010!\u001a\u0014\u0010\"\u001a\u00020\u0012*\u00020\u0006H\u0083\b¢\u0006\u0004\b\"\u0010!\u001a \u0010%\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0083\b¢\u0006\u0004\b%\u0010&\u001a+\u0010(\u001a\u00020\u0006*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010*\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b*\u0010\u0007\u001a\"\u0010,\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020\u0010H\u0083\b¢\u0006\u0004\b,\u0010-\u001a&\u00102\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u000e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030.H\u0082\b¢\u0006\u0004\b0\u00101\u001a\u001d\u00104\u001a\u0004\u0018\u00010\u0001*\u00020\u00102\u0006\u00103\u001a\u00020\u0000H\u0002¢\u0006\u0004\b4\u00105\u001a\u001d\u00106\u001a\u0004\u0018\u00010\u0001*\u00020\u00102\u0006\u00103\u001a\u00020\u0000H\u0002¢\u0006\u0004\b6\u00105\u001a\u0014\u00107\u001a\u00020\u0006*\u00020\u0006H\u0083\b¢\u0006\u0004\b7\u00108\u001a\u0014\u00107\u001a\u00020\u0000*\u00020\u0000H\u0083\b¢\u0006\u0004\b7\u00109\u001a\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u00108\u001a\u0017\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u00108\u001a\u0017\u0010?\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u00108\u001a\u0017\u0010A\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u00108\u001a\u001f\u0010D\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0000H\u0002¢\u0006\u0004\bD\u0010E\u001a\u0017\u0010F\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\bF\u00108\u001a\u0017\u0010G\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u00108\"\u0014\u0010H\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010J\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010K\"\u0014\u0010L\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010K\"\u0014\u0010M\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\bM\u0010K\"\u0014\u0010N\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010K\"\u0014\u0010O\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010K\"\u0014\u0010P\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010K\"\u0014\u0010Q\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\bQ\u0010K\"\u0014\u0010R\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\bR\u0010K\"\u0014\u0010S\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\bS\u0010K\"\u0014\u0010T\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010U\"\u0014\u0010V\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010I\"\u001e\u0010[\u001a\u00020\b*\u00020\u00018BX\u0082\u0004¢\u0006\f\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010X\"\u0018\u0010^\u001a\u00020\u0006*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]\"\u0018\u0010a\u001a\u00020\u0000*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006b"}, m65681d2 = {"", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", "toDuration", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", AttachmentExtensionsKt.EXTRA_DURATION, "times-mvk6XK0", "(IJ)J", "times", "times-kIfJnKk", "(DJ)J", "", "value", "", "strictIso", "throwException", "parseDuration", "(Ljava/lang/String;ZZ)J", "startIndex", "parseIsoStringFormat", "(Ljava/lang/String;IZ)J", "hasSign", "parseDefaultStringFormat", "(Ljava/lang/String;IZZ)J", "other", "addMillisWithoutOverflow", "(JJ)J", "isInfiniteMillis", "(J)Z", "isFiniteMillis", "a", "b", "sameSign", "(JJ)Z", "endIndex", "parseFractionFallback", "(Ljava/lang/String;IILkotlin/time/DurationUnit;)J", "fractionDigitsToNanos", "message", "handleError", "(ZLjava/lang/String;)J", "Lkotlin/Function0;", "block", "onInvalid-ge6A_vg", "(JLc93/a;)Lkotlin/time/Duration;", "onInvalid", "start", "defaultDurationUnitByShortNameOrNull", "(Ljava/lang/String;I)Lkotlin/time/DurationUnit;", "isoDurationUnitByShortNameOrNull", "multiplyBy10", "(J)J", "(I)I", "nanos", "nanosToMillis", "millis", "millisToNanos", "normalNanos", "durationOfNanos", "normalMillis", "durationOfMillis", "normalValue", "unitDiscriminator", "durationOf", "(JI)J", "durationOfNanosNormalized", "durationOfMillisNormalized", "NANOS_IN_MILLIS", "I", "MICROS_IN_MILLIS", "J", "NANOS_IN_MICROS", "MAX_NANOS", "MAX_MILLIS", "MAX_NANOS_IN_MILLIS", "MILLIS_IN_SECOND", "MILLIS_IN_MINUTE", "MILLIS_IN_HOUR", "MILLIS_IN_DAY", "INFINITY_STRING", "Ljava/lang/String;", "FRACTION_LIMIT", "getFractionMultiplier", "(Lkotlin/time/DurationUnit;)D", "getFractionMultiplier$annotations", "(Lkotlin/time/DurationUnit;)V", "fractionMultiplier", "getFallbackFractionMultiplier", "(Lkotlin/time/DurationUnit;)J", "fallbackFractionMultiplier", "getShortNameLength", "(Lkotlin/time/DurationUnit;)I", "shortNameLength", "kotlin-stdlib"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DurationKt {
    private static final int FRACTION_LIMIT = 15;
    private static final String INFINITY_STRING = "Infinity";
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final long MICROS_IN_MILLIS = 1000;
    public static final long MILLIS_IN_DAY = 86400000;
    public static final long MILLIS_IN_HOUR = 3600000;
    public static final long MILLIS_IN_MINUTE = 60000;
    public static final long MILLIS_IN_SECOND = 1000;
    public static final long NANOS_IN_MICROS = 1000;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long addMillisWithoutOverflow(long j7, long j13) {
        if (j7 == MAX_MILLIS || j7 == -4611686018427387903L) {
            return ((-4611686018427387903L >= j13 || j13 >= MAX_MILLIS) && (j13 ^ j7) < 0) ? Duration.INVALID_RAW_VALUE : j7;
        }
        return (j13 == MAX_MILLIS || j13 == -4611686018427387903L) ? j13 : AbstractC12889b.m36286p(j7 + j13, -4611686018427387903L, MAX_MILLIS);
    }

    private static final DurationUnit defaultDurationUnitByShortNameOrNull(String str, int i13) {
        char cCharAt = str.charAt(i13);
        char cCharAt2 = i13 < AbstractC39414r.m125884c0(str) ? str.charAt(i13 + 1) : (char) 0;
        if (cCharAt == 'd') {
            return DurationUnit.DAYS;
        }
        if (cCharAt == 'h') {
            return DurationUnit.HOURS;
        }
        if (cCharAt == 's') {
            return DurationUnit.SECONDS;
        }
        if (cCharAt == 'u') {
            if (cCharAt2 == 's') {
                return DurationUnit.MICROSECONDS;
            }
            return null;
        }
        if (cCharAt == 'm') {
            return cCharAt2 == 's' ? DurationUnit.MILLISECONDS : DurationUnit.MINUTES;
        }
        if (cCharAt == 'n' && cCharAt2 == 's') {
            return DurationUnit.NANOSECONDS;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j7, int i13) {
        return Duration.INSTANCE.m134353fromRawValueUwyO8pc$kotlin_stdlib((j7 << 1) + ((long) i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j7) {
        return Duration.INSTANCE.m134353fromRawValueUwyO8pc$kotlin_stdlib((j7 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j7) {
        return (-4611686018426L > j7 || j7 >= 4611686018427L) ? durationOfMillis(AbstractC12889b.m36286p(j7, -4611686018427387903L, MAX_MILLIS)) : durationOfNanos(millisToNanos(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j7) {
        return Duration.INSTANCE.m134353fromRawValueUwyO8pc$kotlin_stdlib(j7 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j7) {
        return (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) ? durationOfMillis(nanosToMillis(j7)) : durationOfNanos(j7);
    }

    private static final long fractionDigitsToNanos(long j7, DurationUnit durationUnit) {
        return AbstractC12889b.m36259Y(j7 * getFractionMultiplier(durationUnit));
    }

    private static final long getFallbackFractionMultiplier(DurationUnit durationUnit) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()];
        if (i13 == 5) {
            return 60000000000L;
        }
        if (i13 == 6) {
            return 3600000000000L;
        }
        if (i13 == 7) {
            return 86400000000000L;
        }
        throw new IllegalStateException(("Invalid unit: " + durationUnit + " for fallback fraction multiplier").toString());
    }

    private static final double getFractionMultiplier(DurationUnit durationUnit) {
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return 1.0E-12d;
            case 2:
                return 1.0E-15d;
            case 3:
                return 1.0E-9d;
            case 4:
                return 1.0E-6d;
            case 5:
                return 6.0E-5d;
            case 6:
                return 0.0036d;
            case 7:
                return 0.0864d;
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }

    private static /* synthetic */ void getFractionMultiplier$annotations(DurationUnit durationUnit) {
    }

    private static final int getShortNameLength(DurationUnit durationUnit) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()];
        return (i13 == 1 || i13 == 2 || i13 == 3) ? 2 : 1;
    }

    private static final long handleError(boolean z4, String str) {
        if (z4) {
            throw new IllegalArgumentException(str);
        }
        return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
    }

    public static /* synthetic */ long handleError$default(boolean z4, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        if (z4) {
            throw new IllegalArgumentException(str);
        }
        return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
    }

    private static final boolean isFiniteMillis(long j7) {
        return -4611686018427387903L < j7 && j7 < MAX_MILLIS;
    }

    private static final boolean isInfiniteMillis(long j7) {
        return j7 == MAX_MILLIS || j7 == -4611686018427387903L;
    }

    private static final DurationUnit isoDurationUnitByShortNameOrNull(String str, int i13) {
        char cCharAt = str.charAt(i13);
        if (cCharAt == 'D') {
            return DurationUnit.DAYS;
        }
        if (cCharAt == 'H') {
            return DurationUnit.HOURS;
        }
        if (cCharAt == 'M') {
            return DurationUnit.MINUTES;
        }
        if (cCharAt != 'S') {
            return null;
        }
        return DurationUnit.SECONDS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j7) {
        return j7 * ((long) NANOS_IN_MILLIS);
    }

    private static final int multiplyBy10(int i13) {
        return (i13 << 3) + (i13 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j7) {
        return j7 / ((long) NANOS_IN_MILLIS);
    }

    /* JADX INFO: renamed from: onInvalid-ge6A_vg, reason: not valid java name */
    private static final Duration m134362onInvalidge6A_vg(long j7, InterfaceC4339a interfaceC4339a) {
        return Duration.m134267equalsimpl0(j7, Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib()) ? (Duration) interfaceC4339a.invoke() : Duration.m134260boximpl(j7);
    }

    /* JADX WARN: Code duplicated, block: B:142:0x023c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0243  */
    /* JADX WARN: Code duplicated, block: B:146:0x024b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0253  */
    /* JADX WARN: Code duplicated, block: B:151:0x0264  */
    /* JADX WARN: Code duplicated, block: B:170:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0238 A[SYNTHETIC] */
    private static final long parseDefaultStringFormat(String str, int i13, boolean z4, boolean z13) {
        boolean z14;
        int shortNameLength;
        boolean z15;
        int i14;
        long j7;
        long j13;
        long j14;
        long jFractionDigitsToNanos;
        int i15;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        int length = str.length();
        boolean z16 = !z4;
        if (z4 && str.charAt(i13) == '(' && str.charAt(length - 1) == ')') {
            shortNameLength = i13 + 1;
            length--;
            if (shortNameLength == length) {
                if (z13) {
                    throw new IllegalArgumentException("No components");
                }
                return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
            }
            z14 = true;
        } else {
            z14 = z16;
            shortNameLength = i13;
        }
        DurationUnit durationUnitDefaultDurationUnitByShortNameOrNull = null;
        long jAddMillisWithoutOverflow = 0;
        long j15 = 0;
        boolean z17 = true;
        while (shortNameLength < length) {
            if (!z17 && z14) {
                while (shortNameLength < str.length() && str.charAt(shortNameLength) == ' ') {
                    shortNameLength++;
                }
            }
            LongParser longParser = LongParser.INSTANCE.getDefault();
            int i16 = (longParser.allowSign && ((cCharAt3 = str.charAt(shortNameLength)) == '+' || cCharAt3 == '-')) ? shortNameLength + 1 : shortNameLength;
            while (i16 < str.length() && str.charAt(i16) == '0') {
                i16++;
            }
            long j16 = 0;
            while (true) {
                if (i16 < str.length()) {
                    char cCharAt4 = str.charAt(i16);
                    z14 = z14;
                    if ('0' <= cCharAt4 && cCharAt4 < ':') {
                        int i17 = cCharAt4 - '0';
                        if (j16 <= longParser.overflowThreshold) {
                            long j17 = j15;
                            if (j16 != longParser.overflowThreshold || i17 <= longParser.lastDigitMax) {
                                j16 = ((long) i17) + (j16 << 3) + (j16 << 1);
                                i16++;
                                z14 = z14;
                                j15 = j17;
                            }
                        }
                        while (i16 < str.length() && '0' <= (cCharAt2 = str.charAt(i16)) && cCharAt2 < ':') {
                            i16++;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("");
                        }
                        return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                    }
                } else {
                    z14 = z14;
                }
                long j18 = j15;
                if (i16 == shortNameLength || i16 == length) {
                    if (z13) {
                        throw new IllegalArgumentException("");
                    }
                    return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                }
                boolean z18 = str.charAt(i16) == '.';
                if (z18) {
                    int i18 = i16 + 1;
                    FractionalParser fractionalParser = FractionalParser.INSTANCE;
                    int iMin = Math.min(i16 + 7, str.length());
                    int i19 = i18;
                    int i24 = 0;
                    while (true) {
                        if (i19 >= iMin) {
                            z15 = z18;
                            break;
                        }
                        char cCharAt5 = str.charAt(i19);
                        z15 = z18;
                        if ('0' > cCharAt5 || cCharAt5 >= ':') {
                            break;
                        }
                        i24 = (cCharAt5 - '0') + (i24 << 3) + (i24 << 1);
                        i19++;
                        z18 = z15;
                    }
                    for (int i25 = 0; i25 < 6 - (i19 - i18); i25++) {
                        i24 = (i24 << 1) + (i24 << 3);
                    }
                    int iMin2 = Math.min(i19 + 9, str.length());
                    int i26 = i19;
                    int i27 = 0;
                    while (true) {
                        if (i26 >= iMin2) {
                            i15 = i26;
                            break;
                        }
                        int i28 = iMin2;
                        char cCharAt6 = str.charAt(i26);
                        i15 = i26;
                        if ('0' > cCharAt6 || cCharAt6 >= ':') {
                            break;
                        }
                        i27 = (cCharAt6 - '0') + (i27 << 3) + (i27 << 1);
                        i26 = i15 + 1;
                        iMin2 = i28;
                    }
                    for (int i29 = 0; i29 < 9 - (i15 - i19); i29++) {
                        i27 = (i27 << 1) + (i27 << 3);
                    }
                    int i34 = i15;
                    while (i34 < str.length() && '0' <= (cCharAt = str.charAt(i34)) && cCharAt < ':') {
                        i34++;
                    }
                    if (i34 == i18 || i34 == length) {
                        if (z13) {
                            throw new IllegalArgumentException("");
                        }
                        return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                    }
                    j7 = (((long) i24) * ((long) 1000000000)) + ((long) i27);
                    i14 = i16;
                    i16 = i34;
                } else {
                    z15 = z18;
                    i14 = -1;
                    j7 = 0;
                }
                durationUnitDefaultDurationUnitByShortNameOrNull = defaultDurationUnitByShortNameOrNull(str, i16);
                if (durationUnitDefaultDurationUnitByShortNameOrNull == null) {
                    String str2 = "Unknown duration unit short name: " + str.charAt(i16);
                    if (z13) {
                        throw new IllegalArgumentException(str2);
                    }
                    return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                }
                if (durationUnitDefaultDurationUnitByShortNameOrNull != null && durationUnitDefaultDurationUnitByShortNameOrNull.compareTo(durationUnitDefaultDurationUnitByShortNameOrNull) <= 0) {
                    if (z13) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                }
                int i35 = WhenMappings.$EnumSwitchMapping$0[durationUnitDefaultDurationUnitByShortNameOrNull.ordinal()];
                if (i35 != 1) {
                    if (i35 != 2) {
                        jAddMillisWithoutOverflow = addMillisWithoutOverflow(jAddMillisWithoutOverflow, DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(j16, durationUnitDefaultDurationUnitByShortNameOrNull));
                    } else {
                        long j19 = NANOS_IN_MILLIS;
                        j13 = (j16 / j19) + jAddMillisWithoutOverflow;
                        j14 = (j16 % j19) + j18;
                    }
                    shortNameLength = getShortNameLength(durationUnitDefaultDurationUnitByShortNameOrNull) + i16;
                    if (!z15) {
                        j15 = j18;
                        z17 = false;
                    } else {
                        if (shortNameLength < length) {
                            if (z13) {
                                throw new IllegalArgumentException("Fractional component must be last");
                            }
                            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                        }
                        if (durationUnitDefaultDurationUnitByShortNameOrNull.compareTo(DurationUnit.MINUTES) >= 0 || shortNameLength - i14 <= 15) {
                            jFractionDigitsToNanos = fractionDigitsToNanos(j7, durationUnitDefaultDurationUnitByShortNameOrNull);
                        } else {
                            jFractionDigitsToNanos = parseFractionFallback(str, i14, shortNameLength - getShortNameLength(durationUnitDefaultDurationUnitByShortNameOrNull), durationUnitDefaultDurationUnitByShortNameOrNull);
                        }
                        z17 = false;
                        j15 = j18 + jFractionDigitsToNanos;
                    }
                } else {
                    j13 = (j16 / 1000) + jAddMillisWithoutOverflow;
                    if (j13 <= MAX_NANOS_IN_MILLIS) {
                        j14 = (j16 % 1000) * 1000;
                    }
                    jAddMillisWithoutOverflow = j13;
                    shortNameLength = getShortNameLength(durationUnitDefaultDurationUnitByShortNameOrNull) + i16;
                    if (!z15) {
                        j15 = j18;
                        z17 = false;
                    } else {
                        if (shortNameLength < length) {
                            if (z13) {
                                return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                            }
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                        if (durationUnitDefaultDurationUnitByShortNameOrNull.compareTo(DurationUnit.MINUTES) >= 0) {
                            jFractionDigitsToNanos = fractionDigitsToNanos(j7, durationUnitDefaultDurationUnitByShortNameOrNull);
                        } else {
                            jFractionDigitsToNanos = fractionDigitsToNanos(j7, durationUnitDefaultDurationUnitByShortNameOrNull);
                        }
                        z17 = false;
                        j15 = j18 + jFractionDigitsToNanos;
                    }
                }
                j18 = j14;
                jAddMillisWithoutOverflow = j13;
                shortNameLength = getShortNameLength(durationUnitDefaultDurationUnitByShortNameOrNull) + i16;
                if (!z15) {
                    j15 = j18;
                    z17 = false;
                } else {
                    if (shortNameLength < length) {
                        if (z13) {
                            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                        }
                        throw new IllegalArgumentException("Fractional component must be last");
                    }
                    if (durationUnitDefaultDurationUnitByShortNameOrNull.compareTo(DurationUnit.MINUTES) >= 0) {
                        jFractionDigitsToNanos = fractionDigitsToNanos(j7, durationUnitDefaultDurationUnitByShortNameOrNull);
                    } else {
                        jFractionDigitsToNanos = fractionDigitsToNanos(j7, durationUnitDefaultDurationUnitByShortNameOrNull);
                    }
                    z17 = false;
                    j15 = j18 + jFractionDigitsToNanos;
                }
            }
        }
        return Duration.m134291plusLRDsOJo(toDuration(jAddMillisWithoutOverflow, DurationUnit.MILLISECONDS), toDuration(j15, DurationUnit.NANOSECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z4, boolean z13) {
        int i13;
        int i14;
        long jM134354getINFINITEUwyO8pc;
        if (str.length() == 0) {
            if (z13) {
                throw new IllegalArgumentException("The string is empty");
            }
            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '+') {
            i13 = cCharAt != '-' ? 0 : 1;
            i14 = i13;
        } else {
            i13 = 0;
            i14 = 1;
        }
        boolean z14 = i14 > 0;
        if (str.length() <= i14) {
            if (z13) {
                throw new IllegalArgumentException("No components");
            }
            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
        }
        if (str.charAt(i14) == 'P') {
            jM134354getINFINITEUwyO8pc = parseIsoStringFormat(str, i14 + 1, z13);
        } else {
            if (z4) {
                if (z13) {
                    throw new IllegalArgumentException("");
                }
                return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
            }
            jM134354getINFINITEUwyO8pc = AbstractC39421y.m125924I(i14, 0, Math.max(str.length() - i14, 8), str, INFINITY_STRING, true) ? Duration.INSTANCE.m134354getINFINITEUwyO8pc() : parseDefaultStringFormat(str, i14, z14, z13);
        }
        return (i13 == 0 || Duration.m134267equalsimpl0(jM134354getINFINITEUwyO8pc, Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib())) ? jM134354getINFINITEUwyO8pc : Duration.m134306unaryMinusUwyO8pc(jM134354getINFINITEUwyO8pc);
    }

    public static /* synthetic */ long parseDuration$default(String str, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        return parseDuration(str, z4, z13);
    }

    private static final long parseFractionFallback(String str, int i13, int i14, DurationUnit durationUnit) {
        AbstractC22676k.m65748h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i13, i14);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return AbstractC12889b.m36259Y(Double.parseDouble(strSubstring) * getFallbackFractionMultiplier(durationUnit));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    private static final long parseIsoStringFormat(String str, int i13, boolean z4) {
        int i14;
        int i15;
        char c3;
        String str2;
        int i16;
        char cCharAt;
        char cCharAt2;
        int i17;
        char cCharAt3;
        String str3 = "";
        int i18 = i13;
        if (i18 == str.length()) {
            if (z4) {
                throw new IllegalArgumentException("");
            }
            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
        }
        DurationUnit durationUnit = null;
        long jConvertDurationUnitToMilliseconds = 0;
        long jFractionDigitsToNanos = 0;
        boolean z13 = false;
        while (i18 < str.length()) {
            char cCharAt4 = str.charAt(i18);
            if (cCharAt4 != 'T') {
                LongParser iso = LongParser.INSTANCE.getIso();
                if (iso.allowSign) {
                    char cCharAt5 = str.charAt(i18);
                    if (cCharAt5 == '+') {
                        i14 = i18 + 1;
                        i15 = 1;
                    } else if (cCharAt5 != '-') {
                        i14 = i18;
                        i15 = 1;
                    } else {
                        i14 = i18 + 1;
                        i15 = -1;
                    }
                } else {
                    i14 = i18;
                    i15 = 1;
                }
                while (true) {
                    c3 = '0';
                    if (i14 >= str.length() || str.charAt(i14) != '0') {
                        break;
                    }
                    i14++;
                }
                long j7 = 0;
                while (true) {
                    if (i14 >= str.length() || c3 > (cCharAt2 = str.charAt(i14)) || cCharAt2 >= ':') {
                        str2 = str3;
                        i16 = i14;
                        if (i16 != str.length()) {
                            if (i16 == i18 + ((cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0)) {
                            }
                        }
                        if (z4) {
                            throw new IllegalArgumentException(str2);
                        }
                        return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                    }
                    int i19 = cCharAt2 - '0';
                    if (j7 <= iso.overflowThreshold) {
                        if (j7 == iso.overflowThreshold) {
                            i17 = i14;
                            if (i19 > iso.lastDigitMax) {
                            }
                        } else {
                            i17 = i14;
                        }
                        j7 = (j7 << 3) + (j7 << 1) + ((long) i19);
                        i14 = i17 + 1;
                        str3 = str3;
                        c3 = '0';
                    } else {
                        i17 = i14;
                    }
                    String str4 = str3;
                    i16 = i17;
                    while (i16 < str.length() && '0' <= (cCharAt3 = str.charAt(i16)) && cCharAt3 < ':') {
                        i16++;
                    }
                    if (i16 != str.length()) {
                        if (i16 != i18 + ((cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0)) {
                            j7 = iso.overflowLimit;
                            str2 = str4;
                        }
                    }
                    if (z4) {
                        throw new IllegalArgumentException(str4);
                    }
                    return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                    long j13 = j7;
                    if (str.charAt(i16) == '.') {
                        int i24 = i16 + 1;
                        FractionalParser fractionalParser = FractionalParser.INSTANCE;
                        int iMin = Math.min(i16 + 7, str.length());
                        int i25 = i24;
                        int i26 = 0;
                        while (i25 < iMin) {
                            char cCharAt6 = str.charAt(i25);
                            if ('0' > cCharAt6 || cCharAt6 >= ':') {
                                break;
                            }
                            i26 = (cCharAt6 - '0') + (i26 << 3) + (i26 << 1);
                            i25++;
                        }
                        for (int i27 = 0; i27 < 6 - (i25 - i24); i27++) {
                            i26 = (i26 << 1) + (i26 << 3);
                        }
                        int iMin2 = Math.min(i25 + 9, str.length());
                        int i28 = i25;
                        int i29 = 0;
                        while (i28 < iMin2) {
                            char cCharAt7 = str.charAt(i28);
                            int i34 = iMin2;
                            if ('0' > cCharAt7 || cCharAt7 >= ':') {
                                break;
                            }
                            i29 = (cCharAt7 - '0') + (i29 << 3) + (i29 << 1);
                            i28++;
                            iMin2 = i34;
                        }
                        int i35 = 9 - (i28 - i25);
                        for (int i36 = 0; i36 < i35; i36++) {
                            i29 = (i29 << 1) + (i29 << 3);
                        }
                        int i37 = i28;
                        while (i37 < str.length() && '0' <= (cCharAt = str.charAt(i37)) && cCharAt < ':') {
                            i37++;
                        }
                        if (i37 == i24 || i37 == str.length() || str.charAt(i37) != 'S') {
                            if (z4) {
                                throw new IllegalArgumentException(str2);
                            }
                            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                        }
                        jFractionDigitsToNanos = ((long) i15) * fractionDigitsToNanos((((long) i26) * ((long) 1000000000)) + ((long) i29), DurationUnit.SECONDS);
                        i16 = i37;
                    }
                    DurationUnit durationUnitIsoDurationUnitByShortNameOrNull = isoDurationUnitByShortNameOrNull(str, i16);
                    if (durationUnitIsoDurationUnitByShortNameOrNull == null) {
                        String str5 = "Unknown duration unit short name: " + str.charAt(i16);
                        if (z4) {
                            throw new IllegalArgumentException(str5);
                        }
                        return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                    }
                    if (durationUnit != null && durationUnit.compareTo(durationUnitIsoDurationUnitByShortNameOrNull) <= 0) {
                        if (z4) {
                            throw new IllegalArgumentException("Unexpected order of duration components");
                        }
                        return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                    }
                    if (durationUnitIsoDurationUnitByShortNameOrNull == DurationUnit.DAYS) {
                        if (z13) {
                            if (z4) {
                                throw new IllegalArgumentException(str2);
                            }
                            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                        }
                        jConvertDurationUnitToMilliseconds = ((long) i15) * DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(j13, durationUnitIsoDurationUnitByShortNameOrNull);
                    } else {
                        if (!z13) {
                            if (z4) {
                                throw new IllegalArgumentException(str2);
                            }
                            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                        }
                        long jAddMillisWithoutOverflow = addMillisWithoutOverflow(jConvertDurationUnitToMilliseconds, ((long) i15) * DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(j13, durationUnitIsoDurationUnitByShortNameOrNull));
                        if (jAddMillisWithoutOverflow == Duration.INVALID_RAW_VALUE) {
                            if (z4) {
                                throw new IllegalArgumentException(str2);
                            }
                            return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                        }
                        jConvertDurationUnitToMilliseconds = jAddMillisWithoutOverflow;
                    }
                    i18 = i16 + 1;
                    str3 = str2;
                    durationUnit = durationUnitIsoDurationUnitByShortNameOrNull;
                }
            } else {
                if (z13 || (i18 = i18 + 1) == str.length()) {
                    if (z4) {
                        throw new IllegalArgumentException(str3);
                    }
                    return Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib();
                }
                z13 = true;
            }
        }
        return Duration.m134291plusLRDsOJo(toDuration(jConvertDurationUnitToMilliseconds, DurationUnit.MILLISECONDS), toDuration(jFractionDigitsToNanos, DurationUnit.NANOSECONDS));
    }

    private static final boolean sameSign(long j7, long j13) {
        return (j7 ^ j13) >= 0;
    }

    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m134363timeskIfJnKk(double d3, long j7) {
        return Duration.m134292timesUwyO8pc(j7, d3);
    }

    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m134364timesmvk6XK0(int i13, long j7) {
        return Duration.m134293timesUwyO8pc(j7, i13);
    }

    public static final long toDuration(int i13, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i13, unit, DurationUnit.NANOSECONDS)) : toDuration(i13, unit);
    }

    private static final long multiplyBy10(long j7) {
        return (j7 << 3) + (j7 << 1);
    }

    public static final long toDuration(long j7, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jConvertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        if ((-jConvertDurationUnitOverflow) <= j7 && j7 <= jConvertDurationUnitOverflow) {
            return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j7, unit, durationUnit));
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (unit.compareTo(durationUnit2) >= 0) {
            long jSignum = Long.signum(j7);
            if (j7 < -9223372036854775807L) {
                j7 = -9223372036854775807L;
            }
            return durationOfMillis(jSignum * DurationUnitKt__DurationUnitKt.convertDurationUnitToMilliseconds(Math.abs(j7), unit));
        }
        return durationOfMillis(AbstractC12889b.m36286p(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j7, unit, durationUnit2), -4611686018427387903L, MAX_MILLIS));
    }

    public static final long toDuration(double d3, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        double dConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d3, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(dConvertDurationUnit)) {
            long jM36259Y = AbstractC12889b.m36259Y(dConvertDurationUnit);
            if (-4611686018426999999L <= jM36259Y && jM36259Y < 4611686018427000000L) {
                return durationOfNanos(jM36259Y);
            }
            return durationOfMillisNormalized(AbstractC12889b.m36259Y(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d3, unit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }
}
