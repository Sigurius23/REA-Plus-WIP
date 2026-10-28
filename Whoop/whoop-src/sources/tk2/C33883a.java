package tk2;

import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: tk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001d"}, m65681d2 = {"Ltk2/a;", "", "", "Lm91/u;", "items", "", "pinTrailingToBottom", "", "pinnedTrailingItemCount", "centerLeadingContent", "<init>", "(Ljava/util/List;ZIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "c", "()Z", "I", "d", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33883a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean pinTrailingToBottom;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pinnedTrailingItemCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean centerLeadingContent;

    /* JADX WARN: Multi-variable type inference failed */
    public C33883a(List<? extends InterfaceC25312u> items, boolean z4, int i13, boolean z13) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.pinTrailingToBottom = z4;
        this.pinnedTrailingItemCount = i13;
        this.centerLeadingContent = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCenterLeadingContent() {
        return this.centerLeadingContent;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m107158b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPinTrailingToBottom() {
        return this.pinTrailingToBottom;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPinnedTrailingItemCount() {
        return this.pinnedTrailingItemCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33883a)) {
            return false;
        }
        C33883a c33883a = (C33883a) other;
        return AbstractC22676k.m65745e(this.items, c33883a.items) && this.pinTrailingToBottom == c33883a.pinTrailingToBottom && this.pinnedTrailingItemCount == c33883a.pinnedTrailingItemCount && this.centerLeadingContent == c33883a.centerLeadingContent;
    }

    public int hashCode() {
        return Boolean.hashCode(this.centerLeadingContent) + AbstractC11266d.m30448b(this.pinnedTrailingItemCount, AbstractC2875y.m8289b(this.items.hashCode() * 31, 31, this.pinTrailingToBottom), 31);
    }

    public String toString() {
        return "TabState(items=" + this.items + ", pinTrailingToBottom=" + this.pinTrailingToBottom + ", pinnedTrailingItemCount=" + this.pinnedTrailingItemCount + ", centerLeadingContent=" + this.centerLeadingContent + ")";
    }

    public /* synthetic */ C33883a(List list, boolean z4, int i13, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C25271y.f99162w : list, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? 1 : i13, (i14 & 8) != 0 ? false : z13);
    }
}
