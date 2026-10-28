package m31;

import ih0.AbstractC18489d0;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: m31.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lm31/j;", "Lm91/u;", "", "headerItems", "Lm31/f;", "rows", "", "isSearching", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25004j implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> headerItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C25000f> rows;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSearching;

    /* JADX WARN: Multi-variable type inference failed */
    public C25004j(List<? extends InterfaceC25312u> headerItems, List<C25000f> rows, boolean z4) {
        AbstractC22676k.m65750j(headerItems, "headerItems");
        AbstractC22676k.m65750j(rows, "rows");
        this.headerItems = headerItems;
        this.rows = rows;
        this.isSearching = z4;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m73343a() {
        return this.headerItems;
    }

    /* JADX INFO: renamed from: b */
    public final List<C25000f> m73344b() {
        return this.rows;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSearching() {
        return this.isSearching;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25004j)) {
            return false;
        }
        C25004j c25004j = (C25004j) other;
        return AbstractC22676k.m65745e(this.headerItems, c25004j.headerItems) && AbstractC22676k.m65745e(this.rows, c25004j.rows) && this.isSearching == c25004j.isSearching;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSearching) + AbstractC11895b.m31983b(this.headerItems.hashCode() * 31, 31, this.rows);
    }

    public String toString() {
        List<InterfaceC25312u> list = this.headerItems;
        List<C25000f> list2 = this.rows;
        return AbstractC18489d0.m53372m(AbstractC38963t7.m124380j("SearchableSectionState(headerItems=", ", rows=", list, ", isSearching=", list2), this.isSearching, ")");
    }

    public /* synthetic */ C25004j(List list, List list2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i13 & 4) != 0 ? false : z4);
    }
}
