package rg2;

import java.util.List;
import m83.C25271y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rg2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lrg2/m;", "", "", "selectedActivityLabel", "", "Lrg2/h;", "recentActivityIcons", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSelectedActivityLabel", "b", "Ljava/util/List;", "getRecentActivityIcons", "()Ljava/util/List;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31401m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String selectedActivityLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C31396h> recentActivityIcons;

    public C31401m(String selectedActivityLabel, List<C31396h> recentActivityIcons) {
        AbstractC22676k.m65750j(selectedActivityLabel, "selectedActivityLabel");
        AbstractC22676k.m65750j(recentActivityIcons, "recentActivityIcons");
        this.selectedActivityLabel = selectedActivityLabel;
        this.recentActivityIcons = recentActivityIcons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31401m)) {
            return false;
        }
        C31401m c31401m = (C31401m) other;
        return AbstractC22676k.m65745e(this.selectedActivityLabel, c31401m.selectedActivityLabel) && AbstractC22676k.m65745e(this.recentActivityIcons, c31401m.recentActivityIcons);
    }

    public int hashCode() {
        return this.recentActivityIcons.hashCode() + (this.selectedActivityLabel.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("PreSessionWidgetActivitySelectionState(selectedActivityLabel=", this.selectedActivityLabel, ", recentActivityIcons=", ")", this.recentActivityIcons);
    }

    public /* synthetic */ C31401m(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
