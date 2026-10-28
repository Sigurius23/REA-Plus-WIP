package t81;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d61.InterfaceC11732a;
import h71.C16994k;
import h71.C16995l;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.AbstractC21394b;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p181h2.C16618c;
import p181h2.C16620e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: t81.r */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u009e\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b0\u0010:R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b*\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b2\u0010I\u001a\u0004\b8\u0010JR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b<\u0010K\u001a\u0004\b>\u0010\"R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b@\u0010L\u001a\u0004\bB\u0010MR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, m65681d2 = {"Lt81/r;", "Lm91/u;", "Lh71/k;", "planeState", "Lh2/c;", "plotPadding", "", "Lj71/b;", "plots", "Lh2/e;", "initialGraphSize", "Lcom/whoop/design/util/TextResource;", "accessibilityLabel", "", "zoom", "Lt81/s;", "zoomLevel", "Lt81/e;", "zoomToggleState", "", "isAnimating", "Ld61/a;", "initialDataScrubState", "", "initialPlotId", "Lh71/l;", "initialScrollableScrubberState", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;)Lt81/r;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lh71/k;", "i", "()Lh71/k;", "b", "Lh2/c;", "getPlotPadding", "()Lh2/c;", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "d", "J", "f", "()J", "e", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "F", "k", "()F", "g", "Lt81/s;", "l", "()Lt81/s;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lt81/e;", "m", "()Lt81/e;", "Z", "n", "()Z", "Ld61/a;", "()Ld61/a;", "Ljava/lang/String;", "Lh71/l;", "()Lh71/l;", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33612r implements InterfaceC25312u {

    /* JADX INFO: renamed from: n */
    public static final int f140283n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16994k planeState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16618c plotPadding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<AbstractC21394b> plots;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long initialGraphSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource accessibilityLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float zoom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C33613s zoomLevel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C33599e zoomToggleState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isAnimating;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC11732a initialDataScrubState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String initialPlotId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C16995l initialScrollableScrubberState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Object event;

    public /* synthetic */ C33612r(C16994k c16994k, C16618c c16618c, List list, long j7, TextResource textResource, float f13, C33613s c33613s, C33599e c33599e, boolean z4, InterfaceC11732a interfaceC11732a, String str, C16995l c16995l, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16994k, c16618c, list, j7, textResource, f13, c33613s, c33599e, z4, interfaceC11732a, str, c16995l, obj);
    }

    /* JADX INFO: renamed from: a */
    public final C33612r m106189a(C16994k planeState, C16618c plotPadding, List<? extends AbstractC21394b> plots, long initialGraphSize, TextResource accessibilityLabel, float zoom, C33613s zoomLevel, C33599e zoomToggleState, boolean isAnimating, InterfaceC11732a initialDataScrubState, String initialPlotId, C16995l initialScrollableScrubberState, Object event) {
        AbstractC22676k.m65750j(planeState, "planeState");
        AbstractC22676k.m65750j(plotPadding, "plotPadding");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        AbstractC22676k.m65750j(zoomLevel, "zoomLevel");
        AbstractC22676k.m65750j(zoomToggleState, "zoomToggleState");
        AbstractC22676k.m65750j(event, "event");
        return new C33612r(planeState, plotPadding, plots, initialGraphSize, accessibilityLabel, zoom, zoomLevel, zoomToggleState, isAnimating, initialDataScrubState, initialPlotId, initialScrollableScrubberState, event, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC11732a getInitialDataScrubState() {
        return this.initialDataScrubState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33612r)) {
            return false;
        }
        C33612r c33612r = (C33612r) other;
        return AbstractC22676k.m65745e(this.planeState, c33612r.planeState) && AbstractC22676k.m65745e(this.plotPadding, c33612r.plotPadding) && AbstractC22676k.m65745e(this.plots, c33612r.plots) && C16620e.m47210b(this.initialGraphSize, c33612r.initialGraphSize) && AbstractC22676k.m65745e(this.accessibilityLabel, c33612r.accessibilityLabel) && Float.compare(this.zoom, c33612r.zoom) == 0 && AbstractC22676k.m65745e(this.zoomLevel, c33612r.zoomLevel) && AbstractC22676k.m65745e(this.zoomToggleState, c33612r.zoomToggleState) && this.isAnimating == c33612r.isAnimating && AbstractC22676k.m65745e(this.initialDataScrubState, c33612r.initialDataScrubState) && AbstractC22676k.m65745e(this.initialPlotId, c33612r.initialPlotId) && AbstractC22676k.m65745e(this.initialScrollableScrubberState, c33612r.initialScrollableScrubberState) && AbstractC22676k.m65745e(this.event, c33612r.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getInitialGraphSize() {
        return this.initialGraphSize;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInitialPlotId() {
        return this.initialPlotId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C16995l getInitialScrollableScrubberState() {
        return this.initialScrollableScrubberState;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.zoomToggleState.hashCode() + ((this.zoomLevel.hashCode() + AbstractC11266d.m30447a(this.zoom, AbstractC31061c.m95625a(AbstractC11266d.m30451e(AbstractC11895b.m31983b((this.plotPadding.hashCode() + (this.planeState.hashCode() * 31)) * 31, 31, this.plots), this.initialGraphSize, 31), this.accessibilityLabel, 31), 31)) * 31)) * 31, 31, this.isAnimating);
        InterfaceC11732a interfaceC11732a = this.initialDataScrubState;
        int iHashCode = (iM8289b + (interfaceC11732a == null ? 0 : interfaceC11732a.hashCode())) * 31;
        String str = this.initialPlotId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C16995l c16995l = this.initialScrollableScrubberState;
        return this.event.hashCode() + ((iHashCode2 + (c16995l != null ? c16995l.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C16994k getPlaneState() {
        return this.planeState;
    }

    /* JADX INFO: renamed from: j */
    public final List<AbstractC21394b> m106196j() {
        return this.plots;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C33613s getZoomLevel() {
        return this.zoomLevel;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C33599e getZoomToggleState() {
        return this.zoomToggleState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    public String toString() {
        C16994k c16994k = this.planeState;
        C16618c c16618c = this.plotPadding;
        List<AbstractC21394b> list = this.plots;
        String strM47216h = C16620e.m47216h(this.initialGraphSize);
        TextResource textResource = this.accessibilityLabel;
        float f13 = this.zoom;
        C33613s c33613s = this.zoomLevel;
        C33599e c33599e = this.zoomToggleState;
        boolean z4 = this.isAnimating;
        InterfaceC11732a interfaceC11732a = this.initialDataScrubState;
        String str = this.initialPlotId;
        C16995l c16995l = this.initialScrollableScrubberState;
        Object obj = this.event;
        StringBuilder sb4 = new StringBuilder("ZoomableGraphState(planeState=");
        sb4.append(c16994k);
        sb4.append(", plotPadding=");
        sb4.append(c16618c);
        sb4.append(", plots=");
        AbstractC17176i.m48511m(", initialGraphSize=", strM47216h, ", accessibilityLabel=", sb4, list);
        sb4.append(textResource);
        sb4.append(", zoom=");
        sb4.append(f13);
        sb4.append(", zoomLevel=");
        sb4.append(c33613s);
        sb4.append(", zoomToggleState=");
        sb4.append(c33599e);
        sb4.append(", isAnimating=");
        sb4.append(z4);
        sb4.append(", initialDataScrubState=");
        sb4.append(interfaceC11732a);
        sb4.append(", initialPlotId=");
        sb4.append(str);
        sb4.append(", initialScrollableScrubberState=");
        sb4.append(c16995l);
        sb4.append(", event=");
        return AbstractC2875y.m8303p(sb4, ")", obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C33612r(C16994k planeState, C16618c plotPadding, List<? extends AbstractC21394b> plots, long j7, TextResource accessibilityLabel, float f13, C33613s zoomLevel, C33599e zoomToggleState, boolean z4, InterfaceC11732a interfaceC11732a, String str, C16995l c16995l, Object event) {
        AbstractC22676k.m65750j(planeState, "planeState");
        AbstractC22676k.m65750j(plotPadding, "plotPadding");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        AbstractC22676k.m65750j(zoomLevel, "zoomLevel");
        AbstractC22676k.m65750j(zoomToggleState, "zoomToggleState");
        AbstractC22676k.m65750j(event, "event");
        this.planeState = planeState;
        this.plotPadding = plotPadding;
        this.plots = plots;
        this.initialGraphSize = j7;
        this.accessibilityLabel = accessibilityLabel;
        this.zoom = f13;
        this.zoomLevel = zoomLevel;
        this.zoomToggleState = zoomToggleState;
        this.isAnimating = z4;
        this.initialDataScrubState = interfaceC11732a;
        this.initialPlotId = str;
        this.initialScrollableScrubberState = c16995l;
        this.event = event;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C33612r(C16994k c16994k, C16618c c16618c, List list, long j7, TextResource textResource, float f13, C33613s c33613s, C33599e c33599e, boolean z4, InterfaceC11732a interfaceC11732a, String str, C16995l c16995l, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        C33599e c33599e2;
        C16994k c16994k2 = (i13 & 1) != 0 ? new C16994k(null, null, null, false, false, false, 63, null) : c16994k;
        C16618c c16618c2 = (i13 & 2) != 0 ? C16618c.f63938e : c16618c;
        List list2 = (i13 & 4) != 0 ? C25271y.f99162w : list;
        long j13 = (i13 & 8) != 0 ? 0L : j7;
        TextResource textResourceM21267a = (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource;
        float f14 = (i13 & 32) != 0 ? 1.0f : f13;
        C33613s c33613s2 = (i13 & 64) != 0 ? new C33613s(0.0f, 0.0f, 0.0f, 7, null) : c33613s;
        Object[] objArr = 0;
        if ((i13 & 128) != 0) {
            float f15 = 0.0f;
            c33599e2 = new C33599e(f15, f15, 3, objArr == true ? 1 : 0);
        } else {
            c33599e2 = c33599e;
        }
        this(c16994k2, c16618c2, list2, j13, textResourceM21267a, f14, c33613s2, c33599e2, (i13 & 256) != 0 ? false : z4, (i13 & 512) != 0 ? null : interfaceC11732a, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? c16995l : null, (i13 & 4096) != 0 ? C23454a0.f92919a : obj, null);
    }
}
