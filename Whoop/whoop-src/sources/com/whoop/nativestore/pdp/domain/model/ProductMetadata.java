package com.whoop.nativestore.pdp.domain.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
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
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DEB}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\u0011B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0086\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0018R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010!R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b?\u0010\u001fR\u0011\u0010@\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bB\u0010A¨\u0006F"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "", "", "initiallySelectedSku", "initiallySelectedPrice", "", "initialVariantHasStock", "packSku", "packPrice", "", "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;", "packItemMetadata", "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;", "wywMetadata", "Lcom/whoop/nativestore/pdp/domain/model/ProductOption;", "products", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "()Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getInitiallySelectedSku", "getInitiallySelectedPrice", "Ljava/lang/Boolean;", "getInitialVariantHasStock", "getPackSku", "getPackPrice", "Ljava/util/Map;", "getPackItemMetadata", "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;", "getWywMetadata", "getProducts", "isPack", "()Z", "isWhoopYourWay", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductMetadata {
    private static final InterfaceC23462h[] $childSerializers;
    private final Boolean initialVariantHasStock;
    private final String initiallySelectedPrice;
    private final String initiallySelectedSku;
    private final Map<String, PackItemProductMetadata> packItemMetadata;
    private final String packPrice;
    private final String packSku;
    private final Map<String, ProductOption> products;
    private final WhoopYourWayMetadata wywMetadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.ProductMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C41253a(0)), null, AbstractC30060g.m92087G(enumC23463i, new C41253a(1))};
    }

    public ProductMetadata() {
        this((String) null, (String) null, (Boolean) null, (String) null, (String) null, (Map) null, (WhoopYourWayMetadata) null, (Map) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, PackItemProductMetadata$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, ProductOption$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductMetadata copy$default(ProductMetadata productMetadata, String str, String str2, Boolean bool, String str3, String str4, Map map, WhoopYourWayMetadata whoopYourWayMetadata, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productMetadata.initiallySelectedSku;
        }
        if ((i13 & 2) != 0) {
            str2 = productMetadata.initiallySelectedPrice;
        }
        if ((i13 & 4) != 0) {
            bool = productMetadata.initialVariantHasStock;
        }
        if ((i13 & 8) != 0) {
            str3 = productMetadata.packSku;
        }
        if ((i13 & 16) != 0) {
            str4 = productMetadata.packPrice;
        }
        if ((i13 & 32) != 0) {
            map = productMetadata.packItemMetadata;
        }
        if ((i13 & 64) != 0) {
            whoopYourWayMetadata = productMetadata.wywMetadata;
        }
        if ((i13 & 128) != 0) {
            map2 = productMetadata.products;
        }
        WhoopYourWayMetadata whoopYourWayMetadata2 = whoopYourWayMetadata;
        Map map3 = map2;
        String str5 = str4;
        Map map4 = map;
        return productMetadata.copy(str, str2, bool, str3, str5, map4, whoopYourWayMetadata2, map3);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ProductMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.initiallySelectedSku != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.initiallySelectedSku);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.initiallySelectedPrice != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.initiallySelectedPrice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.initialVariantHasStock != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.initialVariantHasStock);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.packSku != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.packSku);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.packPrice != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.packPrice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.packItemMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.packItemMetadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.wywMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, WhoopYourWayMetadata$$serializer.INSTANCE, self.wywMetadata);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && AbstractC22676k.m65745e(self.products, C25272z.f99163w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.products);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInitiallySelectedSku() {
        return this.initiallySelectedSku;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitiallySelectedPrice() {
        return this.initiallySelectedPrice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getInitialVariantHasStock() {
        return this.initialVariantHasStock;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPackSku() {
        return this.packSku;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPackPrice() {
        return this.packPrice;
    }

    public final Map<String, PackItemProductMetadata> component6() {
        return this.packItemMetadata;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final WhoopYourWayMetadata getWywMetadata() {
        return this.wywMetadata;
    }

    public final Map<String, ProductOption> component8() {
        return this.products;
    }

    public final ProductMetadata copy(String initiallySelectedSku, String initiallySelectedPrice, Boolean initialVariantHasStock, String packSku, String packPrice, Map<String, PackItemProductMetadata> packItemMetadata, WhoopYourWayMetadata wywMetadata, Map<String, ProductOption> products) {
        AbstractC22676k.m65750j(products, "products");
        return new ProductMetadata(initiallySelectedSku, initiallySelectedPrice, initialVariantHasStock, packSku, packPrice, packItemMetadata, wywMetadata, products);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductMetadata)) {
            return false;
        }
        ProductMetadata productMetadata = (ProductMetadata) other;
        return AbstractC22676k.m65745e(this.initiallySelectedSku, productMetadata.initiallySelectedSku) && AbstractC22676k.m65745e(this.initiallySelectedPrice, productMetadata.initiallySelectedPrice) && AbstractC22676k.m65745e(this.initialVariantHasStock, productMetadata.initialVariantHasStock) && AbstractC22676k.m65745e(this.packSku, productMetadata.packSku) && AbstractC22676k.m65745e(this.packPrice, productMetadata.packPrice) && AbstractC22676k.m65745e(this.packItemMetadata, productMetadata.packItemMetadata) && AbstractC22676k.m65745e(this.wywMetadata, productMetadata.wywMetadata) && AbstractC22676k.m65745e(this.products, productMetadata.products);
    }

    public final Boolean getInitialVariantHasStock() {
        return this.initialVariantHasStock;
    }

    public final String getInitiallySelectedPrice() {
        return this.initiallySelectedPrice;
    }

    public final String getInitiallySelectedSku() {
        return this.initiallySelectedSku;
    }

    public final Map<String, PackItemProductMetadata> getPackItemMetadata() {
        return this.packItemMetadata;
    }

    public final String getPackPrice() {
        return this.packPrice;
    }

    public final String getPackSku() {
        return this.packSku;
    }

    public final Map<String, ProductOption> getProducts() {
        return this.products;
    }

    public final WhoopYourWayMetadata getWywMetadata() {
        return this.wywMetadata;
    }

    public int hashCode() {
        String str = this.initiallySelectedSku;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.initiallySelectedPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.initialVariantHasStock;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.packSku;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packPrice;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, PackItemProductMetadata> map = this.packItemMetadata;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        WhoopYourWayMetadata whoopYourWayMetadata = this.wywMetadata;
        return this.products.hashCode() + ((iHashCode6 + (whoopYourWayMetadata != null ? whoopYourWayMetadata.hashCode() : 0)) * 31);
    }

    public final boolean isPack() {
        return (this.packSku == null && this.packItemMetadata == null) ? false : true;
    }

    public final boolean isWhoopYourWay() {
        return this.wywMetadata != null;
    }

    public String toString() {
        String str = this.initiallySelectedSku;
        String str2 = this.initiallySelectedPrice;
        Boolean bool = this.initialVariantHasStock;
        String str3 = this.packSku;
        String str4 = this.packPrice;
        Map<String, PackItemProductMetadata> map = this.packItemMetadata;
        WhoopYourWayMetadata whoopYourWayMetadata = this.wywMetadata;
        Map<String, ProductOption> map2 = this.products;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProductMetadata(initiallySelectedSku=", str, ", initiallySelectedPrice=", str2, ", initialVariantHasStock=");
        AbstractC13673n.m38576w(bool, ", packSku=", str3, ", packPrice=", sbM32001t);
        AbstractC36095b.m114695w(sbM32001t, str4, ", packItemMetadata=", map, ", wywMetadata=");
        sbM32001t.append(whoopYourWayMetadata);
        sbM32001t.append(", products=");
        sbM32001t.append(map2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ProductMetadata(int i13, String str, String str2, Boolean bool, String str3, String str4, Map map, WhoopYourWayMetadata whoopYourWayMetadata, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.initiallySelectedSku = null;
        } else {
            this.initiallySelectedSku = str;
        }
        if ((i13 & 2) == 0) {
            this.initiallySelectedPrice = null;
        } else {
            this.initiallySelectedPrice = str2;
        }
        if ((i13 & 4) == 0) {
            this.initialVariantHasStock = null;
        } else {
            this.initialVariantHasStock = bool;
        }
        if ((i13 & 8) == 0) {
            this.packSku = null;
        } else {
            this.packSku = str3;
        }
        if ((i13 & 16) == 0) {
            this.packPrice = null;
        } else {
            this.packPrice = str4;
        }
        if ((i13 & 32) == 0) {
            this.packItemMetadata = null;
        } else {
            this.packItemMetadata = map;
        }
        if ((i13 & 64) == 0) {
            this.wywMetadata = null;
        } else {
            this.wywMetadata = whoopYourWayMetadata;
        }
        if ((i13 & 128) == 0) {
            this.products = C25272z.f99163w;
        } else {
            this.products = map2;
        }
    }

    public ProductMetadata(String str, String str2, Boolean bool, String str3, String str4, Map<String, PackItemProductMetadata> map, WhoopYourWayMetadata whoopYourWayMetadata, Map<String, ProductOption> products) {
        AbstractC22676k.m65750j(products, "products");
        this.initiallySelectedSku = str;
        this.initiallySelectedPrice = str2;
        this.initialVariantHasStock = bool;
        this.packSku = str3;
        this.packPrice = str4;
        this.packItemMetadata = map;
        this.wywMetadata = whoopYourWayMetadata;
        this.products = products;
    }

    public /* synthetic */ ProductMetadata(String str, String str2, Boolean bool, String str3, String str4, Map map, WhoopYourWayMetadata whoopYourWayMetadata, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : map, (i13 & 64) != 0 ? null : whoopYourWayMetadata, (i13 & 128) != 0 ? C25272z.f99163w : map2);
    }
}
