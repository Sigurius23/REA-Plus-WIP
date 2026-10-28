package com.whoop.profile.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\r"}, m65681d2 = {"Lcom/whoop/profile/utils/BirthdayUtils;", "", "<init>", "()V", "parseToMillis", "", "isoDateString", "", "formatForDisplay", "millisToLocalDate", "Ljava/time/LocalDate;", "millis", "millisToIsoString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BirthdayUtils {
    public static final int $stable = 0;
    public static final BirthdayUtils INSTANCE = new BirthdayUtils();

    private BirthdayUtils() {
    }

    public final String formatForDisplay(String isoDateString) {
        AbstractC22676k.m65750j(isoDateString, "isoDateString");
        String str = LocalDate.parse(isoDateString).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }

    public final String millisToIsoString(long millis) {
        String string = millisToLocalDate(millis).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public final LocalDate millisToLocalDate(long millis) {
        LocalDate localDate = Instant.ofEpochMilli(millis).atZone(ZoneOffset.UTC).toLocalDate();
        AbstractC22676k.m65749i(localDate, "toLocalDate(...)");
        return localDate;
    }

    public final long parseToMillis(String isoDateString) {
        AbstractC22676k.m65750j(isoDateString, "isoDateString");
        return LocalDate.parse(isoDateString).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }
}
