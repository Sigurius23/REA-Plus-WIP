package bm2;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y71.C39282o;

/* JADX INFO: renamed from: bm2.r */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lbm2/r;", "Lm91/u;", "", "navOptions", "Ly71/o;", "initial", "<init>", "(Ljava/util/List;Ly71/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ly71/o;", "()Ly71/o;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3470r implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> navOptions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39282o initial;

    /* JADX WARN: Multi-variable type inference failed */
    public C3470r(List<? extends InterfaceC25312u> navOptions, C39282o initial) {
        AbstractC22676k.m65750j(navOptions, "navOptions");
        AbstractC22676k.m65750j(initial, "initial");
        this.navOptions = navOptions;
        this.initial = initial;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C39282o getInitial() {
        return this.initial;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m10206b() {
        return this.navOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3470r)) {
            return false;
        }
        C3470r c3470r = (C3470r) other;
        return AbstractC22676k.m65745e(this.navOptions, c3470r.navOptions) && AbstractC22676k.m65745e(this.initial, c3470r.initial);
    }

    public int hashCode() {
        return this.initial.hashCode() + (this.navOptions.hashCode() * 31);
    }

    public String toString() {
        return "InterTrendNavigationState(navOptions=" + this.navOptions + ", initial=" + this.initial + ")";
    }
}
