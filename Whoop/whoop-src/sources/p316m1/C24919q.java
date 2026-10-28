package p316m1;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;
import l83.C23465k;
import t83.C33617b;

/* JADX INFO: renamed from: m1.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C24919q extends AbstractC24917o {

    /* JADX INFO: renamed from: e */
    public static final ZoneId f97596e = ZoneId.of("UTC");

    /* JADX INFO: renamed from: c */
    public final int f97597c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f97598d;

    public C24919q(Locale locale) {
        super(locale);
        this.f97597c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        C33617b c33617b = AbstractC24918p.f97595a;
        ArrayList arrayList = new ArrayList(c33617b.mo73980a());
        int iMo73980a = c33617b.mo73980a();
        for (int i13 = 0; i13 < iMo73980a; i13++) {
            DayOfWeek dayOfWeek = (DayOfWeek) c33617b.get(i13);
            arrayList.add(new C23465k(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.f97598d = arrayList;
    }

    @Override // p316m1.AbstractC24917o
    /* JADX INFO: renamed from: a */
    public final C24920r mo73018a(long j7) {
        return m73022e(Instant.ofEpochMilli(j7).atZone(f97596e).withDayOfMonth(1).toLocalDate());
    }

    @Override // p316m1.AbstractC24917o
    /* JADX INFO: renamed from: b */
    public final C24916n mo73019b() {
        LocalDate localDateNow = LocalDate.now();
        return new C24916n(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(f97596e).toInstant().toEpochMilli(), localDateNow.getDayOfMonth());
    }

    @Override // p316m1.AbstractC24917o
    /* JADX INFO: renamed from: c */
    public final C24916n mo73020c(Locale locale, String str, String str2) {
        try {
            LocalDate localDate = LocalDate.parse(str, AbstractC24899e0.m73000g(str2, locale, this.f97594b));
            return new C24916n(localDate.getYear(), localDate.getMonth().getValue(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f97596e).toInstant().toEpochMilli(), localDate.getDayOfMonth());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C24916n m73021d(long j7) {
        LocalDate localDate = Instant.ofEpochMilli(j7).atZone(f97596e).toLocalDate();
        return new C24916n(localDate.getYear(), localDate.getMonthValue(), ((long) 1000) * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC), localDate.getDayOfMonth());
    }

    /* JADX INFO: renamed from: e */
    public final C24920r m73022e(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f97597c;
        if (value < 0) {
            value += 7;
        }
        int i13 = value;
        return new C24920r(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f97596e).toInstant().toEpochMilli(), i13);
    }

    public final String toString() {
        return "CalendarModel";
    }
}
