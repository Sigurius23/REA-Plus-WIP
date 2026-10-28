package lo0;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lo0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llo0/q;", "Llo0/v;", "", "usState", "rescheduleAppointmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24600q implements InterfaceC24610v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String usState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String rescheduleAppointmentId;

    public C24600q(String usState, String str) {
        AbstractC22676k.m65750j(usState, "usState");
        this.usState = usState;
        this.rescheduleAppointmentId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRescheduleAppointmentId() {
        return this.rescheduleAppointmentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUsState() {
        return this.usState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24600q)) {
            return false;
        }
        C24600q c24600q = (C24600q) other;
        return AbstractC22676k.m65745e(this.usState, c24600q.usState) && AbstractC22676k.m65745e(this.rescheduleAppointmentId, c24600q.rescheduleAppointmentId);
    }

    public int hashCode() {
        int iHashCode = this.usState.hashCode() * 31;
        String str = this.rescheduleAppointmentId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC2875y.m8300m("Initialize(usState=", this.usState, ", rescheduleAppointmentId=", this.rescheduleAppointmentId, ")");
    }

    public /* synthetic */ C24600q(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2);
    }
}
