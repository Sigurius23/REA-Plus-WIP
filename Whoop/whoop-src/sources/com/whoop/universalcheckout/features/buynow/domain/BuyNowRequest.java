package com.whoop.universalcheckout.features.buynow.domain;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p734sl0.C32581a1;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0085\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u008a\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0016R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b>\u0010\u0016¨\u0006B"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;", "", "", "idempotencyKey", "storeDomain", "sku", "packSku", "", "childItemSkus", "wywSku", "bandSku", "claspSku", "hookSku", "fastLinkSku", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getIdempotencyKey", "getStoreDomain", "getSku", "getPackSku", "Ljava/util/List;", "getChildItemSkus", "getWywSku", "getBandSku", "getClaspSku", "getHookSku", "getFastLinkSku", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BuyNowRequest {
    private final String bandSku;
    private final List<String> childItemSkus;
    private final String claspSku;
    private final String fastLinkSku;
    private final String hookSku;
    private final String idempotencyKey;
    private final String packSku;
    private final String sku;
    private final String storeDomain;
    private final String wywSku;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32581a1(20)), null, null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.domain.BuyNowRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BuyNowRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BuyNowRequest(int i13, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, BuyNowRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.idempotencyKey = str;
        this.storeDomain = str2;
        this.sku = str3;
        this.packSku = str4;
        this.childItemSkus = list;
        this.wywSku = str5;
        this.bandSku = str6;
        this.claspSku = str7;
        this.hookSku = str8;
        this.fastLinkSku = str9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyNowRequest copy$default(BuyNowRequest buyNowRequest, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buyNowRequest.idempotencyKey;
        }
        if ((i13 & 2) != 0) {
            str2 = buyNowRequest.storeDomain;
        }
        if ((i13 & 4) != 0) {
            str3 = buyNowRequest.sku;
        }
        if ((i13 & 8) != 0) {
            str4 = buyNowRequest.packSku;
        }
        if ((i13 & 16) != 0) {
            list = buyNowRequest.childItemSkus;
        }
        if ((i13 & 32) != 0) {
            str5 = buyNowRequest.wywSku;
        }
        if ((i13 & 64) != 0) {
            str6 = buyNowRequest.bandSku;
        }
        if ((i13 & 128) != 0) {
            str7 = buyNowRequest.claspSku;
        }
        if ((i13 & 256) != 0) {
            str8 = buyNowRequest.hookSku;
        }
        if ((i13 & 512) != 0) {
            str9 = buyNowRequest.fastLinkSku;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        List list2 = list;
        String str14 = str5;
        return buyNowRequest.copy(str, str2, str3, str4, list2, str14, str12, str13, str10, str11);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(BuyNowRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.idempotencyKey);
        output.encodeStringElement(serialDesc, 1, self.storeDomain);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.sku);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.packSku);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.childItemSkus);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.wywSku);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.bandSku);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.claspSku);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.hookSku);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.fastLinkSku);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFastLinkSku() {
        return this.fastLinkSku;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStoreDomain() {
        return this.storeDomain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPackSku() {
        return this.packSku;
    }

    public final List<String> component5() {
        return this.childItemSkus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWywSku() {
        return this.wywSku;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBandSku() {
        return this.bandSku;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getClaspSku() {
        return this.claspSku;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHookSku() {
        return this.hookSku;
    }

    public final BuyNowRequest copy(String idempotencyKey, String storeDomain, String sku, String packSku, List<String> childItemSkus, String wywSku, String bandSku, String claspSku, String hookSku, String fastLinkSku) {
        AbstractC22676k.m65750j(idempotencyKey, "idempotencyKey");
        AbstractC22676k.m65750j(storeDomain, "storeDomain");
        return new BuyNowRequest(idempotencyKey, storeDomain, sku, packSku, childItemSkus, wywSku, bandSku, claspSku, hookSku, fastLinkSku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyNowRequest)) {
            return false;
        }
        BuyNowRequest buyNowRequest = (BuyNowRequest) other;
        return AbstractC22676k.m65745e(this.idempotencyKey, buyNowRequest.idempotencyKey) && AbstractC22676k.m65745e(this.storeDomain, buyNowRequest.storeDomain) && AbstractC22676k.m65745e(this.sku, buyNowRequest.sku) && AbstractC22676k.m65745e(this.packSku, buyNowRequest.packSku) && AbstractC22676k.m65745e(this.childItemSkus, buyNowRequest.childItemSkus) && AbstractC22676k.m65745e(this.wywSku, buyNowRequest.wywSku) && AbstractC22676k.m65745e(this.bandSku, buyNowRequest.bandSku) && AbstractC22676k.m65745e(this.claspSku, buyNowRequest.claspSku) && AbstractC22676k.m65745e(this.hookSku, buyNowRequest.hookSku) && AbstractC22676k.m65745e(this.fastLinkSku, buyNowRequest.fastLinkSku);
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

    public final String getIdempotencyKey() {
        return this.idempotencyKey;
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
        int iM30450d = AbstractC11266d.m30450d(this.idempotencyKey.hashCode() * 31, 31, this.storeDomain);
        String str = this.sku;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
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
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.idempotencyKey;
        String str2 = this.storeDomain;
        String str3 = this.sku;
        String str4 = this.packSku;
        List<String> list = this.childItemSkus;
        String str5 = this.wywSku;
        String str6 = this.bandSku;
        String str7 = this.claspSku;
        String str8 = this.hookSku;
        String str9 = this.fastLinkSku;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BuyNowRequest(idempotencyKey=", str, ", storeDomain=", str2, ", sku=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", packSku=", str4, ", childItemSkus=");
        AbstractC17176i.m48511m(", wywSku=", str5, ", bandSku=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str6, ", claspSku=", str7, ", hookSku=");
        return AbstractC11266d.m30464r(sbM32001t, str8, ", fastLinkSku=", str9, ")");
    }

    public BuyNowRequest(String idempotencyKey, String storeDomain, String str, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7) {
        AbstractC22676k.m65750j(idempotencyKey, "idempotencyKey");
        AbstractC22676k.m65750j(storeDomain, "storeDomain");
        this.idempotencyKey = idempotencyKey;
        this.storeDomain = storeDomain;
        this.sku = str;
        this.packSku = str2;
        this.childItemSkus = list;
        this.wywSku = str3;
        this.bandSku = str4;
        this.claspSku = str5;
        this.hookSku = str6;
        this.fastLinkSku = str7;
    }
}
