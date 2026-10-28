package com.whoop.settings.accountheader.api;

import com.whoop.settings.accountheader.model.MyAccountHeaderModel;
import com.whoop.settings.accountheader.model.SwitchBillingPlanModalModel;
import com.whoop.settings.accountheader.model.SwitchBillingPlanRequest;
import com.whoop.settings.accountheader.model.SwitchBillingPlanResponseModel;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;", "", "Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;", "fetchHeader", "(Lq83/d;)Ljava/lang/Object;", "", "plan", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;", "fetchSwitchBillingPlanModal", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;", "switchBillingPlanRequest", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;", "switchBillingPlan", "(Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;Lq83/d;)Ljava/lang/Object;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface NativeAccountHeaderApi {
    @InterfaceC37275f("membership-service/v1/membership/native-account-header")
    Object fetchHeader(InterfaceC30057d<? super MyAccountHeaderModel> interfaceC30057d);

    @InterfaceC37275f("membership-service/v1/upsell/switch-plan")
    Object fetchSwitchBillingPlanModal(@InterfaceC37289t("plan") String str, InterfaceC30057d<? super SwitchBillingPlanModalModel> interfaceC30057d);

    @InterfaceC37284o("membership-service/v1/billing/annual/switch")
    Object switchBillingPlan(@InterfaceC37270a SwitchBillingPlanRequest switchBillingPlanRequest, InterfaceC30057d<? super SwitchBillingPlanResponseModel> interfaceC30057d);
}
