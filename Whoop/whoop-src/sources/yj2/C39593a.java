package yj2;

import com.whoop.design.models.calendar.CalendarDateModel;
import h91.C17027b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wj2.AbstractC37321b;

/* JADX INFO: renamed from: yj2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lyj2/a;", "", "Lwj2/b;", "domainResult", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarState", "<init>", "(Lwj2/b;Lh91/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwj2/b;", "b", "()Lwj2/b;", "Lh91/b;", "()Lh91/b;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39593a {

    /* JADX INFO: renamed from: c */
    public static final int f170331c = C17027b.f65485k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC37321b domainResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17027b<CalendarDateModel> calendarState;

    public C39593a(AbstractC37321b domainResult, C17027b<CalendarDateModel> c17027b) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        this.domainResult = domainResult;
        this.calendarState = c17027b;
    }

    /* JADX INFO: renamed from: a */
    public final C17027b<CalendarDateModel> m126474a() {
        return this.calendarState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC37321b getDomainResult() {
        return this.domainResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39593a)) {
            return false;
        }
        C39593a c39593a = (C39593a) other;
        return AbstractC22676k.m65745e(this.domainResult, c39593a.domainResult) && AbstractC22676k.m65745e(this.calendarState, c39593a.calendarState);
    }

    public int hashCode() {
        int iHashCode = this.domainResult.hashCode() * 31;
        C17027b<CalendarDateModel> c17027b = this.calendarState;
        return iHashCode + (c17027b == null ? 0 : c17027b.hashCode());
    }

    public String toString() {
        return "TiltGraphCombinedDomainState(domainResult=" + this.domainResult + ", calendarState=" + this.calendarState + ")";
    }
}
