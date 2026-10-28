package wc1;

import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayBottomState;
import com.whoop.design.models.calendar.CalendarDayState;
import com.whoop.design.models.calendar.CalendarOverlay;
import com.whoop.design.models.calendar.CalendarPhase;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import h91.C17027b;
import i93.C18284j;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23465k;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, m65681d2 = {"Lwc1/a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Ljava/time/LocalDate;", "currentDate", "selectedDate", "latestMonthDate", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "a", "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lh91/b;", "", "b", "Ljava/util/List;", "recoveryDates", "c", "strainDates", "d", "sleepDates", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37133a {

    /* JADX INFO: renamed from: a */
    public static final C37133a f158864a = new C37133a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final List<CalendarDateModel> recoveryDates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final List<CalendarDateModel> strainDates;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final List<CalendarDateModel> sleepDates;

    /* JADX INFO: renamed from: e */
    public static final int f158868e;

    static {
        CalendarDayState calendarDayState;
        CalendarDayState calendarDayState2;
        CalendarDayState calendarDayState3;
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, 31);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            int i13 = iNextInt + 1;
            if (iNextInt % 5 == 0) {
                calendarDayState3 = CalendarDayState.LOW_RECOVERY;
            } else {
                calendarDayState3 = iNextInt % 6 == 0 ? CalendarDayState.MEDIUM_RECOVERY : CalendarDayState.HIGH_RECOVERY;
            }
            arrayList.add(new CalendarDateModel(AbstractC8693b.m21278l(String.valueOf(i13)), true, Long.valueOf(i13), calendarDayState3, (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2032, (DefaultConstructorMarker) null));
        }
        recoveryDates = arrayList;
        C18284j c18284jM36278i1 = AbstractC12889b.m36278i0(0, 31);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i1, 10));
        Iterator it3 = c18284jM36278i1.iterator();
        while (it3.hasNext()) {
            int iNextInt2 = ((AbstractC25243e0) it3).nextInt();
            int i14 = iNextInt2 + 1;
            if (iNextInt2 % 5 == 0) {
                calendarDayState2 = CalendarDayState.LOW_STRAIN;
            } else {
                calendarDayState2 = iNextInt2 % 6 == 0 ? CalendarDayState.HIGH_STRAIN : CalendarDayState.NO_DATA;
            }
            arrayList2.add(new CalendarDateModel(AbstractC8693b.m21278l(String.valueOf(i14)), true, Long.valueOf(i14), calendarDayState2, (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2032, (DefaultConstructorMarker) null));
        }
        strainDates = arrayList2;
        C18284j c18284jM36278i2 = AbstractC12889b.m36278i0(0, 31);
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i2, 10));
        Iterator it4 = c18284jM36278i2.iterator();
        while (it4.hasNext()) {
            int iNextInt3 = ((AbstractC25243e0) it4).nextInt();
            int i15 = iNextInt3 + 1;
            if (iNextInt3 % 4 == 0) {
                calendarDayState = CalendarDayState.LOW_SLEEP;
            } else {
                calendarDayState = iNextInt3 % 5 == 0 ? CalendarDayState.HIGH_SLEEP : CalendarDayState.NO_DATA;
            }
            arrayList3.add(new CalendarDateModel(AbstractC8693b.m21278l(String.valueOf(i15)), true, Long.valueOf(i15), calendarDayState, (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2032, (DefaultConstructorMarker) null));
        }
        sleepDates = arrayList3;
        f158868e = 8;
    }

    private C37133a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17027b m119051b(C37133a c37133a, Locale locale, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            localDate = LocalDate.now();
            AbstractC22676k.m65749i(localDate, "now(...)");
        }
        if ((i13 & 4) != 0) {
            localDate2 = LocalDate.now();
            AbstractC22676k.m65749i(localDate2, "now(...)");
        }
        if ((i13 & 8) != 0) {
            localDate3 = LocalDate.now();
            AbstractC22676k.m65749i(localDate3, "now(...)");
        }
        return c37133a.m119052a(locale, localDate, localDate2, localDate3);
    }

    /* JADX INFO: renamed from: a */
    public final C17027b<CalendarDateModel> m119052a(Locale locale, LocalDate currentDate, LocalDate selectedDate, LocalDate latestMonthDate) {
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(latestMonthDate, "latestMonthDate");
        return C17027b.Companion.m48086b(C17027b.INSTANCE, locale, currentDate, selectedDate, latestMonthDate, AbstractC25247g0.m73990Y(new C23465k(0, strainDates), new C23465k(1, recoveryDates), new C23465k(2, sleepDates)), false, null, 0, 224, null);
    }
}
