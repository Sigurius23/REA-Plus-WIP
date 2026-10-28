package com.whoop.service.network;

import com.whoop.data.remote.domain.dto.growth.AffiliateDto;
import com.whoop.data.remote.domain.dto.growth.MembershipTierContent;
import com.whoop.data.remote.domain.dto.growth.PauseEligibility;
import com.whoop.data.remote.domain.dto.growth.ReferralContentDtoV2;
import com.whoop.data.remote.domain.dto.growth.SubscriptionPause;
import com.whoop.data.remote.domain.dto.growth.UserStrapsDto;
import com.whoop.data.remote.domain.request.CommunityOfferRequestBodyV2;
import com.whoop.data.remote.domain.request.RecordUserStrapRequestBody;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.service.network.model.RestoreBffModel;
import com.whoop.service.network.model.WhoopOffer;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0013\u001a\u00020\u00122\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u0004J\u001c\u0010\u001f\u001a\u00020\u001e2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\tH§@¢\u0006\u0004\b!\u0010\u0004J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\tH§@¢\u0006\u0004\b#\u0010\u0004¨\u0006$À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/MembershipV2Api;", "", "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;", "fetchUserStraps", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/model/RestoreBffModel;", "getRestoreInfo", "Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;", "strap", "Lpg3/v0;", "Ll83/a0;", "recordUserStrap", "(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;", "community", "Lcom/whoop/service/network/model/WhoopOffer;", "fetchWhoopCommunityReferralV2", "(Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;Lq83/d;)Ljava/lang/Object;", "", "source", "", ProfileApiKt.COMMUNITY_ID_PARAM, "Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;", "getReferralContentV2", "(Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;", "getSubscriptionPause", "Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;", "getSubscriptionPauseEligibility", ProfileApiKt.TARGET_USER_ID_PARAM, "Lcom/whoop/data/remote/domain/dto/growth/MembershipTierContent;", "getMembershipTierContent", "(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;", "getMembershipStatus", "Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;", "getAffiliate", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface MembershipV2Api {
    @InterfaceC37275f("straps")
    Object fetchUserStraps(InterfaceC30057d<? super UserStrapsDto> interfaceC30057d);

    @InterfaceC37284o("referrals")
    Object fetchWhoopCommunityReferralV2(@InterfaceC37270a CommunityOfferRequestBodyV2 communityOfferRequestBodyV2, InterfaceC30057d<? super WhoopOffer> interfaceC30057d);

    @InterfaceC37275f("affiliate")
    Object getAffiliate(InterfaceC30057d<? super C29218v0<AffiliateDto>> interfaceC30057d);

    @InterfaceC37275f("membership/status")
    Object getMembershipStatus(InterfaceC30057d<? super C29218v0<String>> interfaceC30057d);

    @InterfaceC37275f("memberships/tier-content")
    Object getMembershipTierContent(@InterfaceC37289t(ProfileApiKt.TARGET_USER_ID_PARAM) Integer num, InterfaceC30057d<? super MembershipTierContent> interfaceC30057d);

    @InterfaceC37275f("referral-content")
    Object getReferralContentV2(@InterfaceC37289t("source") String str, @InterfaceC37289t(ProfileApiKt.COMMUNITY_ID_PARAM) Integer num, InterfaceC30057d<? super ReferralContentDtoV2> interfaceC30057d);

    @InterfaceC37275f("restore/native-page")
    Object getRestoreInfo(InterfaceC30057d<? super RestoreBffModel> interfaceC30057d);

    @InterfaceC37275f("subscription/pause")
    Object getSubscriptionPause(InterfaceC30057d<? super SubscriptionPause> interfaceC30057d);

    @InterfaceC37275f("subscription/pause/eligibility")
    Object getSubscriptionPauseEligibility(InterfaceC30057d<? super PauseEligibility> interfaceC30057d);

    @InterfaceC37284o("straps")
    Object recordUserStrap(@InterfaceC37270a RecordUserStrapRequestBody recordUserStrapRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
