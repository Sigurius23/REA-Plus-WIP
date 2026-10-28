package com.whoop.navigation;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import j02.C21137d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB{\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0082\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b<\u0010\u001e¨\u0006@"}, m65681d2 = {"Lcom/whoop/navigation/UniversalBuyNowScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "sku", "packSku", "", "childItemSkus", "wywSku", "bandSku", "claspSku", "hookSku", "fastLinkSku", "storeDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/UniversalBuyNowScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/UniversalBuyNowScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSku", "getPackSku", "Ljava/util/List;", "getChildItemSkus", "getWywSku", "getBandSku", "getClaspSku", "getHookSku", "getFastLinkSku", "getStoreDomain", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UniversalBuyNowScreenModel implements CommonNavigationScreenModel {
    private final String bandSku;
    private final List<String> childItemSkus;
    private final String claspSku;
    private final String fastLinkSku;
    private final String hookSku;
    private final String packSku;
    private final String sku;
    private final String storeDomain;
    private final String wywSku;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21137d0(27)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.navigation.UniversalBuyNowScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/UniversalBuyNowScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/UniversalBuyNowScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UniversalBuyNowScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UniversalBuyNowScreenModel(int i13, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, UniversalBuyNowScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.sku = str;
        this.packSku = str2;
        this.childItemSkus = list;
        this.wywSku = str3;
        this.bandSku = str4;
        this.claspSku = str5;
        this.hookSku = str6;
        this.fastLinkSku = str7;
        this.storeDomain = str8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalBuyNowScreenModel copy$default(UniversalBuyNowScreenModel universalBuyNowScreenModel, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = universalBuyNowScreenModel.sku;
        }
        if ((i13 & 2) != 0) {
            str2 = universalBuyNowScreenModel.packSku;
        }
        if ((i13 & 4) != 0) {
            list = universalBuyNowScreenModel.childItemSkus;
        }
        if ((i13 & 8) != 0) {
            str3 = universalBuyNowScreenModel.wywSku;
        }
        if ((i13 & 16) != 0) {
            str4 = universalBuyNowScreenModel.bandSku;
        }
        if ((i13 & 32) != 0) {
            str5 = universalBuyNowScreenModel.claspSku;
        }
        if ((i13 & 64) != 0) {
            str6 = universalBuyNowScreenModel.hookSku;
        }
        if ((i13 & 128) != 0) {
            str7 = universalBuyNowScreenModel.fastLinkSku;
        }
        if ((i13 & 256) != 0) {
            str8 = universalBuyNowScreenModel.storeDomain;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        List list2 = list;
        return universalBuyNowScreenModel.copy(str, str2, list2, str3, str13, str11, str12, str9, str10);
    }

    public static final /* synthetic */ void write$Self$navigation_release(UniversalBuyNowScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.sku);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.packSku);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.childItemSkus);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.wywSku);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.bandSku);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.claspSku);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.hookSku);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.fastLinkSku);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.storeDomain);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackSku() {
        return this.packSku;
    }

    public final List<String> component3() {
        return this.childItemSkus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWywSku() {
        return this.wywSku;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBandSku() {
        return this.bandSku;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getClaspSku() {
        return this.claspSku;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHookSku() {
        return this.hookSku;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFastLinkSku() {
        return this.fastLinkSku;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStoreDomain() {
        return this.storeDomain;
    }

    public final UniversalBuyNowScreenModel copy(String sku, String packSku, List<String> childItemSkus, String wywSku, String bandSku, String claspSku, String hookSku, String fastLinkSku, String storeDomain) {
        return new UniversalBuyNowScreenModel(sku, packSku, childItemSkus, wywSku, bandSku, claspSku, hookSku, fastLinkSku, storeDomain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalBuyNowScreenModel)) {
            return false;
        }
        UniversalBuyNowScreenModel universalBuyNowScreenModel = (UniversalBuyNowScreenModel) other;
        return AbstractC22676k.m65745e(this.sku, universalBuyNowScreenModel.sku) && AbstractC22676k.m65745e(this.packSku, universalBuyNowScreenModel.packSku) && AbstractC22676k.m65745e(this.childItemSkus, universalBuyNowScreenModel.childItemSkus) && AbstractC22676k.m65745e(this.wywSku, universalBuyNowScreenModel.wywSku) && AbstractC22676k.m65745e(this.bandSku, universalBuyNowScreenModel.bandSku) && AbstractC22676k.m65745e(this.claspSku, universalBuyNowScreenModel.claspSku) && AbstractC22676k.m65745e(this.hookSku, universalBuyNowScreenModel.hookSku) && AbstractC22676k.m65745e(this.fastLinkSku, universalBuyNowScreenModel.fastLinkSku) && AbstractC22676k.m65745e(this.storeDomain, universalBuyNowScreenModel.storeDomain);
    }

    public final String getBandSku() {
        return this.bandSku;
    }

    public final List<String> getChildItemSkus() {
        return this.childItemSkus;
    }

    public final String getClaspSku() {
        return this.claspSku;
    }

    public final String getFastLinkSku() {
        return this.fastLinkSku;
    }

    public final String getHookSku() {
        return this.hookSku;
    }

    public final String getPackSku() {
        return this.packSku;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getStoreDomain() {
        return this.storeDomain;
    }

    public final String getWywSku() {
        return this.wywSku;
    }

    public int hashCode() {
        String str = this.sku;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packSku;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.childItemSkus;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.wywSku;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bandSku;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.claspSku;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hookSku;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fastLinkSku;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.storeDomain;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.sku;
        String str2 = this.packSku;
        List<String> list = this.childItemSkus;
        String str3 = this.wywSku;
        String str4 = this.bandSku;
        String str5 = this.claspSku;
        String str6 = this.hookSku;
        String str7 = this.fastLinkSku;
        String str8 = this.storeDomain;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UniversalBuyNowScreenModel(sku=", str, ", packSku=", str2, ", childItemSkus=");
        AbstractC17176i.m48511m(", wywSku=", str3, ", bandSku=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str4, ", claspSku=", str5, ", hookSku=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", fastLinkSku=", str7, ", storeDomain=");
        return AbstractC25012a.m73376i(str8, ")", sbM32001t);
    }

    public UniversalBuyNowScreenModel(String str, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.sku = str;
        this.packSku = str2;
        this.childItemSkus = list;
        this.wywSku = str3;
        this.bandSku = str4;
        this.claspSku = str5;
        this.hookSku = str6;
        this.fastLinkSku = str7;
        this.storeDomain = str8;
    }
}
