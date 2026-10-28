package c41;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: c41.i1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJd\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b%\u0010'¨\u0006("}, m65681d2 = {"Lc41/i1;", "Lm91/u;", "", "id", "", "metrics", "legend", "tileLegend", "footer", "Ly3/f;", "footerTopSpacing", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lm91/u;Ljava/util/List;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lm91/u;Ljava/util/List;F)Lc41/i1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "f", "d", "Lm91/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lm91/u;", "e", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4042i1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f16400g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> metrics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> legend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u tileLegend;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<InterfaceC25312u> footer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float footerTopSpacing;

    public /* synthetic */ C4042i1(String str, List list, List list2, InterfaceC25312u interfaceC25312u, List list3, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, interfaceC25312u, list3, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4042i1 m12321b(C4042i1 c4042i1, String str, List list, List list2, InterfaceC25312u interfaceC25312u, List list3, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c4042i1.id;
        }
        if ((i13 & 2) != 0) {
            list = c4042i1.metrics;
        }
        if ((i13 & 4) != 0) {
            list2 = c4042i1.legend;
        }
        if ((i13 & 8) != 0) {
            interfaceC25312u = c4042i1.tileLegend;
        }
        if ((i13 & 16) != 0) {
            list3 = c4042i1.footer;
        }
        if ((i13 & 32) != 0) {
            f13 = c4042i1.footerTopSpacing;
        }
        List list4 = list3;
        float f14 = f13;
        return c4042i1.m12322a(str, list, list2, interfaceC25312u, list4, f14);
    }

    /* JADX INFO: renamed from: a */
    public final C4042i1 m12322a(String id4, List<? extends InterfaceC25312u> metrics, List<? extends InterfaceC25312u> legend, InterfaceC25312u tileLegend, List<? extends InterfaceC25312u> footer, float footerTopSpacing) {
        AbstractC22676k.m65750j(metrics, "metrics");
        AbstractC22676k.m65750j(footer, "footer");
        return new C4042i1(id4, metrics, legend, tileLegend, footer, footerTopSpacing, null);
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m12323c() {
        return this.footer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getFooterTopSpacing() {
        return this.footerTopSpacing;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4042i1)) {
            return false;
        }
        C4042i1 c4042i1 = (C4042i1) other;
        return AbstractC22676k.m65745e(this.id, c4042i1.id) && AbstractC22676k.m65745e(this.metrics, c4042i1.metrics) && AbstractC22676k.m65745e(this.legend, c4042i1.legend) && AbstractC22676k.m65745e(this.tileLegend, c4042i1.tileLegend) && AbstractC22676k.m65745e(this.footer, c4042i1.footer) && C39174f.m124782b(this.footerTopSpacing, c4042i1.footerTopSpacing);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m12325f() {
        return this.legend;
    }

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC25312u> m12326g() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC25312u getTileLegend() {
        return this.tileLegend;
    }

    public int hashCode() {
        String str = this.id;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.metrics);
        List<InterfaceC25312u> list = this.legend;
        int iHashCode = (iM31983b + (list == null ? 0 : list.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.tileLegend;
        return Float.hashCode(this.footerTopSpacing) + AbstractC11895b.m31983b((iHashCode + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0)) * 31, 31, this.footer);
    }

    public String toString() {
        String str = this.id;
        List<InterfaceC25312u> list = this.metrics;
        List<InterfaceC25312u> list2 = this.legend;
        InterfaceC25312u interfaceC25312u = this.tileLegend;
        List<InterfaceC25312u> list3 = this.footer;
        String strM124783c = C39174f.m124783c(this.footerTopSpacing);
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ContributorTileState(id=", str, ", metrics=", ", legend=", list);
        sbM94766o.append(list2);
        sbM94766o.append(", tileLegend=");
        sbM94766o.append(interfaceC25312u);
        sbM94766o.append(", footer=");
        return AbstractC38963t7.m124377g(", footerTopSpacing=", strM124783c, ")", sbM94766o, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C4042i1(String str, List<? extends InterfaceC25312u> metrics, List<? extends InterfaceC25312u> list, InterfaceC25312u interfaceC25312u, List<? extends InterfaceC25312u> footer, float f13) {
        AbstractC22676k.m65750j(metrics, "metrics");
        AbstractC22676k.m65750j(footer, "footer");
        this.id = str;
        this.metrics = metrics;
        this.legend = list;
        this.tileLegend = interfaceC25312u;
        this.footer = footer;
        this.footerTopSpacing = f13;
    }

    public C4042i1(String str, List list, List list2, InterfaceC25312u interfaceC25312u, List list3, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, list, (i13 & 4) != 0 ? null : list2, (i13 & 8) != 0 ? null : interfaceC25312u, list3, (i13 & 32) != 0 ? ((float) 4.5d) * 4 : f13, null);
    }
}
