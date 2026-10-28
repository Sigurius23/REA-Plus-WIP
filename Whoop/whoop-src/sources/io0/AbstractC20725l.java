package io0;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lio0/l;", "", "<init>", "()V", "a", "c", "d", "b", "Lio0/l$a;", "Lio0/l$b;", "Lio0/l$c;", "Lio0/l$d;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20725l {

    /* JADX INFO: renamed from: io0.l$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio0/l$a;", "Lio0/l;", "", "usState", "rescheduleAppointmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC20725l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String usState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String rescheduleAppointmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String usState, String str) {
            super(null);
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
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.usState, aVar.usState) && AbstractC22676k.m65745e(this.rescheduleAppointmentId, aVar.rescheduleAppointmentId);
        }

        public int hashCode() {
            int iHashCode = this.usState.hashCode() * 31;
            String str = this.rescheduleAppointmentId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("Initialize(usState=", this.usState, ", rescheduleAppointmentId=", this.rescheduleAppointmentId, ")");
        }
    }

    /* JADX INFO: renamed from: io0.l$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lio0/l$b;", "Lio0/l;", "", "intakeResponses", "usState", "selectedTimeSlot", "rescheduleAppointmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC20725l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String intakeResponses;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String usState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String selectedTimeSlot;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String rescheduleAppointmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String intakeResponses, String usState, String selectedTimeSlot, String str) {
            super(null);
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
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.intakeResponses, bVar.intakeResponses) && AbstractC22676k.m65745e(this.usState, bVar.usState) && AbstractC22676k.m65745e(this.selectedTimeSlot, bVar.selectedTimeSlot) && AbstractC22676k.m65745e(this.rescheduleAppointmentId, bVar.rescheduleAppointmentId);
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

    /* JADX INFO: renamed from: io0.l$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio0/l$c;", "Lio0/l;", "", "selectionDisplay", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC20725l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectionDisplay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String selectionDisplay) {
            super(null);
            AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
            this.selectionDisplay = selectionDisplay;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSelectionDisplay() {
            return this.selectionDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.selectionDisplay, ((c) other).selectionDisplay);
        }

        public int hashCode() {
            return this.selectionDisplay.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SelectDatePill(selectionDisplay=", this.selectionDisplay, ")");
        }
    }

    /* JADX INFO: renamed from: io0.l$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio0/l$d;", "Lio0/l;", "", "timeSlot", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC20725l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String timeSlot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String timeSlot) {
            super(null);
            AbstractC22676k.m65750j(timeSlot, "timeSlot");
            this.timeSlot = timeSlot;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTimeSlot() {
            return this.timeSlot;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.timeSlot, ((d) other).timeSlot);
        }

        public int hashCode() {
            return this.timeSlot.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SelectTimeSlot(timeSlot=", this.timeSlot, ")");
        }
    }

    public /* synthetic */ AbstractC20725l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC20725l() {
    }
}
