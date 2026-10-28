package hm0;

import com.whoop.appconfiguration.TabConfiguration;
import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hm0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lhm0/d;", "", "", "Lcom/whoop/appconfiguration/TabConfiguration;", "tabs", "", "selectedTabId", "", "isVisible", "showCommunityBadge", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "Z", "d", "()Z", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17423d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<TabConfiguration> tabs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedTabId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showCommunityBadge;

    public C17423d(List<TabConfiguration> tabs, String str, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(tabs, "tabs");
        this.tabs = tabs;
        this.selectedTabId = str;
        this.isVisible = z4;
        this.showCommunityBadge = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSelectedTabId() {
        return this.selectedTabId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowCommunityBadge() {
        return this.showCommunityBadge;
    }

    /* JADX INFO: renamed from: c */
    public final List<TabConfiguration> m49450c() {
        return this.tabs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17423d)) {
            return false;
        }
        C17423d c17423d = (C17423d) other;
        return AbstractC22676k.m65745e(this.tabs, c17423d.tabs) && AbstractC22676k.m65745e(this.selectedTabId, c17423d.selectedTabId) && this.isVisible == c17423d.isVisible && this.showCommunityBadge == c17423d.showCommunityBadge;
    }

    public int hashCode() {
        int iHashCode = this.tabs.hashCode() * 31;
        String str = this.selectedTabId;
        return Boolean.hashCode(this.showCommunityBadge) + AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isVisible);
    }

    public String toString() {
        List<TabConfiguration> list = this.tabs;
        String str = this.selectedTabId;
        return AbstractC36095b.m114682j(AbstractC26725a.m79507k("BottomNavViewState(tabs=", ", selectedTabId=", str, ", isVisible=", list), this.isVisible, ", showCommunityBadge=", this.showCommunityBadge, ")");
    }

    public /* synthetic */ C17423d(List list, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13);
    }
}
