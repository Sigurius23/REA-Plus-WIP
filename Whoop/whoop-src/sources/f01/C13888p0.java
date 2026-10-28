package f01;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import hy0.C17731c2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f01.p0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m65681d2 = {"Lf01/p0;", "", "Lcom/whoop/design/util/TextResource;", "startTitle", "endTitle", "Lhy0/c2;", "trend", "", "showPicker", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Z)Lf01/p0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lhy0/c2;", "f", "()Lhy0/c2;", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13888p0 {

    /* JADX INFO: renamed from: e */
    public static final int f49528e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource startTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource endTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showPicker;

    public C13888p0(TextResource startTitle, TextResource endTitle, C17731c2 trend, boolean z4) {
        AbstractC22676k.m65750j(startTitle, "startTitle");
        AbstractC22676k.m65750j(endTitle, "endTitle");
        AbstractC22676k.m65750j(trend, "trend");
        this.startTitle = startTitle;
        this.endTitle = endTitle;
        this.trend = trend;
        this.showPicker = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13888p0 m39487b(C13888p0 c13888p0, TextResource textResource, TextResource textResource2, C17731c2 c17731c2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c13888p0.startTitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c13888p0.endTitle;
        }
        if ((i13 & 4) != 0) {
            c17731c2 = c13888p0.trend;
        }
        if ((i13 & 8) != 0) {
            z4 = c13888p0.showPicker;
        }
        return c13888p0.m39488a(textResource, textResource2, c17731c2, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C13888p0 m39488a(TextResource startTitle, TextResource endTitle, C17731c2 trend, boolean showPicker) {
        AbstractC22676k.m65750j(startTitle, "startTitle");
        AbstractC22676k.m65750j(endTitle, "endTitle");
        AbstractC22676k.m65750j(trend, "trend");
        return new C13888p0(startTitle, endTitle, trend, showPicker);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getEndTitle() {
        return this.endTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowPicker() {
        return this.showPicker;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getStartTitle() {
        return this.startTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13888p0)) {
            return false;
        }
        C13888p0 c13888p0 = (C13888p0) other;
        return AbstractC22676k.m65745e(this.startTitle, c13888p0.startTitle) && AbstractC22676k.m65745e(this.endTitle, c13888p0.endTitle) && AbstractC22676k.m65745e(this.trend, c13888p0.trend) && this.showPicker == c13888p0.showPicker;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showPicker) + ((this.trend.hashCode() + AbstractC31061c.m95625a(this.startTitle.hashCode() * 31, this.endTitle, 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.startTitle;
        TextResource textResource2 = this.endTitle;
        C17731c2 c17731c2 = this.trend;
        boolean z4 = this.showPicker;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GraphDescriptionFooterState(startTitle=", textResource, ", endTitle=", textResource2, ", trend=");
        sbM106658q.append(c17731c2);
        sbM106658q.append(", showPicker=");
        sbM106658q.append(z4);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C13888p0(TextResource textResource, TextResource textResource2, C17731c2 c17731c2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, c17731c2, (i13 & 8) != 0 ? false : z4);
    }
}
