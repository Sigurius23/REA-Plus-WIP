package rg2;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rg2.u */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lrg2/u;", "", "", "selectedActivityLabel", "", "showGpsToggle", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31409u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String selectedActivityLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showGpsToggle;

    public C31409u(String selectedActivityLabel, boolean z4) {
        AbstractC22676k.m65750j(selectedActivityLabel, "selectedActivityLabel");
        this.selectedActivityLabel = selectedActivityLabel;
        this.showGpsToggle = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSelectedActivityLabel() {
        return this.selectedActivityLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowGpsToggle() {
        return this.showGpsToggle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31409u)) {
            return false;
        }
        C31409u c31409u = (C31409u) other;
        return AbstractC22676k.m65745e(this.selectedActivityLabel, c31409u.selectedActivityLabel) && this.showGpsToggle == c31409u.showGpsToggle;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showGpsToggle) + (this.selectedActivityLabel.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79503g("SelectedActivityPresentation(selectedActivityLabel=", this.selectedActivityLabel, ", showGpsToggle=", ")", this.showGpsToggle);
    }

    public /* synthetic */ C31409u(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z4);
    }
}
