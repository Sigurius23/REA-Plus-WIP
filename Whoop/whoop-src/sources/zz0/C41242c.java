package zz0;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lzz0/c;", "", "", "index", "Lzz0/b;", "dayStatus", "", "isToday", "<init>", "(ILzz0/b;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "b", "Lzz0/b;", "()Lzz0/b;", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41242c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC41241b dayStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isToday;

    public C41242c(int i13, EnumC41241b dayStatus, boolean z4) {
        AbstractC22676k.m65750j(dayStatus, "dayStatus");
        this.index = i13;
        this.dayStatus = dayStatus;
        this.isToday = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC41241b getDayStatus() {
        return this.dayStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsToday() {
        return this.isToday;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41242c)) {
            return false;
        }
        C41242c c41242c = (C41242c) other;
        return this.index == c41242c.index && this.dayStatus == c41242c.dayStatus && this.isToday == c41242c.isToday;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isToday) + ((this.dayStatus.hashCode() + (Integer.hashCode(this.index) * 31)) * 31);
    }

    public String toString() {
        int i13 = this.index;
        EnumC41241b enumC41241b = this.dayStatus;
        boolean z4 = this.isToday;
        StringBuilder sb4 = new StringBuilder("BehaviorsCalendarDayViewState(index=");
        sb4.append(i13);
        sb4.append(", dayStatus=");
        sb4.append(enumC41241b);
        sb4.append(", isToday=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
