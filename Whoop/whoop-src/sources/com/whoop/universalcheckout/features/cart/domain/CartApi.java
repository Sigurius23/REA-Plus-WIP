package com.whoop.universalcheckout.features.cart.domain;

import com.whoop.universalcheckout.features.cart.domain.models.AddCartItemRequest;
import com.whoop.universalcheckout.features.cart.domain.models.AddPackToCartRequest;
import com.whoop.universalcheckout.features.cart.domain.models.AddWhoopYourWayToCartRequest;
import com.whoop.universalcheckout.features.cart.domain.models.CartIndicatorResponse;
import com.whoop.universalcheckout.features.cart.domain.models.CartResponse;
import com.whoop.universalcheckout.features.cart.domain.models.UpdateCartQuantityRequest;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\u00020\u00042\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartApi;", "", "Lcom/whoop/universalcheckout/features/cart/domain/models/AddCartItemRequest;", "body", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "addItem", "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddCartItemRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;", "addPack", "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;", "addWyw", "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;", "updateQuantity", "(Lcom/whoop/universalcheckout/features/cart/domain/models/UpdateCartQuantityRequest;Lq83/d;)Ljava/lang/Object;", "", "cartId", "getCart", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;", "getCartIndicator", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CartApi {
    @InterfaceC37284o("commerce-service/v2/mobile/carts/add-item")
    Object addItem(@InterfaceC37270a AddCartItemRequest addCartItemRequest, InterfaceC30057d<? super CartResponse> interfaceC30057d);

    @InterfaceC37284o("commerce-service/v2/mobile/carts/add-pack")
    Object addPack(@InterfaceC37270a AddPackToCartRequest addPackToCartRequest, InterfaceC30057d<? super CartResponse> interfaceC30057d);

    @InterfaceC37284o("commerce-service/v2/mobile/carts/add-wyw")
    Object addWyw(@InterfaceC37270a AddWhoopYourWayToCartRequest addWhoopYourWayToCartRequest, InterfaceC30057d<? super CartResponse> interfaceC30057d);

    @InterfaceC37275f("commerce-service/v2/mobile/carts/cart")
    Object getCart(@InterfaceC37289t("cart_id") String str, InterfaceC30057d<? super CartResponse> interfaceC30057d);

    @InterfaceC37275f("commerce-service/v2/mobile/carts/indicator")
    Object getCartIndicator(@InterfaceC37289t("cart_id") String str, InterfaceC30057d<? super CartIndicatorResponse> interfaceC30057d);

    @InterfaceC37285p("commerce-service/v2/mobile/carts/update-quantity")
    Object updateQuantity(@InterfaceC37270a UpdateCartQuantityRequest updateCartQuantityRequest, InterfaceC30057d<? super CartResponse> interfaceC30057d);
}
