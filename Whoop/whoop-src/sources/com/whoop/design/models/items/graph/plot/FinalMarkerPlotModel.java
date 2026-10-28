package com.whoop.design.models.items.graph.plot;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"JJ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b5\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "", "id", "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;", "markerLine", "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;", "markerPoint", "", "hideWhileScrubbing", "skipScrubbing", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;", "component3", "()Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;", "getMarkerLine", "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;", "getMarkerPoint", "Ljava/lang/Boolean;", "getHideWhileScrubbing", "getSkipScrubbing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FinalMarkerPlotModel extends GraphPlot {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean hideWhileScrubbing;
    private final String id;
    private final FinalMarkerPlotLineModel markerLine;
    private final FinalMarkerPlotPointModel markerPoint;
    private final Boolean skipScrubbing;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FinalMarkerPlotModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FinalMarkerPlotModel() {
        this((String) null, (FinalMarkerPlotLineModel) null, (FinalMarkerPlotPointModel) null, (Boolean) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FinalMarkerPlotModel copy$default(FinalMarkerPlotModel finalMarkerPlotModel, String str, FinalMarkerPlotLineModel finalMarkerPlotLineModel, FinalMarkerPlotPointModel finalMarkerPlotPointModel, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = finalMarkerPlotModel.id;
        }
        if ((i13 & 2) != 0) {
            finalMarkerPlotLineModel = finalMarkerPlotModel.markerLine;
        }
        if ((i13 & 4) != 0) {
            finalMarkerPlotPointModel = finalMarkerPlotModel.markerPoint;
        }
        if ((i13 & 8) != 0) {
            bool = finalMarkerPlotModel.hideWhileScrubbing;
        }
        if ((i13 & 16) != 0) {
            bool2 = finalMarkerPlotModel.skipScrubbing;
        }
        Boolean bool3 = bool2;
        FinalMarkerPlotPointModel finalMarkerPlotPointModel2 = finalMarkerPlotPointModel;
        return finalMarkerPlotModel.copy(str, finalMarkerPlotLineModel, finalMarkerPlotPointModel2, bool, bool3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FinalMarkerPlotModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.markerLine, new FinalMarkerPlotLineModel(null, ""))) {
            output.encodeSerializableElement(serialDesc, 1, FinalMarkerPlotLineModel$$serializer.INSTANCE, self.markerLine);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.markerPoint != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FinalMarkerPlotPointModel$$serializer.INSTANCE, self.markerPoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getHideWhileScrubbing() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.getHideWhileScrubbing());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.getSkipScrubbing() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.getSkipScrubbing());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FinalMarkerPlotLineModel getMarkerLine() {
        return this.markerLine;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FinalMarkerPlotPointModel getMarkerPoint() {
        return this.markerPoint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public final FinalMarkerPlotModel copy(String id4, FinalMarkerPlotLineModel markerLine, FinalMarkerPlotPointModel markerPoint, Boolean hideWhileScrubbing, Boolean skipScrubbing) {
        AbstractC22676k.m65750j(markerLine, "markerLine");
        return new FinalMarkerPlotModel(id4, markerLine, markerPoint, hideWhileScrubbing, skipScrubbing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalMarkerPlotModel)) {
            return false;
        }
        FinalMarkerPlotModel finalMarkerPlotModel = (FinalMarkerPlotModel) other;
        return AbstractC22676k.m65745e(this.id, finalMarkerPlotModel.id) && AbstractC22676k.m65745e(this.markerLine, finalMarkerPlotModel.markerLine) && AbstractC22676k.m65745e(this.markerPoint, finalMarkerPlotModel.markerPoint) && AbstractC22676k.m65745e(this.hideWhileScrubbing, finalMarkerPlotModel.hideWhileScrubbing) && AbstractC22676k.m65745e(this.skipScrubbing, finalMarkerPlotModel.skipScrubbing);
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    public final String getId() {
        return this.id;
    }

    public final FinalMarkerPlotLineModel getMarkerLine() {
        return this.markerLine;
    }

    public final FinalMarkerPlotPointModel getMarkerPoint() {
        return this.markerPoint;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (this.markerLine.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        FinalMarkerPlotPointModel finalMarkerPlotPointModel = this.markerPoint;
        int iHashCode2 = (iHashCode + (finalMarkerPlotPointModel == null ? 0 : finalMarkerPlotPointModel.hashCode())) * 31;
        Boolean bool = this.hideWhileScrubbing;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skipScrubbing;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        FinalMarkerPlotLineModel finalMarkerPlotLineModel = this.markerLine;
        FinalMarkerPlotPointModel finalMarkerPlotPointModel = this.markerPoint;
        Boolean bool = this.hideWhileScrubbing;
        Boolean bool2 = this.skipScrubbing;
        StringBuilder sb4 = new StringBuilder("FinalMarkerPlotModel(id=");
        sb4.append(str);
        sb4.append(", markerLine=");
        sb4.append(finalMarkerPlotLineModel);
        sb4.append(", markerPoint=");
        sb4.append(finalMarkerPlotPointModel);
        sb4.append(", hideWhileScrubbing=");
        sb4.append(bool);
        sb4.append(", skipScrubbing=");
        return AbstractC11478a.m30858j(sb4, bool2, ")");
    }

    public /* synthetic */ FinalMarkerPlotModel(int i13, String str, FinalMarkerPlotLineModel finalMarkerPlotLineModel, FinalMarkerPlotPointModel finalMarkerPlotPointModel, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.markerLine = new FinalMarkerPlotLineModel(null, "");
        } else {
            this.markerLine = finalMarkerPlotLineModel;
        }
        if ((i13 & 4) == 0) {
            this.markerPoint = null;
        } else {
            this.markerPoint = finalMarkerPlotPointModel;
        }
        if ((i13 & 8) == 0) {
            this.hideWhileScrubbing = null;
        } else {
            this.hideWhileScrubbing = bool;
        }
        if ((i13 & 16) == 0) {
            this.skipScrubbing = null;
        } else {
            this.skipScrubbing = bool2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinalMarkerPlotModel(String str, FinalMarkerPlotLineModel markerLine, FinalMarkerPlotPointModel finalMarkerPlotPointModel, Boolean bool, Boolean bool2) {
        super(null);
        AbstractC22676k.m65750j(markerLine, "markerLine");
        this.id = str;
        this.markerLine = markerLine;
        this.markerPoint = finalMarkerPlotPointModel;
        this.hideWhileScrubbing = bool;
        this.skipScrubbing = bool2;
    }

    public /* synthetic */ FinalMarkerPlotModel(String str, FinalMarkerPlotLineModel finalMarkerPlotLineModel, FinalMarkerPlotPointModel finalMarkerPlotPointModel, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? new FinalMarkerPlotLineModel(null, "") : finalMarkerPlotLineModel, (i13 & 4) != 0 ? null : finalMarkerPlotPointModel, (i13 & 8) != 0 ? null : bool, (i13 & 16) != 0 ? null : bool2);
    }
}
