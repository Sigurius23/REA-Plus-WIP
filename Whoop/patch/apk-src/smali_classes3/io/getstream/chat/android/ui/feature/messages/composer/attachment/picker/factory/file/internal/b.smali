.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/connection/degredation/QualityLimitationReasons;

    invoke-static {v0}, Llive/hms/video/connection/degredation/QualityLimitationReasons;->a(Llive/hms/video/connection/degredation/QualityLimitationReasons;)Llive/hms/video/connection/degredation/QualityLimitationReason;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->b(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)Landroid/os/Handler;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lld0/r;

    invoke-static {v0}, Llf0/f2;->i(Lld0/r;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lld0/q;

    invoke-static {v0}, Llf0/o1;->b(Lld0/q;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Llf0/j0;

    invoke-static {v0}, Llf0/i0;->f(Llf0/j0;)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lle3/g;

    iget-object v0, v0, Lle3/g;->i:Lzd3/o;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lzd3/o;->cancel()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lle3/k;

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;->A(Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    const-string v1, ":memory:"

    invoke-virtual {v0, v1}, Lio/sentry/internal/debugmeta/c;->h(Ljava/lang/String;)Ltb/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lb9/b;

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v0, Lm/j;

    invoke-virtual {v0}, Lm/c0;->dismiss()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Ll1/w3;

    iget-object v0, v0, Ll1/w3;->d:Ld0/l;

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Ll1/e2;

    iget-object v0, v0, Ll1/e2;->z:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/time/AbstractLongTimeSource;

    invoke-static {v0}, Lkotlin/time/AbstractLongTimeSource;->a(Lkotlin/time/AbstractLongTimeSource;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->z(Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lkc2/f;

    invoke-static {v0}, Lkc2/f;->A(Lkc2/f;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lk1/a;

    invoke-static {v0}, La3/g;->h(La3/r;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/videocall/view/VideoCallFragment;

    invoke-static {v0}, Lcom/whoop/videocall/view/VideoCallFragment;->y(Lcom/whoop/videocall/view/VideoCallFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;->a(Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;)Lio/getstream/chat/android/client/errorhandler/ErrorHandler;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Liu2/a;

    invoke-static {v0}, Liu2/a;->a(Liu2/a;)Lec3/l;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->a(Lio/getstream/chat/android/ui/utils/ListenerDelegate;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->f(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->a(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->a(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->a(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;)Landroid/graphics/Paint;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionViewBubbleDrawer;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionViewBubbleDrawer;->a(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionViewBubbleDrawer;)Landroid/graphics/Paint;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->z(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$Factory;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;

    invoke-direct {v1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;)V

    return-object v1

    :pswitch_1a
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;->G(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemFragment;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->z(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->D(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter;

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
