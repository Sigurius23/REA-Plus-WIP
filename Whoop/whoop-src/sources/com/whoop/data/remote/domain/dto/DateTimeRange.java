package com.whoop.data.remote.domain.dto;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B-\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\n\u0010\u001a\u001a\u00020\u0003H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "", "during", "", "<init>", "(Ljava/lang/String;)V", "lower", "Lorg/joda/time/DateTime;", "upper", "lowerBoundType", "Lcom/whoop/data/remote/domain/dto/BoundType;", "upperBoundType", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;)V", "getDuring", "()Ljava/lang/String;", "getLower", "()Lorg/joda/time/DateTime;", "getUpper", "equals", "", "other", "hashCode", "", "parseUpper", "parseLower", "parseUpperBoundType", "toString", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DateTimeRange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DateTimeFormatter dateTimeFormatter;
    private static final DateTimeFormatter dateTimeRangeFormatter;
    public static final char lowerUpperDelimiter = ',';
    public static final char rangeDelimiter = '\'';
    private final String during;
    private final DateTime lower;
    private final BoundType lowerBoundType;
    private final DateTime upper;
    private final BoundType upperBoundType;

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;", "", "<init>", "()V", "rangeDelimiter", "", "lowerUpperDelimiter", "dateTimeFormatter", "Lorg/joda/time/format/DateTimeFormatter;", "getDateTimeFormatter$annotations", "getDateTimeFormatter", "()Lorg/joda/time/format/DateTimeFormatter;", "dateTimeRangeFormatter", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDateTimeFormatter$annotations() {
        }

        public final DateTimeFormatter getDateTimeFormatter() {
            return DateTimeRange.dateTimeFormatter;
        }

        private Companion() {
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(StreamDateFormatter.DATE_FORMAT);
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        dateTimeFormatter = dateTimeFormatterForPattern;
        DateTimeFormatter dateTimeFormatterWithOffsetParsed = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
        AbstractC22676k.m65749i(dateTimeFormatterWithOffsetParsed, "withOffsetParsed(...)");
        dateTimeRangeFormatter = dateTimeFormatterWithOffsetParsed;
    }

    public DateTimeRange(String during) {
        AbstractC22676k.m65750j(during, "during");
        this.during = during;
        this.lower = parseLower();
        this.lowerBoundType = BoundType.INSTANCE.fromBound((String) AbstractC39414r.m125905x0(during, new char[]{'\''}, 0, 6).get(0));
        this.upper = parseUpper();
        this.upperBoundType = parseUpperBoundType();
    }

    public static final DateTimeFormatter getDateTimeFormatter() {
        return INSTANCE.getDateTimeFormatter();
    }

    private final DateTime parseLower() {
        DateTime dateTime = dateTimeRangeFormatter.parseDateTime((String) AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).get(1));
        AbstractC22676k.m65749i(dateTime, "parseDateTime(...)");
        return dateTime;
    }

    private final DateTime parseUpper() {
        if (AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).size() == 5) {
            return dateTimeRangeFormatter.parseDateTime((String) AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).get(3));
        }
        return null;
    }

    private final BoundType parseUpperBoundType() {
        return AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).size() == 5 ? BoundType.INSTANCE.fromBound((String) AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).get(4)) : BoundType.INSTANCE.fromBound(String.valueOf(AbstractC39414r.m125891j0(this.during)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        DateTimeRange dateTimeRange = other == null ? true : other instanceof DateTimeRange ? (DateTimeRange) other : null;
        return dateTimeRange != null && AbstractC22676k.m65745e(this.lower, dateTimeRange.lower) && this.lowerBoundType == dateTimeRange.lowerBoundType && AbstractC22676k.m65745e(this.upper, dateTimeRange.upper) && this.upperBoundType == dateTimeRange.upperBoundType;
    }

    public final String getDuring() {
        return this.during;
    }

    public final DateTime getLower() {
        return this.lower;
    }

    public final DateTime getUpper() {
        return this.upper;
    }

    public int hashCode() {
        int iHashCode = (this.lowerBoundType.hashCode() + (this.lower.hashCode() * 31)) * 31;
        DateTime dateTime = this.upper;
        return this.upperBoundType.hashCode() + ((iHashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31);
    }

    public String toString() {
        return this.during;
    }

    public /* synthetic */ DateTimeRange(DateTime dateTime, DateTime dateTime2, BoundType boundType, BoundType boundType2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTime, dateTime2, (i13 & 4) != 0 ? BoundType.CLOSED : boundType, (i13 & 8) != 0 ? BoundType.OPEN : boundType2);
    }

    public DateTimeRange(DateTime lower, DateTime upper, BoundType lowerBoundType, BoundType upperBoundType) {
        AbstractC22676k.m65750j(lower, "lower");
        AbstractC22676k.m65750j(upper, "upper");
        AbstractC22676k.m65750j(lowerBoundType, "lowerBoundType");
        AbstractC22676k.m65750j(upperBoundType, "upperBoundType");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(lowerBoundType.getLowerChar());
        sb4.append('\'');
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        sb4.append(dateTimeFormatter2.print(lower.withZone(dateTimeZone)));
        sb4.append("','");
        sb4.append(dateTimeFormatter2.print(upper.withZone(dateTimeZone)));
        sb4.append('\'');
        sb4.append(upperBoundType.getUpperChar());
        this(sb4.toString());
    }
}
