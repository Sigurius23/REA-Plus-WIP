package id1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: id1.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lid1/e;", "", "Lcom/whoop/design/util/TextResource;", "searchQuery", "", "Lm91/u;", "items", "Lid1/a;", "layout", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lid1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lid1/a;", "()Lid1/a;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18414e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource searchQuery;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18410a layout;

    /* JADX WARN: Multi-variable type inference failed */
    public C18414e(TextResource searchQuery, List<? extends InterfaceC25312u> items, AbstractC18410a layout) {
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(layout, "layout");
        this.searchQuery = searchQuery;
        this.items = items;
        this.layout = layout;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m52995a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC18410a getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSearchQuery() {
        return this.searchQuery;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18414e)) {
            return false;
        }
        C18414e c18414e = (C18414e) other;
        return AbstractC22676k.m65745e(this.searchQuery, c18414e.searchQuery) && AbstractC22676k.m65745e(this.items, c18414e.items) && AbstractC22676k.m65745e(this.layout, c18414e.layout);
    }

    public int hashCode() {
        return this.layout.hashCode() + AbstractC11895b.m31983b(this.searchQuery.hashCode() * 31, 31, this.items);
    }

    public String toString() {
        TextResource textResource = this.searchQuery;
        List<InterfaceC25312u> list = this.items;
        AbstractC18410a abstractC18410a = this.layout;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "DesignShowcaseViewState(searchQuery=", ", items=", ", layout=", list);
        sbM106657p.append(abstractC18410a);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }

    public /* synthetic */ C18414e(TextResource textResource, List list, AbstractC18410a abstractC18410a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? AbstractC18410a.b.f71609a : abstractC18410a);
    }
}
