package b01;

import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b01.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lb01/q;", "", "", "searchQuery", "placeHolderText", "", "Lb01/c;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2196q {

    /* JADX INFO: renamed from: d */
    public static final int f8720d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String searchQuery;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String placeHolderText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C2182c> items;

    public C2196q(String searchQuery, String placeHolderText, List<C2182c> items) {
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(placeHolderText, "placeHolderText");
        AbstractC22676k.m65750j(items, "items");
        this.searchQuery = searchQuery;
        this.placeHolderText = placeHolderText;
        this.items = items;
    }

    /* JADX INFO: renamed from: a */
    public final List<C2182c> m6944a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlaceHolderText() {
        return this.placeHolderText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2196q)) {
            return false;
        }
        C2196q c2196q = (C2196q) other;
        return AbstractC22676k.m65745e(this.searchQuery, c2196q.searchQuery) && AbstractC22676k.m65745e(this.placeHolderText, c2196q.placeHolderText) && AbstractC22676k.m65745e(this.items, c2196q.items);
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC11266d.m30450d(this.searchQuery.hashCode() * 31, 31, this.placeHolderText);
    }

    public String toString() {
        String str = this.searchQuery;
        String str2 = this.placeHolderText;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("SearchableListViewState(searchQuery=", str, ", placeHolderText=", str2, ", items="), this.items, ")");
    }
}
