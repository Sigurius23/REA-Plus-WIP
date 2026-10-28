package c11;

import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c11.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006!"}, m65681d2 = {"Lc11/l;", "", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "valueUnitDisplay", "", "valueRangePercentage", "Lc11/o;", "style", "expandedValueLabelDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "e", "D", "d", "()D", "Lc11/o;", "()Lc11/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3845l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource valueDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource valueUnitDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double valueRangePercentage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC3848o style;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource expandedValueLabelDisplay;

    public C3845l(TextResource textResource, TextResource textResource2, double d3, EnumC3848o style, TextResource textResource3) {
        AbstractC22676k.m65750j(style, "style");
        this.valueDisplay = textResource;
        this.valueUnitDisplay = textResource2;
        this.valueRangePercentage = d3;
        this.style = style;
        this.expandedValueLabelDisplay = textResource3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getExpandedValueLabelDisplay() {
        return this.expandedValueLabelDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC3848o getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getValueRangePercentage() {
        return this.valueRangePercentage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getValueUnitDisplay() {
        return this.valueUnitDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3845l)) {
            return false;
        }
        C3845l c3845l = (C3845l) other;
        return AbstractC22676k.m65745e(this.valueDisplay, c3845l.valueDisplay) && AbstractC22676k.m65745e(this.valueUnitDisplay, c3845l.valueUnitDisplay) && Double.compare(this.valueRangePercentage, c3845l.valueRangePercentage) == 0 && this.style == c3845l.style && AbstractC22676k.m65745e(this.expandedValueLabelDisplay, c3845l.expandedValueLabelDisplay);
    }

    public int hashCode() {
        TextResource textResource = this.valueDisplay;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.valueUnitDisplay;
        int iHashCode2 = (this.style.hashCode() + AbstractC17176i.m48499a((iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.valueRangePercentage)) * 31;
        TextResource textResource3 = this.expandedValueLabelDisplay;
        return iHashCode2 + (textResource3 != null ? textResource3.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.valueDisplay;
        TextResource textResource2 = this.valueUnitDisplay;
        double d3 = this.valueRangePercentage;
        EnumC3848o enumC3848o = this.style;
        TextResource textResource3 = this.expandedValueLabelDisplay;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ContributorRangeValueState(valueDisplay=", textResource, ", valueUnitDisplay=", textResource2, ", valueRangePercentage=");
        sbM106658q.append(d3);
        sbM106658q.append(", style=");
        sbM106658q.append(enumC3848o);
        sbM106658q.append(", expandedValueLabelDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
