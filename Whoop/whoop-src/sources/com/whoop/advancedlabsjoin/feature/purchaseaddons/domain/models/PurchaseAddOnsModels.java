package com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models;

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
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xa1.C38138a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;", "", "", "toolBarTitle", "initiallySelectedSegmentId", "", "Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionModel;", "sections", "", "Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/AdvanceLabsPurchaseAddOnsStickyModel;", "bottomStickyItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_join_release", "(Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolBarTitle", "getInitiallySelectedSegmentId", "Ljava/util/List;", "getSections", "Ljava/util/Map;", "getBottomStickyItems", "Companion", "$serializer", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PurchaseAddOnsModels {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, AdvanceLabsPurchaseAddOnsStickyModel> bottomStickyItems;
    private final String initiallySelectedSegmentId;
    private final List<PurchaseAddOnsSectionModel> sections;
    private final String toolBarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;", "serializer", "()Lwc3/c;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PurchaseAddOnsModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C38138a(8)), AbstractC30060g.m92087G(enumC23463i, new C38138a(9))};
    }

    public /* synthetic */ PurchaseAddOnsModels(int i13, String str, String str2, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PurchaseAddOnsModels$$serializer.INSTANCE.getDescriptor());
        }
        this.toolBarTitle = str;
        this.initiallySelectedSegmentId = str2;
        this.sections = list;
        this.bottomStickyItems = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(PurchaseAddOnsSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, AdvanceLabsPurchaseAddOnsStickyModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseAddOnsModels copy$default(PurchaseAddOnsModels purchaseAddOnsModels, String str, String str2, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = purchaseAddOnsModels.toolBarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = purchaseAddOnsModels.initiallySelectedSegmentId;
        }
        if ((i13 & 4) != 0) {
            list = purchaseAddOnsModels.sections;
        }
        if ((i13 & 8) != 0) {
            map = purchaseAddOnsModels.bottomStickyItems;
        }
        return purchaseAddOnsModels.copy(str, str2, list, map);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_join_release(PurchaseAddOnsModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.toolBarTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.initiallySelectedSegmentId);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.bottomStickyItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final List<PurchaseAddOnsSectionModel> component3() {
        return this.sections;
    }

    public final Map<String, AdvanceLabsPurchaseAddOnsStickyModel> component4() {
        return this.bottomStickyItems;
    }

    public final PurchaseAddOnsModels copy(String toolBarTitle, String initiallySelectedSegmentId, List<PurchaseAddOnsSectionModel> sections, Map<String, AdvanceLabsPurchaseAddOnsStickyModel> bottomStickyItems) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(sections, "sections");
        return new PurchaseAddOnsModels(toolBarTitle, initiallySelectedSegmentId, sections, bottomStickyItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseAddOnsModels)) {
            return false;
        }
        PurchaseAddOnsModels purchaseAddOnsModels = (PurchaseAddOnsModels) other;
        return AbstractC22676k.m65745e(this.toolBarTitle, purchaseAddOnsModels.toolBarTitle) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, purchaseAddOnsModels.initiallySelectedSegmentId) && AbstractC22676k.m65745e(this.sections, purchaseAddOnsModels.sections) && AbstractC22676k.m65745e(this.bottomStickyItems, purchaseAddOnsModels.bottomStickyItems);
    }

    public final Map<String, AdvanceLabsPurchaseAddOnsStickyModel> getBottomStickyItems() {
        return this.bottomStickyItems;
    }

    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final List<PurchaseAddOnsSectionModel> getSections() {
        return this.sections;
    }

    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    public int hashCode() {
        int iHashCode = this.toolBarTitle.hashCode() * 31;
        String str = this.initiallySelectedSegmentId;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.sections);
        Map<String, AdvanceLabsPurchaseAddOnsStickyModel> map = this.bottomStickyItems;
        return iM31983b + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.toolBarTitle;
        String str2 = this.initiallySelectedSegmentId;
        List<PurchaseAddOnsSectionModel> list = this.sections;
        Map<String, AdvanceLabsPurchaseAddOnsStickyModel> map = this.bottomStickyItems;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PurchaseAddOnsModels(toolBarTitle=", str, ", initiallySelectedSegmentId=", str2, ", sections=");
        sbM32001t.append(list);
        sbM32001t.append(", bottomStickyItems=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PurchaseAddOnsModels(String toolBarTitle, String str, List<PurchaseAddOnsSectionModel> sections, Map<String, AdvanceLabsPurchaseAddOnsStickyModel> map) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(sections, "sections");
        this.toolBarTitle = toolBarTitle;
        this.initiallySelectedSegmentId = str;
        this.sections = sections;
        this.bottomStickyItems = map;
    }
}
