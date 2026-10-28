package ca2;

import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ca2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001f"}, m65681d2 = {"Lca2/a;", "", "", "isDataCatchingUp", "Lorg/joda/time/DateTime;", "lastSyncTimeStamp", "Lca2/c;", "state", "", "minutesBehind", "<init>", "(ZLorg/joda/time/DateTime;Lca2/c;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "c", "Lca2/c;", "()Lca2/c;", "I", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4361a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isDataCatchingUp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DateTime lastSyncTimeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC4363c state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int minutesBehind;

    public C4361a(boolean z4, DateTime lastSyncTimeStamp, EnumC4363c state, int i13) {
        AbstractC22676k.m65750j(lastSyncTimeStamp, "lastSyncTimeStamp");
        AbstractC22676k.m65750j(state, "state");
        this.isDataCatchingUp = z4;
        this.lastSyncTimeStamp = lastSyncTimeStamp;
        this.state = state;
        this.minutesBehind = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTime getLastSyncTimeStamp() {
        return this.lastSyncTimeStamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMinutesBehind() {
        return this.minutesBehind;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC4363c getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsDataCatchingUp() {
        return this.isDataCatchingUp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4361a)) {
            return false;
        }
        C4361a c4361a = (C4361a) other;
        return this.isDataCatchingUp == c4361a.isDataCatchingUp && AbstractC22676k.m65745e(this.lastSyncTimeStamp, c4361a.lastSyncTimeStamp) && this.state == c4361a.state && this.minutesBehind == c4361a.minutesBehind;
    }

    public int hashCode() {
        return Integer.hashCode(this.minutesBehind) + ((this.state.hashCode() + ((this.lastSyncTimeStamp.hashCode() + (Boolean.hashCode(this.isDataCatchingUp) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "DataCatchingUpDomainResult(isDataCatchingUp=" + this.isDataCatchingUp + ", lastSyncTimeStamp=" + this.lastSyncTimeStamp + ", state=" + this.state + ", minutesBehind=" + this.minutesBehind + ")";
    }

    public /* synthetic */ C4361a(boolean z4, DateTime dateTime, EnumC4363c enumC4363c, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, dateTime, (i14 & 4) != 0 ? EnumC4363c.STANDBY : enumC4363c, (i14 & 8) != 0 ? 0 : i13);
    }
}
