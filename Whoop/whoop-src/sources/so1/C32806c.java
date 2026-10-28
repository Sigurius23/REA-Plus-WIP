package so1;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import k71.C22246d;
import m81.C25232g;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import np1.C27033k;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u001fR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00101R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b6\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b4\u0010=R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\b-\u0010?R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\b8\u0010?R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\b'\u0010?R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b.\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u001b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b)\u0010A\u001a\u0004\b@\u0010C¨\u0006D"}, m65681d2 = {"Lso1/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "descriptionDisplay", "subtitleDisplay", "", "Lm81/g;", "buttons", "", "selectedButtonId", "segmentedControlDisplayId", "Lnp1/k;", "segmentedControlDisplays", "Lk71/d;", "legendList", "Lcom/whoop/navigation/e;", "infoButtonDestination", "Lj71/c;", "graphState", "", "Lso1/d0;", "currentCycleGraphs", "lastSixCycleGraphs", "bottomLabels", "", "useInternalGraphSelection", "showSectionTitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;Lj71/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "n", "d", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "l", "f", "j", "g", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lj71/c;", "()Lj71/c;", "Ljava/util/Map;", "()Ljava/util/Map;", "m", "Z", "p", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32806c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitleDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C25232g> buttons;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String selectedButtonId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String segmentedControlDisplayId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C27033k> segmentedControlDisplays;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C22246d> legendList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C9598e infoButtonDestination;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C21395c graphState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Map<String, C32809d0> currentCycleGraphs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Map<String, C32809d0> lastSixCycleGraphs;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Map<String, TextResource> bottomLabels;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean useInternalGraphSelection;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean showSectionTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public C32806c(TextResource titleDisplay, TextResource descriptionDisplay, TextResource textResource, List<C25232g> buttons, String selectedButtonId, String segmentedControlDisplayId, List<C27033k> list, List<C22246d> legendList, C9598e c9598e, C21395c c21395c, Map<String, C32809d0> currentCycleGraphs, Map<String, C32809d0> lastSixCycleGraphs, Map<String, ? extends TextResource> bottomLabels, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(selectedButtonId, "selectedButtonId");
        AbstractC22676k.m65750j(segmentedControlDisplayId, "segmentedControlDisplayId");
        AbstractC22676k.m65750j(legendList, "legendList");
        AbstractC22676k.m65750j(currentCycleGraphs, "currentCycleGraphs");
        AbstractC22676k.m65750j(lastSixCycleGraphs, "lastSixCycleGraphs");
        AbstractC22676k.m65750j(bottomLabels, "bottomLabels");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.subtitleDisplay = textResource;
        this.buttons = buttons;
        this.selectedButtonId = selectedButtonId;
        this.segmentedControlDisplayId = segmentedControlDisplayId;
        this.segmentedControlDisplays = list;
        this.legendList = legendList;
        this.infoButtonDestination = c9598e;
        this.graphState = c21395c;
        this.currentCycleGraphs = currentCycleGraphs;
        this.lastSixCycleGraphs = lastSixCycleGraphs;
        this.bottomLabels = bottomLabels;
        this.useInternalGraphSelection = z4;
        this.showSectionTitle = z13;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, TextResource> m102910a() {
        return this.bottomLabels;
    }

    /* JADX INFO: renamed from: b */
    public final List<C25232g> m102911b() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, C32809d0> m102912c() {
        return this.currentCycleGraphs;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32806c)) {
            return false;
        }
        C32806c c32806c = (C32806c) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c32806c.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c32806c.descriptionDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, c32806c.subtitleDisplay) && AbstractC22676k.m65745e(this.buttons, c32806c.buttons) && AbstractC22676k.m65745e(this.selectedButtonId, c32806c.selectedButtonId) && AbstractC22676k.m65745e(this.segmentedControlDisplayId, c32806c.segmentedControlDisplayId) && AbstractC22676k.m65745e(this.segmentedControlDisplays, c32806c.segmentedControlDisplays) && AbstractC22676k.m65745e(this.legendList, c32806c.legendList) && AbstractC22676k.m65745e(this.infoButtonDestination, c32806c.infoButtonDestination) && AbstractC22676k.m65745e(this.graphState, c32806c.graphState) && AbstractC22676k.m65745e(this.currentCycleGraphs, c32806c.currentCycleGraphs) && AbstractC22676k.m65745e(this.lastSixCycleGraphs, c32806c.lastSixCycleGraphs) && AbstractC22676k.m65745e(this.bottomLabels, c32806c.bottomLabels) && this.useInternalGraphSelection == c32806c.useInternalGraphSelection && this.showSectionTitle == c32806c.showSectionTitle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C21395c getGraphState() {
        return this.graphState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C9598e getInfoButtonDestination() {
        return this.infoButtonDestination;
    }

    /* JADX INFO: renamed from: h */
    public final Map<String, C32809d0> m102916h() {
        return this.lastSixCycleGraphs;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.descriptionDisplay, 31);
        TextResource textResource = this.subtitleDisplay;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.buttons), 31, this.selectedButtonId), 31, this.segmentedControlDisplayId);
        List<C27033k> list = this.segmentedControlDisplays;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (list == null ? 0 : list.hashCode())) * 31, 31, this.legendList);
        C9598e c9598e = this.infoButtonDestination;
        int iHashCode = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        C21395c c21395c = this.graphState;
        return Boolean.hashCode(this.showSectionTitle) + AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.bottomLabels, AbstractC3855a.m11821e(this.lastSixCycleGraphs, AbstractC3855a.m11821e(this.currentCycleGraphs, (iHashCode + (c21395c != null ? c21395c.hashCode() : 0)) * 31, 31), 31), 31), 31, this.useInternalGraphSelection);
    }

    /* JADX INFO: renamed from: i */
    public final List<C22246d> m102917i() {
        return this.legendList;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSegmentedControlDisplayId() {
        return this.segmentedControlDisplayId;
    }

    /* JADX INFO: renamed from: k */
    public final List<C27033k> m102919k() {
        return this.segmentedControlDisplays;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSelectedButtonId() {
        return this.selectedButtonId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowSectionTitle() {
        return this.showSectionTitle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getUseInternalGraphSelection() {
        return this.useInternalGraphSelection;
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.descriptionDisplay;
        TextResource textResource3 = this.subtitleDisplay;
        List<C25232g> list = this.buttons;
        String str = this.selectedButtonId;
        String str2 = this.segmentedControlDisplayId;
        List<C27033k> list2 = this.segmentedControlDisplays;
        List<C22246d> list3 = this.legendList;
        C9598e c9598e = this.infoButtonDestination;
        C21395c c21395c = this.graphState;
        Map<String, C32809d0> map = this.currentCycleGraphs;
        Map<String, C32809d0> map2 = this.lastSixCycleGraphs;
        Map<String, TextResource> map3 = this.bottomLabels;
        boolean z4 = this.useInternalGraphSelection;
        boolean z13 = this.showSectionTitle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CurrentCycleTileViewState(titleDisplay=", textResource, ", descriptionDisplay=", textResource2, ", subtitleDisplay=");
        AbstractC21702c.m61143n(textResource3, ", buttons=", ", selectedButtonId=", sbM106658q, list);
        AbstractC11266d.m30444B(sbM106658q, str, ", segmentedControlDisplayId=", str2, ", segmentedControlDisplays=");
        AbstractC21702c.m61148s(sbM106658q, list2, ", legendList=", list3, ", infoButtonDestination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", graphState=");
        sbM106658q.append(c21395c);
        sbM106658q.append(", currentCycleGraphs=");
        AbstractC3855a.m11840x(sbM106658q, map, ", lastSixCycleGraphs=", map2, ", bottomLabels=");
        sbM106658q.append(map3);
        sbM106658q.append(", useInternalGraphSelection=");
        sbM106658q.append(z4);
        sbM106658q.append(", showSectionTitle=");
        return AbstractC18489d0.m53372m(sbM106658q, z13, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C32806c(TextResource textResource, TextResource textResource2, TextResource textResource3, List list, String str, String str2, List list2, List list3, C9598e c9598e, C21395c c21395c, Map map, Map map2, Map map3, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        C25272z c25272z = C25272z.f99163w;
        this(textResource, textResource2, textResource3, list, str, str2, list2, list3, c9598e, c21395c, i14 != 0 ? c25272z : map, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c25272z : map2, (i13 & 4096) != 0 ? c25272z : map3, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? true : z13);
    }
}
