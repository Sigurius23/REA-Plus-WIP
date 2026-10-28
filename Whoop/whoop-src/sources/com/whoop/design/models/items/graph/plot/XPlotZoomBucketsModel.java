package com.whoop.design.models.items.graph.plot;

import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel;
import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import na1.C26511a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/XPlotZoomBucketsModel;", "", "", "zoomThreshold", "", "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;", "axisLabels", "<init>", "(DLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/XPlotZoomBucketsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Ljava/util/List;", "copy", "(DLjava/util/List;)Lcom/whoop/design/models/items/graph/plot/XPlotZoomBucketsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getZoomThreshold", "Ljava/util/List;", "getAxisLabels", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class XPlotZoomBucketsModel {
    private final List<AxisLabelModel> axisLabels;
    private final double zoomThreshold;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26511a(15))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/XPlotZoomBucketsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/XPlotZoomBucketsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return XPlotZoomBucketsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public XPlotZoomBucketsModel() {
        this(0.0d, (List) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AxisLabelModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ XPlotZoomBucketsModel copy$default(XPlotZoomBucketsModel xPlotZoomBucketsModel, double d3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = xPlotZoomBucketsModel.zoomThreshold;
        }
        if ((i13 & 2) != 0) {
            list = xPlotZoomBucketsModel.axisLabels;
        }
        return xPlotZoomBucketsModel.copy(d3, list);
    }

    public static final /* synthetic */ void write$Self$design_models_release(XPlotZoomBucketsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Double.compare(self.zoomThreshold, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 0, self.zoomThreshold);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.axisLabels, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.axisLabels);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getZoomThreshold() {
        return this.zoomThreshold;
    }

    public final List<AxisLabelModel> component2() {
        return this.axisLabels;
    }

    public final XPlotZoomBucketsModel copy(double zoomThreshold, List<AxisLabelModel> axisLabels) {
        AbstractC22676k.m65750j(axisLabels, "axisLabels");
        return new XPlotZoomBucketsModel(zoomThreshold, axisLabels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XPlotZoomBucketsModel)) {
            return false;
        }
        XPlotZoomBucketsModel xPlotZoomBucketsModel = (XPlotZoomBucketsModel) other;
        return Double.compare(this.zoomThreshold, xPlotZoomBucketsModel.zoomThreshold) == 0 && AbstractC22676k.m65745e(this.axisLabels, xPlotZoomBucketsModel.axisLabels);
    }

    public final List<AxisLabelModel> getAxisLabels() {
        return this.axisLabels;
    }

    public final double getZoomThreshold() {
        return this.zoomThreshold;
    }

    public int hashCode() {
        return this.axisLabels.hashCode() + (Double.hashCode(this.zoomThreshold) * 31);
    }

    public String toString() {
        return "XPlotZoomBucketsModel(zoomThreshold=" + this.zoomThreshold + ", axisLabels=" + this.axisLabels + ")";
    }

    public XPlotZoomBucketsModel(double d3, List<AxisLabelModel> axisLabels) {
        AbstractC22676k.m65750j(axisLabels, "axisLabels");
        this.zoomThreshold = d3;
        this.axisLabels = axisLabels;
    }

    public /* synthetic */ XPlotZoomBucketsModel(int i13, double d3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.zoomThreshold = (i13 & 1) == 0 ? 1.0d : d3;
        if ((i13 & 2) == 0) {
            this.axisLabels = C25271y.f99162w;
        } else {
            this.axisLabels = list;
        }
    }

    public /* synthetic */ XPlotZoomBucketsModel(double d3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1.0d : d3, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
