package lf0;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e81.C12827f0;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lf0.t1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b!\u0010*¨\u0006+"}, m65681d2 = {"Llf0/t1;", "Lm91/u;", "", "id", "Le81/f0;", "pieChart", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lgz0/m0;", "subtitleIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Le81/f0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)V", "a", "(Ljava/lang/String;Le81/f0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)Llf0/t1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Le81/f0;", "e", "()Le81/f0;", "c", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "Lgz0/m0;", "f", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23972t1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f94661g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12827f0 pieChart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 subtitleIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f94661g = i13 | i14 | i14 | C12827f0.f43975d;
    }

    public C23972t1(String id4, C12827f0 pieChart, TextResource title, TextResource textResource, EnumC16313m0 enumC16313m0, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pieChart, "pieChart");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.pieChart = pieChart;
        this.title = title;
        this.subtitle = textResource;
        this.subtitleIcon = enumC16313m0;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C23972t1 m70709b(C23972t1 c23972t1, String str, C12827f0 c12827f0, TextResource textResource, TextResource textResource2, EnumC16313m0 enumC16313m0, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c23972t1.id;
        }
        if ((i13 & 2) != 0) {
            c12827f0 = c23972t1.pieChart;
        }
        if ((i13 & 4) != 0) {
            textResource = c23972t1.title;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c23972t1.subtitle;
        }
        if ((i13 & 16) != 0) {
            enumC16313m0 = c23972t1.subtitleIcon;
        }
        if ((i13 & 32) != 0) {
            c9598e = c23972t1.destination;
        }
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        C9598e c9598e2 = c9598e;
        return c23972t1.m70710a(str, c12827f0, textResource, textResource2, enumC16313m1, c9598e2);
    }

    /* JADX INFO: renamed from: a */
    public final C23972t1 m70710a(String id4, C12827f0 pieChart, TextResource title, TextResource subtitle, EnumC16313m0 subtitleIcon, C9598e destination) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pieChart, "pieChart");
        AbstractC22676k.m65750j(title, "title");
        return new C23972t1(id4, pieChart, title, subtitle, subtitleIcon, destination);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C12827f0 getPieChart() {
        return this.pieChart;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23972t1)) {
            return false;
        }
        C23972t1 c23972t1 = (C23972t1) other;
        return AbstractC22676k.m65745e(this.id, c23972t1.id) && AbstractC22676k.m65745e(this.pieChart, c23972t1.pieChart) && AbstractC22676k.m65745e(this.title, c23972t1.title) && AbstractC22676k.m65745e(this.subtitle, c23972t1.subtitle) && this.subtitleIcon == c23972t1.subtitleIcon && AbstractC22676k.m65745e(this.destination, c23972t1.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getSubtitleIcon() {
        return this.subtitleIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a((this.pieChart.hashCode() + (this.id.hashCode() * 31)) * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.subtitleIcon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        C12827f0 c12827f0 = this.pieChart;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.subtitleIcon;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("PromotionalBiomarkerPieChartState(id=");
        sb4.append(str);
        sb4.append(", pieChart=");
        sb4.append(c12827f0);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", subtitle=", textResource2, ", subtitleIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(")");
        return sb4.toString();
    }
}
