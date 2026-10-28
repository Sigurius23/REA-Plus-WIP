.class public final synthetic Li22/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Li22/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li22/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/TokenResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->b0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/TokenResponse;)Lio/getstream/chat/android/models/GuestUser;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->B(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;)Lio/getstream/chat/android/models/UnreadCounts;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PollOptionResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->i(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PollOptionResponse;)Lio/getstream/chat/android/models/PollOption;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryMembersResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->h0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryMembersResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/BlockUserResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->J(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/BlockUserResponse;)Lio/getstream/chat/android/models/UserBlock;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->l(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->m(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/PendingMessage;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->L(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;)Lio/getstream/chat/android/models/Vote;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->n(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->F(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/LiveLocationsResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->t(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/LiveLocationsResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/UsersResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->c(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/UsersResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MuteUserResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->D(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MuteUserResponse;)Lio/getstream/chat/android/models/Mute;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->m0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;)Lio/getstream/chat/android/models/Location;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/SearchMessagesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->G(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/SearchMessagesResponse;)Lio/getstream/chat/android/models/SearchMessagesResult;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->Y(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/ReminderResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->w(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/ReminderResponse;)Lio/getstream/chat/android/models/MessageReminder;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PollResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->d0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PollResponse;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lh91/b;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lim1/f;->e(Lh91/b;I)Lg51/c;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lih1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lih0/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lih0/a;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lig0/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lie1/a;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ly2/q0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v0, "intrinsicMeasurable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ly2/q0;->Q(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ly2/q0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v0, "intrinsicMeasurable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ly2/q0;->C(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ly2/q0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v0, "intrinsicMeasurable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ly2/q0;->O(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ly2/q0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v0, "intrinsicMeasurable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ly2/q0;->b(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Li22/c;->p(Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Li22/c;->d(Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

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
