package gi2;

import java.util.ArrayList;
import java.util.List;
import ji2.C21724c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gi2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lgi2/a;", "", "", "Lji2/c;", "list", "Lgi2/d;", "domainResult", "<init>", "(Ljava/util/List;Lgi2/d;)V", "a", "(Ljava/util/List;Lgi2/d;)Lgi2/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lgi2/d;", "c", "()Lgi2/d;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C15895a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C21724c> list;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC15898d domainResult;

    public C15895a(List<C21724c> list, AbstractC15898d domainResult) {
        AbstractC22676k.m65750j(list, "list");
        AbstractC22676k.m65750j(domainResult, "domainResult");
        this.list = list;
        this.domainResult = domainResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15895a m44829b(C15895a c15895a, List list, AbstractC15898d abstractC15898d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c15895a.list;
        }
        if ((i13 & 2) != 0) {
            abstractC15898d = c15895a.domainResult;
        }
        return c15895a.m44830a(list, abstractC15898d);
    }

    /* JADX INFO: renamed from: a */
    public final C15895a m44830a(List<C21724c> list, AbstractC15898d domainResult) {
        AbstractC22676k.m65750j(list, "list");
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return new C15895a(list, domainResult);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC15898d getDomainResult() {
        return this.domainResult;
    }

    /* JADX INFO: renamed from: d */
    public final List<C21724c> m44832d() {
        return this.list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15895a)) {
            return false;
        }
        C15895a c15895a = (C15895a) other;
        return AbstractC22676k.m65745e(this.list, c15895a.list) && AbstractC22676k.m65745e(this.domainResult, c15895a.domainResult);
    }

    public int hashCode() {
        return this.domainResult.hashCode() + (this.list.hashCode() * 31);
    }

    public String toString() {
        return "Accumulator(list=" + this.list + ", domainResult=" + this.domainResult + ")";
    }

    public /* synthetic */ C15895a(List list, AbstractC15898d abstractC15898d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new ArrayList() : list, (i13 & 2) != 0 ? AbstractC15898d.h.f60090a : abstractC15898d);
    }
}
