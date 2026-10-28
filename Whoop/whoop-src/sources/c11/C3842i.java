package c11;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c11.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b2\u00107R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b\"\u00105R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b*\u00109¨\u0006:"}, m65681d2 = {"Lc11/i;", "", "", "Lc11/k;", "rangeDivisions", "Lcom/whoop/design/util/TextResource;", "rangeLeftLabelDisplay", "Lc11/m;", "rangeLeftLabelStyle", "rangeRightLabelDisplay", "rangeRightLabelStyle", "Lc11/l;", "topRangeValue", "impactValueDisplay", "impactValueLabelDisplay", "Lc11/n;", "impactValueStyle", "expandedBottomRangeValue", "Lm91/u;", "expandedItems", "Lm91/p;", "factory", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lc11/m;Lcom/whoop/design/util/TextResource;Lc11/m;Lc11/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc11/n;Lc11/l;Ljava/util/List;Lm91/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "Lc11/m;", "i", "()Lc11/m;", "d", "j", "e", "k", "f", "Lc11/l;", "l", "()Lc11/l;", "Lc11/n;", "()Lc11/n;", "Lm91/p;", "()Lm91/p;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3842i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C3844k> rangeDivisions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource rangeLeftLabelDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC3846m rangeLeftLabelStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource rangeRightLabelDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC3846m rangeRightLabelStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C3845l topRangeValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource impactValueDisplay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource impactValueLabelDisplay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC3847n impactValueStyle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C3845l expandedBottomRangeValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<InterfaceC25312u> expandedItems;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C25307p factory;

    /* JADX WARN: Multi-variable type inference failed */
    public C3842i(List<C3844k> rangeDivisions, TextResource rangeLeftLabelDisplay, EnumC3846m rangeLeftLabelStyle, TextResource rangeRightLabelDisplay, EnumC3846m rangeRightLabelStyle, C3845l topRangeValue, TextResource impactValueDisplay, TextResource impactValueLabelDisplay, EnumC3847n impactValueStyle, C3845l expandedBottomRangeValue, List<? extends InterfaceC25312u> expandedItems, C25307p factory) {
        AbstractC22676k.m65750j(rangeDivisions, "rangeDivisions");
        AbstractC22676k.m65750j(rangeLeftLabelDisplay, "rangeLeftLabelDisplay");
        AbstractC22676k.m65750j(rangeLeftLabelStyle, "rangeLeftLabelStyle");
        AbstractC22676k.m65750j(rangeRightLabelDisplay, "rangeRightLabelDisplay");
        AbstractC22676k.m65750j(rangeRightLabelStyle, "rangeRightLabelStyle");
        AbstractC22676k.m65750j(topRangeValue, "topRangeValue");
        AbstractC22676k.m65750j(impactValueDisplay, "impactValueDisplay");
        AbstractC22676k.m65750j(impactValueLabelDisplay, "impactValueLabelDisplay");
        AbstractC22676k.m65750j(impactValueStyle, "impactValueStyle");
        AbstractC22676k.m65750j(expandedBottomRangeValue, "expandedBottomRangeValue");
        AbstractC22676k.m65750j(expandedItems, "expandedItems");
        AbstractC22676k.m65750j(factory, "factory");
        this.rangeDivisions = rangeDivisions;
        this.rangeLeftLabelDisplay = rangeLeftLabelDisplay;
        this.rangeLeftLabelStyle = rangeLeftLabelStyle;
        this.rangeRightLabelDisplay = rangeRightLabelDisplay;
        this.rangeRightLabelStyle = rangeRightLabelStyle;
        this.topRangeValue = topRangeValue;
        this.impactValueDisplay = impactValueDisplay;
        this.impactValueLabelDisplay = impactValueLabelDisplay;
        this.impactValueStyle = impactValueStyle;
        this.expandedBottomRangeValue = expandedBottomRangeValue;
        this.expandedItems = expandedItems;
        this.factory = factory;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C3845l getExpandedBottomRangeValue() {
        return this.expandedBottomRangeValue;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m11774b() {
        return this.expandedItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C25307p getFactory() {
        return this.factory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getImpactValueDisplay() {
        return this.impactValueDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getImpactValueLabelDisplay() {
        return this.impactValueLabelDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3842i)) {
            return false;
        }
        C3842i c3842i = (C3842i) other;
        return AbstractC22676k.m65745e(this.rangeDivisions, c3842i.rangeDivisions) && AbstractC22676k.m65745e(this.rangeLeftLabelDisplay, c3842i.rangeLeftLabelDisplay) && this.rangeLeftLabelStyle == c3842i.rangeLeftLabelStyle && AbstractC22676k.m65745e(this.rangeRightLabelDisplay, c3842i.rangeRightLabelDisplay) && this.rangeRightLabelStyle == c3842i.rangeRightLabelStyle && AbstractC22676k.m65745e(this.topRangeValue, c3842i.topRangeValue) && AbstractC22676k.m65745e(this.impactValueDisplay, c3842i.impactValueDisplay) && AbstractC22676k.m65745e(this.impactValueLabelDisplay, c3842i.impactValueLabelDisplay) && this.impactValueStyle == c3842i.impactValueStyle && AbstractC22676k.m65745e(this.expandedBottomRangeValue, c3842i.expandedBottomRangeValue) && AbstractC22676k.m65745e(this.expandedItems, c3842i.expandedItems) && AbstractC22676k.m65745e(this.factory, c3842i.factory);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC3847n getImpactValueStyle() {
        return this.impactValueStyle;
    }

    /* JADX INFO: renamed from: g */
    public final List<C3844k> m11779g() {
        return this.rangeDivisions;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getRangeLeftLabelDisplay() {
        return this.rangeLeftLabelDisplay;
    }

    public int hashCode() {
        return this.factory.hashCode() + AbstractC11895b.m31983b((this.expandedBottomRangeValue.hashCode() + ((this.impactValueStyle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.topRangeValue.hashCode() + ((this.rangeRightLabelStyle.hashCode() + AbstractC31061c.m95625a((this.rangeLeftLabelStyle.hashCode() + AbstractC31061c.m95625a(this.rangeDivisions.hashCode() * 31, this.rangeLeftLabelDisplay, 31)) * 31, this.rangeRightLabelDisplay, 31)) * 31)) * 31, this.impactValueDisplay, 31), this.impactValueLabelDisplay, 31)) * 31)) * 31, 31, this.expandedItems);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC3846m getRangeLeftLabelStyle() {
        return this.rangeLeftLabelStyle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getRangeRightLabelDisplay() {
        return this.rangeRightLabelDisplay;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC3846m getRangeRightLabelStyle() {
        return this.rangeRightLabelStyle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C3845l getTopRangeValue() {
        return this.topRangeValue;
    }

    public String toString() {
        List<C3844k> list = this.rangeDivisions;
        TextResource textResource = this.rangeLeftLabelDisplay;
        EnumC3846m enumC3846m = this.rangeLeftLabelStyle;
        TextResource textResource2 = this.rangeRightLabelDisplay;
        EnumC3846m enumC3846m2 = this.rangeRightLabelStyle;
        C3845l c3845l = this.topRangeValue;
        TextResource textResource3 = this.impactValueDisplay;
        TextResource textResource4 = this.impactValueLabelDisplay;
        EnumC3847n enumC3847n = this.impactValueStyle;
        C3845l c3845l2 = this.expandedBottomRangeValue;
        List<InterfaceC25312u> list2 = this.expandedItems;
        C25307p c25307p = this.factory;
        StringBuilder sb4 = new StringBuilder("ContributorGraphViewState(rangeDivisions=");
        sb4.append(list);
        sb4.append(", rangeLeftLabelDisplay=");
        sb4.append(textResource);
        sb4.append(", rangeLeftLabelStyle=");
        sb4.append(enumC3846m);
        sb4.append(", rangeRightLabelDisplay=");
        sb4.append(textResource2);
        sb4.append(", rangeRightLabelStyle=");
        sb4.append(enumC3846m2);
        sb4.append(", topRangeValue=");
        sb4.append(c3845l);
        sb4.append(", impactValueDisplay=");
        AbstractC30007c.m91855y(sb4, textResource3, ", impactValueLabelDisplay=", textResource4, ", impactValueStyle=");
        sb4.append(enumC3847n);
        sb4.append(", expandedBottomRangeValue=");
        sb4.append(c3845l2);
        sb4.append(", expandedItems=");
        sb4.append(list2);
        sb4.append(", factory=");
        sb4.append(c25307p);
        sb4.append(")");
        return sb4.toString();
    }
}
