package com.whoop.core.details.network.model.recoveryv2;

import com.whoop.core.details.network.model.GraphTitleBar;
import com.whoop.core.details.network.model.GraphTitleBar$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;", "", "", "graphId", "Lcom/whoop/design/models/items/graph/GraphModel;", "graphResponse", "Lcom/whoop/core/details/network/model/GraphTitleBar;", "graphTitleBar", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/GraphTitleBar;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/GraphTitleBar;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component3", "()Lcom/whoop/core/details/network/model/GraphTitleBar;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/GraphTitleBar;)Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGraphId", "getGraphId$annotations", "()V", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraphResponse", "Lcom/whoop/core/details/network/model/GraphTitleBar;", "getGraphTitleBar", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphListItemModel {
    private final String graphId;
    private final GraphModel graphResponse;
    private final GraphTitleBar graphTitleBar;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GraphModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphListItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GraphListItemModel(int i13, String str, GraphModel graphModel, GraphTitleBar graphTitleBar, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, GraphListItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.graphId = str;
        this.graphResponse = graphModel;
        this.graphTitleBar = graphTitleBar;
    }

    public static /* synthetic */ GraphListItemModel copy$default(GraphListItemModel graphListItemModel, String str, GraphModel graphModel, GraphTitleBar graphTitleBar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = graphListItemModel.graphId;
        }
        if ((i13 & 2) != 0) {
            graphModel = graphListItemModel.graphResponse;
        }
        if ((i13 & 4) != 0) {
            graphTitleBar = graphListItemModel.graphTitleBar;
        }
        return graphListItemModel.copy(str, graphModel, graphTitleBar);
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getGraphId$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_details_release(GraphListItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.graphId);
        output.encodeSerializableElement(serialDesc, 1, GraphModel$$serializer.INSTANCE, self.graphResponse);
        output.encodeNullableSerializableElement(serialDesc, 2, GraphTitleBar$$serializer.INSTANCE, self.graphTitleBar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGraphId() {
        return this.graphId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GraphModel getGraphResponse() {
        return this.graphResponse;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GraphTitleBar getGraphTitleBar() {
        return this.graphTitleBar;
    }

    public final GraphListItemModel copy(String graphId, GraphModel graphResponse, GraphTitleBar graphTitleBar) {
        AbstractC22676k.m65750j(graphId, "graphId");
        AbstractC22676k.m65750j(graphResponse, "graphResponse");
        return new GraphListItemModel(graphId, graphResponse, graphTitleBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphListItemModel)) {
            return false;
        }
        GraphListItemModel graphListItemModel = (GraphListItemModel) other;
        return AbstractC22676k.m65745e(this.graphId, graphListItemModel.graphId) && AbstractC22676k.m65745e(this.graphResponse, graphListItemModel.graphResponse) && AbstractC22676k.m65745e(this.graphTitleBar, graphListItemModel.graphTitleBar);
    }

    public final String getGraphId() {
        return this.graphId;
    }

    public final GraphModel getGraphResponse() {
        return this.graphResponse;
    }

    public final GraphTitleBar getGraphTitleBar() {
        return this.graphTitleBar;
    }

    public int hashCode() {
        int iHashCode = (this.graphResponse.hashCode() + (this.graphId.hashCode() * 31)) * 31;
        GraphTitleBar graphTitleBar = this.graphTitleBar;
        return iHashCode + (graphTitleBar == null ? 0 : graphTitleBar.hashCode());
    }

    public String toString() {
        return "GraphListItemModel(graphId=" + this.graphId + ", graphResponse=" + this.graphResponse + ", graphTitleBar=" + this.graphTitleBar + ")";
    }

    public GraphListItemModel(String graphId, GraphModel graphResponse, GraphTitleBar graphTitleBar) {
        AbstractC22676k.m65750j(graphId, "graphId");
        AbstractC22676k.m65750j(graphResponse, "graphResponse");
        this.graphId = graphId;
        this.graphResponse = graphResponse;
        this.graphTitleBar = graphTitleBar;
    }
}
