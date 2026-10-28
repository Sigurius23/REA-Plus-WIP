package com.whoop.community.data.network;

import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.teams.CommunityDto;
import com.whoop.domain.model.teams.MemberStoryDto;
import com.whoop.profile.domain.ProfileApiKt;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/community/data/network/CommunityServiceApi;", "", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/MemberStoryDto;", "getMemberStories", "(Lq83/d;)Ljava/lang/Object;", "", ProfileApiKt.COMMUNITY_ID_PARAM, "", "chatEnabled", "Lpg3/v0;", "Lcom/whoop/domain/model/teams/CommunityDto;", "updateTeamChatSettings", "(IZLq83/d;)Ljava/lang/Object;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CommunityServiceApi {
    @InterfaceC37275f("community-service/v1/featured-content?offset=0&limit=5")
    Object getMemberStories(InterfaceC30057d<? super RecordsDto<MemberStoryDto>> interfaceC30057d);

    @InterfaceC37285p("community-service/v1/communities/{communityId}/chat")
    Object updateTeamChatSettings(@InterfaceC37288s(ProfileApiKt.COMMUNITY_ID_PARAM) int i13, @InterfaceC37289t("chatEnabled") boolean z4, InterfaceC30057d<? super C29218v0<CommunityDto>> interfaceC30057d);
}
