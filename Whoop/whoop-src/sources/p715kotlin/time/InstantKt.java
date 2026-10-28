package p715kotlin.time;

import c93.InterfaceC4339a;
import java.io.IOException;
import km2.C22594e;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p108e4.AbstractC12682p;
import p319m4.AbstractC25012a;
import p497t7.InterfaceC33561b;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0015\n\u0002\b\f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a.\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010!\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001e\"\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#\"\u0014\u0010'\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010#\"\u0014\u0010)\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010#\"\u0014\u0010*\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010#\"\u0014\u0010+\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010#\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.\"\u0014\u00100\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.\"\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010.\"\u001f\u00102\u001a\u00020\u0015*\u00020\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"\u001f\u00106\u001a\u00020\u0015*\u00020\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00105\u001a\u0004\b6\u00103¨\u00068"}, m65681d2 = {"", "isoString", "Lkotlin/time/InstantParseResult;", "parseIso", "(Ljava/lang/CharSequence;)Lkotlin/time/InstantParseResult;", "Lkotlin/time/Instant;", "instant", "", "formatIso", "(Lkotlin/time/Instant;)Ljava/lang/String;", "", "a", "b", "Lkotlin/Function0;", "", "action", "safeAddOrElse", "(JJLc93/a;)J", "safeMultiplyOrElse", "", "year", "", "isLeapYear", "(I)Z", "monthLength", "(IZ)I", "maxLength", "truncateForErrorMessage", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "DISTANT_PAST_SECONDS", "J", "DISTANT_FUTURE_SECONDS", "MIN_SECOND", "MAX_SECOND", "DAYS_PER_CYCLE", "I", "DAYS_0000_TO_1970", "SECONDS_PER_HOUR", "SECONDS_PER_MINUTE", "HOURS_PER_DAY", "SECONDS_PER_DAY", "NANOS_PER_SECOND", "NANOS_PER_MILLI", "MILLIS_PER_SECOND", "", "POWERS_OF_TEN", "[I", "asciiDigitPositionsInIsoStringAfterYear", "colonsInIsoOffsetString", "asciiDigitsInIsoOffsetString", "isDistantPast", "(Lkotlin/time/Instant;)Z", "isDistantPast$annotations", "(Lkotlin/time/Instant;)V", "isDistantFuture", "isDistantFuture$annotations", "kotlin-stdlib"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InstantKt {
    private static final int DAYS_0000_TO_1970 = 719528;
    private static final int DAYS_PER_CYCLE = 146097;
    private static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
    private static final long DISTANT_PAST_SECONDS = -3217862419201L;
    private static final int HOURS_PER_DAY = 24;
    private static final long MAX_SECOND = 31556889864403199L;
    private static final int MILLIS_PER_SECOND = 1000;
    private static final long MIN_SECOND = -31557014167219200L;
    private static final int NANOS_PER_MILLI = 1000000;
    public static final int NANOS_PER_SECOND = 1000000000;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int[] POWERS_OF_TEN = {1, 10, 100, 1000, InterfaceC33561b.INVALID_OWNERSHIP, 100000, 1000000, 10000000, 100000000, 1000000000};
    private static final int[] asciiDigitPositionsInIsoStringAfterYear = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] colonsInIsoOffsetString = {3, 6};
    private static final int[] asciiDigitsInIsoOffsetString = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatIso(Instant instant) throws IOException {
        int[] iArr;
        StringBuilder sb4 = new StringBuilder();
        UnboundLocalDateTime unboundLocalDateTimeFromInstant = UnboundLocalDateTime.INSTANCE.fromInstant(instant);
        int year = unboundLocalDateTimeFromInstant.getYear();
        int i13 = 0;
        if (Math.abs(year) < 1000) {
            StringBuilder sb5 = new StringBuilder();
            if (year >= 0) {
                sb5.append(year + InterfaceC33561b.INVALID_OWNERSHIP);
                AbstractC22676k.m65749i(sb5.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb5.append(year - InterfaceC33561b.INVALID_OWNERSHIP);
                AbstractC22676k.m65749i(sb5.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb4.append((CharSequence) sb5);
        } else {
            if (year >= 10000) {
                sb4.append('+');
            }
            sb4.append(year);
        }
        sb4.append('-');
        formatIso$lambda$0$appendTwoDigits(sb4, sb4, unboundLocalDateTimeFromInstant.getMonth());
        sb4.append('-');
        formatIso$lambda$0$appendTwoDigits(sb4, sb4, unboundLocalDateTimeFromInstant.getDay());
        sb4.append('T');
        formatIso$lambda$0$appendTwoDigits(sb4, sb4, unboundLocalDateTimeFromInstant.getHour());
        sb4.append(':');
        formatIso$lambda$0$appendTwoDigits(sb4, sb4, unboundLocalDateTimeFromInstant.getMinute());
        sb4.append(':');
        formatIso$lambda$0$appendTwoDigits(sb4, sb4, unboundLocalDateTimeFromInstant.getSecond());
        if (unboundLocalDateTimeFromInstant.getNanosecond() != 0) {
            sb4.append('.');
            while (true) {
                int nanosecond = unboundLocalDateTimeFromInstant.getNanosecond();
                iArr = POWERS_OF_TEN;
                int i14 = i13 + 1;
                if (nanosecond % iArr[i14] != 0) {
                    break;
                }
                i13 = i14;
            }
            int i15 = i13 - (i13 % 3);
            String strValueOf = String.valueOf((unboundLocalDateTimeFromInstant.getNanosecond() / iArr[i15]) + iArr[9 - i15]);
            AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            sb4.append(strSubstring);
        }
        sb4.append('Z');
        return sb4.toString();
    }

    private static final void formatIso$lambda$0$appendTwoDigits(Appendable appendable, StringBuilder sb4, int i13) throws IOException {
        if (i13 < 10) {
            appendable.append('0');
        }
        sb4.append(i13);
    }

    private static final boolean isDistantFuture(Instant instant) {
        AbstractC22676k.m65750j(instant, "<this>");
        return instant.compareTo(Instant.INSTANCE.getDISTANT_FUTURE()) >= 0;
    }

    public static /* synthetic */ void isDistantFuture$annotations(Instant instant) {
    }

    private static final boolean isDistantPast(Instant instant) {
        AbstractC22676k.m65750j(instant, "<this>");
        return instant.compareTo(Instant.INSTANCE.getDISTANT_PAST()) <= 0;
    }

    public static /* synthetic */ void isDistantPast$annotations(Instant instant) {
    }

    public static final boolean isLeapYear(int i13) {
        if ((i13 & 3) == 0) {
            return i13 % 100 != 0 || i13 % 400 == 0;
        }
        return false;
    }

    private static final int monthLength(int i13, boolean z4) {
        if (i13 != 2) {
            return (i13 == 4 || i13 == 6 || i13 == 9 || i13 == 11) ? 30 : 31;
        }
        return z4 ? 29 : 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantParseResult parseIso(CharSequence charSequence) {
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() == 0) {
            return new InstantParseResult.Failure("An empty string is not a valid Instant", charSequence);
        }
        char cCharAt3 = charSequence.charAt(0);
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i13 = 1;
        } else {
            i13 = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i17 = i13;
        while (i17 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i17)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i17) - '0');
            i17++;
        }
        int i18 = i17 - i13;
        if (i18 > 10) {
            return parseIso$parseFailure(charSequence, AbstractC2875y.m8296i(i18, "Expected at most 10 digits for the year number, got ", " digits"));
        }
        if (i18 == 10 && AbstractC22676k.m65751k(charSequence.charAt(i13), 50) >= 0) {
            return parseIso$parseFailure(charSequence, AbstractC2875y.m8296i(i18, "Expected at most 9 digits for the year number or year 1000000000, got ", " digits"));
        }
        if (i18 < 4) {
            return parseIso$parseFailure(charSequence, AbstractC2875y.m8296i(i18, "The year number must be padded to 4 digits, got ", " digits"));
        }
        if (cCharAt3 == '+' && i18 == 4) {
            return parseIso$parseFailure(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i18 != 4) {
            return parseIso$parseFailure(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i19 = iCharAt;
        int i24 = i17 + 16;
        if (charSequence.length() < i24) {
            return parseIso$parseFailure(charSequence, "The input string is too short");
        }
        InstantParseResult.Failure iso$expect = parseIso$expect(charSequence, "'-'", i17, new C22594e(3));
        if (iso$expect != null) {
            return iso$expect;
        }
        InstantParseResult.Failure iso$expect2 = parseIso$expect(charSequence, "'-'", i17 + 3, new C22594e(4));
        if (iso$expect2 != null) {
            return iso$expect2;
        }
        InstantParseResult.Failure iso$expect3 = parseIso$expect(charSequence, "'T' or 't'", i17 + 6, new C22594e(5));
        if (iso$expect3 != null) {
            return iso$expect3;
        }
        InstantParseResult.Failure iso$expect4 = parseIso$expect(charSequence, "':'", i17 + 9, new C22594e(6));
        if (iso$expect4 != null) {
            return iso$expect4;
        }
        InstantParseResult.Failure iso$expect5 = parseIso$expect(charSequence, "':'", i17 + 12, new C22594e(7));
        if (iso$expect5 != null) {
            return iso$expect5;
        }
        for (int i25 : asciiDigitPositionsInIsoStringAfterYear) {
            InstantParseResult.Failure iso$expect6 = parseIso$expect(charSequence, "an ASCII digit", i25 + i17, new C22594e(8));
            if (iso$expect6 != null) {
                return iso$expect6;
            }
        }
        int iso$twoDigitNumber = parseIso$twoDigitNumber(charSequence, i17 + 1);
        int iso$twoDigitNumber2 = parseIso$twoDigitNumber(charSequence, i17 + 4);
        int iso$twoDigitNumber3 = parseIso$twoDigitNumber(charSequence, i17 + 7);
        int iso$twoDigitNumber4 = parseIso$twoDigitNumber(charSequence, i17 + 10);
        int iso$twoDigitNumber5 = parseIso$twoDigitNumber(charSequence, i17 + 13);
        int i26 = i17 + 15;
        if (charSequence.charAt(i26) == '.') {
            i26 = i24;
            int iCharAt2 = 0;
            while (i26 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i26)) && cCharAt < ':') {
                iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i26) - '0');
                i26++;
            }
            int i27 = i26 - i24;
            if (1 > i27 || i27 >= 10) {
                return parseIso$parseFailure(charSequence, AbstractC2875y.m8296i(i27, "1..9 digits are supported for the fraction of the second, got ", " digits"));
            }
            i14 = iCharAt2 * POWERS_OF_TEN[9 - i27];
        } else {
            i14 = 0;
        }
        if (i26 >= charSequence.length()) {
            return parseIso$parseFailure(charSequence, "The UTC offset at the end of the string is missing");
        }
        char cCharAt4 = charSequence.charAt(i26);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = charSequence.length() - i26;
            if (length > 9) {
                return parseIso$parseFailure(charSequence, AbstractC25012a.m73376i(truncateForErrorMessage(charSequence.subSequence(i26, charSequence.length()).toString(), 16), "\" is too long", new StringBuilder("The UTC offset string \"")));
            }
            if (length % 3 != 0) {
                return parseIso$parseFailure(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i26, charSequence.length()).toString() + '\"');
            }
            for (int i28 : colonsInIsoOffsetString) {
                int i29 = i26 + i28;
                if (i29 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i29) != ':') {
                    StringBuilder sbM30466t = AbstractC11266d.m30466t(i29, "Expected ':' at index ", ", got '");
                    sbM30466t.append(charSequence.charAt(i29));
                    sbM30466t.append('\'');
                    return parseIso$parseFailure(charSequence, sbM30466t.toString());
                }
            }
            int[] iArr = asciiDigitsInIsoOffsetString;
            int length2 = iArr.length;
            int i34 = 0;
            while (i34 < length2) {
                int i35 = iArr[i34] + i26;
                if (i35 >= charSequence.length()) {
                    break;
                }
                char cCharAt5 = charSequence.charAt(i35);
                int[] iArr2 = iArr;
                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                    StringBuilder sbM30466t2 = AbstractC11266d.m30466t(i35, "Expected an ASCII digit at index ", ", got '");
                    sbM30466t2.append(charSequence.charAt(i35));
                    sbM30466t2.append('\'');
                    return parseIso$parseFailure(charSequence, sbM30466t2.toString());
                }
                i34++;
                iArr = iArr2;
            }
            int iso$twoDigitNumber6 = parseIso$twoDigitNumber(charSequence, i26 + 1);
            i15 = 3;
            int iso$twoDigitNumber7 = length > 3 ? parseIso$twoDigitNumber(charSequence, i26 + 4) : 0;
            int iso$twoDigitNumber8 = length > 6 ? parseIso$twoDigitNumber(charSequence, i26 + 7) : 0;
            if (iso$twoDigitNumber7 > 59) {
                return parseIso$parseFailure(charSequence, AbstractC2875y.m8295h(iso$twoDigitNumber7, "Expected offset-minute-of-hour in 0..59, got "));
            }
            if (iso$twoDigitNumber8 > 59) {
                return parseIso$parseFailure(charSequence, AbstractC2875y.m8295h(iso$twoDigitNumber8, "Expected offset-second-of-minute in 0..59, got "));
            }
            if (iso$twoDigitNumber6 > 17 && (iso$twoDigitNumber6 != 18 || iso$twoDigitNumber7 != 0 || iso$twoDigitNumber8 != 0)) {
                return parseIso$parseFailure(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i26, charSequence.length()).toString());
            }
            i16 = (cCharAt4 == '-' ? -1 : 1) * ((iso$twoDigitNumber7 * 60) + (iso$twoDigitNumber6 * 3600) + iso$twoDigitNumber8);
        } else {
            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                return parseIso$parseFailure(charSequence, "Expected the UTC offset at position " + i26 + ", got '" + cCharAt4 + '\'');
            }
            int i36 = i26 + 1;
            if (charSequence.length() != i36) {
                return parseIso$parseFailure(charSequence, AbstractC2875y.m8295h(i36, "Extra text after the instant at position "));
            }
            i16 = 0;
            i15 = 3;
        }
        if (1 > iso$twoDigitNumber || iso$twoDigitNumber >= 13) {
            return parseIso$parseFailure(charSequence, AbstractC2875y.m8295h(iso$twoDigitNumber, "Expected a month number in 1..12, got "));
        }
        if (1 > iso$twoDigitNumber2 || iso$twoDigitNumber2 > monthLength(iso$twoDigitNumber, isLeapYear(i19))) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(iso$twoDigitNumber, i19, "Expected a valid day-of-month for month ", " of year ", ", got ");
            sbM30465s.append(iso$twoDigitNumber2);
            return parseIso$parseFailure(charSequence, sbM30465s.toString());
        }
        if (iso$twoDigitNumber3 > 23) {
            return parseIso$parseFailure(charSequence, AbstractC2875y.m8295h(iso$twoDigitNumber3, "Expected hour in 0..23, got "));
        }
        if (iso$twoDigitNumber4 > 59) {
            return parseIso$parseFailure(charSequence, AbstractC2875y.m8295h(iso$twoDigitNumber4, "Expected minute-of-hour in 0..59, got "));
        }
        if (iso$twoDigitNumber5 > 59) {
            return parseIso$parseFailure(charSequence, AbstractC2875y.m8295h(iso$twoDigitNumber5, "Expected second-of-minute in 0..59, got "));
        }
        UnboundLocalDateTime unboundLocalDateTime = new UnboundLocalDateTime(i19, iso$twoDigitNumber, iso$twoDigitNumber2, iso$twoDigitNumber3, iso$twoDigitNumber4, iso$twoDigitNumber5, i14);
        long year = unboundLocalDateTime.getYear();
        long j7 = ((long) 365) * year;
        long month = (year >= 0 ? ((year + ((long) 399)) / ((long) 400)) + (((((long) i15) + year) / ((long) 4)) - ((((long) 99) + year) / ((long) 100))) + j7 : j7 - ((year / ((long) (-400))) + ((year / ((long) (-4))) - (year / ((long) (-100)))))) + ((long) (((unboundLocalDateTime.getMonth() * 367) - 362) / 12)) + ((long) (unboundLocalDateTime.getDay() - 1));
        if (unboundLocalDateTime.getMonth() > 2) {
            month = !isLeapYear(unboundLocalDateTime.getYear()) ? month - 2 : (-1) + month;
        }
        return new InstantParseResult.Success((((month - ((long) DAYS_0000_TO_1970)) * ((long) 86400)) + ((long) (((unboundLocalDateTime.getMinute() * 60) + (unboundLocalDateTime.getHour() * 3600)) + unboundLocalDateTime.getSecond()))) - ((long) i16), unboundLocalDateTime.getNanosecond());
    }

    private static final InstantParseResult.Failure parseIso$expect(CharSequence charSequence, String str, int i13, Function1 function1) {
        char cCharAt = charSequence.charAt(i13);
        if (((Boolean) function1.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return parseIso$parseFailure(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$0(char c3) {
        return c3 == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$10(char c3) {
        return '0' <= c3 && c3 < ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$2(char c3) {
        return c3 == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$4(char c3) {
        return c3 == 'T' || c3 == 't';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$6(char c3) {
        return c3 == ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$8(char c3) {
        return c3 == ':';
    }

    private static final InstantParseResult.Failure parseIso$parseFailure(CharSequence charSequence, String str) {
        return new InstantParseResult.Failure(AbstractC25012a.m73377j(AbstractC12682p.m35484d(str, " when parsing an Instant from \""), truncateForErrorMessage(charSequence, 64), '\"'), charSequence);
    }

    private static final int parseIso$twoDigitNumber(CharSequence charSequence, int i13) {
        return (charSequence.charAt(i13 + 1) - '0') + ((charSequence.charAt(i13) - '0') * 10);
    }

    private static final long safeAddOrElse(long j7, long j13, InterfaceC4339a interfaceC4339a) {
        long j14 = j7 + j13;
        if ((j7 ^ j14) >= 0 || (j7 ^ j13) < 0) {
            return j14;
        }
        interfaceC4339a.invoke();
        throw new KotlinNothingValueException();
    }

    private static final long safeMultiplyOrElse(long j7, long j13, InterfaceC4339a interfaceC4339a) {
        if (j13 == 1) {
            return j7;
        }
        if (j7 == 1) {
            return j13;
        }
        if (j7 == 0 || j13 == 0) {
            return 0L;
        }
        long j14 = j7 * j13;
        if (j14 / j13 == j7 && ((j7 != Long.MIN_VALUE || j13 != -1) && (j13 != Long.MIN_VALUE || j7 != -1))) {
            return j14;
        }
        interfaceC4339a.invoke();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage(CharSequence charSequence, int i13) {
        if (charSequence.length() <= i13) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i13).toString() + "...";
    }
}
