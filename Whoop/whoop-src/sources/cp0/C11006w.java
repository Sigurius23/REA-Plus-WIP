package cp0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.EnumC32692x1;

/* JADX INFO: renamed from: cp0.w */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcp0/w;", "", "", "id", "Lsl0/x1;", "autoLaunch", "<init>", "(ILsl0/x1;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lsl0/x1;", "()Lsl0/x1;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11006w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC32692x1 autoLaunch;

    public C11006w(int i13, EnumC32692x1 autoLaunch) {
        AbstractC22676k.m65750j(autoLaunch, "autoLaunch");
        this.id = i13;
        this.autoLaunch = autoLaunch;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC32692x1 getAutoLaunch() {
        return this.autoLaunch;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11006w)) {
            return false;
        }
        C11006w c11006w = (C11006w) other;
        return this.id == c11006w.id && this.autoLaunch == c11006w.autoLaunch;
    }

    public int hashCode() {
        return this.autoLaunch.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public String toString() {
        return "CoachDrawerVoiceLaunchRequest(id=" + this.id + ", autoLaunch=" + this.autoLaunch + ")";
    }
}
