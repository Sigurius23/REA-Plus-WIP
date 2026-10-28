package com.whoop.nativestore.pdp.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "price", "salePrice", "color", "Lcom/whoop/nativestore/pdp/domain/model/ProductRating;", "rating", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/nativestore/pdp/domain/model/ProductRating;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getPrice", "getSalePrice", "getColor", "Lcom/whoop/nativestore/pdp/domain/model/ProductRating;", "getRating", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductDescriptionHeaderModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String color;
    private final String price;
    private final ProductRating rating;
    private final String salePrice;
    private final String title;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.ProductDescriptionHeaderModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductDescriptionHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProductDescriptionHeaderModel() {
        this((String) null, (String) null, (String) null, (String) null, (ProductRating) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProductDescriptionHeaderModel copy$default(ProductDescriptionHeaderModel productDescriptionHeaderModel, String str, String str2, String str3, String str4, ProductRating productRating, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productDescriptionHeaderModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = productDescriptionHeaderModel.price;
        }
        if ((i13 & 4) != 0) {
            str3 = productDescriptionHeaderModel.salePrice;
        }
        if ((i13 & 8) != 0) {
            str4 = productDescriptionHeaderModel.color;
        }
        if ((i13 & 16) != 0) {
            productRating = productDescriptionHeaderModel.rating;
        }
        ProductRating productRating2 = productRating;
        String str5 = str3;
        return productDescriptionHeaderModel.copy(str, str2, str5, str4, productRating2);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ProductDescriptionHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.price, "")) {
            output.encodeStringElement(serialDesc, 1, self.price);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.salePrice != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.salePrice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.color != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.color);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.rating == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, ProductRating$$serializer.INSTANCE, self.rating);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSalePrice() {
        return this.salePrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProductRating getRating() {
        return this.rating;
    }

    public final ProductDescriptionHeaderModel copy(String title, String price, String salePrice, String color, ProductRating rating) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        return new ProductDescriptionHeaderModel(title, price, salePrice, color, rating);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDescriptionHeaderModel)) {
            return false;
        }
        ProductDescriptionHeaderModel productDescriptionHeaderModel = (ProductDescriptionHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, productDescriptionHeaderModel.title) && AbstractC22676k.m65745e(this.price, productDescriptionHeaderModel.price) && AbstractC22676k.m65745e(this.salePrice, productDescriptionHeaderModel.salePrice) && AbstractC22676k.m65745e(this.color, productDescriptionHeaderModel.color) && AbstractC22676k.m65745e(this.rating, productDescriptionHeaderModel.rating);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getPrice() {
        return this.price;
    }

    public final ProductRating getRating() {
        return this.rating;
    }

    public final String getSalePrice() {
        return this.salePrice;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.price);
        String str = this.salePrice;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProductRating productRating = this.rating;
        return iHashCode2 + (productRating != null ? productRating.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.price;
        String str3 = this.salePrice;
        String str4 = this.color;
        ProductRating productRating = this.rating;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProductDescriptionHeaderModel(title=", str, ", price=", str2, ", salePrice=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", color=", str4, ", rating=");
        sbM32001t.append(productRating);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ProductDescriptionHeaderModel(int i13, String str, String str2, String str3, String str4, ProductRating productRating, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
        if ((i13 & 4) == 0) {
            this.salePrice = null;
        } else {
            this.salePrice = str3;
        }
        if ((i13 & 8) == 0) {
            this.color = null;
        } else {
            this.color = str4;
        }
        if ((i13 & 16) == 0) {
            this.rating = null;
        } else {
            this.rating = productRating;
        }
    }

    public ProductDescriptionHeaderModel(String title, String price, String str, String str2, ProductRating productRating) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        this.title = title;
        this.price = price;
        this.salePrice = str;
        this.color = str2;
        this.rating = productRating;
    }

    public /* synthetic */ ProductDescriptionHeaderModel(String str, String str2, String str3, String str4, ProductRating productRating, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : productRating);
    }
}
