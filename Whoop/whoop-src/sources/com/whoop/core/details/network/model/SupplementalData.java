package com.whoop.core.details.network.model;

import c13.AbstractC3855a;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.HorizontalStatModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b-\u0010\u001a¨\u00060"}, m65681d2 = {"Lcom/whoop/core/details/network/model/SupplementalData;", "", "", "Lcom/whoop/core/details/network/model/CoreDetailsSegmentedControl;", "segmentedControls", "Lcom/whoop/core/details/network/model/SupplementalGraph;", "supplementalGraphs", "Lcom/whoop/design/models/items/HorizontalStatModel;", "horizontalStats", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/SupplementalData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/core/details/network/model/SupplementalData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSegmentedControls", "getSegmentedControls$annotations", "()V", "getSupplementalGraphs", "getHorizontalStats", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SupplementalData {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<HorizontalStatModel> horizontalStats;
    private final List<CoreDetailsSegmentedControl> segmentedControls;
    private final List<SupplementalGraph> supplementalGraphs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/SupplementalData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/SupplementalData;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SupplementalData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C6451a(19)), AbstractC30060g.m92087G(enumC23463i, new C6451a(20)), AbstractC30060g.m92087G(enumC23463i, new C6451a(21))};
    }

    public /* synthetic */ SupplementalData(int i13, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SupplementalData$$serializer.INSTANCE.getDescriptor());
        }
        this.segmentedControls = list;
        this.supplementalGraphs = list2;
        this.horizontalStats = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CoreDetailsSegmentedControl$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(SupplementalGraph$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(HorizontalStatModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupplementalData copy$default(SupplementalData supplementalData, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = supplementalData.segmentedControls;
        }
        if ((i13 & 2) != 0) {
            list2 = supplementalData.supplementalGraphs;
        }
        if ((i13 & 4) != 0) {
            list3 = supplementalData.horizontalStats;
        }
        return supplementalData.copy(list, list2, list3);
    }

    @InterfaceC37143h("segmented_control_display")
    public static /* synthetic */ void getSegmentedControls$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_details_release(SupplementalData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.segmentedControls);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.supplementalGraphs);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.horizontalStats);
    }

    public final List<CoreDetailsSegmentedControl> component1() {
        return this.segmentedControls;
    }

    public final List<SupplementalGraph> component2() {
        return this.supplementalGraphs;
    }

    public final List<HorizontalStatModel> component3() {
        return this.horizontalStats;
    }

    public final SupplementalData copy(List<CoreDetailsSegmentedControl> segmentedControls, List<SupplementalGraph> supplementalGraphs, List<HorizontalStatModel> horizontalStats) {
        AbstractC22676k.m65750j(segmentedControls, "segmentedControls");
        AbstractC22676k.m65750j(supplementalGraphs, "supplementalGraphs");
        AbstractC22676k.m65750j(horizontalStats, "horizontalStats");
        return new SupplementalData(segmentedControls, supplementalGraphs, horizontalStats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupplementalData)) {
            return false;
        }
        SupplementalData supplementalData = (SupplementalData) other;
        return AbstractC22676k.m65745e(this.segmentedControls, supplementalData.segmentedControls) && AbstractC22676k.m65745e(this.supplementalGraphs, supplementalData.supplementalGraphs) && AbstractC22676k.m65745e(this.horizontalStats, supplementalData.horizontalStats);
    }

    public final List<HorizontalStatModel> getHorizontalStats() {
        return this.horizontalStats;
    }

    public final List<CoreDetailsSegmentedControl> getSegmentedControls() {
        return this.segmentedControls;
    }

    public final List<SupplementalGraph> getSupplementalGraphs() {
        return this.supplementalGraphs;
    }

    public int hashCode() {
        return this.horizontalStats.hashCode() + AbstractC11895b.m31983b(this.segmentedControls.hashCode() * 31, 31, this.supplementalGraphs);
    }

    public String toString() {
        List<CoreDetailsSegmentedControl> list = this.segmentedControls;
        List<SupplementalGraph> list2 = this.supplementalGraphs;
        return AbstractC3855a.m11829m(AbstractC38963t7.m124380j("SupplementalData(segmentedControls=", ", supplementalGraphs=", list, ", horizontalStats=", list2), this.horizontalStats, ")");
    }

    public SupplementalData(List<CoreDetailsSegmentedControl> segmentedControls, List<SupplementalGraph> supplementalGraphs, List<HorizontalStatModel> horizontalStats) {
        AbstractC22676k.m65750j(segmentedControls, "segmentedControls");
        AbstractC22676k.m65750j(supplementalGraphs, "supplementalGraphs");
        AbstractC22676k.m65750j(horizontalStats, "horizontalStats");
        this.segmentedControls = segmentedControls;
        this.supplementalGraphs = supplementalGraphs;
        this.horizontalStats = horizontalStats;
    }
}
