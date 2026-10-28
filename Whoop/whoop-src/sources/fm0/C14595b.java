package fm0;

import com.whoop.appconfiguration.TabConfiguration;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: fm0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b$\u0010'¨\u0006)"}, m65681d2 = {"Lfm0/b;", "", "", "Lcom/whoop/appconfiguration/TabConfiguration;", "tabs", "", "selectedTabId", "", "isTabRoot", "showCommunityBadge", "overlayVisible", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZZ)V", "defaultTabId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "Lfm0/a;", "action", "i", "(Lfm0/a;)Lfm0/b;", "a", "(Ljava/util/List;Ljava/lang/String;ZZZ)Lfm0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Ljava/lang/String;", "d", "c", "Z", "g", "()Z", "e", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14595b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<TabConfiguration> tabs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedTabId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isTabRoot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showCommunityBadge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean overlayVisible;

    public C14595b(List<TabConfiguration> tabs, String str, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(tabs, "tabs");
        this.tabs = tabs;
        this.selectedTabId = str;
        this.isTabRoot = z4;
        this.showCommunityBadge = z13;
        this.overlayVisible = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14595b m41745b(C14595b c14595b, List list, String str, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c14595b.tabs;
        }
        if ((i13 & 2) != 0) {
            str = c14595b.selectedTabId;
        }
        if ((i13 & 4) != 0) {
            z4 = c14595b.isTabRoot;
        }
        if ((i13 & 8) != 0) {
            z13 = c14595b.showCommunityBadge;
        }
        if ((i13 & 16) != 0) {
            z14 = c14595b.overlayVisible;
        }
        boolean z15 = z14;
        boolean z16 = z4;
        return c14595b.m41747a(list, str, z16, z13, z15);
    }

    /* JADX INFO: renamed from: h */
    private final String m41746h(List<TabConfiguration> tabs, String defaultTabId) {
        String str = this.selectedTabId;
        if (str != null) {
            List<TabConfiguration> list = tabs;
            if ((list instanceof Collection) && list.isEmpty()) {
                return defaultTabId;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((TabConfiguration) it.next()).getId(), str)) {
                    return str;
                }
            }
        }
        return defaultTabId;
    }

    /* JADX INFO: renamed from: a */
    public final C14595b m41747a(List<TabConfiguration> tabs, String selectedTabId, boolean isTabRoot, boolean showCommunityBadge, boolean overlayVisible) {
        AbstractC22676k.m65750j(tabs, "tabs");
        return new C14595b(tabs, selectedTabId, isTabRoot, showCommunityBadge, overlayVisible);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getOverlayVisible() {
        return this.overlayVisible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSelectedTabId() {
        return this.selectedTabId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowCommunityBadge() {
        return this.showCommunityBadge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14595b)) {
            return false;
        }
        C14595b c14595b = (C14595b) other;
        return AbstractC22676k.m65745e(this.tabs, c14595b.tabs) && AbstractC22676k.m65745e(this.selectedTabId, c14595b.selectedTabId) && this.isTabRoot == c14595b.isTabRoot && this.showCommunityBadge == c14595b.showCommunityBadge && this.overlayVisible == c14595b.overlayVisible;
    }

    /* JADX INFO: renamed from: f */
    public final List<TabConfiguration> m41751f() {
        return this.tabs;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsTabRoot() {
        return this.isTabRoot;
    }

    public int hashCode() {
        int iHashCode = this.tabs.hashCode() * 31;
        String str = this.selectedTabId;
        return Boolean.hashCode(this.overlayVisible) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isTabRoot), 31, this.showCommunityBadge);
    }

    /* JADX INFO: renamed from: i */
    public final C14595b m41753i(InterfaceC14594a action) {
        AbstractC22676k.m65750j(action, "action");
        if (action instanceof InterfaceC14594a.c) {
            InterfaceC14594a.c cVar = (InterfaceC14594a.c) action;
            return m41745b(this, cVar.m41744b(), m41746h(cVar.m41744b(), cVar.getDefaultTabId()), false, false, false, 28, null);
        }
        if (action instanceof InterfaceC14594a.a) {
            return m41745b(this, null, null, false, ((InterfaceC14594a.a) action).getShow(), false, 23, null);
        }
        if (!(action instanceof InterfaceC14594a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC14594a.b bVar = (InterfaceC14594a.b) action;
        boolean isTabRoot = bVar.getInput().getIsTabRoot();
        boolean overlayVisible = bVar.getInput().getOverlayVisible();
        String selectedTabId = bVar.getInput().getSelectedTabId();
        if (selectedTabId == null) {
            selectedTabId = this.selectedTabId;
        }
        return m41745b(this, null, selectedTabId, isTabRoot, false, overlayVisible, 9, null);
    }

    public String toString() {
        List<TabConfiguration> list = this.tabs;
        String str = this.selectedTabId;
        boolean z4 = this.isTabRoot;
        boolean z13 = this.showCommunityBadge;
        boolean z14 = this.overlayVisible;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("BottomNavDomainState(tabs=", ", selectedTabId=", str, ", isTabRoot=", list);
        AbstractC38963t7.m124392v(sbM79507k, z4, ", showCommunityBadge=", z13, ", overlayVisible=");
        return AbstractC18489d0.m53372m(sbM79507k, z14, ")");
    }

    public /* synthetic */ C14595b(List list, String str, boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14);
    }
}
