package am2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y71.C39282o;

/* JADX INFO: renamed from: am2.y */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lam2/y;", "", "", "menuIndex", "Ly71/o;", "menuItem", "Lcom/whoop/design/util/TextResource;", "menuItemDetailText", "Lm91/u;", "menuSheet", "<init>", "(ILy71/o;Lcom/whoop/design/util/TextResource;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ly71/o;", "()Ly71/o;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "Lm91/u;", "()Lm91/u;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1048y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int menuIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39282o menuItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource menuItemDetailText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u menuSheet;

    public C1048y(int i13, C39282o menuItem, TextResource textResource, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(menuItem, "menuItem");
        this.menuIndex = i13;
        this.menuItem = menuItem;
        this.menuItemDetailText = textResource;
        this.menuSheet = interfaceC25312u;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMenuIndex() {
        return this.menuIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39282o getMenuItem() {
        return this.menuItem;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getMenuItemDetailText() {
        return this.menuItemDetailText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC25312u getMenuSheet() {
        return this.menuSheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1048y)) {
            return false;
        }
        C1048y c1048y = (C1048y) other;
        return this.menuIndex == c1048y.menuIndex && AbstractC22676k.m65745e(this.menuItem, c1048y.menuItem) && AbstractC22676k.m65745e(this.menuItemDetailText, c1048y.menuItemDetailText) && AbstractC22676k.m65745e(this.menuSheet, c1048y.menuSheet);
    }

    public int hashCode() {
        int iHashCode = (this.menuItem.hashCode() + (Integer.hashCode(this.menuIndex) * 31)) * 31;
        TextResource textResource = this.menuItemDetailText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.menuSheet;
        return iHashCode2 + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    public String toString() {
        return "TrendMenuState(menuIndex=" + this.menuIndex + ", menuItem=" + this.menuItem + ", menuItemDetailText=" + this.menuItemDetailText + ", menuSheet=" + this.menuSheet + ")";
    }
}
