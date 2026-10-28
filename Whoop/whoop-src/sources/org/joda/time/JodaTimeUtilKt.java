package org.joda.time;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m65681d2 = {"millis", "", "Lorg/joda/time/LocalDate;", "Lorg/joda/time/LocalDateTime;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JodaTimeUtilKt {
    public static final long millis(LocalDate localDate) {
        AbstractC22676k.m65750j(localDate, "<this>");
        return localDate.getLocalMillis();
    }

    public static final long millis(LocalDateTime localDateTime) {
        AbstractC22676k.m65750j(localDateTime, "<this>");
        return localDateTime.getLocalMillis();
    }
}
