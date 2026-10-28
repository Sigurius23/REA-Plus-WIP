package com.whoop.design.models.items.graph;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.plane.GraphAccessibilityModel;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel;
import com.whoop.design.models.items.graph.plot.GraphPlot;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import o91.C27688e;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B[\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*JR\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010*¨\u0006C"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ZoomableGraphModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;", "plane", "", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "plots", "", "scrollWidthMultiplier", "Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;", "zoomLevel", "Lcom/whoop/design/models/items/graph/ZoomToggleModel;", "zoomToggle", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;", "component3", "()Ljava/util/List;", "component4", "()D", "component5", "()Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;", "component6", "()Lcom/whoop/design/models/items/graph/ZoomToggleModel;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Ljava/util/List;DLcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lcom/whoop/design/models/items/graph/ZoomToggleModel;)Lcom/whoop/design/models/items/graph/ZoomableGraphModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;", "getPlane", "Ljava/util/List;", "getPlots", "D", "getScrollWidthMultiplier", "Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;", "getZoomLevel", "Lcom/whoop/design/models/items/graph/ZoomToggleModel;", "getZoomToggle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ZoomableGraphModel implements DesignSystemModel {
    private final String id;
    private final ScrollableGraphPlaneModel plane;
    private final List<GraphPlot> plots;
    private final double scrollWidthMultiplier;
    private final ZoomableGraphZoomLevelModel zoomLevel;
    private final ZoomToggleModel zoomToggle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(2)), null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ZoomableGraphModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/ZoomableGraphModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ZoomableGraphModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ZoomableGraphModel() {
        this((String) null, (ScrollableGraphPlaneModel) null, (List) null, 0.0d, (ZoomableGraphZoomLevelModel) null, (ZoomToggleModel) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(C27688e.f111459a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoomableGraphModel copy$default(ZoomableGraphModel zoomableGraphModel, String str, ScrollableGraphPlaneModel scrollableGraphPlaneModel, List list, double d3, ZoomableGraphZoomLevelModel zoomableGraphZoomLevelModel, ZoomToggleModel zoomToggleModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = zoomableGraphModel.id;
        }
        if ((i13 & 2) != 0) {
            scrollableGraphPlaneModel = zoomableGraphModel.plane;
        }
        if ((i13 & 4) != 0) {
            list = zoomableGraphModel.plots;
        }
        if ((i13 & 8) != 0) {
            d3 = zoomableGraphModel.scrollWidthMultiplier;
        }
        if ((i13 & 16) != 0) {
            zoomableGraphZoomLevelModel = zoomableGraphModel.zoomLevel;
        }
        if ((i13 & 32) != 0) {
            zoomToggleModel = zoomableGraphModel.zoomToggle;
        }
        double d14 = d3;
        List list2 = list;
        return zoomableGraphModel.copy(str, scrollableGraphPlaneModel, list2, d14, zoomableGraphZoomLevelModel, zoomToggleModel);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    public static final /* synthetic */ void write$Self$design_models_release(ZoomableGraphModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "zoomablegraph")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeSerializableElement(serialDesc, 1, ScrollableGraphPlaneModel$$serializer.INSTANCE, self.plane);
        } else {
            if (!AbstractC22676k.m65745e(self.plane, new ScrollableGraphPlaneModel((GraphAxisModel) null, (GraphAccessibilityModel) null, false, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 1, ScrollableGraphPlaneModel$$serializer.INSTANCE, self.plane);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.plots, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.plots);
        }
        int i13 = 3;
        if (output.shouldEncodeElementDefault(serialDesc, 3) || Double.compare(self.scrollWidthMultiplier, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 3, self.scrollWidthMultiplier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4)) {
            output.encodeSerializableElement(serialDesc, 4, ZoomableGraphZoomLevelModel$$serializer.INSTANCE, self.zoomLevel);
        } else {
            if (!AbstractC22676k.m65745e(self.zoomLevel, new ZoomableGraphZoomLevelModel(0.0f, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 4, ZoomableGraphZoomLevelModel$$serializer.INSTANCE, self.zoomLevel);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5)) {
            float f13 = 0.0f;
            if (AbstractC22676k.m65745e(self.zoomToggle, new ZoomToggleModel(f13, f13, i13, (DefaultConstructorMarker) null))) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 5, ZoomToggleModel$$serializer.INSTANCE, self.zoomToggle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScrollableGraphPlaneModel getPlane() {
        return this.plane;
    }

    public final List<GraphPlot> component3() {
        return this.plots;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getScrollWidthMultiplier() {
        return this.scrollWidthMultiplier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ZoomableGraphZoomLevelModel getZoomLevel() {
        return this.zoomLevel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ZoomToggleModel getZoomToggle() {
        return this.zoomToggle;
    }

    public final ZoomableGraphModel copy(String id4, ScrollableGraphPlaneModel plane, List<? extends GraphPlot> plots, double scrollWidthMultiplier, ZoomableGraphZoomLevelModel zoomLevel, ZoomToggleModel zoomToggle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(plane, "plane");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(zoomLevel, "zoomLevel");
        AbstractC22676k.m65750j(zoomToggle, "zoomToggle");
        return new ZoomableGraphModel(id4, plane, plots, scrollWidthMultiplier, zoomLevel, zoomToggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZoomableGraphModel)) {
            return false;
        }
        ZoomableGraphModel zoomableGraphModel = (ZoomableGraphModel) other;
        return AbstractC22676k.m65745e(this.id, zoomableGraphModel.id) && AbstractC22676k.m65745e(this.plane, zoomableGraphModel.plane) && AbstractC22676k.m65745e(this.plots, zoomableGraphModel.plots) && Double.compare(this.scrollWidthMultiplier, zoomableGraphModel.scrollWidthMultiplier) == 0 && AbstractC22676k.m65745e(this.zoomLevel, zoomableGraphModel.zoomLevel) && AbstractC22676k.m65745e(this.zoomToggle, zoomableGraphModel.zoomToggle);
    }

    public final String getId() {
        return this.id;
    }

    public final ScrollableGraphPlaneModel getPlane() {
        return this.plane;
    }

    public final List<GraphPlot> getPlots() {
        return this.plots;
    }

    public final double getScrollWidthMultiplier() {
        return this.scrollWidthMultiplier;
    }

    public final ZoomableGraphZoomLevelModel getZoomLevel() {
        return this.zoomLevel;
    }

    public final ZoomToggleModel getZoomToggle() {
        return this.zoomToggle;
    }

    public int hashCode() {
        return this.zoomToggle.hashCode() + ((this.zoomLevel.hashCode() + AbstractC17176i.m48499a(AbstractC11895b.m31983b((this.plane.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.plots), 31, this.scrollWidthMultiplier)) * 31);
    }

    public String toString() {
        return "ZoomableGraphModel(id=" + this.id + ", plane=" + this.plane + ", plots=" + this.plots + ", scrollWidthMultiplier=" + this.scrollWidthMultiplier + ", zoomLevel=" + this.zoomLevel + ", zoomToggle=" + this.zoomToggle + ")";
    }

    public /* synthetic */ ZoomableGraphModel(int i13, String str, ScrollableGraphPlaneModel scrollableGraphPlaneModel, List list, double d3, ZoomableGraphZoomLevelModel zoomableGraphZoomLevelModel, ZoomToggleModel zoomToggleModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? "zoomablegraph" : str;
        if ((i13 & 2) == 0) {
            this.plane = new ScrollableGraphPlaneModel((GraphAxisModel) null, (GraphAccessibilityModel) null, false, 7, (DefaultConstructorMarker) null);
        } else {
            this.plane = scrollableGraphPlaneModel;
        }
        if ((i13 & 4) == 0) {
            this.plots = C25271y.f99162w;
        } else {
            this.plots = list;
        }
        if ((i13 & 8) == 0) {
            this.scrollWidthMultiplier = 1.0d;
        } else {
            this.scrollWidthMultiplier = d3;
        }
        if ((i13 & 16) == 0) {
            this.zoomLevel = new ZoomableGraphZoomLevelModel(0.0f, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null);
        } else {
            this.zoomLevel = zoomableGraphZoomLevelModel;
        }
        if ((i13 & 32) != 0) {
            this.zoomToggle = zoomToggleModel;
        } else {
            float f13 = 0.0f;
            this.zoomToggle = new ZoomToggleModel(f13, f13, 3, (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomableGraphModel(String id4, ScrollableGraphPlaneModel plane, List<? extends GraphPlot> plots, double d3, ZoomableGraphZoomLevelModel zoomLevel, ZoomToggleModel zoomToggle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(plane, "plane");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(zoomLevel, "zoomLevel");
        AbstractC22676k.m65750j(zoomToggle, "zoomToggle");
        this.id = id4;
        this.plane = plane;
        this.plots = plots;
        this.scrollWidthMultiplier = d3;
        this.zoomLevel = zoomLevel;
        this.zoomToggle = zoomToggle;
    }

    public /* synthetic */ ZoomableGraphModel(String str, ScrollableGraphPlaneModel scrollableGraphPlaneModel, List list, double d3, ZoomableGraphZoomLevelModel zoomableGraphZoomLevelModel, ZoomToggleModel zoomToggleModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "zoomablegraph" : str;
        scrollableGraphPlaneModel = (i13 & 2) != 0 ? new ScrollableGraphPlaneModel((GraphAxisModel) null, (GraphAccessibilityModel) null, false, 7, (DefaultConstructorMarker) null) : scrollableGraphPlaneModel;
        list = (i13 & 4) != 0 ? C25271y.f99162w : list;
        d3 = (i13 & 8) != 0 ? 1.0d : d3;
        zoomableGraphZoomLevelModel = (i13 & 16) != 0 ? new ZoomableGraphZoomLevelModel(0.0f, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null) : zoomableGraphZoomLevelModel;
        if ((i13 & 32) != 0) {
            float f13 = 0.0f;
            zoomToggleModel = new ZoomToggleModel(f13, f13, 3, (DefaultConstructorMarker) null);
        }
        this(str, scrollableGraphPlaneModel, list, d3, zoomableGraphZoomLevelModel, zoomToggleModel);
    }
}
