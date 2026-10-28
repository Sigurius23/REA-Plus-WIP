package km0;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: km0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lkm0/g;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "Lkm0/d;", "toggles", "Lm91/u;", "emptyState", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lm91/u;", "()Lm91/u;", "bottomsheet-item-selector_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22583g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C22580d> toggles;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u emptyState;

    public C22583g(TextResource title, List<C22580d> toggles, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(toggles, "toggles");
        this.title = title;
        this.toggles = toggles;
        this.emptyState = interfaceC25312u;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getEmptyState() {
        return this.emptyState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c */
    public final List<C22580d> m65438c() {
        return this.toggles;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22583g)) {
            return false;
        }
        C22583g c22583g = (C22583g) other;
        return AbstractC22676k.m65745e(this.title, c22583g.title) && AbstractC22676k.m65745e(this.toggles, c22583g.toggles) && AbstractC22676k.m65745e(this.emptyState, c22583g.emptyState);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.toggles);
        InterfaceC25312u interfaceC25312u = this.emptyState;
        return iM31983b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode());
    }

    public String toString() {
        TextResource textResource = this.title;
        List<C22580d> list = this.toggles;
        InterfaceC25312u interfaceC25312u = this.emptyState;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "GroupedToggleViewState(title=", ", toggles=", ", emptyState=", list);
        sbM106657p.append(interfaceC25312u);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }

    public /* synthetic */ C22583g(TextResource textResource, List list, InterfaceC25312u interfaceC25312u, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, list, (i13 & 4) != 0 ? null : interfaceC25312u);
    }
}
