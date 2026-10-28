package p736sz0;

import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz0.g1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lsz0/g1;", "", "Lcom/whoop/design/util/TextResource;", "trendText", "Lhy0/b2;", "trendType", "<init>", "(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Lhy0/b2;", "()Lhy0/b2;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33182g1 {

    /* JADX INFO: renamed from: c */
    public static final int f138361c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource trendText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC17727b2 trendType;

    public C33182g1(TextResource trendText, EnumC17727b2 trendType) {
        AbstractC22676k.m65750j(trendText, "trendText");
        AbstractC22676k.m65750j(trendType, "trendType");
        this.trendText = trendText;
        this.trendType = trendType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTrendText() {
        return this.trendText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC17727b2 getTrendType() {
        return this.trendType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33182g1)) {
            return false;
        }
        C33182g1 c33182g1 = (C33182g1) other;
        return AbstractC22676k.m65745e(this.trendText, c33182g1.trendText) && this.trendType == c33182g1.trendType;
    }

    public int hashCode() {
        return this.trendType.hashCode() + (this.trendText.hashCode() * 31);
    }

    public String toString() {
        return "StatTrend(trendText=" + this.trendText + ", trendType=" + this.trendType + ")";
    }
}
