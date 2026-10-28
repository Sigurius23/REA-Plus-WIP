package kb1;

import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: kb1.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0011BY\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000f\u0010\u0010Jh\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b%\u0010\u0014R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b!\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b&\u0010*¨\u0006+"}, m65681d2 = {"Lkb1/e;", "DateModel", "", "", "contentDescription", "", "isCurrentDay", "isSelectedDay", "isFutureDay", "", "day", "dayTitle", "Ljava/time/LocalDate;", HttpHeaders.DATE, "model", "<init>", "(Ljava/lang/String;ZZZILjava/lang/String;Ljava/time/LocalDate;Ljava/lang/Object;)V", "a", "(Ljava/lang/String;ZZZILjava/lang/String;Ljava/time/LocalDate;Ljava/lang/Object;)Lkb1/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "j", "d", "i", "e", "I", "f", "g", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22325e<DateModel> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    public static final int f87112j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String contentDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isCurrentDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelectedDay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isFutureDay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int day;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String dayTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final LocalDate date;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final DateModel model;

    /* JADX INFO: renamed from: kb1.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lkb1/e$a;", "", "<init>", "()V", "DateModel", "Lkb1/a;", "dateInfo", "", "day", "model", "Lkb1/e;", "a", "(Lkb1/a;ILjava/lang/Object;)Lkb1/e;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final <DateModel> C22325e<DateModel> m64159a(C22321a dateInfo, int day, DateModel model) {
            AbstractC22676k.m65750j(dateInfo, "dateInfo");
            LocalDate localDateM64136b = dateInfo.m64136b(day);
            NumberFormat numberInstance = NumberFormat.getNumberInstance(AbstractC22322b.m64142a(dateInfo.getMonthState().getLocale()));
            String strM64135a = dateInfo.m64135a(localDateM64136b);
            boolean zM65745e = AbstractC22676k.m65745e(dateInfo.getMonthState().getCurrentDate(), localDateM64136b);
            boolean zM65745e2 = AbstractC22676k.m65745e(dateInfo.getMonthState().getSelectedDate(), localDateM64136b);
            boolean z4 = localDateM64136b.compareTo((ChronoLocalDate) dateInfo.getMonthState().getCurrentDate()) > 0;
            String str = numberInstance.format(day);
            AbstractC22676k.m65749i(str, "format(...)");
            return new C22325e<>(strM64135a, zM65745e, zM65745e2, z4, day, str, localDateM64136b, model);
        }

        private Companion() {
        }
    }

    public C22325e(String contentDescription, boolean z4, boolean z13, boolean z14, int i13, String dayTitle, LocalDate date, DateModel datemodel) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(dayTitle, "dayTitle");
        AbstractC22676k.m65750j(date, "date");
        this.contentDescription = contentDescription;
        this.isCurrentDay = z4;
        this.isSelectedDay = z13;
        this.isFutureDay = z14;
        this.day = i13;
        this.dayTitle = dayTitle;
        this.date = date;
        this.model = datemodel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22325e m64149b(C22325e c22325e, String str, boolean z4, boolean z13, boolean z14, int i13, String str2, LocalDate localDate, Object obj, int i14, Object obj2) {
        if ((i14 & 1) != 0) {
            str = c22325e.contentDescription;
        }
        if ((i14 & 2) != 0) {
            z4 = c22325e.isCurrentDay;
        }
        if ((i14 & 4) != 0) {
            z13 = c22325e.isSelectedDay;
        }
        if ((i14 & 8) != 0) {
            z14 = c22325e.isFutureDay;
        }
        if ((i14 & 16) != 0) {
            i13 = c22325e.day;
        }
        if ((i14 & 32) != 0) {
            str2 = c22325e.dayTitle;
        }
        if ((i14 & 64) != 0) {
            localDate = c22325e.date;
        }
        if ((i14 & 128) != 0) {
            obj = c22325e.model;
        }
        LocalDate localDate2 = localDate;
        Object obj3 = obj;
        int i15 = i13;
        String str3 = str2;
        return c22325e.m64150a(str, z4, z13, z14, i15, str3, localDate2, obj3);
    }

    /* JADX INFO: renamed from: a */
    public final C22325e<DateModel> m64150a(String contentDescription, boolean isCurrentDay, boolean isSelectedDay, boolean isFutureDay, int day, String dayTitle, LocalDate date, DateModel model) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(dayTitle, "dayTitle");
        AbstractC22676k.m65750j(date, "date");
        return new C22325e<>(contentDescription, isCurrentDay, isSelectedDay, isFutureDay, day, dayTitle, date, model);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22325e)) {
            return false;
        }
        C22325e c22325e = (C22325e) other;
        return AbstractC22676k.m65745e(this.contentDescription, c22325e.contentDescription) && this.isCurrentDay == c22325e.isCurrentDay && this.isSelectedDay == c22325e.isSelectedDay && this.isFutureDay == c22325e.isFutureDay && this.day == c22325e.day && AbstractC22676k.m65745e(this.dayTitle, c22325e.dayTitle) && AbstractC22676k.m65745e(this.date, c22325e.date) && AbstractC22676k.m65745e(this.model, c22325e.model);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDayTitle() {
        return this.dayTitle;
    }

    /* JADX INFO: renamed from: g */
    public final DateModel m64155g() {
        return this.model;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsCurrentDay() {
        return this.isCurrentDay;
    }

    public int hashCode() {
        int iM38558e = AbstractC13673n.m38558e(this.date, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.day, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.contentDescription.hashCode() * 31, 31, this.isCurrentDay), 31, this.isSelectedDay), 31, this.isFutureDay), 31), 31, this.dayTitle), 31);
        DateModel datemodel = this.model;
        return iM38558e + (datemodel == null ? 0 : datemodel.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsFutureDay() {
        return this.isFutureDay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsSelectedDay() {
        return this.isSelectedDay;
    }

    public String toString() {
        String str = this.contentDescription;
        boolean z4 = this.isCurrentDay;
        boolean z13 = this.isSelectedDay;
        boolean z14 = this.isFutureDay;
        int i13 = this.day;
        String str2 = this.dayTitle;
        LocalDate localDate = this.date;
        DateModel datemodel = this.model;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("GenericCalendarDateArguments(contentDescription=", str, ", isCurrentDay=", ", isSelectedDay=", z4);
        AbstractC38963t7.m124392v(sbM73379l, z13, ", isFutureDay=", z14, ", day=");
        AbstractC11895b.m31979B(i13, ", dayTitle=", str2, ", date=", sbM73379l);
        sbM73379l.append(localDate);
        sbM73379l.append(", model=");
        sbM73379l.append(datemodel);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
