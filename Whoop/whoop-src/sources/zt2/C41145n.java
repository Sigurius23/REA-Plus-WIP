package zt2;

import java.util.List;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: zt2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lzt2/n;", "Lm91/u;", "", "Lzt2/l;", "items", "", "goalId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41145n implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C41143l> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String goalId;

    public C41145n(List<C41143l> items, String str) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.goalId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGoalId() {
        return this.goalId;
    }

    /* JADX INFO: renamed from: b */
    public final List<C41143l> m133637b() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41145n)) {
            return false;
        }
        C41145n c41145n = (C41145n) other;
        return AbstractC22676k.m65745e(this.items, c41145n.items) && AbstractC22676k.m65745e(this.goalId, c41145n.goalId);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.goalId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30802r.m94761j("RecoveriesCounterState(items=", ", goalId=", this.goalId, ")", this.items);
    }
}
