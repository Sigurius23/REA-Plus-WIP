package h91;

import c13.AbstractC3855a;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import k71.C22246d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h91.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001\u0017B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lh91/a;", "", "Ljava/util/Locale;", "locale", "Ljava/time/LocalDate;", "currentDate", "selectedDate", "monthDate", "", "Lk71/d;", "legendList", "<init>", "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Locale;", "b", "()Ljava/util/Locale;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "c", "d", "e", "Ljava/util/List;", "getLegendList", "()Ljava/util/List;", "f", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17026a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f65478g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LocalDate currentDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LocalDate selectedDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalDate monthDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C22246d> legendList;

    /* JADX INFO: renamed from: h91.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lh91/a$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Ljava/time/LocalDate;", "currentDate", "selectedDate", "monthDate", "", "Lk71/d;", "legendList", "Lh91/a;", "a", "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)Lh91/a;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C17026a m48072a(Locale locale, LocalDate currentDate, LocalDate selectedDate, LocalDate monthDate, List<C22246d> legendList) {
            AbstractC22676k.m65750j(locale, "locale");
            AbstractC22676k.m65750j(currentDate, "currentDate");
            AbstractC22676k.m65750j(selectedDate, "selectedDate");
            AbstractC22676k.m65750j(monthDate, "monthDate");
            AbstractC22676k.m65750j(legendList, "legendList");
            return new C17026a(locale, currentDate, selectedDate, AbstractC17028c.m48089a(monthDate), legendList);
        }

        private Companion() {
        }
    }

    public C17026a(Locale locale, LocalDate currentDate, LocalDate selectedDate, LocalDate monthDate, List<C22246d> legendList) {
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(monthDate, "monthDate");
        AbstractC22676k.m65750j(legendList, "legendList");
        this.locale = locale;
        this.currentDate = currentDate;
        this.selectedDate = selectedDate;
        this.monthDate = monthDate;
        this.legendList = legendList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getMonthDate() {
        return this.monthDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17026a)) {
            return false;
        }
        C17026a c17026a = (C17026a) other;
        return AbstractC22676k.m65745e(this.locale, c17026a.locale) && AbstractC22676k.m65745e(this.currentDate, c17026a.currentDate) && AbstractC22676k.m65745e(this.selectedDate, c17026a.selectedDate) && AbstractC22676k.m65745e(this.monthDate, c17026a.monthDate) && AbstractC22676k.m65745e(this.legendList, c17026a.legendList);
    }

    public int hashCode() {
        return this.legendList.hashCode() + AbstractC13673n.m38558e(this.monthDate, AbstractC13673n.m38558e(this.selectedDate, AbstractC13673n.m38558e(this.currentDate, this.locale.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        Locale locale = this.locale;
        LocalDate localDate = this.currentDate;
        LocalDate localDate2 = this.selectedDate;
        LocalDate localDate3 = this.monthDate;
        List<C22246d> list = this.legendList;
        StringBuilder sb4 = new StringBuilder("CalendarMonthState(locale=");
        sb4.append(locale);
        sb4.append(", currentDate=");
        sb4.append(localDate);
        sb4.append(", selectedDate=");
        sb4.append(localDate2);
        sb4.append(", monthDate=");
        sb4.append(localDate3);
        sb4.append(", legendList=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
