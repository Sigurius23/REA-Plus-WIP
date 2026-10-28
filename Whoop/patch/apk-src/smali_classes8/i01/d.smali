.class public final synthetic Li01/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li01/d;->w:I

    iput-object p2, p0, Li01/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Li01/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Li01/d;->w:I

    iput-object p1, p0, Li01/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Li01/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Li01/d;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Li01/d;->x:Ljava/lang/Object;

    iget-object v3, p0, Li01/d;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lj01/d;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v2}, Lj01/b;->d(Lj01/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v3, Liw0/g0;

    check-cast v2, Lc93/a;

    invoke-static {v3, v2}, Liw0/x;->K(Liw0/g0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v3, Liw0/g0;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v2}, Liw0/x;->D(Liw0/g0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lio2/d0;

    invoke-static {v2, v3}, Lio2/e0;->a(Lkotlin/jvm/functions/Function1;Lio2/d0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lio2/b0;

    invoke-static {v2, v3}, Lio2/a0;->c(Lkotlin/jvm/functions/Function1;Lio2/b0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lio2/h;

    invoke-static {v2, v3}, Lio2/g;->d(Lkotlin/jvm/functions/Function1;Lio2/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;

    return-object v0

    :pswitch_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    return-object v0

    :pswitch_7
    check-cast v3, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    check-cast v2, Lc93/a;

    invoke-static {v3, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->j(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lc93/a;)V

    return-object v1

    :pswitch_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    return-object v0

    :pswitch_9
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    invoke-static {v3, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderKt$plus$1;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v3, v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->G0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Attachment;)Lo23/h;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v3, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    check-cast v2, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    invoke-static {v3, v2}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->a(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V

    return-object v1

    :pswitch_c
    check-cast v3, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->a(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Ljava/util/ArrayList;)V

    return-object v1

    :pswitch_d
    check-cast v3, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    check-cast v2, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    invoke-static {v3, v2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->s(Lio/getstream/chat/android/client/api2/MoshiChatApi;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;)Lo23/o;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v3, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    check-cast v2, Lio/getstream/chat/android/client/api2/model/requests/QueryUsersRequest;

    invoke-static {v3, v2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->o(Lio/getstream/chat/android/client/api2/MoshiChatApi;Lio/getstream/chat/android/client/api2/model/requests/QueryUsersRequest;)Lo23/o;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v3, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    check-cast v2, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    invoke-static {v3, v2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->H(Lio/getstream/chat/android/client/api2/MoshiChatApi;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/o;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v3, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    check-cast v2, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static {v3, v2}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->f(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v3, Ljava/lang/String;

    check-cast v2, Ljava/lang/String;

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v3, v2}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->MarkReadIdentifier(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v3, Lcom/whoop/education/FeatureEducationDebugFragment;

    check-cast v2, Lp1/c1;

    invoke-static {v3, v2}, Lcom/whoop/education/FeatureEducationDebugFragment;->A(Lcom/whoop/education/FeatureEducationDebugFragment;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v3, Landroidx/compose/ui/platform/ComposeView;

    check-cast v2, Landroid/view/View;

    invoke-static {v3, v2}, Lid2/n;->k(Landroidx/compose/ui/platform/ComposeView;Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v3, Lgd0/c;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v2}, Lid0/c;->f(Lgd0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v3, Ltr2/n;

    check-cast v2, Lib2/e$a;

    invoke-static {v3, v2}, Lib2/b;->c(Ltr2/n;Lib2/e$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lib2/e;

    invoke-static {v2, v3}, Lib2/b;->d(Lkotlin/jvm/functions/Function1;Lib2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lib2/e$a;

    invoke-static {v2, v3}, Lib2/b;->l(Lkotlin/jvm/functions/Function1;Lib2/e$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    check-cast v3, Lc93/m;

    check-cast v2, Lg22/a;

    invoke-static {v3, v2}, Li22/c;->i(Lc93/m;Lg22/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Li21/l$d;

    invoke-static {v2, v3}, Li21/n;->b(Lkotlin/jvm/functions/Function1;Li21/l$d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Li21/l$a;

    invoke-static {v2, v3}, Li21/c;->c(Lkotlin/jvm/functions/Function1;Li21/l$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lz30/b;

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :pswitch_1c
    check-cast v3, Li01/h;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v2}, Li01/f;->f(Li01/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

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
