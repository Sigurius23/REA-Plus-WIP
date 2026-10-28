package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b\u0006\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001f¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/ShoppingTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/ProductModel;", "product", "", "isWhoopPro", "isDiscovery", "", "userCurrencyCode", "<init>", "(Lcom/whoop/design/models/items/ProductModel;ZZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ProductModel;ZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ShoppingTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ProductModel;", "component2", "()Z", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/models/items/ProductModel;ZZLjava/lang/String;)Lcom/whoop/design/models/items/ShoppingTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ProductModel;", "getProduct", "Z", "Ljava/lang/String;", "getUserCurrencyCode", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShoppingTileModel implements DesignSystemModel {
    private final boolean isDiscovery;
    private final boolean isWhoopPro;
    private final ProductModel product;
    private final String userCurrencyCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ShoppingTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ShoppingTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShoppingTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShoppingTileModel(int i13, ProductModel productModel, boolean z4, boolean z13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ShoppingTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.product = productModel;
        this.isWhoopPro = z4;
        this.isDiscovery = z13;
        this.userCurrencyCode = str;
    }

    public static /* synthetic */ ShoppingTileModel copy$default(ShoppingTileModel shoppingTileModel, ProductModel productModel, boolean z4, boolean z13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            productModel = shoppingTileModel.product;
        }
        if ((i13 & 2) != 0) {
            z4 = shoppingTileModel.isWhoopPro;
        }
        if ((i13 & 4) != 0) {
            z13 = shoppingTileModel.isDiscovery;
        }
        if ((i13 & 8) != 0) {
            str = shoppingTileModel.userCurrencyCode;
        }
        return shoppingTileModel.copy(productModel, z4, z13, str);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ShoppingTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ProductModel$$serializer.INSTANCE, self.product);
        output.encodeBooleanElement(serialDesc, 1, self.isWhoopPro);
        output.encodeBooleanElement(serialDesc, 2, self.isDiscovery);
        output.encodeStringElement(serialDesc, 3, self.userCurrencyCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProductModel getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsWhoopPro() {
        return this.isWhoopPro;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDiscovery() {
        return this.isDiscovery;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserCurrencyCode() {
        return this.userCurrencyCode;
    }

    public final ShoppingTileModel copy(ProductModel product, boolean isWhoopPro, boolean isDiscovery, String userCurrencyCode) {
        AbstractC22676k.m65750j(product, "product");
        AbstractC22676k.m65750j(userCurrencyCode, "userCurrencyCode");
        return new ShoppingTileModel(product, isWhoopPro, isDiscovery, userCurrencyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingTileModel)) {
            return false;
        }
        ShoppingTileModel shoppingTileModel = (ShoppingTileModel) other;
        return AbstractC22676k.m65745e(this.product, shoppingTileModel.product) && this.isWhoopPro == shoppingTileModel.isWhoopPro && this.isDiscovery == shoppingTileModel.isDiscovery && AbstractC22676k.m65745e(this.userCurrencyCode, shoppingTileModel.userCurrencyCode);
    }

    public final ProductModel getProduct() {
        return this.product;
    }

    public final String getUserCurrencyCode() {
        return this.userCurrencyCode;
    }

    public int hashCode() {
        return this.userCurrencyCode.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.product.hashCode() * 31, 31, this.isWhoopPro), 31, this.isDiscovery);
    }

    public final boolean isDiscovery() {
        return this.isDiscovery;
    }

    public final boolean isWhoopPro() {
        return this.isWhoopPro;
    }

    public String toString() {
        ProductModel productModel = this.product;
        boolean z4 = this.isWhoopPro;
        boolean z13 = this.isDiscovery;
        String str = this.userCurrencyCode;
        StringBuilder sb4 = new StringBuilder("ShoppingTileModel(product=");
        sb4.append(productModel);
        sb4.append(", isWhoopPro=");
        sb4.append(z4);
        sb4.append(", isDiscovery=");
        return AbstractC21702c.m61139j(sb4, z13, ", userCurrencyCode=", str, ")");
    }

    public ShoppingTileModel(ProductModel product, boolean z4, boolean z13, String userCurrencyCode) {
        AbstractC22676k.m65750j(product, "product");
        AbstractC22676k.m65750j(userCurrencyCode, "userCurrencyCode");
        this.product = product;
        this.isWhoopPro = z4;
        this.isDiscovery = z13;
        this.userCurrencyCode = userCurrencyCode;
    }
}
