package cj1;

import com.whoop.design.util.TextResource;
import d11.C11474i;
import hy0.C17731c2;
import j71.C21395c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cj1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0019\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, m65681d2 = {"Lcj1/a;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "heading", "title", "Lhy0/c2;", "trend", "Lj71/c;", "graph", "Lcj1/d;", "prefixCta", "suffixCta", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Lj71/c;Lcj1/d;Lcj1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "f", "c", "Lhy0/c2;", "g", "()Lhy0/c2;", "d", "Lj71/c;", "()Lj71/c;", "e", "Lcj1/d;", "()Lcj1/d;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4745a implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f19454g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource heading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21395c graph;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4748d prefixCta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4748d suffixCta;

    static {
        int i13 = C11474i.f36854E | C21395c.f81985e | C17731c2.f68917p;
        int i14 = TextResource.$stable;
        f19454g = i13 | i14 | i14;
    }

    public C4745a(TextResource heading, TextResource title, C17731c2 c17731c2, C21395c c21395c, C4748d c4748d, C4748d c4748d2) {
        AbstractC22676k.m65750j(heading, "heading");
        AbstractC22676k.m65750j(title, "title");
        this.heading = heading;
        this.title = title;
        this.trend = c17731c2;
        this.graph = c21395c;
        this.prefixCta = c4748d;
        this.suffixCta = c4748d2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C21395c getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4748d getPrefixCta() {
        return this.prefixCta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C4748d getSuffixCta() {
        return this.suffixCta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4745a)) {
            return false;
        }
        C4745a c4745a = (C4745a) other;
        return AbstractC22676k.m65745e(this.heading, c4745a.heading) && AbstractC22676k.m65745e(this.title, c4745a.title) && AbstractC22676k.m65745e(this.trend, c4745a.trend) && AbstractC22676k.m65745e(this.graph, c4745a.graph) && AbstractC22676k.m65745e(this.prefixCta, c4745a.prefixCta) && AbstractC22676k.m65745e(this.suffixCta, c4745a.suffixCta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.heading.hashCode() * 31, this.title, 31);
        C17731c2 c17731c2 = this.trend;
        int iHashCode = (iM95625a + (c17731c2 == null ? 0 : c17731c2.hashCode())) * 31;
        C21395c c21395c = this.graph;
        int iHashCode2 = (iHashCode + (c21395c == null ? 0 : c21395c.hashCode())) * 31;
        C4748d c4748d = this.prefixCta;
        int iHashCode3 = (iHashCode2 + (c4748d == null ? 0 : c4748d.hashCode())) * 31;
        C4748d c4748d2 = this.suffixCta;
        return iHashCode3 + (c4748d2 != null ? c4748d2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.heading;
        TextResource textResource2 = this.title;
        C17731c2 c17731c2 = this.trend;
        C21395c c21395c = this.graph;
        C4748d c4748d = this.prefixCta;
        C4748d c4748d2 = this.suffixCta;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("DataVisualizationCardBodyViewState(heading=", textResource, ", title=", textResource2, ", trend=");
        sbM106658q.append(c17731c2);
        sbM106658q.append(", graph=");
        sbM106658q.append(c21395c);
        sbM106658q.append(", prefixCta=");
        sbM106658q.append(c4748d);
        sbM106658q.append(", suffixCta=");
        sbM106658q.append(c4748d2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
