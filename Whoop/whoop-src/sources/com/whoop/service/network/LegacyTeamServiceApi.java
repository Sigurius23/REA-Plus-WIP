package com.whoop.service.network;

import com.whoop.data.remote.domain.dto.InvitationDto;
import com.whoop.service.network.model.ClaimInviteDto;
import com.whoop.service.network.model.ClaimInviteResponse;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;
import xg3.C38280g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/LegacyTeamServiceApi;", "", "", "inviteCode", "accountType", "Lpg3/v0;", "Lcom/whoop/data/remote/domain/dto/InvitationDto;", "validateInviteCode", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/model/ClaimInviteDto;", "inviteDto", "Lxg3/g;", "Lcom/whoop/service/network/model/ClaimInviteResponse;", "claimInvite", "(Lcom/whoop/service/network/model/ClaimInviteDto;)Lxg3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface LegacyTeamServiceApi {
    @InterfaceC37284o("legacy-team-service/v0/invites/claim")
    C38280g<C29218v0<ClaimInviteResponse>> claimInvite(@InterfaceC37270a ClaimInviteDto inviteDto);

    @InterfaceC37275f("legacy-team-service/v0/invites/validate")
    Object validateInviteCode(@InterfaceC37289t("code") String str, @InterfaceC37289t("type") String str2, InterfaceC30057d<? super C29218v0<InvitationDto>> interfaceC30057d);
}
