package com.whoop.universalcheckout.features.cart.domain.models.items;

import cj0.C4744f;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JKB\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0092\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010!J\u001a\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bC\u0010!R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bD\u0010!R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bG\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\bH\u0010\u0019¨\u0006L"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "image", "", "stackedImages", "price", "strikethroughPrice", "", "quantity", "minQuantity", "maxQuantity", "", "hideQuantity", "lineItemId", "analyticsLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()I", "component8", "component9", "component10", "()Z", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getSubtitle", "getImage", "Ljava/util/List;", "getStackedImages", "getPrice", "getStrikethroughPrice", "I", "getQuantity", "getMinQuantity", "getMaxQuantity", "Z", "getHideQuantity", "getLineItemId", "getAnalyticsLabel", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CartItemModel implements DesignSystemModel {
    private final String analyticsLabel;
    private final boolean hideQuantity;
    private final String image;
    private final String lineItemId;
    private final int maxQuantity;
    private final int minQuantity;
    private final String price;
    private final int quantity;
    private final List<String> stackedImages;
    private final String strikethroughPrice;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4744f(10)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.models.items.CartItemModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CartItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CartItemModel() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 0, 0, 0, false, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartItemModel copy$default(CartItemModel cartItemModel, String str, String str2, String str3, List list, String str4, String str5, int i13, int i14, int i15, boolean z4, String str6, String str7, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = cartItemModel.title;
        }
        if ((i16 & 2) != 0) {
            str2 = cartItemModel.subtitle;
        }
        if ((i16 & 4) != 0) {
            str3 = cartItemModel.image;
        }
        if ((i16 & 8) != 0) {
            list = cartItemModel.stackedImages;
        }
        if ((i16 & 16) != 0) {
            str4 = cartItemModel.price;
        }
        if ((i16 & 32) != 0) {
            str5 = cartItemModel.strikethroughPrice;
        }
        if ((i16 & 64) != 0) {
            i13 = cartItemModel.quantity;
        }
        if ((i16 & 128) != 0) {
            i14 = cartItemModel.minQuantity;
        }
        if ((i16 & 256) != 0) {
            i15 = cartItemModel.maxQuantity;
        }
        if ((i16 & 512) != 0) {
            z4 = cartItemModel.hideQuantity;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str6 = cartItemModel.lineItemId;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str7 = cartItemModel.analyticsLabel;
        }
        String str8 = str6;
        String str9 = str7;
        int i17 = i15;
        boolean z13 = z4;
        int i18 = i13;
        int i19 = i14;
        String str10 = str4;
        String str11 = str5;
        return cartItemModel.copy(str, str2, str3, list, str10, str11, i18, i19, i17, z13, str8, str9);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(CartItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.subtitle, "")) {
            output.encodeStringElement(serialDesc, 1, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.image, "")) {
            output.encodeStringElement(serialDesc, 2, self.image);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.stackedImages != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.stackedImages);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.price, "")) {
            output.encodeStringElement(serialDesc, 4, self.price);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.strikethroughPrice != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.strikethroughPrice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.quantity != 0) {
            output.encodeIntElement(serialDesc, 6, self.quantity);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.minQuantity != 0) {
            output.encodeIntElement(serialDesc, 7, self.minQuantity);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.maxQuantity != 0) {
            output.encodeIntElement(serialDesc, 8, self.maxQuantity);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.hideQuantity) {
            output.encodeBooleanElement(serialDesc, 9, self.hideQuantity);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !AbstractC22676k.m65745e(self.lineItemId, "")) {
            output.encodeStringElement(serialDesc, 10, self.lineItemId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && AbstractC22676k.m65745e(self.analyticsLabel, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 11, self.analyticsLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHideQuantity() {
        return this.hideQuantity;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLineItemId() {
        return this.lineItemId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<String> component4() {
        return this.stackedImages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMinQuantity() {
        return this.minQuantity;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    public final CartItemModel copy(String title, String subtitle, String image, List<String> stackedImages, String price, String strikethroughPrice, int quantity, int minQuantity, int maxQuantity, boolean hideQuantity, String lineItemId, String analyticsLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(lineItemId, "lineItemId");
        AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
        return new CartItemModel(title, subtitle, image, stackedImages, price, strikethroughPrice, quantity, minQuantity, maxQuantity, hideQuantity, lineItemId, analyticsLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItemModel)) {
            return false;
        }
        CartItemModel cartItemModel = (CartItemModel) other;
        return AbstractC22676k.m65745e(this.title, cartItemModel.title) && AbstractC22676k.m65745e(this.subtitle, cartItemModel.subtitle) && AbstractC22676k.m65745e(this.image, cartItemModel.image) && AbstractC22676k.m65745e(this.stackedImages, cartItemModel.stackedImages) && AbstractC22676k.m65745e(this.price, cartItemModel.price) && AbstractC22676k.m65745e(this.strikethroughPrice, cartItemModel.strikethroughPrice) && this.quantity == cartItemModel.quantity && this.minQuantity == cartItemModel.minQuantity && this.maxQuantity == cartItemModel.maxQuantity && this.hideQuantity == cartItemModel.hideQuantity && AbstractC22676k.m65745e(this.lineItemId, cartItemModel.lineItemId) && AbstractC22676k.m65745e(this.analyticsLabel, cartItemModel.analyticsLabel);
    }

    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    public final boolean getHideQuantity() {
        return this.hideQuantity;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    public final int getMinQuantity() {
        return this.minQuantity;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final List<String> getStackedImages() {
        return this.stackedImages;
    }

    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
        List<String> list = this.stackedImages;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (list == null ? 0 : list.hashCode())) * 31, 31, this.price);
        String str = this.strikethroughPrice;
        return this.analyticsLabel.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.maxQuantity, AbstractC11266d.m30448b(this.minQuantity, AbstractC11266d.m30448b(this.quantity, (iM30450d2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31), 31, this.hideQuantity), 31, this.lineItemId);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.image;
        List<String> list = this.stackedImages;
        String str4 = this.price;
        String str5 = this.strikethroughPrice;
        int i13 = this.quantity;
        int i14 = this.minQuantity;
        int i15 = this.maxQuantity;
        boolean z4 = this.hideQuantity;
        String str6 = this.lineItemId;
        String str7 = this.analyticsLabel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CartItemModel(title=", str, ", subtitle=", str2, ", image=");
        AbstractC36095b.m114694v(str3, ", stackedImages=", ", price=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str4, ", strikethroughPrice=", str5, ", quantity=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", minQuantity=", i14, ", maxQuantity=");
        AbstractC13673n.m38573t(i15, ", hideQuantity=", ", lineItemId=", sbM32001t, z4);
        return AbstractC11266d.m30464r(sbM32001t, str6, ", analyticsLabel=", str7, ")");
    }

    public /* synthetic */ CartItemModel(int i13, String str, String str2, String str3, List list, String str4, String str5, int i14, int i15, int i16, boolean z4, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.image = "";
        } else {
            this.image = str3;
        }
        if ((i13 & 8) == 0) {
            this.stackedImages = null;
        } else {
            this.stackedImages = list;
        }
        if ((i13 & 16) == 0) {
            this.price = "";
        } else {
            this.price = str4;
        }
        if ((i13 & 32) == 0) {
            this.strikethroughPrice = null;
        } else {
            this.strikethroughPrice = str5;
        }
        if ((i13 & 64) == 0) {
            this.quantity = 0;
        } else {
            this.quantity = i14;
        }
        if ((i13 & 128) == 0) {
            this.minQuantity = 0;
        } else {
            this.minQuantity = i15;
        }
        if ((i13 & 256) == 0) {
            this.maxQuantity = 0;
        } else {
            this.maxQuantity = i16;
        }
        if ((i13 & 512) == 0) {
            this.hideQuantity = false;
        } else {
            this.hideQuantity = z4;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.lineItemId = "";
        } else {
            this.lineItemId = str6;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.analyticsLabel = "";
        } else {
            this.analyticsLabel = str7;
        }
    }

    public CartItemModel(String title, String subtitle, String image, List<String> list, String price, String str, int i13, int i14, int i15, boolean z4, String lineItemId, String analyticsLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(lineItemId, "lineItemId");
        AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.stackedImages = list;
        this.price = price;
        this.strikethroughPrice = str;
        this.quantity = i13;
        this.minQuantity = i14;
        this.maxQuantity = i15;
        this.hideQuantity = z4;
        this.lineItemId = lineItemId;
        this.analyticsLabel = analyticsLabel;
    }

    public /* synthetic */ CartItemModel(String str, String str2, String str3, List list, String str4, String str5, int i13, int i14, int i15, boolean z4, String str6, String str7, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? "" : str, (i16 & 2) != 0 ? "" : str2, (i16 & 4) != 0 ? "" : str3, (i16 & 8) != 0 ? null : list, (i16 & 16) != 0 ? "" : str4, (i16 & 32) == 0 ? str5 : null, (i16 & 64) != 0 ? 0 : i13, (i16 & 128) != 0 ? 0 : i14, (i16 & 256) != 0 ? 0 : i15, (i16 & 512) == 0 ? z4 : false, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str6, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? "" : str7);
    }
}
