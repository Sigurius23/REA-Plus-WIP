package ld0;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ld0.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lld0/q;", "Lm91/u;", "", "items", "Lcom/whoop/design/util/TextResource;", "collapseButtonTitle", "expandButtonTitle", "", "itemsShownCollapsed", "", "isExpanded", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "I", "e", "Z", "f", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23858q implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource collapseButtonTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource expandButtonTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int itemsShownCollapsed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX WARN: Multi-variable type inference failed */
    public C23858q(List<? extends InterfaceC25312u> items, TextResource collapseButtonTitle, TextResource expandButtonTitle, int i13, boolean z4) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(collapseButtonTitle, "collapseButtonTitle");
        AbstractC22676k.m65750j(expandButtonTitle, "expandButtonTitle");
        this.items = items;
        this.collapseButtonTitle = collapseButtonTitle;
        this.expandButtonTitle = expandButtonTitle;
        this.itemsShownCollapsed = i13;
        this.isExpanded = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCollapseButtonTitle() {
        return this.collapseButtonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getExpandButtonTitle() {
        return this.expandButtonTitle;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m70101c() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getItemsShownCollapsed() {
        return this.itemsShownCollapsed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23858q)) {
            return false;
        }
        C23858q c23858q = (C23858q) other;
        return AbstractC22676k.m65745e(this.items, c23858q.items) && AbstractC22676k.m65745e(this.collapseButtonTitle, c23858q.collapseButtonTitle) && AbstractC22676k.m65745e(this.expandButtonTitle, c23858q.expandButtonTitle) && this.itemsShownCollapsed == c23858q.itemsShownCollapsed && this.isExpanded == c23858q.isExpanded;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpanded) + AbstractC11266d.m30448b(this.itemsShownCollapsed, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.items.hashCode() * 31, this.collapseButtonTitle, 31), this.expandButtonTitle, 31), 31);
    }

    public String toString() {
        List<InterfaceC25312u> list = this.items;
        TextResource textResource = this.collapseButtonTitle;
        TextResource textResource2 = this.expandButtonTitle;
        int i13 = this.itemsShownCollapsed;
        boolean z4 = this.isExpanded;
        StringBuilder sb4 = new StringBuilder("PanelUpsellDrawerViewState(items=");
        sb4.append(list);
        sb4.append(", collapseButtonTitle=");
        sb4.append(textResource);
        sb4.append(", expandButtonTitle=");
        sb4.append(textResource2);
        sb4.append(", itemsShownCollapsed=");
        sb4.append(i13);
        sb4.append(", isExpanded=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C23858q(List list, TextResource textResource, TextResource textResource2, int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, textResource, textResource2, i13, (i14 & 16) != 0 ? false : z4);
    }
}
