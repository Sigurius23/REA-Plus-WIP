package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B¥\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u009c\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b>\u0010\u001cR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b?\u0010\u001cR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b@\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bA\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\bB\u0010\u0019¨\u0006E"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "descriptionDisplay", "", "bottomLabels", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;", "buttons", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;", "currentCycleGraphs", "lastSixCycleGraphs", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;", "segmentedControlDisplays", "selectedButtonId", "segmentedControlDisplayId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitleDisplay", "getDescriptionDisplay", "Ljava/util/Map;", "getBottomLabels", "Ljava/util/List;", "getButtons", "getCurrentCycleGraphs", "getLastSixCycleGraphs", "getSegmentedControlDisplays", "getSelectedButtonId", "getSegmentedControlDisplayId", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CurrentCycleTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> bottomLabels;
    private final List<GraphButton> buttons;
    private final Map<String, MciTrendsGraphModel> currentCycleGraphs;
    private final String descriptionDisplay;
    private final Map<String, MciTrendsGraphModel> lastSixCycleGraphs;
    private final String segmentedControlDisplayId;
    private final List<SegmentControlDisplay> segmentedControlDisplays;
    private final String selectedButtonId;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CurrentCycleTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C30526a(1)), AbstractC30060g.m92087G(enumC23463i, new C30526a(2)), AbstractC30060g.m92087G(enumC23463i, new C30526a(3)), AbstractC30060g.m92087G(enumC23463i, new C30526a(4)), AbstractC30060g.m92087G(enumC23463i, new C30526a(5)), null, null};
    }

    public /* synthetic */ CurrentCycleTileModel(int i13, String str, String str2, Map map, List list, Map map2, Map map3, List list2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, CurrentCycleTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.descriptionDisplay = str2;
        this.bottomLabels = map;
        this.buttons = list;
        this.currentCycleGraphs = map2;
        this.lastSixCycleGraphs = map3;
        this.segmentedControlDisplays = list2;
        this.selectedButtonId = str3;
        this.segmentedControlDisplayId = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GraphButton$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, MciTrendsGraphModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, MciTrendsGraphModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(SegmentControlDisplay$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentCycleTileModel copy$default(CurrentCycleTileModel currentCycleTileModel, String str, String str2, Map map, List list, Map map2, Map map3, List list2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = currentCycleTileModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = currentCycleTileModel.descriptionDisplay;
        }
        if ((i13 & 4) != 0) {
            map = currentCycleTileModel.bottomLabels;
        }
        if ((i13 & 8) != 0) {
            list = currentCycleTileModel.buttons;
        }
        if ((i13 & 16) != 0) {
            map2 = currentCycleTileModel.currentCycleGraphs;
        }
        if ((i13 & 32) != 0) {
            map3 = currentCycleTileModel.lastSixCycleGraphs;
        }
        if ((i13 & 64) != 0) {
            list2 = currentCycleTileModel.segmentedControlDisplays;
        }
        if ((i13 & 128) != 0) {
            str3 = currentCycleTileModel.selectedButtonId;
        }
        if ((i13 & 256) != 0) {
            str4 = currentCycleTileModel.segmentedControlDisplayId;
        }
        String str5 = str3;
        String str6 = str4;
        Map map4 = map3;
        List list3 = list2;
        Map map5 = map2;
        Map map6 = map;
        return currentCycleTileModel.copy(str, str2, map6, list, map5, map4, list3, str5, str6);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(CurrentCycleTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.descriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.bottomLabels);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.buttons);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.currentCycleGraphs);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.lastSixCycleGraphs);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.segmentedControlDisplays);
        output.encodeStringElement(serialDesc, 7, self.selectedButtonId);
        output.encodeStringElement(serialDesc, 8, self.segmentedControlDisplayId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final Map<String, String> component3() {
        return this.bottomLabels;
    }

    public final List<GraphButton> component4() {
        return this.buttons;
    }

    public final Map<String, MciTrendsGraphModel> component5() {
        return this.currentCycleGraphs;
    }

    public final Map<String, MciTrendsGraphModel> component6() {
        return this.lastSixCycleGraphs;
    }

    public final List<SegmentControlDisplay> component7() {
        return this.segmentedControlDisplays;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSelectedButtonId() {
        return this.selectedButtonId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSegmentedControlDisplayId() {
        return this.segmentedControlDisplayId;
    }

    public final CurrentCycleTileModel copy(String titleDisplay, String descriptionDisplay, Map<String, String> bottomLabels, List<GraphButton> buttons, Map<String, MciTrendsGraphModel> currentCycleGraphs, Map<String, MciTrendsGraphModel> lastSixCycleGraphs, List<SegmentControlDisplay> segmentedControlDisplays, String selectedButtonId, String segmentedControlDisplayId) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(currentCycleGraphs, "currentCycleGraphs");
        AbstractC22676k.m65750j(lastSixCycleGraphs, "lastSixCycleGraphs");
        AbstractC22676k.m65750j(segmentedControlDisplays, "segmentedControlDisplays");
        AbstractC22676k.m65750j(selectedButtonId, "selectedButtonId");
        AbstractC22676k.m65750j(segmentedControlDisplayId, "segmentedControlDisplayId");
        return new CurrentCycleTileModel(titleDisplay, descriptionDisplay, bottomLabels, buttons, currentCycleGraphs, lastSixCycleGraphs, segmentedControlDisplays, selectedButtonId, segmentedControlDisplayId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentCycleTileModel)) {
            return false;
        }
        CurrentCycleTileModel currentCycleTileModel = (CurrentCycleTileModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, currentCycleTileModel.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, currentCycleTileModel.descriptionDisplay) && AbstractC22676k.m65745e(this.bottomLabels, currentCycleTileModel.bottomLabels) && AbstractC22676k.m65745e(this.buttons, currentCycleTileModel.buttons) && AbstractC22676k.m65745e(this.currentCycleGraphs, currentCycleTileModel.currentCycleGraphs) && AbstractC22676k.m65745e(this.lastSixCycleGraphs, currentCycleTileModel.lastSixCycleGraphs) && AbstractC22676k.m65745e(this.segmentedControlDisplays, currentCycleTileModel.segmentedControlDisplays) && AbstractC22676k.m65745e(this.selectedButtonId, currentCycleTileModel.selectedButtonId) && AbstractC22676k.m65745e(this.segmentedControlDisplayId, currentCycleTileModel.segmentedControlDisplayId);
    }

    public final Map<String, String> getBottomLabels() {
        return this.bottomLabels;
    }

    public final List<GraphButton> getButtons() {
        return this.buttons;
    }

    public final Map<String, MciTrendsGraphModel> getCurrentCycleGraphs() {
        return this.currentCycleGraphs;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final Map<String, MciTrendsGraphModel> getLastSixCycleGraphs() {
        return this.lastSixCycleGraphs;
    }

    public final String getSegmentedControlDisplayId() {
        return this.segmentedControlDisplayId;
    }

    public final List<SegmentControlDisplay> getSegmentedControlDisplays() {
        return this.segmentedControlDisplays;
    }

    public final String getSelectedButtonId() {
        return this.selectedButtonId;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.descriptionDisplay);
        Map<String, String> map = this.bottomLabels;
        return this.segmentedControlDisplayId.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC3855a.m11821e(this.lastSixCycleGraphs, AbstractC3855a.m11821e(this.currentCycleGraphs, AbstractC11895b.m31983b((iM30450d + (map == null ? 0 : map.hashCode())) * 31, 31, this.buttons), 31), 31), 31, this.segmentedControlDisplays), 31, this.selectedButtonId);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.descriptionDisplay;
        Map<String, String> map = this.bottomLabels;
        List<GraphButton> list = this.buttons;
        Map<String, MciTrendsGraphModel> map2 = this.currentCycleGraphs;
        Map<String, MciTrendsGraphModel> map3 = this.lastSixCycleGraphs;
        List<SegmentControlDisplay> list2 = this.segmentedControlDisplays;
        String str3 = this.selectedButtonId;
        String str4 = this.segmentedControlDisplayId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CurrentCycleTileModel(titleDisplay=", str, ", descriptionDisplay=", str2, ", bottomLabels=");
        sbM32001t.append(map);
        sbM32001t.append(", buttons=");
        sbM32001t.append(list);
        sbM32001t.append(", currentCycleGraphs=");
        AbstractC3855a.m11840x(sbM32001t, map2, ", lastSixCycleGraphs=", map3, ", segmentedControlDisplays=");
        AbstractC17176i.m48511m(", selectedButtonId=", str3, ", segmentedControlDisplayId=", sbM32001t, list2);
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public CurrentCycleTileModel(String titleDisplay, String descriptionDisplay, Map<String, String> map, List<GraphButton> buttons, Map<String, MciTrendsGraphModel> currentCycleGraphs, Map<String, MciTrendsGraphModel> lastSixCycleGraphs, List<SegmentControlDisplay> segmentedControlDisplays, String selectedButtonId, String segmentedControlDisplayId) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(currentCycleGraphs, "currentCycleGraphs");
        AbstractC22676k.m65750j(lastSixCycleGraphs, "lastSixCycleGraphs");
        AbstractC22676k.m65750j(segmentedControlDisplays, "segmentedControlDisplays");
        AbstractC22676k.m65750j(selectedButtonId, "selectedButtonId");
        AbstractC22676k.m65750j(segmentedControlDisplayId, "segmentedControlDisplayId");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.bottomLabels = map;
        this.buttons = buttons;
        this.currentCycleGraphs = currentCycleGraphs;
        this.lastSixCycleGraphs = lastSixCycleGraphs;
        this.segmentedControlDisplays = segmentedControlDisplays;
        this.selectedButtonId = selectedButtonId;
        this.segmentedControlDisplayId = segmentedControlDisplayId;
    }
}
