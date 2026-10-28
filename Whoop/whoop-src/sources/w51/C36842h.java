package w51;

import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: w51.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b%\u0010)¨\u0006*"}, m65681d2 = {"Lw51/h;", "Lm91/u;", "", "id", "", "isExpanded", "", "collapsedCount", "Lw51/d;", "header", "", "Lw51/f;", "items", "Lw51/b;", "toggleButton", "<init>", "(Ljava/lang/String;ZILw51/d;Ljava/util/List;Lw51/b;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Z", "f", "()Z", "c", "I", "d", "Lw51/d;", "()Lw51/d;", "e", "Ljava/util/List;", "()Ljava/util/List;", "Lw51/b;", "()Lw51/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36842h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int collapsedCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36838d header;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C36840f> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C36836b toggleButton;

    public C36842h(String id4, boolean z4, int i13, C36838d header, List<C36840f> items, C36836b c36836b) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.isExpanded = z4;
        this.collapsedCount = i13;
        this.header = header;
        this.items = items;
        this.toggleButton = c36836b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCollapsedCount() {
        return this.collapsedCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C36838d getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c */
    public final List<C36840f> m118132c() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C36836b getToggleButton() {
        return this.toggleButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36842h)) {
            return false;
        }
        C36842h c36842h = (C36842h) other;
        return AbstractC22676k.m65745e(this.id, c36842h.id) && this.isExpanded == c36842h.isExpanded && this.collapsedCount == c36842h.collapsedCount && AbstractC22676k.m65745e(this.header, c36842h.header) && AbstractC22676k.m65745e(this.items, c36842h.items) && AbstractC22676k.m65745e(this.toggleButton, c36842h.toggleButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.header.hashCode() + AbstractC11266d.m30448b(this.collapsedCount, AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.isExpanded), 31)) * 31, 31, this.items);
        C36836b c36836b = this.toggleButton;
        return iM31983b + (c36836b == null ? 0 : c36836b.hashCode());
    }

    public String toString() {
        String str = this.id;
        boolean z4 = this.isExpanded;
        int i13 = this.collapsedCount;
        C36838d c36838d = this.header;
        List<C36840f> list = this.items;
        C36836b c36836b = this.toggleButton;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ExpandableStatisticListViewState(id=", str, ", isExpanded=", ", collapsedCount=", z4);
        sbM73379l.append(i13);
        sbM73379l.append(", header=");
        sbM73379l.append(c36838d);
        sbM73379l.append(", items=");
        sbM73379l.append(list);
        sbM73379l.append(", toggleButton=");
        sbM73379l.append(c36836b);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
