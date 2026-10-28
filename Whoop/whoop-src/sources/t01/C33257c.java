package t01;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: t01.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u0019\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b \u0010*R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b(\u0010\u001f¨\u0006+"}, m65681d2 = {"Lt01/c;", "Lm91/u;", "", "title", "", "isExpanded", "leadingItem", "bodyItem", "", "collapsibleContentItems", "Lt01/k;", "endItemChip", "expandViaEndItem", "hasCollapsibleContent", "<init>", "(Ljava/lang/String;ZLm91/u;Lm91/u;Ljava/util/List;Lt01/k;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "Z", "i", "()Z", "c", "Lm91/u;", "g", "()Lm91/u;", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lt01/k;", "()Lt01/k;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33257c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u leadingItem;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u bodyItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<InterfaceC25312u> collapsibleContentItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C33265k endItemChip;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean expandViaEndItem;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean hasCollapsibleContent;

    /* JADX WARN: Multi-variable type inference failed */
    public C33257c(String title, boolean z4, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, List<? extends InterfaceC25312u> collapsibleContentItems, C33265k endItemChip, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(collapsibleContentItems, "collapsibleContentItems");
        AbstractC22676k.m65750j(endItemChip, "endItemChip");
        this.title = title;
        this.isExpanded = z4;
        this.leadingItem = interfaceC25312u;
        this.bodyItem = interfaceC25312u2;
        this.collapsibleContentItems = collapsibleContentItems;
        this.endItemChip = endItemChip;
        this.expandViaEndItem = z13;
        this.hasCollapsibleContent = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getBodyItem() {
        return this.bodyItem;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m105500b() {
        return this.collapsibleContentItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33265k getEndItemChip() {
        return this.endItemChip;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getExpandViaEndItem() {
        return this.expandViaEndItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33257c)) {
            return false;
        }
        C33257c c33257c = (C33257c) other;
        return AbstractC22676k.m65745e(this.title, c33257c.title) && this.isExpanded == c33257c.isExpanded && AbstractC22676k.m65745e(this.leadingItem, c33257c.leadingItem) && AbstractC22676k.m65745e(this.bodyItem, c33257c.bodyItem) && AbstractC22676k.m65745e(this.collapsibleContentItems, c33257c.collapsibleContentItems) && AbstractC22676k.m65745e(this.endItemChip, c33257c.endItemChip) && this.expandViaEndItem == c33257c.expandViaEndItem && this.hasCollapsibleContent == c33257c.hasCollapsibleContent;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHasCollapsibleContent() {
        return this.hasCollapsibleContent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC25312u getLeadingItem() {
        return this.leadingItem;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.title.hashCode() * 31, 31, this.isExpanded);
        InterfaceC25312u interfaceC25312u = this.leadingItem;
        int iHashCode = (iM8289b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u2 = this.bodyItem;
        return Boolean.hashCode(this.hasCollapsibleContent) + AbstractC2875y.m8289b((this.endItemChip.hashCode() + AbstractC11895b.m31983b((iHashCode + (interfaceC25312u2 != null ? interfaceC25312u2.hashCode() : 0)) * 31, 31, this.collapsibleContentItems)) * 31, 31, this.expandViaEndItem);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        String str = this.title;
        boolean z4 = this.isExpanded;
        InterfaceC25312u interfaceC25312u = this.leadingItem;
        InterfaceC25312u interfaceC25312u2 = this.bodyItem;
        List<InterfaceC25312u> list = this.collapsibleContentItems;
        C33265k c33265k = this.endItemChip;
        boolean z13 = this.expandViaEndItem;
        boolean z14 = this.hasCollapsibleContent;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("CollapsibleRowItemViewState(title=", str, ", isExpanded=", ", leadingItem=", z4);
        sbM73379l.append(interfaceC25312u);
        sbM73379l.append(", bodyItem=");
        sbM73379l.append(interfaceC25312u2);
        sbM73379l.append(", collapsibleContentItems=");
        sbM73379l.append(list);
        sbM73379l.append(", endItemChip=");
        sbM73379l.append(c33265k);
        sbM73379l.append(", expandViaEndItem=");
        return AbstractC36095b.m114682j(sbM73379l, z13, ", hasCollapsibleContent=", z14, ")");
    }
}
