package com.whoop.advancedlabsjoin.feature.join.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
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
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qa1.C30112a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010#Jd\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010!R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b5\u0010#¨\u00068"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;", "", "", "toolBarTitle", "initiallySelectedSegmentId", "", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;", "sections", "", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;", "bottomStickyItems", "Lcom/whoop/design/models/DesignSystemModel;", "featuresBySegment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_join_release", "(Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/util/Map;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolBarTitle", "getInitiallySelectedSegmentId", "Ljava/util/List;", "getSections", "Ljava/util/Map;", "getBottomStickyItems", "getFeaturesBySegment", "Companion", "$serializer", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdvancedLabsJoinModels {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, AdvanceLabsJoinStickyModel> bottomStickyItems;
    private final Map<String, DesignSystemModel> featuresBySegment;
    private final String initiallySelectedSegmentId;
    private final List<AdvancedLabsJoinSectionModel> sections;
    private final String toolBarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;", "serializer", "()Lwc3/c;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdvancedLabsJoinModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C30112a(18)), AbstractC30060g.m92087G(enumC23463i, new C30112a(19)), AbstractC30060g.m92087G(enumC23463i, new C30112a(20))};
    }

    public /* synthetic */ AdvancedLabsJoinModels(int i13, String str, String str2, List list, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, AdvancedLabsJoinModels$$serializer.INSTANCE.getDescriptor());
        }
        this.toolBarTitle = str;
        this.initiallySelectedSegmentId = str2;
        this.sections = list;
        this.bottomStickyItems = map;
        this.featuresBySegment = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AdvancedLabsJoinSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, AdvanceLabsJoinStickyModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new LinkedHashMapSerializer(stringSerializer, new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedLabsJoinModels copy$default(AdvancedLabsJoinModels advancedLabsJoinModels, String str, String str2, List list, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = advancedLabsJoinModels.toolBarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = advancedLabsJoinModels.initiallySelectedSegmentId;
        }
        if ((i13 & 4) != 0) {
            list = advancedLabsJoinModels.sections;
        }
        if ((i13 & 8) != 0) {
            map = advancedLabsJoinModels.bottomStickyItems;
        }
        if ((i13 & 16) != 0) {
            map2 = advancedLabsJoinModels.featuresBySegment;
        }
        Map map3 = map2;
        List list2 = list;
        return advancedLabsJoinModels.copy(str, str2, list2, map, map3);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_join_release(AdvancedLabsJoinModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.toolBarTitle);
        output.encodeStringElement(serialDesc, 1, self.initiallySelectedSegmentId);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.bottomStickyItems);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.featuresBySegment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final List<AdvancedLabsJoinSectionModel> component3() {
        return this.sections;
    }

    public final Map<String, AdvanceLabsJoinStickyModel> component4() {
        return this.bottomStickyItems;
    }

    public final Map<String, DesignSystemModel> component5() {
        return this.featuresBySegment;
    }

    public final AdvancedLabsJoinModels copy(String toolBarTitle, String initiallySelectedSegmentId, List<AdvancedLabsJoinSectionModel> sections, Map<String, AdvanceLabsJoinStickyModel> bottomStickyItems, Map<String, ? extends DesignSystemModel> featuresBySegment) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(initiallySelectedSegmentId, "initiallySelectedSegmentId");
        AbstractC22676k.m65750j(sections, "sections");
        return new AdvancedLabsJoinModels(toolBarTitle, initiallySelectedSegmentId, sections, bottomStickyItems, featuresBySegment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLabsJoinModels)) {
            return false;
        }
        AdvancedLabsJoinModels advancedLabsJoinModels = (AdvancedLabsJoinModels) other;
        return AbstractC22676k.m65745e(this.toolBarTitle, advancedLabsJoinModels.toolBarTitle) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, advancedLabsJoinModels.initiallySelectedSegmentId) && AbstractC22676k.m65745e(this.sections, advancedLabsJoinModels.sections) && AbstractC22676k.m65745e(this.bottomStickyItems, advancedLabsJoinModels.bottomStickyItems) && AbstractC22676k.m65745e(this.featuresBySegment, advancedLabsJoinModels.featuresBySegment);
    }

    public final Map<String, AdvanceLabsJoinStickyModel> getBottomStickyItems() {
        return this.bottomStickyItems;
    }

    public final Map<String, DesignSystemModel> getFeaturesBySegment() {
        return this.featuresBySegment;
    }

    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final List<AdvancedLabsJoinSectionModel> getSections() {
        return this.sections;
    }

    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.toolBarTitle.hashCode() * 31, 31, this.initiallySelectedSegmentId), 31, this.sections);
        Map<String, AdvanceLabsJoinStickyModel> map = this.bottomStickyItems;
        int iHashCode = (iM31983b + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, DesignSystemModel> map2 = this.featuresBySegment;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        String str = this.toolBarTitle;
        String str2 = this.initiallySelectedSegmentId;
        List<AdvancedLabsJoinSectionModel> list = this.sections;
        Map<String, AdvanceLabsJoinStickyModel> map = this.bottomStickyItems;
        Map<String, DesignSystemModel> map2 = this.featuresBySegment;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AdvancedLabsJoinModels(toolBarTitle=", str, ", initiallySelectedSegmentId=", str2, ", sections=");
        sbM32001t.append(list);
        sbM32001t.append(", bottomStickyItems=");
        sbM32001t.append(map);
        sbM32001t.append(", featuresBySegment=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedLabsJoinModels(String toolBarTitle, String initiallySelectedSegmentId, List<AdvancedLabsJoinSectionModel> sections, Map<String, AdvanceLabsJoinStickyModel> map, Map<String, ? extends DesignSystemModel> map2) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(initiallySelectedSegmentId, "initiallySelectedSegmentId");
        AbstractC22676k.m65750j(sections, "sections");
        this.toolBarTitle = toolBarTitle;
        this.initiallySelectedSegmentId = initiallySelectedSegmentId;
        this.sections = sections;
        this.bottomStickyItems = map;
        this.featuresBySegment = map2;
    }
}
