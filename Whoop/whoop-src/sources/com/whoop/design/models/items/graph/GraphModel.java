package com.whoop.design.models.items.graph;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.plane.GraphAccessibilityModel;
import com.whoop.design.models.items.graph.plane.GraphPlaneModel;
import com.whoop.design.models.items.graph.plane.GraphPlaneModel$$serializer;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel;
import com.whoop.design.models.items.graph.plane.button.GraphButtons;
import com.whoop.design.models.items.graph.plane.button.GraphButtons$$serializer;
import com.whoop.design.models.items.graph.plot.GraphPlot;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ep0.C13395a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JL\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&¨\u0006="}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "plane", "", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "plots", "", "graphTitleDisplay", "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;", "graphButtons", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "layoutDirection", "<init>", "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/GraphModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;", "component5", "()Lcom/whoop/design/models/items/graph/LayoutDirection;", "copy", "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)Lcom/whoop/design/models/items/graph/GraphModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "getPlane", "Ljava/util/List;", "getPlots", "Ljava/lang/String;", "getGraphTitleDisplay", "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;", "getGraphButtons", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "getLayoutDirection", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final GraphButtons graphButtons;
    private final String graphTitleDisplay;
    private final LayoutDirection layoutDirection;
    private final GraphPlaneModel plane;
    private final List<GraphPlot> plots;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/GraphModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C13395a(21)), null, null, AbstractC30060g.m92087G(enumC23463i, new C13395a(22))};
    }

    public GraphModel() {
        this((GraphPlaneModel) null, (List) null, (String) null, (GraphButtons) null, (LayoutDirection) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(C27688e.f111459a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return LayoutDirection.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphModel copy$default(GraphModel graphModel, GraphPlaneModel graphPlaneModel, List list, String str, GraphButtons graphButtons, LayoutDirection layoutDirection, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            graphPlaneModel = graphModel.plane;
        }
        if ((i13 & 2) != 0) {
            list = graphModel.plots;
        }
        if ((i13 & 4) != 0) {
            str = graphModel.graphTitleDisplay;
        }
        if ((i13 & 8) != 0) {
            graphButtons = graphModel.graphButtons;
        }
        if ((i13 & 16) != 0) {
            layoutDirection = graphModel.layoutDirection;
        }
        LayoutDirection layoutDirection2 = layoutDirection;
        String str2 = str;
        return graphModel.copy(graphPlaneModel, list, str2, graphButtons, layoutDirection2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public static final /* synthetic */ void write$Self$design_models_release(GraphModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, GraphPlaneModel$$serializer.INSTANCE, self.plane);
        } else {
            if (!AbstractC22676k.m65745e(self.plane, new GraphPlaneModel((List) null, (List) null, (GraphAccessibilityModel) null, (GraphAxisModel) null, (GraphAxisModel) null, (GraphAxisModel) null, (GraphAxisModel) null, 127, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 0, GraphPlaneModel$$serializer.INSTANCE, self.plane);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.plots, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.plots);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.graphTitleDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.graphTitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.graphButtons != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, GraphButtons$$serializer.INSTANCE, self.graphButtons);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.layoutDirection == LayoutDirection.LEFT_TO_RIGHT) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.layoutDirection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GraphPlaneModel getPlane() {
        return this.plane;
    }

    public final List<GraphPlot> component2() {
        return this.plots;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGraphTitleDisplay() {
        return this.graphTitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GraphButtons getGraphButtons() {
        return this.graphButtons;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final GraphModel copy(GraphPlaneModel plane, List<? extends GraphPlot> plots, String graphTitleDisplay, GraphButtons graphButtons, LayoutDirection layoutDirection) {
        AbstractC22676k.m65750j(plane, "plane");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        return new GraphModel(plane, plots, graphTitleDisplay, graphButtons, layoutDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphModel)) {
            return false;
        }
        GraphModel graphModel = (GraphModel) other;
        return AbstractC22676k.m65745e(this.plane, graphModel.plane) && AbstractC22676k.m65745e(this.plots, graphModel.plots) && AbstractC22676k.m65745e(this.graphTitleDisplay, graphModel.graphTitleDisplay) && AbstractC22676k.m65745e(this.graphButtons, graphModel.graphButtons) && this.layoutDirection == graphModel.layoutDirection;
    }

    public final GraphButtons getGraphButtons() {
        return this.graphButtons;
    }

    public final String getGraphTitleDisplay() {
        return this.graphTitleDisplay;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final GraphPlaneModel getPlane() {
        return this.plane;
    }

    public final List<GraphPlot> getPlots() {
        return this.plots;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.plane.hashCode() * 31, 31, this.plots);
        String str = this.graphTitleDisplay;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        GraphButtons graphButtons = this.graphButtons;
        return this.layoutDirection.hashCode() + ((iHashCode + (graphButtons != null ? graphButtons.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "GraphModel(plane=" + this.plane + ", plots=" + this.plots + ", graphTitleDisplay=" + this.graphTitleDisplay + ", graphButtons=" + this.graphButtons + ", layoutDirection=" + this.layoutDirection + ")";
    }

    public /* synthetic */ GraphModel(int i13, GraphPlaneModel graphPlaneModel, List list, String str, GraphButtons graphButtons, LayoutDirection layoutDirection, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.plane = new GraphPlaneModel((List) null, (List) null, (GraphAccessibilityModel) null, (GraphAxisModel) null, (GraphAxisModel) null, (GraphAxisModel) null, (GraphAxisModel) null, 127, (DefaultConstructorMarker) null);
        } else {
            this.plane = graphPlaneModel;
        }
        if ((i13 & 2) == 0) {
            this.plots = C25271y.f99162w;
        } else {
            this.plots = list;
        }
        if ((i13 & 4) == 0) {
            this.graphTitleDisplay = null;
        } else {
            this.graphTitleDisplay = str;
        }
        if ((i13 & 8) == 0) {
            this.graphButtons = null;
        } else {
            this.graphButtons = graphButtons;
        }
        this.layoutDirection = (i13 & 16) == 0 ? LayoutDirection.LEFT_TO_RIGHT : layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphModel(GraphPlaneModel plane, List<? extends GraphPlot> plots, String str, GraphButtons graphButtons, LayoutDirection layoutDirection) {
        AbstractC22676k.m65750j(plane, "plane");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        this.plane = plane;
        this.plots = plots;
        this.graphTitleDisplay = str;
        this.graphButtons = graphButtons;
        this.layoutDirection = layoutDirection;
    }

    public /* synthetic */ GraphModel(GraphPlaneModel graphPlaneModel, List list, String str, GraphButtons graphButtons, LayoutDirection layoutDirection, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new GraphPlaneModel((List) null, (List) null, (GraphAccessibilityModel) null, (GraphAxisModel) null, (GraphAxisModel) null, (GraphAxisModel) null, (GraphAxisModel) null, 127, (DefaultConstructorMarker) null) : graphPlaneModel, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : graphButtons, (i13 & 16) != 0 ? LayoutDirection.LEFT_TO_RIGHT : layoutDirection);
    }
}
