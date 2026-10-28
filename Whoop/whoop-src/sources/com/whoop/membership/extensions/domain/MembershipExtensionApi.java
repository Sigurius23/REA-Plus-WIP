package com.whoop.membership.extensions.domain;

import com.whoop.membership.extensions.domain.models.ExtensionsV2LandingResponse;
import com.whoop.membership.extensions.domain.models.NativeOrderResponse;
import com.whoop.membership.extensions.domain.models.OrderRequestBodyReactivations;
import com.whoop.membership.extensions.domain.models.OrderRequestBodyV2;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.membership.extensions.domain.models.ReactivationUpsellLandingResponse;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.json.JsonObject;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0006J$\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;", "", "", "promoCode", "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;", "getV2Selection", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;", "getReactivationUpsellSelection", "(Lq83/d;)Ljava/lang/Object;", QueryParams.URL, "Lkotlinx/serialization/json/JsonObject;", "body", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "placeDynamicCheckoutOrder", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;", "placeDynamicFreeOrder", "Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyV2;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "getDynamicOrder", "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyV2;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyReactivations;", "getDynamicOrderV2", "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/OrderRequestBodyReactivations;Lq83/d;)Ljava/lang/Object;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface MembershipExtensionApi {
    @InterfaceC37284o
    Object getDynamicOrder(@InterfaceC37294y String str, @InterfaceC37270a OrderRequestBodyV2 orderRequestBodyV2, InterfaceC30057d<? super NativeOrderResponse> interfaceC30057d);

    @InterfaceC37284o
    Object getDynamicOrderV2(@InterfaceC37294y String str, @InterfaceC37270a OrderRequestBodyReactivations orderRequestBodyReactivations, InterfaceC30057d<? super NativeOrderResponse> interfaceC30057d);

    @InterfaceC37275f("membership-service/v1/reactivations-content/upsell")
    Object getReactivationUpsellSelection(InterfaceC30057d<? super ReactivationUpsellLandingResponse> interfaceC30057d);

    @InterfaceC37275f("membership-service/v3/extensions/selection")
    Object getV2Selection(@InterfaceC37289t("promoCode") String str, InterfaceC30057d<? super ExtensionsV2LandingResponse> interfaceC30057d);

    @InterfaceC37284o
    Object placeDynamicCheckoutOrder(@InterfaceC37294y String str, @InterfaceC37270a JsonObject jsonObject, InterfaceC30057d<ProgressContent> interfaceC30057d);

    @InterfaceC37284o
    Object placeDynamicFreeOrder(@InterfaceC37294y String str, InterfaceC30057d<? super ProgressContent> interfaceC30057d);
}
