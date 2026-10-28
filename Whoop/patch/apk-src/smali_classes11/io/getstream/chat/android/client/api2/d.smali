.class public final synthetic Lio/getstream/chat/android/client/api2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/api2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lk03/a;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lk03/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Ljx2/f;->s(Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Ljs2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Ljp2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lj11/c;->c(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lj11/c;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lj11/c;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lj11/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lj11/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lio/getstream/chat/android/models/Message;

    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->l(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Landroid/widget/TextView;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/ChatUI;->b(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/util/Map;

    check-cast p2, Lio/getstream/chat/android/models/User;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->h(Ljava/util/Map;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->r(Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/util/List;

    invoke-static {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->i(Ljava/util/List;Z)Lio/getstream/chat/android/models/MessagesState;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->u(Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->k(Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/util/List;

    check-cast p2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->v(Ljava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->l(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/util/Map;

    check-cast p2, Lio/getstream/chat/android/models/User;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->g(Ljava/util/Map;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->e(Ljava/util/List;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/util/List;

    invoke-static {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->o(Ljava/util/List;Z)Lio/getstream/chat/android/models/MessagesState;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lio/getstream/chat/android/models/Message;

    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->b(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->q0(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;)Lio/getstream/chat/android/models/Attachment;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryDraftMessagesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->U(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryDraftMessagesResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->d(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/DevicesResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->a(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/DevicesResponse;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PollResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->E(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PollResponse;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/QueryRemindersResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->p(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/QueryRemindersResponse;)Lio/getstream/chat/android/models/QueryRemindersResult;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/MessageResponse;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->N(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/MessageResponse;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

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
