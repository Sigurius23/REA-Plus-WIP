package ik1;

import c11.C3849p;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ik1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lik1/e;", "Lm91/u;", "", "Lc11/p;", "contributors", "Lm91/p;", "factory", "<init>", "(Ljava/util/List;Lm91/p;)V", "a", "(Ljava/util/List;Lm91/p;)Lik1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lm91/p;", "getFactory", "()Lm91/p;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18608e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C3849p> contributors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25307p factory;

    public C18608e(List<C3849p> contributors, C25307p factory) {
        AbstractC22676k.m65750j(contributors, "contributors");
        AbstractC22676k.m65750j(factory, "factory");
        this.contributors = contributors;
        this.factory = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18608e m53848b(C18608e c18608e, List list, C25307p c25307p, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c18608e.contributors;
        }
        if ((i13 & 2) != 0) {
            c25307p = c18608e.factory;
        }
        return c18608e.m53849a(list, c25307p);
    }

    /* JADX INFO: renamed from: a */
    public final C18608e m53849a(List<C3849p> contributors, C25307p factory) {
        AbstractC22676k.m65750j(contributors, "contributors");
        AbstractC22676k.m65750j(factory, "factory");
        return new C18608e(contributors, factory);
    }

    /* JADX INFO: renamed from: c */
    public final List<C3849p> m53850c() {
        return this.contributors;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18608e)) {
            return false;
        }
        C18608e c18608e = (C18608e) other;
        return AbstractC22676k.m65745e(this.contributors, c18608e.contributors) && AbstractC22676k.m65745e(this.factory, c18608e.factory);
    }

    public int hashCode() {
        return this.factory.hashCode() + (this.contributors.hashCode() * 31);
    }

    public String toString() {
        return "ContributorsContainerViewState(contributors=" + this.contributors + ", factory=" + this.factory + ")";
    }
}
