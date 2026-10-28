package com.whoop.membership.familyPlan.domain.api;

import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.membership.familyPlan.domain.model.FamilyPlanScreenResponse;
import com.whoop.membership.familyPlan.domain.model.InviteFamilyMemberResponse;
import com.whoop.membership.familyPlan.domain.model.RemoveFamilyMemberDialogResponse;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000e\u001a\u00020\r2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0004J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;", "", "Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;", "fetchFamilyPlanScreen", "(Lq83/d;)Ljava/lang/Object;", "", "isNewMember", "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;", "familyPlanInvite", "(ZLq83/d;)Ljava/lang/Object;", "", "", "body", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "familyPlanInvitationMobile", "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "fetchRemoveMemberDialog", "familyPlanId", "familyMemberUserId", "Lpg3/v0;", "Ll83/a0;", "deleteFamilyMember", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface FamilyPlanApi {
    @InterfaceC37271b("membership-service/v1/family-plans/{familyPlanId}/member/{familyMemberUserId}")
    Object deleteFamilyMember(@InterfaceC37288s("familyPlanId") String str, @InterfaceC37288s("familyMemberUserId") String str2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("membership-service/v1/family-plan-invitations/mobile")
    Object familyPlanInvitationMobile(@InterfaceC37270a Map<String, String> map, InterfaceC30057d<? super ProgressContent> interfaceC30057d);

    @InterfaceC37275f("membership-service/v1/family-plans-native/invite")
    Object familyPlanInvite(@InterfaceC37289t("isNewMember") boolean z4, InterfaceC30057d<? super InviteFamilyMemberResponse> interfaceC30057d);

    @InterfaceC37275f("membership-service/v1/family-plans-native/hub")
    Object fetchFamilyPlanScreen(InterfaceC30057d<? super FamilyPlanScreenResponse> interfaceC30057d);

    @InterfaceC37275f("membership-service/v1/family-plans-native/delete")
    Object fetchRemoveMemberDialog(InterfaceC30057d<? super RemoveFamilyMemberDialogResponse> interfaceC30057d);
}
