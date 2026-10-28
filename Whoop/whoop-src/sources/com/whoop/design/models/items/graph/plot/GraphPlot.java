package com.whoop.design.models.items.graph.plot;

import o91.C27688e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u000f\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "", "<init>", "()V", "hideWhileScrubbing", "", "getHideWhileScrubbing", "()Ljava/lang/Boolean;", "skipScrubbing", "getSkipScrubbing", "Companion", "Lcom/whoop/design/models/items/graph/plot/BandPlotModel;", "Lcom/whoop/design/models/items/graph/plot/BarPlotModel;", "Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;", "Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;", "Lcom/whoop/design/models/items/graph/plot/EmptyPlotModel;", "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;", "Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;", "Lcom/whoop/design/models/items/graph/plot/IconPlotModel;", "Lcom/whoop/design/models/items/graph/plot/LinePlotModel;", "Lcom/whoop/design/models/items/graph/plot/OverlayPlotModel;", "Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;", "Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;", "Lcom/whoop/design/models/items/graph/plot/UnknownPlotModel;", "Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;", "Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C27688e.class)
public abstract class GraphPlot {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/GraphPlot$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return C27688e.f111459a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GraphPlot(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Boolean getHideWhileScrubbing();

    public abstract Boolean getSkipScrubbing();

    private GraphPlot() {
    }
}
