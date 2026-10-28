package io.getstream.chat.android.client.api2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.api2.mapping.DomainMapping;
import io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto;
import io.getstream.chat.android.client.api2.model.requests.UpdateMemberPartialResponse;
import io.getstream.chat.android.client.api2.model.response.AppSettingsResponse;
import io.getstream.chat.android.client.api2.model.response.DraftMessageResponse;
import io.getstream.chat.android.client.api2.model.response.FlagResponse;
import io.getstream.chat.android.client.api2.model.response.MessageResponse;
import io.getstream.chat.android.client.api2.model.response.MessagesResponse;
import io.getstream.chat.android.client.api2.model.response.PollOptionResponse;
import io.getstream.chat.android.client.api2.model.response.PollResponse;
import io.getstream.chat.android.client.api2.model.response.PollVoteResponse;
import io.getstream.chat.android.client.api2.model.response.QueryBannedUsersResponse;
import io.getstream.chat.android.client.api2.model.response.QueryBlockedUsersResponse;
import io.getstream.chat.android.client.api2.model.response.QueryDraftMessagesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryPollVotesResponse;
import io.getstream.chat.android.client.api2.model.response.QueryPollsResponse;
import io.getstream.chat.android.client.api2.model.response.QueryReactionsResponse;
import io.getstream.chat.android.client.api2.model.response.QueryThreadsResponse;
import io.getstream.chat.android.client.api2.model.response.ReactionResponse;
import io.getstream.chat.android.client.api2.model.response.ReactionsResponse;
import io.getstream.chat.android.client.api2.model.response.ReminderResponse;
import io.getstream.chat.android.client.api2.model.response.ThreadInfoResponse;
import io.getstream.chat.android.client.api2.model.response.ThreadResponse;
import io.getstream.chat.android.client.api2.model.response.UpdateUsersResponse;

/* JADX INFO: renamed from: io.getstream.chat.android.client.api2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19052b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73742w;

    public /* synthetic */ C19052b(int i13) {
        this.f73742w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        DomainMapping domainMapping = (DomainMapping) obj;
        switch (this.f73742w) {
            case 0:
                return MoshiChatApi.createDraftMessage$lambda$8(domainMapping, (DraftMessageResponse) obj2);
            case 1:
                return MoshiChatApi.partialUpdateThread$lambda$105(domainMapping, (ThreadInfoResponse) obj2);
            case 2:
                return MoshiChatApi.appSettings$lambda$4(domainMapping, (AppSettingsResponse) obj2);
            case 3:
                return MoshiChatApi.m54608k(domainMapping, (ReactionsResponse) obj2);
            case 4:
                return MoshiChatApi.queryPolls$lambda$112(domainMapping, (QueryPollsResponse) obj2);
            case 5:
                return MoshiChatApi.queryThreads$lambda$100$lambda$99(domainMapping, (QueryThreadsResponse) obj2);
            case 6:
                return MoshiChatApi.createReminder$lambda$118(domainMapping, (ReminderResponse) obj2);
            case 7:
                return MoshiChatApi.castVote$lambda$106(domainMapping, (PollVoteResponse) obj2);
            case 8:
                return MoshiChatApi.getMessage$lambda$19(domainMapping, (MessageResponse) obj2);
            case 9:
                return MoshiChatApi.updateLiveLocation$lambda$123(domainMapping, (DownstreamLocationDto) obj2);
            case 10:
                return MoshiChatApi.unflag$lambda$33(domainMapping, (FlagResponse) obj2);
            case 11:
                return MoshiChatApi.m54576O(domainMapping, (MessagesResponse) obj2);
            case 12:
                return MoshiChatApi.m54590b(domainMapping, (QueryBlockedUsersResponse) obj2);
            case 13:
                return MoshiChatApi.m54597e0(domainMapping, (MessagesResponse) obj2);
            case 14:
                return MoshiChatApi.queryDrafts$lambda$12(domainMapping, (QueryDraftMessagesResponse) obj2);
            case 15:
                return MoshiChatApi.m54593c0(domainMapping, (UpdateUsersResponse) obj2);
            case 16:
                return MoshiChatApi.m54628x(domainMapping, (UpdateUsersResponse) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MoshiChatApi.partialUpdatePoll$lambda$108(domainMapping, (PollResponse) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return MoshiChatApi.queryPollVotes$lambda$111(domainMapping, (QueryPollVotesResponse) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MoshiChatApi.sendReaction$lambda$27(domainMapping, (ReactionResponse) obj2);
            case 20:
                return MoshiChatApi.flag$lambda$32(domainMapping, (FlagResponse) obj2);
            case 21:
                return MoshiChatApi.getThread$lambda$103$lambda$102(domainMapping, (ThreadResponse) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MoshiChatApi.m54578Q(domainMapping, (QueryBannedUsersResponse) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MoshiChatApi.updatePollOption$lambda$110(domainMapping, (PollOptionResponse) obj2);
            case 24:
                return MoshiChatApi.translate$lambda$72(domainMapping, (MessageResponse) obj2);
            case 25:
                return MoshiChatApi.partialUpdateMember$lambda$46(domainMapping, (UpdateMemberPartialResponse) obj2);
            case 26:
                return MoshiChatApi.queryReactions$lambda$25(domainMapping, (QueryReactionsResponse) obj2);
            case 27:
                return MoshiChatApi.getPoll$lambda$117(domainMapping, (PollResponse) obj2);
            case 28:
                return MoshiChatApi.sendAction$lambda$61(domainMapping, (MessageResponse) obj2);
            default:
                return MoshiChatApi.m54620q(domainMapping, (MessagesResponse) obj2);
        }
    }
}
