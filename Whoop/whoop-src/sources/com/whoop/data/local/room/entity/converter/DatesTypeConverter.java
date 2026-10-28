package com.whoop.data.local.room.entity.converter;

import com.mapbox.common.HttpHeaders;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/converter/DatesTypeConverter;", "", "<init>", "()V", "stringToLocalDateTime", "Lorg/joda/time/LocalDateTime;", "value", "", "localDateTimeToString", HttpHeaders.DATE, "stringToDateTime", "Lorg/joda/time/DateTime;", "dateTimeToString", "stringToInstant", "Lorg/joda/time/Instant;", "instantToString", "instant", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DatesTypeConverter {
    public static final int $stable = 0;

    public final String dateTimeToString(DateTime date) {
        if (date != null) {
            return date.toString();
        }
        return null;
    }

    public final String instantToString(Instant instant) {
        if (instant != null) {
            return instant.toString();
        }
        return null;
    }

    public final String localDateTimeToString(LocalDateTime date) {
        if (date != null) {
            return date.toString();
        }
        return null;
    }

    public final DateTime stringToDateTime(String value) {
        if (value != null) {
            return DateTime.parse(value);
        }
        return null;
    }

    public final Instant stringToInstant(String value) {
        if (value != null) {
            return Instant.parse(value);
        }
        return null;
    }

    public final LocalDateTime stringToLocalDateTime(String value) {
        if (value != null) {
            return LocalDateTime.parse(value);
        }
        return null;
    }
}
