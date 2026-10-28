package e81;

import a01.C0088h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.AbstractC25265s;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: e81.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019Jx\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\b<\u0010=R\u0011\u0010?\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b2\u0010>¨\u0006@"}, m65681d2 = {"Le81/n;", "Lm91/u;", "", "id", "Le81/l;", "orientation", "Le81/f0;", "pieChart", "Le81/a;", "pieChartContent", "", "Le81/k0;", "trendCounts", "La01/h;", "biomarkers", "caption", "Le81/m;", "style", "", "pieChartFractionWidth", "<init>", "(Ljava/lang/String;Le81/l;Le81/f0;Le81/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le81/m;F)V", "", "index", "a", "(Ljava/lang/Integer;)La01/h;", "b", "(Ljava/lang/String;Le81/l;Le81/f0;Le81/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le81/m;F)Le81/n;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Le81/l;", "g", "()Le81/l;", "c", "Le81/f0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Le81/f0;", "d", "Le81/a;", "i", "()Le81/a;", "e", "Ljava/util/List;", "l", "()Ljava/util/List;", "f", "getBiomarkers", "Le81/m;", "k", "()Le81/m;", "F", "j", "()F", "()Z", "allowsSliceSelection", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12840n implements InterfaceC25312u {

    /* JADX INFO: renamed from: j */
    public static final int f44009j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC12838l orientation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12827f0 pieChart;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C12816a pieChartContent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C12837k0> trendCounts;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C0088h> biomarkers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String caption;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC12839m style;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float pieChartFractionWidth;

    public C12840n(String id4, EnumC12838l orientation, C12827f0 pieChart, C12816a pieChartContent, List<C12837k0> trendCounts, List<C0088h> biomarkers, String str, EnumC12839m style, float f13) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(orientation, "orientation");
        AbstractC22676k.m65750j(pieChart, "pieChart");
        AbstractC22676k.m65750j(pieChartContent, "pieChartContent");
        AbstractC22676k.m65750j(trendCounts, "trendCounts");
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.orientation = orientation;
        this.pieChart = pieChart;
        this.pieChartContent = pieChartContent;
        this.trendCounts = trendCounts;
        this.biomarkers = biomarkers;
        this.caption = str;
        this.style = style;
        this.pieChartFractionWidth = f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C12840n m36029c(C12840n c12840n, String str, EnumC12838l enumC12838l, C12827f0 c12827f0, C12816a c12816a, List list, List list2, String str2, EnumC12839m enumC12839m, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c12840n.id;
        }
        if ((i13 & 2) != 0) {
            enumC12838l = c12840n.orientation;
        }
        if ((i13 & 4) != 0) {
            c12827f0 = c12840n.pieChart;
        }
        if ((i13 & 8) != 0) {
            c12816a = c12840n.pieChartContent;
        }
        if ((i13 & 16) != 0) {
            list = c12840n.trendCounts;
        }
        if ((i13 & 32) != 0) {
            list2 = c12840n.biomarkers;
        }
        if ((i13 & 64) != 0) {
            str2 = c12840n.caption;
        }
        if ((i13 & 128) != 0) {
            enumC12839m = c12840n.style;
        }
        if ((i13 & 256) != 0) {
            f13 = c12840n.pieChartFractionWidth;
        }
        EnumC12839m enumC12839m2 = enumC12839m;
        float f14 = f13;
        List list3 = list2;
        String str3 = str2;
        List list4 = list;
        C12827f0 c12827f1 = c12827f0;
        return c12840n.m36031b(str, enumC12838l, c12827f1, c12816a, list4, list3, str3, enumC12839m2, f14);
    }

    /* JADX INFO: renamed from: a */
    public final C0088h m36030a(Integer index) {
        if (index != null) {
            return (C0088h) AbstractC25265s.m74102I0(index.intValue(), this.biomarkers);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C12840n m36031b(String id4, EnumC12838l orientation, C12827f0 pieChart, C12816a pieChartContent, List<C12837k0> trendCounts, List<C0088h> biomarkers, String caption, EnumC12839m style, float pieChartFractionWidth) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(orientation, "orientation");
        AbstractC22676k.m65750j(pieChart, "pieChart");
        AbstractC22676k.m65750j(pieChartContent, "pieChartContent");
        AbstractC22676k.m65750j(trendCounts, "trendCounts");
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        AbstractC22676k.m65750j(style, "style");
        return new C12840n(id4, orientation, pieChart, pieChartContent, trendCounts, biomarkers, caption, style, pieChartFractionWidth);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36032e() {
        return this.orientation == EnumC12838l.PIE_BOTTOM;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12840n)) {
            return false;
        }
        C12840n c12840n = (C12840n) other;
        return AbstractC22676k.m65745e(this.id, c12840n.id) && this.orientation == c12840n.orientation && AbstractC22676k.m65745e(this.pieChart, c12840n.pieChart) && AbstractC22676k.m65745e(this.pieChartContent, c12840n.pieChartContent) && AbstractC22676k.m65745e(this.trendCounts, c12840n.trendCounts) && AbstractC22676k.m65745e(this.biomarkers, c12840n.biomarkers) && AbstractC22676k.m65745e(this.caption, c12840n.caption) && this.style == c12840n.style && Float.compare(this.pieChartFractionWidth, c12840n.pieChartFractionWidth) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC12838l getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C12827f0 getPieChart() {
        return this.pieChart;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.pieChartContent.hashCode() + ((this.pieChart.hashCode() + ((this.orientation.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.trendCounts), 31, this.biomarkers);
        String str = this.caption;
        return Float.hashCode(this.pieChartFractionWidth) + ((this.style.hashCode() + ((iM31983b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C12816a getPieChartContent() {
        return this.pieChartContent;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getPieChartFractionWidth() {
        return this.pieChartFractionWidth;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC12839m getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: l */
    public final List<C12837k0> m36039l() {
        return this.trendCounts;
    }

    public String toString() {
        String str = this.id;
        EnumC12838l enumC12838l = this.orientation;
        C12827f0 c12827f0 = this.pieChart;
        C12816a c12816a = this.pieChartContent;
        List<C12837k0> list = this.trendCounts;
        List<C0088h> list2 = this.biomarkers;
        String str2 = this.caption;
        EnumC12839m enumC12839m = this.style;
        float f13 = this.pieChartFractionWidth;
        StringBuilder sb4 = new StringBuilder("BiomarkerPieChartSectionViewState(id=");
        sb4.append(str);
        sb4.append(", orientation=");
        sb4.append(enumC12838l);
        sb4.append(", pieChart=");
        sb4.append(c12827f0);
        sb4.append(", pieChartContent=");
        sb4.append(c12816a);
        sb4.append(", trendCounts=");
        AbstractC21702c.m61148s(sb4, list, ", biomarkers=", list2, ", caption=");
        sb4.append(str2);
        sb4.append(", style=");
        sb4.append(enumC12839m);
        sb4.append(", pieChartFractionWidth=");
        return AbstractC30007c.m91837g(f13, ")", sb4);
    }

    public /* synthetic */ C12840n(String str, EnumC12838l enumC12838l, C12827f0 c12827f0, C12816a c12816a, List list, List list2, String str2, EnumC12839m enumC12839m, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC12838l, c12827f0, c12816a, list, (i13 & 32) != 0 ? C25271y.f99162w : list2, str2, enumC12839m, (i13 & 256) != 0 ? 1.0f : f13);
    }
}
