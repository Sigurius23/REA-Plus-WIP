package f01;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import hy0.C17731c2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f01.k0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lf01/k0;", "", "Lcom/whoop/design/util/TextResource;", "title", "magnitude", "magnitudeSuffix", "Lhy0/c2;", "trend", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;)Lf01/k0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Lhy0/c2;", "f", "()Lhy0/c2;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13873k0 {

    /* JADX INFO: renamed from: e */
    public static final int f49458e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource magnitude;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource magnitudeSuffix;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17731c2 trend;

    public C13873k0(TextResource title, TextResource magnitude, TextResource magnitudeSuffix, C17731c2 c17731c2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(magnitude, "magnitude");
        AbstractC22676k.m65750j(magnitudeSuffix, "magnitudeSuffix");
        this.title = title;
        this.magnitude = magnitude;
        this.magnitudeSuffix = magnitudeSuffix;
        this.trend = c17731c2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13873k0 m39330b(C13873k0 c13873k0, TextResource textResource, TextResource textResource2, TextResource textResource3, C17731c2 c17731c2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c13873k0.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c13873k0.magnitude;
        }
        if ((i13 & 4) != 0) {
            textResource3 = c13873k0.magnitudeSuffix;
        }
        if ((i13 & 8) != 0) {
            c17731c2 = c13873k0.trend;
        }
        return c13873k0.m39331a(textResource, textResource2, textResource3, c17731c2);
    }

    /* JADX INFO: renamed from: a */
    public final C13873k0 m39331a(TextResource title, TextResource magnitude, TextResource magnitudeSuffix, C17731c2 trend) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(magnitude, "magnitude");
        AbstractC22676k.m65750j(magnitudeSuffix, "magnitudeSuffix");
        return new C13873k0(title, magnitude, magnitudeSuffix, trend);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getMagnitude() {
        return this.magnitude;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getMagnitudeSuffix() {
        return this.magnitudeSuffix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13873k0)) {
            return false;
        }
        C13873k0 c13873k0 = (C13873k0) other;
        return AbstractC22676k.m65745e(this.title, c13873k0.title) && AbstractC22676k.m65745e(this.magnitude, c13873k0.magnitude) && AbstractC22676k.m65745e(this.magnitudeSuffix, c13873k0.magnitudeSuffix) && AbstractC22676k.m65745e(this.trend, c13873k0.trend);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.magnitude, 31), this.magnitudeSuffix, 31);
        C17731c2 c17731c2 = this.trend;
        return iM95625a + (c17731c2 == null ? 0 : c17731c2.hashCode());
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.magnitude;
        TextResource textResource3 = this.magnitudeSuffix;
        C17731c2 c17731c2 = this.trend;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GraphDescriptionCardBodyState(title=", textResource, ", magnitude=", textResource2, ", magnitudeSuffix=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", trend=");
        sbM106658q.append(c17731c2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
