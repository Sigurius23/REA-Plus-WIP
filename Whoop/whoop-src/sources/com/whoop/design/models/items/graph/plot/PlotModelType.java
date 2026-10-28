package com.whoop.design.models.items.graph.plot;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/PlotModelType;", "", "<init>", "(Ljava/lang/String;I)V", "BAND_PLOT", "BAR_PLOT", "CALIBRATING_PLOT", "CENTER_SCRUB_BAND_PLOT", "EMPTY_PLOT", "GRID_LINE_PLOT", "FINAL_MARKER_PLOT", "ICON_PLOT", "LINE_PLOT", "OVERLAY_PLOT", "PROGRESS_PLOT", "TREND_PLOT", "UNKNOWN_PLOT", "VERTICAL_MARKER_PLOT", "X_LABEL_PLOT", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum PlotModelType {
    BAND_PLOT,
    BAR_PLOT,
    CALIBRATING_PLOT,
    CENTER_SCRUB_BAND_PLOT,
    EMPTY_PLOT,
    GRID_LINE_PLOT,
    FINAL_MARKER_PLOT,
    ICON_PLOT,
    LINE_PLOT,
    OVERLAY_PLOT,
    PROGRESS_PLOT,
    TREND_PLOT,
    UNKNOWN_PLOT,
    VERTICAL_MARKER_PLOT,
    X_LABEL_PLOT;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/PlotModelType$Companion;", "", "<init>", "()V", "fromType", "Lcom/whoop/design/models/items/graph/plot/PlotModelType;", "type", "", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public final PlotModelType fromType(String type) {
            for (PlotModelType plotModelType : PlotModelType.values()) {
                if (AbstractC22676k.m65745e(plotModelType.name(), type)) {
                    if (plotModelType == null) {
                        return PlotModelType.UNKNOWN_PLOT;
                    }
                    return plotModelType;
                }
            }
            plotModelType = null;
            if (plotModelType == null) {
                return PlotModelType.UNKNOWN_PLOT;
            }
            return plotModelType;
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
