.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->w:I

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lfk1/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljb1/b;

    check-cast p1, Llb1/z0;

    invoke-static {v0, v1, p1}, Ljk1/b;->a(Lfk1/a;Ljb1/b;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lji0/c;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lji0/d;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lji0/c;->c(Lji0/c;Lji0/d;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lj81/i;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1}, Lj81/f;->b(Lj81/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lw20/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Le10/k;

    check-cast p1, Lw20/l;

    const-string v2, "recollectionData"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Le10/k;->x:Lv00/c0;

    iget-object v2, v2, Lv00/c0;->f0:Lh20/h1;

    iget-object v1, v1, Le10/k;->y:Ly00/c8;

    invoke-interface {v1}, Ly00/c8;->q0()Z

    move-result v1

    const-string v3, "appearance"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lw20/c0;->a:Lj/d;

    new-instance v3, Lw20/k;

    iget-object v4, p1, Lw20/l;->a:Ljava/lang/String;

    if-nez v4, :cond_0

    const-string v4, ""

    :cond_0
    iget-object p1, p1, Lw20/l;->b:Ly00/i;

    xor-int/lit8 v1, v1, 0x1

    invoke-direct {v3, v4, p1, v2, v1}, Lw20/k;-><init>(Ljava/lang/String;Ly00/i;Lh20/h1;Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, v3, p1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lj01/d;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lj01/b;->b(Lj01/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lb3/b3;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Liz0/g;->E(Lkotlin/jvm/functions/Function1;Lb3/b3;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio2/d0;

    check-cast p1, Lp31/j;

    invoke-static {v0, v1, p1}, Lio2/e0;->b(Lkotlin/jvm/functions/Function1;Lio2/d0;Lp31/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Option;

    check-cast p1, Landroidx/lifecycle/w1;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->g(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;

    check-cast p1, Ln23/h;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->o(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;Ln23/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/t0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/j;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t0;->c(Landroidx/lifecycle/p0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/v0;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;->b(Lio/getstream/chat/android/ui/utils/SingleLiveEvent;Landroidx/lifecycle/v0;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;->b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Landroid/view/View;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    check-cast p1, Landroidx/constraintlayout/widget/p;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->b(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Landroid/view/View;Landroidx/constraintlayout/widget/p;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Landroid/widget/TextView;

    check-cast p1, Landroidx/constraintlayout/widget/p;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/widget/TextView;Landroidx/constraintlayout/widget/p;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/o0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->K0(Landroidx/recyclerview/widget/o0;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->x(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->d(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;Ljava/util/List;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Member;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->d(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->e(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->c(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->b(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ljava/util/List;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->a(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->c(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;->e(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;->d(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;Ljava/util/List;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;->f(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;->a(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;->c(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->a(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->c(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

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
