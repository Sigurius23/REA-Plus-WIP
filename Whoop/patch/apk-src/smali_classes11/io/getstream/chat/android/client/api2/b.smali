.class public final synthetic Lio/getstream/chat/android/client/api2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/api2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/b;->w:I

    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    packed-switch v0, :pswitch_data_0

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->q(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->X(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PollResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->Z(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PollResponse;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryReactionsResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->C(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryReactionsResponse;)Lio/getstream/chat/android/models/QueryReactionsResult;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p2, Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->y(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/requests/UpdateMemberPartialResponse;)Lio/getstream/chat/android/models/Member;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->T(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PollOptionResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->a0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PollOptionResponse;)Lio/getstream/chat/android/models/PollOption;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryBannedUsersResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->Q(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryBannedUsersResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/ThreadResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->P(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/ThreadResponse;)Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/FlagResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->g(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/FlagResponse;)Lio/getstream/chat/android/models/Flag;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/ReactionResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->v(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/ReactionResponse;)Lio/getstream/chat/android/models/Reaction;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryPollVotesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->S(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryPollVotesResponse;)Lio/getstream/chat/android/models/QueryPollVotesResult;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PollResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->K(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PollResponse;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->x(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->c0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryDraftMessagesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->j0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryDraftMessagesResponse;)Lio/getstream/chat/android/models/QueryDraftsResult;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->e0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryBlockedUsersResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->b(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryBlockedUsersResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->O(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/FlagResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->f0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/FlagResponse;)Lio/getstream/chat/android/models/Flag;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->o0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;)Lio/getstream/chat/android/models/Location;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->A(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->e(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;)Lio/getstream/chat/android/models/Vote;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/ReminderResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->j(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/ReminderResponse;)Lio/getstream/chat/android/models/MessageReminder;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryThreadsResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->n0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryThreadsResponse;)Lio/getstream/chat/android/models/QueryThreadsResult;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->I(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;)Lio/getstream/chat/android/models/QueryPollsResult;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/ReactionsResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->k(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/ReactionsResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/AppSettingsResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->g0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/AppSettingsResponse;)Lio/getstream/chat/android/models/AppSettings;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/ThreadInfoResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->W(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/ThreadInfoResponse;)Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/DraftMessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->u(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/DraftMessageResponse;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
