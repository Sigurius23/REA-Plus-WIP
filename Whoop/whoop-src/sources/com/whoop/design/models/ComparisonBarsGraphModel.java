package com.whoop.design.models;

import c13.AbstractC3855a;
import com.whoop.core.details.network.model.C6451a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/ComparisonBarsGraphModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "graphType", "", "Lcom/whoop/design/models/BarsModel;", "bars", "Lcom/whoop/design/models/LegendEntryModel;", "legendEntries", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/ComparisonBarsGraphModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/ComparisonBarsGraphModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGraphType", "Ljava/util/List;", "getBars", "getLegendEntries", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ComparisonBarsGraphModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<BarsModel> bars;
    private final String graphType;
    private final List<LegendEntryModel> legendEntries;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/ComparisonBarsGraphModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/ComparisonBarsGraphModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ComparisonBarsGraphModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C6451a(27)), AbstractC30060g.m92087G(enumC23463i, new C6451a(28))};
    }

    public /* synthetic */ ComparisonBarsGraphModel(int i13, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ComparisonBarsGraphModel$$serializer.INSTANCE.getDescriptor());
        }
        this.graphType = str;
        this.bars = list;
        this.legendEntries = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BarsModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(LegendEntryModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComparisonBarsGraphModel copy$default(ComparisonBarsGraphModel comparisonBarsGraphModel, String str, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = comparisonBarsGraphModel.graphType;
        }
        if ((i13 & 2) != 0) {
            list = comparisonBarsGraphModel.bars;
        }
        if ((i13 & 4) != 0) {
            list2 = comparisonBarsGraphModel.legendEntries;
        }
        return comparisonBarsGraphModel.copy(str, list, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ComparisonBarsGraphModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.graphType);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.bars);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.legendEntries);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGraphType() {
        return this.graphType;
    }

    public final List<BarsModel> component2() {
        return this.bars;
    }

    public final List<LegendEntryModel> component3() {
        return this.legendEntries;
    }

    public final ComparisonBarsGraphModel copy(String graphType, List<BarsModel> bars, List<LegendEntryModel> legendEntries) {
        AbstractC22676k.m65750j(graphType, "graphType");
        AbstractC22676k.m65750j(bars, "bars");
        return new ComparisonBarsGraphModel(graphType, bars, legendEntries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComparisonBarsGraphModel)) {
            return false;
        }
        ComparisonBarsGraphModel comparisonBarsGraphModel = (ComparisonBarsGraphModel) other;
        return AbstractC22676k.m65745e(this.graphType, comparisonBarsGraphModel.graphType) && AbstractC22676k.m65745e(this.bars, comparisonBarsGraphModel.bars) && AbstractC22676k.m65745e(this.legendEntries, comparisonBarsGraphModel.legendEntries);
    }

    public final List<BarsModel> getBars() {
        return this.bars;
    }

    public final String getGraphType() {
        return this.graphType;
    }

    public final List<LegendEntryModel> getLegendEntries() {
        return this.legendEntries;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.graphType.hashCode() * 31, 31, this.bars);
        List<LegendEntryModel> list = this.legendEntries;
        return iM31983b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.graphType;
        List<BarsModel> list = this.bars;
        return AbstractC3855a.m11829m(AbstractC30802r.m94766o("ComparisonBarsGraphModel(graphType=", str, ", bars=", ", legendEntries=", list), this.legendEntries, ")");
    }

    public ComparisonBarsGraphModel(String graphType, List<BarsModel> bars, List<LegendEntryModel> list) {
        AbstractC22676k.m65750j(graphType, "graphType");
        AbstractC22676k.m65750j(bars, "bars");
        this.graphType = graphType;
        this.bars = bars;
        this.legendEntries = list;
    }
}
