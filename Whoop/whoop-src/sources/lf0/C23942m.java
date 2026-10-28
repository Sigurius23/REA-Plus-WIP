package lf0;

import kd1.AbstractC22403o;
import ld0.C23844c;
import ld0.C23845d;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001d\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, m65681d2 = {"Llf0/m;", "Lm91/u;", "Lld0/d;", "appointmentSummary", "Lny0/h;", "addToCalendarButton", "Lld0/c;", "addToCalendarData", "cancelRescheduleButton", "downloadLabOrderButton", "Llf0/v;", "cancelRescheduleDialog", "<init>", "(Lld0/d;Lny0/h;Lld0/c;Lny0/h;Lny0/h;Llf0/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld0/d;", "c", "()Lld0/d;", "b", "Lny0/h;", "()Lny0/h;", "Lld0/c;", "()Lld0/c;", "d", "e", "g", "f", "Llf0/v;", "()Llf0/v;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23942m implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f94594g = C27256h.f109055z | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23845d appointmentSummary;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27256h addToCalendarButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23844c addToCalendarData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27256h cancelRescheduleButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27256h downloadLabOrderButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C23976v cancelRescheduleDialog;

    public C23942m(C23845d appointmentSummary, C27256h c27256h, C23844c c23844c, C27256h c27256h2, C27256h c27256h3, C23976v c23976v) {
        AbstractC22676k.m65750j(appointmentSummary, "appointmentSummary");
        this.appointmentSummary = appointmentSummary;
        this.addToCalendarButton = c27256h;
        this.addToCalendarData = c23844c;
        this.cancelRescheduleButton = c27256h2;
        this.downloadLabOrderButton = c27256h3;
        this.cancelRescheduleDialog = c23976v;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getAddToCalendarButton() {
        return this.addToCalendarButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23844c getAddToCalendarData() {
        return this.addToCalendarData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C23845d getAppointmentSummary() {
        return this.appointmentSummary;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27256h getCancelRescheduleButton() {
        return this.cancelRescheduleButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23942m)) {
            return false;
        }
        C23942m c23942m = (C23942m) other;
        return AbstractC22676k.m65745e(this.appointmentSummary, c23942m.appointmentSummary) && AbstractC22676k.m65745e(this.addToCalendarButton, c23942m.addToCalendarButton) && AbstractC22676k.m65745e(this.addToCalendarData, c23942m.addToCalendarData) && AbstractC22676k.m65745e(this.cancelRescheduleButton, c23942m.cancelRescheduleButton) && AbstractC22676k.m65745e(this.downloadLabOrderButton, c23942m.downloadLabOrderButton) && AbstractC22676k.m65745e(this.cancelRescheduleDialog, c23942m.cancelRescheduleDialog);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C23976v getCancelRescheduleDialog() {
        return this.cancelRescheduleDialog;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C27256h getDownloadLabOrderButton() {
        return this.downloadLabOrderButton;
    }

    public int hashCode() {
        int iHashCode = this.appointmentSummary.hashCode() * 31;
        C27256h c27256h = this.addToCalendarButton;
        int iHashCode2 = (iHashCode + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        C23844c c23844c = this.addToCalendarData;
        int iHashCode3 = (iHashCode2 + (c23844c == null ? 0 : c23844c.hashCode())) * 31;
        C27256h c27256h2 = this.cancelRescheduleButton;
        int iHashCode4 = (iHashCode3 + (c27256h2 == null ? 0 : c27256h2.hashCode())) * 31;
        C27256h c27256h3 = this.downloadLabOrderButton;
        int iHashCode5 = (iHashCode4 + (c27256h3 == null ? 0 : c27256h3.hashCode())) * 31;
        C23976v c23976v = this.cancelRescheduleDialog;
        return iHashCode5 + (c23976v != null ? c23976v.hashCode() : 0);
    }

    public String toString() {
        return "AppointmentSummaryChecklistItemState(appointmentSummary=" + this.appointmentSummary + ", addToCalendarButton=" + this.addToCalendarButton + ", addToCalendarData=" + this.addToCalendarData + ", cancelRescheduleButton=" + this.cancelRescheduleButton + ", downloadLabOrderButton=" + this.downloadLabOrderButton + ", cancelRescheduleDialog=" + this.cancelRescheduleDialog + ")";
    }
}
