package com.whoop.membership.dunning.domain.api;

import com.whoop.membership.dunning.domain.models.CycleDataDunningBottomSheetModel;
import com.whoop.membership.dunning.domain.models.PaymentsOptionsDunningBottomSheetModel;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/membership/dunning/domain/api/DunningApi;", "", "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;", "fetchPaymentsOptionsDunningBottomSheet", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;", "fetchCycleDataDunningBottomSheet", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface DunningApi {
    @InterfaceC37275f("/membership-service/v1/dunning/cycle-data-bottom-sheet")
    Object fetchCycleDataDunningBottomSheet(InterfaceC30057d<? super CycleDataDunningBottomSheetModel> interfaceC30057d);

    @InterfaceC37275f("/membership-service/v1/dunning/payment-options-bottom-sheet")
    Object fetchPaymentsOptionsDunningBottomSheet(InterfaceC30057d<? super PaymentsOptionsDunningBottomSheetModel> interfaceC30057d);
}
