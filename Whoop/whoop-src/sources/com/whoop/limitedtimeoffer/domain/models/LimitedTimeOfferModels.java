package com.whoop.limitedtimeoffer.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlin.C2012k;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJh\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b7\u0010\u001e¨\u0006:"}, m65681d2 = {"Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;", "", "", "toolBarTitle", "imageUrl", "backgroundImageUrl", "", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;", "sections", "", "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;", "bottomStickyItems", "preSelectedId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$limited_time_offer_release", "(Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/util/Map;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolBarTitle", "getImageUrl", "getBackgroundImageUrl", "Ljava/util/List;", "getSections", "Ljava/util/Map;", "getBottomStickyItems", "getPreSelectedId", "Companion", "$serializer", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LimitedTimeOfferModels {
    private static final InterfaceC23462h[] $childSerializers;
    private final String backgroundImageUrl;
    private final Map<String, LtoStickyModel> bottomStickyItems;
    private final String imageUrl;
    private final String preSelectedId;
    private final List<LimitedTimeOfferSectionModel> sections;
    private final String toolBarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;", "serializer", "()Lwc3/c;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LimitedTimeOfferModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C2012k(3)), AbstractC30060g.m92087G(enumC23463i, new C2012k(4)), null};
    }

    public /* synthetic */ LimitedTimeOfferModels(int i13, String str, String str2, String str3, List list, Map map, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (57 != (i13 & 57)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 57, LimitedTimeOfferModels$$serializer.INSTANCE.getDescriptor());
        }
        this.toolBarTitle = str;
        if ((i13 & 2) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str2;
        }
        if ((i13 & 4) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str3;
        }
        this.sections = list;
        this.bottomStickyItems = map;
        this.preSelectedId = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LimitedTimeOfferSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, LtoStickyModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LimitedTimeOfferModels copy$default(LimitedTimeOfferModels limitedTimeOfferModels, String str, String str2, String str3, List list, Map map, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = limitedTimeOfferModels.toolBarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = limitedTimeOfferModels.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = limitedTimeOfferModels.backgroundImageUrl;
        }
        if ((i13 & 8) != 0) {
            list = limitedTimeOfferModels.sections;
        }
        if ((i13 & 16) != 0) {
            map = limitedTimeOfferModels.bottomStickyItems;
        }
        if ((i13 & 32) != 0) {
            str4 = limitedTimeOfferModels.preSelectedId;
        }
        Map map2 = map;
        String str5 = str4;
        return limitedTimeOfferModels.copy(str, str2, str3, list, map2, str5);
    }

    public static final /* synthetic */ void write$Self$limited_time_offer_release(LimitedTimeOfferModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.toolBarTitle);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.backgroundImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.backgroundImageUrl);
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.bottomStickyItems);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.preSelectedId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final List<LimitedTimeOfferSectionModel> component4() {
        return this.sections;
    }

    public final Map<String, LtoStickyModel> component5() {
        return this.bottomStickyItems;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPreSelectedId() {
        return this.preSelectedId;
    }

    public final LimitedTimeOfferModels copy(String toolBarTitle, String imageUrl, String backgroundImageUrl, List<LimitedTimeOfferSectionModel> sections, Map<String, LtoStickyModel> bottomStickyItems, String preSelectedId) {
        AbstractC22676k.m65750j(sections, "sections");
        return new LimitedTimeOfferModels(toolBarTitle, imageUrl, backgroundImageUrl, sections, bottomStickyItems, preSelectedId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitedTimeOfferModels)) {
            return false;
        }
        LimitedTimeOfferModels limitedTimeOfferModels = (LimitedTimeOfferModels) other;
        return AbstractC22676k.m65745e(this.toolBarTitle, limitedTimeOfferModels.toolBarTitle) && AbstractC22676k.m65745e(this.imageUrl, limitedTimeOfferModels.imageUrl) && AbstractC22676k.m65745e(this.backgroundImageUrl, limitedTimeOfferModels.backgroundImageUrl) && AbstractC22676k.m65745e(this.sections, limitedTimeOfferModels.sections) && AbstractC22676k.m65745e(this.bottomStickyItems, limitedTimeOfferModels.bottomStickyItems) && AbstractC22676k.m65745e(this.preSelectedId, limitedTimeOfferModels.preSelectedId);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final Map<String, LtoStickyModel> getBottomStickyItems() {
        return this.bottomStickyItems;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getPreSelectedId() {
        return this.preSelectedId;
    }

    public final List<LimitedTimeOfferSectionModel> getSections() {
        return this.sections;
    }

    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    public int hashCode() {
        String str = this.toolBarTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundImageUrl;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.sections);
        Map<String, LtoStickyModel> map = this.bottomStickyItems;
        int iHashCode3 = (iM31983b + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.preSelectedId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.toolBarTitle;
        String str2 = this.imageUrl;
        String str3 = this.backgroundImageUrl;
        List<LimitedTimeOfferSectionModel> list = this.sections;
        Map<String, LtoStickyModel> map = this.bottomStickyItems;
        String str4 = this.preSelectedId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LimitedTimeOfferModels(toolBarTitle=", str, ", imageUrl=", str2, ", backgroundImageUrl=");
        AbstractC36095b.m114694v(str3, ", sections=", ", bottomStickyItems=", sbM32001t, list);
        sbM32001t.append(map);
        sbM32001t.append(", preSelectedId=");
        sbM32001t.append(str4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public LimitedTimeOfferModels(String str, String str2, String str3, List<LimitedTimeOfferSectionModel> sections, Map<String, LtoStickyModel> map, String str4) {
        AbstractC22676k.m65750j(sections, "sections");
        this.toolBarTitle = str;
        this.imageUrl = str2;
        this.backgroundImageUrl = str3;
        this.sections = sections;
        this.bottomStickyItems = map;
        this.preSelectedId = str4;
    }

    public /* synthetic */ LimitedTimeOfferModels(String str, String str2, String str3, List list, Map map, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, list, map, str4);
    }
}
