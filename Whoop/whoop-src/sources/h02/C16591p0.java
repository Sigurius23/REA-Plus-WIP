package h02;

import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: h02.p0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lh02/p0;", "Lm91/u;", "", "title", "", "Lh02/k;", "items", "", "isCollapsed", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "a", "(Ljava/lang/String;Ljava/util/List;Z)Lh02/p0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "f", "()Z", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16591p0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C16580k> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isCollapsed;

    public C16591p0(String title, List<C16580k> items, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.items = items;
        this.isCollapsed = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16591p0 m47084b(C16591p0 c16591p0, String str, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c16591p0.title;
        }
        if ((i13 & 2) != 0) {
            list = c16591p0.items;
        }
        if ((i13 & 4) != 0) {
            z4 = c16591p0.isCollapsed;
        }
        return c16591p0.m47085a(str, list, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C16591p0 m47085a(String title, List<C16580k> items, boolean isCollapsed) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        return new C16591p0(title, items, isCollapsed);
    }

    /* JADX INFO: renamed from: c */
    public final List<C16580k> m47086c() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16591p0)) {
            return false;
        }
        C16591p0 c16591p0 = (C16591p0) other;
        return AbstractC22676k.m65745e(this.title, c16591p0.title) && AbstractC22676k.m65745e(this.items, c16591p0.items) && this.isCollapsed == c16591p0.isCollapsed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCollapsed) + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.items);
    }

    public String toString() {
        String str = this.title;
        List<C16580k> list = this.items;
        return AbstractC18489d0.m53372m(AbstractC30802r.m94766o("WhoopYourWayPriceBreakdownAccordionState(title=", str, ", items=", ", isCollapsed=", list), this.isCollapsed, ")");
    }
}
