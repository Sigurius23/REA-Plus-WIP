package g91;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g91.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lg91/c;", "", "", "searchQuery", "itemType", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Ljava/lang/String;Ljava/lang/Object;)Lg91/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15604c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String searchQuery;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object itemType;

    public C15604c(String searchQuery, Object itemType) {
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(itemType, "itemType");
        this.searchQuery = searchQuery;
        this.itemType = itemType;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15604c m43918b(C15604c c15604c, String str, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            str = c15604c.searchQuery;
        }
        if ((i13 & 2) != 0) {
            obj = c15604c.itemType;
        }
        return c15604c.m43919a(str, obj);
    }

    /* JADX INFO: renamed from: a */
    public final C15604c m43919a(String searchQuery, Object itemType) {
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(itemType, "itemType");
        return new C15604c(searchQuery, itemType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15604c)) {
            return false;
        }
        C15604c c15604c = (C15604c) other;
        return AbstractC22676k.m65745e(this.searchQuery, c15604c.searchQuery) && AbstractC22676k.m65745e(this.itemType, c15604c.itemType);
    }

    public int hashCode() {
        return this.itemType.hashCode() + (this.searchQuery.hashCode() * 31);
    }

    public String toString() {
        return "DesignShowcaseDomainState(searchQuery=" + this.searchQuery + ", itemType=" + this.itemType + ")";
    }
}
