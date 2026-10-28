package bn0;

import java.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bn0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lbn0/a;", "", "Ljava/time/LocalDate;", "selectedDate", "<init>", "(Ljava/time/LocalDate;)V", "a", "(Ljava/time/LocalDate;)Lbn0/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "b", "()Ljava/time/LocalDate;", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3493a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LocalDate selectedDate;

    public C3493a(LocalDate localDate) {
        this.selectedDate = localDate;
    }

    /* JADX INFO: renamed from: a */
    public final C3493a m10298a(LocalDate selectedDate) {
        return new C3493a(selectedDate);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C3493a) && AbstractC22676k.m65745e(this.selectedDate, ((C3493a) other).selectedDate);
    }

    public int hashCode() {
        LocalDate localDate = this.selectedDate;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }

    public String toString() {
        return "ArchMiniCalendarAccumulator(selectedDate=" + this.selectedDate + ")";
    }

    public /* synthetic */ C3493a(LocalDate localDate, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : localDate);
    }
}
