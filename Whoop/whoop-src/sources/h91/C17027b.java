package h91;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k71.C22246d;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h91.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u0000 3*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001bBo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0088\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\t2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b-\u0010+R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b1\u0010!¨\u0006:"}, m65681d2 = {"Lh91/b;", "DateModel", "", "Ljava/util/Locale;", "locale", "Ljava/time/LocalDate;", "currentDate", "selectedDate", "latestMonthDate", "", "", "", "dateModelsByMonth", "monthOffset", "", "isLoading", "Lk71/d;", "legendList", "futureOffset", "<init>", "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;I)V", "monthIndex", "Lh91/a;", "m", "(I)Lh91/a;", "c", "(I)Ljava/util/List;", "a", "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;I)Lh91/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Locale;", "i", "()Ljava/util/Locale;", "b", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "k", "g", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "f", "I", "j", "Z", "l", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17027b<DateModel> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    public static final int f65485k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LocalDate currentDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LocalDate selectedDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalDate latestMonthDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Map<Integer, List<DateModel>> dateModelsByMonth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int monthOffset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C22246d> legendList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int futureOffset;

    /* JADX INFO: renamed from: h91.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJw\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016\"\u0004\b\u0001\u0010\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lh91/b$a;", "", "<init>", "()V", "Ljava/time/LocalDate;", "selectedDate", "latestMonthDate", "", "c", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)I", "DateModel", "Ljava/util/Locale;", "locale", "currentDate", "", "", "dateModelsByMonth", "", "isLoading", "Lk71/d;", "legendList", "futureOffset", "Lh91/b;", "a", "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;I)Lh91/b;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C17027b m48086b(Companion companion, Locale locale, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, Map map, boolean z4, List list, int i13, int i14, Object obj) {
            if ((i14 & 32) != 0) {
                z4 = false;
            }
            if ((i14 & 64) != 0) {
                list = C25271y.f99162w;
            }
            if ((i14 & 128) != 0) {
                i13 = 0;
            }
            return companion.m48088a(locale, localDate, localDate2, localDate3, map, z4, list, i13);
        }

        /* JADX INFO: renamed from: c */
        private final int m48087c(LocalDate selectedDate, LocalDate latestMonthDate) {
            return (int) ChronoUnit.MONTHS.between(selectedDate.withDayOfMonth(1), latestMonthDate.withDayOfMonth(1));
        }

        /* JADX INFO: renamed from: a */
        public final <DateModel> C17027b<DateModel> m48088a(Locale locale, LocalDate currentDate, LocalDate selectedDate, LocalDate latestMonthDate, Map<Integer, ? extends List<? extends DateModel>> dateModelsByMonth, boolean isLoading, List<C22246d> legendList, int futureOffset) {
            AbstractC22676k.m65750j(locale, "locale");
            AbstractC22676k.m65750j(currentDate, "currentDate");
            AbstractC22676k.m65750j(selectedDate, "selectedDate");
            AbstractC22676k.m65750j(latestMonthDate, "latestMonthDate");
            AbstractC22676k.m65750j(dateModelsByMonth, "dateModelsByMonth");
            AbstractC22676k.m65750j(legendList, "legendList");
            return new C17027b<>(locale, currentDate, selectedDate, AbstractC17028c.m48089a(latestMonthDate), dateModelsByMonth, m48087c(selectedDate, latestMonthDate), isLoading, legendList, futureOffset);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17027b(Locale locale, LocalDate currentDate, LocalDate selectedDate, LocalDate latestMonthDate, Map<Integer, ? extends List<? extends DateModel>> dateModelsByMonth, int i13, boolean z4, List<C22246d> legendList, int i14) {
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(latestMonthDate, "latestMonthDate");
        AbstractC22676k.m65750j(dateModelsByMonth, "dateModelsByMonth");
        AbstractC22676k.m65750j(legendList, "legendList");
        this.locale = locale;
        this.currentDate = currentDate;
        this.selectedDate = selectedDate;
        this.latestMonthDate = latestMonthDate;
        this.dateModelsByMonth = dateModelsByMonth;
        this.monthOffset = i13;
        this.isLoading = z4;
        this.legendList = legendList;
        this.futureOffset = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17027b m48073b(C17027b c17027b, Locale locale, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, Map map, int i13, boolean z4, List list, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            locale = c17027b.locale;
        }
        if ((i15 & 2) != 0) {
            localDate = c17027b.currentDate;
        }
        if ((i15 & 4) != 0) {
            localDate2 = c17027b.selectedDate;
        }
        if ((i15 & 8) != 0) {
            localDate3 = c17027b.latestMonthDate;
        }
        if ((i15 & 16) != 0) {
            map = c17027b.dateModelsByMonth;
        }
        if ((i15 & 32) != 0) {
            i13 = c17027b.monthOffset;
        }
        if ((i15 & 64) != 0) {
            z4 = c17027b.isLoading;
        }
        if ((i15 & 128) != 0) {
            list = c17027b.legendList;
        }
        if ((i15 & 256) != 0) {
            i14 = c17027b.futureOffset;
        }
        List list2 = list;
        int i16 = i14;
        int i17 = i13;
        boolean z13 = z4;
        Map map2 = map;
        LocalDate localDate4 = localDate2;
        return c17027b.m48074a(locale, localDate, localDate4, localDate3, map2, i17, z13, list2, i16);
    }

    /* JADX INFO: renamed from: a */
    public final C17027b<DateModel> m48074a(Locale locale, LocalDate currentDate, LocalDate selectedDate, LocalDate latestMonthDate, Map<Integer, ? extends List<? extends DateModel>> dateModelsByMonth, int monthOffset, boolean isLoading, List<C22246d> legendList, int futureOffset) {
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(latestMonthDate, "latestMonthDate");
        AbstractC22676k.m65750j(dateModelsByMonth, "dateModelsByMonth");
        AbstractC22676k.m65750j(legendList, "legendList");
        return new C17027b<>(locale, currentDate, selectedDate, latestMonthDate, dateModelsByMonth, monthOffset, isLoading, legendList, futureOffset);
    }

    /* JADX INFO: renamed from: c */
    public final List<DateModel> m48075c(int monthIndex) {
        List<DateModel> list = this.dateModelsByMonth.get(Integer.valueOf(monthIndex));
        if (list == null) {
            list = C25271y.f99162w;
        }
        return list;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: e */
    public final Map<Integer, List<DateModel>> m48077e() {
        return this.dateModelsByMonth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17027b)) {
            return false;
        }
        C17027b c17027b = (C17027b) other;
        return AbstractC22676k.m65745e(this.locale, c17027b.locale) && AbstractC22676k.m65745e(this.currentDate, c17027b.currentDate) && AbstractC22676k.m65745e(this.selectedDate, c17027b.selectedDate) && AbstractC22676k.m65745e(this.latestMonthDate, c17027b.latestMonthDate) && AbstractC22676k.m65745e(this.dateModelsByMonth, c17027b.dateModelsByMonth) && this.monthOffset == c17027b.monthOffset && this.isLoading == c17027b.isLoading && AbstractC22676k.m65745e(this.legendList, c17027b.legendList) && this.futureOffset == c17027b.futureOffset;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getFutureOffset() {
        return this.futureOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getLatestMonthDate() {
        return this.latestMonthDate;
    }

    /* JADX INFO: renamed from: h */
    public final List<C22246d> m48080h() {
        return this.legendList;
    }

    public int hashCode() {
        return Integer.hashCode(this.futureOffset) + AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.monthOffset, AbstractC3855a.m11821e(this.dateModelsByMonth, AbstractC13673n.m38558e(this.latestMonthDate, AbstractC13673n.m38558e(this.selectedDate, AbstractC13673n.m38558e(this.currentDate, this.locale.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.isLoading), 31, this.legendList);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMonthOffset() {
        return this.monthOffset;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: m */
    public final C17026a m48085m(int monthIndex) {
        C17026a.Companion aVar = C17026a.INSTANCE;
        Locale locale = this.locale;
        LocalDate localDate = this.currentDate;
        LocalDate localDate2 = this.selectedDate;
        LocalDate localDateMinusMonths = this.latestMonthDate.minusMonths(monthIndex - this.futureOffset);
        AbstractC22676k.m65749i(localDateMinusMonths, "minusMonths(...)");
        return aVar.m48072a(locale, localDate, localDate2, localDateMinusMonths, this.legendList);
    }

    public String toString() {
        Locale locale = this.locale;
        LocalDate localDate = this.currentDate;
        LocalDate localDate2 = this.selectedDate;
        LocalDate localDate3 = this.latestMonthDate;
        Map<Integer, List<DateModel>> map = this.dateModelsByMonth;
        int i13 = this.monthOffset;
        boolean z4 = this.isLoading;
        List<C22246d> list = this.legendList;
        int i14 = this.futureOffset;
        StringBuilder sb4 = new StringBuilder("GenericCalendarDomainState(locale=");
        sb4.append(locale);
        sb4.append(", currentDate=");
        sb4.append(localDate);
        sb4.append(", selectedDate=");
        sb4.append(localDate2);
        sb4.append(", latestMonthDate=");
        sb4.append(localDate3);
        sb4.append(", dateModelsByMonth=");
        sb4.append(map);
        sb4.append(", monthOffset=");
        sb4.append(i13);
        sb4.append(", isLoading=");
        AbstractC25012a.m73391x(", legendList=", ", futureOffset=", sb4, list, z4);
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }
}
