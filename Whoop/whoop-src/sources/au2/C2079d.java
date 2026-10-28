package au2;

import c13.AbstractC3855a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import wt2.C37626g;

/* JADX INFO: renamed from: au2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lau2/d;", "Lm91/u;", "Lwt2/g;", "progressBar", "", "Lau2/e;", "uncompleteditems", "completeditems", "<init>", "(Lwt2/g;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwt2/g;", "b", "()Lwt2/g;", "Ljava/util/List;", "c", "()Ljava/util/List;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2079d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37626g progressBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C2080e> uncompleteditems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C2080e> completeditems;

    public C2079d(C37626g c37626g, List<C2080e> uncompleteditems, List<C2080e> completeditems) {
        AbstractC22676k.m65750j(uncompleteditems, "uncompleteditems");
        AbstractC22676k.m65750j(completeditems, "completeditems");
        this.progressBar = c37626g;
        this.uncompleteditems = uncompleteditems;
        this.completeditems = completeditems;
    }

    /* JADX INFO: renamed from: a */
    public final List<C2080e> m6580a() {
        return this.completeditems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C37626g getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: c */
    public final List<C2080e> m6582c() {
        return this.uncompleteditems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2079d)) {
            return false;
        }
        C2079d c2079d = (C2079d) other;
        return AbstractC22676k.m65745e(this.progressBar, c2079d.progressBar) && AbstractC22676k.m65745e(this.uncompleteditems, c2079d.uncompleteditems) && AbstractC22676k.m65745e(this.completeditems, c2079d.completeditems);
    }

    public int hashCode() {
        C37626g c37626g = this.progressBar;
        return this.completeditems.hashCode() + AbstractC11895b.m31983b((c37626g == null ? 0 : c37626g.hashCode()) * 31, 31, this.uncompleteditems);
    }

    public String toString() {
        C37626g c37626g = this.progressBar;
        List<C2080e> list = this.uncompleteditems;
        List<C2080e> list2 = this.completeditems;
        StringBuilder sb4 = new StringBuilder("NewSummaryItemState(progressBar=");
        sb4.append(c37626g);
        sb4.append(", uncompleteditems=");
        sb4.append(list);
        sb4.append(", completeditems=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }
}
