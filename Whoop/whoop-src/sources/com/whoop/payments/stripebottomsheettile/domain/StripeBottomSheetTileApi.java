package com.whoop.payments.stripebottomsheettile.domain;

import com.whoop.payments.stripebottomsheettile.domain.models.SetupIntentResponse;
import com.whoop.payments.stripebottomsheettile.domain.models.UpdateDefaultPaymentMethodRequest;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;", "", "Lcom/whoop/payments/stripebottomsheettile/domain/models/SetupIntentResponse;", "createSetupIntent", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/payments/stripebottomsheettile/domain/models/UpdateDefaultPaymentMethodRequest;", "body", "Lpg3/v0;", "Ll83/a0;", "updateDefaultPaymentMethod", "(Lcom/whoop/payments/stripebottomsheettile/domain/models/UpdateDefaultPaymentMethodRequest;Lq83/d;)Ljava/lang/Object;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StripeBottomSheetTileApi {
    @InterfaceC37284o("membership-service/v2/payment/setup")
    Object createSetupIntent(InterfaceC30057d<? super SetupIntentResponse> interfaceC30057d);

    @InterfaceC37285p("membership-service/v2/payment/default")
    Object updateDefaultPaymentMethod(@InterfaceC37270a UpdateDefaultPaymentMethodRequest updateDefaultPaymentMethodRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
