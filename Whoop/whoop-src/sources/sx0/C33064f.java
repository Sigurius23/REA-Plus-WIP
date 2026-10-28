package sx0;

import ih0.AbstractC18489d0;
import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sx0.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lsx0/f;", "", "", "searchQuery", "", "Lsx0/d;", "serviceList", "", "hasOverrides", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "()Z", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33064f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String searchQuery;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C33062d> serviceList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hasOverrides;

    public C33064f(String searchQuery, List<C33062d> serviceList, boolean z4) {
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(serviceList, "serviceList");
        this.searchQuery = searchQuery;
        this.serviceList = serviceList;
        this.hasOverrides = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasOverrides() {
        return this.hasOverrides;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: c */
    public final List<C33062d> m104713c() {
        return this.serviceList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33064f)) {
            return false;
        }
        C33064f c33064f = (C33064f) other;
        return AbstractC22676k.m65745e(this.searchQuery, c33064f.searchQuery) && AbstractC22676k.m65745e(this.serviceList, c33064f.serviceList) && this.hasOverrides == c33064f.hasOverrides;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasOverrides) + AbstractC11895b.m31983b(this.searchQuery.hashCode() * 31, 31, this.serviceList);
    }

    public String toString() {
        String str = this.searchQuery;
        List<C33062d> list = this.serviceList;
        return AbstractC18489d0.m53372m(AbstractC30802r.m94766o("LocalServiceViewState(searchQuery=", str, ", serviceList=", ", hasOverrides=", list), this.hasOverrides, ")");
    }

    public /* synthetic */ C33064f(String str, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? false : z4);
    }
}
