package com.whoop.activation.domain.interactors.payments;

import com.whoop.activation.domain.models.steps.FinalizedUpcycleDetails;
import com.whoop.activation.domain.models.steps.OrderDetails;
import com.whoop.activation.domain.models.steps.PaymenthMethodRequest;
import com.whoop.activation.domain.models.steps.StripeTokenRequest;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0015\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;", "", "", "", "body", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "placeOrder", "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonObject;", "placeOrderV2", "(Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/steps/OrderDetails;", "getOrderDetails", "(Lq83/d;)Ljava/lang/Object;", "flow", "Lcom/whoop/activation/domain/models/steps/FinalizedUpcycleDetails;", "getUpcycleDetails", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/steps/StripeTokenRequest;", "Lpg3/v0;", "Ll83/a0;", "savePaymentMethod", "(Lcom/whoop/activation/domain/models/steps/StripeTokenRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/steps/PaymenthMethodRequest;", "(Lcom/whoop/activation/domain/models/steps/PaymenthMethodRequest;Lq83/d;)Ljava/lang/Object;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ActivationMembershipApi {
    @InterfaceC37275f("membership-service/v1/upcycle/onboarding/order-details")
    Object getOrderDetails(InterfaceC30057d<? super OrderDetails> interfaceC30057d);

    @InterfaceC37275f("membership-service/v2/upcycle/onboarding/finalizedContent")
    Object getUpcycleDetails(@InterfaceC37289t("flow") String str, InterfaceC30057d<? super FinalizedUpcycleDetails> interfaceC30057d);

    @InterfaceC37284o("membership-service/v1/extensions/native-checkout")
    Object placeOrder(@InterfaceC37270a Map<String, Object> map, InterfaceC30057d<ProgressContent> interfaceC30057d);

    @InterfaceC37284o("membership-service/v1/extensions/native-checkout")
    Object placeOrderV2(@InterfaceC37270a JsonObject jsonObject, InterfaceC30057d<? super ProgressContent> interfaceC30057d);

    @InterfaceC37285p("membership-service/v2/payment/default")
    Object savePaymentMethod(@InterfaceC37270a PaymenthMethodRequest paymenthMethodRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("membership-service/v1/payment/default")
    Object savePaymentMethod(@InterfaceC37270a StripeTokenRequest stripeTokenRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
