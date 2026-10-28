package uk2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uk2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Ljava/time/OffsetDateTime;", "", "b", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "a", "Ljava/time/format/DateTimeFormatter;", "addActivityDateTimeFormatter", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35054d {

    /* JADX INFO: renamed from: a */
    private static final DateTimeFormatter f148547a;

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        AbstractC22676k.m65749i(dateTimeFormatterOfPattern, "ofPattern(...)");
        f148547a = dateTimeFormatterOfPattern;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m110828b(OffsetDateTime offsetDateTime) {
        String str = offsetDateTime.format(f148547a);
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }
}
