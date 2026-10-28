package com.whoop.nativestore.pdp.domain.model;

import com.whoop.nativestore.home.domain.model.CartIndicator;
import com.whoop.nativestore.home.domain.model.CartIndicator$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zi1.C40674e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABB]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bi\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jf\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010(R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010*¨\u0006C"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;", "", "", "navigationBarText", "Lcom/whoop/nativestore/home/domain/model/CartIndicator;", "cart", "", "Lcom/whoop/nativestore/pdp/domain/model/PdpSection;", "sections", "Lcom/whoop/nativestore/pdp/domain/model/PdpCheckoutFooter;", "checkoutFooter", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "productMetadata", "", "analyticsProperties", "<init>", "(Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/PdpCheckoutFooter;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/PdpCheckoutFooter;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/nativestore/home/domain/model/CartIndicator;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/nativestore/pdp/domain/model/PdpCheckoutFooter;", "component5", "()Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/PdpCheckoutFooter;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/util/Map;)Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationBarText", "Lcom/whoop/nativestore/home/domain/model/CartIndicator;", "getCart", "Ljava/util/List;", "getSections", "Lcom/whoop/nativestore/pdp/domain/model/PdpCheckoutFooter;", "getCheckoutFooter", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "getProductMetadata", "Ljava/util/Map;", "getAnalyticsProperties", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductDescriptionPageResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> analyticsProperties;
    private final CartIndicator cart;
    private final PdpCheckoutFooter checkoutFooter;
    private final String navigationBarText;
    private final ProductMetadata productMetadata;
    private final List<PdpSection> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.ProductDescriptionPageResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductDescriptionPageResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C40674e0(24)), null, null, AbstractC30060g.m92087G(enumC23463i, new C40674e0(25))};
    }

    public ProductDescriptionPageResponse() {
        this((String) null, (CartIndicator) null, (List) null, (PdpCheckoutFooter) null, (ProductMetadata) null, (Map) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(PdpSection$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductDescriptionPageResponse copy$default(ProductDescriptionPageResponse productDescriptionPageResponse, String str, CartIndicator cartIndicator, List list, PdpCheckoutFooter pdpCheckoutFooter, ProductMetadata productMetadata, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productDescriptionPageResponse.navigationBarText;
        }
        if ((i13 & 2) != 0) {
            cartIndicator = productDescriptionPageResponse.cart;
        }
        if ((i13 & 4) != 0) {
            list = productDescriptionPageResponse.sections;
        }
        if ((i13 & 8) != 0) {
            pdpCheckoutFooter = productDescriptionPageResponse.checkoutFooter;
        }
        if ((i13 & 16) != 0) {
            productMetadata = productDescriptionPageResponse.productMetadata;
        }
        if ((i13 & 32) != 0) {
            map = productDescriptionPageResponse.analyticsProperties;
        }
        ProductMetadata productMetadata2 = productMetadata;
        Map map2 = map;
        return productDescriptionPageResponse.copy(str, cartIndicator, list, pdpCheckoutFooter, productMetadata2, map2);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ProductDescriptionPageResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.navigationBarText, "")) {
            output.encodeStringElement(serialDesc, 0, self.navigationBarText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.cart != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, CartIndicator$$serializer.INSTANCE, self.cart);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.sections, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.checkoutFooter != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, PdpCheckoutFooter$$serializer.INSTANCE, self.checkoutFooter);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.productMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, ProductMetadata$$serializer.INSTANCE, self.productMetadata);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.analyticsProperties == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.analyticsProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CartIndicator getCart() {
        return this.cart;
    }

    public final List<PdpSection> component3() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PdpCheckoutFooter getCheckoutFooter() {
        return this.checkoutFooter;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProductMetadata getProductMetadata() {
        return this.productMetadata;
    }

    public final Map<String, String> component6() {
        return this.analyticsProperties;
    }

    public final ProductDescriptionPageResponse copy(String navigationBarText, CartIndicator cart, List<PdpSection> sections, PdpCheckoutFooter checkoutFooter, ProductMetadata productMetadata, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        return new ProductDescriptionPageResponse(navigationBarText, cart, sections, checkoutFooter, productMetadata, analyticsProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDescriptionPageResponse)) {
            return false;
        }
        ProductDescriptionPageResponse productDescriptionPageResponse = (ProductDescriptionPageResponse) other;
        return AbstractC22676k.m65745e(this.navigationBarText, productDescriptionPageResponse.navigationBarText) && AbstractC22676k.m65745e(this.cart, productDescriptionPageResponse.cart) && AbstractC22676k.m65745e(this.sections, productDescriptionPageResponse.sections) && AbstractC22676k.m65745e(this.checkoutFooter, productDescriptionPageResponse.checkoutFooter) && AbstractC22676k.m65745e(this.productMetadata, productDescriptionPageResponse.productMetadata) && AbstractC22676k.m65745e(this.analyticsProperties, productDescriptionPageResponse.analyticsProperties);
    }

    public final Map<String, String> getAnalyticsProperties() {
        return this.analyticsProperties;
    }

    public final CartIndicator getCart() {
        return this.cart;
    }

    public final PdpCheckoutFooter getCheckoutFooter() {
        return this.checkoutFooter;
    }

    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final ProductMetadata getProductMetadata() {
        return this.productMetadata;
    }

    public final List<PdpSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int iHashCode = this.navigationBarText.hashCode() * 31;
        CartIndicator cartIndicator = this.cart;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (cartIndicator == null ? 0 : cartIndicator.hashCode())) * 31, 31, this.sections);
        PdpCheckoutFooter pdpCheckoutFooter = this.checkoutFooter;
        int iHashCode2 = (iM31983b + (pdpCheckoutFooter == null ? 0 : pdpCheckoutFooter.hashCode())) * 31;
        ProductMetadata productMetadata = this.productMetadata;
        int iHashCode3 = (iHashCode2 + (productMetadata == null ? 0 : productMetadata.hashCode())) * 31;
        Map<String, String> map = this.analyticsProperties;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "ProductDescriptionPageResponse(navigationBarText=" + this.navigationBarText + ", cart=" + this.cart + ", sections=" + this.sections + ", checkoutFooter=" + this.checkoutFooter + ", productMetadata=" + this.productMetadata + ", analyticsProperties=" + this.analyticsProperties + ")";
    }

    public /* synthetic */ ProductDescriptionPageResponse(int i13, String str, CartIndicator cartIndicator, List list, PdpCheckoutFooter pdpCheckoutFooter, ProductMetadata productMetadata, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.navigationBarText = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.cart = null;
        } else {
            this.cart = cartIndicator;
        }
        if ((i13 & 4) == 0) {
            this.sections = C25271y.f99162w;
        } else {
            this.sections = list;
        }
        if ((i13 & 8) == 0) {
            this.checkoutFooter = null;
        } else {
            this.checkoutFooter = pdpCheckoutFooter;
        }
        if ((i13 & 16) == 0) {
            this.productMetadata = null;
        } else {
            this.productMetadata = productMetadata;
        }
        if ((i13 & 32) == 0) {
            this.analyticsProperties = null;
        } else {
            this.analyticsProperties = map;
        }
    }

    public ProductDescriptionPageResponse(String navigationBarText, CartIndicator cartIndicator, List<PdpSection> sections, PdpCheckoutFooter pdpCheckoutFooter, ProductMetadata productMetadata, Map<String, String> map) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBarText = navigationBarText;
        this.cart = cartIndicator;
        this.sections = sections;
        this.checkoutFooter = pdpCheckoutFooter;
        this.productMetadata = productMetadata;
        this.analyticsProperties = map;
    }

    public /* synthetic */ ProductDescriptionPageResponse(String str, CartIndicator cartIndicator, List list, PdpCheckoutFooter pdpCheckoutFooter, ProductMetadata productMetadata, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : cartIndicator, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : pdpCheckoutFooter, (i13 & 16) != 0 ? null : productMetadata, (i13 & 32) != 0 ? null : map);
    }
}
