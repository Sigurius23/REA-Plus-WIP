package mw0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33210q;
import s01.C32048d;

/* JADX INFO: renamed from: mw0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lmw0/l;", "", "Lsz0/q;", "mainStat", "centerStat", "Ls01/d;", "whoopCoachVowViewState", "<init>", "(Lsz0/q;Lsz0/q;Ls01/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q;", "b", "()Lsz0/q;", "c", "Ls01/d;", "()Ls01/d;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25984l {

    /* JADX INFO: renamed from: d */
    public static final int f102682d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33210q mainStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33210q centerStat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32048d whoopCoachVowViewState;

    static {
        int i13 = C32048d.f132920h;
        int i14 = C33210q.f138488m;
        f102682d = i13 | i14 | i14;
    }

    public C25984l(C33210q c33210q, C33210q c33210q2, C32048d c32048d) {
        this.mainStat = c33210q;
        this.centerStat = c33210q2;
        this.whoopCoachVowViewState = c32048d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C33210q getCenterStat() {
        return this.centerStat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33210q getMainStat() {
        return this.mainStat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C32048d getWhoopCoachVowViewState() {
        return this.whoopCoachVowViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25984l)) {
            return false;
        }
        C25984l c25984l = (C25984l) other;
        return AbstractC22676k.m65745e(this.mainStat, c25984l.mainStat) && AbstractC22676k.m65745e(this.centerStat, c25984l.centerStat) && AbstractC22676k.m65745e(this.whoopCoachVowViewState, c25984l.whoopCoachVowViewState);
    }

    public int hashCode() {
        C33210q c33210q = this.mainStat;
        int iHashCode = (c33210q == null ? 0 : c33210q.hashCode()) * 31;
        C33210q c33210q2 = this.centerStat;
        int iHashCode2 = (iHashCode + (c33210q2 == null ? 0 : c33210q2.hashCode())) * 31;
        C32048d c32048d = this.whoopCoachVowViewState;
        return iHashCode2 + (c32048d != null ? c32048d.hashCode() : 0);
    }

    public String toString() {
        return "StatsSectionState(mainStat=" + this.mainStat + ", centerStat=" + this.centerStat + ", whoopCoachVowViewState=" + this.whoopCoachVowViewState + ")";
    }

    public /* synthetic */ C25984l(C33210q c33210q, C33210q c33210q2, C32048d c32048d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c33210q, (i13 & 2) != 0 ? null : c33210q2, (i13 & 4) != 0 ? null : c32048d);
    }
}
