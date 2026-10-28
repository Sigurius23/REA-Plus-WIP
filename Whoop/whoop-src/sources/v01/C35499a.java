package v01;

import com.whoop.design.util.TextResource;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: v01.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0017\u0010!¨\u0006\""}, m65681d2 = {"Lv01/a;", "", "Lcom/whoop/design/util/TextResource;", "filtersTitle", "", "Lv01/d;", "filterOptions", "sortsTitle", "sortOptions", "Lm91/o;", "cta", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "e", "d", "Lm91/o;", "()Lm91/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35499a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource filtersTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C35502d> filterOptions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource sortsTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C35502d> sortOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C25306o cta;

    public C35499a(TextResource filtersTitle, List<C35502d> filterOptions, TextResource sortsTitle, List<C35502d> sortOptions, C25306o c25306o) {
        AbstractC22676k.m65750j(filtersTitle, "filtersTitle");
        AbstractC22676k.m65750j(filterOptions, "filterOptions");
        AbstractC22676k.m65750j(sortsTitle, "sortsTitle");
        AbstractC22676k.m65750j(sortOptions, "sortOptions");
        this.filtersTitle = filtersTitle;
        this.filterOptions = filterOptions;
        this.sortsTitle = sortsTitle;
        this.sortOptions = sortOptions;
        this.cta = c25306o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C25306o getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b */
    public final List<C35502d> m112562b() {
        return this.filterOptions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getFiltersTitle() {
        return this.filtersTitle;
    }

    /* JADX INFO: renamed from: d */
    public final List<C35502d> m112564d() {
        return this.sortOptions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSortsTitle() {
        return this.sortsTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35499a)) {
            return false;
        }
        C35499a c35499a = (C35499a) other;
        return AbstractC22676k.m65745e(this.filtersTitle, c35499a.filtersTitle) && AbstractC22676k.m65745e(this.filterOptions, c35499a.filterOptions) && AbstractC22676k.m65745e(this.sortsTitle, c35499a.sortsTitle) && AbstractC22676k.m65745e(this.sortOptions, c35499a.sortOptions) && AbstractC22676k.m65745e(this.cta, c35499a.cta);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC11895b.m31983b(this.filtersTitle.hashCode() * 31, 31, this.filterOptions), this.sortsTitle, 31), 31, this.sortOptions);
        C25306o c25306o = this.cta;
        return iM31983b + (c25306o == null ? 0 : c25306o.hashCode());
    }

    public String toString() {
        TextResource textResource = this.filtersTitle;
        List<C35502d> list = this.filterOptions;
        TextResource textResource2 = this.sortsTitle;
        List<C35502d> list2 = this.sortOptions;
        C25306o c25306o = this.cta;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "CommunityFilterBottomSheetViewState(filtersTitle=", ", filterOptions=", ", sortsTitle=", list);
        AbstractC21702c.m61143n(textResource2, ", sortOptions=", ", cta=", sbM106657p, list2);
        sbM106657p.append(c25306o);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }
}
