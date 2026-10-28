package vl2;

import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vl2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lvl2/m;", "", "Lcom/whoop/design/models/items/MenuItemModel;", "trendMenuItem", "Lcom/whoop/design/util/TextResource;", "trendMenuDetailText", "Lvl2/i;", "menuSheetDomainState", "<init>", "(Lcom/whoop/design/models/items/MenuItemModel;Lcom/whoop/design/util/TextResource;Lvl2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/items/MenuItemModel;", "c", "()Lcom/whoop/design/models/items/MenuItemModel;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Lvl2/i;", "()Lvl2/i;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36120m {

    /* JADX INFO: renamed from: d */
    public static final int f154397d = TextResource.$stable | MenuItemModel.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MenuItemModel trendMenuItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource trendMenuDetailText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC36116i menuSheetDomainState;

    public C36120m(MenuItemModel trendMenuItem, TextResource textResource, InterfaceC36116i interfaceC36116i) {
        AbstractC22676k.m65750j(trendMenuItem, "trendMenuItem");
        this.trendMenuItem = trendMenuItem;
        this.trendMenuDetailText = textResource;
        this.menuSheetDomainState = interfaceC36116i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC36116i getMenuSheetDomainState() {
        return this.menuSheetDomainState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTrendMenuDetailText() {
        return this.trendMenuDetailText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final MenuItemModel getTrendMenuItem() {
        return this.trendMenuItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36120m)) {
            return false;
        }
        C36120m c36120m = (C36120m) other;
        return AbstractC22676k.m65745e(this.trendMenuItem, c36120m.trendMenuItem) && AbstractC22676k.m65745e(this.trendMenuDetailText, c36120m.trendMenuDetailText) && AbstractC22676k.m65745e(this.menuSheetDomainState, c36120m.menuSheetDomainState);
    }

    public int hashCode() {
        int iHashCode = this.trendMenuItem.hashCode() * 31;
        TextResource textResource = this.trendMenuDetailText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        InterfaceC36116i interfaceC36116i = this.menuSheetDomainState;
        return iHashCode2 + (interfaceC36116i != null ? interfaceC36116i.hashCode() : 0);
    }

    public String toString() {
        return "TrendMenuDomainModel(trendMenuItem=" + this.trendMenuItem + ", trendMenuDetailText=" + this.trendMenuDetailText + ", menuSheetDomainState=" + this.menuSheetDomainState + ")";
    }
}
