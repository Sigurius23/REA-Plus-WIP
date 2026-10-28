.class public final synthetic Lhb2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lhb2/c;->w:I

    iput-object p1, p0, Lhb2/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lhb2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding;->a(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/querysort/QuerySorter;

    check-cast p1, Landroidx/lifecycle/w1;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->g(Lio/getstream/chat/android/models/querysort/QuerySorter;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->z(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;

    check-cast p1, Lio/getstream/chat/android/models/Option;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->z(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;Lio/getstream/chat/android/models/Option;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    check-cast p1, Landroidx/constraintlayout/widget/p;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->a(Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;Landroidx/constraintlayout/widget/p;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->A(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;Ljava/util/Map;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;

    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->o(Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;

    check-cast p1, La13/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->b(Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;La13/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->z(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->a(Ljava/util/Date;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->a(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/MessageReminder;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->a(Lio/getstream/chat/android/models/MessageReminder;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$$inlined$CoroutineExceptionHandler$1;

    check-cast p1, Lbc3/k1;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->a(Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$$inlined$CoroutineExceptionHandler$1;Lbc3/k1;)Lq83/j;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->D(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->b(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    check-cast p1, Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->R(Lio/getstream/chat/android/client/api2/MoshiChatApi;Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;)Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Class;

    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->l([Ljava/lang/Class;Lio/getstream/chat/android/client/events/ChatEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->b(Ljava/lang/Class;Lio/getstream/chat/android/client/events/ChatEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->i([Ljava/lang/String;Lio/getstream/chat/android/client/events/ChatEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lef0/c;

    check-cast p1, Lef0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;->F(Lef0/c;Lef0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;

    check-cast p1, Lff0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;->B(Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;Lff0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lfd0/b;

    check-cast p1, Lfd0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/multiconsentscreen/view/MultiConsentFragment;->y(Lfd0/b;Lfd0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Li20/j1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lb30/i5;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v2, v0, p1, v4, v3}, Lb30/i5;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Li20/v0;

    check-cast p1, Ljava/lang/String;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lh20/i0;

    const/16 v3, 0x9

    const/4 v4, 0x0

    invoke-direct {v2, v0, p1, v4, v3}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    move-object v1, p1

    check-cast v1, Leb/s0;

    const-string p1, "$this$NavHost"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li20/e;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2}, Li20/e;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    new-instance v8, Lx1/b;

    const/4 v10, 0x1

    const v2, 0x201ca560

    invoke-direct {v8, p1, v10, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/16 v9, 0xfe

    const-string v2, "InputAddress"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Le93/b;->t(Leb/s0;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx1/b;I)V

    new-instance p1, Leb/f;

    new-instance v2, Leb/m;

    invoke-direct {v2}, Leb/m;-><init>()V

    sget-object v3, Leb/g1;->o:Leb/a1;

    invoke-virtual {v2, v3}, Leb/m;->b(Leb/g1;)V

    iget-object v2, v2, Leb/m;->a:Leb/k;

    invoke-virtual {v2}, Leb/k;->a()Leb/l;

    move-result-object v2

    const-string v3, "country"

    invoke-direct {p1, v3, v2}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance p1, Li20/e;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v2}, Li20/e;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    new-instance v8, Lx1/b;

    const v0, 0x1de0bf49

    invoke-direct {v8, p1, v10, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/16 v9, 0xfc

    const-string v2, "Autocomplete?country={country}"

    invoke-static/range {v1 .. v9}, Le93/b;->t(Leb/s0;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx1/b;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    check-cast p1, Lrq0/f1;

    invoke-static {v0, p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->E(Lcom/whoop/ui/teams/TeamsShowInviteActivity;Lrq0/f1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lhf/h;

    check-cast p1, Ljava/util/Map$Entry;

    const-string v1, "<destruct>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    new-instance v2, Lgf/j;

    iget-object v3, v0, Lhf/h;->x:Lkotlin/jvm/internal/x;

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v0, v0, Lhf/h;->z:Lkotlin/jvm/internal/x;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Lgf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :pswitch_1a
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;

    check-cast p1, Lge1/b;

    invoke-static {v0, p1}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->B(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Lge1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;

    invoke-static {v0, p1}, Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;->n(Lcom/whoop/design/showcase/shared/view/DesignShowcaseView;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lhb2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;

    check-cast p1, Ly31/a;

    invoke-static {v0, p1}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->A(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;Ly31/a;)Ll83/a0;

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
