package kj2;

import com.whoop.design.models.calendar.CalendarDateModel;
import h91.C17027b;
import nj2.AbstractC26765l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kj2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, m65681d2 = {"Lkj2/g;", "", "Lnj2/l;", "monitor", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendar", "<init>", "(Lnj2/l;Lh91/b;)V", "a", "()Lnj2/l;", "b", "()Lh91/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnj2/l;", "getMonitor", "Lh91/b;", "getCalendar", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22523g {

    /* JADX INFO: renamed from: c */
    public static final int f88351c = C17027b.f65485k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC26765l monitor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17027b<CalendarDateModel> calendar;

    public C22523g(AbstractC26765l monitor, C17027b<CalendarDateModel> c17027b) {
        AbstractC22676k.m65750j(monitor, "monitor");
        this.monitor = monitor;
        this.calendar = c17027b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC26765l getMonitor() {
        return this.monitor;
    }

    /* JADX INFO: renamed from: b */
    public final C17027b<CalendarDateModel> m65055b() {
        return this.calendar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22523g)) {
            return false;
        }
        C22523g c22523g = (C22523g) other;
        return AbstractC22676k.m65745e(this.monitor, c22523g.monitor) && AbstractC22676k.m65745e(this.calendar, c22523g.calendar);
    }

    public int hashCode() {
        int iHashCode = this.monitor.hashCode() * 31;
        C17027b<CalendarDateModel> c17027b = this.calendar;
        return iHashCode + (c17027b == null ? 0 : c17027b.hashCode());
    }

    public String toString() {
        return "StressCombinedState(monitor=" + this.monitor + ", calendar=" + this.calendar + ")";
    }
}
