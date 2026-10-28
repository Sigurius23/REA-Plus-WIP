package u21;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u21.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0019\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, m65681d2 = {"Lu21/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "description", "Ly81/e;", "progressBarColor", "Lu21/e;", "currentMilestone", "nextMilestone", "", "progressPercent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lu21/e;Lu21/e;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ly81/e;", "e", "()Ly81/e;", "d", "Lu21/e;", "()Lu21/e;", "f", "D", "()D", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34484d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e progressBarColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34485e currentMilestone;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C34485e nextMilestone;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double progressPercent;

    public C34484d(TextResource title, TextResource description, InterfaceC39332e interfaceC39332e, C34485e c34485e, C34485e c34485e2, double d3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.description = description;
        this.progressBarColor = interfaceC39332e;
        this.currentMilestone = c34485e;
        this.nextMilestone = c34485e2;
        this.progressPercent = d3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C34485e getCurrentMilestone() {
        return this.currentMilestone;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C34485e getNextMilestone() {
        return this.nextMilestone;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getProgressBarColor() {
        return this.progressBarColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34484d)) {
            return false;
        }
        C34484d c34484d = (C34484d) other;
        return AbstractC22676k.m65745e(this.title, c34484d.title) && AbstractC22676k.m65745e(this.description, c34484d.description) && AbstractC22676k.m65745e(this.progressBarColor, c34484d.progressBarColor) && AbstractC22676k.m65745e(this.currentMilestone, c34484d.currentMilestone) && AbstractC22676k.m65745e(this.nextMilestone, c34484d.nextMilestone) && Double.compare(this.progressPercent, c34484d.progressPercent) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getProgressPercent() {
        return this.progressPercent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31);
        InterfaceC39332e interfaceC39332e = this.progressBarColor;
        int iHashCode = (iM95625a + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
        C34485e c34485e = this.currentMilestone;
        int iHashCode2 = (iHashCode + (c34485e == null ? 0 : c34485e.hashCode())) * 31;
        C34485e c34485e2 = this.nextMilestone;
        return Double.hashCode(this.progressPercent) + ((iHashCode2 + (c34485e2 != null ? c34485e2.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        InterfaceC39332e interfaceC39332e = this.progressBarColor;
        C34485e c34485e = this.currentMilestone;
        C34485e c34485e2 = this.nextMilestone;
        double d3 = this.progressPercent;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MilestoneProgressCardState(title=", textResource, ", description=", textResource2, ", progressBarColor=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(", currentMilestone=");
        sbM106658q.append(c34485e);
        sbM106658q.append(", nextMilestone=");
        sbM106658q.append(c34485e2);
        sbM106658q.append(", progressPercent=");
        sbM106658q.append(d3);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C34484d(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, C34485e c34485e, C34485e c34485e2, double d3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? null : c34485e, (i13 & 16) != 0 ? null : c34485e2, d3);
    }
}
