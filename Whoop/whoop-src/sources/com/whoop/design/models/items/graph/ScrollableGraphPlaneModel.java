package com.whoop.design.models.items.graph;

import com.whoop.design.models.items.graph.plane.GraphAccessibilityModel;
import com.whoop.design.models.items.graph.plane.GraphAccessibilityModel$$serializer;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;", "", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "startYaxis", "Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;", "accessibilityInfo", "", "scrubberEnabled", "<init>", "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "component2", "()Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;", "component3", "()Z", "copy", "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Z)Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "getStartYaxis", "Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;", "getAccessibilityInfo", "Z", "getScrubberEnabled", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScrollableGraphPlaneModel {
    private final GraphAccessibilityModel accessibilityInfo;
    private final boolean scrubberEnabled;
    private final GraphAxisModel startYaxis;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScrollableGraphPlaneModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ScrollableGraphPlaneModel() {
        this((GraphAxisModel) null, (GraphAccessibilityModel) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ScrollableGraphPlaneModel copy$default(ScrollableGraphPlaneModel scrollableGraphPlaneModel, GraphAxisModel graphAxisModel, GraphAccessibilityModel graphAccessibilityModel, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            graphAxisModel = scrollableGraphPlaneModel.startYaxis;
        }
        if ((i13 & 2) != 0) {
            graphAccessibilityModel = scrollableGraphPlaneModel.accessibilityInfo;
        }
        if ((i13 & 4) != 0) {
            z4 = scrollableGraphPlaneModel.scrubberEnabled;
        }
        return scrollableGraphPlaneModel.copy(graphAxisModel, graphAccessibilityModel, z4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ScrollableGraphPlaneModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.startYaxis != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, GraphAxisModel$$serializer.INSTANCE, self.startYaxis);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.accessibilityInfo, new GraphAccessibilityModel((String) null, 1, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 1, GraphAccessibilityModel$$serializer.INSTANCE, self.accessibilityInfo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.scrubberEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.scrubberEnabled);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GraphAxisModel getStartYaxis() {
        return this.startYaxis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GraphAccessibilityModel getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getScrubberEnabled() {
        return this.scrubberEnabled;
    }

    public final ScrollableGraphPlaneModel copy(GraphAxisModel startYaxis, GraphAccessibilityModel accessibilityInfo, boolean scrubberEnabled) {
        AbstractC22676k.m65750j(accessibilityInfo, "accessibilityInfo");
        return new ScrollableGraphPlaneModel(startYaxis, accessibilityInfo, scrubberEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableGraphPlaneModel)) {
            return false;
        }
        ScrollableGraphPlaneModel scrollableGraphPlaneModel = (ScrollableGraphPlaneModel) other;
        return AbstractC22676k.m65745e(this.startYaxis, scrollableGraphPlaneModel.startYaxis) && AbstractC22676k.m65745e(this.accessibilityInfo, scrollableGraphPlaneModel.accessibilityInfo) && this.scrubberEnabled == scrollableGraphPlaneModel.scrubberEnabled;
    }

    public final GraphAccessibilityModel getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final boolean getScrubberEnabled() {
        return this.scrubberEnabled;
    }

    public final GraphAxisModel getStartYaxis() {
        return this.startYaxis;
    }

    public int hashCode() {
        GraphAxisModel graphAxisModel = this.startYaxis;
        return Boolean.hashCode(this.scrubberEnabled) + ((this.accessibilityInfo.hashCode() + ((graphAxisModel == null ? 0 : graphAxisModel.hashCode()) * 31)) * 31);
    }

    public String toString() {
        GraphAxisModel graphAxisModel = this.startYaxis;
        GraphAccessibilityModel graphAccessibilityModel = this.accessibilityInfo;
        boolean z4 = this.scrubberEnabled;
        StringBuilder sb4 = new StringBuilder("ScrollableGraphPlaneModel(startYaxis=");
        sb4.append(graphAxisModel);
        sb4.append(", accessibilityInfo=");
        sb4.append(graphAccessibilityModel);
        sb4.append(", scrubberEnabled=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ ScrollableGraphPlaneModel(int i13, GraphAxisModel graphAxisModel, GraphAccessibilityModel graphAccessibilityModel, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.startYaxis = null;
        } else {
            this.startYaxis = graphAxisModel;
        }
        if ((i13 & 2) == 0) {
            this.accessibilityInfo = new GraphAccessibilityModel((String) null, 1, (DefaultConstructorMarker) null);
        } else {
            this.accessibilityInfo = graphAccessibilityModel;
        }
        if ((i13 & 4) == 0) {
            this.scrubberEnabled = false;
        } else {
            this.scrubberEnabled = z4;
        }
    }

    public ScrollableGraphPlaneModel(GraphAxisModel graphAxisModel, GraphAccessibilityModel accessibilityInfo, boolean z4) {
        AbstractC22676k.m65750j(accessibilityInfo, "accessibilityInfo");
        this.startYaxis = graphAxisModel;
        this.accessibilityInfo = accessibilityInfo;
        this.scrubberEnabled = z4;
    }

    public /* synthetic */ ScrollableGraphPlaneModel(GraphAxisModel graphAxisModel, GraphAccessibilityModel graphAccessibilityModel, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : graphAxisModel, (i13 & 2) != 0 ? new GraphAccessibilityModel((String) null, 1, (DefaultConstructorMarker) null) : graphAccessibilityModel, (i13 & 4) != 0 ? false : z4);
    }
}
