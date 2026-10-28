package n41;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: n41.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, m65681d2 = {"Ln41/a;", "", "", "hours", "minutes", "seconds", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26270a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int hours;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int minutes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int seconds;

    public C26270a(int i13, int i14, int i15) {
        this.hours = i13;
        this.minutes = i14;
        this.seconds = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26270a)) {
            return false;
        }
        C26270a c26270a = (C26270a) other;
        return this.hours == c26270a.hours && this.minutes == c26270a.minutes && this.seconds == c26270a.seconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.seconds) + AbstractC11266d.m30448b(this.minutes, Integer.hashCode(this.hours) * 31, 31);
    }

    public String toString() {
        int i13 = this.hours;
        int i14 = this.minutes;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "TimeParts(hours=", ", minutes=", ", seconds="), this.seconds, ")");
    }
}
