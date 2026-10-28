package com.whoop.nativestore.pdp.domain.model;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
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
import zz1.C41253a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LMB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014B£\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010!J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J¤\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u001a\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010!R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010%R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bG\u0010!R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bH\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010)¨\u0006N"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "", "", "sku", "price", "", "priceAmount", "priceCurrencyCode", "discountedPrice", "", "images", "", "imagesWithLabels", "", "hasStock", "Lkotlinx/serialization/json/JsonElement;", "attributes", "productAccordionEntries", "productTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Ljava/util/Map;", "component8", "()Z", "component9", "component10", "component11", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getSku", "getPrice", "I", "getPriceAmount", "getPriceCurrencyCode", "getDiscountedPrice", "Ljava/util/List;", "getImages", "Ljava/util/Map;", "getImagesWithLabels", "Z", "getHasStock", "getAttributes", "getProductAccordionEntries", "Lkotlinx/serialization/json/JsonElement;", "getProductTag", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VariantOption {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<JsonElement> attributes;
    private final String discountedPrice;
    private final boolean hasStock;
    private final List<String> images;
    private final Map<String, String> imagesWithLabels;
    private final String price;
    private final int priceAmount;
    private final String priceCurrencyCode;
    private final List<JsonElement> productAccordionEntries;
    private final JsonElement productTag;
    private final String sku;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.VariantOption$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/VariantOption$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VariantOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C41253a(9)), AbstractC30060g.m92087G(enumC23463i, new C41253a(10)), null, AbstractC30060g.m92087G(enumC23463i, new C41253a(11)), AbstractC30060g.m92087G(enumC23463i, new C41253a(12)), null};
    }

    public /* synthetic */ VariantOption(int i13, String str, String str2, int i14, String str3, String str4, List list, Map map, boolean z4, List list2, List list3, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i13 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 11, VariantOption$$serializer.INSTANCE.getDescriptor());
        }
        this.sku = str;
        this.price = str2;
        if ((i13 & 4) == 0) {
            this.priceAmount = 0;
        } else {
            this.priceAmount = i14;
        }
        this.priceCurrencyCode = str3;
        if ((i13 & 16) == 0) {
            this.discountedPrice = null;
        } else {
            this.discountedPrice = str4;
        }
        int i15 = i13 & 32;
        C25271y c25271y = C25271y.f99162w;
        if (i15 == 0) {
            this.images = c25271y;
        } else {
            this.images = list;
        }
        if ((i13 & 64) == 0) {
            this.imagesWithLabels = null;
        } else {
            this.imagesWithLabels = map;
        }
        if ((i13 & 128) == 0) {
            this.hasStock = false;
        } else {
            this.hasStock = z4;
        }
        if ((i13 & 256) == 0) {
            this.attributes = null;
        } else {
            this.attributes = list2;
        }
        if ((i13 & 512) == 0) {
            this.productAccordionEntries = c25271y;
        } else {
            this.productAccordionEntries = list3;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.productTag = null;
        } else {
            this.productTag = jsonElement;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(C0771n.f2806a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(C0771n.f2806a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VariantOption copy$default(VariantOption variantOption, String str, String str2, int i13, String str3, String str4, List list, Map map, boolean z4, List list2, List list3, JsonElement jsonElement, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = variantOption.sku;
        }
        if ((i14 & 2) != 0) {
            str2 = variantOption.price;
        }
        if ((i14 & 4) != 0) {
            i13 = variantOption.priceAmount;
        }
        if ((i14 & 8) != 0) {
            str3 = variantOption.priceCurrencyCode;
        }
        if ((i14 & 16) != 0) {
            str4 = variantOption.discountedPrice;
        }
        if ((i14 & 32) != 0) {
            list = variantOption.images;
        }
        if ((i14 & 64) != 0) {
            map = variantOption.imagesWithLabels;
        }
        if ((i14 & 128) != 0) {
            z4 = variantOption.hasStock;
        }
        if ((i14 & 256) != 0) {
            list2 = variantOption.attributes;
        }
        if ((i14 & 512) != 0) {
            list3 = variantOption.productAccordionEntries;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            jsonElement = variantOption.productTag;
        }
        List list4 = list3;
        JsonElement jsonElement2 = jsonElement;
        boolean z13 = z4;
        List list5 = list2;
        List list6 = list;
        Map map2 = map;
        String str5 = str4;
        int i15 = i13;
        return variantOption.copy(str, str2, i15, str3, str5, list6, map2, z13, list5, list4, jsonElement2);
    }

    public static final /* synthetic */ void write$Self$native_store_release(VariantOption self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.sku);
        output.encodeStringElement(serialDesc, 1, self.price);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.priceAmount != 0) {
            output.encodeIntElement(serialDesc, 2, self.priceAmount);
        }
        output.encodeStringElement(serialDesc, 3, self.priceCurrencyCode);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.discountedPrice != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.discountedPrice);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 5);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.images, c25271y)) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.images);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.imagesWithLabels != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.imagesWithLabels);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.hasStock) {
            output.encodeBooleanElement(serialDesc, 7, self.hasStock);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.attributes != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.attributes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.productAccordionEntries, c25271y)) {
            output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.productAccordionEntries);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.productTag == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, C0771n.f2806a, self.productTag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    public final List<JsonElement> component10() {
        return this.productAccordionEntries;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final JsonElement getProductTag() {
        return this.productTag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPriceAmount() {
        return this.priceAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final List<String> component6() {
        return this.images;
    }

    public final Map<String, String> component7() {
        return this.imagesWithLabels;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHasStock() {
        return this.hasStock;
    }

    public final List<JsonElement> component9() {
        return this.attributes;
    }

    public final VariantOption copy(String sku, String price, int priceAmount, String priceCurrencyCode, String discountedPrice, List<String> images, Map<String, String> imagesWithLabels, boolean hasStock, List<? extends JsonElement> attributes, List<? extends JsonElement> productAccordionEntries, JsonElement productTag) {
        AbstractC22676k.m65750j(sku, "sku");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(priceCurrencyCode, "priceCurrencyCode");
        AbstractC22676k.m65750j(images, "images");
        AbstractC22676k.m65750j(productAccordionEntries, "productAccordionEntries");
        return new VariantOption(sku, price, priceAmount, priceCurrencyCode, discountedPrice, images, imagesWithLabels, hasStock, attributes, productAccordionEntries, productTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariantOption)) {
            return false;
        }
        VariantOption variantOption = (VariantOption) other;
        return AbstractC22676k.m65745e(this.sku, variantOption.sku) && AbstractC22676k.m65745e(this.price, variantOption.price) && this.priceAmount == variantOption.priceAmount && AbstractC22676k.m65745e(this.priceCurrencyCode, variantOption.priceCurrencyCode) && AbstractC22676k.m65745e(this.discountedPrice, variantOption.discountedPrice) && AbstractC22676k.m65745e(this.images, variantOption.images) && AbstractC22676k.m65745e(this.imagesWithLabels, variantOption.imagesWithLabels) && this.hasStock == variantOption.hasStock && AbstractC22676k.m65745e(this.attributes, variantOption.attributes) && AbstractC22676k.m65745e(this.productAccordionEntries, variantOption.productAccordionEntries) && AbstractC22676k.m65745e(this.productTag, variantOption.productTag);
    }

    public final List<JsonElement> getAttributes() {
        return this.attributes;
    }

    public final String getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final boolean getHasStock() {
        return this.hasStock;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final Map<String, String> getImagesWithLabels() {
        return this.imagesWithLabels;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getPriceAmount() {
        return this.priceAmount;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final List<JsonElement> getProductAccordionEntries() {
        return this.productAccordionEntries;
    }

    public final JsonElement getProductTag() {
        return this.productTag;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.priceAmount, AbstractC11266d.m30450d(this.sku.hashCode() * 31, 31, this.price), 31), 31, this.priceCurrencyCode);
        String str = this.discountedPrice;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.images);
        Map<String, String> map = this.imagesWithLabels;
        int iM8289b = AbstractC2875y.m8289b((iM31983b + (map == null ? 0 : map.hashCode())) * 31, 31, this.hasStock);
        List<JsonElement> list = this.attributes;
        int iM31983b2 = AbstractC11895b.m31983b((iM8289b + (list == null ? 0 : list.hashCode())) * 31, 31, this.productAccordionEntries);
        JsonElement jsonElement = this.productTag;
        return iM31983b2 + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public String toString() {
        String str = this.sku;
        String str2 = this.price;
        int i13 = this.priceAmount;
        String str3 = this.priceCurrencyCode;
        String str4 = this.discountedPrice;
        List<String> list = this.images;
        Map<String, String> map = this.imagesWithLabels;
        boolean z4 = this.hasStock;
        List<JsonElement> list2 = this.attributes;
        List<JsonElement> list3 = this.productAccordionEntries;
        JsonElement jsonElement = this.productTag;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VariantOption(sku=", str, ", price=", str2, ", priceAmount=");
        AbstractC11895b.m31979B(i13, ", priceCurrencyCode=", str3, ", discountedPrice=", sbM32001t);
        AbstractC36095b.m114694v(str4, ", images=", ", imagesWithLabels=", sbM32001t, list);
        sbM32001t.append(map);
        sbM32001t.append(", hasStock=");
        sbM32001t.append(z4);
        sbM32001t.append(", attributes=");
        AbstractC21702c.m61148s(sbM32001t, list2, ", productAccordionEntries=", list3, ", productTag=");
        sbM32001t.append(jsonElement);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VariantOption(String sku, String price, int i13, String priceCurrencyCode, String str, List<String> images, Map<String, String> map, boolean z4, List<? extends JsonElement> list, List<? extends JsonElement> productAccordionEntries, JsonElement jsonElement) {
        AbstractC22676k.m65750j(sku, "sku");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(priceCurrencyCode, "priceCurrencyCode");
        AbstractC22676k.m65750j(images, "images");
        AbstractC22676k.m65750j(productAccordionEntries, "productAccordionEntries");
        this.sku = sku;
        this.price = price;
        this.priceAmount = i13;
        this.priceCurrencyCode = priceCurrencyCode;
        this.discountedPrice = str;
        this.images = images;
        this.imagesWithLabels = map;
        this.hasStock = z4;
        this.attributes = list;
        this.productAccordionEntries = productAccordionEntries;
        this.productTag = jsonElement;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VariantOption(String str, String str2, int i13, String str3, String str4, List list, Map map, boolean z4, List list2, List list3, JsonElement jsonElement, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int i15 = (i14 & 4) != 0 ? 0 : i13;
        String str5 = (i14 & 16) != 0 ? null : str4;
        int i16 = i14 & 32;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, i15, str3, str5, i16 != 0 ? c25271y : list, (i14 & 64) != 0 ? null : map, (i14 & 128) != 0 ? false : z4, (i14 & 256) != 0 ? null : list2, (i14 & 512) != 0 ? c25271y : list3, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : jsonElement);
    }
}
