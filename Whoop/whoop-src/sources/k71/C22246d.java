package k71;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import n21.EnumC26195i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: k71.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006$"}, m65681d2 = {"Lk71/d;", "", "Li91/a;", "legendColor", "Lcom/whoop/design/util/TextResource;", "legendText", "legendTextColor", "Ln21/i;", "shape", "Lgz0/m0;", "icon", "<init>", "(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li91/a;", "b", "()Li91/a;", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "d", "Ln21/i;", "e", "()Ln21/i;", "Lgz0/m0;", "()Lgz0/m0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22246d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18247a legendColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource legendText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18247a legendTextColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC26195i shape;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    public C22246d(AbstractC18247a legendColor, TextResource legendText, AbstractC18247a abstractC18247a, EnumC26195i shape, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(legendColor, "legendColor");
        AbstractC22676k.m65750j(legendText, "legendText");
        AbstractC22676k.m65750j(shape, "shape");
        this.legendColor = legendColor;
        this.legendText = legendText;
        this.legendTextColor = abstractC18247a;
        this.shape = shape;
        this.icon = enumC16313m0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC18247a getLegendColor() {
        return this.legendColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLegendText() {
        return this.legendText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC18247a getLegendTextColor() {
        return this.legendTextColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC26195i getShape() {
        return this.shape;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22246d)) {
            return false;
        }
        C22246d c22246d = (C22246d) other;
        return AbstractC22676k.m65745e(this.legendColor, c22246d.legendColor) && AbstractC22676k.m65745e(this.legendText, c22246d.legendText) && AbstractC22676k.m65745e(this.legendTextColor, c22246d.legendTextColor) && this.shape == c22246d.shape && this.icon == c22246d.icon;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.legendColor.hashCode() * 31, this.legendText, 31);
        AbstractC18247a abstractC18247a = this.legendTextColor;
        int iHashCode = (this.shape.hashCode() + ((iM95625a + (abstractC18247a == null ? 0 : abstractC18247a.hashCode())) * 31)) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return iHashCode + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0);
    }

    public String toString() {
        return "GraphLegendState(legendColor=" + this.legendColor + ", legendText=" + this.legendText + ", legendTextColor=" + this.legendTextColor + ", shape=" + this.shape + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ C22246d(AbstractC18247a abstractC18247a, TextResource textResource, AbstractC18247a abstractC18247a2, EnumC26195i enumC26195i, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC18247a, textResource, (i13 & 4) != 0 ? null : abstractC18247a2, enumC26195i, (i13 & 16) != 0 ? null : enumC16313m0);
    }
}
