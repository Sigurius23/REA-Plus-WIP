package ev0;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import td1.EnumC33707e;

/* JADX INFO: renamed from: ev0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lev0/a;", "", "", "countOfDisconnects", "", "durationStrapDisconnectedMillis", "lastDisconnectMillis", "Ltd1/e;", "lastStrapState", "<init>", "(IJJLtd1/e;)V", "a", "(IJJLtd1/e;)Lev0/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "J", "d", "()J", "e", "Ltd1/e;", "f", "()Ltd1/e;", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13679a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int countOfDisconnects;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long durationStrapDisconnectedMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long lastDisconnectMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC33707e lastStrapState;

    public C13679a(int i13, long j7, long j13, EnumC33707e lastStrapState) {
        AbstractC22676k.m65750j(lastStrapState, "lastStrapState");
        this.countOfDisconnects = i13;
        this.durationStrapDisconnectedMillis = j7;
        this.lastDisconnectMillis = j13;
        this.lastStrapState = lastStrapState;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13679a m38582b(C13679a c13679a, int i13, long j7, long j13, EnumC33707e enumC33707e, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c13679a.countOfDisconnects;
        }
        if ((i14 & 2) != 0) {
            j7 = c13679a.durationStrapDisconnectedMillis;
        }
        if ((i14 & 4) != 0) {
            j13 = c13679a.lastDisconnectMillis;
        }
        if ((i14 & 8) != 0) {
            enumC33707e = c13679a.lastStrapState;
        }
        EnumC33707e enumC33707e2 = enumC33707e;
        return c13679a.m38583a(i13, j7, j13, enumC33707e2);
    }

    /* JADX INFO: renamed from: a */
    public final C13679a m38583a(int countOfDisconnects, long durationStrapDisconnectedMillis, long lastDisconnectMillis, EnumC33707e lastStrapState) {
        AbstractC22676k.m65750j(lastStrapState, "lastStrapState");
        return new C13679a(countOfDisconnects, durationStrapDisconnectedMillis, lastDisconnectMillis, lastStrapState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCountOfDisconnects() {
        return this.countOfDisconnects;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getDurationStrapDisconnectedMillis() {
        return this.durationStrapDisconnectedMillis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLastDisconnectMillis() {
        return this.lastDisconnectMillis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13679a)) {
            return false;
        }
        C13679a c13679a = (C13679a) other;
        return this.countOfDisconnects == c13679a.countOfDisconnects && this.durationStrapDisconnectedMillis == c13679a.durationStrapDisconnectedMillis && this.lastDisconnectMillis == c13679a.lastDisconnectMillis && this.lastStrapState == c13679a.lastStrapState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC33707e getLastStrapState() {
        return this.lastStrapState;
    }

    public int hashCode() {
        return this.lastStrapState.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Integer.hashCode(this.countOfDisconnects) * 31, this.durationStrapDisconnectedMillis, 31), this.lastDisconnectMillis, 31);
    }

    public String toString() {
        int i13 = this.countOfDisconnects;
        long j7 = this.durationStrapDisconnectedMillis;
        long j13 = this.lastDisconnectMillis;
        EnumC33707e enumC33707e = this.lastStrapState;
        StringBuilder sb4 = new StringBuilder("StrapDisconnectCountAndTime(countOfDisconnects=");
        sb4.append(i13);
        sb4.append(", durationStrapDisconnectedMillis=");
        sb4.append(j7);
        AbstractC2875y.m8285A(sb4, ", lastDisconnectMillis=", j13, ", lastStrapState=");
        sb4.append(enumC33707e);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C13679a(int i13, long j7, long j13, EnumC33707e enumC33707e, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? 0L : j7, (i14 & 4) != 0 ? 0L : j13, (i14 & 8) != 0 ? EnumC33707e.NONE : enumC33707e);
    }
}
