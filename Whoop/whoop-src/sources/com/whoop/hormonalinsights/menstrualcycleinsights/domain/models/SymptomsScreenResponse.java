package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay$$serializer;
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
import qo1.C30527b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "", "", "navigationTitle", "", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;", "segmentedControlDisplays", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;", "currentCycleSegment", "lastThreeCyclesSegment", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "Ljava/util/List;", "getSegmentedControlDisplays", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;", "getCurrentCycleSegment", "getLastThreeCyclesSegment", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SymptomsScreenResponse {
    private final SymptomsSegmentModel currentCycleSegment;
    private final SymptomsSegmentModel lastThreeCyclesSegment;
    private final String navigationTitle;
    private final List<SegmentControlDisplay> segmentedControlDisplays;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30527b(9)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SymptomsScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SymptomsScreenResponse(int i13, String str, List list, SymptomsSegmentModel symptomsSegmentModel, SymptomsSegmentModel symptomsSegmentModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SymptomsScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.segmentedControlDisplays = list;
        this.currentCycleSegment = symptomsSegmentModel;
        this.lastThreeCyclesSegment = symptomsSegmentModel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SegmentControlDisplay$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SymptomsScreenResponse copy$default(SymptomsScreenResponse symptomsScreenResponse, String str, List list, SymptomsSegmentModel symptomsSegmentModel, SymptomsSegmentModel symptomsSegmentModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = symptomsScreenResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            list = symptomsScreenResponse.segmentedControlDisplays;
        }
        if ((i13 & 4) != 0) {
            symptomsSegmentModel = symptomsScreenResponse.currentCycleSegment;
        }
        if ((i13 & 8) != 0) {
            symptomsSegmentModel2 = symptomsScreenResponse.lastThreeCyclesSegment;
        }
        return symptomsScreenResponse.copy(str, list, symptomsSegmentModel, symptomsSegmentModel2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(SymptomsScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.segmentedControlDisplays);
        SymptomsSegmentModel$$serializer symptomsSegmentModel$$serializer = SymptomsSegmentModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, symptomsSegmentModel$$serializer, self.currentCycleSegment);
        output.encodeSerializableElement(serialDesc, 3, symptomsSegmentModel$$serializer, self.lastThreeCyclesSegment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<SegmentControlDisplay> component2() {
        return this.segmentedControlDisplays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SymptomsSegmentModel getCurrentCycleSegment() {
        return this.currentCycleSegment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SymptomsSegmentModel getLastThreeCyclesSegment() {
        return this.lastThreeCyclesSegment;
    }

    public final SymptomsScreenResponse copy(String navigationTitle, List<SegmentControlDisplay> segmentedControlDisplays, SymptomsSegmentModel currentCycleSegment, SymptomsSegmentModel lastThreeCyclesSegment) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(segmentedControlDisplays, "segmentedControlDisplays");
        AbstractC22676k.m65750j(currentCycleSegment, "currentCycleSegment");
        AbstractC22676k.m65750j(lastThreeCyclesSegment, "lastThreeCyclesSegment");
        return new SymptomsScreenResponse(navigationTitle, segmentedControlDisplays, currentCycleSegment, lastThreeCyclesSegment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymptomsScreenResponse)) {
            return false;
        }
        SymptomsScreenResponse symptomsScreenResponse = (SymptomsScreenResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, symptomsScreenResponse.navigationTitle) && AbstractC22676k.m65745e(this.segmentedControlDisplays, symptomsScreenResponse.segmentedControlDisplays) && AbstractC22676k.m65745e(this.currentCycleSegment, symptomsScreenResponse.currentCycleSegment) && AbstractC22676k.m65745e(this.lastThreeCyclesSegment, symptomsScreenResponse.lastThreeCyclesSegment);
    }

    public final SymptomsSegmentModel getCurrentCycleSegment() {
        return this.currentCycleSegment;
    }

    public final SymptomsSegmentModel getLastThreeCyclesSegment() {
        return this.lastThreeCyclesSegment;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<SegmentControlDisplay> getSegmentedControlDisplays() {
        return this.segmentedControlDisplays;
    }

    public int hashCode() {
        return this.lastThreeCyclesSegment.hashCode() + ((this.currentCycleSegment.hashCode() + AbstractC11895b.m31983b(this.navigationTitle.hashCode() * 31, 31, this.segmentedControlDisplays)) * 31);
    }

    public String toString() {
        String str = this.navigationTitle;
        List<SegmentControlDisplay> list = this.segmentedControlDisplays;
        SymptomsSegmentModel symptomsSegmentModel = this.currentCycleSegment;
        SymptomsSegmentModel symptomsSegmentModel2 = this.lastThreeCyclesSegment;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SymptomsScreenResponse(navigationTitle=", str, ", segmentedControlDisplays=", ", currentCycleSegment=", list);
        sbM94766o.append(symptomsSegmentModel);
        sbM94766o.append(", lastThreeCyclesSegment=");
        sbM94766o.append(symptomsSegmentModel2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public SymptomsScreenResponse(String navigationTitle, List<SegmentControlDisplay> segmentedControlDisplays, SymptomsSegmentModel currentCycleSegment, SymptomsSegmentModel lastThreeCyclesSegment) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(segmentedControlDisplays, "segmentedControlDisplays");
        AbstractC22676k.m65750j(currentCycleSegment, "currentCycleSegment");
        AbstractC22676k.m65750j(lastThreeCyclesSegment, "lastThreeCyclesSegment");
        this.navigationTitle = navigationTitle;
        this.segmentedControlDisplays = segmentedControlDisplays;
        this.currentCycleSegment = currentCycleSegment;
        this.lastThreeCyclesSegment = lastThreeCyclesSegment;
    }
}
