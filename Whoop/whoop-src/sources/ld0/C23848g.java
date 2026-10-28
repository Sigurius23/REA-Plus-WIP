package ld0;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ld0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, m65681d2 = {"Lld0/g;", "", "Lld0/f;", "entryPoint", "", "title", "Lld0/j;", "sortData", "Lld0/l;", "statusFilters", "<init>", "(Lld0/f;Ljava/lang/String;Lld0/j;Lld0/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld0/f;", "()Lld0/f;", "b", "Ljava/lang/String;", "d", "c", "Lld0/j;", "()Lld0/j;", "Lld0/l;", "()Lld0/l;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23848g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23847f entryPoint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23851j sortData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C23853l statusFilters;

    public C23848g(C23847f entryPoint, String title, C23851j c23851j, C23853l c23853l) {
        AbstractC22676k.m65750j(entryPoint, "entryPoint");
        AbstractC22676k.m65750j(title, "title");
        this.entryPoint = entryPoint;
        this.title = title;
        this.sortData = c23851j;
        this.statusFilters = c23853l;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23847f getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23851j getSortData() {
        return this.sortData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C23853l getStatusFilters() {
        return this.statusFilters;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23848g)) {
            return false;
        }
        C23848g c23848g = (C23848g) other;
        return AbstractC22676k.m65745e(this.entryPoint, c23848g.entryPoint) && AbstractC22676k.m65745e(this.title, c23848g.title) && AbstractC22676k.m65745e(this.sortData, c23848g.sortData) && AbstractC22676k.m65745e(this.statusFilters, c23848g.statusFilters);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.entryPoint.hashCode() * 31, 31, this.title);
        C23851j c23851j = this.sortData;
        int iHashCode = (iM30450d + (c23851j == null ? 0 : c23851j.hashCode())) * 31;
        C23853l c23853l = this.statusFilters;
        return iHashCode + (c23853l != null ? c23853l.hashCode() : 0);
    }

    public String toString() {
        return "BiomarkersListBottomSheetViewState(entryPoint=" + this.entryPoint + ", title=" + this.title + ", sortData=" + this.sortData + ", statusFilters=" + this.statusFilters + ")";
    }
}
