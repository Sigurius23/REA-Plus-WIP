package com.whoop.universalcheckout.features.checkout.domain;

import com.whoop.universalcheckout.features.checkout.domain.models.ApplyPromoCodeRequest;
import com.whoop.universalcheckout.features.checkout.domain.models.ProcessCheckoutRequestBody;
import com.whoop.universalcheckout.features.checkout.domain.models.SwitchAnnualCheckboxRequest;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutResponse;
import io.getstream.chat.android.client.api.QueryParams;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/CheckoutApi;", "", "Lcom/whoop/universalcheckout/features/checkout/domain/models/ApplyPromoCodeRequest;", "applyPromoCodeBody", "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;", "applyPromoCode", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/ApplyPromoCodeRequest;Lq83/d;)Ljava/lang/Object;", "", "cartId", "codeId", "removePromoCodeById", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/SwitchAnnualCheckboxRequest;", "body", "toggleAnnualCheckbox", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/SwitchAnnualCheckboxRequest;Lq83/d;)Ljava/lang/Object;", QueryParams.URL, "Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;", "Lpg3/v0;", "Ll83/a0;", "processNoStripeCheckout", "(Ljava/lang/String;Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;Lq83/d;)Ljava/lang/Object;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CheckoutApi {
    @InterfaceC37284o("commerce-service/v2/mobile/carts/applyCodeToCart")
    Object applyPromoCode(@InterfaceC37270a ApplyPromoCodeRequest applyPromoCodeRequest, InterfaceC30057d<? super UniversalCheckoutResponse> interfaceC30057d);

    @InterfaceC37284o
    Object processNoStripeCheckout(@InterfaceC37294y String str, @InterfaceC37270a ProcessCheckoutRequestBody processCheckoutRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("commerce-service/v2/mobile/carts/{cartId}/codes/{codeId}")
    Object removePromoCodeById(@InterfaceC37288s("cartId") String str, @InterfaceC37288s("codeId") String str2, InterfaceC30057d<? super UniversalCheckoutResponse> interfaceC30057d);

    @InterfaceC37284o("commerce-service/v2/mobile/carts/switch-to-annual-billing")
    Object toggleAnnualCheckbox(@InterfaceC37270a SwitchAnnualCheckboxRequest switchAnnualCheckboxRequest, InterfaceC30057d<? super UniversalCheckoutResponse> interfaceC30057d);
}
