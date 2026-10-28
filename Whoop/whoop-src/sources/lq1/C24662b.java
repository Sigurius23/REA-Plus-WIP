package lq1;

import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lq1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, m65681d2 = {"Llq1/b;", "", "Lcom/whoop/design/atomic/organism/toolbar/d$a;", "toolbarState", "Lcom/whoop/design/util/TextResource;", "impactName", "Lkd1/o;", "imageSource", "Llq1/e;", "subHeaderState", "<init>", "(Lcom/whoop/design/atomic/organism/toolbar/d$a;Lcom/whoop/design/util/TextResource;Lkd1/o;Llq1/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/atomic/organism/toolbar/d$a;", "d", "()Lcom/whoop/design/atomic/organism/toolbar/d$a;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Lkd1/o;", "()Lkd1/o;", "Llq1/e;", "()Llq1/e;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24662b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC6721d.a toolbarState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource impactName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C24665e subHeaderState;

    public C24662b(AbstractC6721d.a toolbarState, TextResource impactName, AbstractC22403o imageSource, C24665e c24665e) {
        AbstractC22676k.m65750j(toolbarState, "toolbarState");
        AbstractC22676k.m65750j(impactName, "impactName");
        AbstractC22676k.m65750j(imageSource, "imageSource");
        this.toolbarState = toolbarState;
        this.impactName = impactName;
        this.imageSource = imageSource;
        this.subHeaderState = c24665e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getImpactName() {
        return this.impactName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C24665e getSubHeaderState() {
        return this.subHeaderState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC6721d.a getToolbarState() {
        return this.toolbarState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24662b)) {
            return false;
        }
        C24662b c24662b = (C24662b) other;
        return AbstractC22676k.m65745e(this.toolbarState, c24662b.toolbarState) && AbstractC22676k.m65745e(this.impactName, c24662b.impactName) && AbstractC22676k.m65745e(this.imageSource, c24662b.imageSource) && AbstractC22676k.m65745e(this.subHeaderState, c24662b.subHeaderState);
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.imageSource, AbstractC31061c.m95625a(this.toolbarState.hashCode() * 31, this.impactName, 31), 31);
        C24665e c24665e = this.subHeaderState;
        return iM91833c + (c24665e == null ? 0 : c24665e.hashCode());
    }

    public String toString() {
        return "BehaviorDetailsScreenHeaderState(toolbarState=" + this.toolbarState + ", impactName=" + this.impactName + ", imageSource=" + this.imageSource + ", subHeaderState=" + this.subHeaderState + ")";
    }
}
