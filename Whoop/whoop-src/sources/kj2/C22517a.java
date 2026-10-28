package kj2;

import com.whoop.design.models.calendar.CalendarDateModel;
import ih0.AbstractC18489d0;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kj2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lkj2/a;", "", "", "", "", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "mapOfExistingMonths", "Ljava/time/LocalDate;", "selectedDate", "", "isLoading", "<init>", "(Ljava/util/Map;Ljava/time/LocalDate;Z)V", "a", "(Ljava/util/Map;Ljava/time/LocalDate;Z)Lkj2/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "b", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "Z", "e", "()Z", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C22517a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<Integer, List<CalendarDateModel>> mapOfExistingMonths;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LocalDate selectedDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public C22517a(Map<Integer, ? extends List<CalendarDateModel>> mapOfExistingMonths, LocalDate localDate, boolean z4) {
        AbstractC22676k.m65750j(mapOfExistingMonths, "mapOfExistingMonths");
        this.mapOfExistingMonths = mapOfExistingMonths;
        this.selectedDate = localDate;
        this.isLoading = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22517a m65023b(C22517a c22517a, Map map, LocalDate localDate, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = c22517a.mapOfExistingMonths;
        }
        if ((i13 & 2) != 0) {
            localDate = c22517a.selectedDate;
        }
        if ((i13 & 4) != 0) {
            z4 = c22517a.isLoading;
        }
        return c22517a.m65024a(map, localDate, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C22517a m65024a(Map<Integer, ? extends List<CalendarDateModel>> mapOfExistingMonths, LocalDate selectedDate, boolean isLoading) {
        AbstractC22676k.m65750j(mapOfExistingMonths, "mapOfExistingMonths");
        return new C22517a(mapOfExistingMonths, selectedDate, isLoading);
    }

    /* JADX INFO: renamed from: c */
    public final Map<Integer, List<CalendarDateModel>> m65025c() {
        return this.mapOfExistingMonths;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22517a)) {
            return false;
        }
        C22517a c22517a = (C22517a) other;
        return AbstractC22676k.m65745e(this.mapOfExistingMonths, c22517a.mapOfExistingMonths) && AbstractC22676k.m65745e(this.selectedDate, c22517a.selectedDate) && this.isLoading == c22517a.isLoading;
    }

    public int hashCode() {
        int iHashCode = this.mapOfExistingMonths.hashCode() * 31;
        LocalDate localDate = this.selectedDate;
        return Boolean.hashCode(this.isLoading) + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    public String toString() {
        Map<Integer, List<CalendarDateModel>> map = this.mapOfExistingMonths;
        LocalDate localDate = this.selectedDate;
        boolean z4 = this.isLoading;
        StringBuilder sb4 = new StringBuilder("DomainDataAccumulator(mapOfExistingMonths=");
        sb4.append(map);
        sb4.append(", selectedDate=");
        sb4.append(localDate);
        sb4.append(", isLoading=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C22517a(Map map, LocalDate localDate, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? null : localDate, (i13 & 4) != 0 ? false : z4);
    }
}
