package ot2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: ot2.q */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lot2/q;", "", "Lcom/whoop/design/util/TextResource;", "legendTitle", "Ly81/f;", "legendColor", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "()Ly81/f;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28348q {

    /* JADX INFO: renamed from: c */
    public static final int f114376c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource legendTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f legendColor;

    public C28348q(TextResource legendTitle, EnumC39333f legendColor) {
        AbstractC22676k.m65750j(legendTitle, "legendTitle");
        AbstractC22676k.m65750j(legendColor, "legendColor");
        this.legendTitle = legendTitle;
        this.legendColor = legendColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getLegendColor() {
        return this.legendColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLegendTitle() {
        return this.legendTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28348q)) {
            return false;
        }
        C28348q c28348q = (C28348q) other;
        return AbstractC22676k.m65745e(this.legendTitle, c28348q.legendTitle) && this.legendColor == c28348q.legendColor;
    }

    public int hashCode() {
        return this.legendColor.hashCode() + (this.legendTitle.hashCode() * 31);
    }

    public String toString() {
        return "MetricLegend(legendTitle=" + this.legendTitle + ", legendColor=" + this.legendColor + ")";
    }
}
