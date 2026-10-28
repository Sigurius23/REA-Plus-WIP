package com.whoop.gifting.feature.gifting.domain.models;

import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.design.models.items.CountrySelectorModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l72.C23399f;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011B\u007f\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u001e\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010&J~\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010$R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010*R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b@\u0010&¨\u0006C"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "", "", "toolBarTitle", "initiallySelectedSegmentId", "", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;", "sections", "", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;", "bottomStickyItems", "Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;", "bottomCommonStickyItems", "Lcom/whoop/design/models/items/CountrySelectorModel;", "countrySelector", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$gifting_release", "(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/util/Map;", "component5", "()Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;", "component6", "()Lcom/whoop/design/models/items/CountrySelectorModel;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolBarTitle", "getInitiallySelectedSegmentId", "Ljava/util/List;", "getSections", "Ljava/util/Map;", "getBottomStickyItems", "Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;", "getBottomCommonStickyItems", "Lcom/whoop/design/models/items/CountrySelectorModel;", "getCountrySelector", "getAnalytics", "Companion", "$serializer", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GiftingModels {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> analytics;
    private final BottomStickyItemsModel bottomCommonStickyItems;
    private final Map<String, GiftingStickyModel> bottomStickyItems;
    private final CountrySelectorModel countrySelector;
    private final String initiallySelectedSegmentId;
    private final List<GiftingSectionModel> sections;
    private final String toolBarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "serializer", "()Lwc3/c;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GiftingModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C23399f(26)), AbstractC30060g.m92087G(enumC23463i, new C23399f(27)), null, null, AbstractC30060g.m92087G(enumC23463i, new C23399f(28))};
    }

    public /* synthetic */ GiftingModels(int i13, String str, String str2, List list, Map map, BottomStickyItemsModel bottomStickyItemsModel, CountrySelectorModel countrySelectorModel, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, GiftingModels$$serializer.INSTANCE.getDescriptor());
        }
        this.toolBarTitle = str;
        this.initiallySelectedSegmentId = str2;
        this.sections = list;
        if ((i13 & 8) == 0) {
            this.bottomStickyItems = null;
        } else {
            this.bottomStickyItems = map;
        }
        if ((i13 & 16) == 0) {
            this.bottomCommonStickyItems = null;
        } else {
            this.bottomCommonStickyItems = bottomStickyItemsModel;
        }
        if ((i13 & 32) == 0) {
            this.countrySelector = null;
        } else {
            this.countrySelector = countrySelectorModel;
        }
        if ((i13 & 64) == 0) {
            this.analytics = null;
        } else {
            this.analytics = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GiftingSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, GiftingStickyModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftingModels copy$default(GiftingModels giftingModels, String str, String str2, List list, Map map, BottomStickyItemsModel bottomStickyItemsModel, CountrySelectorModel countrySelectorModel, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = giftingModels.toolBarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = giftingModels.initiallySelectedSegmentId;
        }
        if ((i13 & 4) != 0) {
            list = giftingModels.sections;
        }
        if ((i13 & 8) != 0) {
            map = giftingModels.bottomStickyItems;
        }
        if ((i13 & 16) != 0) {
            bottomStickyItemsModel = giftingModels.bottomCommonStickyItems;
        }
        if ((i13 & 32) != 0) {
            countrySelectorModel = giftingModels.countrySelector;
        }
        if ((i13 & 64) != 0) {
            map2 = giftingModels.analytics;
        }
        CountrySelectorModel countrySelectorModel2 = countrySelectorModel;
        Map map3 = map2;
        BottomStickyItemsModel bottomStickyItemsModel2 = bottomStickyItemsModel;
        List list2 = list;
        return giftingModels.copy(str, str2, list2, map, bottomStickyItemsModel2, countrySelectorModel2, map3);
    }

    public static final /* synthetic */ void write$Self$gifting_release(GiftingModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.toolBarTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.initiallySelectedSegmentId);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.bottomStickyItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.bottomStickyItems);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.bottomCommonStickyItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BottomStickyItemsModel$$serializer.INSTANCE, self.bottomCommonStickyItems);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.countrySelector != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, CountrySelectorModel$$serializer.INSTANCE, self.countrySelector);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.analytics == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.analytics);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final List<GiftingSectionModel> component3() {
        return this.sections;
    }

    public final Map<String, GiftingStickyModel> component4() {
        return this.bottomStickyItems;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BottomStickyItemsModel getBottomCommonStickyItems() {
        return this.bottomCommonStickyItems;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CountrySelectorModel getCountrySelector() {
        return this.countrySelector;
    }

    public final Map<String, String> component7() {
        return this.analytics;
    }

    public final GiftingModels copy(String toolBarTitle, String initiallySelectedSegmentId, List<GiftingSectionModel> sections, Map<String, GiftingStickyModel> bottomStickyItems, BottomStickyItemsModel bottomCommonStickyItems, CountrySelectorModel countrySelector, Map<String, String> analytics) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(sections, "sections");
        return new GiftingModels(toolBarTitle, initiallySelectedSegmentId, sections, bottomStickyItems, bottomCommonStickyItems, countrySelector, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftingModels)) {
            return false;
        }
        GiftingModels giftingModels = (GiftingModels) other;
        return AbstractC22676k.m65745e(this.toolBarTitle, giftingModels.toolBarTitle) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, giftingModels.initiallySelectedSegmentId) && AbstractC22676k.m65745e(this.sections, giftingModels.sections) && AbstractC22676k.m65745e(this.bottomStickyItems, giftingModels.bottomStickyItems) && AbstractC22676k.m65745e(this.bottomCommonStickyItems, giftingModels.bottomCommonStickyItems) && AbstractC22676k.m65745e(this.countrySelector, giftingModels.countrySelector) && AbstractC22676k.m65745e(this.analytics, giftingModels.analytics);
    }

    public final Map<String, String> getAnalytics() {
        return this.analytics;
    }

    public final BottomStickyItemsModel getBottomCommonStickyItems() {
        return this.bottomCommonStickyItems;
    }

    public final Map<String, GiftingStickyModel> getBottomStickyItems() {
        return this.bottomStickyItems;
    }

    public final CountrySelectorModel getCountrySelector() {
        return this.countrySelector;
    }

    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final List<GiftingSectionModel> getSections() {
        return this.sections;
    }

    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    public int hashCode() {
        int iHashCode = this.toolBarTitle.hashCode() * 31;
        String str = this.initiallySelectedSegmentId;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.sections);
        Map<String, GiftingStickyModel> map = this.bottomStickyItems;
        int iHashCode2 = (iM31983b + (map == null ? 0 : map.hashCode())) * 31;
        BottomStickyItemsModel bottomStickyItemsModel = this.bottomCommonStickyItems;
        int iHashCode3 = (iHashCode2 + (bottomStickyItemsModel == null ? 0 : bottomStickyItemsModel.hashCode())) * 31;
        CountrySelectorModel countrySelectorModel = this.countrySelector;
        int iHashCode4 = (iHashCode3 + (countrySelectorModel == null ? 0 : countrySelectorModel.hashCode())) * 31;
        Map<String, String> map2 = this.analytics;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        String str = this.toolBarTitle;
        String str2 = this.initiallySelectedSegmentId;
        List<GiftingSectionModel> list = this.sections;
        Map<String, GiftingStickyModel> map = this.bottomStickyItems;
        BottomStickyItemsModel bottomStickyItemsModel = this.bottomCommonStickyItems;
        CountrySelectorModel countrySelectorModel = this.countrySelector;
        Map<String, String> map2 = this.analytics;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GiftingModels(toolBarTitle=", str, ", initiallySelectedSegmentId=", str2, ", sections=");
        sbM32001t.append(list);
        sbM32001t.append(", bottomStickyItems=");
        sbM32001t.append(map);
        sbM32001t.append(", bottomCommonStickyItems=");
        sbM32001t.append(bottomStickyItemsModel);
        sbM32001t.append(", countrySelector=");
        sbM32001t.append(countrySelectorModel);
        sbM32001t.append(", analytics=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    public GiftingModels(String toolBarTitle, String str, List<GiftingSectionModel> sections, Map<String, GiftingStickyModel> map, BottomStickyItemsModel bottomStickyItemsModel, CountrySelectorModel countrySelectorModel, Map<String, String> map2) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(sections, "sections");
        this.toolBarTitle = toolBarTitle;
        this.initiallySelectedSegmentId = str;
        this.sections = sections;
        this.bottomStickyItems = map;
        this.bottomCommonStickyItems = bottomStickyItemsModel;
        this.countrySelector = countrySelectorModel;
        this.analytics = map2;
    }

    public /* synthetic */ GiftingModels(String str, String str2, List list, Map map, BottomStickyItemsModel bottomStickyItemsModel, CountrySelectorModel countrySelectorModel, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i13 & 8) != 0 ? null : map, (i13 & 16) != 0 ? null : bottomStickyItemsModel, (i13 & 32) != 0 ? null : countrySelectorModel, (i13 & 64) != 0 ? null : map2);
    }
}
