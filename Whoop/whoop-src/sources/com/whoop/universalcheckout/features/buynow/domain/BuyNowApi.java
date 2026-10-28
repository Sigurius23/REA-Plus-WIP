package com.whoop.universalcheckout.features.buynow.domain;

import com.whoop.universalcheckout.features.buynow.domain.models.BuyNowResponse;
import com.whoop.universalcheckout.features.checkout.domain.models.CheckoutSuccessResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowApi;", "", "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;", "request", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;", "buyNow", "(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;Lq83/d;)Ljava/lang/Object;", "", "path", "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/CheckoutSuccessResponse;", "placeOrder", "(Ljava/lang/String;Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowPlaceOrderRequest;Lq83/d;)Ljava/lang/Object;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface BuyNowApi {
    @InterfaceC37284o("commerce-service/v3/mobile/carts/buy-now")
    Object buyNow(@InterfaceC37270a BuyNowRequest buyNowRequest, InterfaceC30057d<? super BuyNowResponse> interfaceC30057d);

    @InterfaceC37284o
    Object placeOrder(@InterfaceC37294y String str, @InterfaceC37270a BuyNowPlaceOrderRequest buyNowPlaceOrderRequest, InterfaceC30057d<? super CheckoutSuccessResponse> interfaceC30057d);
}
