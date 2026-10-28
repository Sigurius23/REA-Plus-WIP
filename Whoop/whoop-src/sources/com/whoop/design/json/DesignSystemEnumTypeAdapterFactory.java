package com.whoop.design.json;

import a71.EnumC0521b;
import a71.EnumC0523d;
import androidx.health.platform.client.proto.C1533u;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.whoop.design.atomic.atom.TrendTypeEnum;
import com.whoop.design.atomic.organism.dynamicinformationalimagecard.DynamicInformationalImageCardLayoutState;
import com.whoop.design.atomic.organism.horizontalscrollcontainer.HorizontalScrollBehavior;
import com.whoop.design.models.CircularProgressStyle;
import com.whoop.design.models.DesignSystemEnum;
import com.whoop.design.models.IconGradient;
import com.whoop.design.models.IconSize;
import com.whoop.design.models.InfoCalloutTileItemsAlignment;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.models.ProgressMeterStyle;
import com.whoop.design.models.cards.ButtonCardStyleDtoEnum;
import com.whoop.design.models.items.AlarmStatus;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileCarouselStyleDtoEnum;
import com.whoop.design.models.items.ArticleTileModelEventEnum;
import com.whoop.design.models.items.ArticleTileTypeDtoEnum;
import com.whoop.design.models.items.BackgroundStyle;
import com.whoop.design.models.items.BatteryStatus;
import com.whoop.design.models.items.CheckmarkStyle;
import com.whoop.design.models.items.DesignItemGridVerticalAlignment;
import com.whoop.design.models.items.GoalSettingsTileStyle;
import com.whoop.design.models.items.HeaderStyle;
import com.whoop.design.models.items.HeartRateTileId;
import com.whoop.design.models.items.HeartRateTileStyle;
import com.whoop.design.models.items.ImpactStyle;
import com.whoop.design.models.items.IndicatorStyle;
import com.whoop.design.models.items.InfoCalloutStyle;
import com.whoop.design.models.items.ItemVisibilityStateEnum;
import com.whoop.design.models.items.ItemsCardFooterAlignment;
import com.whoop.design.models.items.JournalEntrypointState;
import com.whoop.design.models.items.ProgressStyle;
import com.whoop.design.models.items.SelectableCellListSearchBehavior;
import com.whoop.design.models.items.TileBorderStyle;
import com.whoop.design.models.items.collapsiblerow.CollapsibleStatus;
import com.whoop.design.models.items.collapsiblerow.EndItemFormat;
import com.whoop.design.models.items.graph.ChartBackgroundStyle;
import com.whoop.design.models.items.graph.LayoutDirection;
import com.whoop.design.models.items.graph.LegendShape;
import com.whoop.design.models.items.graph.StressGraphingCardSize;
import com.whoop.design.models.items.graph.plane.annotations.GraphAnnotationLabelAlignment;
import com.whoop.design.models.items.graph.plane.line.GraphLineStyle;
import com.whoop.design.models.items.graph.plane.line.GraphLineType;
import com.whoop.design.models.items.graph.plot.GraphPlotLabelStyle;
import com.whoop.design.models.items.graph.plot.IconPointStyle;
import com.whoop.design.models.items.graph.plot.band.BandPlotStyle;
import com.whoop.design.models.items.graph.plot.band.BandPointStyle;
import com.whoop.design.models.items.graph.plot.bar.BarStyle;
import com.whoop.design.models.items.graph.plot.bar.BarWidth;
import com.whoop.design.models.items.graph.plot.line.DashPattern;
import com.whoop.design.models.items.graph.plot.line.FillOpacity;
import com.whoop.design.models.items.graph.plot.line.LinePlotStyle;
import com.whoop.design.models.items.graph.plot.line.LinePointStyle;
import com.whoop.design.models.items.graph.plot.line.LineWidth;
import com.whoop.design.models.items.graph.plot.line.PointShape;
import com.whoop.design.models.items.graph.plot.line.PointSize;
import com.whoop.design.models.items.graph.plot.line.PointVisibility;
import com.whoop.design.models.items.graph.plot.overlay.OverlayBarStyle;
import com.whoop.design.models.items.graph.plot.overlay.OverlayCta;
import com.whoop.design.models.items.graph.plot.progress.ProgressPlotStyle;
import com.whoop.design.models.items.graph.plot.trend.TrendPlotStyle;
import com.whoop.design.models.items.graph.stress.StressState;
import com.whoop.design.models.items.targetrecommendation.WidgetFooterButtonStyle;
import com.whoop.design.models.items.targetrecommendation.WidgetFooterButtonType;
import com.whoop.design.models.items.targetrecommendation.WidgetStatus;
import com.whoop.design.models.modal.ToastActionButtonAlignment;
import com.whoop.design.models.modal.ToastStyleModel;
import g61.EnumC15530c;
import g61.EnumC15531d;
import g61.EnumC15533f;
import gz0.EnumC16313m0;
import h01.EnumC16533a;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import j61.EnumC21367a;
import j61.EnumC21368b;
import j61.EnumC21370d;
import j61.EnumC21371e;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import kd1.EnumC22400l;
import l83.C23465k;
import m71.EnumC25200c;
import m83.AbstractC25247g0;
import ny0.EnumC27267m0;
import ny0.EnumC27272p;
import o01.EnumC27349e;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.EnumC23701r0;
import v71.EnumC35760a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000bH\u0016¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "<init>", "()V", "create", "Lcom/google/gson/TypeAdapter;", "T", "", "gson", "Lcom/google/gson/Gson;", "type", "Lcom/google/gson/reflect/TypeToken;", "DesignSystemEnumTypeAdapter", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignSystemEnumTypeAdapterFactory implements TypeAdapterFactory {

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/json/DesignSystemEnumTypeAdapterFactory$DesignSystemEnumTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "", "typeString", "<init>", "(Ljava/lang/String;)V", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "Ll83/a0;", "write", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V", "Lcom/google/gson/stream/JsonReader;", "in", "read", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "b", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DesignSystemEnumTypeAdapter<T> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: c */
        private static final Map<String, Function1> f25676c;

        /* JADX INFO: renamed from: d */
        private static final Map<String, Function1> f25677d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String typeString;

        static {
            final int i13 = 0;
            C23465k c23465k = new C23465k(ArticleTileTypeDtoEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i13) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i14 = 2;
            C23465k c23465k2 = new C23465k(ArticleTileCarouselStyleDtoEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i14) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i15 = 14;
            final int i16 = 26;
            final int i17 = 8;
            final int i18 = 20;
            Map<String, Function1> mapM73990Y = AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k(ArticleTileModelEventEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i15) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            }), new C23465k(ArticleTileCarouselEventEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i16) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            }), new C23465k(ArticleTileCarouselEventEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i17) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            }), new C23465k(ArticleTileCarouselEventEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i18) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            }));
            f25676c = mapM73990Y;
            final int i19 = 2;
            C23465k c23465k3 = new C23465k(AlarmStatus.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i19) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i24 = 14;
            C23465k c23465k4 = new C23465k(BackgroundStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i24) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i25 = 22;
            C23465k c23465k5 = new C23465k(BandPlotStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i25) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i26 = 23;
            C23465k c23465k6 = new C23465k(BandPointStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i26) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i27 = 11;
            C23465k c23465k7 = new C23465k(BarStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i27) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i28 = 22;
            C23465k c23465k8 = new C23465k(BarWidth.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i28) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i29 = 3;
            C23465k c23465k9 = new C23465k(BatteryStatus.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i29) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i34 = 14;
            C23465k c23465k10 = new C23465k(ButtonCardStyleDtoEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i34) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i35 = 25;
            C23465k c23465k11 = new C23465k(ChartBackgroundStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i35) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i36 = 6;
            C23465k c23465k12 = new C23465k(EnumC23701r0.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i36) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i37 = 17;
            C23465k c23465k13 = new C23465k(CheckmarkStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i37) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i38 = 24;
            C23465k c23465k14 = new C23465k(CollapsibleStatus.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i38) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i39 = 25;
            C23465k c23465k15 = new C23465k(CircularProgressStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i39) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i44 = 1;
            C23465k c23465k16 = new C23465k(DashPattern.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i44) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i45 = 3;
            C23465k c23465k17 = new C23465k(DesignItemGridVerticalAlignment.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i45) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i46 = 4;
            C23465k c23465k18 = new C23465k(EnumC17744g.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i46) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i47 = 5;
            C23465k c23465k19 = new C23465k(EndItemFormat.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i47) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i48 = 6;
            C23465k c23465k20 = new C23465k(DynamicInformationalImageCardLayoutState.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i48) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i49 = 7;
            C23465k c23465k21 = new C23465k(FillOpacity.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i49) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i54 = 8;
            C23465k c23465k22 = new C23465k(GoalSettingsTileStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i54) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i55 = 9;
            C23465k c23465k23 = new C23465k(EnumC21367a.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i55) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i56 = 10;
            C23465k c23465k24 = new C23465k(GraphAnnotationLabelAlignment.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i56) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i57 = 12;
            C23465k c23465k25 = new C23465k(EnumC21368b.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i57) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i58 = 13;
            C23465k c23465k26 = new C23465k(EnumC21370d.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i58) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i59 = 15;
            C23465k c23465k27 = new C23465k(EnumC21371e.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i59) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i64 = 16;
            C23465k c23465k28 = new C23465k(EnumC15530c.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i64) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i65 = 17;
            C23465k c23465k29 = new C23465k(EnumC15531d.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i65) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i66 = 18;
            C23465k c23465k30 = new C23465k(EnumC15533f.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i66) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i67 = 19;
            C23465k c23465k31 = new C23465k(GraphLineStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i67) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i68 = 20;
            C23465k c23465k32 = new C23465k(GraphLineType.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i68) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i69 = 21;
            C23465k c23465k33 = new C23465k(GraphPlotLabelStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i69) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i74 = 23;
            C23465k c23465k34 = new C23465k(HeaderStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i74) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i75 = 24;
            C23465k c23465k35 = new C23465k(EnumC25200c.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i75) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i76 = 25;
            C23465k c23465k36 = new C23465k(HeartRateTileId.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i76) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i77 = 27;
            C23465k c23465k37 = new C23465k(HeartRateTileStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i77) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i78 = 28;
            C23465k c23465k38 = new C23465k(EnumC22400l.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i78) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i79 = 29;
            C23465k c23465k39 = new C23465k(HorizontalScrollBehavior.class.getName(), new Function1() { // from class: com.whoop.design.json.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i79) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20215I0(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20248T0(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20218J0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20251U0(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20254V0(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20257W0(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20260X0(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20263Y0(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20266Z0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20274b1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20278c1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20352w1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20282d1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20286e1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20221K0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20290f1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20294g1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20298h1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20302i1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20306j1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20310k1(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20318m1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20213H1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20322n1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20326o1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20330p1(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20224L0(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20334q1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20337r1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20340s1(str);
                    }
                }
            });
            final int i83 = 0;
            C23465k c23465k40 = new C23465k(EnumC16533a.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i83) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i84 = 1;
            C23465k c23465k41 = new C23465k(EnumC27272p.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i84) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i85 = 2;
            C23465k c23465k42 = new C23465k(EnumC35760a.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i85) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i86 = 4;
            C23465k c23465k43 = new C23465k(ProgressMeterStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i86) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i87 = 5;
            C23465k c23465k44 = new C23465k(EnumC27267m0.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i87) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i88 = 6;
            C23465k c23465k45 = new C23465k(SelectableCellListSearchBehavior.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i88) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i89 = 7;
            C23465k c23465k46 = new C23465k(IconPointStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i89) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i94 = 9;
            C23465k c23465k47 = new C23465k(IconGradient.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i94) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i95 = 10;
            C23465k c23465k48 = new C23465k(IconSize.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i95) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i96 = 11;
            C23465k c23465k49 = new C23465k(ImpactStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i96) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i97 = 12;
            C23465k c23465k50 = new C23465k(IndicatorStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i97) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i98 = 13;
            C23465k c23465k51 = new C23465k(InfoCalloutStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i98) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i99 = 15;
            C23465k c23465k52 = new C23465k(InfoCalloutTileItemsAlignment.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i99) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i100 = 16;
            C23465k c23465k53 = new C23465k(ItemsCardFooterAlignment.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i100) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i101 = 17;
            C23465k c23465k54 = new C23465k(ItemVisibilityStateEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i101) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i102 = 18;
            C23465k c23465k55 = new C23465k(JournalEntrypointState.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i102) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i103 = 19;
            C23465k c23465k56 = new C23465k(LayoutDirection.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i103) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i104 = 21;
            C23465k c23465k57 = new C23465k(LegendShape.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i104) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i105 = 22;
            C23465k c23465k58 = new C23465k(LegendStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i105) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i106 = 23;
            C23465k c23465k59 = new C23465k(LinePlotStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i106) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i107 = 24;
            C23465k c23465k60 = new C23465k(LinePointStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i107) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i108 = 26;
            C23465k c23465k61 = new C23465k(LineWidth.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i108) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i109 = 27;
            C23465k c23465k62 = new C23465k(OverlayBarStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i109) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i110 = 28;
            C23465k c23465k63 = new C23465k(OverlayCta.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i110) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i111 = 29;
            C23465k c23465k64 = new C23465k(EnumC0521b.class.getName(), new Function1() { // from class: com.whoop.design.json.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i111) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20343t1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20346u1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20349v1(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20246S1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20355x1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20358y1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20361z1(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20192A1(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20227M0(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20195B1(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20198C1(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20201D1(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20204E1(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20207F1(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20283d2(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20210G1(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20216I1(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20219J1(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20222K1(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20225L1(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20230N0(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20228M1(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20231N1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20234O1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20237P1(str);
                        case 25:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20327o2(str);
                        case 26:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20240Q1(str);
                        case 27:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20243R1(str);
                        case 28:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20249T1(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20252U1(str);
                    }
                }
            });
            final int i112 = 0;
            C23465k c23465k65 = new C23465k(PointShape.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i112) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i113 = 1;
            C23465k c23465k66 = new C23465k(PointSize.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i113) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i114 = 3;
            C23465k c23465k67 = new C23465k(PointVisibility.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i114) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i115 = 4;
            C23465k c23465k68 = new C23465k(ProgressStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i115) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i116 = 5;
            C23465k c23465k69 = new C23465k(ProgressPlotStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i116) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i117 = 7;
            C23465k c23465k70 = new C23465k(EnumC0523d.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i117) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i118 = 8;
            C23465k c23465k71 = new C23465k(StressGraphingCardSize.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i118) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i119 = 9;
            C23465k c23465k72 = new C23465k(StressState.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i119) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i120 = 10;
            C23465k c23465k73 = new C23465k(EnumC27349e.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i120) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i121 = 11;
            C23465k c23465k74 = new C23465k(TileBorderStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i121) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i122 = 12;
            C23465k c23465k75 = new C23465k(ToastActionButtonAlignment.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i122) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i123 = 13;
            C23465k c23465k76 = new C23465k(ToastStyleModel.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i123) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i124 = 15;
            C23465k c23465k77 = new C23465k(TrendPlotStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i124) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i125 = 16;
            C23465k c23465k78 = new C23465k(TrendTypeEnum.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i125) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i126 = 18;
            C23465k c23465k79 = new C23465k(EnumC16313m0.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i126) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i127 = 19;
            C23465k c23465k80 = new C23465k(WidgetFooterButtonStyle.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i127) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i128 = 20;
            C23465k c23465k81 = new C23465k(WidgetFooterButtonType.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i128) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            });
            final int i129 = 21;
            f25677d = AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, c23465k8, c23465k9, c23465k10, c23465k11, c23465k12, c23465k13, c23465k14, c23465k15, c23465k16, c23465k17, c23465k18, c23465k19, c23465k20, c23465k21, c23465k22, c23465k23, c23465k24, c23465k25, c23465k26, c23465k27, c23465k28, c23465k29, c23465k30, c23465k31, c23465k32, c23465k33, c23465k34, c23465k35, c23465k36, c23465k37, c23465k38, c23465k39, c23465k40, c23465k41, c23465k42, c23465k43, c23465k44, c23465k45, c23465k46, c23465k47, c23465k48, c23465k49, c23465k50, c23465k51, c23465k52, c23465k53, c23465k54, c23465k55, c23465k56, c23465k57, c23465k58, c23465k59, c23465k60, c23465k61, c23465k62, c23465k63, c23465k64, c23465k65, c23465k66, c23465k67, c23465k68, c23465k69, c23465k70, c23465k71, c23465k72, c23465k73, c23465k74, c23465k75, c23465k76, c23465k77, c23465k78, c23465k79, c23465k80, c23465k81, new C23465k(WidgetStatus.class.getName(), new Function1() { // from class: com.whoop.design.json.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    switch (i129) {
                        case 0:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20255V1(str);
                        case 1:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20258W1(str);
                        case 2:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20233O0(str);
                        case 3:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20261X1(str);
                        case 4:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20264Y1(str);
                        case 5:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20267Z1(str);
                        case 6:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20331p2(str);
                        case 7:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20271a2(str);
                        case 8:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20275b2(str);
                        case 9:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20279c2(str);
                        case 10:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20287e2(str);
                        case 11:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20291f2(str);
                        case 12:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20295g2(str);
                        case 13:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20299h2(str);
                        case 14:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20236P0(str);
                        case 15:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20303i2(str);
                        case 16:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20307j2(str);
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20239Q0(str);
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20311k2(str);
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20315l2(str);
                        case 20:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20319m2(str);
                        case 21:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20323n2(str);
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20270a1(str);
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20314l1(str);
                        case 24:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20242R0(str);
                        default:
                            return DesignSystemEnumTypeAdapterFactory.DesignSystemEnumTypeAdapter.m20245S0(str);
                    }
                }
            })), mapM73990Y);
        }

        public DesignSystemEnumTypeAdapter(String typeString) {
            AbstractC22676k.m65750j(typeString, "typeString");
            this.typeString = typeString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: A1 */
        public static final DesignSystemEnum m20192A1(String it) {
            AbstractC22676k.m65750j(it, "it");
            IconPointStyle iconPointStyle = IconPointStyle.EMPTY;
            for (IconPointStyle iconPointStyle2 : IconPointStyle.values()) {
                if (AbstractC22676k.m65745e(iconPointStyle2.name(), it)) {
                    if (iconPointStyle2 == null) {
                        return iconPointStyle;
                    }
                    return iconPointStyle2;
                }
            }
            iconPointStyle2 = null;
            if (iconPointStyle2 == null) {
                return iconPointStyle;
            }
            return iconPointStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: B1 */
        public static final DesignSystemEnum m20195B1(String it) {
            AbstractC22676k.m65750j(it, "it");
            IconGradient iconGradient = IconGradient.NONE;
            for (IconGradient iconGradient2 : IconGradient.values()) {
                if (AbstractC22676k.m65745e(iconGradient2.name(), it)) {
                    if (iconGradient2 == null) {
                        return iconGradient;
                    }
                    return iconGradient2;
                }
            }
            iconGradient2 = null;
            if (iconGradient2 == null) {
                return iconGradient;
            }
            return iconGradient2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: C1 */
        public static final DesignSystemEnum m20198C1(String it) {
            AbstractC22676k.m65750j(it, "it");
            IconSize iconSize = IconSize.MEDIUM;
            for (IconSize iconSize2 : IconSize.values()) {
                if (AbstractC22676k.m65745e(iconSize2.name(), it)) {
                    if (iconSize2 == null) {
                        return iconSize;
                    }
                    return iconSize2;
                }
            }
            iconSize2 = null;
            if (iconSize2 == null) {
                return iconSize;
            }
            return iconSize2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: D1 */
        public static final DesignSystemEnum m20201D1(String it) {
            AbstractC22676k.m65750j(it, "it");
            ImpactStyle impactStyle = ImpactStyle.INELIGIBLE;
            for (ImpactStyle impactStyle2 : ImpactStyle.values()) {
                if (AbstractC22676k.m65745e(impactStyle2.name(), it)) {
                    if (impactStyle2 == null) {
                        return impactStyle;
                    }
                    return impactStyle2;
                }
            }
            impactStyle2 = null;
            if (impactStyle2 == null) {
                return impactStyle;
            }
            return impactStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: E1 */
        public static final DesignSystemEnum m20204E1(String it) {
            AbstractC22676k.m65750j(it, "it");
            IndicatorStyle indicatorStyle = IndicatorStyle.NO_DATA;
            for (IndicatorStyle indicatorStyle2 : IndicatorStyle.values()) {
                if (AbstractC22676k.m65745e(indicatorStyle2.name(), it)) {
                    if (indicatorStyle2 == null) {
                        return indicatorStyle;
                    }
                    return indicatorStyle2;
                }
            }
            indicatorStyle2 = null;
            if (indicatorStyle2 == null) {
                return indicatorStyle;
            }
            return indicatorStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: F1 */
        public static final DesignSystemEnum m20207F1(String it) {
            AbstractC22676k.m65750j(it, "it");
            InfoCalloutStyle infoCalloutStyle = InfoCalloutStyle.IMPACT_DETAIL;
            for (InfoCalloutStyle infoCalloutStyle2 : InfoCalloutStyle.values()) {
                if (AbstractC22676k.m65745e(infoCalloutStyle2.name(), it)) {
                    if (infoCalloutStyle2 == null) {
                        return infoCalloutStyle;
                    }
                    return infoCalloutStyle2;
                }
            }
            infoCalloutStyle2 = null;
            if (infoCalloutStyle2 == null) {
                return infoCalloutStyle;
            }
            return infoCalloutStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: G1 */
        public static final DesignSystemEnum m20210G1(String it) {
            AbstractC22676k.m65750j(it, "it");
            InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment = InfoCalloutTileItemsAlignment.TEXT;
            for (InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment2 : InfoCalloutTileItemsAlignment.values()) {
                if (AbstractC22676k.m65745e(infoCalloutTileItemsAlignment2.name(), it)) {
                    if (infoCalloutTileItemsAlignment2 == null) {
                        return infoCalloutTileItemsAlignment;
                    }
                    return infoCalloutTileItemsAlignment2;
                }
            }
            infoCalloutTileItemsAlignment2 = null;
            if (infoCalloutTileItemsAlignment2 == null) {
                return infoCalloutTileItemsAlignment;
            }
            return infoCalloutTileItemsAlignment2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: H1 */
        public static final DesignSystemEnum m20213H1(String it) {
            AbstractC22676k.m65750j(it, "it");
            BarWidth barWidth = BarWidth.STANDARD;
            for (BarWidth barWidth2 : BarWidth.values()) {
                if (AbstractC22676k.m65745e(barWidth2.name(), it)) {
                    if (barWidth2 == null) {
                        return barWidth;
                    }
                    return barWidth2;
                }
            }
            barWidth2 = null;
            if (barWidth2 == null) {
                return barWidth;
            }
            return barWidth2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: I0 */
        public static final DesignSystemEnum m20215I0(String it) {
            AbstractC22676k.m65750j(it, "it");
            ArticleTileTypeDtoEnum articleTileTypeDtoEnum = ArticleTileTypeDtoEnum.DISCOVER_MORE;
            for (ArticleTileTypeDtoEnum articleTileTypeDtoEnum2 : ArticleTileTypeDtoEnum.values()) {
                if (AbstractC22676k.m65745e(articleTileTypeDtoEnum2.name(), it)) {
                    if (articleTileTypeDtoEnum2 == null) {
                        return articleTileTypeDtoEnum;
                    }
                    return articleTileTypeDtoEnum2;
                }
            }
            articleTileTypeDtoEnum2 = null;
            if (articleTileTypeDtoEnum2 == null) {
                return articleTileTypeDtoEnum;
            }
            return articleTileTypeDtoEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: I1 */
        public static final DesignSystemEnum m20216I1(String it) {
            AbstractC22676k.m65750j(it, "it");
            ItemsCardFooterAlignment itemsCardFooterAlignment = ItemsCardFooterAlignment.END;
            for (ItemsCardFooterAlignment itemsCardFooterAlignment2 : ItemsCardFooterAlignment.values()) {
                if (AbstractC22676k.m65745e(itemsCardFooterAlignment2.name(), it)) {
                    if (itemsCardFooterAlignment2 == null) {
                        return itemsCardFooterAlignment;
                    }
                    return itemsCardFooterAlignment2;
                }
            }
            itemsCardFooterAlignment2 = null;
            if (itemsCardFooterAlignment2 == null) {
                return itemsCardFooterAlignment;
            }
            return itemsCardFooterAlignment2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: J0 */
        public static final DesignSystemEnum m20218J0(String it) {
            AbstractC22676k.m65750j(it, "it");
            ArticleTileCarouselStyleDtoEnum articleTileCarouselStyleDtoEnum = ArticleTileCarouselStyleDtoEnum.STANDARD;
            for (ArticleTileCarouselStyleDtoEnum articleTileCarouselStyleDtoEnum2 : ArticleTileCarouselStyleDtoEnum.values()) {
                if (AbstractC22676k.m65745e(articleTileCarouselStyleDtoEnum2.name(), it)) {
                    if (articleTileCarouselStyleDtoEnum2 == null) {
                        return articleTileCarouselStyleDtoEnum;
                    }
                    return articleTileCarouselStyleDtoEnum2;
                }
            }
            articleTileCarouselStyleDtoEnum2 = null;
            if (articleTileCarouselStyleDtoEnum2 == null) {
                return articleTileCarouselStyleDtoEnum;
            }
            return articleTileCarouselStyleDtoEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: J1 */
        public static final DesignSystemEnum m20219J1(String it) {
            AbstractC22676k.m65750j(it, "it");
            ItemVisibilityStateEnum itemVisibilityStateEnum = ItemVisibilityStateEnum.ENABLED;
            for (ItemVisibilityStateEnum itemVisibilityStateEnum2 : ItemVisibilityStateEnum.values()) {
                if (AbstractC22676k.m65745e(itemVisibilityStateEnum2.name(), it)) {
                    if (itemVisibilityStateEnum2 == null) {
                        return itemVisibilityStateEnum;
                    }
                    return itemVisibilityStateEnum2;
                }
            }
            itemVisibilityStateEnum2 = null;
            if (itemVisibilityStateEnum2 == null) {
                return itemVisibilityStateEnum;
            }
            return itemVisibilityStateEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: K0 */
        public static final DesignSystemEnum m20221K0(String it) {
            AbstractC22676k.m65750j(it, "it");
            ArticleTileModelEventEnum articleTileModelEventEnum = ArticleTileModelEventEnum.STRESS_MONITOR_IN_APP_EDUCATION;
            for (ArticleTileModelEventEnum articleTileModelEventEnum2 : ArticleTileModelEventEnum.values()) {
                if (AbstractC22676k.m65745e(articleTileModelEventEnum2.name(), it)) {
                    if (articleTileModelEventEnum2 == null) {
                        return articleTileModelEventEnum;
                    }
                    return articleTileModelEventEnum2;
                }
            }
            articleTileModelEventEnum2 = null;
            if (articleTileModelEventEnum2 == null) {
                return articleTileModelEventEnum;
            }
            return articleTileModelEventEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: K1 */
        public static final DesignSystemEnum m20222K1(String it) {
            AbstractC22676k.m65750j(it, "it");
            JournalEntrypointState journalEntrypointState = JournalEntrypointState.INTRADAY;
            for (JournalEntrypointState journalEntrypointState2 : JournalEntrypointState.values()) {
                if (AbstractC22676k.m65745e(journalEntrypointState2.name(), it)) {
                    if (journalEntrypointState2 == null) {
                        return journalEntrypointState;
                    }
                    return journalEntrypointState2;
                }
            }
            journalEntrypointState2 = null;
            if (journalEntrypointState2 == null) {
                return journalEntrypointState;
            }
            return journalEntrypointState2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: L0 */
        public static final DesignSystemEnum m20224L0(String it) {
            AbstractC22676k.m65750j(it, "it");
            ArticleTileCarouselEventEnum articleTileCarouselEventEnum = ArticleTileCarouselEventEnum.DISMISS;
            for (ArticleTileCarouselEventEnum articleTileCarouselEventEnum2 : ArticleTileCarouselEventEnum.values()) {
                if (AbstractC22676k.m65745e(articleTileCarouselEventEnum2.name(), it)) {
                    if (articleTileCarouselEventEnum2 == null) {
                        return articleTileCarouselEventEnum;
                    }
                    return articleTileCarouselEventEnum2;
                }
            }
            articleTileCarouselEventEnum2 = null;
            if (articleTileCarouselEventEnum2 == null) {
                return articleTileCarouselEventEnum;
            }
            return articleTileCarouselEventEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: L1 */
        public static final DesignSystemEnum m20225L1(String it) {
            AbstractC22676k.m65750j(it, "it");
            LayoutDirection layoutDirection = LayoutDirection.LEFT_TO_RIGHT;
            for (LayoutDirection layoutDirection2 : LayoutDirection.values()) {
                if (AbstractC22676k.m65745e(layoutDirection2.name(), it)) {
                    if (layoutDirection2 == null) {
                        return layoutDirection;
                    }
                    return layoutDirection2;
                }
            }
            layoutDirection2 = null;
            if (layoutDirection2 == null) {
                return layoutDirection;
            }
            return layoutDirection2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: M0 */
        public static final DesignSystemEnum m20227M0(String it) {
            AbstractC22676k.m65750j(it, "it");
            ArticleTileCarouselEventEnum articleTileCarouselEventEnum = ArticleTileCarouselEventEnum.VIEW_ALL;
            for (ArticleTileCarouselEventEnum articleTileCarouselEventEnum2 : ArticleTileCarouselEventEnum.values()) {
                if (AbstractC22676k.m65745e(articleTileCarouselEventEnum2.name(), it)) {
                    if (articleTileCarouselEventEnum2 == null) {
                        return articleTileCarouselEventEnum;
                    }
                    return articleTileCarouselEventEnum2;
                }
            }
            articleTileCarouselEventEnum2 = null;
            if (articleTileCarouselEventEnum2 == null) {
                return articleTileCarouselEventEnum;
            }
            return articleTileCarouselEventEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: M1 */
        public static final DesignSystemEnum m20228M1(String it) {
            AbstractC22676k.m65750j(it, "it");
            LegendShape legendShape = LegendShape.CIRCLE;
            for (LegendShape legendShape2 : LegendShape.values()) {
                if (AbstractC22676k.m65745e(legendShape2.name(), it)) {
                    if (legendShape2 == null) {
                        return legendShape;
                    }
                    return legendShape2;
                }
            }
            legendShape2 = null;
            if (legendShape2 == null) {
                return legendShape;
            }
            return legendShape2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: N0 */
        public static final DesignSystemEnum m20230N0(String it) {
            AbstractC22676k.m65750j(it, "it");
            ArticleTileCarouselEventEnum articleTileCarouselEventEnum = ArticleTileCarouselEventEnum.MORE;
            for (ArticleTileCarouselEventEnum articleTileCarouselEventEnum2 : ArticleTileCarouselEventEnum.values()) {
                if (AbstractC22676k.m65745e(articleTileCarouselEventEnum2.name(), it)) {
                    if (articleTileCarouselEventEnum2 == null) {
                        return articleTileCarouselEventEnum;
                    }
                    return articleTileCarouselEventEnum2;
                }
            }
            articleTileCarouselEventEnum2 = null;
            if (articleTileCarouselEventEnum2 == null) {
                return articleTileCarouselEventEnum;
            }
            return articleTileCarouselEventEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: N1 */
        public static final DesignSystemEnum m20231N1(String it) {
            AbstractC22676k.m65750j(it, "it");
            LegendStyle legendStyle = LegendStyle.ASLEEP;
            for (LegendStyle legendStyle2 : LegendStyle.values()) {
                if (AbstractC22676k.m65745e(legendStyle2.name(), it)) {
                    if (legendStyle2 == null) {
                        return legendStyle;
                    }
                    return legendStyle2;
                }
            }
            legendStyle2 = null;
            if (legendStyle2 == null) {
                return legendStyle;
            }
            return legendStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: O0 */
        public static final DesignSystemEnum m20233O0(String it) {
            AbstractC22676k.m65750j(it, "it");
            AlarmStatus alarmStatus = AlarmStatus.OFF;
            for (AlarmStatus alarmStatus2 : AlarmStatus.values()) {
                if (AbstractC22676k.m65745e(alarmStatus2.name(), it)) {
                    if (alarmStatus2 == null) {
                        return alarmStatus;
                    }
                    return alarmStatus2;
                }
            }
            alarmStatus2 = null;
            if (alarmStatus2 == null) {
                return alarmStatus;
            }
            return alarmStatus2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: O1 */
        public static final DesignSystemEnum m20234O1(String it) {
            AbstractC22676k.m65750j(it, "it");
            LinePlotStyle linePlotStyle = LinePlotStyle.NONE;
            for (LinePlotStyle linePlotStyle2 : LinePlotStyle.values()) {
                if (AbstractC22676k.m65745e(linePlotStyle2.name(), it)) {
                    if (linePlotStyle2 == null) {
                        return linePlotStyle;
                    }
                    return linePlotStyle2;
                }
            }
            linePlotStyle2 = null;
            if (linePlotStyle2 == null) {
                return linePlotStyle;
            }
            return linePlotStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: P0 */
        public static final DesignSystemEnum m20236P0(String it) {
            AbstractC22676k.m65750j(it, "it");
            BackgroundStyle backgroundStyle = BackgroundStyle.NONE;
            for (BackgroundStyle backgroundStyle2 : BackgroundStyle.values()) {
                if (AbstractC22676k.m65745e(backgroundStyle2.name(), it)) {
                    if (backgroundStyle2 == null) {
                        return backgroundStyle;
                    }
                    return backgroundStyle2;
                }
            }
            backgroundStyle2 = null;
            if (backgroundStyle2 == null) {
                return backgroundStyle;
            }
            return backgroundStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: P1 */
        public static final DesignSystemEnum m20237P1(String it) {
            AbstractC22676k.m65750j(it, "it");
            LinePointStyle linePointStyle = LinePointStyle.NONE;
            for (LinePointStyle linePointStyle2 : LinePointStyle.values()) {
                if (AbstractC22676k.m65745e(linePointStyle2.name(), it)) {
                    if (linePointStyle2 == null) {
                        return linePointStyle;
                    }
                    return linePointStyle2;
                }
            }
            linePointStyle2 = null;
            if (linePointStyle2 == null) {
                return linePointStyle;
            }
            return linePointStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: Q0 */
        public static final DesignSystemEnum m20239Q0(String it) {
            AbstractC22676k.m65750j(it, "it");
            CheckmarkStyle checkmarkStyle = CheckmarkStyle.DISABLED;
            for (CheckmarkStyle checkmarkStyle2 : CheckmarkStyle.values()) {
                if (AbstractC22676k.m65745e(checkmarkStyle2.name(), it)) {
                    if (checkmarkStyle2 == null) {
                        return checkmarkStyle;
                    }
                    return checkmarkStyle2;
                }
            }
            checkmarkStyle2 = null;
            if (checkmarkStyle2 == null) {
                return checkmarkStyle;
            }
            return checkmarkStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: Q1 */
        public static final DesignSystemEnum m20240Q1(String it) {
            AbstractC22676k.m65750j(it, "it");
            LineWidth lineWidth = LineWidth.STANDARD;
            for (LineWidth lineWidth2 : LineWidth.values()) {
                if (AbstractC22676k.m65745e(lineWidth2.name(), it)) {
                    if (lineWidth2 == null) {
                        return lineWidth;
                    }
                    return lineWidth2;
                }
            }
            lineWidth2 = null;
            if (lineWidth2 == null) {
                return lineWidth;
            }
            return lineWidth2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x002d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x002e A[RETURN] */
        /* JADX INFO: renamed from: R0 */
        public static final DesignSystemEnum m20242R0(String it) {
            AbstractC22676k.m65750j(it, "it");
            String upperCase = it.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            CollapsibleStatus collapsibleStatus = CollapsibleStatus.COLLAPSED;
            for (CollapsibleStatus collapsibleStatus2 : CollapsibleStatus.values()) {
                if (AbstractC22676k.m65745e(collapsibleStatus2.name(), upperCase)) {
                    if (collapsibleStatus2 == null) {
                        return collapsibleStatus;
                    }
                    return collapsibleStatus2;
                }
            }
            collapsibleStatus2 = null;
            if (collapsibleStatus2 == null) {
                return collapsibleStatus;
            }
            return collapsibleStatus2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: R1 */
        public static final DesignSystemEnum m20243R1(String it) {
            AbstractC22676k.m65750j(it, "it");
            OverlayBarStyle overlayBarStyle = OverlayBarStyle.CARDIO_ACTIVITY;
            for (OverlayBarStyle overlayBarStyle2 : OverlayBarStyle.values()) {
                if (AbstractC22676k.m65745e(overlayBarStyle2.name(), it)) {
                    if (overlayBarStyle2 == null) {
                        return overlayBarStyle;
                    }
                    return overlayBarStyle2;
                }
            }
            overlayBarStyle2 = null;
            if (overlayBarStyle2 == null) {
                return overlayBarStyle;
            }
            return overlayBarStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: S0 */
        public static final DesignSystemEnum m20245S0(String it) {
            AbstractC22676k.m65750j(it, "it");
            CircularProgressStyle circularProgressStyle = CircularProgressStyle.ACTIVITY_SNAPSHOT;
            for (CircularProgressStyle circularProgressStyle2 : CircularProgressStyle.values()) {
                if (AbstractC22676k.m65745e(circularProgressStyle2.name(), it)) {
                    if (circularProgressStyle2 == null) {
                        return circularProgressStyle;
                    }
                    return circularProgressStyle2;
                }
            }
            circularProgressStyle2 = null;
            if (circularProgressStyle2 == null) {
                return circularProgressStyle;
            }
            return circularProgressStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: S1 */
        public static final DesignSystemEnum m20246S1(String it) {
            AbstractC22676k.m65750j(it, "it");
            BatteryStatus batteryStatus = BatteryStatus.CHARGED;
            for (BatteryStatus batteryStatus2 : BatteryStatus.values()) {
                if (AbstractC22676k.m65745e(batteryStatus2.name(), it)) {
                    if (batteryStatus2 == null) {
                        return batteryStatus;
                    }
                    return batteryStatus2;
                }
            }
            batteryStatus2 = null;
            if (batteryStatus2 == null) {
                return batteryStatus;
            }
            return batteryStatus2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: T0 */
        public static final DesignSystemEnum m20248T0(String it) {
            AbstractC22676k.m65750j(it, "it");
            DashPattern dashPattern = DashPattern.SOLID;
            for (DashPattern dashPattern2 : DashPattern.values()) {
                if (AbstractC22676k.m65745e(dashPattern2.name(), it)) {
                    if (dashPattern2 == null) {
                        return dashPattern;
                    }
                    return dashPattern2;
                }
            }
            dashPattern2 = null;
            if (dashPattern2 == null) {
                return dashPattern;
            }
            return dashPattern2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: T1 */
        public static final DesignSystemEnum m20249T1(String it) {
            AbstractC22676k.m65750j(it, "it");
            OverlayCta overlayCta = OverlayCta.PENDING;
            for (OverlayCta overlayCta2 : OverlayCta.values()) {
                if (AbstractC22676k.m65745e(overlayCta2.name(), it)) {
                    if (overlayCta2 == null) {
                        return overlayCta;
                    }
                    return overlayCta2;
                }
            }
            overlayCta2 = null;
            if (overlayCta2 == null) {
                return overlayCta;
            }
            return overlayCta2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: U0 */
        public static final DesignSystemEnum m20251U0(String it) {
            AbstractC22676k.m65750j(it, "it");
            DesignItemGridVerticalAlignment designItemGridVerticalAlignment = DesignItemGridVerticalAlignment.CENTER;
            for (DesignItemGridVerticalAlignment designItemGridVerticalAlignment2 : DesignItemGridVerticalAlignment.values()) {
                if (AbstractC22676k.m65745e(designItemGridVerticalAlignment2.name(), it)) {
                    if (designItemGridVerticalAlignment2 == null) {
                        return designItemGridVerticalAlignment;
                    }
                    return designItemGridVerticalAlignment2;
                }
            }
            designItemGridVerticalAlignment2 = null;
            if (designItemGridVerticalAlignment2 == null) {
                return designItemGridVerticalAlignment;
            }
            return designItemGridVerticalAlignment2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: U1 */
        public static final DesignSystemEnum m20252U1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC0521b enumC0521b = EnumC0521b.MCI_LUTEAL;
            for (EnumC0521b enumC0521b2 : EnumC0521b.values()) {
                if (AbstractC22676k.m65745e(enumC0521b2.name(), it)) {
                    if (enumC0521b2 == null) {
                        return enumC0521b;
                    }
                    return enumC0521b2;
                }
            }
            enumC0521b2 = null;
            if (enumC0521b2 == null) {
                return enumC0521b;
            }
            return enumC0521b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: V0 */
        public static final DesignSystemEnum m20254V0(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC17744g enumC17744g = EnumC17744g.SOLID;
            for (EnumC17744g enumC17744g2 : EnumC17744g.values()) {
                if (AbstractC22676k.m65745e(enumC17744g2.name(), it)) {
                    if (enumC17744g2 == null) {
                        return enumC17744g;
                    }
                    return enumC17744g2;
                }
            }
            enumC17744g2 = null;
            if (enumC17744g2 == null) {
                return enumC17744g;
            }
            return enumC17744g2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: V1 */
        public static final DesignSystemEnum m20255V1(String it) {
            AbstractC22676k.m65750j(it, "it");
            PointShape pointShape = PointShape.CIRCLE;
            for (PointShape pointShape2 : PointShape.values()) {
                if (AbstractC22676k.m65745e(pointShape2.name(), it)) {
                    if (pointShape2 == null) {
                        return pointShape;
                    }
                    return pointShape2;
                }
            }
            pointShape2 = null;
            if (pointShape2 == null) {
                return pointShape;
            }
            return pointShape2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x002d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x002e A[RETURN] */
        /* JADX INFO: renamed from: W0 */
        public static final DesignSystemEnum m20257W0(String it) {
            AbstractC22676k.m65750j(it, "it");
            String upperCase = it.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            EndItemFormat endItemFormat = EndItemFormat.TIME;
            for (EndItemFormat endItemFormat2 : EndItemFormat.values()) {
                if (AbstractC22676k.m65745e(endItemFormat2.name(), upperCase)) {
                    if (endItemFormat2 == null) {
                        return endItemFormat;
                    }
                    return endItemFormat2;
                }
            }
            endItemFormat2 = null;
            if (endItemFormat2 == null) {
                return endItemFormat;
            }
            return endItemFormat2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: W1 */
        public static final DesignSystemEnum m20258W1(String it) {
            AbstractC22676k.m65750j(it, "it");
            PointSize pointSize = PointSize.STANDARD;
            for (PointSize pointSize2 : PointSize.values()) {
                if (AbstractC22676k.m65745e(pointSize2.name(), it)) {
                    if (pointSize2 == null) {
                        return pointSize;
                    }
                    return pointSize2;
                }
            }
            pointSize2 = null;
            if (pointSize2 == null) {
                return pointSize;
            }
            return pointSize2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: X0 */
        public static final DesignSystemEnum m20260X0(String it) {
            AbstractC22676k.m65750j(it, "it");
            DynamicInformationalImageCardLayoutState dynamicInformationalImageCardLayoutState = DynamicInformationalImageCardLayoutState.COLLAPSED;
            for (DynamicInformationalImageCardLayoutState dynamicInformationalImageCardLayoutState2 : DynamicInformationalImageCardLayoutState.values()) {
                if (AbstractC22676k.m65745e(dynamicInformationalImageCardLayoutState2.name(), it)) {
                    if (dynamicInformationalImageCardLayoutState2 == null) {
                        return dynamicInformationalImageCardLayoutState;
                    }
                    return dynamicInformationalImageCardLayoutState2;
                }
            }
            dynamicInformationalImageCardLayoutState2 = null;
            if (dynamicInformationalImageCardLayoutState2 == null) {
                return dynamicInformationalImageCardLayoutState;
            }
            return dynamicInformationalImageCardLayoutState2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: X1 */
        public static final DesignSystemEnum m20261X1(String it) {
            AbstractC22676k.m65750j(it, "it");
            PointVisibility pointVisibility = PointVisibility.ALL;
            for (PointVisibility pointVisibility2 : PointVisibility.values()) {
                if (AbstractC22676k.m65745e(pointVisibility2.name(), it)) {
                    if (pointVisibility2 == null) {
                        return pointVisibility;
                    }
                    return pointVisibility2;
                }
            }
            pointVisibility2 = null;
            if (pointVisibility2 == null) {
                return pointVisibility;
            }
            return pointVisibility2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: Y0 */
        public static final DesignSystemEnum m20263Y0(String it) {
            AbstractC22676k.m65750j(it, "it");
            FillOpacity fillOpacity = FillOpacity.FULL;
            for (FillOpacity fillOpacity2 : FillOpacity.values()) {
                if (AbstractC22676k.m65745e(fillOpacity2.name(), it)) {
                    if (fillOpacity2 == null) {
                        return fillOpacity;
                    }
                    return fillOpacity2;
                }
            }
            fillOpacity2 = null;
            if (fillOpacity2 == null) {
                return fillOpacity;
            }
            return fillOpacity2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: Y1 */
        public static final DesignSystemEnum m20264Y1(String it) {
            AbstractC22676k.m65750j(it, "it");
            ProgressStyle progressStyle = ProgressStyle.STEPS;
            for (ProgressStyle progressStyle2 : ProgressStyle.values()) {
                if (AbstractC22676k.m65745e(progressStyle2.name(), it)) {
                    if (progressStyle2 == null) {
                        return progressStyle;
                    }
                    return progressStyle2;
                }
            }
            progressStyle2 = null;
            if (progressStyle2 == null) {
                return progressStyle;
            }
            return progressStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: Z0 */
        public static final DesignSystemEnum m20266Z0(String it) {
            AbstractC22676k.m65750j(it, "it");
            GoalSettingsTileStyle goalSettingsTileStyle = GoalSettingsTileStyle.RECOVERY_ACTIVITY;
            for (GoalSettingsTileStyle goalSettingsTileStyle2 : GoalSettingsTileStyle.values()) {
                if (AbstractC22676k.m65745e(goalSettingsTileStyle2.name(), it)) {
                    if (goalSettingsTileStyle2 == null) {
                        return goalSettingsTileStyle;
                    }
                    return goalSettingsTileStyle2;
                }
            }
            goalSettingsTileStyle2 = null;
            if (goalSettingsTileStyle2 == null) {
                return goalSettingsTileStyle;
            }
            return goalSettingsTileStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: Z1 */
        public static final DesignSystemEnum m20267Z1(String it) {
            AbstractC22676k.m65750j(it, "it");
            ProgressPlotStyle progressPlotStyle = ProgressPlotStyle.PREGNANCY_NONE;
            for (ProgressPlotStyle progressPlotStyle2 : ProgressPlotStyle.values()) {
                if (AbstractC22676k.m65745e(progressPlotStyle2.name(), it)) {
                    if (progressPlotStyle2 == null) {
                        return progressPlotStyle;
                    }
                    return progressPlotStyle2;
                }
            }
            progressPlotStyle2 = null;
            if (progressPlotStyle2 == null) {
                return progressPlotStyle;
            }
            return progressPlotStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: a1 */
        public static final DesignSystemEnum m20270a1(String it) {
            AbstractC22676k.m65750j(it, "it");
            BandPlotStyle bandPlotStyle = BandPlotStyle.UNKNOWN;
            for (BandPlotStyle bandPlotStyle2 : BandPlotStyle.values()) {
                if (AbstractC22676k.m65745e(bandPlotStyle2.name(), it)) {
                    if (bandPlotStyle2 == null) {
                        return bandPlotStyle;
                    }
                    return bandPlotStyle2;
                }
            }
            bandPlotStyle2 = null;
            if (bandPlotStyle2 == null) {
                return bandPlotStyle;
            }
            return bandPlotStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: a2 */
        public static final DesignSystemEnum m20271a2(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC0523d enumC0523d = EnumC0523d.AWAKE;
            for (EnumC0523d enumC0523d2 : EnumC0523d.values()) {
                if (AbstractC22676k.m65745e(enumC0523d2.name(), it)) {
                    if (enumC0523d2 == null) {
                        return enumC0523d;
                    }
                    return enumC0523d2;
                }
            }
            enumC0523d2 = null;
            if (enumC0523d2 == null) {
                return enumC0523d;
            }
            return enumC0523d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: b1 */
        public static final DesignSystemEnum m20274b1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC21367a enumC21367a = EnumC21367a.X_AXIS;
            for (EnumC21367a enumC21367a2 : EnumC21367a.values()) {
                if (AbstractC22676k.m65745e(enumC21367a2.name(), it)) {
                    if (enumC21367a2 == null) {
                        return enumC21367a;
                    }
                    return enumC21367a2;
                }
            }
            enumC21367a2 = null;
            if (enumC21367a2 == null) {
                return enumC21367a;
            }
            return enumC21367a2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: b2 */
        public static final DesignSystemEnum m20275b2(String it) {
            AbstractC22676k.m65750j(it, "it");
            StressGraphingCardSize stressGraphingCardSize = StressGraphingCardSize.FULL;
            for (StressGraphingCardSize stressGraphingCardSize2 : StressGraphingCardSize.values()) {
                if (AbstractC22676k.m65745e(stressGraphingCardSize2.name(), it)) {
                    if (stressGraphingCardSize2 == null) {
                        return stressGraphingCardSize;
                    }
                    return stressGraphingCardSize2;
                }
            }
            stressGraphingCardSize2 = null;
            if (stressGraphingCardSize2 == null) {
                return stressGraphingCardSize;
            }
            return stressGraphingCardSize2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: c1 */
        public static final DesignSystemEnum m20278c1(String it) {
            AbstractC22676k.m65750j(it, "it");
            GraphAnnotationLabelAlignment graphAnnotationLabelAlignment = GraphAnnotationLabelAlignment.LEFT;
            for (GraphAnnotationLabelAlignment graphAnnotationLabelAlignment2 : GraphAnnotationLabelAlignment.values()) {
                if (AbstractC22676k.m65745e(graphAnnotationLabelAlignment2.name(), it)) {
                    if (graphAnnotationLabelAlignment2 == null) {
                        return graphAnnotationLabelAlignment;
                    }
                    return graphAnnotationLabelAlignment2;
                }
            }
            graphAnnotationLabelAlignment2 = null;
            if (graphAnnotationLabelAlignment2 == null) {
                return graphAnnotationLabelAlignment;
            }
            return graphAnnotationLabelAlignment2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: c2 */
        public static final DesignSystemEnum m20279c2(String it) {
            AbstractC22676k.m65750j(it, "it");
            StressState stressState = StressState.NO_DATA;
            for (StressState stressState2 : StressState.values()) {
                if (AbstractC22676k.m65745e(stressState2.name(), it)) {
                    if (stressState2 == null) {
                        return stressState;
                    }
                    return stressState2;
                }
            }
            stressState2 = null;
            if (stressState2 == null) {
                return stressState;
            }
            return stressState2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: d1 */
        public static final DesignSystemEnum m20282d1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC21368b enumC21368b = EnumC21368b.TEXTUAL;
            for (EnumC21368b enumC21368b2 : EnumC21368b.values()) {
                if (AbstractC22676k.m65745e(enumC21368b2.name(), it)) {
                    if (enumC21368b2 == null) {
                        return enumC21368b;
                    }
                    return enumC21368b2;
                }
            }
            enumC21368b2 = null;
            if (enumC21368b2 == null) {
                return enumC21368b;
            }
            return enumC21368b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: d2 */
        public static final DesignSystemEnum m20283d2(String it) {
            AbstractC22676k.m65750j(it, "it");
            ButtonCardStyleDtoEnum buttonCardStyleDtoEnum = ButtonCardStyleDtoEnum.DEFAULT;
            for (ButtonCardStyleDtoEnum buttonCardStyleDtoEnum2 : ButtonCardStyleDtoEnum.values()) {
                if (AbstractC22676k.m65745e(buttonCardStyleDtoEnum2.name(), it)) {
                    if (buttonCardStyleDtoEnum2 == null) {
                        return buttonCardStyleDtoEnum;
                    }
                    return buttonCardStyleDtoEnum2;
                }
            }
            buttonCardStyleDtoEnum2 = null;
            if (buttonCardStyleDtoEnum2 == null) {
                return buttonCardStyleDtoEnum;
            }
            return buttonCardStyleDtoEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: e1 */
        public static final DesignSystemEnum m20286e1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC21370d enumC21370d = EnumC21370d.STANDARD;
            for (EnumC21370d enumC21370d2 : EnumC21370d.values()) {
                if (AbstractC22676k.m65745e(enumC21370d2.name(), it)) {
                    if (enumC21370d2 == null) {
                        return enumC21370d;
                    }
                    return enumC21370d2;
                }
            }
            enumC21370d2 = null;
            if (enumC21370d2 == null) {
                return enumC21370d;
            }
            return enumC21370d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: e2 */
        public static final DesignSystemEnum m20287e2(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC27349e enumC27349e = EnumC27349e.GENERAL;
            for (EnumC27349e enumC27349e2 : EnumC27349e.values()) {
                if (AbstractC22676k.m65745e(enumC27349e2.name(), it)) {
                    if (enumC27349e2 == null) {
                        return enumC27349e;
                    }
                    return enumC27349e2;
                }
            }
            enumC27349e2 = null;
            if (enumC27349e2 == null) {
                return enumC27349e;
            }
            return enumC27349e2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: f1 */
        public static final DesignSystemEnum m20290f1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC21371e enumC21371e = EnumC21371e.REGION_HIGHLIGHT;
            for (EnumC21371e enumC21371e2 : EnumC21371e.values()) {
                if (AbstractC22676k.m65745e(enumC21371e2.name(), it)) {
                    if (enumC21371e2 == null) {
                        return enumC21371e;
                    }
                    return enumC21371e2;
                }
            }
            enumC21371e2 = null;
            if (enumC21371e2 == null) {
                return enumC21371e;
            }
            return enumC21371e2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: f2 */
        public static final DesignSystemEnum m20291f2(String it) {
            AbstractC22676k.m65750j(it, "it");
            TileBorderStyle tileBorderStyle = TileBorderStyle.NONE;
            for (TileBorderStyle tileBorderStyle2 : TileBorderStyle.values()) {
                if (AbstractC22676k.m65745e(tileBorderStyle2.name(), it)) {
                    if (tileBorderStyle2 == null) {
                        return tileBorderStyle;
                    }
                    return tileBorderStyle2;
                }
            }
            tileBorderStyle2 = null;
            if (tileBorderStyle2 == null) {
                return tileBorderStyle;
            }
            return tileBorderStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: g1 */
        public static final DesignSystemEnum m20294g1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC15530c enumC15530c = EnumC15530c.SOLID;
            for (EnumC15530c enumC15530c2 : EnumC15530c.values()) {
                if (AbstractC22676k.m65745e(enumC15530c2.name(), it)) {
                    if (enumC15530c2 == null) {
                        return enumC15530c;
                    }
                    return enumC15530c2;
                }
            }
            enumC15530c2 = null;
            if (enumC15530c2 == null) {
                return enumC15530c;
            }
            return enumC15530c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: g2 */
        public static final DesignSystemEnum m20295g2(String it) {
            AbstractC22676k.m65750j(it, "it");
            ToastActionButtonAlignment toastActionButtonAlignment = ToastActionButtonAlignment.UNKNOWN;
            for (ToastActionButtonAlignment toastActionButtonAlignment2 : ToastActionButtonAlignment.values()) {
                if (AbstractC22676k.m65745e(toastActionButtonAlignment2.name(), it)) {
                    if (toastActionButtonAlignment2 == null) {
                        return toastActionButtonAlignment;
                    }
                    return toastActionButtonAlignment2;
                }
            }
            toastActionButtonAlignment2 = null;
            if (toastActionButtonAlignment2 == null) {
                return toastActionButtonAlignment;
            }
            return toastActionButtonAlignment2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: h1 */
        public static final DesignSystemEnum m20298h1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC15531d enumC15531d = EnumC15531d.STANDARD;
            for (EnumC15531d enumC15531d2 : EnumC15531d.values()) {
                if (AbstractC22676k.m65745e(enumC15531d2.name(), it)) {
                    if (enumC15531d2 == null) {
                        return enumC15531d;
                    }
                    return enumC15531d2;
                }
            }
            enumC15531d2 = null;
            if (enumC15531d2 == null) {
                return enumC15531d;
            }
            return enumC15531d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: h2 */
        public static final DesignSystemEnum m20299h2(String it) {
            AbstractC22676k.m65750j(it, "it");
            ToastStyleModel toastStyleModel = ToastStyleModel.UNKNOWN;
            for (ToastStyleModel toastStyleModel2 : ToastStyleModel.values()) {
                if (AbstractC22676k.m65745e(toastStyleModel2.name(), it)) {
                    if (toastStyleModel2 == null) {
                        return toastStyleModel;
                    }
                    return toastStyleModel2;
                }
            }
            toastStyleModel2 = null;
            if (toastStyleModel2 == null) {
                return toastStyleModel;
            }
            return toastStyleModel2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: i1 */
        public static final DesignSystemEnum m20302i1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC15533f enumC15533f = EnumC15533f.X_AXIS;
            for (EnumC15533f enumC15533f2 : EnumC15533f.values()) {
                if (AbstractC22676k.m65745e(enumC15533f2.name(), it)) {
                    if (enumC15533f2 == null) {
                        return enumC15533f;
                    }
                    return enumC15533f2;
                }
            }
            enumC15533f2 = null;
            if (enumC15533f2 == null) {
                return enumC15533f;
            }
            return enumC15533f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: i2 */
        public static final DesignSystemEnum m20303i2(String it) {
            AbstractC22676k.m65750j(it, "it");
            TrendPlotStyle trendPlotStyle = TrendPlotStyle.STRAIN;
            for (TrendPlotStyle trendPlotStyle2 : TrendPlotStyle.values()) {
                if (AbstractC22676k.m65745e(trendPlotStyle2.name(), it)) {
                    if (trendPlotStyle2 == null) {
                        return trendPlotStyle;
                    }
                    return trendPlotStyle2;
                }
            }
            trendPlotStyle2 = null;
            if (trendPlotStyle2 == null) {
                return trendPlotStyle;
            }
            return trendPlotStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: j1 */
        public static final DesignSystemEnum m20306j1(String it) {
            AbstractC22676k.m65750j(it, "it");
            GraphLineStyle graphLineStyle = GraphLineStyle.STANDARD;
            for (GraphLineStyle graphLineStyle2 : GraphLineStyle.values()) {
                if (AbstractC22676k.m65745e(graphLineStyle2.name(), it)) {
                    if (graphLineStyle2 == null) {
                        return graphLineStyle;
                    }
                    return graphLineStyle2;
                }
            }
            graphLineStyle2 = null;
            if (graphLineStyle2 == null) {
                return graphLineStyle;
            }
            return graphLineStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: j2 */
        public static final DesignSystemEnum m20307j2(String it) {
            AbstractC22676k.m65750j(it, "it");
            TrendTypeEnum trendTypeEnum = TrendTypeEnum.NEUTRAL;
            for (TrendTypeEnum trendTypeEnum2 : TrendTypeEnum.values()) {
                if (AbstractC22676k.m65745e(trendTypeEnum2.name(), it)) {
                    if (trendTypeEnum2 == null) {
                        return trendTypeEnum;
                    }
                    return trendTypeEnum2;
                }
            }
            trendTypeEnum2 = null;
            if (trendTypeEnum2 == null) {
                return trendTypeEnum;
            }
            return trendTypeEnum2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: k1 */
        public static final DesignSystemEnum m20310k1(String it) {
            AbstractC22676k.m65750j(it, "it");
            GraphLineType graphLineType = GraphLineType.STANDARD;
            for (GraphLineType graphLineType2 : GraphLineType.values()) {
                if (AbstractC22676k.m65745e(graphLineType2.name(), it)) {
                    if (graphLineType2 == null) {
                        return graphLineType;
                    }
                    return graphLineType2;
                }
            }
            graphLineType2 = null;
            if (graphLineType2 == null) {
                return graphLineType;
            }
            return graphLineType2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: k2 */
        public static final DesignSystemEnum m20311k2(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC16313m0 enumC16313m0 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            for (EnumC16313m0 enumC16313m1 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m1.name(), it)) {
                    if (enumC16313m1 == null) {
                        return enumC16313m0;
                    }
                    return enumC16313m1;
                }
            }
            enumC16313m1 = null;
            if (enumC16313m1 == null) {
                return enumC16313m0;
            }
            return enumC16313m1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: l1 */
        public static final DesignSystemEnum m20314l1(String it) {
            AbstractC22676k.m65750j(it, "it");
            BandPointStyle bandPointStyle = BandPointStyle.NONE;
            for (BandPointStyle bandPointStyle2 : BandPointStyle.values()) {
                if (AbstractC22676k.m65745e(bandPointStyle2.name(), it)) {
                    if (bandPointStyle2 == null) {
                        return bandPointStyle;
                    }
                    return bandPointStyle2;
                }
            }
            bandPointStyle2 = null;
            if (bandPointStyle2 == null) {
                return bandPointStyle;
            }
            return bandPointStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x002d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x002e A[RETURN] */
        /* JADX INFO: renamed from: l2 */
        public static final DesignSystemEnum m20315l2(String it) {
            AbstractC22676k.m65750j(it, "it");
            String upperCase = it.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            WidgetFooterButtonStyle widgetFooterButtonStyle = WidgetFooterButtonStyle.PRIMARY;
            for (WidgetFooterButtonStyle widgetFooterButtonStyle2 : WidgetFooterButtonStyle.values()) {
                if (AbstractC22676k.m65745e(widgetFooterButtonStyle2.name(), upperCase)) {
                    if (widgetFooterButtonStyle2 == null) {
                        return widgetFooterButtonStyle;
                    }
                    return widgetFooterButtonStyle2;
                }
            }
            widgetFooterButtonStyle2 = null;
            if (widgetFooterButtonStyle2 == null) {
                return widgetFooterButtonStyle;
            }
            return widgetFooterButtonStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: m1 */
        public static final DesignSystemEnum m20318m1(String it) {
            AbstractC22676k.m65750j(it, "it");
            GraphPlotLabelStyle graphPlotLabelStyle = GraphPlotLabelStyle.NONE;
            for (GraphPlotLabelStyle graphPlotLabelStyle2 : GraphPlotLabelStyle.values()) {
                if (AbstractC22676k.m65745e(graphPlotLabelStyle2.name(), it)) {
                    if (graphPlotLabelStyle2 == null) {
                        return graphPlotLabelStyle;
                    }
                    return graphPlotLabelStyle2;
                }
            }
            graphPlotLabelStyle2 = null;
            if (graphPlotLabelStyle2 == null) {
                return graphPlotLabelStyle;
            }
            return graphPlotLabelStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x002d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x002e A[RETURN] */
        /* JADX INFO: renamed from: m2 */
        public static final DesignSystemEnum m20319m2(String it) {
            AbstractC22676k.m65750j(it, "it");
            String upperCase = it.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            WidgetFooterButtonType widgetFooterButtonType = WidgetFooterButtonType.UNKNOWN;
            for (WidgetFooterButtonType widgetFooterButtonType2 : WidgetFooterButtonType.values()) {
                if (AbstractC22676k.m65745e(widgetFooterButtonType2.name(), upperCase)) {
                    if (widgetFooterButtonType2 == null) {
                        return widgetFooterButtonType;
                    }
                    return widgetFooterButtonType2;
                }
            }
            widgetFooterButtonType2 = null;
            if (widgetFooterButtonType2 == null) {
                return widgetFooterButtonType;
            }
            return widgetFooterButtonType2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: n1 */
        public static final DesignSystemEnum m20322n1(String it) {
            AbstractC22676k.m65750j(it, "it");
            HeaderStyle headerStyle = HeaderStyle.NONE;
            for (HeaderStyle headerStyle2 : HeaderStyle.values()) {
                if (AbstractC22676k.m65745e(headerStyle2.name(), it)) {
                    if (headerStyle2 == null) {
                        return headerStyle;
                    }
                    return headerStyle2;
                }
            }
            headerStyle2 = null;
            if (headerStyle2 == null) {
                return headerStyle;
            }
            return headerStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x002d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x002e A[RETURN] */
        /* JADX INFO: renamed from: n2 */
        public static final DesignSystemEnum m20323n2(String it) {
            AbstractC22676k.m65750j(it, "it");
            String upperCase = it.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            WidgetStatus widgetStatus = WidgetStatus.DISABLED;
            for (WidgetStatus widgetStatus2 : WidgetStatus.values()) {
                if (AbstractC22676k.m65745e(widgetStatus2.name(), upperCase)) {
                    if (widgetStatus2 == null) {
                        return widgetStatus;
                    }
                    return widgetStatus2;
                }
            }
            widgetStatus2 = null;
            if (widgetStatus2 == null) {
                return widgetStatus;
            }
            return widgetStatus2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: o1 */
        public static final DesignSystemEnum m20326o1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC25200c enumC25200c = EnumC25200c.NORMAL;
            for (EnumC25200c enumC25200c2 : EnumC25200c.values()) {
                if (AbstractC22676k.m65745e(enumC25200c2.name(), it)) {
                    if (enumC25200c2 == null) {
                        return enumC25200c;
                    }
                    return enumC25200c2;
                }
            }
            enumC25200c2 = null;
            if (enumC25200c2 == null) {
                return enumC25200c;
            }
            return enumC25200c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: o2 */
        public static final DesignSystemEnum m20327o2(String it) {
            AbstractC22676k.m65750j(it, "it");
            ChartBackgroundStyle chartBackgroundStyle = ChartBackgroundStyle.DEFAULT;
            for (ChartBackgroundStyle chartBackgroundStyle2 : ChartBackgroundStyle.values()) {
                if (AbstractC22676k.m65745e(chartBackgroundStyle2.name(), it)) {
                    if (chartBackgroundStyle2 == null) {
                        return chartBackgroundStyle;
                    }
                    return chartBackgroundStyle2;
                }
            }
            chartBackgroundStyle2 = null;
            if (chartBackgroundStyle2 == null) {
                return chartBackgroundStyle;
            }
            return chartBackgroundStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: p1 */
        public static final DesignSystemEnum m20330p1(String it) {
            AbstractC22676k.m65750j(it, "it");
            HeartRateTileId heartRateTileId = HeartRateTileId.NONE;
            for (HeartRateTileId heartRateTileId2 : HeartRateTileId.values()) {
                if (AbstractC22676k.m65745e(heartRateTileId2.name(), it)) {
                    if (heartRateTileId2 == null) {
                        return heartRateTileId;
                    }
                    return heartRateTileId2;
                }
            }
            heartRateTileId2 = null;
            if (heartRateTileId2 == null) {
                return heartRateTileId;
            }
            return heartRateTileId2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: p2 */
        public static final DesignSystemEnum m20331p2(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC23701r0 enumC23701r0 = EnumC23701r0.EQUAL;
            for (EnumC23701r0 enumC23701r1 : EnumC23701r0.values()) {
                if (AbstractC22676k.m65745e(enumC23701r1.name(), it)) {
                    if (enumC23701r1 == null) {
                        return enumC23701r0;
                    }
                    return enumC23701r1;
                }
            }
            enumC23701r1 = null;
            if (enumC23701r1 == null) {
                return enumC23701r0;
            }
            return enumC23701r1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: q1 */
        public static final DesignSystemEnum m20334q1(String it) {
            AbstractC22676k.m65750j(it, "it");
            HeartRateTileStyle heartRateTileStyle = HeartRateTileStyle.NONE;
            for (HeartRateTileStyle heartRateTileStyle2 : HeartRateTileStyle.values()) {
                if (AbstractC22676k.m65745e(heartRateTileStyle2.name(), it)) {
                    if (heartRateTileStyle2 == null) {
                        return heartRateTileStyle;
                    }
                    return heartRateTileStyle2;
                }
            }
            heartRateTileStyle2 = null;
            if (heartRateTileStyle2 == null) {
                return heartRateTileStyle;
            }
            return heartRateTileStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: r1 */
        public static final DesignSystemEnum m20337r1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC22400l enumC22400l = EnumC22400l.NONE;
            for (EnumC22400l enumC22400l2 : EnumC22400l.values()) {
                if (AbstractC22676k.m65745e(enumC22400l2.name(), it)) {
                    if (enumC22400l2 == null) {
                        return enumC22400l;
                    }
                    return enumC22400l2;
                }
            }
            enumC22400l2 = null;
            if (enumC22400l2 == null) {
                return enumC22400l;
            }
            return enumC22400l2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: s1 */
        public static final DesignSystemEnum m20340s1(String it) {
            AbstractC22676k.m65750j(it, "it");
            HorizontalScrollBehavior horizontalScrollBehavior = HorizontalScrollBehavior.FREE;
            for (HorizontalScrollBehavior horizontalScrollBehavior2 : HorizontalScrollBehavior.values()) {
                if (AbstractC22676k.m65745e(horizontalScrollBehavior2.name(), it)) {
                    if (horizontalScrollBehavior2 == null) {
                        return horizontalScrollBehavior;
                    }
                    return horizontalScrollBehavior2;
                }
            }
            horizontalScrollBehavior2 = null;
            if (horizontalScrollBehavior2 == null) {
                return horizontalScrollBehavior;
            }
            return horizontalScrollBehavior2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: t1 */
        public static final DesignSystemEnum m20343t1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC16533a enumC16533a = EnumC16533a.DEFAULT;
            for (EnumC16533a enumC16533a2 : EnumC16533a.values()) {
                if (AbstractC22676k.m65745e(enumC16533a2.name(), it)) {
                    if (enumC16533a2 == null) {
                        return enumC16533a;
                    }
                    return enumC16533a2;
                }
            }
            enumC16533a2 = null;
            if (enumC16533a2 == null) {
                return enumC16533a;
            }
            return enumC16533a2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: u1 */
        public static final DesignSystemEnum m20346u1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC27272p enumC27272p = EnumC27272p.DEFAULT;
            for (EnumC27272p enumC27272p2 : EnumC27272p.values()) {
                if (AbstractC22676k.m65745e(enumC27272p2.name(), it)) {
                    if (enumC27272p2 == null) {
                        return enumC27272p;
                    }
                    return enumC27272p2;
                }
            }
            enumC27272p2 = null;
            if (enumC27272p2 == null) {
                return enumC27272p;
            }
            return enumC27272p2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: v1 */
        public static final DesignSystemEnum m20349v1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC35760a enumC35760a = EnumC35760a.STANDARD;
            for (EnumC35760a enumC35760a2 : EnumC35760a.values()) {
                if (AbstractC22676k.m65745e(enumC35760a2.name(), it)) {
                    if (enumC35760a2 == null) {
                        return enumC35760a;
                    }
                    return enumC35760a2;
                }
            }
            enumC35760a2 = null;
            if (enumC35760a2 == null) {
                return enumC35760a;
            }
            return enumC35760a2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: w1 */
        public static final DesignSystemEnum m20352w1(String it) {
            AbstractC22676k.m65750j(it, "it");
            BarStyle barStyle = BarStyle.STRAIN;
            for (BarStyle barStyle2 : BarStyle.values()) {
                if (AbstractC22676k.m65745e(barStyle2.name(), it)) {
                    if (barStyle2 == null) {
                        return barStyle;
                    }
                    return barStyle2;
                }
            }
            barStyle2 = null;
            if (barStyle2 == null) {
                return barStyle;
            }
            return barStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: x1 */
        public static final DesignSystemEnum m20355x1(String it) {
            AbstractC22676k.m65750j(it, "it");
            ProgressMeterStyle progressMeterStyle = ProgressMeterStyle.DEFAULT;
            for (ProgressMeterStyle progressMeterStyle2 : ProgressMeterStyle.values()) {
                if (AbstractC22676k.m65745e(progressMeterStyle2.name(), it)) {
                    if (progressMeterStyle2 == null) {
                        return progressMeterStyle;
                    }
                    return progressMeterStyle2;
                }
            }
            progressMeterStyle2 = null;
            if (progressMeterStyle2 == null) {
                return progressMeterStyle;
            }
            return progressMeterStyle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: y1 */
        public static final DesignSystemEnum m20358y1(String it) {
            AbstractC22676k.m65750j(it, "it");
            EnumC27267m0 enumC27267m0 = EnumC27267m0.DEFAULT;
            for (EnumC27267m0 enumC27267m1 : EnumC27267m0.values()) {
                if (AbstractC22676k.m65745e(enumC27267m1.name(), it)) {
                    if (enumC27267m1 == null) {
                        return enumC27267m0;
                    }
                    return enumC27267m1;
                }
            }
            enumC27267m1 = null;
            if (enumC27267m1 == null) {
                return enumC27267m0;
            }
            return enumC27267m1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: z1 */
        public static final DesignSystemEnum m20361z1(String it) {
            AbstractC22676k.m65750j(it, "it");
            SelectableCellListSearchBehavior selectableCellListSearchBehavior = SelectableCellListSearchBehavior.MATCHES_OR_SELECTED;
            for (SelectableCellListSearchBehavior selectableCellListSearchBehavior2 : SelectableCellListSearchBehavior.values()) {
                if (AbstractC22676k.m65745e(selectableCellListSearchBehavior2.name(), it)) {
                    if (selectableCellListSearchBehavior2 == null) {
                        return selectableCellListSearchBehavior;
                    }
                    return selectableCellListSearchBehavior2;
                }
            }
            selectableCellListSearchBehavior2 = null;
            if (selectableCellListSearchBehavior2 == null) {
                return selectableCellListSearchBehavior;
            }
            return selectableCellListSearchBehavior2;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public T read2(JsonReader in3) throws IOException {
            AbstractC22676k.m65750j(in3, "in");
            if (in3.peek() == JsonToken.NULL) {
                in3.nextNull();
                return null;
            }
            String strNextString = in3.nextString();
            AbstractC22676k.m65749i(strNextString, "nextString(...)");
            Map<String, Function1> map = f25677d;
            if (!map.containsKey(this.typeString)) {
                throw new IllegalStateException(AbstractC11895b.m31996o("enum ", this.typeString, " must be added to the DesignSystemEnumTypeAdapter map").toString());
            }
            Function1 function1 = map.get(this.typeString);
            AbstractC22676k.m65747g(function1);
            return (T) function1.invoke(strNextString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter out, T value) throws IOException {
            AbstractC22676k.m65750j(out, "out");
            if (value == 0) {
                out.nullValue();
            } else {
                if (!(value instanceof Enum)) {
                    throw new IllegalStateException(AbstractC18489d0.m53369j(value, "If value ", " isn't an enum you probably messed up").toString());
                }
                out.value(((Enum) value).name());
            }
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        AbstractC22676k.m65750j(gson, "gson");
        AbstractC22676k.m65750j(type, "type");
        if (!DesignSystemEnum.class.isAssignableFrom(type.getRawType()) || !type.getRawType().isEnum()) {
            return null;
        }
        String typeName = type.getRawType().getTypeName();
        AbstractC22676k.m65749i(typeName, "getTypeName(...)");
        return new DesignSystemEnumTypeAdapter(typeName);
    }
}
