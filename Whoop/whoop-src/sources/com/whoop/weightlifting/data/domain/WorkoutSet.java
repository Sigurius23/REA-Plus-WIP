package com.whoop.weightlifting.data.domain;

import android.icu.text.DecimalFormat;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import i93.C18279e;
import i93.C18284j;
import i93.InterfaceC18280f;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import live.hms.video.utils.HMSConstantsKt;
import lu2.C24753c;
import or2.AbstractC28164g1;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00029:B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0005\u001a\u00020\f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\rB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000eBC\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010!R\u0011\u00102\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0013\u00105\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00108\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "", "", "numberOfReps", "time", "weight", "Ljava/util/UUID;", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "", "timeInSeconds", "", "(ILjava/lang/Integer;FLjava/util/UUID;)V", "(ILjava/lang/Integer;F)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/domain/WorkoutSet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/UUID;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNumberOfReps", "getTime", "getWeight", "Ljava/util/UUID;", "getId", "getNumberOfRepsAsInt", "numberOfRepsAsInt", "getTimeAsIntSeconds", "()Ljava/lang/Integer;", "timeAsIntSeconds", "getWeightAsFloat", "()F", "weightAsFloat", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutSet {
    private static final int MAX_DIGITS_IN_TIME = 5;
    private static final DecimalFormat repsFormat;
    private static final DecimalFormat timeFormat;
    private static final C18284j validTimeInSecondsRange;
    private static final InterfaceC18280f validWeightRange;
    private static final DecimalFormat weightFormat;
    private final UUID id;
    private final String numberOfReps;
    private final String time;
    private final String weight;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u0004*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0005*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b!\u0010 J\u0011\u0010\"\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\"\u0010 J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#¢\u0006\u0004\b$\u0010%R\u0011\u0010\u001b\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;", "", "<init>", "()V", "", "", "isWholeNumber", "(F)Z", "", "", "toNumberOfRepsAsIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "toTimeAsIntSecondsOrNull", "toWeightAsFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "Landroid/icu/text/DecimalFormat;", "text", "", "parseOrNullAnyLocale", "(Landroid/icu/text/DecimalFormat;Ljava/lang/String;)Ljava/lang/Number;", "hasOneDecimalPlaceMax", "(Ljava/lang/Number;)Z", "fromSecondsToTimeString", "(I)Ljava/lang/String;", "Ljava/util/UUID;", "id", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "(Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "toRoundedString", "(F)Ljava/lang/String;", "isValidNumberOfReps", "(Ljava/lang/String;)Z", "isValidTime", "isValidWeight", "Lwc3/c;", "serializer", "()Lwc3/c;", "getDefault", "()Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "repsFormat", "Landroid/icu/text/DecimalFormat;", "timeFormat", "weightFormat", "Li93/f;", "validWeightRange", "Li93/f;", "MAX_DIGITS_IN_TIME", "I", "Li93/j;", "validTimeInSecondsRange", "Li93/j;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String fromSecondsToTimeString(int i13) {
            String strM95635k = AbstractC31061c.m95635k(i13 / 60, String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13 % 60)}, 1)));
            int length = strM95635k.length();
            for (int i14 = 0; i14 < length; i14++) {
                if (strM95635k.charAt(i14) != '0') {
                    String strSubstring = strM95635k.substring(i14);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    return strSubstring;
                }
            }
            return "";
        }

        private final boolean hasOneDecimalPlaceMax(Number number) {
            return new BigDecimal(number.toString()).scale() <= 1;
        }

        private final boolean isWholeNumber(float f13) {
            return f13 % 1.0f == 0.0f;
        }

        private final Number parseOrNullAnyLocale(DecimalFormat decimalFormat, String str) {
            Number numberM85264a = AbstractC28164g1.m85264a(decimalFormat, str);
            if (numberM85264a != null) {
                return numberM85264a;
            }
            Number numberM85264a2 = AbstractC28164g1.m85264a(decimalFormat, AbstractC39421y.m125927L(str, '.', DateTimeRange.lowerUpperDelimiter));
            return numberM85264a2 == null ? AbstractC28164g1.m85264a(decimalFormat, AbstractC39421y.m125927L(str, DateTimeRange.lowerUpperDelimiter, '.')) : numberM85264a2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Integer toNumberOfRepsAsIntOrNull(String str) {
            if (str.length() == 0) {
                return 0;
            }
            Number numberM85264a = AbstractC28164g1.m85264a(WorkoutSet.repsFormat, str);
            if (numberM85264a != null) {
                Integer numValueOf = Integer.valueOf(numberM85264a.intValue());
                if (numValueOf.intValue() >= 0) {
                    return numValueOf;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Integer toTimeAsIntSecondsOrNull(String str) {
            if (str.length() == 0) {
                return 0;
            }
            if (str.length() > 5) {
                return null;
            }
            String strM125867M0 = AbstractC39414r.m125867M0(2, str);
            String strM125857C0 = str.length() <= 2 ? UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE : AbstractC39414r.m125857C0(str, AbstractC12889b.m36278i0(0, str.length() - 2));
            Number numberM85264a = AbstractC28164g1.m85264a(WorkoutSet.timeFormat, strM125867M0);
            if (numberM85264a != null) {
                Integer numValueOf = Integer.valueOf(numberM85264a.intValue());
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    Number numberM85264a2 = AbstractC28164g1.m85264a(WorkoutSet.timeFormat, strM125857C0);
                    if (numberM85264a2 != null) {
                        Integer numValueOf2 = Integer.valueOf(numberM85264a2.intValue());
                        if (numValueOf2.intValue() < 0) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            Integer numValueOf3 = Integer.valueOf((numValueOf2.intValue() * 60) + iIntValue);
                            int iIntValue2 = numValueOf3.intValue();
                            C18284j c18284j = WorkoutSet.validTimeInSecondsRange;
                            int i13 = c18284j.f71133w;
                            if (iIntValue2 <= c18284j.f71134x && i13 <= iIntValue2) {
                                return numValueOf3;
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Float toWeightAsFloatOrNull(String str) {
            if (str.length() == 0) {
                return Float.valueOf(0.0f);
            }
            Number orNullAnyLocale = parseOrNullAnyLocale(WorkoutSet.weightFormat, str);
            if (orNullAnyLocale != null) {
                if (!WorkoutSet.INSTANCE.hasOneDecimalPlaceMax(orNullAnyLocale)) {
                    orNullAnyLocale = null;
                }
                if (orNullAnyLocale != null) {
                    Float fValueOf = Float.valueOf(orNullAnyLocale.floatValue());
                    if (WorkoutSet.validWeightRange.mo52654c(Float.valueOf(fValueOf.floatValue()))) {
                        return fValueOf;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final WorkoutSet m134199default(UUID id4) {
            AbstractC22676k.m65750j(id4, "id");
            return new WorkoutSet(0, (Integer) null, 0.0f, id4);
        }

        public final WorkoutSet getDefault() {
            return new WorkoutSet(0, null, 0.0f);
        }

        public final boolean isValidNumberOfReps(String str) {
            AbstractC22676k.m65750j(str, "<this>");
            return toNumberOfRepsAsIntOrNull(str) != null;
        }

        public final boolean isValidTime(String str) {
            AbstractC22676k.m65750j(str, "<this>");
            return toTimeAsIntSecondsOrNull(str) != null;
        }

        public final boolean isValidWeight(String str) {
            AbstractC22676k.m65750j(str, "<this>");
            return toWeightAsFloatOrNull(str) != null;
        }

        public final InterfaceC37138c serializer() {
            return WorkoutSet$$serializer.INSTANCE;
        }

        public final String toRoundedString(float f13) {
            return isWholeNumber(f13) ? String.valueOf(AbstractC12889b.m36258X(f13)) : String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f13)}, 1));
        }

        private Companion() {
        }
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        decimalFormat.setParseIntegerOnly(true);
        repsFormat = decimalFormat;
        DecimalFormat decimalFormat2 = new DecimalFormat("#");
        decimalFormat2.setParseIntegerOnly(true);
        timeFormat = decimalFormat2;
        weightFormat = new DecimalFormat("#.#");
        validWeightRange = new C18279e(0.0f, 999.9f);
        validTimeInSecondsRange = AbstractC12889b.m36278i0(0, DateTimeConstants.MILLIS_PER_MINUTE);
    }

    public /* synthetic */ WorkoutSet(int i13, String str, String str2, String str3, UUID uuid, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i13 & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 5, WorkoutSet$$serializer.INSTANCE.getDescriptor());
        }
        this.numberOfReps = str;
        this.time = (i13 & 2) == 0 ? "" : str2;
        this.weight = str3;
        if ((i13 & 8) == 0) {
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            this.id = uuidRandomUUID;
        } else {
            this.id = uuid;
        }
        Companion companion = INSTANCE;
        if (!companion.isValidNumberOfReps(str)) {
            throw new IllegalArgumentException(AbstractC2875y.m8299l(str, " is an invalid numberOfReps, must be an empty string or convertible to a non-negative integer").toString());
        }
        if (!companion.isValidTime(this.time)) {
            throw new IllegalArgumentException(AbstractC2875y.m8299l(this.time, " is an invalid time, it must be no more than 5 characters, all digits, the last two digits must be convertible to a non-negative integer representing seconds, any preceding digits must be convertible to a non-negative integer representing minutes, and the total time must be below 60,0000 seconds").toString());
        }
        if (!companion.isValidWeight(str3)) {
            throw new IllegalArgumentException(AbstractC2875y.m8299l(str3, " is an invalid weight, must be an empty string or convertible to a float in the range [0, 1000) with no more than one decimal of precision").toString());
        }
    }

    public static /* synthetic */ WorkoutSet copy$default(WorkoutSet workoutSet, String str, String str2, String str3, UUID uuid, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = workoutSet.numberOfReps;
        }
        if ((i13 & 2) != 0) {
            str2 = workoutSet.time;
        }
        if ((i13 & 4) != 0) {
            str3 = workoutSet.weight;
        }
        if ((i13 & 8) != 0) {
            uuid = workoutSet.id;
        }
        return workoutSet.copy(str, str2, str3, uuid);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutSet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.numberOfReps);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.time, "")) {
            output.encodeStringElement(serialDesc, 1, self.time);
        }
        output.encodeStringElement(serialDesc, 2, self.weight);
        if (!output.shouldEncodeElementDefault(serialDesc, 3)) {
            UUID uuid = self.id;
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            if (AbstractC22676k.m65745e(uuid, uuidRandomUUID)) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 3, C24753c.f96791a, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNumberOfReps() {
        return this.numberOfReps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WorkoutSet copy(String numberOfReps, String time, String weight, UUID id4) {
        AbstractC22676k.m65750j(numberOfReps, "numberOfReps");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(weight, "weight");
        AbstractC22676k.m65750j(id4, "id");
        return new WorkoutSet(numberOfReps, time, weight, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutSet)) {
            return false;
        }
        WorkoutSet workoutSet = (WorkoutSet) other;
        return AbstractC22676k.m65745e(this.numberOfReps, workoutSet.numberOfReps) && AbstractC22676k.m65745e(this.time, workoutSet.time) && AbstractC22676k.m65745e(this.weight, workoutSet.weight) && AbstractC22676k.m65745e(this.id, workoutSet.id);
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getNumberOfReps() {
        return this.numberOfReps;
    }

    public final int getNumberOfRepsAsInt() {
        Integer numberOfRepsAsIntOrNull = INSTANCE.toNumberOfRepsAsIntOrNull(this.numberOfReps);
        if (numberOfRepsAsIntOrNull != null) {
            return numberOfRepsAsIntOrNull.intValue();
        }
        return 0;
    }

    public final String getTime() {
        return this.time;
    }

    public final Integer getTimeAsIntSeconds() {
        if (this.time.length() == 0) {
            return null;
        }
        return INSTANCE.toTimeAsIntSecondsOrNull(this.time);
    }

    public final String getWeight() {
        return this.weight;
    }

    public final float getWeightAsFloat() {
        Float weightAsFloatOrNull = INSTANCE.toWeightAsFloatOrNull(this.weight);
        if (weightAsFloatOrNull != null) {
            return weightAsFloatOrNull.floatValue();
        }
        return 0.0f;
    }

    public int hashCode() {
        return this.id.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.numberOfReps.hashCode() * 31, 31, this.time), 31, this.weight);
    }

    public String toString() {
        String str = this.numberOfReps;
        String str2 = this.time;
        String str3 = this.weight;
        UUID uuid = this.id;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WorkoutSet(numberOfReps=", str, ", time=", str2, ", weight=");
        sbM32001t.append(str3);
        sbM32001t.append(", id=");
        sbM32001t.append(uuid);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public WorkoutSet(String numberOfReps, String time, String weight, UUID id4) {
        AbstractC22676k.m65750j(numberOfReps, "numberOfReps");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(weight, "weight");
        AbstractC22676k.m65750j(id4, "id");
        this.numberOfReps = numberOfReps;
        this.time = time;
        this.weight = weight;
        this.id = id4;
        Companion companion = INSTANCE;
        if (companion.isValidNumberOfReps(numberOfReps)) {
            if (companion.isValidTime(time)) {
                if (!companion.isValidWeight(weight)) {
                    throw new IllegalArgumentException(AbstractC2875y.m8299l(weight, " is an invalid weight, must be an empty string or convertible to a float in the range [0, 1000) with no more than one decimal of precision").toString());
                }
                return;
            }
            throw new IllegalArgumentException(AbstractC2875y.m8299l(time, " is an invalid time, it must be no more than 5 characters, all digits, the last two digits must be convertible to a non-negative integer representing seconds, any preceding digits must be convertible to a non-negative integer representing minutes, and the total time must be below 60,0000 seconds").toString());
        }
        throw new IllegalArgumentException(AbstractC2875y.m8299l(numberOfReps, " is an invalid numberOfReps, must be an empty string or convertible to a non-negative integer").toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkoutSet(String str, String str2, String str3, UUID uuid, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str2 = (i13 & 2) != 0 ? "" : str2;
        if ((i13 & 8) != 0) {
            uuid = UUID.randomUUID();
            AbstractC22676k.m65749i(uuid, "randomUUID(...)");
        }
        this(str, str2, str3, uuid);
    }

    public /* synthetic */ WorkoutSet(int i13, Integer num, float f13, UUID uuid, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? null : num, f13, uuid);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkoutSet(int i13, Integer num, float f13, UUID id4) {
        String strFromSecondsToTimeString;
        AbstractC22676k.m65750j(id4, "id");
        this(String.valueOf(i13), (num == null || (strFromSecondsToTimeString = INSTANCE.fromSecondsToTimeString(num.intValue())) == null) ? "" : strFromSecondsToTimeString, INSTANCE.toRoundedString(((Number) AbstractC12889b.m36288r(Float.valueOf(f13), validWeightRange)).floatValue()), id4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkoutSet(int i13, Integer num, float f13) {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        this(i13, num, f13, uuidRandomUUID);
    }

    public /* synthetic */ WorkoutSet(int i13, Integer num, float f13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? null : num, f13);
    }
}
