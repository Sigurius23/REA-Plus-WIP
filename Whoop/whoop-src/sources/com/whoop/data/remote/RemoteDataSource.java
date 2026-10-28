package com.whoop.data.remote;

import androidx.lifecycle.AbstractC1615p0;
import com.whoop.data.remote.domain.dto.gamification.MemberLevelDto;
import com.whoop.data.remote.domain.dto.growth.MembershipInfoDto;
import com.whoop.data.remote.domain.request.RecordUserStrapRequestBody;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.MemberStoryDto;
import com.whoop.service.network.model.ClaimInviteResponse;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import xg3.C38280g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00130\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u00130\u00122\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00130\u0012H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0014H¦@¢\u0006\u0004\b\u001f\u0010 J2\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\b2\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#H¦@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(H¦@¢\u0006\u0004\b*\u0010 J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020,0(2\u0006\u0010+\u001a\u00020\fH¦@¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H¦@¢\u0006\u0004\b0\u0010 J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020%0\b2\u0006\u00102\u001a\u000201H¦@¢\u0006\u0004\b3\u00104¨\u00065À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/remote/RemoteDataSource;", "", "", "inviteCode", "Lcom/whoop/domain/model/Invitation;", "validateInviteCode", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lxg3/g;", "Lpg3/v0;", "Lcom/whoop/service/network/model/ClaimInviteResponse;", "joinTeam", "(Ljava/lang/String;)Lxg3/g;", "", "userId", "leaderboardType", "startDate", "endDate", "period", "Landroidx/lifecycle/p0;", "Lcom/whoop/data/remote/commons/ApiResponse;", "", "Lcom/whoop/data/local/room/entity/TeamsDto;", "getTeamsWithRankLiveData", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "getTeamInviteLiveData", "(I)Landroidx/lifecycle/p0;", "Lcom/whoop/service/network/model/DefaultImages;", "getDefaultImagesLiveData", "()Landroidx/lifecycle/p0;", "Lcom/whoop/domain/model/teams/FeatureTeam;", "getFeatureTeams", "(Lq83/d;)Ljava/lang/Object;", "Lud3/v0;", "body", "", "headers", "Ll83/a0;", "uploadConsoleEventPackets", "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/MemberStoryDto;", "getMemberStories", "level", "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "getAllProgressLevels", "(ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;", "getMembershipInfo", "Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;", "strap", "recordUserStrap", "(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public interface RemoteDataSource {
    Object getAllProgressLevels(int i13, InterfaceC30057d<? super RecordsDto<MemberLevelDto>> interfaceC30057d);

    AbstractC1615p0 getDefaultImagesLiveData();

    Object getFeatureTeams(InterfaceC30057d<? super List<FeatureTeam>> interfaceC30057d);

    Object getMemberStories(InterfaceC30057d<? super RecordsDto<MemberStoryDto>> interfaceC30057d);

    Object getMembershipInfo(InterfaceC30057d<? super MembershipInfoDto> interfaceC30057d);

    AbstractC1615p0 getTeamInviteLiveData(int userId);

    AbstractC1615p0 getTeamsWithRankLiveData(int userId, String leaderboardType, String startDate, String endDate, String period);

    C38280g<C29218v0<ClaimInviteResponse>> joinTeam(String inviteCode);

    Object recordUserStrap(RecordUserStrapRequestBody recordUserStrapRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    Object uploadConsoleEventPackets(AbstractC34846v0 abstractC34846v0, Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    Object validateInviteCode(String str, InterfaceC30057d<? super Invitation> interfaceC30057d);
}
