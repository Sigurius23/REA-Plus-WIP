package com.whoop.data.remote.domain.dto;

import m83.AbstractC25265s;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\n\u0010\u0016\u001a\u00020\u0003H\u0096\u0080\u0004J\n\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0002J\u0006\u0010\u0019\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/LocalDateRange;", "", "during", "", "<init>", "(Ljava/lang/String;)V", "getDuring", "()Ljava/lang/String;", "lower", "Lorg/joda/time/LocalDate;", "getLower", "()Lorg/joda/time/LocalDate;", "lowerBoundType", "Lcom/whoop/data/remote/domain/dto/BoundType;", "upper", "getUpper", "upperBoundType", "equals", "", "other", "hashCode", "", "toString", "parseUpper", "parseUpperBoundType", "toLowerOnly", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LocalDateRange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DateTimeFormatter localDateFormatter;
    public static final char rangeDelimiter = '\'';
    private final String during;
    private final LocalDate lower;
    private final BoundType lowerBoundType;
    private final LocalDate upper;
    private final BoundType upperBoundType;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/LocalDateRange$Companion;", "", "<init>", "()V", "rangeDelimiter", "", "localDateFormatter", "Lorg/joda/time/format/DateTimeFormatter;", "getLocalDateFormatter", "()Lorg/joda/time/format/DateTimeFormatter;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DateTimeFormatter getLocalDateFormatter() {
            return LocalDateRange.localDateFormatter;
        }

        private Companion() {
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        localDateFormatter = dateTimeFormatterForPattern;
    }

    public LocalDateRange(String during) {
        AbstractC22676k.m65750j(during, "during");
        this.during = during;
        LocalDate localDate = LocalDate.parse((String) AbstractC39414r.m125905x0(during, new char[]{'\''}, 0, 6).get(1), localDateFormatter);
        AbstractC22676k.m65749i(localDate, "parse(...)");
        this.lower = localDate;
        this.lowerBoundType = BoundType.INSTANCE.fromBound((String) AbstractC39414r.m125905x0(during, new char[]{'\''}, 0, 6).get(0));
        this.upper = parseUpper();
        this.upperBoundType = parseUpperBoundType();
    }

    private final LocalDate parseUpper() {
        if (AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).size() == 5) {
            return LocalDate.parse((String) AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).get(3), localDateFormatter);
        }
        return null;
    }

    private final BoundType parseUpperBoundType() {
        if (AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).size() == 5) {
            return BoundType.INSTANCE.fromBound((String) AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).get(4));
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        LocalDateRange localDateRange = other == null ? true : other instanceof LocalDateRange ? (LocalDateRange) other : null;
        return localDateRange != null && AbstractC22676k.m65745e(this.lower, localDateRange.lower) && this.lowerBoundType == localDateRange.lowerBoundType && AbstractC22676k.m65745e(this.upper, localDateRange.upper) && this.upperBoundType == localDateRange.upperBoundType;
    }

    public final String getDuring() {
        return this.during;
    }

    public final LocalDate getLower() {
        return this.lower;
    }

    public final LocalDate getUpper() {
        return this.upper;
    }

    public int hashCode() {
        int iHashCode = (this.lowerBoundType.hashCode() + (this.lower.hashCode() * 31)) * 31;
        LocalDate localDate = this.upper;
        int iHashCode2 = (iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31;
        BoundType boundType = this.upperBoundType;
        return iHashCode2 + (boundType != null ? boundType.hashCode() : 0);
    }

    public final LocalDateRange toLowerOnly() {
        return this.upper == null ? this : new LocalDateRange(AbstractC25265s.m74110N0(AbstractC39414r.m125905x0(this.during, new char[]{'\''}, 0, 6).subList(0, 2), "'", null, null, null, 62));
    }

    public String toString() {
        return this.during;
    }
}
