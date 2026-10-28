package p715kotlin.time;

import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4353o;
import e93.AbstractC12889b;
import i93.C18287m;
import l83.InterfaceC23457c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\b\u0087@\u0018\u0000 \u0085\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0085\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b \u0010$J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b%\u0010!J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b.\u0010\u000fJ\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\u000fJ\r\u00103\u001a\u00020\u000b¢\u0006\u0004\b2\u0010\u000fJ\r\u00105\u001a\u00020\u000b¢\u0006\u0004\b4\u0010\u000fJ\u0018\u00108\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b6\u00107JR\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u001092*\u0010;\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000:H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b<\u0010=JL\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u001092$\u0010;\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000?H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b<\u0010@JF\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u001092\u001e\u0010;\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b<\u0010BJ@\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u001092\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000CH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b<\u0010DJ\u0015\u0010G\u001a\u00020#2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bE\u0010FJ\u0015\u0010I\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bH\u0010,J\u0015\u0010L\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bJ\u0010KJ\u000f\u0010P\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ?\u0010Z\u001a\u00020W*\u00060Qj\u0002`R2\u0006\u0010S\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00062\u0006\u0010*\u001a\u00020M2\u0006\u0010V\u001a\u00020\u000bH\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010P\u001a\u00020M2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010[\u001a\u00020\u0006¢\u0006\u0004\bN\u0010\\J\r\u0010^\u001a\u00020M¢\u0006\u0004\b]\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010_R\u0014\u0010a\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0005R\u0015\u0010d\u001a\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010i\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\bh\u0010\u0005R\u001a\u0010m\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bk\u0010l\u001a\u0004\bj\u0010cR\u001a\u0010p\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bo\u0010l\u001a\u0004\bn\u0010cR\u001a\u0010s\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\br\u0010l\u001a\u0004\bq\u0010cR\u001a\u0010v\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bu\u0010l\u001a\u0004\bt\u0010cR\u0011\u0010x\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bw\u0010\u0005R\u0011\u0010z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\by\u0010\u0005R\u0011\u0010|\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b{\u0010\u0005R\u0011\u0010~\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b}\u0010\u0005R\u0012\u0010\u0080\u0001\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0005R\u0013\u0010\u0082\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0005R\u0013\u0010\u0084\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0086\u0001"}, m65681d2 = {"Lkotlin/time/Duration;", "", "", "rawValue", "constructor-impl", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isInNanos-impl", "(J)Z", "isInNanos", "isInMillis-impl", "isInMillis", "unaryMinus-UwyO8pc", "unaryMinus", "plus-LRDsOJo", "(JJ)J", "plus", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "addValuesMixedRanges", "minus-LRDsOJo", "minus", "scale", "times-UwyO8pc", "(JI)J", "times", "", "(JD)J", "div-UwyO8pc", "div", "div-LRDsOJo", "(JJ)D", "Lkotlin/time/DurationUnit;", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "truncateTo", "isNegative-impl", "isNegative", "isPositive-impl", "isPositive", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "compareTo-LRDsOJo", "(JJ)I", "compareTo", "T", "Lkotlin/Function5;", "action", "toComponents-impl", "(JLc93/o;)Ljava/lang/Object;", "toComponents", "Lkotlin/Function4;", "(JLc93/n;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLc93/m;)Ljava/lang/Object;", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toDouble", "toLong-impl", "toLong", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toInt", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "Ll83/a0;", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "appendFractional", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString-impl", "toIsoString", "J", "getValue-impl", "value", "getUnitDiscriminator-impl", "(J)I", "unitDiscriminator", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "getAbsoluteValue-UwyO8pc", "absoluteValue", "getHoursComponent-impl", "getHoursComponent$annotations", "()V", "hoursComponent", "getMinutesComponent-impl", "getMinutesComponent$annotations", "minutesComponent", "getSecondsComponent-impl", "getSecondsComponent$annotations", "secondsComponent", "getNanosecondsComponent-impl", "getNanosecondsComponent$annotations", "nanosecondsComponent", "getInWholeDays-impl", "inWholeDays", "getInWholeHours-impl", "inWholeHours", "getInWholeMinutes-impl", "inWholeMinutes", "getInWholeSeconds-impl", "inWholeSeconds", "getInWholeMilliseconds-impl", "inWholeMilliseconds", "getInWholeMicroseconds-impl", "inWholeMicroseconds", "getInWholeNanoseconds-impl", "inWholeNanoseconds", "Companion", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m134262constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);
    public static final long INVALID_RAW_VALUE = 9223372036854759646L;
    private static final long INVALID = m134262constructorimpl(INVALID_RAW_VALUE);

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\u0080\u0004¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0087\u0080\u0004J\u0019\u00108\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u000209H\u0086\u0080\u0004¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u000209H\u0086\u0080\u0004¢\u0006\u0004\b=\u0010;J\u0019\u0010>\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u000209H\u0086\u0080\u0004¢\u0006\u0002\b?J\u0019\u0010@\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u000209H\u0086\u0080\u0004¢\u0006\u0002\bAR\u001d\u0010\n\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\u00020\u0005X\u0080\u0084\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u000f\u0010\u0013\u001a\u00020\u0007X\u0080Ô\b¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u00020\u0005X\u0080\u0084\b¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\rR \u0010\u001d\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\u001d\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010\tR \u0010\u001d\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u001f\u0010$\u001a\u0004\b!\u0010%R \u0010&\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R \u0010&\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b'\u0010#\u001a\u0004\b(\u0010\tR \u0010&\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b'\u0010$\u001a\u0004\b(\u0010%R \u0010)\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R \u0010)\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b*\u0010#\u001a\u0004\b+\u0010\tR \u0010)\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b*\u0010$\u001a\u0004\b+\u0010%R \u0010,\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R \u0010,\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b-\u0010#\u001a\u0004\b.\u0010\tR \u0010,\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b-\u0010$\u001a\u0004\b.\u0010%R \u0010/\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R \u0010/\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b0\u0010#\u001a\u0004\b1\u0010\tR \u0010/\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b0\u0010$\u001a\u0004\b1\u0010%R \u00102\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R \u00102\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b3\u0010#\u001a\u0004\b4\u0010\tR \u00102\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b3\u0010$\u001a\u0004\b4\u0010%R \u00105\u001a\u00020\u0005*\u00020\u001e8Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b6\u0010 \u001a\u0004\b7\u0010\"R \u00105\u001a\u00020\u0005*\u00020\u00078Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b6\u0010#\u001a\u0004\b7\u0010\tR \u00105\u001a\u00020\u0005*\u00020\u00188Æ\u0002X\u0087\u0084\b¢\u0006\f\u0012\u0004\b6\u0010$\u001a\u0004\b7\u0010%¨\u0006B"}, m65681d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "fromRawValue", "Lkotlin/time/Duration;", "rawValue", "", "fromRawValue-UwyO8pc$kotlin_stdlib", "(J)J", "ZERO", "getZERO-UwyO8pc$annotations", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "INVALID_RAW_VALUE", "INVALID", "getINVALID-UwyO8pc$kotlin_stdlib$annotations", "getINVALID-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "(J)V", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m134310getDaysUwyO8pc(int i13) {
            return DurationKt.toDuration(i13, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134312getDaysUwyO8pc$annotations(double d3) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m134316getHoursUwyO8pc(int i13) {
            return DurationKt.toDuration(i13, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134318getHoursUwyO8pc$annotations(double d3) {
        }

        /* JADX INFO: renamed from: getINVALID-UwyO8pc$kotlin_stdlib$annotations, reason: not valid java name */
        public static /* synthetic */ void m134321getINVALIDUwyO8pc$kotlin_stdlib$annotations() {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m134323getMicrosecondsUwyO8pc(int i13) {
            return DurationKt.toDuration(i13, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134325getMicrosecondsUwyO8pc$annotations(double d3) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m134329getMillisecondsUwyO8pc(int i13) {
            return DurationKt.toDuration(i13, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134331getMillisecondsUwyO8pc$annotations(double d3) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m134335getMinutesUwyO8pc(int i13) {
            return DurationKt.toDuration(i13, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134337getMinutesUwyO8pc$annotations(double d3) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m134341getNanosecondsUwyO8pc(int i13) {
            return DurationKt.toDuration(i13, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134343getNanosecondsUwyO8pc$annotations(double d3) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m134347getSecondsUwyO8pc(int i13) {
            return DurationKt.toDuration(i13, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134349getSecondsUwyO8pc$annotations(double d3) {
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134352getZEROUwyO8pc$annotations() {
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            AbstractC22676k.m65750j(sourceUnit, "sourceUnit");
            AbstractC22676k.m65750j(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* JADX INFO: renamed from: fromRawValue-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m134353fromRawValueUwyO8pc$kotlin_stdlib(long rawValue) {
            long jM134262constructorimpl = Duration.m134262constructorimpl(rawValue);
            if (DurationJvmKt.getDurationAssertionsEnabled()) {
                if (Duration.m134286isInNanosimpl(jM134262constructorimpl)) {
                    long jM134282getValueimpl = Duration.m134282getValueimpl(jM134262constructorimpl);
                    if (-4611686018426999999L <= jM134282getValueimpl && jM134282getValueimpl < 4611686018427000000L) {
                        return jM134262constructorimpl;
                    }
                    throw new AssertionError(Duration.m134282getValueimpl(jM134262constructorimpl) + " ns is out of nanoseconds range");
                }
                long jM134282getValueimpl2 = Duration.m134282getValueimpl(jM134262constructorimpl);
                if (-4611686018427387903L >= jM134282getValueimpl2 || jM134282getValueimpl2 >= DurationKt.MAX_MILLIS) {
                    long jM134282getValueimpl3 = Duration.m134282getValueimpl(jM134262constructorimpl);
                    if (jM134282getValueimpl3 != DurationKt.MAX_MILLIS && jM134282getValueimpl3 != -4611686018427387903L) {
                        throw new AssertionError(Duration.m134282getValueimpl(jM134262constructorimpl) + " ms is out of milliseconds range");
                    }
                }
                long jM134282getValueimpl4 = Duration.m134282getValueimpl(jM134262constructorimpl);
                if (-4611686018426L > jM134282getValueimpl4 || jM134282getValueimpl4 >= 4611686018427L) {
                    return jM134262constructorimpl;
                }
                throw new AssertionError(Duration.m134282getValueimpl(jM134262constructorimpl) + " ms is denormalized");
            }
            return jM134262constructorimpl;
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m134354getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* JADX INFO: renamed from: getINVALID-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m134355getINVALIDUwyO8pc$kotlin_stdlib() {
            return Duration.INVALID;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m134356getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m134357getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m134358parseUwyO8pc(String value) {
            AbstractC22676k.m65750j(value, "value");
            try {
                long duration$default = DurationKt.parseDuration$default(value, false, false, 4, null);
                if (Duration.m134267equalsimpl0(duration$default, Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib())) {
                    throw new IllegalStateException("invariant failed");
                }
                return duration$default;
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("Invalid duration string format: '", value, "'."), e5);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m134359parseIsoStringUwyO8pc(String value) {
            AbstractC22676k.m65750j(value, "value");
            try {
                long duration$default = DurationKt.parseDuration$default(value, true, false, 4, null);
                if (Duration.m134267equalsimpl0(duration$default, Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib())) {
                    throw new IllegalStateException("invariant failed");
                }
                return duration$default;
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("Invalid ISO duration string format: '", value, "'."), e5);
            }
        }

        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m134360parseIsoStringOrNullFghU774(String value) {
            AbstractC22676k.m65750j(value, "value");
            long duration = DurationKt.parseDuration(value, true, false);
            if (Duration.m134267equalsimpl0(duration, Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib())) {
                return null;
            }
            return Duration.m134260boximpl(duration);
        }

        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m134361parseOrNullFghU774(String value) {
            AbstractC22676k.m65750j(value, "value");
            long duration = DurationKt.parseDuration(value, false, false);
            if (Duration.m134267equalsimpl0(duration, Duration.INSTANCE.m134355getINVALIDUwyO8pc$kotlin_stdlib())) {
                return null;
            }
            return Duration.m134260boximpl(duration);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m134311getDaysUwyO8pc(long j7) {
            return DurationKt.toDuration(j7, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134313getDaysUwyO8pc$annotations(int i13) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m134317getHoursUwyO8pc(long j7) {
            return DurationKt.toDuration(j7, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134319getHoursUwyO8pc$annotations(int i13) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m134324getMicrosecondsUwyO8pc(long j7) {
            return DurationKt.toDuration(j7, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134326getMicrosecondsUwyO8pc$annotations(int i13) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m134330getMillisecondsUwyO8pc(long j7) {
            return DurationKt.toDuration(j7, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134332getMillisecondsUwyO8pc$annotations(int i13) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m134336getMinutesUwyO8pc(long j7) {
            return DurationKt.toDuration(j7, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134338getMinutesUwyO8pc$annotations(int i13) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m134342getNanosecondsUwyO8pc(long j7) {
            return DurationKt.toDuration(j7, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134344getNanosecondsUwyO8pc$annotations(int i13) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m134348getSecondsUwyO8pc(long j7) {
            return DurationKt.toDuration(j7, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134350getSecondsUwyO8pc$annotations(int i13) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m134309getDaysUwyO8pc(double d3) {
            return DurationKt.toDuration(d3, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134314getDaysUwyO8pc$annotations(long j7) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m134315getHoursUwyO8pc(double d3) {
            return DurationKt.toDuration(d3, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134320getHoursUwyO8pc$annotations(long j7) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m134322getMicrosecondsUwyO8pc(double d3) {
            return DurationKt.toDuration(d3, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134327getMicrosecondsUwyO8pc$annotations(long j7) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m134328getMillisecondsUwyO8pc(double d3) {
            return DurationKt.toDuration(d3, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134333getMillisecondsUwyO8pc$annotations(long j7) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m134334getMinutesUwyO8pc(double d3) {
            return DurationKt.toDuration(d3, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134339getMinutesUwyO8pc$annotations(long j7) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m134340getNanosecondsUwyO8pc(double d3) {
            return DurationKt.toDuration(d3, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134345getNanosecondsUwyO8pc$annotations(long j7) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m134346getSecondsUwyO8pc(double d3) {
            return DurationKt.toDuration(d3, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m134351getSecondsUwyO8pc$annotations(long j7) {
        }
    }

    @InterfaceC23457c
    private /* synthetic */ Duration(long j7) {
        this.rawValue = j7;
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m134258addValuesMixedRangesUwyO8pc(long j7, long j13, long j14) {
        long jNanosToMillis = DurationKt.nanosToMillis(j14);
        long jAddMillisWithoutOverflow = DurationKt.addMillisWithoutOverflow(j13, jNanosToMillis);
        if (-4611686018426L > jAddMillisWithoutOverflow || jAddMillisWithoutOverflow >= 4611686018427L) {
            return DurationKt.durationOfMillis(jAddMillisWithoutOverflow);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jAddMillisWithoutOverflow) + (j14 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m134259appendFractionalimpl(long j7, StringBuilder sb4, int i13, int i14, int i15, String str, boolean z4) {
        sb4.append(i13);
        if (i14 != 0) {
            sb4.append('.');
            String strM125895n0 = AbstractC39414r.m125895n0(i15, String.valueOf(i14));
            int i16 = -1;
            int length = strM125895n0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i17 = length - 1;
                    if (strM125895n0.charAt(length) != '0') {
                        i16 = length;
                        break;
                    } else if (i17 < 0) {
                        break;
                    } else {
                        length = i17;
                    }
                }
            }
            int i18 = i16 + 1;
            if (z4 || i18 >= 3) {
                sb4.append((CharSequence) strM125895n0, 0, ((i16 + 3) / 3) * 3);
            } else {
                sb4.append((CharSequence) strM125895n0, 0, i18);
            }
        }
        sb4.append(str);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m134260boximpl(long j7) {
        return new Duration(j7);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m134262constructorimpl(long j7) {
        return j7;
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m134263divLRDsOJo(long j7, long j13) {
        DurationUnit durationUnit = (DurationUnit) AbstractC30060g.m92091M(m134280getStorageUnitimpl(j7), m134280getStorageUnitimpl(j13));
        return m134298toDoubleimpl(j7, durationUnit) / m134298toDoubleimpl(j13, durationUnit);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m134265divUwyO8pc(long j7, int i13) {
        if (i13 == 0) {
            if (m134289isPositiveimpl(j7)) {
                return INFINITE;
            }
            if (m134288isNegativeimpl(j7)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m134286isInNanosimpl(j7)) {
            return DurationKt.durationOfNanos(m134282getValueimpl(j7) / ((long) i13));
        }
        if (m134287isInfiniteimpl(j7)) {
            return m134293timesUwyO8pc(j7, Integer.signum(i13));
        }
        long j13 = i13;
        long jM134282getValueimpl = m134282getValueimpl(j7) / j13;
        if (-4611686018426L > jM134282getValueimpl || jM134282getValueimpl >= 4611686018427L) {
            return DurationKt.durationOfMillis(jM134282getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM134282getValueimpl) + (DurationKt.millisToNanos(m134282getValueimpl(j7) - (jM134282getValueimpl * j13)) / j13));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m134266equalsimpl(long j7, Object obj) {
        return (obj instanceof Duration) && j7 == ((Duration) obj).getRawValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m134267equalsimpl0(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m134268getAbsoluteValueUwyO8pc(long j7) {
        return m134288isNegativeimpl(j7) ? m134306unaryMinusUwyO8pc(j7) : j7;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m134269getHoursComponentimpl(long j7) {
        if (m134287isInfiniteimpl(j7)) {
            return 0;
        }
        return (int) (m134271getInWholeHoursimpl(j7) % ((long) 24));
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m134270getInWholeDaysimpl(long j7) {
        return m134301toLongimpl(j7, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m134271getInWholeHoursimpl(long j7) {
        return m134301toLongimpl(j7, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m134272getInWholeMicrosecondsimpl(long j7) {
        return m134301toLongimpl(j7, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m134273getInWholeMillisecondsimpl(long j7) {
        return (m134285isInMillisimpl(j7) && m134284isFiniteimpl(j7)) ? m134282getValueimpl(j7) : m134301toLongimpl(j7, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m134274getInWholeMinutesimpl(long j7) {
        return m134301toLongimpl(j7, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m134275getInWholeNanosecondsimpl(long j7) {
        long jM134282getValueimpl = m134282getValueimpl(j7);
        if (m134286isInNanosimpl(j7)) {
            return jM134282getValueimpl;
        }
        if (jM134282getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM134282getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(jM134282getValueimpl);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m134276getInWholeSecondsimpl(long j7) {
        return m134301toLongimpl(j7, DurationUnit.SECONDS);
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m134277getMinutesComponentimpl(long j7) {
        if (m134287isInfiniteimpl(j7)) {
            return 0;
        }
        return (int) (m134274getInWholeMinutesimpl(j7) % ((long) 60));
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m134278getNanosecondsComponentimpl(long j7) {
        if (m134287isInfiniteimpl(j7)) {
            return 0;
        }
        return (int) (m134285isInMillisimpl(j7) ? DurationKt.millisToNanos(m134282getValueimpl(j7) % ((long) 1000)) : m134282getValueimpl(j7) % ((long) 1000000000));
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m134279getSecondsComponentimpl(long j7) {
        if (m134287isInfiniteimpl(j7)) {
            return 0;
        }
        return (int) (m134276getInWholeSecondsimpl(j7) % ((long) 60));
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m134280getStorageUnitimpl(long j7) {
        return m134286isInNanosimpl(j7) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m134281getUnitDiscriminatorimpl(long j7) {
        return ((int) j7) & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final long m134282getValueimpl(long j7) {
        return j7 >> 1;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m134283hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m134284isFiniteimpl(long j7) {
        return !m134287isInfiniteimpl(j7);
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m134285isInMillisimpl(long j7) {
        return (((int) j7) & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    public static final boolean m134286isInNanosimpl(long j7) {
        return (((int) j7) & 1) == 0;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m134287isInfiniteimpl(long j7) {
        return j7 == INFINITE || j7 == NEG_INFINITE;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m134288isNegativeimpl(long j7) {
        return j7 < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m134289isPositiveimpl(long j7) {
        return j7 > 0;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m134290minusLRDsOJo(long j7, long j13) {
        return m134291plusLRDsOJo(j7, m134306unaryMinusUwyO8pc(j13));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m134291plusLRDsOJo(long j7, long j13) {
        if ((((int) j7) & 1) != (((int) j13) & 1)) {
            return m134285isInMillisimpl(j7) ? m134258addValuesMixedRangesUwyO8pc(j7, m134282getValueimpl(j7), m134282getValueimpl(j13)) : m134258addValuesMixedRangesUwyO8pc(j7, m134282getValueimpl(j13), m134282getValueimpl(j7));
        }
        if (m134286isInNanosimpl(j7)) {
            return DurationKt.durationOfNanosNormalized(m134282getValueimpl(j7) + m134282getValueimpl(j13));
        }
        long jAddMillisWithoutOverflow = DurationKt.addMillisWithoutOverflow(m134282getValueimpl(j7), m134282getValueimpl(j13));
        if (jAddMillisWithoutOverflow != INVALID_RAW_VALUE) {
            return (jAddMillisWithoutOverflow == DurationKt.MAX_MILLIS || jAddMillisWithoutOverflow == -4611686018427387903L) ? DurationKt.durationOfMillis(jAddMillisWithoutOverflow) : DurationKt.durationOfMillisNormalized(jAddMillisWithoutOverflow);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m134293timesUwyO8pc(long j7, int i13) {
        if (m134287isInfiniteimpl(j7)) {
            if (i13 != 0) {
                return i13 > 0 ? j7 : m134306unaryMinusUwyO8pc(j7);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i13 == 0) {
            return ZERO;
        }
        long jM134282getValueimpl = m134282getValueimpl(j7);
        long j13 = i13;
        long j14 = jM134282getValueimpl * j13;
        if (!m134286isInNanosimpl(j7)) {
            if (j14 / j13 == jM134282getValueimpl) {
                return DurationKt.durationOfMillis(AbstractC12889b.m36287q(j14, new C18287m(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
            return Integer.signum(i13) * Long.signum(jM134282getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM134282getValueimpl && jM134282getValueimpl < 2147483648L) {
            return DurationKt.durationOfNanos(j14);
        }
        if (j14 / j13 == jM134282getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j14);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM134282getValueimpl);
        long j15 = jNanosToMillis * j13;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM134282getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j13) + j15;
        if (j15 / j13 != jNanosToMillis || (jNanosToMillis2 ^ j15) < 0) {
            return Integer.signum(i13) * Long.signum(jM134282getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        return DurationKt.durationOfMillis(AbstractC12889b.m36287q(jNanosToMillis2, new C18287m(-4611686018427387903L, DurationKt.MAX_MILLIS)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m134296toComponentsimpl(long j7, InterfaceC4353o action) {
        AbstractC22676k.m65750j(action, "action");
        return (T) action.invoke(Long.valueOf(m134270getInWholeDaysimpl(j7)), Integer.valueOf(m134269getHoursComponentimpl(j7)), Integer.valueOf(m134277getMinutesComponentimpl(j7)), Integer.valueOf(m134279getSecondsComponentimpl(j7)), Integer.valueOf(m134278getNanosecondsComponentimpl(j7)));
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m134298toDoubleimpl(long j7, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        if (j7 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j7 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m134282getValueimpl(j7), m134280getStorageUnitimpl(j7), unit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m134299toIntimpl(long j7, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        return (int) AbstractC12889b.m36286p(m134301toLongimpl(j7, unit), -2147483648L, 2147483647L);
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m134300toIsoStringimpl(long j7) {
        StringBuilder sb4 = new StringBuilder();
        if (m134288isNegativeimpl(j7)) {
            sb4.append('-');
        }
        sb4.append("PT");
        long jM134268getAbsoluteValueUwyO8pc = m134268getAbsoluteValueUwyO8pc(j7);
        long jM134271getInWholeHoursimpl = m134271getInWholeHoursimpl(jM134268getAbsoluteValueUwyO8pc);
        int iM134277getMinutesComponentimpl = m134277getMinutesComponentimpl(jM134268getAbsoluteValueUwyO8pc);
        int iM134279getSecondsComponentimpl = m134279getSecondsComponentimpl(jM134268getAbsoluteValueUwyO8pc);
        int iM134278getNanosecondsComponentimpl = m134278getNanosecondsComponentimpl(jM134268getAbsoluteValueUwyO8pc);
        long j13 = m134287isInfiniteimpl(j7) ? 9999999999999L : jM134271getInWholeHoursimpl;
        boolean z4 = false;
        boolean z13 = j13 != 0;
        boolean z14 = (iM134279getSecondsComponentimpl == 0 && iM134278getNanosecondsComponentimpl == 0) ? false : true;
        if (iM134277getMinutesComponentimpl != 0 || (z14 && z13)) {
            z4 = true;
        }
        if (z13) {
            sb4.append(j13);
            sb4.append('H');
        }
        if (z4) {
            sb4.append(iM134277getMinutesComponentimpl);
            sb4.append('M');
        }
        if (z14 || (!z13 && !z4)) {
            m134259appendFractionalimpl(j7, sb4, iM134279getSecondsComponentimpl, iM134278getNanosecondsComponentimpl, 9, "S", true);
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m134301toLongimpl(long j7, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        if (j7 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j7 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m134282getValueimpl(j7), m134280getStorageUnitimpl(j7), unit);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m134302toStringimpl(long j7) {
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == INFINITE) {
            return "Infinity";
        }
        if (j7 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM134288isNegativeimpl = m134288isNegativeimpl(j7);
        StringBuilder sb4 = new StringBuilder();
        if (zM134288isNegativeimpl) {
            sb4.append('-');
        }
        long jM134268getAbsoluteValueUwyO8pc = m134268getAbsoluteValueUwyO8pc(j7);
        long jM134270getInWholeDaysimpl = m134270getInWholeDaysimpl(jM134268getAbsoluteValueUwyO8pc);
        int iM134269getHoursComponentimpl = m134269getHoursComponentimpl(jM134268getAbsoluteValueUwyO8pc);
        int iM134277getMinutesComponentimpl = m134277getMinutesComponentimpl(jM134268getAbsoluteValueUwyO8pc);
        int iM134279getSecondsComponentimpl = m134279getSecondsComponentimpl(jM134268getAbsoluteValueUwyO8pc);
        int iM134278getNanosecondsComponentimpl = m134278getNanosecondsComponentimpl(jM134268getAbsoluteValueUwyO8pc);
        int i13 = 0;
        boolean z4 = jM134270getInWholeDaysimpl != 0;
        boolean z13 = iM134269getHoursComponentimpl != 0;
        boolean z14 = iM134277getMinutesComponentimpl != 0;
        boolean z15 = (iM134279getSecondsComponentimpl == 0 && iM134278getNanosecondsComponentimpl == 0) ? false : true;
        if (z4) {
            sb4.append(jM134270getInWholeDaysimpl);
            sb4.append('d');
            i13 = 1;
        }
        if (z13 || (z4 && (z14 || z15))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb4.append(' ');
            }
            sb4.append(iM134269getHoursComponentimpl);
            sb4.append('h');
            i13 = i14;
        }
        if (z14 || (z15 && (z13 || z4))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb4.append(' ');
            }
            sb4.append(iM134277getMinutesComponentimpl);
            sb4.append('m');
            i13 = i15;
        }
        if (z15) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb4.append(' ');
            }
            if (iM134279getSecondsComponentimpl != 0 || z4 || z13 || z14) {
                m134259appendFractionalimpl(j7, sb4, iM134279getSecondsComponentimpl, iM134278getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM134278getNanosecondsComponentimpl >= 1000000) {
                m134259appendFractionalimpl(j7, sb4, iM134278getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, iM134278getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (iM134278getNanosecondsComponentimpl >= 1000) {
                m134259appendFractionalimpl(j7, sb4, iM134278getNanosecondsComponentimpl / 1000, iM134278getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb4.append(iM134278getNanosecondsComponentimpl);
                sb4.append("ns");
            }
            i13 = i16;
        }
        if (zM134288isNegativeimpl && i13 > 1) {
            sb4.insert(1, '(').append(')');
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m134304toStringimpl$default(long j7, DurationUnit durationUnit, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return m134303toStringimpl(j7, durationUnit, i13);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m134305truncateToUwyO8pc$kotlin_stdlib(long j7, DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        DurationUnit durationUnitM134280getStorageUnitimpl = m134280getStorageUnitimpl(j7);
        if (unit.compareTo(durationUnitM134280getStorageUnitimpl) <= 0 || m134287isInfiniteimpl(j7)) {
            return j7;
        }
        return DurationKt.toDuration(m134282getValueimpl(j7) - (m134282getValueimpl(j7) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, durationUnitM134280getStorageUnitimpl)), durationUnitM134280getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m134306unaryMinusUwyO8pc(long j7) {
        return DurationKt.durationOf(-m134282getValueimpl(j7), ((int) j7) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m134307compareToLRDsOJo(duration.getRawValue());
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m134307compareToLRDsOJo(long j7) {
        return m134261compareToLRDsOJo(this.rawValue, j7);
    }

    public boolean equals(Object other) {
        return m134266equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m134283hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m134302toStringimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m134261compareToLRDsOJo(long j7, long j13) {
        long j14 = j7 ^ j13;
        if (j14 < 0 || (((int) j14) & 1) == 0) {
            return AbstractC22676k.m65752l(j7, j13);
        }
        int i13 = (((int) j7) & 1) - (((int) j13) & 1);
        return m134288isNegativeimpl(j7) ? -i13 : i13;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m134295toComponentsimpl(long j7, InterfaceC4352n action) {
        AbstractC22676k.m65750j(action, "action");
        return (T) action.invoke(Long.valueOf(m134271getInWholeHoursimpl(j7)), Integer.valueOf(m134277getMinutesComponentimpl(j7)), Integer.valueOf(m134279getSecondsComponentimpl(j7)), Integer.valueOf(m134278getNanosecondsComponentimpl(j7)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m134297toComponentsimpl(long j7, Function3 action) {
        AbstractC22676k.m65750j(action, "action");
        return (T) action.invoke(Long.valueOf(m134274getInWholeMinutesimpl(j7)), Integer.valueOf(m134279getSecondsComponentimpl(j7)), Integer.valueOf(m134278getNanosecondsComponentimpl(j7)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m134294toComponentsimpl(long j7, InterfaceC4351m action) {
        AbstractC22676k.m65750j(action, "action");
        return (T) action.invoke(Long.valueOf(m134276getInWholeSecondsimpl(j7)), Integer.valueOf(m134278getNanosecondsComponentimpl(j7)));
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m134264divUwyO8pc(long j7, double d3) {
        int iM36257W = AbstractC12889b.m36257W(d3);
        if (iM36257W == d3 && iM36257W != 0) {
            return m134265divUwyO8pc(j7, iM36257W);
        }
        DurationUnit durationUnitM134280getStorageUnitimpl = m134280getStorageUnitimpl(j7);
        return DurationKt.toDuration(m134298toDoubleimpl(j7, durationUnitM134280getStorageUnitimpl) / d3, durationUnitM134280getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m134303toStringimpl(long j7, DurationUnit unit, int i13) {
        AbstractC22676k.m65750j(unit, "unit");
        if (i13 >= 0) {
            double dM134298toDoubleimpl = m134298toDoubleimpl(j7, unit);
            if (Double.isInfinite(dM134298toDoubleimpl)) {
                return String.valueOf(dM134298toDoubleimpl);
            }
            StringBuilder sb4 = new StringBuilder();
            if (i13 > 12) {
                i13 = 12;
            }
            sb4.append(DurationJvmKt.formatToExactDecimals(dM134298toDoubleimpl, i13));
            sb4.append(DurationUnitKt__DurationUnitKt.shortName(unit));
            return sb4.toString();
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "decimals must be not negative, but was ").toString());
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m134292timesUwyO8pc(long j7, double d3) {
        int iM36257W = AbstractC12889b.m36257W(d3);
        if (iM36257W == d3) {
            return m134293timesUwyO8pc(j7, iM36257W);
        }
        DurationUnit durationUnitM134280getStorageUnitimpl = m134280getStorageUnitimpl(j7);
        return DurationKt.toDuration(m134298toDoubleimpl(j7, durationUnitM134280getStorageUnitimpl) * d3, durationUnitM134280getStorageUnitimpl);
    }
}
