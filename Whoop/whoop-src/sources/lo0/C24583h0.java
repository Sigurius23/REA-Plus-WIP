package lo0;

import n01.C26088e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lo0.h0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Llo0/h0;", "Llo0/f0;", "Llo0/u0;", "searchField", "Ln01/e;", "items", "<init>", "(Llo0/u0;Ln01/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llo0/u0;", "b", "()Llo0/u0;", "Ln01/e;", "()Ln01/e;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24583h0 implements InterfaceC24579f0 {

    /* JADX INFO: renamed from: c */
    public static final int f96057c = C26088e.f103319h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24609u0 searchField;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26088e items;

    public C24583h0(C24609u0 c24609u0, C26088e items) {
        AbstractC22676k.m65750j(items, "items");
        this.searchField = c24609u0;
        this.items = items;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26088e getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C24609u0 getSearchField() {
        return this.searchField;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24583h0)) {
            return false;
        }
        C24583h0 c24583h0 = (C24583h0) other;
        return AbstractC22676k.m65745e(this.searchField, c24583h0.searchField) && AbstractC22676k.m65745e(this.items, c24583h0.items);
    }

    public int hashCode() {
        C24609u0 c24609u0 = this.searchField;
        return this.items.hashCode() + ((c24609u0 == null ? 0 : c24609u0.hashCode()) * 31);
    }

    public String toString() {
        return "FormSheetSelectableOptionsContentViewState(searchField=" + this.searchField + ", items=" + this.items + ")";
    }
}
