package com.whoop.design.models.items.graph.plane;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.items.graph.plane.annotations.GraphAnnotationModel;
import com.whoop.design.models.items.graph.plane.annotations.GraphAnnotationModel$$serializer;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel$$serializer;
import com.whoop.design.models.items.graph.plane.line.GraphLineModel;
import com.whoop.design.models.items.graph.plane.line.GraphLineModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15621b;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBa\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fBm\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJj\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010\u001bR\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00108\u0012\u0004\b?\u0010;\u001a\u0004\b>\u0010\u001bR\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010\u001b¨\u0006D"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "", "", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;", "lines", "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;", "annotations", "Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;", "accessibilityInfo", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "startYAxis", "endYAxis", "bottomXAxis", "topXAxis", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;", "component4", "()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/List;", "getLines", "getAnnotations", "Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;", "getAccessibilityInfo", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "getStartYAxis", "getStartYAxis$annotations", "()V", "getEndYAxis", "getEndYAxis$annotations", "getBottomXAxis", "getBottomXAxis$annotations", "getTopXAxis", "getTopXAxis$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphPlaneModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final GraphAccessibilityModel accessibilityInfo;
    private final List<GraphAnnotationModel> annotations;

    @SerializedName("bottom_xaxis")
    private final GraphAxisModel bottomXAxis;

    @SerializedName("end_yaxis")
    private final GraphAxisModel endYAxis;
    private final List<GraphLineModel> lines;

    @SerializedName("start_yaxis")
    private final GraphAxisModel startYAxis;

    @SerializedName("top_xaxis")
    private final GraphAxisModel topXAxis;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphPlaneModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C15621b(9)), AbstractC30060g.m92087G(enumC23463i, new C15621b(10)), null, null, null, null, null};
    }

    public GraphPlaneModel() {
        this((List) null, (List) null, (GraphAccessibilityModel) null, (GraphAxisModel) null, (GraphAxisModel) null, (GraphAxisModel) null, (GraphAxisModel) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GraphLineModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GraphAnnotationModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphPlaneModel copy$default(GraphPlaneModel graphPlaneModel, List list, List list2, GraphAccessibilityModel graphAccessibilityModel, GraphAxisModel graphAxisModel, GraphAxisModel graphAxisModel2, GraphAxisModel graphAxisModel3, GraphAxisModel graphAxisModel4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = graphPlaneModel.lines;
        }
        if ((i13 & 2) != 0) {
            list2 = graphPlaneModel.annotations;
        }
        if ((i13 & 4) != 0) {
            graphAccessibilityModel = graphPlaneModel.accessibilityInfo;
        }
        if ((i13 & 8) != 0) {
            graphAxisModel = graphPlaneModel.startYAxis;
        }
        if ((i13 & 16) != 0) {
            graphAxisModel2 = graphPlaneModel.endYAxis;
        }
        if ((i13 & 32) != 0) {
            graphAxisModel3 = graphPlaneModel.bottomXAxis;
        }
        if ((i13 & 64) != 0) {
            graphAxisModel4 = graphPlaneModel.topXAxis;
        }
        GraphAxisModel graphAxisModel5 = graphAxisModel3;
        GraphAxisModel graphAxisModel6 = graphAxisModel4;
        GraphAxisModel graphAxisModel7 = graphAxisModel2;
        GraphAccessibilityModel graphAccessibilityModel2 = graphAccessibilityModel;
        return graphPlaneModel.copy(list, list2, graphAccessibilityModel2, graphAxisModel, graphAxisModel7, graphAxisModel5, graphAxisModel6);
    }

    @InterfaceC37143h("bottom_xaxis")
    public static /* synthetic */ void getBottomXAxis$annotations() {
    }

    @InterfaceC37143h("end_yaxis")
    public static /* synthetic */ void getEndYAxis$annotations() {
    }

    @InterfaceC37143h("start_yaxis")
    public static /* synthetic */ void getStartYAxis$annotations() {
    }

    @InterfaceC37143h("top_xaxis")
    public static /* synthetic */ void getTopXAxis$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$design_models_release(GraphPlaneModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 0);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.lines, c25271y)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.lines);
        }
        int i13 = 1;
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.annotations, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.annotations);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.accessibilityInfo, new GraphAccessibilityModel((String) null, i13, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            output.encodeSerializableElement(serialDesc, 2, GraphAccessibilityModel$$serializer.INSTANCE, self.accessibilityInfo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.startYAxis != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, GraphAxisModel$$serializer.INSTANCE, self.startYAxis);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.endYAxis != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, GraphAxisModel$$serializer.INSTANCE, self.endYAxis);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.bottomXAxis != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, GraphAxisModel$$serializer.INSTANCE, self.bottomXAxis);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.topXAxis == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, GraphAxisModel$$serializer.INSTANCE, self.topXAxis);
    }

    public final List<GraphLineModel> component1() {
        return this.lines;
    }

    public final List<GraphAnnotationModel> component2() {
        return this.annotations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GraphAccessibilityModel getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GraphAxisModel getStartYAxis() {
        return this.startYAxis;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GraphAxisModel getEndYAxis() {
        return this.endYAxis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GraphAxisModel getBottomXAxis() {
        return this.bottomXAxis;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GraphAxisModel getTopXAxis() {
        return this.topXAxis;
    }

    public final GraphPlaneModel copy(List<GraphLineModel> lines, List<GraphAnnotationModel> annotations, GraphAccessibilityModel accessibilityInfo, GraphAxisModel startYAxis, GraphAxisModel endYAxis, GraphAxisModel bottomXAxis, GraphAxisModel topXAxis) {
        AbstractC22676k.m65750j(lines, "lines");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(accessibilityInfo, "accessibilityInfo");
        return new GraphPlaneModel(lines, annotations, accessibilityInfo, startYAxis, endYAxis, bottomXAxis, topXAxis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphPlaneModel)) {
            return false;
        }
        GraphPlaneModel graphPlaneModel = (GraphPlaneModel) other;
        return AbstractC22676k.m65745e(this.lines, graphPlaneModel.lines) && AbstractC22676k.m65745e(this.annotations, graphPlaneModel.annotations) && AbstractC22676k.m65745e(this.accessibilityInfo, graphPlaneModel.accessibilityInfo) && AbstractC22676k.m65745e(this.startYAxis, graphPlaneModel.startYAxis) && AbstractC22676k.m65745e(this.endYAxis, graphPlaneModel.endYAxis) && AbstractC22676k.m65745e(this.bottomXAxis, graphPlaneModel.bottomXAxis) && AbstractC22676k.m65745e(this.topXAxis, graphPlaneModel.topXAxis);
    }

    public final GraphAccessibilityModel getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final List<GraphAnnotationModel> getAnnotations() {
        return this.annotations;
    }

    public final GraphAxisModel getBottomXAxis() {
        return this.bottomXAxis;
    }

    public final GraphAxisModel getEndYAxis() {
        return this.endYAxis;
    }

    public final List<GraphLineModel> getLines() {
        return this.lines;
    }

    public final GraphAxisModel getStartYAxis() {
        return this.startYAxis;
    }

    public final GraphAxisModel getTopXAxis() {
        return this.topXAxis;
    }

    public int hashCode() {
        int iHashCode = (this.accessibilityInfo.hashCode() + AbstractC11895b.m31983b(this.lines.hashCode() * 31, 31, this.annotations)) * 31;
        GraphAxisModel graphAxisModel = this.startYAxis;
        int iHashCode2 = (iHashCode + (graphAxisModel == null ? 0 : graphAxisModel.hashCode())) * 31;
        GraphAxisModel graphAxisModel2 = this.endYAxis;
        int iHashCode3 = (iHashCode2 + (graphAxisModel2 == null ? 0 : graphAxisModel2.hashCode())) * 31;
        GraphAxisModel graphAxisModel3 = this.bottomXAxis;
        int iHashCode4 = (iHashCode3 + (graphAxisModel3 == null ? 0 : graphAxisModel3.hashCode())) * 31;
        GraphAxisModel graphAxisModel4 = this.topXAxis;
        return iHashCode4 + (graphAxisModel4 != null ? graphAxisModel4.hashCode() : 0);
    }

    public String toString() {
        List<GraphLineModel> list = this.lines;
        List<GraphAnnotationModel> list2 = this.annotations;
        GraphAccessibilityModel graphAccessibilityModel = this.accessibilityInfo;
        GraphAxisModel graphAxisModel = this.startYAxis;
        GraphAxisModel graphAxisModel2 = this.endYAxis;
        GraphAxisModel graphAxisModel3 = this.bottomXAxis;
        GraphAxisModel graphAxisModel4 = this.topXAxis;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("GraphPlaneModel(lines=", ", annotations=", list, ", accessibilityInfo=", list2);
        sbM124380j.append(graphAccessibilityModel);
        sbM124380j.append(", startYAxis=");
        sbM124380j.append(graphAxisModel);
        sbM124380j.append(", endYAxis=");
        sbM124380j.append(graphAxisModel2);
        sbM124380j.append(", bottomXAxis=");
        sbM124380j.append(graphAxisModel3);
        sbM124380j.append(", topXAxis=");
        sbM124380j.append(graphAxisModel4);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ GraphPlaneModel(int i13, List list, List list2, GraphAccessibilityModel graphAccessibilityModel, GraphAxisModel graphAxisModel, GraphAxisModel graphAxisModel2, GraphAxisModel graphAxisModel3, GraphAxisModel graphAxisModel4, SerializationConstructorMarker serializationConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.lines = c25271y;
        } else {
            this.lines = list;
        }
        if ((i13 & 2) == 0) {
            this.annotations = c25271y;
        } else {
            this.annotations = list2;
        }
        String str = null;
        Object[] objArr = 0;
        if ((i13 & 4) == 0) {
            this.accessibilityInfo = new GraphAccessibilityModel(str, 1, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.accessibilityInfo = graphAccessibilityModel;
        }
        if ((i13 & 8) == 0) {
            this.startYAxis = null;
        } else {
            this.startYAxis = graphAxisModel;
        }
        if ((i13 & 16) == 0) {
            this.endYAxis = null;
        } else {
            this.endYAxis = graphAxisModel2;
        }
        if ((i13 & 32) == 0) {
            this.bottomXAxis = null;
        } else {
            this.bottomXAxis = graphAxisModel3;
        }
        if ((i13 & 64) == 0) {
            this.topXAxis = null;
        } else {
            this.topXAxis = graphAxisModel4;
        }
    }

    public GraphPlaneModel(List<GraphLineModel> lines, List<GraphAnnotationModel> annotations, GraphAccessibilityModel accessibilityInfo, GraphAxisModel graphAxisModel, GraphAxisModel graphAxisModel2, GraphAxisModel graphAxisModel3, GraphAxisModel graphAxisModel4) {
        AbstractC22676k.m65750j(lines, "lines");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(accessibilityInfo, "accessibilityInfo");
        this.lines = lines;
        this.annotations = annotations;
        this.accessibilityInfo = accessibilityInfo;
        this.startYAxis = graphAxisModel;
        this.endYAxis = graphAxisModel2;
        this.bottomXAxis = graphAxisModel3;
        this.topXAxis = graphAxisModel4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ GraphPlaneModel(List list, List list2, GraphAccessibilityModel graphAccessibilityModel, GraphAxisModel graphAxisModel, GraphAxisModel graphAxisModel2, GraphAxisModel graphAxisModel3, GraphAxisModel graphAxisModel4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, (i13 & 4) != 0 ? new GraphAccessibilityModel((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : graphAccessibilityModel, (i13 & 8) != 0 ? null : graphAxisModel, (i13 & 16) != 0 ? null : graphAxisModel2, (i13 & 32) != 0 ? null : graphAxisModel3, (i13 & 64) != 0 ? null : graphAxisModel4);
    }
}
