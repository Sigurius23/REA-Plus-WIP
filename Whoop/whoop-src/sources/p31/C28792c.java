package p31;

import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: p31.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lp31/c;", "", "", "showButton", "showAddToJournal", "expanded", "", "Lp31/b;", "items", "<init>", "(ZZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28792c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showAddToJournal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean expanded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C28791b> items;

    public C28792c(boolean z4, boolean z13, boolean z14, List<C28791b> list) {
        this.showButton = z4;
        this.showAddToJournal = z13;
        this.expanded = z14;
        this.items = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    /* JADX INFO: renamed from: b */
    public final List<C28791b> m87539b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowAddToJournal() {
        return this.showAddToJournal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowButton() {
        return this.showButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28792c)) {
            return false;
        }
        C28792c c28792c = (C28792c) other;
        return this.showButton == c28792c.showButton && this.showAddToJournal == c28792c.showAddToJournal && this.expanded == c28792c.expanded && AbstractC22676k.m65745e(this.items, c28792c.items);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.showButton) * 31, 31, this.showAddToJournal), 31, this.expanded);
        List<C28791b> list = this.items;
        return iM8289b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        boolean z4 = this.showButton;
        boolean z13 = this.showAddToJournal;
        boolean z14 = this.expanded;
        List<C28791b> list = this.items;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("FabTooltipButtonState(showButton=", ", showAddToJournal=", ", expanded=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", items=");
        sbM32002u.append(list);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C28792c(boolean z4, boolean z13, boolean z14, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? null : list);
    }
}
