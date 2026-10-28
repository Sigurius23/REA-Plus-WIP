package com.whoop.communityeverydaystats.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.models.TrendStateEnum;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xo1.C38492a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BCBY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jr\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010&R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010*¨\u0006D"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "value", "valueSuffix", "previousValue", "Lcom/whoop/design/models/TrendStateEnum;", "trendState", "", "Lcom/whoop/design/models/LegendStyle;", "barStyles", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_everyday_stats_release", "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/design/models/TrendStateEnum;", "component7", "()Ljava/util/List;", "component8", "()Lcom/whoop/design/models/items/graph/GraphModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/TrendStateEnum;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getValue", "getValueSuffix", "getPreviousValue", "Lcom/whoop/design/models/TrendStateEnum;", "getTrendState", "Ljava/util/List;", "getBarStyles", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Companion", "$serializer", "a", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SnapshotMetricCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<LegendStyle> barStyles;
    private final GraphModel graph;
    private final String id;
    private final String previousValue;
    private final String title;
    private final TrendStateEnum trendState;
    private final String value;
    private final String valueSuffix;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.communityeverydaystats.domain.models.SnapshotMetricCardModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;", "serializer", "()Lwc3/c;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SnapshotMetricCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C38492a(9)), AbstractC30060g.m92087G(enumC23463i, new C38492a(10)), null};
    }

    public /* synthetic */ SnapshotMetricCardModel(int i13, String str, String str2, String str3, String str4, String str5, TrendStateEnum trendStateEnum, List list, GraphModel graphModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, SnapshotMetricCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.value = str3;
        this.valueSuffix = str4;
        this.previousValue = str5;
        this.trendState = trendStateEnum;
        this.barStyles = list;
        this.graph = graphModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.TrendStateEnum", TrendStateEnum.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(LegendStyle.INSTANCE.serializer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SnapshotMetricCardModel copy$default(SnapshotMetricCardModel snapshotMetricCardModel, String str, String str2, String str3, String str4, String str5, TrendStateEnum trendStateEnum, List list, GraphModel graphModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = snapshotMetricCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = snapshotMetricCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = snapshotMetricCardModel.value;
        }
        if ((i13 & 8) != 0) {
            str4 = snapshotMetricCardModel.valueSuffix;
        }
        if ((i13 & 16) != 0) {
            str5 = snapshotMetricCardModel.previousValue;
        }
        if ((i13 & 32) != 0) {
            trendStateEnum = snapshotMetricCardModel.trendState;
        }
        if ((i13 & 64) != 0) {
            list = snapshotMetricCardModel.barStyles;
        }
        if ((i13 & 128) != 0) {
            graphModel = snapshotMetricCardModel.graph;
        }
        List list2 = list;
        GraphModel graphModel2 = graphModel;
        String str6 = str5;
        TrendStateEnum trendStateEnum2 = trendStateEnum;
        return snapshotMetricCardModel.copy(str, str2, str3, str4, str6, trendStateEnum2, list2, graphModel2);
    }

    public static final /* synthetic */ void write$Self$community_everyday_stats_release(SnapshotMetricCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.value);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.valueSuffix);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.previousValue);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.trendState);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.barStyles);
        output.encodeNullableSerializableElement(serialDesc, 7, GraphModel$$serializer.INSTANCE, self.graph);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPreviousValue() {
        return this.previousValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TrendStateEnum getTrendState() {
        return this.trendState;
    }

    public final List<LegendStyle> component7() {
        return this.barStyles;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    public final SnapshotMetricCardModel copy(String id4, String title, String value, String valueSuffix, String previousValue, TrendStateEnum trendState, List<? extends LegendStyle> barStyles, GraphModel graph) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        return new SnapshotMetricCardModel(id4, title, value, valueSuffix, previousValue, trendState, barStyles, graph);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapshotMetricCardModel)) {
            return false;
        }
        SnapshotMetricCardModel snapshotMetricCardModel = (SnapshotMetricCardModel) other;
        return AbstractC22676k.m65745e(this.id, snapshotMetricCardModel.id) && AbstractC22676k.m65745e(this.title, snapshotMetricCardModel.title) && AbstractC22676k.m65745e(this.value, snapshotMetricCardModel.value) && AbstractC22676k.m65745e(this.valueSuffix, snapshotMetricCardModel.valueSuffix) && AbstractC22676k.m65745e(this.previousValue, snapshotMetricCardModel.previousValue) && this.trendState == snapshotMetricCardModel.trendState && AbstractC22676k.m65745e(this.barStyles, snapshotMetricCardModel.barStyles) && AbstractC22676k.m65745e(this.graph, snapshotMetricCardModel.graph);
    }

    public final List<LegendStyle> getBarStyles() {
        return this.barStyles;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPreviousValue() {
        return this.previousValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TrendStateEnum getTrendState() {
        return this.trendState;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.value);
        String str2 = this.valueSuffix;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previousValue;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        TrendStateEnum trendStateEnum = this.trendState;
        int iHashCode3 = (iHashCode2 + (trendStateEnum == null ? 0 : trendStateEnum.hashCode())) * 31;
        List<LegendStyle> list = this.barStyles;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        GraphModel graphModel = this.graph;
        return iHashCode4 + (graphModel != null ? graphModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.value;
        String str4 = this.valueSuffix;
        String str5 = this.previousValue;
        TrendStateEnum trendStateEnum = this.trendState;
        List<LegendStyle> list = this.barStyles;
        GraphModel graphModel = this.graph;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SnapshotMetricCardModel(id=", str, ", title=", str2, ", value=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", valueSuffix=", str4, ", previousValue=");
        sbM32001t.append(str5);
        sbM32001t.append(", trendState=");
        sbM32001t.append(trendStateEnum);
        sbM32001t.append(", barStyles=");
        sbM32001t.append(list);
        sbM32001t.append(", graph=");
        sbM32001t.append(graphModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotMetricCardModel(String str, String title, String value, String str2, String str3, TrendStateEnum trendStateEnum, List<? extends LegendStyle> list, GraphModel graphModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        this.id = str;
        this.title = title;
        this.value = value;
        this.valueSuffix = str2;
        this.previousValue = str3;
        this.trendState = trendStateEnum;
        this.barStyles = list;
        this.graph = graphModel;
    }
}
