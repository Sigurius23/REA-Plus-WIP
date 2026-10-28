package so1;

import com.whoop.design.util.TextResource;
import hy0.C17731c2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.m0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lso1/m0;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "valueDisplay", "variance", "units", "Lhy0/c2;", "trend", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "e", "Lhy0/c2;", "()Lhy0/c2;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32827m0 {

    /* JADX INFO: renamed from: f */
    public static final int f136758f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource valueDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource variance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource units;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17731c2 trend;

    static {
        int i13 = C17731c2.f68917p;
        int i14 = TextResource.$stable;
        f136758f = i13 | i14 | i14 | i14 | i14;
    }

    public C32827m0(TextResource titleDisplay, TextResource valueDisplay, TextResource variance, TextResource units, C17731c2 c17731c2) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(variance, "variance");
        AbstractC22676k.m65750j(units, "units");
        this.titleDisplay = titleDisplay;
        this.valueDisplay = valueDisplay;
        this.variance = variance;
        this.units = units;
        this.trend = c17731c2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getUnits() {
        return this.units;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getVariance() {
        return this.variance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32827m0)) {
            return false;
        }
        C32827m0 c32827m0 = (C32827m0) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c32827m0.titleDisplay) && AbstractC22676k.m65745e(this.valueDisplay, c32827m0.valueDisplay) && AbstractC22676k.m65745e(this.variance, c32827m0.variance) && AbstractC22676k.m65745e(this.units, c32827m0.units) && AbstractC22676k.m65745e(this.trend, c32827m0.trend);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.valueDisplay, 31), this.variance, 31), this.units, 31);
        C17731c2 c17731c2 = this.trend;
        return iM95625a + (c17731c2 == null ? 0 : c17731c2.hashCode());
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.valueDisplay;
        TextResource textResource3 = this.variance;
        TextResource textResource4 = this.units;
        C17731c2 c17731c2 = this.trend;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("TypicalCycleStatViewState(titleDisplay=", textResource, ", valueDisplay=", textResource2, ", variance=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", units=", textResource4, ", trend=");
        sbM106658q.append(c17731c2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
