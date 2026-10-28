package com.whoop.membership.management.domain.api;

import com.whoop.membership.management.domain.models.ManageMembershipScreenResponse;
import com.whoop.membership.management.domain.models.MembershipAdjustmentCheckoutScreenBody;
import com.whoop.membership.management.domain.models.MembershipAdjustmentCheckoutScreenResponse;
import com.whoop.membership.management.domain.models.MembershipManagementScreenResponse;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\u0004J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "", "Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;", "fetchMembershipManagementScreen", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenBody;", "body", "Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;", "fetchMembershipAdjustmentCheckoutScreen", "(Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;", "fetchManageMembershipScreen", "", QueryParams.URL, "Lkotlinx/serialization/json/JsonObject;", "Lpg3/v0;", "Ll83/a0;", "placeDynamicCheckout", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface MembershipManagementApi {
    @InterfaceC37275f("membership-service/v1/membership-management")
    Object fetchManageMembershipScreen(InterfaceC30057d<? super ManageMembershipScreenResponse> interfaceC30057d);

    @InterfaceC37284o("membership-service/v1/membership-management/adjustments")
    Object fetchMembershipAdjustmentCheckoutScreen(@InterfaceC37270a MembershipAdjustmentCheckoutScreenBody membershipAdjustmentCheckoutScreenBody, InterfaceC30057d<? super MembershipAdjustmentCheckoutScreenResponse> interfaceC30057d);

    @InterfaceC37275f("membership-service/v1/membership-management/membership-and-billing")
    Object fetchMembershipManagementScreen(InterfaceC30057d<? super MembershipManagementScreenResponse> interfaceC30057d);

    @InterfaceC37284o
    Object placeDynamicCheckout(@InterfaceC37294y String str, @InterfaceC37270a JsonObject jsonObject, InterfaceC30057d<C29218v0<C23454a0>> interfaceC30057d);
}
