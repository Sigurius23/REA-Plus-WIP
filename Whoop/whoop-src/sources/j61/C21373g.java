package j61;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: j61.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, m65681d2 = {"Lj61/g;", "", "Lcom/whoop/design/util/TextResource;", "graphDescription", "startVerticalAxisDescription", "endVerticalAxisDescription", "bottomHorizontalAxisDescription", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "getStartVerticalAxisDescription", "c", "getEndVerticalAxisDescription", "d", "getBottomHorizontalAxisDescription", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21373g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource graphDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource startVerticalAxisDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource endVerticalAxisDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource bottomHorizontalAxisDescription;

    public C21373g(TextResource graphDescription, TextResource startVerticalAxisDescription, TextResource endVerticalAxisDescription, TextResource bottomHorizontalAxisDescription) {
        AbstractC22676k.m65750j(graphDescription, "graphDescription");
        AbstractC22676k.m65750j(startVerticalAxisDescription, "startVerticalAxisDescription");
        AbstractC22676k.m65750j(endVerticalAxisDescription, "endVerticalAxisDescription");
        AbstractC22676k.m65750j(bottomHorizontalAxisDescription, "bottomHorizontalAxisDescription");
        this.graphDescription = graphDescription;
        this.startVerticalAxisDescription = startVerticalAxisDescription;
        this.endVerticalAxisDescription = endVerticalAxisDescription;
        this.bottomHorizontalAxisDescription = bottomHorizontalAxisDescription;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getGraphDescription() {
        return this.graphDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21373g)) {
            return false;
        }
        C21373g c21373g = (C21373g) other;
        return AbstractC22676k.m65745e(this.graphDescription, c21373g.graphDescription) && AbstractC22676k.m65745e(this.startVerticalAxisDescription, c21373g.startVerticalAxisDescription) && AbstractC22676k.m65745e(this.endVerticalAxisDescription, c21373g.endVerticalAxisDescription) && AbstractC22676k.m65745e(this.bottomHorizontalAxisDescription, c21373g.bottomHorizontalAxisDescription);
    }

    public int hashCode() {
        return this.bottomHorizontalAxisDescription.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.graphDescription.hashCode() * 31, this.startVerticalAxisDescription, 31), this.endVerticalAxisDescription, 31);
    }

    public String toString() {
        TextResource textResource = this.graphDescription;
        TextResource textResource2 = this.startVerticalAxisDescription;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("GraphPlaneAccessibilityState(graphDescription=", textResource, ", startVerticalAxisDescription=", textResource2, ", endVerticalAxisDescription="), this.endVerticalAxisDescription, ", bottomHorizontalAxisDescription=", this.bottomHorizontalAxisDescription, ")");
    }

    public /* synthetic */ C21373g(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource4);
    }
}
