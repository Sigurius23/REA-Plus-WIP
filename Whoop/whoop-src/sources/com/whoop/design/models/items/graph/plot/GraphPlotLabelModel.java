package com.whoop.design.models.items.graph.plot;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "", "", "label", "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;", "labelStyle", "", "renderedBelow", "showBackgroundGradient", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZ)Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;", "getLabelStyle", "Z", "getRenderedBelow", "getShowBackgroundGradient", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphPlotLabelModel {
    public static final int $stable = 0;
    private final String label;
    private final GraphPlotLabelStyle labelStyle;
    private final boolean renderedBelow;
    private final boolean showBackgroundGradient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25371a(3)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphPlotLabelModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GraphPlotLabelModel(int i13, String str, GraphPlotLabelStyle graphPlotLabelStyle, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, GraphPlotLabelModel$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.labelStyle = graphPlotLabelStyle;
        this.renderedBelow = z4;
        this.showBackgroundGradient = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.GraphPlotLabelStyle", GraphPlotLabelStyle.values());
    }

    public static /* synthetic */ GraphPlotLabelModel copy$default(GraphPlotLabelModel graphPlotLabelModel, String str, GraphPlotLabelStyle graphPlotLabelStyle, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = graphPlotLabelModel.label;
        }
        if ((i13 & 2) != 0) {
            graphPlotLabelStyle = graphPlotLabelModel.labelStyle;
        }
        if ((i13 & 4) != 0) {
            z4 = graphPlotLabelModel.renderedBelow;
        }
        if ((i13 & 8) != 0) {
            z13 = graphPlotLabelModel.showBackgroundGradient;
        }
        return graphPlotLabelModel.copy(str, graphPlotLabelStyle, z4, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphPlotLabelModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.labelStyle);
        output.encodeBooleanElement(serialDesc, 2, self.renderedBelow);
        output.encodeBooleanElement(serialDesc, 3, self.showBackgroundGradient);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GraphPlotLabelStyle getLabelStyle() {
        return this.labelStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRenderedBelow() {
        return this.renderedBelow;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowBackgroundGradient() {
        return this.showBackgroundGradient;
    }

    public final GraphPlotLabelModel copy(String label, GraphPlotLabelStyle labelStyle, boolean renderedBelow, boolean showBackgroundGradient) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelStyle, "labelStyle");
        return new GraphPlotLabelModel(label, labelStyle, renderedBelow, showBackgroundGradient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphPlotLabelModel)) {
            return false;
        }
        GraphPlotLabelModel graphPlotLabelModel = (GraphPlotLabelModel) other;
        return AbstractC22676k.m65745e(this.label, graphPlotLabelModel.label) && this.labelStyle == graphPlotLabelModel.labelStyle && this.renderedBelow == graphPlotLabelModel.renderedBelow && this.showBackgroundGradient == graphPlotLabelModel.showBackgroundGradient;
    }

    public final String getLabel() {
        return this.label;
    }

    public final GraphPlotLabelStyle getLabelStyle() {
        return this.labelStyle;
    }

    public final boolean getRenderedBelow() {
        return this.renderedBelow;
    }

    public final boolean getShowBackgroundGradient() {
        return this.showBackgroundGradient;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showBackgroundGradient) + AbstractC2875y.m8289b((this.labelStyle.hashCode() + (this.label.hashCode() * 31)) * 31, 31, this.renderedBelow);
    }

    public String toString() {
        String str = this.label;
        GraphPlotLabelStyle graphPlotLabelStyle = this.labelStyle;
        boolean z4 = this.renderedBelow;
        boolean z13 = this.showBackgroundGradient;
        StringBuilder sb4 = new StringBuilder("GraphPlotLabelModel(label=");
        sb4.append(str);
        sb4.append(", labelStyle=");
        sb4.append(graphPlotLabelStyle);
        sb4.append(", renderedBelow=");
        return AbstractC36095b.m114682j(sb4, z4, ", showBackgroundGradient=", z13, ")");
    }

    public GraphPlotLabelModel(String label, GraphPlotLabelStyle labelStyle, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelStyle, "labelStyle");
        this.label = label;
        this.labelStyle = labelStyle;
        this.renderedBelow = z4;
        this.showBackgroundGradient = z13;
    }
}
