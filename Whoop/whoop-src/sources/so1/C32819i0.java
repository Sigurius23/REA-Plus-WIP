package so1;

import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseLegendStyle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: so1.i0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lso1/i0;", "", "Lcom/whoop/design/util/TextResource;", "label", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32819i0 {

    /* JADX INFO: renamed from: c */
    public static final int f136730c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PhaseLegendStyle style;

    public C32819i0(TextResource label, PhaseLegendStyle phaseLegendStyle) {
        AbstractC22676k.m65750j(label, "label");
        this.label = label;
        this.style = phaseLegendStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PhaseLegendStyle getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32819i0)) {
            return false;
        }
        C32819i0 c32819i0 = (C32819i0) other;
        return AbstractC22676k.m65745e(this.label, c32819i0.label) && this.style == c32819i0.style;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        PhaseLegendStyle phaseLegendStyle = this.style;
        return iHashCode + (phaseLegendStyle == null ? 0 : phaseLegendStyle.hashCode());
    }

    public String toString() {
        return "PhaseLegendViewState(label=" + this.label + ", style=" + this.style + ")";
    }
}
