package kj2;

import ih0.AbstractC18489d0;
import java.util.Set;
import m83.C25235a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kj2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lkj2/d;", "", "", "", "setOfExistingMonths", "Lkj2/e;", "action", "", "emitLoading", "<init>", "(Ljava/util/Set;Lkj2/e;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "b", "Lkj2/e;", "()Lkj2/e;", "Z", "()Z", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C22520d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<Integer> setOfExistingMonths;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22521e action;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean emitLoading;

    public C22520d(Set<Integer> setOfExistingMonths, AbstractC22521e abstractC22521e, boolean z4) {
        AbstractC22676k.m65750j(setOfExistingMonths, "setOfExistingMonths");
        this.setOfExistingMonths = setOfExistingMonths;
        this.action = abstractC22521e;
        this.emitLoading = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22521e getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEmitLoading() {
        return this.emitLoading;
    }

    /* JADX INFO: renamed from: c */
    public final Set<Integer> m65035c() {
        return this.setOfExistingMonths;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22520d)) {
            return false;
        }
        C22520d c22520d = (C22520d) other;
        return AbstractC22676k.m65745e(this.setOfExistingMonths, c22520d.setOfExistingMonths) && AbstractC22676k.m65745e(this.action, c22520d.action) && this.emitLoading == c22520d.emitLoading;
    }

    public int hashCode() {
        int iHashCode = this.setOfExistingMonths.hashCode() * 31;
        AbstractC22521e abstractC22521e = this.action;
        return Boolean.hashCode(this.emitLoading) + ((iHashCode + (abstractC22521e == null ? 0 : abstractC22521e.hashCode())) * 31);
    }

    public String toString() {
        Set<Integer> set = this.setOfExistingMonths;
        AbstractC22521e abstractC22521e = this.action;
        boolean z4 = this.emitLoading;
        StringBuilder sb4 = new StringBuilder("PreparationAccumulator(setOfExistingMonths=");
        sb4.append(set);
        sb4.append(", action=");
        sb4.append(abstractC22521e);
        sb4.append(", emitLoading=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C22520d(Set set, AbstractC22521e abstractC22521e, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25235a0.f99113w : set, (i13 & 2) != 0 ? null : abstractC22521e, (i13 & 4) != 0 ? false : z4);
    }
}
