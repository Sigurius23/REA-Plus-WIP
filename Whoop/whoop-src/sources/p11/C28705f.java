package p11;

import d13.AbstractC11478a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: p11.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lp11/f;", "Lm91/u;", "", "iconCollapsed", "iconExpanded", "headerState", "", "expandedItemStates", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lm91/u;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "Lm91/u;", "()Lm91/u;", "d", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28705f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String iconCollapsed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String iconExpanded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u headerState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> expandedItemStates;

    /* JADX WARN: Multi-variable type inference failed */
    public C28705f(String str, String str2, InterfaceC25312u headerState, List<? extends InterfaceC25312u> expandedItemStates) {
        AbstractC22676k.m65750j(headerState, "headerState");
        AbstractC22676k.m65750j(expandedItemStates, "expandedItemStates");
        this.iconCollapsed = str;
        this.iconExpanded = str2;
        this.headerState = headerState;
        this.expandedItemStates = expandedItemStates;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m87330a() {
        return this.expandedItemStates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC25312u getHeaderState() {
        return this.headerState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIconCollapsed() {
        return this.iconCollapsed;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIconExpanded() {
        return this.iconExpanded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28705f)) {
            return false;
        }
        C28705f c28705f = (C28705f) other;
        return AbstractC22676k.m65745e(this.iconCollapsed, c28705f.iconCollapsed) && AbstractC22676k.m65745e(this.iconExpanded, c28705f.iconExpanded) && AbstractC22676k.m65745e(this.headerState, c28705f.headerState) && AbstractC22676k.m65745e(this.expandedItemStates, c28705f.expandedItemStates);
    }

    public int hashCode() {
        String str = this.iconCollapsed;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconExpanded;
        return this.expandedItemStates.hashCode() + AbstractC11478a.m30851c(this.headerState, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.iconCollapsed;
        String str2 = this.iconExpanded;
        InterfaceC25312u interfaceC25312u = this.headerState;
        List<InterfaceC25312u> list = this.expandedItemStates;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableCardViewState(iconCollapsed=", str, ", iconExpanded=", str2, ", headerState=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", expandedItemStates=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
