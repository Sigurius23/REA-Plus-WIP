package lf0;

import c41.C4092p2;
import hy0.C17750h1;
import i11.C17863f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.List;
import k71.C22246d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jr\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b&\u00107\u001a\u0004\b(\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b4\u0010:¨\u0006;"}, m65681d2 = {"Llf0/u;", "Lm91/u;", "Llf0/q;", "metrics", "Li11/f;", "datePicker", "", "isDateSelectorLoading", "Lj71/c;", "graph", "", "Lk71/d;", "legends", "Lhy0/h1;", "basePhaseTag", "Lc41/p2;", "baseInfoCallout", "Llf0/y;", "categoricalBiomarkerDetails", "<init>", "(Llf0/q;Li11/f;ZLj71/c;Ljava/util/List;Lhy0/h1;Lc41/p2;Llf0/y;)V", "a", "(Llf0/q;Li11/f;ZLj71/c;Ljava/util/List;Lhy0/h1;Lc41/p2;Llf0/y;)Llf0/u;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Llf0/q;", "j", "()Llf0/q;", "b", "Li11/f;", "g", "()Li11/f;", "c", "Z", "k", "()Z", "d", "Lj71/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lj71/c;", "e", "Ljava/util/List;", "i", "()Ljava/util/List;", "f", "Lhy0/h1;", "()Lhy0/h1;", "Lc41/p2;", "()Lc41/p2;", "Llf0/y;", "()Llf0/y;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23973u implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23958q metrics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17863f datePicker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isDateSelectorLoading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21395c graph;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C22246d> legends;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17750h1 basePhaseTag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C4092p2 baseInfoCallout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C23985y categoricalBiomarkerDetails;

    public C23973u(C23958q metrics, C17863f c17863f, boolean z4, C21395c c21395c, List<C22246d> list, C17750h1 c17750h1, C4092p2 c4092p2, C23985y c23985y) {
        AbstractC22676k.m65750j(metrics, "metrics");
        this.metrics = metrics;
        this.datePicker = c17863f;
        this.isDateSelectorLoading = z4;
        this.graph = c21395c;
        this.legends = list;
        this.basePhaseTag = c17750h1;
        this.baseInfoCallout = c4092p2;
        this.categoricalBiomarkerDetails = c23985y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C23973u m70716b(C23973u c23973u, C23958q c23958q, C17863f c17863f, boolean z4, C21395c c21395c, List list, C17750h1 c17750h1, C4092p2 c4092p2, C23985y c23985y, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c23958q = c23973u.metrics;
        }
        if ((i13 & 2) != 0) {
            c17863f = c23973u.datePicker;
        }
        if ((i13 & 4) != 0) {
            z4 = c23973u.isDateSelectorLoading;
        }
        if ((i13 & 8) != 0) {
            c21395c = c23973u.graph;
        }
        if ((i13 & 16) != 0) {
            list = c23973u.legends;
        }
        if ((i13 & 32) != 0) {
            c17750h1 = c23973u.basePhaseTag;
        }
        if ((i13 & 64) != 0) {
            c4092p2 = c23973u.baseInfoCallout;
        }
        if ((i13 & 128) != 0) {
            c23985y = c23973u.categoricalBiomarkerDetails;
        }
        C4092p2 c4092p3 = c4092p2;
        C23985y c23985y2 = c23985y;
        List list2 = list;
        C17750h1 c17750h2 = c17750h1;
        return c23973u.m70717a(c23958q, c17863f, z4, c21395c, list2, c17750h2, c4092p3, c23985y2);
    }

    /* JADX INFO: renamed from: a */
    public final C23973u m70717a(C23958q metrics, C17863f datePicker, boolean isDateSelectorLoading, C21395c graph, List<C22246d> legends, C17750h1 basePhaseTag, C4092p2 baseInfoCallout, C23985y categoricalBiomarkerDetails) {
        AbstractC22676k.m65750j(metrics, "metrics");
        return new C23973u(metrics, datePicker, isDateSelectorLoading, graph, legends, basePhaseTag, baseInfoCallout, categoricalBiomarkerDetails);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4092p2 getBaseInfoCallout() {
        return this.baseInfoCallout;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C17750h1 getBasePhaseTag() {
        return this.basePhaseTag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23973u)) {
            return false;
        }
        C23973u c23973u = (C23973u) other;
        return AbstractC22676k.m65745e(this.metrics, c23973u.metrics) && AbstractC22676k.m65745e(this.datePicker, c23973u.datePicker) && this.isDateSelectorLoading == c23973u.isDateSelectorLoading && AbstractC22676k.m65745e(this.graph, c23973u.graph) && AbstractC22676k.m65745e(this.legends, c23973u.legends) && AbstractC22676k.m65745e(this.basePhaseTag, c23973u.basePhaseTag) && AbstractC22676k.m65745e(this.baseInfoCallout, c23973u.baseInfoCallout) && AbstractC22676k.m65745e(this.categoricalBiomarkerDetails, c23973u.categoricalBiomarkerDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C23985y getCategoricalBiomarkerDetails() {
        return this.categoricalBiomarkerDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C17863f getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C21395c getGraph() {
        return this.graph;
    }

    public int hashCode() {
        int iHashCode = this.metrics.hashCode() * 31;
        C17863f c17863f = this.datePicker;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (c17863f == null ? 0 : c17863f.hashCode())) * 31, 31, this.isDateSelectorLoading);
        C21395c c21395c = this.graph;
        int iHashCode2 = (iM8289b + (c21395c == null ? 0 : c21395c.hashCode())) * 31;
        List<C22246d> list = this.legends;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C17750h1 c17750h1 = this.basePhaseTag;
        int iHashCode4 = (iHashCode3 + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
        C4092p2 c4092p2 = this.baseInfoCallout;
        int iHashCode5 = (iHashCode4 + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31;
        C23985y c23985y = this.categoricalBiomarkerDetails;
        return iHashCode5 + (c23985y != null ? c23985y.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List<C22246d> m70723i() {
        return this.legends;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C23958q getMetrics() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsDateSelectorLoading() {
        return this.isDateSelectorLoading;
    }

    public String toString() {
        return "BiomarkerTrendSegmentViewState(metrics=" + this.metrics + ", datePicker=" + this.datePicker + ", isDateSelectorLoading=" + this.isDateSelectorLoading + ", graph=" + this.graph + ", legends=" + this.legends + ", basePhaseTag=" + this.basePhaseTag + ", baseInfoCallout=" + this.baseInfoCallout + ", categoricalBiomarkerDetails=" + this.categoricalBiomarkerDetails + ")";
    }

    public /* synthetic */ C23973u(C23958q c23958q, C17863f c17863f, boolean z4, C21395c c21395c, List list, C17750h1 c17750h1, C4092p2 c4092p2, C23985y c23985y, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c23958q, c17863f, (i13 & 4) != 0 ? false : z4, c21395c, list, c17750h1, (i13 & 64) != 0 ? null : c4092p2, (i13 & 128) != 0 ? null : c23985y);
    }
}
