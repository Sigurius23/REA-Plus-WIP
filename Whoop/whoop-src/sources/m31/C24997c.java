package m31;

import ih0.AbstractC18489d0;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: m31.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lm31/c;", "Lm91/u;", "emptyResultsItem", "", "Lm31/j;", "sections", "", "isSearchActive", "<init>", "(Lm91/u;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "()Lm91/u;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24997c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u emptyResultsItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C25004j> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSearchActive;

    public C24997c(InterfaceC25312u interfaceC25312u, List<C25004j> sections, boolean z4) {
        AbstractC22676k.m65750j(sections, "sections");
        this.emptyResultsItem = interfaceC25312u;
        this.sections = sections;
        this.isSearchActive = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getEmptyResultsItem() {
        return this.emptyResultsItem;
    }

    /* JADX INFO: renamed from: b */
    public final List<C25004j> m73326b() {
        return this.sections;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24997c)) {
            return false;
        }
        C24997c c24997c = (C24997c) other;
        return AbstractC22676k.m65745e(this.emptyResultsItem, c24997c.emptyResultsItem) && AbstractC22676k.m65745e(this.sections, c24997c.sections) && this.isSearchActive == c24997c.isSearchActive;
    }

    public int hashCode() {
        InterfaceC25312u interfaceC25312u = this.emptyResultsItem;
        return Boolean.hashCode(this.isSearchActive) + AbstractC11895b.m31983b((interfaceC25312u == null ? 0 : interfaceC25312u.hashCode()) * 31, 31, this.sections);
    }

    public String toString() {
        InterfaceC25312u interfaceC25312u = this.emptyResultsItem;
        List<C25004j> list = this.sections;
        boolean z4 = this.isSearchActive;
        StringBuilder sb4 = new StringBuilder("SearchableListState(emptyResultsItem=");
        sb4.append(interfaceC25312u);
        sb4.append(", sections=");
        sb4.append(list);
        sb4.append(", isSearchActive=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
