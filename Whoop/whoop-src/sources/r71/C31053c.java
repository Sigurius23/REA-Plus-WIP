package r71;

import com.whoop.design.atomic.organism.horizontalscrollcontainer.HorizontalScrollBehavior;
import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: r71.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b!\u0010,¨\u0006-"}, m65681d2 = {"Lr71/c;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "", "items", "accessibilityLabel", "Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;", "scrollBehavior", "", "pagingIndicatorEnabled", "Ll0/k1;", "paddingValues", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLl0/k1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;", "f", "()Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;", "Z", "()Z", "Ll0/k1;", "()Ll0/k1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31053c implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f128042h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String accessibilityLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final HorizontalScrollBehavior scrollBehavior;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean pagingIndicatorEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC22973k1 paddingValues;

    /* JADX WARN: Multi-variable type inference failed */
    public C31053c(String id4, TextResource textResource, List<? extends InterfaceC25312u> items, String accessibilityLabel, HorizontalScrollBehavior scrollBehavior, boolean z4, InterfaceC22973k1 paddingValues) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        AbstractC22676k.m65750j(scrollBehavior, "scrollBehavior");
        AbstractC22676k.m65750j(paddingValues, "paddingValues");
        this.id = id4;
        this.title = textResource;
        this.items = items;
        this.accessibilityLabel = accessibilityLabel;
        this.scrollBehavior = scrollBehavior;
        this.pagingIndicatorEnabled = z4;
        this.paddingValues = paddingValues;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m95604b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC22973k1 getPaddingValues() {
        return this.paddingValues;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPagingIndicatorEnabled() {
        return this.pagingIndicatorEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31053c)) {
            return false;
        }
        C31053c c31053c = (C31053c) other;
        return AbstractC22676k.m65745e(this.id, c31053c.id) && AbstractC22676k.m65745e(this.title, c31053c.title) && AbstractC22676k.m65745e(this.items, c31053c.items) && AbstractC22676k.m65745e(this.accessibilityLabel, c31053c.accessibilityLabel) && this.scrollBehavior == c31053c.scrollBehavior && this.pagingIndicatorEnabled == c31053c.pagingIndicatorEnabled && AbstractC22676k.m65745e(this.paddingValues, c31053c.paddingValues);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final HorizontalScrollBehavior getScrollBehavior() {
        return this.scrollBehavior;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        TextResource textResource = this.title;
        return this.paddingValues.hashCode() + AbstractC2875y.m8289b((this.scrollBehavior.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.items), 31, this.accessibilityLabel)) * 31, 31, this.pagingIndicatorEnabled);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        List<InterfaceC25312u> list = this.items;
        String str2 = this.accessibilityLabel;
        HorizontalScrollBehavior horizontalScrollBehavior = this.scrollBehavior;
        boolean z4 = this.pagingIndicatorEnabled;
        InterfaceC22973k1 interfaceC22973k1 = this.paddingValues;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("HorizontalScrollContainerViewState(id=", str, ", title=", textResource, ", items=");
        AbstractC17176i.m48511m(", accessibilityLabel=", str2, ", scrollBehavior=", sbM91847q, list);
        sbM91847q.append(horizontalScrollBehavior);
        sbM91847q.append(", pagingIndicatorEnabled=");
        sbM91847q.append(z4);
        sbM91847q.append(", paddingValues=");
        sbM91847q.append(interfaceC22973k1);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public C31053c(String str, TextResource textResource, List list, String str2, HorizontalScrollBehavior horizontalScrollBehavior, boolean z4, InterfaceC22973k1 interfaceC22973k1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC22973k1 c22976l1;
        HorizontalScrollBehavior horizontalScrollBehavior2 = (i13 & 16) != 0 ? HorizontalScrollBehavior.FREE : horizontalScrollBehavior;
        boolean z13 = (i13 & 32) != 0 ? false : z4;
        if ((i13 & 64) != 0) {
            float f13 = 8;
            float f14 = 2 * f13;
            c22976l1 = new C22976l1(f14, 0 * f13, f14, 1 * f13);
        } else {
            c22976l1 = interfaceC22973k1;
        }
        this(str, textResource, list, str2, horizontalScrollBehavior2, z13, c22976l1);
    }
}
