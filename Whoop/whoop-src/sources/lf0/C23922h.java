package lf0;

import kd1.AbstractC22403o;
import ld0.C23845d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llf0/h;", "Lm91/u;", "Lld0/d;", "appointmentSummary", "<init>", "(Lld0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld0/d;", "()Lld0/d;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23922h implements InterfaceC25312u {

    /* JADX INFO: renamed from: b */
    public static final int f94558b = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23845d appointmentSummary;

    public C23922h(C23845d appointmentSummary) {
        AbstractC22676k.m65750j(appointmentSummary, "appointmentSummary");
        this.appointmentSummary = appointmentSummary;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23845d getAppointmentSummary() {
        return this.appointmentSummary;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C23922h) && AbstractC22676k.m65745e(this.appointmentSummary, ((C23922h) other).appointmentSummary);
    }

    public int hashCode() {
        return this.appointmentSummary.hashCode();
    }

    public String toString() {
        return "AppointmentInfoCardViewState(appointmentSummary=" + this.appointmentSummary + ")";
    }
}
