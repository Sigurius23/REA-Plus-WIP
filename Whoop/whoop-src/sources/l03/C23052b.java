package l03;

import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: l03.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u0011R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011¨\u0006\""}, m65681d2 = {"Ll03/b;", "", "", "sizePx", "", "seed", "", "paceOfAgingScore", "yearsDifferenceScore", "startColor", "endColor", "<init>", "(IJDDII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "J", "c", "()J", "D", "()D", "getYearsDifferenceScore", "e", "f", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23052b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int sizePx;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long seed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double paceOfAgingScore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double yearsDifferenceScore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int startColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int endColor;

    public C23052b(int i13, long j7, double d3, double d14, int i14, int i15) {
        this.sizePx = i13;
        this.seed = j7;
        this.paceOfAgingScore = d3;
        this.yearsDifferenceScore = d14;
        this.startColor = i14;
        this.endColor = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEndColor() {
        return this.endColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getPaceOfAgingScore() {
        return this.paceOfAgingScore;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getSeed() {
        return this.seed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSizePx() {
        return this.sizePx;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStartColor() {
        return this.startColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23052b)) {
            return false;
        }
        C23052b c23052b = (C23052b) other;
        return this.sizePx == c23052b.sizePx && this.seed == c23052b.seed && Double.compare(this.paceOfAgingScore, c23052b.paceOfAgingScore) == 0 && Double.compare(this.yearsDifferenceScore, c23052b.yearsDifferenceScore) == 0 && this.startColor == c23052b.startColor && this.endColor == c23052b.endColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.endColor) + AbstractC11266d.m30448b(this.startColor, AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30451e(Integer.hashCode(this.sizePx) * 31, this.seed, 31), 31, this.paceOfAgingScore), 31, this.yearsDifferenceScore), 31);
    }

    public String toString() {
        int i13 = this.sizePx;
        long j7 = this.seed;
        double d3 = this.paceOfAgingScore;
        double d14 = this.yearsDifferenceScore;
        int i14 = this.startColor;
        int i15 = this.endColor;
        StringBuilder sb4 = new StringBuilder("AmoebaImageSpec(sizePx=");
        sb4.append(i13);
        sb4.append(", seed=");
        sb4.append(j7);
        AbstractC31061c.m95622B(sb4, ", paceOfAgingScore=", d3, ", yearsDifferenceScore=");
        sb4.append(d14);
        sb4.append(", startColor=");
        sb4.append(i14);
        sb4.append(", endColor=");
        sb4.append(i15);
        sb4.append(")");
        return sb4.toString();
    }
}
