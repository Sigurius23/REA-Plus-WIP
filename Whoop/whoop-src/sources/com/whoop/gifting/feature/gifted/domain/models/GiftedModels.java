package com.whoop.gifting.feature.gifted.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eb1.C13005a;
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
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&Jh\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006<"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;", "", "", "toolBarTitle", "alignment", "style", "", "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionModel;", "sections", "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;", "bottomStickyItems", "", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$gifting_release", "(Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;Ljava/util/Map;)Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolBarTitle", "getAlignment", "getStyle", "Ljava/util/List;", "getSections", "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;", "getBottomStickyItems", "Ljava/util/Map;", "getAnalytics", "Companion", "$serializer", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GiftedModels {
    private static final InterfaceC23462h[] $childSerializers;
    private final String alignment;
    private final Map<String, String> analytics;
    private final GiftedStickyModel bottomStickyItems;
    private final List<GiftedSectionModel> sections;
    private final String style;
    private final String toolBarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;", "serializer", "()Lwc3/c;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GiftedModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13005a(26)), null, AbstractC30060g.m92087G(enumC23463i, new C13005a(27))};
    }

    public /* synthetic */ GiftedModels(int i13, String str, String str2, String str3, List list, GiftedStickyModel giftedStickyModel, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, GiftedModels$$serializer.INSTANCE.getDescriptor());
        }
        this.toolBarTitle = str;
        this.alignment = str2;
        this.style = str3;
        this.sections = list;
        this.bottomStickyItems = giftedStickyModel;
        this.analytics = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GiftedSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftedModels copy$default(GiftedModels giftedModels, String str, String str2, String str3, List list, GiftedStickyModel giftedStickyModel, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = giftedModels.toolBarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = giftedModels.alignment;
        }
        if ((i13 & 4) != 0) {
            str3 = giftedModels.style;
        }
        if ((i13 & 8) != 0) {
            list = giftedModels.sections;
        }
        if ((i13 & 16) != 0) {
            giftedStickyModel = giftedModels.bottomStickyItems;
        }
        if ((i13 & 32) != 0) {
            map = giftedModels.analytics;
        }
        GiftedStickyModel giftedStickyModel2 = giftedStickyModel;
        Map map2 = map;
        return giftedModels.copy(str, str2, str3, list, giftedStickyModel2, map2);
    }

    public static final /* synthetic */ void write$Self$gifting_release(GiftedModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.toolBarTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.alignment);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.style);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 4, GiftedStickyModel$$serializer.INSTANCE, self.bottomStickyItems);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.analytics);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final List<GiftedSectionModel> component4() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GiftedStickyModel getBottomStickyItems() {
        return this.bottomStickyItems;
    }

    public final Map<String, String> component6() {
        return this.analytics;
    }

    public final GiftedModels copy(String toolBarTitle, String alignment, String style, List<GiftedSectionModel> sections, GiftedStickyModel bottomStickyItems, Map<String, String> analytics) {
        AbstractC22676k.m65750j(sections, "sections");
        return new GiftedModels(toolBarTitle, alignment, style, sections, bottomStickyItems, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftedModels)) {
            return false;
        }
        GiftedModels giftedModels = (GiftedModels) other;
        return AbstractC22676k.m65745e(this.toolBarTitle, giftedModels.toolBarTitle) && AbstractC22676k.m65745e(this.alignment, giftedModels.alignment) && AbstractC22676k.m65745e(this.style, giftedModels.style) && AbstractC22676k.m65745e(this.sections, giftedModels.sections) && AbstractC22676k.m65745e(this.bottomStickyItems, giftedModels.bottomStickyItems) && AbstractC22676k.m65745e(this.analytics, giftedModels.analytics);
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final Map<String, String> getAnalytics() {
        return this.analytics;
    }

    public final GiftedStickyModel getBottomStickyItems() {
        return this.bottomStickyItems;
    }

    public final List<GiftedSectionModel> getSections() {
        return this.sections;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    public int hashCode() {
        String str = this.toolBarTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alignment;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.sections);
        GiftedStickyModel giftedStickyModel = this.bottomStickyItems;
        int iHashCode3 = (iM31983b + (giftedStickyModel == null ? 0 : giftedStickyModel.hashCode())) * 31;
        Map<String, String> map = this.analytics;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.toolBarTitle;
        String str2 = this.alignment;
        String str3 = this.style;
        List<GiftedSectionModel> list = this.sections;
        GiftedStickyModel giftedStickyModel = this.bottomStickyItems;
        Map<String, String> map = this.analytics;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GiftedModels(toolBarTitle=", str, ", alignment=", str2, ", style=");
        AbstractC36095b.m114694v(str3, ", sections=", ", bottomStickyItems=", sbM32001t, list);
        sbM32001t.append(giftedStickyModel);
        sbM32001t.append(", analytics=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public GiftedModels(String str, String str2, String str3, List<GiftedSectionModel> sections, GiftedStickyModel giftedStickyModel, Map<String, String> map) {
        AbstractC22676k.m65750j(sections, "sections");
        this.toolBarTitle = str;
        this.alignment = str2;
        this.style = str3;
        this.sections = sections;
        this.bottomStickyItems = giftedStickyModel;
        this.analytics = map;
    }
}
