package sg2;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import rg2.C31395g;

/* JADX INFO: renamed from: sg2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lsg2/h;", "Lm91/u;", "", "selectedActivityLabel", "", "showGpsToggle", "isGpsTrackingEnabled", "Lrg2/g;", "recentActivitiesRow", "<init>", "(Ljava/lang/String;ZZLrg2/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "e", "d", "Lrg2/g;", "()Lrg2/g;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32457h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String selectedActivityLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showGpsToggle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isGpsTrackingEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31395g recentActivitiesRow;

    public C32457h(String selectedActivityLabel, boolean z4, boolean z13, C31395g recentActivitiesRow) {
        AbstractC22676k.m65750j(selectedActivityLabel, "selectedActivityLabel");
        AbstractC22676k.m65750j(recentActivitiesRow, "recentActivitiesRow");
        this.selectedActivityLabel = selectedActivityLabel;
        this.showGpsToggle = z4;
        this.isGpsTrackingEnabled = z13;
        this.recentActivitiesRow = recentActivitiesRow;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C31395g getRecentActivitiesRow() {
        return this.recentActivitiesRow;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSelectedActivityLabel() {
        return this.selectedActivityLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowGpsToggle() {
        return this.showGpsToggle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsGpsTrackingEnabled() {
        return this.isGpsTrackingEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32457h)) {
            return false;
        }
        C32457h c32457h = (C32457h) other;
        return AbstractC22676k.m65745e(this.selectedActivityLabel, c32457h.selectedActivityLabel) && this.showGpsToggle == c32457h.showGpsToggle && this.isGpsTrackingEnabled == c32457h.isGpsTrackingEnabled && AbstractC22676k.m65745e(this.recentActivitiesRow, c32457h.recentActivitiesRow);
    }

    public int hashCode() {
        return this.recentActivitiesRow.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.selectedActivityLabel.hashCode() * 31, 31, this.showGpsToggle), 31, this.isGpsTrackingEnabled);
    }

    public String toString() {
        String str = this.selectedActivityLabel;
        boolean z4 = this.showGpsToggle;
        boolean z13 = this.isGpsTrackingEnabled;
        C31395g c31395g = this.recentActivitiesRow;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("PreSessionActivitySummaryViewState(selectedActivityLabel=", str, ", showGpsToggle=", ", isGpsTrackingEnabled=", z4);
        sbM73379l.append(z13);
        sbM73379l.append(", recentActivitiesRow=");
        sbM73379l.append(c31395g);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
