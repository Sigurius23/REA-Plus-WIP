package w51;

import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: w51.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lw51/b;", "", "Lcom/whoop/design/util/TextResource;", "collapsedTitle", "expandedTitle", "Lgz0/m0;", "collapsedIcon", "expandedIcon", "Lkotlin/Function0;", "Ll83/a0;", "onToggle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lc93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "d", "c", "Lgz0/m0;", "()Lgz0/m0;", "e", "Lc93/a;", "getOnToggle", "()Lc93/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36836b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource collapsedTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource expandedTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 collapsedIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 expandedIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC4339a onToggle;

    public C36836b(TextResource collapsedTitle, TextResource expandedTitle, EnumC16313m0 collapsedIcon, EnumC16313m0 expandedIcon, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(collapsedTitle, "collapsedTitle");
        AbstractC22676k.m65750j(expandedTitle, "expandedTitle");
        AbstractC22676k.m65750j(collapsedIcon, "collapsedIcon");
        AbstractC22676k.m65750j(expandedIcon, "expandedIcon");
        this.collapsedTitle = collapsedTitle;
        this.expandedTitle = expandedTitle;
        this.collapsedIcon = collapsedIcon;
        this.expandedIcon = expandedIcon;
        this.onToggle = interfaceC4339a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getCollapsedIcon() {
        return this.collapsedIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCollapsedTitle() {
        return this.collapsedTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getExpandedIcon() {
        return this.expandedIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getExpandedTitle() {
        return this.expandedTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36836b)) {
            return false;
        }
        C36836b c36836b = (C36836b) other;
        return AbstractC22676k.m65745e(this.collapsedTitle, c36836b.collapsedTitle) && AbstractC22676k.m65745e(this.expandedTitle, c36836b.expandedTitle) && this.collapsedIcon == c36836b.collapsedIcon && this.expandedIcon == c36836b.expandedIcon && AbstractC22676k.m65745e(this.onToggle, c36836b.onToggle);
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.expandedIcon, AbstractC17176i.m48500b(this.collapsedIcon, AbstractC31061c.m95625a(this.collapsedTitle.hashCode() * 31, this.expandedTitle, 31), 31), 31);
        InterfaceC4339a interfaceC4339a = this.onToggle;
        return iM48500b + (interfaceC4339a == null ? 0 : interfaceC4339a.hashCode());
    }

    public String toString() {
        TextResource textResource = this.collapsedTitle;
        TextResource textResource2 = this.expandedTitle;
        EnumC16313m0 enumC16313m0 = this.collapsedIcon;
        EnumC16313m0 enumC16313m1 = this.expandedIcon;
        InterfaceC4339a interfaceC4339a = this.onToggle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ExpandableStatisticListButtonViewState(collapsedTitle=", textResource, ", expandedTitle=", textResource2, ", collapsedIcon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", expandedIcon=");
        sbM106658q.append(enumC16313m1);
        sbM106658q.append(", onToggle=");
        sbM106658q.append(interfaceC4339a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
