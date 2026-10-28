package a01;

import java.util.List;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a01.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"La01/n;", "", "", "La01/o;", "sections", "", "indicatorPercent", "Lkd1/o;", "indicatorImageUrl", "<init>", "(Ljava/util/List;FLkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "F", "()F", "c", "Lkd1/o;", "getIndicatorImageUrl", "()Lkd1/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0094n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C0095o> sections;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float indicatorPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o indicatorImageUrl;

    public C0094n(List<C0095o> sections, float f13, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(sections, "sections");
        this.sections = sections;
        this.indicatorPercent = f13;
        this.indicatorImageUrl = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getIndicatorPercent() {
        return this.indicatorPercent;
    }

    /* JADX INFO: renamed from: b */
    public final List<C0095o> m256b() {
        return this.sections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0094n)) {
            return false;
        }
        C0094n c0094n = (C0094n) other;
        return AbstractC22676k.m65745e(this.sections, c0094n.sections) && Float.compare(this.indicatorPercent, c0094n.indicatorPercent) == 0 && AbstractC22676k.m65745e(this.indicatorImageUrl, c0094n.indicatorImageUrl);
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.indicatorPercent, this.sections.hashCode() * 31, 31);
        AbstractC22403o abstractC22403o = this.indicatorImageUrl;
        return iM30447a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode());
    }

    public String toString() {
        return "RangeMeterViewState(sections=" + this.sections + ", indicatorPercent=" + this.indicatorPercent + ", indicatorImageUrl=" + this.indicatorImageUrl + ")";
    }
}
