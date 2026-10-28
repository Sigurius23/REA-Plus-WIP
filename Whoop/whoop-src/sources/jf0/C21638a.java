package jf0;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jf0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Ljf0/a;", "", "<init>", "()V", "", "isoDateTime", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "b", "Ljava/time/format/DateTimeFormatter;", "inputFormatter", "c", "outputFormatter", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21638a {

    /* JADX INFO: renamed from: a */
    public static final C21638a f83080a = new C21638a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT_WITHOUT_NANOSECONDS);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMM d, h:mm a", Locale.ENGLISH);

    /* JADX INFO: renamed from: d */
    public static final int f83083d = 8;

    private C21638a() {
    }

    /* JADX INFO: renamed from: a */
    public final String m60889a(String isoDateTime) {
        AbstractC22676k.m65750j(isoDateTime, "isoDateTime");
        try {
            String str = LocalDateTime.parse(isoDateTime, inputFormatter).format(outputFormatter);
            AbstractC22676k.m65747g(str);
            return str;
        } catch (DateTimeParseException unused) {
            return isoDateTime;
        }
    }
}
