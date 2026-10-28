package rg2;

import ih0.AbstractC18489d0;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rg2.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lrg2/s;", "", "", "Lrg2/h;", "recentActivityIcons", "", "selectedActivityLabel", "", "showGpsToggle", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31407s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C31396h> recentActivityIcons;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedActivityLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showGpsToggle;

    public C31407s(List<C31396h> recentActivityIcons, String selectedActivityLabel, boolean z4) {
        AbstractC22676k.m65750j(recentActivityIcons, "recentActivityIcons");
        AbstractC22676k.m65750j(selectedActivityLabel, "selectedActivityLabel");
        this.recentActivityIcons = recentActivityIcons;
        this.selectedActivityLabel = selectedActivityLabel;
        this.showGpsToggle = z4;
    }

    /* JADX INFO: renamed from: a */
    public final List<C31396h> m96720a() {
        return this.recentActivityIcons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSelectedActivityLabel() {
        return this.selectedActivityLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowGpsToggle() {
        return this.showGpsToggle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31407s)) {
            return false;
        }
        C31407s c31407s = (C31407s) other;
        return AbstractC22676k.m65745e(this.recentActivityIcons, c31407s.recentActivityIcons) && AbstractC22676k.m65745e(this.selectedActivityLabel, c31407s.selectedActivityLabel) && this.showGpsToggle == c31407s.showGpsToggle;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showGpsToggle) + AbstractC11266d.m30450d(this.recentActivityIcons.hashCode() * 31, 31, this.selectedActivityLabel);
    }

    public String toString() {
        List<C31396h> list = this.recentActivityIcons;
        String str = this.selectedActivityLabel;
        return AbstractC18489d0.m53372m(AbstractC26725a.m79507k("PreSessionWidgetSelectionState(recentActivityIcons=", ", selectedActivityLabel=", str, ", showGpsToggle=", list), this.showGpsToggle, ")");
    }
}
