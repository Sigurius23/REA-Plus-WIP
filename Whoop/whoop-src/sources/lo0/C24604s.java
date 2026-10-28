package lo0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lo0.s */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, m65681d2 = {"Llo0/s;", "Llo0/v;", "", "intakeResponses", "usState", "selectedTimeSlot", "rescheduleAppointmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24604s implements InterfaceC24610v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String intakeResponses;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String usState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String selectedTimeSlot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String rescheduleAppointmentId;

    public C24604s(String intakeResponses, String usState, String selectedTimeSlot, String str) {
        AbstractC22676k.m65750j(intakeResponses, "intakeResponses");
        AbstractC22676k.m65750j(usState, "usState");
        AbstractC22676k.m65750j(selectedTimeSlot, "selectedTimeSlot");
        this.intakeResponses = intakeResponses;
        this.usState = usState;
        this.selectedTimeSlot = selectedTimeSlot;
        this.rescheduleAppointmentId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIntakeResponses() {
        return this.intakeResponses;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRescheduleAppointmentId() {
        return this.rescheduleAppointmentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSelectedTimeSlot() {
        return this.selectedTimeSlot;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUsState() {
        return this.usState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24604s)) {
            return false;
        }
        C24604s c24604s = (C24604s) other;
        return AbstractC22676k.m65745e(this.intakeResponses, c24604s.intakeResponses) && AbstractC22676k.m65745e(this.usState, c24604s.usState) && AbstractC22676k.m65745e(this.selectedTimeSlot, c24604s.selectedTimeSlot) && AbstractC22676k.m65745e(this.rescheduleAppointmentId, c24604s.rescheduleAppointmentId);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.intakeResponses.hashCode() * 31, 31, this.usState), 31, this.selectedTimeSlot);
        String str = this.rescheduleAppointmentId;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.intakeResponses;
        String str2 = this.usState;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("Save(intakeResponses=", str, ", usState=", str2, ", selectedTimeSlot="), this.selectedTimeSlot, ", rescheduleAppointmentId=", this.rescheduleAppointmentId, ")");
    }
}
