package com.whoop.design.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.whoop.design.models.items.graph.plot.BandPlotModel;
import com.whoop.design.models.items.graph.plot.BarPlotModel;
import com.whoop.design.models.items.graph.plot.CalibratingPlotModel;
import com.whoop.design.models.items.graph.plot.CenterScrubBandPlotModel;
import com.whoop.design.models.items.graph.plot.EmptyPlotModel;
import com.whoop.design.models.items.graph.plot.FinalMarkerPlotModel;
import com.whoop.design.models.items.graph.plot.GraphPlot;
import com.whoop.design.models.items.graph.plot.GridLinePlotModel;
import com.whoop.design.models.items.graph.plot.IconPlotModel;
import com.whoop.design.models.items.graph.plot.LinePlotModel;
import com.whoop.design.models.items.graph.plot.OverlayPlotModel;
import com.whoop.design.models.items.graph.plot.PlotModelType;
import com.whoop.design.models.items.graph.plot.ProgressPlotModel;
import com.whoop.design.models.items.graph.plot.TrendPlotModel;
import com.whoop.design.models.items.graph.plot.UnknownPlotModel;
import com.whoop.design.models.items.graph.plot.VerticalMarkerPlotModel;
import com.whoop.design.models.items.graph.plot.XLabelPlotModel;
import java.lang.reflect.Type;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/json/GraphPlotDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "a", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GraphPlotDeserializer implements JsonDeserializer<GraphPlot> {

    /* JADX INFO: renamed from: com.whoop.design.json.GraphPlotDeserializer$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6726a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25685a;

        static {
            int[] iArr = new int[PlotModelType.values().length];
            try {
                iArr[PlotModelType.BAND_PLOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlotModelType.BAR_PLOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlotModelType.CALIBRATING_PLOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlotModelType.CENTER_SCRUB_BAND_PLOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlotModelType.EMPTY_PLOT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlotModelType.GRID_LINE_PLOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PlotModelType.FINAL_MARKER_PLOT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PlotModelType.ICON_PLOT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PlotModelType.LINE_PLOT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PlotModelType.OVERLAY_PLOT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PlotModelType.PROGRESS_PLOT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PlotModelType.TREND_PLOT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PlotModelType.UNKNOWN_PLOT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PlotModelType.VERTICAL_MARKER_PLOT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PlotModelType.X_LABEL_PLOT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f25685a = iArr;
        }
    }

    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GraphPlot deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        JsonObject asJsonObject = json.getAsJsonObject();
        AbstractC22676k.m65749i(asJsonObject, "getAsJsonObject(...)");
        PlotModelType.Companion companion = PlotModelType.INSTANCE;
        JsonElement jsonElement = asJsonObject.get("type");
        switch (C6726a.f25685a[companion.fromType(jsonElement != null ? jsonElement.getAsString() : null).ordinal()]) {
            case 1:
                Object objDeserialize = context.deserialize(asJsonObject.get("plot"), BandPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize, "deserialize(...)");
                return (GraphPlot) objDeserialize;
            case 2:
                Object objDeserialize2 = context.deserialize(asJsonObject.get("plot"), BarPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize2, "deserialize(...)");
                return (GraphPlot) objDeserialize2;
            case 3:
                Object objDeserialize3 = context.deserialize(asJsonObject.get("plot"), CalibratingPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize3, "deserialize(...)");
                return (GraphPlot) objDeserialize3;
            case 4:
                Object objDeserialize4 = context.deserialize(asJsonObject.get("plot"), CenterScrubBandPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize4, "deserialize(...)");
                return (GraphPlot) objDeserialize4;
            case 5:
                Object objDeserialize5 = context.deserialize(asJsonObject.get("plot"), EmptyPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize5, "deserialize(...)");
                return (GraphPlot) objDeserialize5;
            case 6:
                Object objDeserialize6 = context.deserialize(asJsonObject.get("plot"), GridLinePlotModel.class);
                AbstractC22676k.m65749i(objDeserialize6, "deserialize(...)");
                return (GraphPlot) objDeserialize6;
            case 7:
                Object objDeserialize7 = context.deserialize(asJsonObject.get("plot"), FinalMarkerPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize7, "deserialize(...)");
                return (GraphPlot) objDeserialize7;
            case 8:
                Object objDeserialize8 = context.deserialize(asJsonObject.get("plot"), IconPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize8, "deserialize(...)");
                return (GraphPlot) objDeserialize8;
            case 9:
                Object objDeserialize9 = context.deserialize(asJsonObject.get("plot"), LinePlotModel.class);
                AbstractC22676k.m65749i(objDeserialize9, "deserialize(...)");
                return (GraphPlot) objDeserialize9;
            case 10:
                Object objDeserialize10 = context.deserialize(asJsonObject.get("plot"), OverlayPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize10, "deserialize(...)");
                return (GraphPlot) objDeserialize10;
            case 11:
                Object objDeserialize11 = context.deserialize(asJsonObject.get("plot"), ProgressPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize11, "deserialize(...)");
                return (GraphPlot) objDeserialize11;
            case 12:
                Object objDeserialize12 = context.deserialize(asJsonObject.get("plot"), TrendPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize12, "deserialize(...)");
                return (GraphPlot) objDeserialize12;
            case 13:
                return UnknownPlotModel.INSTANCE;
            case 14:
                Object objDeserialize13 = context.deserialize(asJsonObject.get("plot"), VerticalMarkerPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize13, "deserialize(...)");
                return (GraphPlot) objDeserialize13;
            case 15:
                Object objDeserialize14 = context.deserialize(asJsonObject.get("plot"), XLabelPlotModel.class);
                AbstractC22676k.m65749i(objDeserialize14, "deserialize(...)");
                return (GraphPlot) objDeserialize14;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
