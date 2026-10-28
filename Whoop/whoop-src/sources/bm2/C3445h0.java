package bm2;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bm2.h0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lbm2/h0;", "Lm91/u;", "", "score", "", "Lbm2/s0;", "segments", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "()Ljava/util/List;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3445h0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer score;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C3473s0> segments;

    public C3445h0(Integer num, List<C3473s0> segments) {
        AbstractC22676k.m65750j(segments, "segments");
        this.score = num;
        this.segments = segments;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: b */
    public final List<C3473s0> m10065b() {
        return this.segments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3445h0)) {
            return false;
        }
        C3445h0 c3445h0 = (C3445h0) other;
        return AbstractC22676k.m65745e(this.score, c3445h0.score) && AbstractC22676k.m65745e(this.segments, c3445h0.segments);
    }

    public int hashCode() {
        Integer num = this.score;
        return this.segments.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public String toString() {
        return "MeterViewState(score=" + this.score + ", segments=" + this.segments + ")";
    }
}
