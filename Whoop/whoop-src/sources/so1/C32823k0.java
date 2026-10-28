package so1;

import com.whoop.design.util.TextResource;
import java.util.List;
import np1.C27033k;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.k0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lso1/k0;", "", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "", "Lnp1/k;", "segmentedControlDisplays", "Lm91/u;", "currentCycleSegment", "lastThreeCyclesSegment", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32823k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C27033k> segmentedControlDisplays;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> currentCycleSegment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> lastThreeCyclesSegment;

    /* JADX WARN: Multi-variable type inference failed */
    public C32823k0(TextResource navigationTitle, List<C27033k> segmentedControlDisplays, List<? extends InterfaceC25312u> currentCycleSegment, List<? extends InterfaceC25312u> lastThreeCyclesSegment) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(segmentedControlDisplays, "segmentedControlDisplays");
        AbstractC22676k.m65750j(currentCycleSegment, "currentCycleSegment");
        AbstractC22676k.m65750j(lastThreeCyclesSegment, "lastThreeCyclesSegment");
        this.navigationTitle = navigationTitle;
        this.segmentedControlDisplays = segmentedControlDisplays;
        this.currentCycleSegment = currentCycleSegment;
        this.lastThreeCyclesSegment = lastThreeCyclesSegment;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m102994a() {
        return this.currentCycleSegment;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m102995b() {
        return this.lastThreeCyclesSegment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: d */
    public final List<C27033k> m102997d() {
        return this.segmentedControlDisplays;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32823k0)) {
            return false;
        }
        C32823k0 c32823k0 = (C32823k0) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c32823k0.navigationTitle) && AbstractC22676k.m65745e(this.segmentedControlDisplays, c32823k0.segmentedControlDisplays) && AbstractC22676k.m65745e(this.currentCycleSegment, c32823k0.currentCycleSegment) && AbstractC22676k.m65745e(this.lastThreeCyclesSegment, c32823k0.lastThreeCyclesSegment);
    }

    public int hashCode() {
        return this.lastThreeCyclesSegment.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.navigationTitle.hashCode() * 31, 31, this.segmentedControlDisplays), 31, this.currentCycleSegment);
    }

    public String toString() {
        TextResource textResource = this.navigationTitle;
        List<C27033k> list = this.segmentedControlDisplays;
        return AbstractC30007c.m91843m(AbstractC33745d.m106657p(textResource, "SymptomsScreenViewState(navigationTitle=", ", segmentedControlDisplays=", ", currentCycleSegment=", list), this.currentCycleSegment, ", lastThreeCyclesSegment=", this.lastThreeCyclesSegment, ")");
    }
}
