package or2;

import android.content.Context;
import android.text.format.DateFormat;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.LanguageRepository;
import io.getstream.chat.android.client.notifications.handler.C19398c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import java.util.Locale;
import m83.C25262p;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: or2.u0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u001cB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00192\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010!\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Lor2/u0;", "", "Lkotlin/Function0;", "", "is24HourFormatFetcher", "Ljava/util/Locale;", "localeFetcher", "<init>", "(Lc93/a;Lc93/a;)V", "Landroid/content/Context;", "context", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "(Landroid/content/Context;Lcom/whoop/data/repositories/LanguageRepository;)V", "time", "Lorg/joda/time/format/DateTimeFormatter;", "twelveHourClockPattern", "twentyFourHourClockPattern", "", "f", "(Ljava/lang/Object;Lorg/joda/time/format/DateTimeFormatter;Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;", "Lorg/joda/time/ReadableInstant;", "spaceAfterMinute", "g", "(Lorg/joda/time/ReadableInstant;Z)Ljava/lang/String;", "Lorg/joda/time/ReadablePartial;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lorg/joda/time/ReadablePartial;Z)Ljava/lang/String;", "a", "Lc93/a;", "b", "k", "()Ljava/util/Locale;", "locale", "l", "()Z", "isUsing24HourTime", "c", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28205u0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f113964d = 0;

    /* JADX INFO: renamed from: e */
    private static final DateTimeFormatter f113965e;

    /* JADX INFO: renamed from: f */
    private static final DateTimeFormatter f113966f;

    /* JADX INFO: renamed from: g */
    private static final DateTimeFormatter f113967g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4339a is24HourFormatFetcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a localeFetcher;

    /* JADX INFO: renamed from: or2.u0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lor2/u0$a;", "", "<init>", "()V", "Lorg/joda/time/format/DateTimeFormatter;", "TIME_ONLY_24_HOUR_FORMAT", "Lorg/joda/time/format/DateTimeFormatter;", "a", "()Lorg/joda/time/format/DateTimeFormatter;", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final DateTimeFormatter m85384a() {
            return C28205u0.f113967g;
        }

        private Companion() {
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("h:mma");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        f113965e = dateTimeFormatterForPattern;
        DateTimeFormatter dateTimeFormatterForPattern2 = DateTimeFormat.forPattern(DefaultDateFormatter.TIME_FORMAT_12H);
        AbstractC22676k.m65749i(dateTimeFormatterForPattern2, "forPattern(...)");
        f113966f = dateTimeFormatterForPattern2;
        DateTimeFormatter dateTimeFormatterForPattern3 = DateTimeFormat.forPattern(DefaultDateFormatter.TIME_FORMAT_24H);
        AbstractC22676k.m65749i(dateTimeFormatterForPattern3, "forPattern(...)");
        f113967g = dateTimeFormatterForPattern3;
    }

    public C28205u0(InterfaceC4339a is24HourFormatFetcher, InterfaceC4339a localeFetcher) {
        AbstractC22676k.m65750j(is24HourFormatFetcher, "is24HourFormatFetcher");
        AbstractC22676k.m65750j(localeFetcher, "localeFetcher");
        this.is24HourFormatFetcher = is24HourFormatFetcher;
        this.localeFetcher = localeFetcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final boolean m85374c(Context context) {
        return DateFormat.is24HourFormat(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Locale m85375d(LanguageRepository languageRepository) {
        return languageRepository.getAllowedLanguage();
    }

    /* JADX INFO: renamed from: f */
    private final String m85377f(Object time, DateTimeFormatter twelveHourClockPattern, DateTimeFormatter twentyFourHourClockPattern) {
        if (m85383l()) {
            twelveHourClockPattern = twentyFourHourClockPattern;
        }
        DateTimeFormatter dateTimeFormatterWithLocale = twelveHourClockPattern.withLocale(m85380k());
        if (time instanceof Long) {
            String strPrint = dateTimeFormatterWithLocale.print(((Number) time).longValue());
            AbstractC22676k.m65749i(strPrint, "print(...)");
            return strPrint;
        }
        if (time instanceof ReadablePartial) {
            String strPrint2 = dateTimeFormatterWithLocale.print((ReadablePartial) time);
            AbstractC22676k.m65749i(strPrint2, "print(...)");
            return strPrint2;
        }
        if (!(time instanceof ReadableInstant)) {
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Joda time DateTimeFormatter doesn't know how to parse a ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(time.getClass()).getSimpleName()));
        }
        String strPrint3 = dateTimeFormatterWithLocale.print((ReadableInstant) time);
        AbstractC22676k.m65749i(strPrint3, "print(...)");
        return strPrint3;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m85378i(C28205u0 c28205u0, ReadableInstant readableInstant, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return c28205u0.m85381g(readableInstant, z4);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m85379j(C28205u0 c28205u0, ReadablePartial readablePartial, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return c28205u0.m85382h(readablePartial, z4);
    }

    /* JADX INFO: renamed from: k */
    private final Locale m85380k() {
        return (Locale) this.localeFetcher.invoke();
    }

    /* JADX INFO: renamed from: g */
    public final String m85381g(ReadableInstant time, boolean spaceAfterMinute) {
        AbstractC22676k.m65750j(time, "time");
        return m85377f(time, spaceAfterMinute ? f113966f : f113965e, f113967g);
    }

    /* JADX INFO: renamed from: h */
    public final String m85382h(ReadablePartial time, boolean spaceAfterMinute) {
        AbstractC22676k.m65750j(time, "time");
        return m85377f(time, spaceAfterMinute ? f113966f : f113965e, f113967g);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m85383l() {
        return ((Boolean) this.is24HourFormatFetcher.invoke()).booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28205u0(Context context, LanguageRepository languageRepository) {
        this(new C19398c(context, 1), new C25262p(languageRepository, 5));
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
    }
}
