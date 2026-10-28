package io.getstream.chat.android.p226ui.common.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.models.TimeDuration;
import io.getstream.chat.android.p226ui.common.C19470R;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.DurationKt;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 82\u00020\u0001:\u000389:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\f*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u001b\u0010,\u001a\u00020'8BX\u0083\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020'8BX\u0083\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001b\u00102\u001a\u00020'8BX\u0083\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0014\u00105\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020'8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010+¨\u0006;"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;", "dateContext", "Ljava/util/Locale;", "locale", "<init>", "(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;Ljava/util/Locale;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/util/Locale;)V", "Ljava/util/Date;", "", "isToday", "(Ljava/util/Date;)Z", "isYesterday", "isWithinLastWeek", "", "days", "isWithinDays", "(Ljava/util/Date;I)Z", "Ljava/util/Calendar;", "calendar", "isBeforeDay", "(Ljava/util/Calendar;Ljava/util/Calendar;)Z", HttpHeaders.DATE, "", "formatDate", "(Ljava/util/Date;)Ljava/lang/String;", "formatTime", "formatRelativeTime", "formatRelativeDate", "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;", "Ljava/util/Locale;", "Ljava/text/SimpleDateFormat;", "timeFormatter12h", "Ljava/text/SimpleDateFormat;", "timeFormatter24h", "dateFormatterDayOfWeek", "Ljava/time/format/DateTimeFormatter;", "timeFormatter12hNew$delegate", "Ll83/h;", "getTimeFormatter12hNew", "()Ljava/time/format/DateTimeFormatter;", "timeFormatter12hNew", "timeFormatter24hNew$delegate", "getTimeFormatter24hNew", "timeFormatter24hNew", "dateFormatterDayOfWeekNew$delegate", "getDateFormatterDayOfWeekNew", "dateFormatterDayOfWeekNew", "getDateFormatterFullDate", "()Ljava/text/SimpleDateFormat;", "dateFormatterFullDate", "getDateFormatterFullDateNew", "dateFormatterFullDateNew", "Companion", "DateContext", "DefaultDateContext", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultDateFormatter implements DateFormatter {
    public static final int $stable = 8;
    private static final Companion Companion = new Companion();

    @Deprecated
    public static final String DATE_FORMAT_DAY_OF_WEEK = "EEEE";

    @Deprecated
    public static final String TIME_FORMAT_12H = "h:mm a";

    @Deprecated
    public static final String TIME_FORMAT_24H = "HH:mm";
    private final DateContext dateContext;
    private final SimpleDateFormat dateFormatterDayOfWeek;

    /* JADX INFO: renamed from: dateFormatterDayOfWeekNew$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h dateFormatterDayOfWeekNew;
    private final Locale locale;
    private final SimpleDateFormat timeFormatter12h;

    /* JADX INFO: renamed from: timeFormatter12hNew$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h timeFormatter12hNew;
    private final SimpleDateFormat timeFormatter24h;

    /* JADX INFO: renamed from: timeFormatter24hNew$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h timeFormatter24hNew;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$Companion;", "", "<init>", "()V", "TIME_FORMAT_12H", "", "TIME_FORMAT_24H", "DATE_FORMAT_DAY_OF_WEEK", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;", "", "now", "Ljava/util/Date;", "isWithinLastMinute", "", HttpHeaders.DATE, "yesterdayString", "", "justNowString", "is24Hour", "dateTimePattern", "relativeTime", "relativeDate", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface DateContext {
        String dateTimePattern();

        boolean is24Hour();

        boolean isWithinLastMinute(Date date);

        String justNowString();

        Date now();

        String relativeDate(Date date);

        String relativeTime(Date date);

        String yesterdayString();
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR#\u0010\"\u001a\n \u001e*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\r¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DefaultDateContext;", "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;", "Landroid/content/Context;", "context", "Ljava/util/Locale;", "locale", "<init>", "(Landroid/content/Context;Ljava/util/Locale;)V", "Ljava/util/Date;", "now", "()Ljava/util/Date;", "", "yesterdayString", "()Ljava/lang/String;", "justNowString", "", "is24Hour", "()Z", HttpHeaders.DATE, "isWithinLastMinute", "(Ljava/util/Date;)Z", "dateTimePattern", "relativeTime", "(Ljava/util/Date;)Ljava/lang/String;", "relativeDate", "Landroid/content/Context;", "Ljava/util/Locale;", "Lio/getstream/chat/android/models/TimeDuration;", "oneMinuteDuration", "Lio/getstream/chat/android/models/TimeDuration;", "kotlin.jvm.PlatformType", "dateTimePatternLazy$delegate", "Ll83/h;", "getDateTimePatternLazy", "dateTimePatternLazy", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultDateContext implements DateContext {
        private final Context context;

        /* JADX INFO: renamed from: dateTimePatternLazy$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h dateTimePatternLazy;
        private final Locale locale;
        private final TimeDuration oneMinuteDuration;

        public DefaultDateContext(Context context, Locale locale) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(locale, "locale");
            this.context = context;
            this.locale = locale;
            this.oneMinuteDuration = TimeDuration.INSTANCE.minutes(1);
            this.dateTimePatternLazy = AbstractC30060g.m92088H(new C19601b(this, 0));
        }

        /* JADX INFO: renamed from: a */
        public static String m55071a(DefaultDateContext defaultDateContext) {
            return DateFormat.getBestDateTimePattern(defaultDateContext.locale, "yy MM dd");
        }

        private final String getDateTimePatternLazy() {
            return (String) this.dateTimePatternLazy.getValue();
        }

        @Override // io.getstream.chat.android.ui.common.helper.DefaultDateFormatter.DateContext
        public final String dateTimePattern() {
            String dateTimePatternLazy = getDateTimePatternLazy();
            AbstractC22676k.m65749i(dateTimePatternLazy, "<get-dateTimePatternLazy>(...)");
            return dateTimePatternLazy;
        }

        @Override // io.getstream.chat.android.ui.common.helper.DefaultDateFormatter.DateContext
        public final boolean is24Hour() {
            return DateFormat.is24HourFormat(this.context);
        }

        @Override // io.getstream.chat.android.ui.common.helper.DefaultDateFormatter.DateContext
        public final boolean isWithinLastMinute(Date date) {
            return date != null && System.currentTimeMillis() - date.getTime() < this.oneMinuteDuration.getMillis();
        }

        @Override // io.getstream.chat.android.ui.common.helper.DefaultDateFormatter.DateContext
        public final String justNowString() {
            String string = this.context.getString(C19470R.string.stream_ui_message_list_footnote_edited_now);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }

        @Override // io.getstream.chat.android.ui.common.helper.DefaultDateFormatter.DateContext
        public final Date now() {
            return new Date();
        }

        @Override // io.getstream.chat.android.ui.common.helper.DefaultDateFormatter.DateContext
        public final String relativeDate(Date date) {
            AbstractC22676k.m65750j(date, "date");
            return DateUtils.getRelativeTimeSpanString(date.getTime(), new Date().getTime(), DurationKt.MILLIS_IN_DAY, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION).toString();
        }

        @Override // io.getstream.chat.android.ui.common.helper.DefaultDateFormatter.DateContext
        public final String relativeTime(Date date) {
            AbstractC22676k.m65750j(date, "date");
            return DateUtils.getRelativeDateTimeString(this.context, date.getTime(), 60000L, 604800000L, 0).toString();
        }

        @Override // io.getstream.chat.android.ui.common.helper.DefaultDateFormatter.DateContext
        public final String yesterdayString() {
            String string = this.context.getString(C19470R.string.stream_ui_yesterday);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }
    }

    public DefaultDateFormatter(DateContext dateContext, Locale locale) {
        AbstractC22676k.m65750j(dateContext, "dateContext");
        AbstractC22676k.m65750j(locale, "locale");
        this.dateContext = dateContext;
        this.locale = locale;
        this.timeFormatter12h = new SimpleDateFormat(TIME_FORMAT_12H, locale);
        this.timeFormatter24h = new SimpleDateFormat(TIME_FORMAT_24H, locale);
        this.dateFormatterDayOfWeek = new SimpleDateFormat(DATE_FORMAT_DAY_OF_WEEK, locale);
        final int i13 = 0;
        this.timeFormatter12hNew = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.common.helper.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultDateFormatter f74467x;

            {
                this.f74467x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return DefaultDateFormatter.timeFormatter12hNew_delegate$lambda$0(this.f74467x);
                    case 1:
                        return DefaultDateFormatter.timeFormatter24hNew_delegate$lambda$1(this.f74467x);
                    default:
                        return DefaultDateFormatter.dateFormatterDayOfWeekNew_delegate$lambda$2(this.f74467x);
                }
            }
        });
        final int i14 = 1;
        this.timeFormatter24hNew = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.common.helper.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultDateFormatter f74467x;

            {
                this.f74467x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return DefaultDateFormatter.timeFormatter12hNew_delegate$lambda$0(this.f74467x);
                    case 1:
                        return DefaultDateFormatter.timeFormatter24hNew_delegate$lambda$1(this.f74467x);
                    default:
                        return DefaultDateFormatter.dateFormatterDayOfWeekNew_delegate$lambda$2(this.f74467x);
                }
            }
        });
        final int i15 = 2;
        this.dateFormatterDayOfWeekNew = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.common.helper.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultDateFormatter f74467x;

            {
                this.f74467x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return DefaultDateFormatter.timeFormatter12hNew_delegate$lambda$0(this.f74467x);
                    case 1:
                        return DefaultDateFormatter.timeFormatter24hNew_delegate$lambda$1(this.f74467x);
                    default:
                        return DefaultDateFormatter.dateFormatterDayOfWeekNew_delegate$lambda$2(this.f74467x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter dateFormatterDayOfWeekNew_delegate$lambda$2(DefaultDateFormatter defaultDateFormatter) {
        return DateTimeFormatter.ofPattern(DATE_FORMAT_DAY_OF_WEEK).withLocale(defaultDateFormatter.locale).withZone(ZoneId.systemDefault());
    }

    private final DateTimeFormatter getDateFormatterDayOfWeekNew() {
        Object value = this.dateFormatterDayOfWeekNew.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (DateTimeFormatter) value;
    }

    private final SimpleDateFormat getDateFormatterFullDate() {
        return new SimpleDateFormat(this.dateContext.dateTimePattern(), this.locale);
    }

    @SuppressLint({"NewApi"})
    private final DateTimeFormatter getDateFormatterFullDateNew() {
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern(this.dateContext.dateTimePattern()).withLocale(this.locale).withZone(ZoneId.systemDefault());
        AbstractC22676k.m65749i(dateTimeFormatterWithZone, "withZone(...)");
        return dateTimeFormatterWithZone;
    }

    private final DateTimeFormatter getTimeFormatter12hNew() {
        Object value = this.timeFormatter12hNew.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (DateTimeFormatter) value;
    }

    private final DateTimeFormatter getTimeFormatter24hNew() {
        Object value = this.timeFormatter24hNew.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (DateTimeFormatter) value;
    }

    private final boolean isBeforeDay(Calendar calendar, Calendar calendar2) {
        if (calendar.get(1) < calendar2.get(1)) {
            return true;
        }
        return calendar.get(1) <= calendar2.get(1) && calendar.get(6) < calendar2.get(6);
    }

    private final boolean isToday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.dateContext.now());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    private final boolean isWithinDays(Date date, int i13) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Date dateNow = this.dateContext.now();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(dateNow);
        calendar2.add(6, -i13);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(dateNow);
        return isBeforeDay(calendar, calendar3) && !isBeforeDay(calendar, calendar2);
    }

    private final boolean isWithinLastWeek(Date date) {
        return isWithinDays(date, 6);
    }

    private final boolean isYesterday(Date date) {
        return isToday(new Date(date.getTime() + DurationKt.MILLIS_IN_DAY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter timeFormatter12hNew_delegate$lambda$0(DefaultDateFormatter defaultDateFormatter) {
        return DateTimeFormatter.ofPattern(TIME_FORMAT_12H).withLocale(defaultDateFormatter.locale).withZone(ZoneId.systemDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter timeFormatter24hNew_delegate$lambda$1(DefaultDateFormatter defaultDateFormatter) {
        return DateTimeFormatter.ofPattern(TIME_FORMAT_24H).withLocale(defaultDateFormatter.locale).withZone(ZoneId.systemDefault());
    }

    @Override // io.getstream.chat.android.p226ui.common.helper.DateFormatter
    public final String formatDate(Date date) {
        if (date == null) {
            return "";
        }
        if (isToday(date)) {
            return formatTime(date);
        }
        if (isYesterday(date)) {
            return this.dateContext.yesterdayString();
        }
        if (isWithinDays(date, 6)) {
            String str = getDateFormatterDayOfWeekNew().format(date.toInstant());
            AbstractC22676k.m65747g(str);
            return str;
        }
        String str2 = getDateFormatterFullDateNew().format(date.toInstant());
        AbstractC22676k.m65747g(str2);
        return str2;
    }

    @Override // io.getstream.chat.android.p226ui.common.helper.DateFormatter
    public final String formatRelativeDate(Date date) {
        AbstractC22676k.m65750j(date, "date");
        return this.dateContext.relativeDate(date);
    }

    @Override // io.getstream.chat.android.p226ui.common.helper.DateFormatter
    public final String formatRelativeTime(Date date) {
        if (date == null) {
            return "";
        }
        return this.dateContext.isWithinLastMinute(date) ? this.dateContext.justNowString() : this.dateContext.relativeTime(date);
    }

    @Override // io.getstream.chat.android.p226ui.common.helper.DateFormatter
    public final String formatTime(Date date) {
        if (date == null) {
            return "";
        }
        String str = (this.dateContext.is24Hour() ? getTimeFormatter24hNew() : getTimeFormatter12hNew()).format(date.toInstant());
        AbstractC22676k.m65747g(str);
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultDateFormatter(Context context, Locale locale) {
        this(new DefaultDateContext(context, locale), locale);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(locale, "locale");
    }
}
