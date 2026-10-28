package kj2;

import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kj2.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lkj2/o;", "", "Lorg/joda/time/DateTime;", "startSessionTime", "Lkj2/m;", "action", "<init>", "(Lorg/joda/time/DateTime;Lkj2/m;)V", "a", "()Lorg/joda/time/DateTime;", "b", "()Lkj2/m;", "c", "(Lorg/joda/time/DateTime;Lkj2/m;)Lkj2/o;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/DateTime;", "getStartSessionTime", "Lkj2/m;", "getAction", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C22531o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DateTime startSessionTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22529m action;

    public C22531o(DateTime dateTime, AbstractC22529m action) {
        AbstractC22676k.m65750j(action, "action");
        this.startSessionTime = dateTime;
        this.action = action;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C22531o m65124d(C22531o c22531o, DateTime dateTime, AbstractC22529m abstractC22529m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateTime = c22531o.startSessionTime;
        }
        if ((i13 & 2) != 0) {
            abstractC22529m = c22531o.action;
        }
        return c22531o.m65127c(dateTime, abstractC22529m);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTime getStartSessionTime() {
        return this.startSessionTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22529m getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: c */
    public final C22531o m65127c(DateTime startSessionTime, AbstractC22529m action) {
        AbstractC22676k.m65750j(action, "action");
        return new C22531o(startSessionTime, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22531o)) {
            return false;
        }
        C22531o c22531o = (C22531o) other;
        return AbstractC22676k.m65745e(this.startSessionTime, c22531o.startSessionTime) && AbstractC22676k.m65745e(this.action, c22531o.action);
    }

    public int hashCode() {
        DateTime dateTime = this.startSessionTime;
        return this.action.hashCode() + ((dateTime == null ? 0 : dateTime.hashCode()) * 31);
    }

    public String toString() {
        return "StressStartTimeAccumulator(startSessionTime=" + this.startSessionTime + ", action=" + this.action + ")";
    }

    public /* synthetic */ C22531o(DateTime dateTime, AbstractC22529m abstractC22529m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : dateTime, (i13 & 2) != 0 ? AbstractC22529m.b.f88475a : abstractC22529m);
    }
}
