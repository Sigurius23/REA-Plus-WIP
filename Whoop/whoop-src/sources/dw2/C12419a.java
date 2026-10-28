package dw2;

import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dw2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ldw2/a;", "", "", "name", "Lorg/joda/time/DateTime;", "completedTimestamp", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getCompletedTimestamp", "()Lorg/joda/time/DateTime;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12419a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DateTime completedTimestamp;

    public C12419a(String name, DateTime dateTime) {
        AbstractC22676k.m65750j(name, "name");
        this.name = name;
        this.completedTimestamp = dateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12419a)) {
            return false;
        }
        C12419a c12419a = (C12419a) other;
        return AbstractC22676k.m65745e(this.name, c12419a.name) && AbstractC22676k.m65745e(this.completedTimestamp, c12419a.completedTimestamp);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        DateTime dateTime = this.completedTimestamp;
        return iHashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        return "PendingWorkout(name=" + this.name + ", completedTimestamp=" + this.completedTimestamp + ")";
    }

    public /* synthetic */ C12419a(String str, DateTime dateTime, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : dateTime);
    }
}
