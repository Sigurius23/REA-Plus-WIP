package xq2;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: xq2.r0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, m65681d2 = {"Lxq2/r0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lxq2/k;", "header", "", "Lxq2/l;", "comparisons", "Lxq2/j;", "footer", "<init>", "(Lcom/whoop/design/util/TextResource;Lxq2/k;Ljava/util/List;Lxq2/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Lxq2/k;", "c", "()Lxq2/k;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lxq2/j;", "()Lxq2/j;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38588r0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38573k header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C38575l> comparisons;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C38571j footer;

    public C38588r0(TextResource title, C38573k header, List<C38575l> comparisons, C38571j footer) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(comparisons, "comparisons");
        AbstractC22676k.m65750j(footer, "footer");
        this.title = title;
        this.header = header;
        this.comparisons = comparisons;
        this.footer = footer;
    }

    /* JADX INFO: renamed from: a */
    public final List<C38575l> m123767a() {
        return this.comparisons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C38571j getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C38573k getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38588r0)) {
            return false;
        }
        C38588r0 c38588r0 = (C38588r0) other;
        return AbstractC22676k.m65745e(this.title, c38588r0.title) && AbstractC22676k.m65745e(this.header, c38588r0.header) && AbstractC22676k.m65745e(this.comparisons, c38588r0.comparisons) && AbstractC22676k.m65745e(this.footer, c38588r0.footer);
    }

    public int hashCode() {
        return this.footer.hashCode() + AbstractC11895b.m31983b((this.header.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.comparisons);
    }

    public String toString() {
        return "YearInReviewComparisonState(title=" + this.title + ", header=" + this.header + ", comparisons=" + this.comparisons + ", footer=" + this.footer + ")";
    }
}
