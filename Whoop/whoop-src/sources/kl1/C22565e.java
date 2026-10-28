package kl1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kl1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lkl1/e;", "", "Lkl1/d;", "domainResult", "Lkl1/a;", "calendarAccumulatedList", "<init>", "(Lkl1/d;Lkl1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkl1/d;", "b", "()Lkl1/d;", "Lkl1/a;", "()Lkl1/a;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22565e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22564d domainResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22561a calendarAccumulatedList;

    public C22565e(AbstractC22564d domainResult, C22561a calendarAccumulatedList) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(calendarAccumulatedList, "calendarAccumulatedList");
        this.domainResult = domainResult;
        this.calendarAccumulatedList = calendarAccumulatedList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22561a getCalendarAccumulatedList() {
        return this.calendarAccumulatedList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22564d getDomainResult() {
        return this.domainResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22565e)) {
            return false;
        }
        C22565e c22565e = (C22565e) other;
        return AbstractC22676k.m65745e(this.domainResult, c22565e.domainResult) && AbstractC22676k.m65745e(this.calendarAccumulatedList, c22565e.calendarAccumulatedList);
    }

    public int hashCode() {
        return this.calendarAccumulatedList.hashCode() + (this.domainResult.hashCode() * 31);
    }

    public String toString() {
        return "CalendarDomainResultAccumulator(domainResult=" + this.domainResult + ", calendarAccumulatedList=" + this.calendarAccumulatedList + ")";
    }
}
