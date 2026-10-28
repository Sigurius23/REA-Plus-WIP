package com.whoop.hormonalinsights.pregnancyinsights.domain.models;

import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsSegmentModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsSegmentModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj1.C24474b;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001f¨\u00061"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "", "", "navigationTitle", "", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;", "segmentedControlDisplays", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsSegmentModel;", "segments", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "Ljava/util/List;", "getSegmentedControlDisplays", "Ljava/util/Map;", "getSegments", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GenericSymptomsScreenResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String navigationTitle;
    private final List<SegmentControlDisplay> segmentedControlDisplays;
    private final Map<String, SymptomsSegmentModel> segments;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GenericSymptomsScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C24474b(14)), AbstractC30060g.m92087G(enumC23463i, new C24474b(15))};
    }

    public /* synthetic */ GenericSymptomsScreenResponse(int i13, String str, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, GenericSymptomsScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.segmentedControlDisplays = list;
        this.segments = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SegmentControlDisplay$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, SymptomsSegmentModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericSymptomsScreenResponse copy$default(GenericSymptomsScreenResponse genericSymptomsScreenResponse, String str, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = genericSymptomsScreenResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            list = genericSymptomsScreenResponse.segmentedControlDisplays;
        }
        if ((i13 & 4) != 0) {
            map = genericSymptomsScreenResponse.segments;
        }
        return genericSymptomsScreenResponse.copy(str, list, map);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(GenericSymptomsScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.segmentedControlDisplays);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.segments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<SegmentControlDisplay> component2() {
        return this.segmentedControlDisplays;
    }

    public final Map<String, SymptomsSegmentModel> component3() {
        return this.segments;
    }

    public final GenericSymptomsScreenResponse copy(String navigationTitle, List<SegmentControlDisplay> segmentedControlDisplays, Map<String, SymptomsSegmentModel> segments) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(segmentedControlDisplays, "segmentedControlDisplays");
        AbstractC22676k.m65750j(segments, "segments");
        return new GenericSymptomsScreenResponse(navigationTitle, segmentedControlDisplays, segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericSymptomsScreenResponse)) {
            return false;
        }
        GenericSymptomsScreenResponse genericSymptomsScreenResponse = (GenericSymptomsScreenResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, genericSymptomsScreenResponse.navigationTitle) && AbstractC22676k.m65745e(this.segmentedControlDisplays, genericSymptomsScreenResponse.segmentedControlDisplays) && AbstractC22676k.m65745e(this.segments, genericSymptomsScreenResponse.segments);
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<SegmentControlDisplay> getSegmentedControlDisplays() {
        return this.segmentedControlDisplays;
    }

    public final Map<String, SymptomsSegmentModel> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        return this.segments.hashCode() + AbstractC11895b.m31983b(this.navigationTitle.hashCode() * 31, 31, this.segmentedControlDisplays);
    }

    public String toString() {
        String str = this.navigationTitle;
        List<SegmentControlDisplay> list = this.segmentedControlDisplays;
        return AbstractC13673n.m38565l(AbstractC30802r.m94766o("GenericSymptomsScreenResponse(navigationTitle=", str, ", segmentedControlDisplays=", ", segments=", list), this.segments, ")");
    }

    public GenericSymptomsScreenResponse(String navigationTitle, List<SegmentControlDisplay> segmentedControlDisplays, Map<String, SymptomsSegmentModel> segments) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(segmentedControlDisplays, "segmentedControlDisplays");
        AbstractC22676k.m65750j(segments, "segments");
        this.navigationTitle = navigationTitle;
        this.segmentedControlDisplays = segmentedControlDisplays;
        this.segments = segments;
    }
}
