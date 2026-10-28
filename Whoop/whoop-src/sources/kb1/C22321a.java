package kb1;

import com.mapbox.common.HttpHeaders;
import h91.C17026a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iv1.AbstractC20951a;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kb1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001c\u0010 \u001a\n \u001a*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0016\u0010#R\u0017\u0010&\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010#R\u0017\u0010(\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010,\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001e\u0010+¨\u0006."}, m65681d2 = {"Lkb1/a;", "", "Lh91/a;", "monthState", "<init>", "(Lh91/a;)V", "Ljava/time/LocalDate;", HttpHeaders.DATE, "", "a", "(Ljava/time/LocalDate;)Ljava/lang/String;", "", "day", "b", "(I)Ljava/time/LocalDate;", "Lh91/a;", "d", "()Lh91/a;", "", "Z", "isCurrentYear", "Ljava/util/Locale;", "c", "Ljava/util/Locale;", "formattingLocale", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "Ljava/time/format/DateTimeFormatter;", "titleFormatter", "Ljava/time/DayOfWeek;", "e", "Ljava/time/DayOfWeek;", "startingWeekDay", "f", "I", "()I", "daysInMonth", "g", "slotsBeforeFirstDay", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "slotsAfterLastDay", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "monthTitle", "j", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22321a {

    /* JADX INFO: renamed from: j */
    private static final a f87099j = new a(null);

    /* JADX INFO: renamed from: k */
    public static final int f87100k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17026a monthState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isCurrentYear;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Locale formattingLocale;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final DateTimeFormatter titleFormatter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final DayOfWeek startingWeekDay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int daysInMonth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int slotsBeforeFirstDay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int slotsAfterLastDay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String monthTitle;

    /* JADX INFO: renamed from: kb1.a$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkb1/a$a;", "", "<init>", "()V", "", "TOTAL_DATE_SLOTS", "I", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C22321a(C17026a monthState) {
        AbstractC22676k.m65750j(monthState, "monthState");
        this.monthState = monthState;
        boolean z4 = monthState.getCurrentDate().getYear() == monthState.getMonthDate().getYear();
        this.isCurrentYear = z4;
        Locale localeM64142a = AbstractC22322b.m64142a(monthState.getLocale());
        this.formattingLocale = localeM64142a;
        DateTimeFormatter dateTimeFormatterOfPattern = z4 ? DateTimeFormatter.ofPattern("MMMM", monthState.getLocale()) : DateTimeFormatter.ofPattern("MMMM yyyy", localeM64142a);
        this.titleFormatter = dateTimeFormatterOfPattern;
        DayOfWeek dayOfWeek = monthState.getMonthDate().getDayOfWeek();
        this.startingWeekDay = dayOfWeek;
        int iLengthOfMonth = monthState.getMonthDate().lengthOfMonth();
        this.daysInMonth = iLengthOfMonth;
        int iM58212a = AbstractC20951a.m58212a(dayOfWeek.getValue() - C22329i.f87163a.m64213b(monthState.getLocale()).getValue(), 7);
        this.slotsBeforeFirstDay = iM58212a;
        this.slotsAfterLastDay = 42 - (iM58212a + iLengthOfMonth);
        String str = dateTimeFormatterOfPattern.format(monthState.getMonthDate());
        AbstractC22676k.m65749i(str, "format(...)");
        String upperCase = str.toUpperCase(monthState.getLocale());
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        this.monthTitle = upperCase;
    }

    /* JADX INFO: renamed from: a */
    public final String m64135a(LocalDate date) {
        AbstractC22676k.m65750j(date, "date");
        String str = DateTimeFormatter.ofPattern("EEEE, MMMM d", this.formattingLocale).format(date);
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final LocalDate m64136b(int day) {
        LocalDate localDateOf = LocalDate.of(this.monthState.getMonthDate().getYear(), this.monthState.getMonthDate().getMonth(), day);
        AbstractC22676k.m65749i(localDateOf, "of(...)");
        return localDateOf;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDaysInMonth() {
        return this.daysInMonth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C17026a getMonthState() {
        return this.monthState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMonthTitle() {
        return this.monthTitle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSlotsAfterLastDay() {
        return this.slotsAfterLastDay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSlotsBeforeFirstDay() {
        return this.slotsBeforeFirstDay;
    }
}
